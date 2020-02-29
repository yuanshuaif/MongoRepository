package springboot;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import springboot.Entity.Student;
import springboot.Entity.User;
import springboot.Repository.StudentRepository;
import springboot.Repository.UserRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MongodbApplicationTests {

	@Autowired
	private UserRepository userRepository;
	@Autowired
	private StudentRepository studentRepository;
	@Test
	public void contextLoads() {
	}

	/**
	 * 默认方法保存
	 */
	@Test
	public void inset() {
		User user = new User();
		user.setId(4l);
		user.setUserName("ltj");
		user.setPassWord("123123");
		userRepository.insert(user);
	}

	/**
	 * 按照属性查询
	 */
	@Test
	public void findByName() {
		System.out.println(userRepository.findByUserName("ltj"));
	}
	/**
	 * @Query 自定义查询
	 */
	@Test
	public void findFieldByName() {
		System.out.println(userRepository.findFieldByName("lsj"));
	}

	@Test
	public void insetStudent() {
		Student student = new Student();
		student.setId(5l);
		student.setUserName("ltj");
		student.setPassWord("123123");
		studentRepository.insert(student);
	}

	/**
	 * 按照属性查询
	 */
	@Test
	public void findByNameStudent() {
		System.out.println(studentRepository.findByUserName("lsj"));
	}

}
