package com.examportal.backend.service;

import com.examportal.backend.exceptions.UserAlreadyExists;
import com.examportal.backend.exceptions.UserNotFoundException;
import com.examportal.backend.models.User;
import com.examportal.backend.models.UserRole;
import jdk.javadoc.internal.doclets.toolkit.taglets.SeeTaglet;

import java.util.Set;

public interface IUserService {
    User createUser(User user, Set<UserRole>userRoles) throws UserAlreadyExists;
    //get user by username
    User getUser(String username) throws UserNotFoundException;
    void deleteUserById(Long id);

}
