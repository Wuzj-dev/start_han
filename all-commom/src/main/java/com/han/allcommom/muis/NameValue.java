package com.han.allcommom.muis;

import com.han.allcommom.enums.EnumI;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;

/**
 * @Author: Wuj
 * @Description: TODO
 * @DateTime: 2023/7/30 20:52
 **/
@Data
@AllArgsConstructor
public class NameValue {

    public final String name;

    public final Object value;

    public static NameValue builder(String name, Object value) {
        return new NameValue(name, value);
    }

    public static NameValue builder(EnumI e) {
        return new NameValue(e.code(), e.desc());
    }

    public String toString() {
        return name + "|" + value + " ";
    }

}
