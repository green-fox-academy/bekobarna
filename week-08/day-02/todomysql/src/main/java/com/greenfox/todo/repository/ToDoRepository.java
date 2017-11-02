package com.greenfox.todo.repository;

import com.greenfox.todo.model.ToDo;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface ToDoRepository extends CrudRepository<ToDo, Integer>{

   /* @Query()
    //findAllByIsUrgent  list by urgent
    List<ToDo> findAllByUrgentIs(Boolean urgent);
*/
}
