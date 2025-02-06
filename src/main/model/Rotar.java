package model;

public class Rotar {

    private String[] setting;
    private int settingNum;

    final static String[] SETTING1 = "p7zgxb08ue3tl2vk,o5ns9i1q rhd4.ymafc6wj".split("");
    final static String[] SETTING2 = "t7jr6bypx,fg2 n5v1le3z.dk0suia4h8qco9wm".split("");
    final static String[] SETTING3 = "bnat3suk6j.e2xyr 1zidq74pc9o,m50hvlw8gf".split("");
    final static String[] SETTING4 = "ro5skned3y,lz19xivh0u.26wbpjq7aftcm4 g8".split("");
    final static String[] SETTING5 = "zaw5ndl2txiu.16vhqg3pfy9o0c4b7smr, k8je".split("");

    final static int NUMOFCHARS = 39;

    // Effect: Creates a rotar with the given setting (out of 5 possible settings) and sets canRotate to false
    // Requires: setting is an integer between 1 and 5
    public Rotar(int setting) {
        switch(setting){
            case 1 :
                this.setting = new String[NUMOFCHARS];
                copy(this.setting, SETTING1);
                settingNum = 1;
                break;
            case 2 :   
                this.setting = new String[NUMOFCHARS];
                copy(this.setting, SETTING2);
                settingNum = 2;
                break;
            case 3 :
                this.setting = new String[NUMOFCHARS];
                copy(this.setting, SETTING3);
                settingNum = 3;
                break;
            case 4 :
                this.setting = new String[NUMOFCHARS];
                copy(this.setting, SETTING4);
                settingNum = 4;
                break;
            case 5 :
                this.setting = new String[NUMOFCHARS];
                copy(this.setting, SETTING5);
                settingNum = 5;
                break;
        }
    }

    // Effect: Resets the rotar to its default setting
    public static void reset(Rotar r){
        int i = r.getSettingNum();
        switch(i){
            case 1 :
                copy(r.setting, SETTING1);  
                break;
            case 2 :
                copy(r.setting, SETTING2);  
                break;
            case 3 :
                copy(r.setting, SETTING3);  
                break;
            case 4 :
                copy(r.setting, SETTING4);  
                break;
            case 5 :
                copy(r.setting, SETTING5);
                break;
        }
    }
    
    //Effect: copies default SETTING to setting
    //Modifies: this
    public static void copy(String[] setting, String[] DEFAULT){
        for(int i = 0; i < NUMOFCHARS; i++){
            setting[i] = DEFAULT[i];
        }
    }

    // Effect: Rotates the rotar by one position
    // Modifies: this
    public void rotate() {
        String first = setting[0];
        for (int i = 0; i < setting.length - 1; i++) {
            setting[i] = setting[i + 1];
        }
        setting[setting.length - 1] = first;
    }

    public int getSettingNum(){
        return this.settingNum;
    }

    public String[] getSetting(){
        return this.setting;
    }

    public String getLetter(int i){
        return setting[i];
    }
}

