package com.deadpool.emergencydepartment.domain.entity;


import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;

import java.util.Date;

@Getter
@Setter
public class Base {


    @CreatedDate
    private Date date;

    // id? how to call the id column in inheritated classes?

}
