package com.mall.model;

public class Result {
    private boolean result=true;//true代表成功false代表失败
    private String message;//返回的提示信息
    private String url;//返回跳转的链接(如果有)
    
    public Result(String message){
        this.message=message;
    }
    
    public boolean getResult() {
        return result;
    }
    public void setResult(boolean result) {
        this.result = result;
    }
    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }
    public String getUrl() {
        return url;
    }
    public void setUrl(String url) {
        this.url = url;
    }
    
}
