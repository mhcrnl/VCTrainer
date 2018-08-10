package model;

import java.time.LocalDate;

class User {
    
    private Integer id;
    private String mainLanguage;
    private LocalDate lastTest;
    private String nickname;
    
    
    public User(String mainLanguage){
        this(mainLanguage, null);
    }
    
    public User(String mainLanguage, String nickname){
        this(null, mainLanguage, null, nickname);
    }
    
    public User(Integer id, String mainLanguage, LocalDate lastTest, String nickname){
        this.id = id;
        this.mainLanguage = mainLanguage;
        this.lastTest = lastTest;
        this.nickname = nickname;
    }

    /**
     * @return the id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return the mainLanguage
     */
    public String getMainLanguage() {
        return mainLanguage;
    }

    /**
     * @param mainLanguage the mainLanguage to set
     */
    public void setMainLanguage(String mainLanguage) {
        this.mainLanguage = mainLanguage;
    }

    /**
     * @return the lastTest
     */
    public LocalDate getLastTest() {
        return lastTest;
    }

    /**
     * @param lastTest the lastTest to set
     */
    public void setLastTest(LocalDate lastTest) {
        this.lastTest = lastTest;
    }

    /**
     * @return the nickname
     */
    public String getNickname() {
        return nickname;
    }

    /**
     * @param nickname the nickname to set
     */
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
    
    
    
}
