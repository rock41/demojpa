package com.mcs.demojpa.post;

import com.mcs.demojpa.MyRepository;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends MyRepository<Post, Long> {
}
