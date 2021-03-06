package com.example.healthy_first_ver1.service;

import com.example.healthy_first_ver1.api.form.RestaurantForm;
import com.example.healthy_first_ver1.entity.Restaurant;
import com.example.healthy_first_ver1.repository.result.ResRecommendResult;
import com.example.healthy_first_ver1.repository.result.ResSafeResult;
import com.example.healthy_first_ver1.repository.result.ResUnsafeResult;

import java.util.List;
import java.util.Map;

public interface ResService {
    Restaurant addNewRes(RestaurantForm form);

    Restaurant getById(Long id);

    Restaurant getByName(String name);

    Restaurant updateRestaurant(Long id, String name, String district, String phone);

    List<Restaurant> getRestaurantList();

    List<ResSafeResult> getRestaurantSafe();

    List<ResUnsafeResult> getRestaurantUnsafe();

    List<ResRecommendResult> getResRecommend();

    List<Long> countRestaurant();

    List<Long> countProduction();

    Map<String,Integer> count(); // đếm xem có bao nhiêu nhà hàng có bao nhiêu cơ sở sản xuất

    void deleteById(Long id);

    Restaurant save(Restaurant restaurant);
}
