package com.example.baseballtalk1.persistence.mapper;

import com.example.baseballtalk1.persistence.entity.Comment;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface CommentMapper {
    @Select("SELECT id, name, message, team_id, like_point, user_id" +
            " FROM comment " +
            " WHERE team_id= #{team_id}")
    List<Comment> findByTeamId(Integer teamId);

    @Select("SELECT id, name, message, team_id, like_point, user_id" +
            " FROM comment " +
            " WHERE id= #{id}")
    Comment findById(Integer id);

    @Insert("INSERT INTO comment(name, message, team_id, like_point, user_id)" +
            " VALUES(#{name}, #{message}, #{teamId}, #{likePoint}, #{userId})")
    @Options(useGeneratedKeys = true, keyColumn = "id", keyProperty = "id")
    void commentInsert(Comment comment);

    @Update("UPDATE comment" +
            " SET name = #{name}, message = #{message}, team_id = #{teamId}, like_point = #{likePoint}, user_id = #{userId}" +
            " WHERE id = #{id}")
    void updateLikePoint(Comment comment);

    @Delete("DELETE FROM comment WHERE id = #{id}")
    void deleteComment(Integer id);



}
