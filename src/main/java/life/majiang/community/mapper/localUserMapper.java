package life.majiang.community.mapper;


import life.majiang.community.model.localUser;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface localUserMapper {


    @Insert("insert into LOCALUSER (uid,petName,phoneNum,Email,password) values (#{uid},#{petName},#{phoneNum},#{Email},#{password})")
    Integer create(localUser localUser);


}
