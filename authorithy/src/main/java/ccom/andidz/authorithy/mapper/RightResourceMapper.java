package ccom.andidz.authorithy.mapper;

import com.andidz.authorithy.domain.RightResource;
import com.andidz.authorithy.domain.RightResourceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RightResourceMapper {
    int countByExample(RightResourceExample example);

    int deleteByExample(RightResourceExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(RightResource record);

    int insertSelective(RightResource record);

    List<RightResource> selectByExample(RightResourceExample example);

    RightResource selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") RightResource record, @Param("example") RightResourceExample example);

    int updateByExample(@Param("record") RightResource record, @Param("example") RightResourceExample example);

    int updateByPrimaryKeySelective(RightResource record);

    int updateByPrimaryKey(RightResource record);
}