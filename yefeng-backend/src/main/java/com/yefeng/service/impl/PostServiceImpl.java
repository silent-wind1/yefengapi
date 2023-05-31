package com.yefeng.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yefeng.mapper.PostMapper;
import com.yefeng.model.entity.Post;
import com.yefeng.service.PostService;
import org.springframework.stereotype.Service;


/**
 * @author yupili
 * @description 针对表【post(帖子)】的数据库操作Service实现
 */
@Service
public class PostServiceImpl extends ServiceImpl<PostMapper, Post> implements PostService {

    @Override
    public void validPost(Post post, boolean add) {

    }

}




