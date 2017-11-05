package com.greenfox.todo.repository;

import com.greenfox.todo.model.Assignee;
import org.springframework.data.repository.CrudRepository;

public interface AssigneeRepository extends CrudRepository<Assignee, Long> {

}
