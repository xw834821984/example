package com.diabin.fastec.example.generators;

import com.nazi.latte.annotations.EntryGenerator;
import com.nazi.latte.wechat.templates.WXEntryTemplate;

/**
 * Created by nazi on
 * date： 2017/12/24
 */
@SuppressWarnings("unused")
@EntryGenerator(
        packageName = "com.diabin.fastec.example",
        entryTemplate = WXEntryTemplate.class
)
public interface WeChatEntry {
}
