package com.janwes.annotations;

import java.lang.annotation.*;

/**
 * @author Janwes
 * @version 1.0
 * @package com.janwes.annotations
 * @date 2021/12/21 18:13
 * @description 作用在方法上的注解
 */
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface MethodInfo {

    String name() default "";

    String value() default "";

    String desc() default "";
}








