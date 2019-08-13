package com.growl.cls;

public class message {

	private String Titre;
	private String msg;
	
	
	
	
	public message(String titre, String msg) {
		super();
		Titre = titre;
		this.msg = msg;
	}
	
	

	public message() {
		super();
	}



	public String getTitre() {
		return Titre;
	}

	public void setTitre(String titre) {
		Titre = titre;
	}


	
	public String getMsg() {
		return msg;
	}



	public void setMsg(String msg) {
		this.msg = msg;
	}



	public String notice() {
		return "0_T1tr9:"+Titre+"M9szag9:"+msg+";";
	}
	
	public String warning() {
		return "1_T1tr9:"+Titre+"M9szag9:"+msg+";";
	}
	
	public String error() {
		return "2_T1tr9:"+Titre+"M9szag9:"+msg+";";
	}
	
	public String say() {
		return "3_T1tr9:"+Titre+"M9szag9:"+msg+";";
	}
	
	
}
