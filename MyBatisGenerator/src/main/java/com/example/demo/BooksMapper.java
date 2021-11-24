package com.example.demo;

import com.example.demo.Books;
import com.example.demo.BooksExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BooksMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table books
     *
     * @mbggenerated Thu Nov 25 04:51:07 JST 2021
     */
    int countByExample(BooksExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table books
     *
     * @mbggenerated Thu Nov 25 04:51:07 JST 2021
     */
    int deleteByExample(BooksExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table books
     *
     * @mbggenerated Thu Nov 25 04:51:07 JST 2021
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table books
     *
     * @mbggenerated Thu Nov 25 04:51:07 JST 2021
     */
    int insert(Books record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table books
     *
     * @mbggenerated Thu Nov 25 04:51:07 JST 2021
     */
    int insertSelective(Books record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table books
     *
     * @mbggenerated Thu Nov 25 04:51:07 JST 2021
     */
    List<Books> selectByExample(BooksExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table books
     *
     * @mbggenerated Thu Nov 25 04:51:07 JST 2021
     */
    Books selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table books
     *
     * @mbggenerated Thu Nov 25 04:51:07 JST 2021
     */
    int updateByExampleSelective(@Param("record") Books record, @Param("example") BooksExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table books
     *
     * @mbggenerated Thu Nov 25 04:51:07 JST 2021
     */
    int updateByExample(@Param("record") Books record, @Param("example") BooksExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table books
     *
     * @mbggenerated Thu Nov 25 04:51:07 JST 2021
     */
    int updateByPrimaryKeySelective(Books record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table books
     *
     * @mbggenerated Thu Nov 25 04:51:07 JST 2021
     */
    int updateByPrimaryKey(Books record);
}