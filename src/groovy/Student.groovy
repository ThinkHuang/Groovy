package groovy

import groovy.lang.GroovyInterceptable


/**
 * Public interface GroovyInterceptable { 
       Public object invokeMethod(String methodName, Object args) 
       Public object getproperty(String propertyName) 
       Public object setProperty(String propertyName, Object newValue) 
       Public MetaClass getMetaClass() 
       Public void setMetaClass(MetaClass metaClass) 
    }
 *
 */

/*
 * 这里对GroovyInterceptable进行说明，
 * 在测试过程中，如果Student实现了GroovyInterceptable接口，那么不管是调用Student的
 * hello(),还是别的实体方法，都会转发到调用invokeMethod方法上面
 * 而如果不实现GroovyInterceptable接口，那么将直接按照调用实体方法。
 * 接下来说明调用methodMissing
 */
class Student implements GroovyInterceptable{
        protected dynamicProps=[:]
        
       void setProperty(String pName,val) {
          dynamicProps[pName] = val
       }
       
       def getProperty(String pName) {
          dynamicProps[pName]
       }
       
       def hello() {
           "invoke hello directly"
       }
       
       //演示方法缺失
//       def methodMissing(String name, def args){
//           println "missing method";
//       }
//       
       //演示方法反射调用
       def invokeMethod(String name, Object args)
       {
           return "called invokeMethod $name $args";
       }
    }
