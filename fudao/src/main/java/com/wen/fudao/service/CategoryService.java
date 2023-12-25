package com.wen.fudao.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wen.fudao.entity.Category;

public interface CategoryService extends IService<Category> {

    public void remove(Long id);

}
