package com.ems.service;

import java.util.List;

import com.ems.entity.Option;

public interface OptionService {
	public void save(Option option);
	public List<Option> findAll();
}
