package edu.zut.cs.software.osals.shop.web.spring.controller;

import com.alibaba.fastjson.JSON;
import com.github.pagehelper.PageInfo;
import edu.zut.cs.software.base.web.spring.controller.GenericController;
import edu.zut.cs.software.osals.shop.domain.Commodity;
import edu.zut.cs.software.osals.shop.service.CommodityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @ClassName CommodityController
 * @Description TODO
 * @Author 研哥哥
 * @Date 2019/5/21 22:49
 * @Version 1.0
 */
@Controller
@RequestMapping("/commodity")
public class CommodityController extends GenericController<Commodity, Long, CommodityManager> {

    CommodityManager commodityManager;
    @Autowired
    public void setCommodityManager(CommodityManager commodityManager) {
        this.commodityManager = commodityManager;
        this.manager = this.commodityManager;
    }

    @RequestMapping("/index")
    public String index() {
        return "commodity/index";
    }

    @ResponseBody
    @GetMapping(value = "hello", produces = "application/json;charset=utf-8")
    public String hello() {
        return "Hello, This is Commodity!";
    }

    @ResponseBody
    @GetMapping(value = "all", produces = "application/json;charset=utf-8")
    public String findAllCommodity() {
        List<Commodity> commodityList = this.manager.findAll();
        PageInfo pageInfo = new PageInfo(commodityList);
        return JSON.toJSONString(pageInfo);
    }

}
