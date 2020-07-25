package guru.springframework.joke.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import guru.springframework.joke.services.JokeService;

@Controller
public class JokeController {

	private JokeService jokeService;

	@Autowired
	public JokeController(JokeService jokeService) {
		this.jokeService = jokeService;
	}

	@RequestMapping("/")
	public ModelAndView showJoke() {
		ModelAndView mav = new ModelAndView("chucknorris");
		mav.addObject("joke", jokeService.getJoke());
		return mav;

	}

}
