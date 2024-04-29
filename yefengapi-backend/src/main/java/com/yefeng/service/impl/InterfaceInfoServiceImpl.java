package com.yefeng.service.impl;
import java.util.Date;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yefeng.common.ErrorCode;
import com.yefeng.exception.BusinessException;
import com.yefeng.mapper.InterfaceInfoMapper;
import com.yefeng.model.entity.InterfaceInfo;
import com.yefeng.service.InterfaceInfoService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

/**
* @author 29515
* @description 针对表【interface_info(接口信息)】的数据库操作Service实现
* @createDate 2024-04-29 19:47:30
*/
@Service
public class InterfaceInfoServiceImpl extends ServiceImpl<InterfaceInfoMapper, InterfaceInfo>
    implements InterfaceInfoService {
    
    @Override
    public void validInterfaceInfo(InterfaceInfo interfaceInfo, boolean addend) {
         String name = interfaceInfo.getName();
         String description = interfaceInfo.getDescription();

        if (interfaceInfo == null) {
            throw new BusinessException(ErrorCode.PARAMS_ERROR);
        }

        // 创建时，所有参数必须非空
        if (addend) {
            if (StringUtils.isAnyBlank(name, description)) {
                throw new BusinessException(ErrorCode.PARAMS_ERROR);
            }
        }
        if (StringUtils.isNotBlank(name) && name.length() > 50) {
            throw new BusinessException(ErrorCode.PARAMS_ERROR, "名字过长");
        }

    }
}




