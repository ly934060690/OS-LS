package edu.zut.cs.software.osals.student.dao;

import edu.zut.cs.software.base.dao.GenericDao;
import edu.zut.cs.software.osals.student.domain.Student;
import org.springframework.stereotype.Repository;

@Repository("studentDao")
public interface StudentDao extends GenericDao<Student, Long> {

}
