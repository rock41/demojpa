package com.mcs.demojpa.post;

import com.mcs.demojpa.MyRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;

public interface PostRepository extends MyRepository<Post, Long>, QuerydslPredicateExecutor<Post> {
}
