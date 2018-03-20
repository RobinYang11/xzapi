package com.xianzhi.bean;

public class ResponseBean  {

	// http ״̬��
    private int code;

    // ������Ϣ
    private String msg;

    // ���ص�����
    private Object token;

    public ResponseBean(int code, String msg, Object data) {
        this.code = code;
        this.msg = msg;
        this.setToken(data);
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

	public Object getToken() {
		return token;
	}

	public void setToken(Object token) {
		this.token = token;
	}

  

}
