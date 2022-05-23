package com.example.student.repository;

import com.example.student.entity.Student;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

@Repository
@Transactional
public class StudentRepositoryImpl implements StudentRepository {
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void addStudent(String firstName, String lastName, String patronymic, String group, Date date) {
        entityManager.createNativeQuery("INSERT INTO main.Student(\n" +
                "\t firstName, lastName, patronymic, `group`, `dateOfBirth`)\n" +
                "\tVALUES (?, ?, ?, ?, ?)")
                .setParameter(1, firstName)
                .setParameter(2, lastName)
                .setParameter(3, patronymic)
                .setParameter(4, group)
                .setParameter(5, date)
                .executeUpdate();
    }

    @Override
    public List<Student> getAllStudents() {
        List<Object[]> listOfObjects = entityManager
                .createNativeQuery("SELECT firstName, lastName, patronymic, `group`, `dateOfBirth` FROM Student")
                .getResultList();
        List<Student> listOfStudents = new LinkedList();
        for (Object[] object : listOfObjects) {
            String firstName = (String) object[0];
            String lastName = (String) object[1];
            String patronymic = (String) object[2];
            String group = (String) object[3];
            Date date = (Date) object[4];
            listOfStudents.add(new Student(firstName, lastName, patronymic, group, date));
        }
        return listOfStudents;
    }

    @Override
    public Student findStudent(int id) {
        Object[] object = (Object[]) entityManager.createNativeQuery("SELECT firstName, lastName, patronymic, `group`, `dateOfBirth` FROM Student WHERE id=?").setParameter(1, id).getSingleResult();
        String firstName = (String) object[0];
        String lastName = (String) object[1];
        String patronymic = (String) object[2];
        String group = (String) object[3];
        Date date = (Date) object[4];
        return new Student(firstName, lastName, patronymic, group, date, id);
    }

    @Override
    public void editStudent(int id, String firstName, String lastName, String patronymic, String group, Date date) {
        entityManager.createNativeQuery("UPDATE Student SET firstName=?, lastName=?, patronymic=?, `dateOfBirth`=?, `group`=? WHERE id=?")
                .setParameter(1, firstName)
                .setParameter(2, lastName)
                .setParameter(3, patronymic)
                .setParameter(4, date)
                .setParameter(5, group)
                .setParameter(6, id)
                .executeUpdate();
    }

    @Override
    public void deleteStudent(int id) {
        entityManager.createNativeQuery("DELETE FROM Student WHERE id=?")
                .setParameter(1, id)
                .executeUpdate();
    }
}
