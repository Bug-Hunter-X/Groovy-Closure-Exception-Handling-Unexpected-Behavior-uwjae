# Groovy Closure Exception Handling Unexpected Behavior

This repository demonstrates an unexpected behavior in Groovy related to exception handling within closures.  When an exception is thrown inside a closure, the code following the closure's execution within the calling method is not executed, even though there is no explicit try-catch block around the closure call.

## Bug Description
The provided Groovy code shows a `methodWithClosure` that takes a closure as an argument and executes it. Inside the closure, a `RuntimeException` is thrown. However, the `println` statement after the closure call is never reached.  This is counter-intuitive, as one might expect the code flow to continue after the exception in a similar manner to using a try-catch block.

## How to Reproduce
1. Save the code in `bug.groovy`.
2. Run the script using Groovy: `groovy bug.groovy`
3. Observe that the last `println` statement is not printed to the console.

## Solution
The solution involves wrapping the closure execution in a try-catch block to handle the potential exception. This ensures that the code flow continues as expected even if an exception occurs within the closure.