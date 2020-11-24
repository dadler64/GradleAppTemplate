package com.adlerd.gui;

import com.adlerd.util.LocaleManager;
import com.adlerd.util.StringGetter;
import com.adlerd.util.StringUtil;
import java.util.Locale;

class Strings {

    private static final LocaleManager source = new LocaleManager("test", "gui");

    public static String get(String key) {
        return source.get(key);
    }

    public static String get(String key, String arg) {
        return StringUtil.format(source.get(key), arg);
    }

    public static StringGetter getter(String key) {
        return source.getter(key);
    }

    public static Locale[] getLocaleOptions() {
        return source.getLocaleOptions();
    }
}