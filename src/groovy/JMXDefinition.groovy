import java.lang.management.*
/**
 * 监视JVM的运行
 */

/**
 * 操作系统相关信息
 */
def OS = ManagementFactory.operatingSystemMXBean;
println """OPERATING SYSTEM:
            OS architecture = {$OS.arch}
            OS name = {$OS.name}
            OS version = {$OS.version}
            OS processors = {$OS.availableProcessors}"""

/**
 * 运行时信息
 */
def rt = ManagementFactory.runtimeMXBean;
println """RUNTIME:
        Runtime name = {$rt.name}
        Runtime spec name = {$rt.specName}
        Runtime vendor = {$rt.specVendor}
        Runtime spec version = {$rt.specVersion}
        Runtime management spec version = {$rt.managementSpecVersion}
        """

/**
 * 内存情况
 */
def mem = ManagementFactory.memoryMXBean;
def heapUsage = mem.heapMemoryUsage;
def nonHeapUsage = mem.nonHeapMemoryUsage;

println """MEMORY:
        HEAP STORAGE:
        Memory committed = {$heapUsage.committed}
        Memory init = {$heapUsage.init}
        Memory max = {$heapUsage.max}
        Memory used = {$heapUsage.used} 
        NON-HEAP STORAGE:
        Non-heap Memory committed = {$nonHeapUsage.committed}
        Non-heap Memory init = {$nonHeapUsage.init}
        Non-heap Memory max = {$nonHeapUsage.max}
        Non-heap Memory used = {$nonHeapUsage.used}
        """

/**
 * 垃圾回收情况
 */
println "GARBAGE COLLECTION:"
ManagementFactory.garbageCollectorMXBeans.each({ gc ->
    println "name = $gc.name"
    println "collection count = $gc.collectionCount"
    println "collection time = $gc.collectionTime"
    String[] mpoolNames = gc.memoryPoolNames;
    mpoolNames.each({
        mpoolname -> println "memory pool name:{$mpoolname}"
    })
})