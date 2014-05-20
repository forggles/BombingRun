package com.frogman786.BombingRun;

public class helptopic {
	public static String gethelp(){//TODO actually write a help file (duh!)
		String[] helplist = {"string1\n",
				"String2\n",
				"String3\n",
				"String4\n",
				"String5\n",
				"String6\n",
				"String7\n",
				"String8\n",
				"String9\n",
				"String10\n",
				"String11\n",
				"String12\n",
				"String13\n",};
		String help = helplist.toString();
		help = com.frogman786.froggles.utils.Chat.formatmessage(help);
		return help;
	}
}
