package com.tensquare.qu.dao;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.tensquare.qu.pojo.Problem;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * 数据访问接口
 * @author Administrator
 *
 */
public interface ProblemDao extends JpaRepository<Problem,String>,JpaSpecificationExecutor<Problem>{

    @Query("select p from Problem p where p.id in ( select pl.problemid from Pl pl where pl.labelid = ?1) order by p.replytime desc ")
    public Page<Problem> findNewListByLabelid(String labelid, Pageable pageable);

    @Query("select p from Problem p where p.id in ( select pl.problemid from Pl pl where pl.labelid = ?1) order by p.reply desc ")
    Page<Problem> findhotListByLabelid(String labelid, Pageable pageable);

    @Query("select p from Problem p where p.id in ( select pl.problemid from Pl pl where pl.labelid = ?1) order by p.createtime desc ")
    Page<Problem> findwaitListByLabelid(String labelid, Pageable pageable);

}
