package com.itdaima.common.persistence;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * Activiti Entity类
 * @author ThinkGem
 * @version 2013-05-28
 */
public abstract class ActEntity<T> extends DataEntity<T> implements Serializable {

	private static final long serialVersionUID = 1L;


	public ActEntity() {
		super();
	}
	
	public ActEntity(String id) {
		super(id);
	}

}
