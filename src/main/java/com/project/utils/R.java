package com.project.utils;

/**
 * Description
 *
 * @Author：阿牛
 * @Date：Created in 2023/9/13 16:31
 */
public class R {
    private int code = 200; //200代表成功
    private boolean flag = true; //返回状态
    private Object data; //返回具体数据

    public static R ok(Object data){
        R r = new R();
        r.data =data;
        return r;
    }
    public static R fail(Object data){
        R r = new R();
        r.code=500; //错误码
        r.flag=false;   //错误状态
        r.data=data;
        return r;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
