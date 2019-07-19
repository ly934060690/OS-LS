package edu.zut.cs.software.osals.nlp.service;

import edu.zut.cs.software.base.service.GenericManagerTestCase;
import edu.zut.cs.software.osals.nlp.domain.NlpEntityRelation;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Scanner;

public class NlpEntityRelationManagerTestCase extends GenericManagerTestCase<Long, NlpEntityRelation,NlpEntityRelationManager>
{
    public NlpEntityRelationManagerTestCase(){
        super(NlpEntityRelation.class);
    }
    NlpEntityRelationManager nlpEntityRelationManager;

    @Autowired
    public void setNlpEntityRelationManager(NlpEntityRelationManager nlpEntityRelationManager) {
        this.nlpEntityRelationManager = nlpEntityRelationManager;
        this.manager=this.nlpEntityRelationManager;
    }
    @Test
    public  void  getAll(){
        System.out.println(manager.findAll());
    }
    @Test
    public  void  getEntityTest(){
       /* Scanner scanner=new Scanner(System.in);
        String line=scanner.nextLine();*/
       String line="Xiaoming is living in Zhengzhou";
        String entity= manager.getEntity(line);
        System.out.println(entity);
    }
}
