package com.han.route.route.filter;

import java.util.List;

/**
 * @Author: Wuj
 * @Description: TODO
 * @DateTime: 2023/7/29 02:04
 **/
public interface FilterChain {

    void doFilter(List<BaseFilterI> baseFilters);
}
