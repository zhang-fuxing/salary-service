package com.zhangfx.salary.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zhangfx.salary.model.Test;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author 张福兴
 * @version 1.0
 * @date 2022/11/14
 * @email zhangfuxing1010@163.com
 */
@Mapper
public interface TestMapper extends BaseMapper<Test> {

    List<Test> getListById(Integer id);
}
