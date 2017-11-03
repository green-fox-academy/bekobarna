package com.greenfox.todo.service;

import java.time.LocalDate;
import org.springframework.stereotype.Service;


@Service
public class DateProvider {

    public LocalDate newdate(String dateInString) {
        LocalDate localDate = LocalDate.parse(dateInString);
        return localDate;
    }

}
