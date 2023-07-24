package com.callor.book.controller;

import java.util.List;
import java.util.Locale;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.callor.book.models.BooksDto;
import com.callor.book.models.UserDto;
import com.callor.book.services.BooksService;
import com.callor.book.services.UserService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class HomeController {
	
	protected final BooksService booksService;
//	protected final UserService userService;
	public HomeController(BooksService booksService)
//			UserService userService) 
	{
		this.booksService = booksService;
//		this.userService = userService;

	}

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		
		return "home";
	}
	
	@RequestMapping(value="/books",method=RequestMethod.GET)
	public String books(Locale locale, Model model) {
		List<BooksDto> bookList = booksService.selectAll();
		model.addAttribute("BOOK_LIST",bookList);
		return "books";
	}
	
	@RequestMapping(value="/insert",method=RequestMethod.GET)
	public String Bookinsert(BooksDto booksDto) {
		
		return "book/input";
	}
	
	
	@RequestMapping(value="/insert",method=RequestMethod.POST)
	public String Bookinsert(Model model ,BooksDto booksDto) {
		int result = booksService.insert(booksDto);
		return "redirect:/books";
	}
	
	@RequestMapping(value="/details",method=RequestMethod.GET)
	public String detail(String code, Model model) {
		BooksDto booksDto = booksService.findByCode(code);
		model.addAttribute("BOOK", booksDto);
		return "book/details";
	}
	
	@RequestMapping(value="/update",method=RequestMethod.GET)
	public String update(String code, Model model) {
		BooksDto booksDto = booksService.findByCode(code);
		model.addAttribute("BOOK", booksDto);
		return "book/update";
	}
	
	@RequestMapping(value="/update",method=RequestMethod.POST)
	public String update(BooksDto dto) {
		int result = booksService.update(dto);
		return "redirect:/books";
	}
	
	
//	@RequestMapping(value="/users",method=RequestMethod.GET)
//	public String users(Locale locale, Model model) {
//		List<UserDto> userList = userService.selectAll();
//		model.addAttribute("USER_LIST",userList);
//		return "users";
//	}
	
}
