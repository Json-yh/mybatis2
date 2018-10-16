package com.itm.mybatis2.dao;

import com.itm.mybatis2.model.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * @author hao.yang
 * @description UsersMapper
 * @create 2018-07-31
 */

@Mapper
public interface UserMapper {

    @Select("<script>\n" +
                 "select * from users where id = #{id}"+
            "</script>")
    User getById(@Param("id") Integer id);

    @Insert("<script>\n" +
            "insert into users (`id`,`name`) values  (null,#{name})"+
            "</script>")
    void save(User user);
}
