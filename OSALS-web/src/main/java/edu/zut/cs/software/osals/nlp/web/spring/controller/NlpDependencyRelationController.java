package edu.zut.cs.software.osals.nlp.web.spring.controller;

import edu.stanford.nlp.trees.TypedDependency;
import edu.zut.cs.software.base.web.spring.controller.GenericController;
import edu.zut.cs.software.osals.nlp.domain.NlpDependencyRelation;
import edu.zut.cs.software.osals.nlp.service.NlpDependencyRelationManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

/**
 * @Author: hyh
 * @Description:
 * @Date:Created in 16:11 2019/6/13
 * @Modified By:
 */
@Controller
@RequestMapping("/nlpdr")
public class NlpDependencyRelationController  extends GenericController<NlpDependencyRelation, Long, NlpDependencyRelationManager> {

    NlpDependencyRelationManager hanlpManager;

    @Autowired
    public void setHanlpManager(NlpDependencyRelationManager hanlpManager) {
        this.hanlpManager = hanlpManager;
        this.manager = this.hanlpManager;
    }

    @RequestMapping(method = RequestMethod.GET, value = "/main")
    public String index() {
        String result = "index";
        return result;
    }

    @ResponseBody
    @GetMapping(value = "hello", produces = "application/json;charset=utf-8")
    public String hello() {
        return "Hello, This is NlpDependencyRelation nlp!";
    }

    @ResponseBody
    @GetMapping(value = "text/{text}", produces = "application/json;charset=utf-8")
    public String getDependencyRelation(@PathVariable("text") String text){

        /**
         * StanfordParser 返回依存关系，标注指代
         */
        Collection<TypedDependency> collection=this.manager.stanfordDependencyRelation(text);
        String annotated=this.manager.stanfordAnnotatedReference(text);
        String relation=collection.toString();

        NlpDependencyRelation nlp=new NlpDependencyRelation();
        nlp.setText(text);
        nlp.setRelation(relation);
        nlp.setAnnotated(annotated);
        this.manager.save(nlp);

        String result=relation+"\n"+annotated;
        return result;
    }
}
