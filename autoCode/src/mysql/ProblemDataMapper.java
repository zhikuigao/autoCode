package mysql;

import java.util.List;
import mysql.ProblemData;
import mysql.ProblemDataExample;
import org.apache.ibatis.annotations.Param;

public interface ProblemDataMapper {
    int countByExample(ProblemDataExample example);

    int deleteByExample(ProblemDataExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ProblemData record);

    int insertSelective(ProblemData record);

    List<ProblemData> selectByExample(ProblemDataExample example);

    ProblemData selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ProblemData record, @Param("example") ProblemDataExample example);

    int updateByExample(@Param("record") ProblemData record, @Param("example") ProblemDataExample example);

    int updateByPrimaryKeySelective(ProblemData record);

    int updateByPrimaryKey(ProblemData record);
}