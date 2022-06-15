package com.forest.provider.mapper;

import com.forest.provider.entity.HospitalInfo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface HospitalInfoMapper {

    List<HospitalInfo> selectAll();

    HospitalInfo selectByHospitalId(@Param("hospitalId")String hospitalId);
}
