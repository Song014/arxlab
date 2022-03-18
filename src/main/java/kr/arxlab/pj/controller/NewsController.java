package kr.arxlab.pj.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/news")
public class NewsController {

	private static final Logger logger = LoggerFactory.getLogger(NewsController.class);
}
