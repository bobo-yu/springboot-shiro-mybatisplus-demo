package com.lby.service.impl;

import com.lby.entity.Blog;
import com.lby.mapper.BlogMapper;
import com.lby.service.BlogService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author liangby3
 * @since 2021-07-16
 */
@Service
public class BlogServiceImpl extends ServiceImpl<BlogMapper, Blog> implements BlogService {

}
