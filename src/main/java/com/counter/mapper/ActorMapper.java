package com.counter.mapper;

import com.mybatis.dto.Actor;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by ShenShuaihu on 2018/8/17.
 */
@Repository
public interface ActorMapper {
    List<Actor> findAllActors();

    List<Actor> findActorWithNameLike(Actor actor);

    List<Actor> queryTrimActor(Actor actor);

    List<Actor> updateTrimActor(Actor actor);

    //foreach
    List<Actor> queryforeachActor(List list);

    // bind 数据绑定
    List<Actor>  selectActorsLike(Actor actor);
}
