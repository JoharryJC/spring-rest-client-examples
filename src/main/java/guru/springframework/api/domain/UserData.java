package guru.springframework.api.domain;

import java.util.List;

/*
Created by Joharry Correa 08/08/2018
*/
public class UserData {

    List<User> data;

    public List<User> getData() {
        return data;
    }

    public void setData(List<User> data) {
        this.data = data;
    }
}
