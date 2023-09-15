package com.project.utils;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * Description
 *
 * @Author：阿牛
 * @Date：Created in 2023/9/13 16:36
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PageBean<T> {
    private int currentPage;    //当前页码
    private int pageSize;       //每页显示的数据量
    private long total;         //总数据条数
    private List<T> data;       //当前页的数据集合
}
