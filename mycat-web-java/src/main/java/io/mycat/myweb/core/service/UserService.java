package io.mycat.myweb.core.service;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import io.mycat.myweb.core.dao.UserDao;
import io.mycat.myweb.core.domain.User;

@Service
public class UserService {
    @Autowired
    private UserDao userDao;

    public Optional<User> findByUserName(String userName) {
        return userDao.accountByUsername(userName);
    }

    public Optional<User> findUserById(long userId) {
        return userDao.findById(userId);
    }
}