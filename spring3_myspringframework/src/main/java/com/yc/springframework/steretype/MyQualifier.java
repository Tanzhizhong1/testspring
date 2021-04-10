package com.yc.springframework.steretype;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.ANNOTATION_TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * @program: testspring
 * @description:
 * @author: 啦啦啦
 * @create: 2021-04-05 14:26
 */
@Target(ANNOTATION_TYPE)
@Retention(RUNTIME)
@Documented
public @interface MyQualifier {
}
