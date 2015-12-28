package model;

import java.sql.Date;

public class forInterface {

}

interface Login{
	boolean check();
	boolean empower();
}

interface Register{
	boolean check();
	boolean set();
}

abstract class Messages{
	int mid;
	Date time;
	String content;
	abstract public void show();
	abstract public void get();
}

abstract class Users{
	int uid;
	String password;
	abstract public void login();
	abstract public void register();
}