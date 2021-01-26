package com.miluo.readlinglist.controller;

import com.miluo.readlinglist.repository.ReadingListRepository;
import com.miluo.readlinglist.entity.Book;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

/**
 * @className: ReadingListController
 * @description:
 * @author: Miluo
 * @date: 2021/1/26
 **/
@Controller
@RequestMapping("/")
public class ReadingListController {
    @Resource
    private ReadingListRepository readingListRepository;

    @GetMapping(value = "/{reader}")
    //pathVariable说明参数String reader和路径中的{reader}相映射
    public String readersBooks(@PathVariable("reader") String reader, Model model){
        List<Book> readingList = readingListRepository.findByReader(reader);
        if (readingList != null){
            model.addAttribute("books",readingList);
        }
        return "readingList";
    }

    @PostMapping(value = "/{reader}")
    public String addToReadingList(@PathVariable("reader") String reader,Book book){
        book.setReader(reader);
        readingListRepository.save(book);
        return "redirect:/{reader}";
    }


}
