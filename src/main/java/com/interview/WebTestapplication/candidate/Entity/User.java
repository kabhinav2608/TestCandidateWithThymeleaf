package com.interview.WebTestapplication.candidate.Entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "userdata")

public class User implements Serializable{

        private static final long serialVersionUID = -3009157732242241606L;
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private long userId;

        @Column(name = "user_name")
        private String userName;

        @Column(name = "password")
        private String password;

        public User(String userName, String password) {
            this.userName = userName;
            this.password = password;
        }

        protected User() {
        }

        public long getUserId() {
            return userId;
        }

        public void setUserId(long userId) {
            this.userId = userId;
        }

        public String getUserName() {
            return userName;
        }

        public void setUserName(String userName) {
            this.userName = userName;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }


        @Override
        public String toString() {
            return "User{" +
                    "userId=" + userId +
                    ", userName='" + userName + '\'' +
                    ", password='" + password + '\'' +
                    '}';
        }

}
