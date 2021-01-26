package com.miluo.readlinglist.repository;

import com.miluo.readlinglist.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @className: ReadingListRepository
 * @description:
 * @author: Miluo
 * @date: 2021/1/26
 **/
@Service
public interface ReadingListRepository extends JpaRepository<Book,Long> {
    List<Book> findByReader(String reader);
}
