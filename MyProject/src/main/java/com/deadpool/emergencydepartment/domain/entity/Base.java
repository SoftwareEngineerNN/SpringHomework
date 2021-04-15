package com.deadpool.emergencydepartment.domain.entity;


import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public class Base {

    @CreatedDate
    protected Date date;

    // id? how to call the id column in inheritated classes?

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected long id;

}
