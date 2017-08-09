package com.hfzs.framework.core.web.orm;

import org.springframework.data.jpa.repository.JpaRepository;

import java.io.Serializable;
import java.util.List;

/**
 * JPA Repository 接口
 * 
 * @author liufang
 * 
 * @param <T>
 * @param <ID>
 */
public interface MyJpaRepository<T, ID extends Serializable> extends
		JpaRepository<T, ID> {
	List<T> findAll(Limitable limitable);
}
