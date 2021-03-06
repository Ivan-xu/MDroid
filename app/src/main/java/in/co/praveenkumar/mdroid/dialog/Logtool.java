package in.co.praveenkumar.mdroid.dialog;

import android.util.Log;

/**
 * Created by Administrator on 2016/1/9.
 */
public class Logtool {
    public static final int VERBOSE =1;

    public static final int DEBUG =2;

    public static final int INFO =3;

    public static final int WARN =4;

    public static final int ERROR =5;

    public static final int NONE =6;

    public static final int LEVEL = VERBOSE;



    public static void v (String tag , String  msg){
        if (LEVEL <=VERBOSE ){
            Log.v(tag, msg);

        }
    }

    public static void d (String tag , String  msg){
        if (LEVEL <=DEBUG ){
            Log.d(tag, msg);

        }
    }

    public static void i (String tag , String  msg){
        if (LEVEL <=INFO ){
            Log.i(tag, msg);

        }
    }
    public static void i (String tag,String msg1,int msg2){
        if (LEVEL <=INFO ){
            String msg = msg1+String.valueOf(msg2);
            Log.i(tag,msg);

        }
    }
    public static void i (String msg1,int msg2){
        if (LEVEL <=INFO ){
            String msg = msg1+" = "+String.valueOf(msg2);
            Log.i("Track",msg);

        }
    }
    public static void i (String msg1,Long msg2){
        if (LEVEL <=INFO ){
            String msg = msg1+" = "+String.valueOf(msg2);
            Log.i("Track",msg);

        }
    }
    public static void i ( String  msg){
        if (LEVEL <=INFO ){
            String tag = "Track";
            Log.i(tag, msg);

        }
    }


    public static void w (String tag , String  msg){
        if (LEVEL <=WARN ){
            Log.w(tag, msg);

        }
    }

    public static void e (String tag , String  msg){
        if (LEVEL <=ERROR ){
            Log.e(tag, msg);

        }
    }


}

