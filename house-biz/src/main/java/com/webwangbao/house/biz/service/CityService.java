package com.webwangbao.house.biz.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.google.common.collect.Lists;
import com.webwangbao.house.common.model.City;

@Service
public class CityService {
  
  public List<City> getAllCitys(){
    List<City> cityList = Lists.newArrayList();
    City city = new City();
    city.setCityCode("110000");
    city.setCityName("北京");
    city.setId(1);
    cityList.add(city);
    City city1 = new City();
    city1.setCityCode("110001");
    city1.setCityName("上海");
    city1.setId(2);
    cityList.add(city1);
    City city2 = new City();
    city2.setCityCode("110002");
    city2.setCityName("武汉");
    city2.setId(3);
    cityList.add(city2);
    return cityList;
  }

}
