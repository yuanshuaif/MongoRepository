package springboot.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import springboot.Entity.Student;
import springboot.Entity.User;

import java.util.List;

/**
 * Created by Administrator on 2019/3/14.
 */
public interface StudentRepository extends MongoRepository<Student, Long> {

    @Query(value="{'userName':?0}",fields="{'passWord':1}")
    List<String> findFieldByName(String userName);

    List<Student> findByUserName(String name);
}
