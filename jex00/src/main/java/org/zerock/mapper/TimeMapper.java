package org.zerock.mapper;

import org.apache.ibatis.annotations.Select;

public interface TimeMapper {

	@Select("SELECT current_timestamp()")
	public String getTime();
	
	public String getTime2();
}
