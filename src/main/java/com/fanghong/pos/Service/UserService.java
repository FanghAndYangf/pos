package com.fanghong.pos.Service;

import com.fanghong.pos.Model.AsUser;
import com.github.pagehelper.PageInfo;

public interface UserService {

    int addUser(AsUser asUser);

    PageInfo<AsUser> listAllUser(int pageNum, int pageSize);
}
