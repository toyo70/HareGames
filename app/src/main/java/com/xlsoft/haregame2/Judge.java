package com.xlsoft.haregame2;

public class Judge {

    //0未決定,1犬勝ち、2ウサギ勝ち
    static int winner=0;

    static int effort=0;

    public static void Remake(){
        winner=0;
        effort=0;
        MainActivity.houndTurn=true;
        MainActivity.turnCount=0;
        MainActivity.r1point=11;
        MainActivity.selectHound=0;
        MainActivity.selectRabbit=0;
        MainActivity.selectH1[0] = 1;
        MainActivity.selectH1[1] = 2;
        MainActivity.selectH1[2] = 4;
    }

    //行ける判定Rabbit
    public static boolean JudgeR(int hereIdx,int newIdx){
        switch (hereIdx){
            case 1:
                if(newIdx == 2|| newIdx == 3 || newIdx == 4){
                    effort = 3;
                    return true;
                }
                break;
            case 2:
                if(newIdx == 1|| newIdx == 3 || newIdx == 5 || newIdx == 6){
                    effort = 4;
                    return true;
                }
                break;
            case 3:
                if(newIdx == 1|| newIdx == 2 || newIdx == 4 || newIdx == 6){
                    effort = 4;
                    return true;
                }
                break;
            case 4:
                if(newIdx == 1|| newIdx == 3 || newIdx == 6 || newIdx == 7){
                    effort = 4;
                    return true;
                }
                break;
            case 5:
                if(newIdx == 2|| newIdx == 6 || newIdx == 8){
                    effort = 3;
                    return true;
                }
                break;
            case 6:
                if(newIdx == 2|| newIdx == 3 || newIdx == 4|| newIdx == 5|| newIdx == 7|| newIdx == 8|| newIdx == 9|| newIdx == 10){
                    effort = 8;
                    return true;
                }
                break;
            case 7:
                if(newIdx == 4|| newIdx == 6 || newIdx == 10){
                    effort = 3;
                    return true;
                }
                break;
            case 8:
                if(newIdx == 5|| newIdx == 6 || newIdx == 9|| newIdx == 11){
                    effort = 4;
                    return true;
                }
                break;
            case 9:
                if(newIdx == 6|| newIdx == 8 || newIdx == 10|| newIdx == 11){
                    effort = 4;
                    return true;
                }
                break;
            case 10:
                if(newIdx == 6||newIdx == 7|| newIdx == 9 || newIdx == 11){
                    effort = 4;
                    return true;
                }
                break;
            case 11:
                if(newIdx == 8|| newIdx == 9 || newIdx == 10){
                    effort = 3;
                    return true;
                }
                break;

        }
        return false;
    }

    //行ける判定Hound
    public static boolean JudgeH(int hereIdx,int newIdx){
        switch (hereIdx){
            case 1:
                if(newIdx == 2|| newIdx == 3 || newIdx == 4){
                    return true;
                }
                break;
            case 2:
                if(newIdx == 3 || newIdx == 5 || newIdx == 6){
                    return true;
                }
                break;
            case 3:
                if(newIdx == 2 || newIdx == 4 || newIdx == 6){
                    return true;
                }
                break;
            case 4:
                if(newIdx == 3 || newIdx == 6 || newIdx == 7){
                    return true;
                }
                break;
            case 5:
                if(newIdx == 6 || newIdx == 8){
                    return true;
                }
                break;
            case 6:
                if( newIdx == 5|| newIdx == 7|| newIdx == 8|| newIdx == 9|| newIdx == 10){
                    return true;
                }
                break;
            case 7:
                if(newIdx == 6 || newIdx == 10){
                    return true;
                }
                break;
            case 8:
                if(newIdx == 9|| newIdx == 11){
                    return true;
                }
                break;
            case 9:
                if(newIdx == 8 || newIdx == 10|| newIdx == 11){
                    return true;
                }
                break;
            case 10:
                //注意！が出るのでわざと逆に配置
                if(newIdx == 11 || newIdx == 9){
                    return true;
                }
                break;
            case 11:
                //動けないのでfalse
                return false;

        }
        return false;
    }

    //列分け
    public static int colCheck(int idx){
        int ret;
        if(idx==11){
            ret=5;
        }else if(idx==10 || idx==9 || idx==8){
            ret=4;
        }else if(idx==7 || idx==6 || idx==5){
            ret=3;
        }else if(idx==4 || idx==3 || idx==2){
            ret=2;
        }else if(idx==1){
            ret=1;
        }else{
            ret=99;
        }
        return ret;
    }
}
