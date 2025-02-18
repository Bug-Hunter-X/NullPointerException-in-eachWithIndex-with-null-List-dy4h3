```groovy
class MyClass {
    def myMethod(List<String> list) {
        list.eachWithIndex { item, index ->
            println "Item $index: $item"
        }
    }
}

MyClass myObj = new MyClass()
myObj.myMethod(null)
```