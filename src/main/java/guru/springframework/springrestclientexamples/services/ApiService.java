package guru.springframework.springrestclientexamples.services;

import guru.springframework.api.domain.User;

import java.util.List;

/*
Created by Joharry Correa 08/08/2018
 */
public interface ApiService {
    List<User> getUsers(Integer limit);
}
