package com.mapc.j2ee.jpacriteria.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

/**
 * @desc: TODO
 * @author: duchao
 * @date: 2019/12/25 09:23
 */
@Entity
@Table(name = "dept")
@Data
public class Dept {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    @Transient
    private List<Employee> employeeList;
}
