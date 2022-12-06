package edu.hunau.service;

import edu.hunau.model.User;

public interface UserService {
    /**
     * 添加用户
     * @param user
     */
    void addUser(User user);

    /**
     * 更新、补全更多用户信息
     * @param user
     */
    void updateUser(User user);

    /**
     * 删除用户
     * @param userId
     */

    void deleteUser(Integer userId);

    User login(User user);


    Boolean checkTele(User user);

    int sendRegisterEmailCode(String to);
    int sendRegisterMessageCode(String to,int type);



}
