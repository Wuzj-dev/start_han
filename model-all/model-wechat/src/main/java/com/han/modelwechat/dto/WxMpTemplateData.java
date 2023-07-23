package com.han.modelwechat.dto;

import java.io.Serializable;

/**
 * @Author: Wuj
 * @Description: TODO
 * @DateTime: 2023/7/23 01:15
 **/
public class WxMpTemplateData implements Serializable {
    private static final long serialVersionUID = 6301835292940277870L;
    private String name;
    private String value;
    private String color;

    public WxMpTemplateData() {
    }

    public WxMpTemplateData(String name, String value) {
        this.name = name;
        this.value = value;
    }

    public WxMpTemplateData(String name, String value, String color) {
        this.name = name;
        this.value = value;
        this.color = color;
    }

    public String getName() {
        return this.name;
    }

    public String getValue() {
        return this.value;
    }

    public String getColor() {
        return this.color;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        } else if (!(o instanceof WxMpTemplateData)) {
            return false;
        } else {
            WxMpTemplateData other = (WxMpTemplateData)o;
            if (!other.canEqual(this)) {
                return false;
            } else {
                label47: {
                    Object this$name = this.getName();
                    Object other$name = other.getName();
                    if (this$name == null) {
                        if (other$name == null) {
                            break label47;
                        }
                    } else if (this$name.equals(other$name)) {
                        break label47;
                    }

                    return false;
                }

                Object this$value = this.getValue();
                Object other$value = other.getValue();
                if (this$value == null) {
                    if (other$value != null) {
                        return false;
                    }
                } else if (!this$value.equals(other$value)) {
                    return false;
                }

                Object this$color = this.getColor();
                Object other$color = other.getColor();
                if (this$color == null) {
                    if (other$color != null) {
                        return false;
                    }
                } else if (!this$color.equals(other$color)) {
                    return false;
                }

                return true;
            }
        }
    }

    protected boolean canEqual(Object other) {
        return other instanceof WxMpTemplateData;
    }

    public int hashCode() {

        int result = 1;
        Object $name = this.getName();
        result = result * 59 + ($name == null ? 43 : $name.hashCode());
        Object $value = this.getValue();
        result = result * 59 + ($value == null ? 43 : $value.hashCode());
        Object $color = this.getColor();
        result = result * 59 + ($color == null ? 43 : $color.hashCode());
        return result;
    }

    public String toString() {
        return "WxMpTemplateData(name=" + this.getName() + ", value=" + this.getValue() + ", color=" + this.getColor() + ")";
    }
}
