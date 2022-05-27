package com.atguigu.es;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

/**
 * @author ：ShaoSen
 * @description：TODO
 * @date ：2022/5/20 20:30
 */
@Repository
public interface ProductDao extends ElasticsearchRepository<Product,Long> {
}
