package com.mapc.j2ee.springapplicationlistener.entity;

import lombok.Data;
import lombok.ToString;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @desc: TODO
 * @author: duchao
 * @date: 2019/12/31 09:15
 */
@Data
@ToString
@Accessors(chain = true)
public class User implements Serializable{
    private String name;
    private String pwd;
}
