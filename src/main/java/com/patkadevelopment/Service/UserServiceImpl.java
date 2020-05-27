package com.patkadevelopment.Service;

import com.patkadevelopment.Model.User;
import com.patkadevelopment.Repository.UserRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityNotFoundException;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {


    private UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    @Override
    @Transactional
    public User createUser(User user) {
        return userRepository.save(user);
    }


    @Override
    @Transactional
    public void deleteUser(Long userId) {
        userRepository.deleteById(userId);
    }

    @Override
    @Transactional
    public List<User> getUsers() {
        return userRepository.findAll();
    }

    @Override
    @Transactional
    public User updateUser(User user) {
        User userForDB = userRepository.findById(user.getId()).orElseThrow( () -> new NullPointerException()); //ToDo: tu mozna  dodac EntityNotFound zamaisyt  NullPointerException!
        userForDB.setFirstName(user.getFirstName());
        userForDB.setLastName(user.getLastName());
        userForDB.setAge(user.getAge());
      return userForDB;


    }

    @Override
    public User getUser(Long userId) {
        return userRepository.findById(userId).orElseThrow( () -> new EntityNotFoundException());
    }

}