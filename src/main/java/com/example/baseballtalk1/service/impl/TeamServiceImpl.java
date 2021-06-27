package com.example.baseballtalk1.service.impl;

import com.example.baseballtalk1.persistence.entity.Team;
import com.example.baseballtalk1.persistence.mapper.TeamMapper;
import com.example.baseballtalk1.service.TeamService;
import org.springframework.stereotype.Service;

@Service
public class TeamServiceImpl implements TeamService {
    private final TeamMapper teamMapper;

    public TeamServiceImpl(TeamMapper teamMapper){
        this.teamMapper = teamMapper;
    }

    @Override
    public Team searchTeam(Integer teamId) {
        return teamMapper.searchTeam(teamId);
    }
}
