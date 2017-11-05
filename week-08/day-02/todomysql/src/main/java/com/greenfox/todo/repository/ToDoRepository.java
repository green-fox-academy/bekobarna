package com.greenfox.todo.repository;

import com.greenfox.todo.model.ToDo;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface ToDoRepository extends CrudRepository<ToDo, Integer>{


    @Query(value = "SELECT * FROM Todo WHERE urgent = TRUE ", nativeQuery = true)
    List<ToDo> findurgent();


    @Query(value = "SELECT * FROM Todo WHERE done = TRUE ", nativeQuery = true)
    List<ToDo> finddone();

   /* @Query()
    List<ToDo> findAllByUrgentIs(Boolean urgent);
*/
}
