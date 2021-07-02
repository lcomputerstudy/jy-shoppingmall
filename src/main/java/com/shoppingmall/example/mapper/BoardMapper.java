package com.shoppingmall.example.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.shoppingmall.example.domain.Board;

@Mapper
public interface BoardMapper {

	public List<Board> selectBoardList();
	
	public Board selectBoardDetail(int bId);
	
	public void deleteBoard(int bId);
}
