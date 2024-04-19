package com.example.userservice.domain.repositories;

import com.example.userservice.data.dao.UserDao;
import com.example.userservice.data.entities.UserEntity;
import com.example.userservice.domain.model.User;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class UserRepositoryImpl implements UserRepository{
    private final UserDao userDao;

    @Override
    public void addUser(User user) {
        userDao.save(mapToEntityUser(user));
    }

    private UserEntity mapToEntityUser(User user) {
        UserEntity userEnt;

        userEnt = userDao.findById(user.getId()).orElse(null);
        if (userEnt == null) {
            userEnt = new UserEntity();
        }

        userEnt.setId(user.getId());
        userEnt.setFirstName(user.getFirstName());
        userEnt.setMiddleName(user.getMiddleName());
        userEnt.setLastName(user.getLastName());
        userEnt.setEmail(user.getEmail());
        userEnt.setPhoneNumber(user.getPhoneNumber());
        userEnt.setDateOfBirth(user.getDateOfBirth());

        return userEnt;
    }
}
