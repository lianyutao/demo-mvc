package com.example.mvc.common;


public class Constants {
    
    public interface ResultCode {
        int OK = 0;
        int ERROR = 1;
        int NOLOGIN =2;
        int CONNECTION_REFUSED=-1;
    }
    
    public interface Rank {
    	int RANK_ONE  =1; //表示消费最高>....
    	int RANK_TWO  =2;
    	int RANK_THREE  =3;
    	int RANK_FOUR  =4;
    }
}
