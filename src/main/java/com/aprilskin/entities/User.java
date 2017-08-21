package com.aprilskin.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import org.dom4j.tree.AbstractEntity;

import javax.persistence.*;
import java.util.Set;

@Data
@Entity
@Table(name= "user")
public class User extends AbstractEntity {

    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String userId;
    private String password;
    //private Set<Role> roles;

    // 아이디 일치확인 메서드
    public boolean matchId(Long newId) {
        if ( newId == null ) {
            return false;
        }
        return newId.equals(getId());
    }

    // 비밀번호 일치확인 매서드
    public boolean matchPassword(String newPassword) {
        if ( newPassword == null ) {
            return false;
        }
        return newPassword.equals(password);
    }

    // Update() 메서드
    public void update(User updatedUser) {
        this.userId = updatedUser.userId;
        this.password = updatedUser.password;
    }

    public User() {
    }

    public User(String userId, String password) {
        this.userId = userId;
        this.password = password;
    }
}
