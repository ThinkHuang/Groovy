import groovy.json.JsonSlurper
import groovy.json.JsonOutput

def jsonSlurper = new JsonSlurper();
def obj = jsonSlurper.parseText('{"name":"john","id":"1"}');
println obj.name;
println obj.id;

Object lst = jsonSlurper.parseText('{ "List": [2, 3, 4, 5] }')
lst.each { println it }

//def output = JsonOutput.toJson([name: 'John', ID: 1]);
//println(output);


class Student {
    String name
    int ID;
 }
 
 def output = JsonOutput.toJson([new Student(name: 'John',ID:1),
     new Student(name: 'Mark',ID:2)])
  println(output);