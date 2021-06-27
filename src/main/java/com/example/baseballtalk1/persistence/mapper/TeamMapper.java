package com.example.baseballtalk1.persistence.mapper;

import com.example.baseballtalk1.persistence.entity.Team;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface TeamMapper {
    @Select("SELECT team_id, team_name, team_image" +
            " FROM team" +
            " WHERE team_id= #{teamId}")
    Team searchTeam(Integer teamId);
}
