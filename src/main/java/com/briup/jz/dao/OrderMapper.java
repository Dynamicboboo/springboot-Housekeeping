package com.briup.jz.dao;

import com.briup.jz.bean.Order;
import com.briup.jz.bean.OrderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrderMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jz_order
     *
     * @mbg.generated Thu Jun 11 15:13:29 GMT+08:00 2020
     */
    long countByExample(OrderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jz_order
     *
     * @mbg.generated Thu Jun 11 15:13:29 GMT+08:00 2020
     */
    int deleteByExample(OrderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jz_order
     *
     * @mbg.generated Thu Jun 11 15:13:29 GMT+08:00 2020
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jz_order
     *
     * @mbg.generated Thu Jun 11 15:13:29 GMT+08:00 2020
     */
    int insert(Order record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jz_order
     *
     * @mbg.generated Thu Jun 11 15:13:29 GMT+08:00 2020
     */
    int insertSelective(Order record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jz_order
     *
     * @mbg.generated Thu Jun 11 15:13:29 GMT+08:00 2020
     */
    List<Order> selectByExample(OrderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jz_order
     *
     * @mbg.generated Thu Jun 11 15:13:29 GMT+08:00 2020
     */
    Order selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jz_order
     *
     * @mbg.generated Thu Jun 11 15:13:29 GMT+08:00 2020
     */
    int updateByExampleSelective(@Param("record") Order record, @Param("example") OrderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jz_order
     *
     * @mbg.generated Thu Jun 11 15:13:29 GMT+08:00 2020
     */
    int updateByExample(@Param("record") Order record, @Param("example") OrderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jz_order
     *
     * @mbg.generated Thu Jun 11 15:13:29 GMT+08:00 2020
     */
    int updateByPrimaryKeySelective(Order record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jz_order
     *
     * @mbg.generated Thu Jun 11 15:13:29 GMT+08:00 2020
     */
    int updateByPrimaryKey(Order record);
}