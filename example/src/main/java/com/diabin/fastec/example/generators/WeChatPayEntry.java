package com.diabin.fastec.example.generators;

import com.nazi.latte.annotations.PayEntryGenerator;
import com.nazi.latte.wechat.templates.WXPayEntryTemplate;
/**
 * Created by nazi on
 * date： 2017/12/24
 */
@SuppressWarnings("unused")
@PayEntryGenerator(
        packageName = "com.diabin.fastec.example",
        payEntryTemplate = WXPayEntryTemplate.class
)
public interface WeChatPayEntry {
}
