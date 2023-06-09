package com.myspring.pro27;

import java.net.URLEncoder;
import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;//
//SLF4J(Simple Logging Facade for Java)는 단순한 퍼사드 패턴을 수단으로 하는 자바 로깅 API를 제공한다. 
//퍼사드(facade) 패턴(외관 패턴)은 소프트웨어 공학 디자인 패턴 중 하나이다. 객체 지향 프로그래밍 분야에서 자주 쓰인다. Facade (외관)는 "건물의 정면"을 의미한다.
//퍼사드는 클래스 라이브러리 같은 어떤 소프트웨어의 다른 커다란 코드 부분에 대한 간략화된 인터페이스를 제공하는 객체이다.
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		//locale은 ko_KR
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		System.out.println(formattedDate);		
	
		model.addAttribute("serverTime", formattedDate );
		
		return "home";
	}
	
}
