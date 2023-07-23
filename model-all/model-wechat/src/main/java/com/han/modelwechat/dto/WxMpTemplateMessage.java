package com.han.modelwechat.dto;

import com.google.gson.Gson;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Wuj
 * @Description: TODO
 * @DateTime: 2023/7/23 01:14
 **/
public class WxMpTemplateMessage implements Serializable {
    private static final long serialVersionUID = 5063374783759519418L;
    private String toUser;
    private String templateId;
    private String url;
    private MiniProgram miniProgram;
    private List<WxMpTemplateData> data;

    public WxMpTemplateMessage addData(WxMpTemplateData datum) {
        if (this.data == null) {
            this.data = new ArrayList();
        }

        this.data.add(datum);
        return this;
    }

    public String toJson() {
        return new Gson().toJson(this);
    }

    private static List<WxMpTemplateData> $default$data() {
        return new ArrayList();
    }

    public static WxMpTemplateMessageBuilder builder() {
        return new WxMpTemplateMessageBuilder();
    }

    public String getToUser() {
        return this.toUser;
    }

    public String getTemplateId() {
        return this.templateId;
    }

    public String getUrl() {
        return this.url;
    }

    public MiniProgram getMiniProgram() {
        return this.miniProgram;
    }

    public List<WxMpTemplateData> getData() {
        return this.data;
    }

    public void setToUser(String toUser) {
        this.toUser = toUser;
    }

    public void setTemplateId(String templateId) {
        this.templateId = templateId;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setMiniProgram(MiniProgram miniProgram) {
        this.miniProgram = miniProgram;
    }

    public void setData(List<WxMpTemplateData> data) {
        this.data = data;
    }

    public WxMpTemplateMessage() {
        this.data = $default$data();
    }

    public WxMpTemplateMessage(String toUser, String templateId, String url, MiniProgram miniProgram, List<WxMpTemplateData> data) {
        this.toUser = toUser;
        this.templateId = templateId;
        this.url = url;
        this.miniProgram = miniProgram;
        this.data = data;
    }

    public static class WxMpTemplateMessageBuilder {
        private String toUser;
        private String templateId;
        private String url;
        private MiniProgram miniProgram;
        private boolean data$set;
        private List<WxMpTemplateData> data$value;

        WxMpTemplateMessageBuilder() {
        }

        public WxMpTemplateMessageBuilder toUser(String toUser) {
            this.toUser = toUser;
            return this;
        }

        public WxMpTemplateMessageBuilder templateId(String templateId) {
            this.templateId = templateId;
            return this;
        }

        public WxMpTemplateMessageBuilder url(String url) {
            this.url = url;
            return this;
        }

        public WxMpTemplateMessageBuilder miniProgram(MiniProgram miniProgram) {
            this.miniProgram = miniProgram;
            return this;
        }

        public WxMpTemplateMessageBuilder data(List<WxMpTemplateData> data) {
            this.data$value = data;
            this.data$set = true;
            return this;
        }

        public WxMpTemplateMessage build() {
            List<WxMpTemplateData> data$value = this.data$value;
            if (!this.data$set) {
                data$value = WxMpTemplateMessage.$default$data();
            }

            return new WxMpTemplateMessage(this.toUser, this.templateId, this.url, this.miniProgram, data$value);
        }

        public String toString() {
            return "WxMpTemplateMessage.WxMpTemplateMessageBuilder(toUser=" + this.toUser + ", templateId=" + this.templateId + ", url=" + this.url + ", miniProgram=" + this.miniProgram + ", data$value=" + this.data$value + ")";
        }
    }

    public static class MiniProgram implements Serializable {
        private static final long serialVersionUID = -7945254706501974849L;
        private String appid;
        private String pagePath;
        private boolean usePath = false;

        public String getAppid() {
            return this.appid;
        }

        public String getPagePath() {
            return this.pagePath;
        }

        public boolean isUsePath() {
            return this.usePath;
        }

        public void setAppid(String appid) {
            this.appid = appid;
        }

        public void setPagePath(String pagePath) {
            this.pagePath = pagePath;
        }

        public void setUsePath(boolean usePath) {
            this.usePath = usePath;
        }

        public boolean equals(Object o) {
            if (o == this) {
                return true;
            } else if (!(o instanceof MiniProgram)) {
                return false;
            } else {
                MiniProgram other = (MiniProgram)o;
                if (!other.canEqual(this)) {
                    return false;
                } else if (this.isUsePath() != other.isUsePath()) {
                    return false;
                } else {
                    Object this$appid = this.getAppid();
                    Object other$appid = other.getAppid();
                    if (this$appid == null) {
                        if (other$appid != null) {
                            return false;
                        }
                    } else if (!this$appid.equals(other$appid)) {
                        return false;
                    }

                    Object this$pagePath = this.getPagePath();
                    Object other$pagePath = other.getPagePath();
                    if (this$pagePath == null) {
                        if (other$pagePath != null) {
                            return false;
                        }
                    } else if (!this$pagePath.equals(other$pagePath)) {
                        return false;
                    }

                    return true;
                }
            }
        }

        protected boolean canEqual(Object other) {
            return other instanceof MiniProgram;
        }

        public int hashCode() {
            int result = 1;
            result = result * 59 + (this.isUsePath() ? 79 : 97);
            Object $appid = this.getAppid();
            result = result * 59 + ($appid == null ? 43 : $appid.hashCode());
            Object $pagePath = this.getPagePath();
            result = result * 59 + ($pagePath == null ? 43 : $pagePath.hashCode());
            return result;
        }

        public String toString() {
            return "WxMpTemplateMessage.MiniProgram(appid=" + this.getAppid() + ", pagePath=" + this.getPagePath() + ", usePath=" + this.isUsePath() + ")";
        }

        public MiniProgram() {
        }

        public MiniProgram(String appid, String pagePath, boolean usePath) {
            this.appid = appid;
            this.pagePath = pagePath;
            this.usePath = usePath;
        }
    }
}
