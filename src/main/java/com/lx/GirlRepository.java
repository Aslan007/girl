package com.lx;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by Aslan on 2017/8/8.
 */
//这个相当于mapper，hibernate自动做了处理，不用写代码
public interface GirlRepository extends JpaRepository<Girl , Integer> {

    //findByage
    public List<Girl> findByAge(Integer age);

}
