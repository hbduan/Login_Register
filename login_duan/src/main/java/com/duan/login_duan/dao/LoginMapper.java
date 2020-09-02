package com.duan.login_duan.dao;

import com.duan.login_duan.domain.UserBean;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @创建人 Missbear
 * @创建时间 2018.9.28
 * @描述
 */

@Repository
@Mapper
public interface LoginMapper {
    @Select("SELECT * FROM USER WHERE username = #{un} AND pwd=#{pwd}")
    List<UserBean> LoginDao(@Param("userName") String un, @Param("password") String pwd);
}
