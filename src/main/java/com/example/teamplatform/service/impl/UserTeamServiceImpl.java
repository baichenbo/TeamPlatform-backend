package com.example.teamplatform.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.teamplatform.service.UserTeamService;
import com.example.teamplatform.model.domain.UserTeam;
import com.example.teamplatform.mapper.UserTeamMapper;
import org.springframework.stereotype.Service;

/**
 * 用户队伍服务实现类
 */
@Service
public class UserTeamServiceImpl extends ServiceImpl<UserTeamMapper, UserTeam>
        implements UserTeamService {

}




