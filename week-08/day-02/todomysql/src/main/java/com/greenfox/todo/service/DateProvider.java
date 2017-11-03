package com.greenfox.todo.service;

import com.greenfox.todo.repository.ToDoRepository;
import java.time.LocalDate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class DateProvider {

    @Autowired
    ToDoRepository toDoRepository;

    public LocalDate newdate(String dateInString) {
        LocalDate localDate = LocalDate.parse(dateInString);
        return localDate;
    }

}
