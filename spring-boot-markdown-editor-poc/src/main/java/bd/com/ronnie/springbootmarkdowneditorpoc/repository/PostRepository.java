package bd.com.ronnie.springbootmarkdowneditorpoc.repository;

import bd.com.ronnie.springbootmarkdowneditorpoc.entity.Post;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends CrudRepository<Post, Long> {

}
