package priv.ljh.operate.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import io.swagger.annotations.ApiModel;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import priv.ljh.operate.entity.FoundList;
/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author lijinghai
 * @since 2021-01-22
 */
@Mapper
@Repository
@ApiModel("用实体接口类")
public interface FoundListMapper extends BaseMapper<FoundList> {

}
