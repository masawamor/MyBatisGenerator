package com.example.demo;

import com.example.demo.Authors;
import com.example.demo.AuthorsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AuthorsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table authors
     *
     * @mbggenerated Thu Nov 25 04:51:07 JST 2021
     */
    int countByExample(AuthorsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table authors
     *
     * @mbggenerated Thu Nov 25 04:51:07 JST 2021
     */
    int deleteByExample(AuthorsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table authors
     *
     * @mbggenerated Thu Nov 25 04:51:07 JST 2021
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table authors
     *
     * @mbggenerated Thu Nov 25 04:51:07 JST 2021
     */
    int insert(Authors record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table authors
     *
     * @mbggenerated Thu Nov 25 04:51:07 JST 2021
     */
    int insertSelective(Authors record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table authors
     *
     * @mbggenerated Thu Nov 25 04:51:07 JST 2021
     */
    List<Authors> selectByExample(AuthorsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table authors
     *
     * @mbggenerated Thu Nov 25 04:51:07 JST 2021
     */
    Authors selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table authors
     *
     * @mbggenerated Thu Nov 25 04:51:07 JST 2021
     */
    int updateByExampleSelective(@Param("record") Authors record, @Param("example") AuthorsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table authors
     *
     * @mbggenerated Thu Nov 25 04:51:07 JST 2021
     */
    int updateByExample(@Param("record") Authors record, @Param("example") AuthorsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table authors
     *
     * @mbggenerated Thu Nov 25 04:51:07 JST 2021
     */
    int updateByPrimaryKeySelective(Authors record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table authors
     *
     * @mbggenerated Thu Nov 25 04:51:07 JST 2021
     */
    int updateByPrimaryKey(Authors record);
}