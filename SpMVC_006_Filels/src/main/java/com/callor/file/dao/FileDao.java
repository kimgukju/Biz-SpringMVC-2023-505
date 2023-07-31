package com.callor.file.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.callor.file.model.FileDto;

public interface FileDao extends GenericDao<FileDto, Long>{
	
	@Select("SELECT * FROM tbl_files WHERE f_bseq = #{b_seq}")
	public List<FileDto> findByBSeq(Long b_seq);
	
	public void create_file_table(String dumy);

	public int insert(
			@Param("list") List<FileDto> files, @Param("b_seq") Long b_seq);


}
