package Lesson1;

public enum Season {


    SPRING("CHUNTIAN", "WANWUFUSU"),
    SUMMER("xiatian", "hot");
    private final String sn;
    private final String sd;

    private Season(String sn, String sd){
        this.sn = sn;
        this.sd = sd;
    }
    public String getSn() {
        return this.sn;
    }
}
