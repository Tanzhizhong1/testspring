package com.yc.springframework.steretype;

import java.lang.annotation.*;

/**
 * @program: testspring
 * @description:
 * @author: 啦啦啦
 * @create: 2021-04-05 14:20
 */
@Target({ElementType.METHOD, ElementType.ANNOTATION_TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Mybean {
    String value() default "";
}
