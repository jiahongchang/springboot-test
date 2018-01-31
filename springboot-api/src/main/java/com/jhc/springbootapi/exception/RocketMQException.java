package com.jhc.springbootapi.exception;

/**
 * Created by ThinkPad on 2018/1/30.
 */
public class RocketMQException extends Exception {
    public RocketMQException(){
        super();
    }

    public RocketMQException(String message){
        super(message);
    }

    public RocketMQException(String message,Throwable cause){
        super(message,cause);
    }

    public RocketMQException(Throwable cause){
        super(cause);
    }

    protected RocketMQException(String message, Throwable cause,
                                boolean enableSuppression,
                                boolean writableStackTrace){
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
