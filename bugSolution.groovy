```groovy
def methodWithClosure(closure) {
  println "Before closure execution"
  try {
    closure()
  } catch (RuntimeException e) {
    println "Exception caught: ${e.message}"
  }
  println "After closure execution"
}

methodWithClosure { 
  println "Inside closure"
  throw new RuntimeException("Something went wrong!")
}
println "This line will now be reached"
```