package cn.charlie.strong.mapper;

import cn.charlie.strong.entity.user.AuthUser;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author charlie
 * @date 2024/4/26 13:26
 **/
@Mapper
public interface UserMapper extends BaseMapper<AuthUser> {}
