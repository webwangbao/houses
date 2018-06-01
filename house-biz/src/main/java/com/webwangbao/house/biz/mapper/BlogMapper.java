package com.webwangbao.house.biz.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.webwangbao.house.common.model.Blog;
import com.webwangbao.house.common.page.PageParams;

@Mapper
public interface BlogMapper {

   List<Blog> selectBlog(@Param("blog")Blog query, @Param("pageParams")PageParams params);

   Long selectBlogCount(Blog query);

}
