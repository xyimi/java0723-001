package com.ujiuye.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ujiuye.bean.Sc;
import com.ujiuye.dao.ScDao;
@Service
public class ScServiceImpl implements ScService{
	@Autowired
	ScDao dao;
	@Override
	public void saveAll(List<Sc> list) {
		dao.saveAll(list);
		
	}

	@Override
	public List<Sc> getAllByDate(String begin_date, String end_date) {
		// TODO Auto-generated method stub
		return dao.getAllByDate(begin_date, end_date);
	}

}
