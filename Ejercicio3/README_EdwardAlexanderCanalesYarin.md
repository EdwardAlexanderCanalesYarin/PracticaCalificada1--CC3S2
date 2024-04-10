# Ejercicio 3: Cucumber y expresiones regulares

## Stepdefs.java
Regular expression matcher for positive integers
Should match the string: test_posint followed by an sequence of 
digits of arbitrary length 
la Regular expression es ^test_posint [a-zA-Z0-9]+:$

``` java
@When("^test_posint [a-zA-Z0-9]+:$")
    public void test_posint(int number) throws Throwable {
        System.out.println("test_posint true for: " + number);
}
```
Regular expression matcher for floats
Should match the string: test_float followed by an optional
minus sign followed by a sequence of 
digits of arbitrary length followed by a period followed by
a second sequence of digits of arbitrary length.
la Regular expression es ^test_float (-?\\d+)\\.(\\d+)$

``` java
@When("^test_float (-?\\d+)\\.(\\d+)$")
    public void test_float(float arg1) throws Throwable {
        System.out.println("test_int true for: " + arg1);
}
``` 
