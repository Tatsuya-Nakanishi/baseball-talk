package com.example.baseballtalk1.web.rest;

import com.example.baseballtalk1.persistence.entity.Team;
import com.example.baseballtalk1.service.TeamService;
import com.example.baseballtalk1.web.response.TeamResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/team/{teamId}")
public class TeamRestController {

    private final TeamService teamService;

    public TeamRestController(TeamService teamService){
        this.teamService = teamService;
    }

    @GetMapping
    public TeamResponse searchTeam(@PathVariable Integer teamId){
        Team team = teamService.searchTeam(teamId);

        TeamResponse teamResponse = new TeamResponse(team);
        return teamResponse;
    }
}
