package com.ems.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ems.dao.OptionDAO;
import com.ems.entity.Option;
import com.ems.service.OptionService;
@Service("optionService")
public class OptionServiceImpl implements OptionService {
	@Autowired
	private OptionDAO optionDAO;
	
	public void save(Option option) {
		// TODO Auto-generated method stub
		this.optionDAO.save(option);
	}

	public List<Option> findAll() {
		// TODO Auto-generated method stub
		return this.optionDAO.findAll();
	}

}
