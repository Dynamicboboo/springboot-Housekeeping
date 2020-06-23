package com.briup.jz.dao;

import com.briup.jz.bean.RolePrivilege;
import com.briup.jz.bean.RolePrivilegeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RolePrivilegeMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table base_role_privilege
     *
     * @mbg.generated Thu Jun 11 15:13:29 GMT+08:00 2020
     */
    long countByExample(RolePrivilegeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table base_role_privilege
     *
     * @mbg.generated Thu Jun 11 15:13:29 GMT+08:00 2020
     */
    int deleteByExample(RolePrivilegeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table base_role_privilege
     *
     * @mbg.generated Thu Jun 11 15:13:29 GMT+08:00 2020
     */
    int insert(RolePrivilege record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table base_role_privilege
     *
     * @mbg.generated Thu Jun 11 15:13:29 GMT+08:00 2020
     */
    int insertSelective(RolePrivilege record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table base_role_privilege
     *
     * @mbg.generated Thu Jun 11 15:13:29 GMT+08:00 2020
     */
    List<RolePrivilege> selectByExample(RolePrivilegeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table base_role_privilege
     *
     * @mbg.generated Thu Jun 11 15:13:29 GMT+08:00 2020
     */
    int updateByExampleSelective(@Param("record") RolePrivilege record, @Param("example") RolePrivilegeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table base_role_privilege
     *
     * @mbg.generated Thu Jun 11 15:13:29 GMT+08:00 2020
     */
    int updateByExample(@Param("record") RolePrivilege record, @Param("example") RolePrivilegeExample example);
}