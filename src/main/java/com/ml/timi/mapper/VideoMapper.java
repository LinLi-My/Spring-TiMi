package com.ml.timi.mapper;

import com.ml.timi.entity.Video;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface VideoMapper {
    /**
     * 根据 videoId 去视频表video 查询数据
     * @param videoId
     * @return
     */

    //@Param 当传入参数只有一个是可以省略，若有多个参数，必须用@Param去一个别名
    Video selectById(@Param("video_id") int videoId);

    /**
     * 通过注解读取(如果sql简单，没有过多的表关联，则用注解相对简单)
     * @return
     */
    @Select("select * from video")
    List<Video> selectList();
}
