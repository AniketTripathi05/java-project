package com.aniket.joblisting;
import com.aniket.joblisting.models.Post;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PostRepository extends MongoRepository<Post,String> {




}
