package org.techtown.miniproject.items;

public class RankItem {

    int ranking;
    String user_name;
    int user_age;
    String user_gender;
    int win_num;
    int lose_num;

    public RankItem(int ranking, String user_name, int user_age, String user_gender, int win_num, int lose_num) {
        this.ranking = ranking;
        this.user_name = user_name;
        this.user_age = user_age;
        this.user_gender = user_gender;
        this.win_num = win_num;
        this.lose_num = lose_num;
    }

    public int getRanking() {
        return ranking;
    }

    public void setRanking(int ranking) {
        this.ranking = ranking;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public int getUser_age() {
        return user_age;
    }

    public void setUser_age(int user_age) {
        this.user_age = user_age;
    }

    public String getUser_gender() {
        return user_gender;
    }

    public void setUser_gender(String user_gender) {
        this.user_gender = user_gender;
    }

    public int getWin_num() {
        return win_num;
    }

    public void setWin_num(int win_num) {
        this.win_num = win_num;
    }

    public int getLose_num() {
        return lose_num;
    }

    public void setLose_num(int lose_num) {
        this.lose_num = lose_num;
    }
}
