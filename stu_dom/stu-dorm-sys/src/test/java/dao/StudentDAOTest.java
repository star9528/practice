package dao;

import model.Page;
import model.Student;
import org.junit.Test;

import javax.xml.crypto.Data;

import static org.junit.Assert.*;

public class StudentDAOTest {

    @Test
    public void query() {
//        Page page = new Page();
//        page.setPageNumber();
//        page.setPageSize();
//        page.setSearchText();
//        page.setSortOrder();
//        StudentDAO studentDAO = new StudentDAO();

    }

    @Test
    public void queryById() {
    StudentDAO studentDAO = new StudentDAO();
        System.out.println(studentDAO.queryById(1));
    }

    @Test
    public void insert() {
        Student student = new Student();
        student.setId(199);
        student.setStudentName("唐家三少");
        student.setStudentGraduateYear("000001");
        student.setStudentMajor("000002");
        student.setStudentEmail("12345@163.com");
        student.setDormId(1);
        //student.setCreateTime("2020-08-11 23:07:09");
        student.setBuildingId(1);
        student.setBuildingName("男生楼-1");
        student.setDormNo("1-0-1");
        StudentDAO studentDAO = new StudentDAO();
        System.out.println(studentDAO.insert(student));
    }

    @Test
    public void update() {
    }

    @Test
    public void delete() {
    }

    @Test
    public void apply() {
    }
}