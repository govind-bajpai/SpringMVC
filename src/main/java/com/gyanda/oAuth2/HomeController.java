//package com.gyanda.oAuth2;
//
//import java.text.DateFormat;
//import java.util.ArrayList;
//import java.util.Date;
//import java.util.List;
//import java.util.Locale;
//
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.util.MimeType;
//import org.springframework.validation.annotation.Validated;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.ResponseBody;
//
///**
// * Handles requests for the application home page.
// */
//@Controller
//public class HomeController {
//
//	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
//
//	@Autowired
//	User user;
//	private static boolean flag = true;
//
//	/**
//	 * Simply selects the home view to render by returning its name.
//	 */
//	@RequestMapping(value = "/", method = RequestMethod.GET)
//	public String home(Locale locale, Model model) {
//		logger.info("Welcome home! The client locale is {}.", locale);
//
//		Date date = new Date();
//		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
//
//		String formattedDate = dateFormat.format(date);
//
//		model.addAttribute("serverTime", formattedDate);
//
//		return "home";
//	}
//
//	@RequestMapping(value = "/login", method = RequestMethod.GET)
//	public String loginPage(Locale locale, Model model) {
//		return "login";
//	}
//
//	@RequestMapping(value = "/home", method = RequestMethod.POST)
//	public String login(@Validated User user, Model model) {
//		model.addAttribute("userName", user.getUserName());
//		return "user";
//	}
//
//	@RequestMapping(value = "/getUser", method = RequestMethod.GET)
//	public @ResponseBody List<String> getEmployee() {
//		List<String> list = new ArrayList<String>();
//		list.add("Ram");
//
//		list.add("Shyam");
//		return list;
//	}
//
//	@RequestMapping(value = "/getDussyUser/PUT/RemindMe", method = RequestMethod.POST,produces = "application/json")
//	public @ResponseBody SetProductSubscriptionResponse getDummyUser() {
//		SetProductSubscriptionResponse res = new SetProductSubscriptionResponse();
//		res.setMessageId("message");
//
//		if (flag == true) {
//			WebserviceErrorRO ro = new WebserviceErrorRO();
//			ro.setError(true);
//			ro.setErrorCode(0);
//			ro.setErrorMessage("Error message in Webservice");
//			res.setWebserviceError(ro);
//			flag = false;
//		} else {
//				WebserviceErrorRO ro = new WebserviceErrorRO();
//				ro.setError(true);
//				ro.setErrorCode(502);
//				ro.setErrorMessage("Error message in Webservice");
//				res.setWebserviceError(ro);
//				flag = true;
//		}
//
//		return res;
//	}
//
//}
