package com.zcw.osals.osals_base.dao;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.repository.NoRepositoryBean;

import com.zcw.osals.osals_base.domain.BaseEntity;

@NoRepositoryBean
public abstract interface GenericTreeDao<T extends BaseEntity, PK extends Serializable> extends GenericDao<T, PK> {

	List<T> getRoot();
}
