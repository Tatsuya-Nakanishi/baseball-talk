package com.example.baseballtalk1.persistence.mapper;

import com.example.baseballtalk1.persistence.entity.Comment;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface CommentMapper {
    @Select("SELECT id, name, message, team_id, like_point, user_id" +
            " FROM comment " +
            " WHERE team_id= #{team_id}")
    List<Comment> findByTeamId(Integer teamId);

    @Insert("INSERT INTO comment(name, message, team_id, like_point, user_id)" +
            " VALUES(#{name}, #{message}, #{teamId}, #{likePoint}, #{userId})")
    @Options(useGeneratedKeys = true, keyColumn = "id", keyProperty = "id")
    void commentInsert(Comment comment);



}
