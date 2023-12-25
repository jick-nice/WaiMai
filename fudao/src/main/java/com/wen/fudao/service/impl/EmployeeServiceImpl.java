package com.wen.fudao.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wen.fudao.entity.Employee;
import com.wen.fudao.mapper.EmployeeMapper;
import com.wen.fudao.service.EmployeeService;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl extends ServiceImpl<EmployeeMapper,Employee> implements EmployeeService{
}
