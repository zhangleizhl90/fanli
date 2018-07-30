package me.zhl.fanli.anotation;

import java.lang.annotation.*;

@Inherited
@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface LoginRequired {

}
