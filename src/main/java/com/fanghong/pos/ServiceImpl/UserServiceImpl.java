package com.fanghong.pos.ServiceImpl;

import com.fanghong.pos.Dao.AsUserMapper;
import com.fanghong.pos.Model.AsUser;
import com.fanghong.pos.Service.UserService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service(value = "userService")
public class UserServiceImpl implements UserService {

    @Resource
    private AsUserMapper asUserMapper;

    @Override
    public int addUser(AsUser asUser) {

        return asUserMapper.insert(asUser);
    }

    @Override
    public PageInfo<AsUser> listAllUser(int pageNum, int pageSize) {

        //PageHelper.startPage(pageNum, pageSize);
        //List<AsUser> userList = asUserMapper.selectByPrimaryKey()
        return null;
    }
}
