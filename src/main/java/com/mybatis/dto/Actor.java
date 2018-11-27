package com.mybatis.dto;

/**
 * Created by ShenShuaihu on 2018/8/16.
 */
public class Actor {
        private Long id;
        private String firstName;
        private String lastName;
        private Long languageId;
        private Language language;
        public String getFirstName() {
            return this.firstName;
        }
        public String getLastName() {
            return this.lastName;
        }
        public Long getId() {
            return this.id;
        }

    @Override
    public String toString() {
        return "Actor{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", languageId=" + languageId +
                ", language=" + language +
                '}';
    }

    public Long getLanguageId() {
        return languageId;
    }

    public Language getLanguage() {
        return language;
    }

    public void setLanguageId(Long languageId) {
        this.languageId = languageId;
    }

    public void setLanguage(Language language) {
        this.language = language;
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
