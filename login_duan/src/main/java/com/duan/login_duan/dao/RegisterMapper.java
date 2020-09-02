package com.duan.login_duan.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * @创建人 Missbear
 * @创建时间 2018.9.28
 * @描述
 */
@Repository
@Mapper
public interface RegisterMapper {
    @Insert("INSERT INTO USER(id, username, pwd,address) VALUES( #{id}, #{userName}, #{pwd}, #{address})")
    void insert(@Param("id") String id,
                  @Param("userName") String userName,
                  @Param("pwd") String pwd,
                  @Param("address") String address);

}
