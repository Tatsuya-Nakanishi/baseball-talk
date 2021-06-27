package com.example.baseballtalk1.persistence.entity;

public class Team {
    private Integer teamId;
    private String teamName;
    private String teamImage;

    public Team(){}

    public Team(Integer teamId, String teamName, String teamImage) {
        this.teamId = teamId;
        this.teamName = teamName;
        this.teamImage = teamImage;
    }

    public Integer getTeamId() {
        return teamId;
    }

    public void setTeamId(Integer teamId) {
        this.teamId = teamId;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public String getTeamImage() {
        return teamImage;
    }

    public void setTeamImage(String teamImage) {
        this.teamImage = teamImage;
    }
}
