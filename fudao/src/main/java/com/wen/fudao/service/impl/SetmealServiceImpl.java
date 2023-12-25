package com.wen.fudao.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wen.fudao.entity.Setmeal;
import com.wen.fudao.mapper.SetmealMapper;
import com.wen.fudao.service.SetmealService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class SetmealServiceImpl extends ServiceImpl<SetmealMapper,Setmeal> implements SetmealService {
}
