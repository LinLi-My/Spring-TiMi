/**
 * Description:
 * Copyright (C), 2021 2021/6/12 23:46
 * Author:        Lin
 * History:       <author>          <time>          <version>          <desc>
 */


package com.ml.timi.entity;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Video {
    /**
     * 主键
     */
    public int id;

    /**
     * 视频标题
     */
    public String title;

    /**
     * 视频详情
     */
    public String summary;

    /**
     * 视频详情
     */
    public String coverImg;

    /**
     * 价格
     */
    public String price;

    /**
     * 视频分类
     */
    public String c_id;


    /**
     * 创建时间
     */
    public LocalDateTime createTime;
}
