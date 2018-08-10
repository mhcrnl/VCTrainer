package model;

import java.time.LocalDate;

class Language {
    
    private Integer id;
    private String wordLang1;
    private String wordLang2;
    private String memo;
    private LocalDate dayOfCreation;
    private LocalDate lastCall;
    private Boolean archieved;
    
    
    
    
    public Language(String wordLang1, String wordLang2, LocalDate dayOfCreation){
        this(null,wordLang1, wordLang2,null,dayOfCreation, dayOfCreation, null);
    }
    
    public Language(Integer id,String wordLang1, String wordLang2, String memo, LocalDate dayOfCreation, LocalDate lastCall, Boolean archieved){
        this.id = id;
        this.wordLang1 = wordLang1;
        this.wordLang2 = wordLang2;
        this.memo = memo;
        this.dayOfCreation = dayOfCreation;
        this.lastCall = lastCall;
        this.archieved = false;
        
    }

    /**
     * @return the wordLang1
     */
    public String getWordLang1() {
        return wordLang1;
    }

    /**
     * @param wordLang1 the wordLang1 to set
     */
    public void setWordLang1(String wordLang1) {
        this.wordLang1 = wordLang1;
    }

    /**
     * @return the wordLang2
     */
    public String getWordLang2() {
        return wordLang2;
    }

    /**
     * @param wordLang2 the wordLang2 to set
     */
    public void setWordLang2(String wordLang2) {
        this.wordLang2 = wordLang2;
    }

    /**
     * @return the memo
     */
    public String getMemo() {
        return memo;
    }

    /**
     * @param memo the memo to set
     */
    public void setMemo(String memo) {
        this.memo = memo;
    }

    /**
     * @return the dayOfCreation
     */
    public LocalDate getDayOfCreation() {
        return dayOfCreation;
    }

    /**
     * @param dayOfCreation the dayOfCreation to set
     */
    public void setDayOfCreation(LocalDate dayOfCreation) {
        this.dayOfCreation = dayOfCreation;
    }

    /**
     * @return the lastCall
     */
    public LocalDate getLastCall() {
        return lastCall;
    }

    /**
     * @param lastCall the lastCall to set
     */
    public void setLastCall(LocalDate lastCall) {
        this.lastCall = lastCall;
    }

    /**
     * @return the archieved
     */
    public Boolean getArchieved() {
        return archieved;
    }

    /**
     * @param archieved the archieved to set
     */
    public void setArchieved(Boolean archieved) {
        this.archieved = archieved;
    }
    
    
    
}
