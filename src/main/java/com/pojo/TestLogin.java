package com.pojo;

/**
 * @author liuheng
 * @date 2021/12/11
 */
public class TestLogin {
    private String  account;
    private String  session;
    private String  id;
    private String  name;

    @Override
    public String toString() {
        return "TestLogin{" +
                "account='" + account + '\'' +
                ", session='" + session + '\'' +
                ", id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getSession() {
        return session;
    }

    public void setSession(String session) {
        this.session = session;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TestLogin(String account, String session, String id, String name) {
        this.account = account;
        this.session = session;
        this.id = id;
        this.name = name;
    }

    public TestLogin() {
    }
}
