package com.curise.eshop.email.service.impl;

import com.curise.eshop.email.entity.Version;
import com.curise.eshop.email.mapper.VersionMapper;
import com.curise.eshop.email.service.IVersionService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * VIEW 服务实现类
 * </p>
 *
 * @author TZHH
 * @since 2019-10-06
 */
@Service
public class VersionServiceImpl extends ServiceImpl<VersionMapper, Version> implements IVersionService {

}
