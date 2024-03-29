package cn.xinxing.json.responseUtils;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import cn.xinxing.json.utils.JackJsonUtils;


public class ResponseUtils {
	

	public static void renderText(HttpServletResponse response, String text) {
		render(response, "text/plain;charset=UTF-8", text);
	}
	
	public static void renderJson(HttpServletResponse response, String text) {
		// System.out.print(text);
		render(response, "text/plain;charset=UTF-8", text);
	}
	

	public static void render(HttpServletResponse response, String contentType, String text) {
		response.setContentType(contentType);
		response.setCharacterEncoding("utf-8");
		response.setHeader("Pragma", "No-cache");
		response.setHeader("Cache-Control", "no-cache");
		response.setDateHeader("Expires", 0);
		try {
			response.getWriter().write(text);
		} catch (IOException e) {
		}
	}
	
	public static void outputJson(HttpServletResponse response, Object obj) {
		String s = JackJsonUtils.toJson(obj);
		response.setContentType("text/plain;charset=UTF-8");
		response.setHeader("Pragma", "No-cache");
		response.setHeader("Cache-Control", "no-cache");
		response.setDateHeader("Expires", 0);
		try {
			response.getWriter().write(s);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
