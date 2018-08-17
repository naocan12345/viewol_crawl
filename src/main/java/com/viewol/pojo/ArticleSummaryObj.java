package com.viewol.pojo;

import java.io.Serializable;

/**
 * 一条多图文或单图文消息，通俗说就是一天的群发消息都在这个对象中
 *
 */
public class ArticleSummaryObj implements Serializable{

    private static final long serialVersionUID = 2555742115275768017L;

    /**
     * 图文消息的扩展信息
     */
    private AppMsgExtInfoObj app_msg_ext_info;

    /**
     * 图文消息的基本信息
     */
    private CommMsgInfoObj comm_msg_info;

    public AppMsgExtInfoObj getApp_msg_ext_info() {
        return app_msg_ext_info;
    }

    public void setApp_msg_ext_info(AppMsgExtInfoObj app_msg_ext_info) {
        this.app_msg_ext_info = app_msg_ext_info;
    }

    public CommMsgInfoObj getComm_msg_info() {
        return comm_msg_info;
    }

    public void setComm_msg_info(CommMsgInfoObj comm_msg_info) {
        this.comm_msg_info = comm_msg_info;
    }
}
