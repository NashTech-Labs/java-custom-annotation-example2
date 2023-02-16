package com.knoldus.annotation;


import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnnotation{

    int empId() default 0;

    String empName() default "Deepak";

    String empDept() default "Delhi";

    int empSalary() default 50000;

}
