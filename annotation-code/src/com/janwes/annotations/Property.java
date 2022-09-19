package com.janwes.annotations;

import java.lang.annotation.*;

/**
 * @author Janwes
 * @version 1.0
 * @package com.janwes.annotations
 * @date 2021/12/21 18:10
 * @description 作用在属性值/域上的注解
 */
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Property {

    String name() default "";

    String value() default "";

    String desc() default "";
}
