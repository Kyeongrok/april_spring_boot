package com.aprilskin.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class User extends AbstractEntity {

    @Column(nullable = false, unique = true, length = 20)
    @JsonProperty
    private String userId;

    @JsonIgnore
    private String password;

    @JsonProperty
    private String name;

    @JsonProperty
    private String email;

    public boolean matchId(Long newId){
        if( newId == null) {
            return false;
        }
        return newId.equals(getUserId());
    }

    public boolean matchPassword(String newPassword){
        if(newPassword == null) {
            return false;
        }
        return newPassword.equals(password);
    }

    public void update(User updateUser){
        this.email = updateUser.email;
        this.name = updateUser.name;
        this.password = updateUser.password;
    }

    @Override
    public String toString() {
        return "User{" + super.toString() +
                "userId='" + userId + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

}
