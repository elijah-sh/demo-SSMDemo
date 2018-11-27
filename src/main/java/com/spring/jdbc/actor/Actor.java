package com.spring.jdbc.actor;

/**
 * Created by ShenShuaihu on 2018/8/16.
 */
public class Actor {
        private Long id;
        private String firstName;
        private String lastName;
        public String getFirstName() {
            return this.firstName;
        }
        public String getLastName() {
            return this.lastName;
        }
        public Long getId() {
            return this.id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }
}
