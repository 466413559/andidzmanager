import com.andidz.authorithy.domain.User;
import com.andidz.authorithy.mapper.UserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
public class DisplayTest {
    @Autowired
    private UserMapper userMapper;

    @Test
    public void userTest(){
        User user1 = new User();
        user1.setUsername("test5");
        user1.setPassword("123456");
        user1.setUsernick("测试账号5");
        userMapper.insert(user1);
    }
}
