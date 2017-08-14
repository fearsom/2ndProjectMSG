package com.msg.FridayProjectMSG;

public interface ShowStuff {

	static void showIdandName(String id, String name) {
		SimpleClass.log.info(id + "  " + name);

	}
}
