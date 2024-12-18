```groovy
def methodWithClosure(closure) {
  println "Before closure execution"
  closure()
  println "After closure execution"
}

methodWithClosure { 
  println "Inside closure"
  throw new RuntimeException("Something went wrong!")
}
println "This line won't be reached" 
```