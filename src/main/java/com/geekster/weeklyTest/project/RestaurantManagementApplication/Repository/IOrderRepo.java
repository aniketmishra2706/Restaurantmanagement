package com.geekster.weeklyTest.project.RestaurantManagementApplication.Repository;

import com.geekster.weeklyTest.project.RestaurantManagementApplication.Model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

import java.beans.JavaBean;

public interface IOrderRepo extends JpaRepository<Order, Integer> {

}

