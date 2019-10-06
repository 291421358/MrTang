package com.curise.eshop.email.service.impl;

import com.curise.eshop.email.entity.Config;
import com.curise.eshop.email.mapper.ConfigMapper;
import com.curise.eshop.email.service.IConfigService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 'sys.statements_with_temp_tables' is not BASE TABLE 服务实现类
 * </p>
 *
 * @author TZHH
 * @since 2019-10-06
 */
@Service
public class ConfigServiceImpl extends ServiceImpl<ConfigMapper, Config> implements IConfigService {

}
