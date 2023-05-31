package com.yefeng.controller;

import com.yefeng.common.BaseResponse;
import com.yefeng.common.ErrorCode;
import com.yefeng.common.ResultUtils;
import com.yefeng.exception.BusinessException;
import com.yefeng.model.dto.post.PostAddRequest;
import com.yefeng.model.entity.Post;
import com.yefeng.service.PostService;
import com.yefeng.service.UserService;
import com.yefeng.yefengcommon.model.entity.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.web.bind.annotation.*;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;


/**
 * 帖子接口
 *
 * @author yupi
 */
@RestController
@RequestMapping("/post")
@Slf4j
public class PostController {

    @Resource
    private PostService postService;

    @Resource
    private UserService userService;

    //@PostMapping("/add")
    //public BaseResponse<Long> addPost(@RequestBody PostAddRequest postAddRequest, HttpServletRequest request) {
    //    if (postAddRequest == null) {
    //        throw new BusinessException(ErrorCode.PARAMS_ERROR);
    //    }
    //    Post post = new Post();
    //    BeanUtils.copyProperties(postAddRequest, post);
    //    postService.validPost(post, true);
    //    User loginUser = userService.getLoginUser(request);
    //    post.setUserId(loginUser.getId());
    //    boolean result = postService.save(post);
    //    if(!result) {
    //        throw  new BusinessException(ErrorCode.OPERATION_ERROR);
    //    }
    //    Long postId = post.getId();
    //    return ResultUtils.success(postId);
    //}

    @GetMapping("/get")
    public BaseResponse<List> getPost(){
        return new BaseResponse(503, "思凯不打卡，不能进不背单词群！你知道不？！");
    }
}
