package com.yao.spring.redis.share;

import com.yao.spring.redis.module.People;

import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * Created by yaozb on 15-4-5.
 */
public interface PeopleClient {
    public List<People> getPeopleByTitle(String title);
    public List<People> getPeopleByTitle1(String title);
    public void add(People people);
    public People get(String peopleId);
    public void addTemporary(People people,int time,TimeUnit timeUnit);
}
