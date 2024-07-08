package com.iamrishavdas.SpringJDBC.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.iamrishavdas.SpringJDBC.Model.Student;


@Repository
public class StudentRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void save(Student student) {
        String sql = "insert into student (rollNo, name, marks) values (?, ?, ?)";
        int rowsAffected = jdbcTemplate.update(sql, student.getRollNo(), student.getName(), student.getMarks());
        System.out.println("No of rows affected: " + rowsAffected);
    }

    public List<Student> findAll(){
        String sql = "select * from student";
                                        // rowmappper functional interface is used the (ResultSet rs, int rowNum) rs return the individula row from the database according to the query
        return jdbcTemplate.query(sql, (rs, rowNum) -> {
            return new Student(rs.getInt("rollNo"), rs.getString("name"), rs.getFloat("marks"));
        });
    }
    
}
