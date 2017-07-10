package com.happy.repository;

import com.happy.bean.UserInfo;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by 刘亚飞 on 2017/6/19.
 */
public interface UserInfoRepository extends CrudRepository<UserInfo,Long>{

    /**通过username查找用户信息；*/

    public  UserInfo findByUsername(String username);
}
