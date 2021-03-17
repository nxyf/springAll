package com.nxyf.springbootmybatisplus.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.nxyf.springbootmybatisplus.mapper.UserMapper;
import com.nxyf.springbootmybatisplus.pojo.User;
import com.nxyf.springbootmybatisplus.service.IUserService;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author nxyf
 * @since 2021-03-17
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
