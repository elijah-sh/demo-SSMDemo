package com.mybatis.mapper;

import com.mybatis.dto.Actor;
import org.apache.ibatis.annotations.Mapper;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by ShenShuaihu on 2018/8/17.
 */
@Mapper
@Resource
public interface ActorMapper {
    List<Actor> findAllActors();

    List<Actor> findActorWithNameLike(Actor actor);
}
