package com.sdh.ex;

public class MemberDTO {

    private String id;
    private String pw;
    private String name;
    private String phone;

    //인텔리제이는 alt + ins로 getter,setter 및 생성자 자동생성 가능
    //생성시 전체 생성할 경우 전체 항목 SHIFT로 선택하여 생성



    public MemberDTO(String id, String pw, String name, String phone) {
        this.id = id;
        this.pw = pw;
        this.name = name;
        this.phone = phone;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPw() {
        return pw;
    }

    public void setPw(String pw) {
        this.pw = pw;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
