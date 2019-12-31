package com.mapc.j2ee.jpacriteria.service;

import com.mapc.j2ee.jpacriteria.dto.DeptDTO;
import com.mapc.j2ee.jpacriteria.entity.Dept;
import com.mapc.j2ee.jpacriteria.entity.Employee;
import lombok.extern.slf4j.Slf4j;
import org.apache.logging.log4j.util.Strings;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Tuple;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Join;
import javax.persistence.criteria.Root;
import java.util.List;

/**
 * @desc: TODO
 * @author: duchao
 * @date: 2019/12/25 09:55
 */
@Slf4j
@Service
public class DeptService {

    @PersistenceContext
    private EntityManager entityManager;

    /**
     * @desc: 获取部门分页
     * @param:
     *        deptId
     * @return:
     * @author: duchao
     * @date: 2019/12/25 9:58
     */
    public List<DeptDTO> findDeptPage(Long deptId){
        CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();

        CriteriaQuery<Dept> cqDept = criteriaBuilder.createQuery(Dept.class);
        Root<Dept> deptRoot = cqDept.from(Dept.class);
        //Join<Dept, Employee> employeeJoin = deptRoot.join(Dept_.employeeCollection);

        CriteriaQuery<Tuple> cq = criteriaBuilder.createQuery(Tuple.class);
        Root<Employee> employee = cq.from(Employee.class);
        cq.groupBy(employee.get("role"));
        //cq.having(criteriaBuilder.like(employee.get("role"), "N%"));
        cq.select(criteriaBuilder.tuple(employee.get("role"),criteriaBuilder.count(employee)));
        TypedQuery<Tuple> q = entityManager.createQuery(cq);
        List<Tuple> result = q.getResultList();
        return null;
    }
}
