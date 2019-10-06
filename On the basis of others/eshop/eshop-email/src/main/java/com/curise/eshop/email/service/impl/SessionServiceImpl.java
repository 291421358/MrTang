package com.curise.eshop.email.service.impl;

import com.curise.eshop.email.entity.Session;
import com.curise.eshop.email.mapper.SessionMapper;
import com.curise.eshop.email.service.ISessionService;
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
public class SessionServiceImpl extends ServiceImpl<SessionMapper, Session> implements ISessionService {

}
