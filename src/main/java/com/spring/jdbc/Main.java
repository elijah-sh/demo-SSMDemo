package com.spring.jdbc;

import com.spring.jdbc.actor.Actor;
import com.spring.jdbc.actor.ActorJdbcTemplate;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by ShenShuaihu on 2018/8/15.
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("other/jdbc.xml");

        ActorJdbcTemplate actorJdbcTemplate = (ActorJdbcTemplate) context.getBean("actorJdbcTemplate");
        Actor actor = new Actor();
        actor.setFirstName("沈");
        actor.setLastName("帅虎");
     //  actorJdbcTemplate.insert(actor);
        actor.setId((long) 1);
      //  actorJdbcTemplate.update(actor);
     //  actorJdbcTemplate.delete(actor);
     // List<Actor> list = actorJdbcTemplate.findAll();
      //  System.out.println(list.toString());

      // int num =  actorJdbcTemplate.countOfActorsByFirstName("沈");
       int num =  actorJdbcTemplate.countOfActors(actor);

        System.out.println(num);

    }
}
