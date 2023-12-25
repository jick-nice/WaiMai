package com.wen.fudao.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wen.fudao.entity.Dish;
import com.wen.fudao.mapper.DishMapper;
import com.wen.fudao.service.DishService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class DishServiceImpl extends ServiceImpl<DishMapper,Dish> implements DishService {
}