package ccom.andidz.authorithy.mapper;

import com.andidz.authorithy.domain.UserRightRelationship;
import com.andidz.authorithy.domain.UserRightRelationshipExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserRightRelationshipMapper {
    int countByExample(UserRightRelationshipExample example);

    int deleteByExample(UserRightRelationshipExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(UserRightRelationship record);

    int insertSelective(UserRightRelationship record);

    List<UserRightRelationship> selectByExample(UserRightRelationshipExample example);

    UserRightRelationship selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") UserRightRelationship record, @Param("example") UserRightRelationshipExample example);

    int updateByExample(@Param("record") UserRightRelationship record, @Param("example") UserRightRelationshipExample example);

    int updateByPrimaryKeySelective(UserRightRelationship record);

    int updateByPrimaryKey(UserRightRelationship record);
}