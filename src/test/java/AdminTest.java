import com.koom.dao.IAdminDao;
import com.koom.entity.Admin;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @ClassName AdminTest
 * @Description TODO
 * @Author 0Glass
 * @Date 2020/04/30 15:00
 * @Version 1.0
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:applicationContext.xml", "classpath:springmvc-config.xml",
        "classpath:mybatis-config.xml"})
@WebAppConfiguration("src/main/resources")
@Transactional
@Rollback(true)
public class AdminTest {

    @Autowired
    private IAdminDao adminDao;

    @Test
    public void findAll(){
        List<Admin> admins = adminDao.findAll();
        System.out.println(admins);

    }
}
