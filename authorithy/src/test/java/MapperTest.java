
import com.andidz.authorithy.domain.User;
import com.andidz.authorithy.mapper.UserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

//@SpringBootTest(classes = Application.class)
@RunWith(SpringRunner.class)
public class MapperTest {
    @Autowired
    private UserMapper userMapper;

    @Test
    public void userTest(){
        User user1 = new User();
        user1.setUsername("test1");
        user1.setPassword("123456");
        user1.setUsernick("测试账号1");
        userMapper.insert(user1);
    }
}
