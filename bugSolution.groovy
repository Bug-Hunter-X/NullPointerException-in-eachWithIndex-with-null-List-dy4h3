```groovy
class MyClass {
    def myMethod(List<String> list) {
        if (list != null) {
            list.eachWithIndex { item, index ->
                println "Item $index: $item"
            }
        } else {
            println "List is null"
        }
    }
}

MyClass myObj = new MyClass()
myObj.myMethod(null)
```