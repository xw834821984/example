package com.diabin.fastec.example.generators;

import com.nazi.latte.annotations.AppRegisterGenerator;
import com.nazi.latte.wechat.templates.AppRegisterTemplate;

/**
 * Created by nazi on
 * date： 2017/12/24
 */
@SuppressWarnings("unused")
@AppRegisterGenerator(
        packageName = "com.diabin.fastec.example",
        registerTemplate = AppRegisterTemplate.class
)
public interface AppRegister {
}
