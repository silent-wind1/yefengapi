package com.yefeng.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.yefeng.model.entitybran.InterfaceInfo;

/**
* @author 29515
* @description 针对表【interface_info(接口信息)】的数据库操作Service
* @createDate 2024-04-29 19:47:30
*/
public interface InterfaceInfoService extends IService<InterfaceInfo> {

    void validInterfaceInfo(InterfaceInfo interfaceInfo, boolean addend);
}
