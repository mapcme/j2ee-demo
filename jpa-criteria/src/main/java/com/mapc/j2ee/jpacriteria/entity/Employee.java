package com.mapc.j2ee.jpacriteria.entity;

import lombok.Data;

import javax.persistence.*;

/**
 * @desc: TODO
 * @author: duchao
 * @date: 2019/12/25 09:24
 */
@Entity
@Table(name = "employee")
@Data
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String role;
    @Column(name = "dept_id")
    private Long deptId;
}
