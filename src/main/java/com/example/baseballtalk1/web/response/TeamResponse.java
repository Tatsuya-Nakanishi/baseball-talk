package com.example.baseballtalk1.web.response;

import com.example.baseballtalk1.persistence.entity.Team;

public class TeamResponse {
    private Integer teamId;
    private String teamName;
    private String teamImage;

    public TeamResponse(Team team) {
        this.teamId = team.getTeamId();
        this.teamName = team.getTeamName();
        this.teamImage = team.getTeamImage();
    }

    public Integer getTeamId() {
        return teamId;
    }

    public String getTeamName() {
        return teamName;
    }

    public String getTeamImage() {
        return teamImage;
    }
}
