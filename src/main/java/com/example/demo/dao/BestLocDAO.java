package com.example.demo.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.model.Bestloc;

@Mapper
public interface BestLocDAO {
	List<Bestloc> select();
}
