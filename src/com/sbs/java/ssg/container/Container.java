package com.sbs.java.ssg.container;

import com.sbs.java.ssg.dao.ArticleDao;
import com.sbs.java.ssg.dao.MemberDao;
import com.sbs.java.ssg.service.ArticleService;
import com.sbs.java.ssg.service.ExportService;
import com.sbs.java.ssg.service.MemberService;

public class Container {
	public static ArticleDao articleDao;
	public static MemberDao memberDao;
	public static ArticleService articleService;
	public static MemberService memberService;
	public static ExportService exportService;
	
	static {
		articleDao = new ArticleDao();
		memberDao = new MemberDao();
		articleService = new ArticleService();
		memberService = new MemberService();
		exportService = new ExportService();
	}

}
