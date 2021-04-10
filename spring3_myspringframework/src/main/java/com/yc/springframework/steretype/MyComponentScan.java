package com.yc.springframework.steretype;

import java.lang.annotation.*;

/**
 * @program: testspring
 * @description:
 * @author: 啦啦啦
 * @create: 2021-04-05 14:21
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE})
@Documented
public @interface MyComponentScan {
    String[] basePackages() default {};
}
