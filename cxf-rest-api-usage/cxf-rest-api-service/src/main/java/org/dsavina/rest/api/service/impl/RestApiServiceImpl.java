package org.dsavina.rest.api.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.dsavina.rest.api.resources.User;
import org.dsavina.rest.api.service.RestApiService;
import org.dsavina.rest.api.utils.UserGenerator;

public class RestApiServiceImpl implements RestApiService {

    @Override
    public List<User> listUsers() {
        List<User> usersList = new ArrayList<User>();
        UserGenerator ug = new UserGenerator();
        for (int i = 0; i < 10; i++){
            usersList.add(ug.generateUser());
        }
        return usersList;
    }
}
