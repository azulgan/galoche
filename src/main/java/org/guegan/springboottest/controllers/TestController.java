package org.guegan.springboottest.controllers;

import org.guegan.springboottest.data.DataBean;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Collection;

/**
 * (c) aguegan, 2017
 * User: aguegan
 * Date: 10/6/17
 * Time: 10:34 AM
 */
@RestController("/test/myservice")
public class TestController {

    @RequestMapping(method = RequestMethod.GET)
    Collection<DataBean> readBookmarks() { //@PathVariable String id) {
        //this.validateUser(userId);
        Collection<DataBean> list = new ArrayList<>();
        list.add(new DataBean("one", "onevalue"));
        list.add(new DataBean("two", "twovalue"));
        return list;//this.bookmarkRepository.findByAccountUsername(userId);
    }

}
