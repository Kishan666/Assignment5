import com.Student.ProxyStudent;
import com.Student.Student;
import com.Student.Undergrad;
import org.junit.Before;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by Kishan on 2017-04-03.
 */
public class ProxyTest {

    private ProxyStudent student;
    @Before
    public void setup() {

    }

    @Test
    public void testStudentAttendance() throws Exception {
        Student absentStudent = new Undergrad("James");
        student = new ProxyStudent(absentStudent);
        student.signAttendance();


        Assert.assertEquals(absentStudent.getName(), student.getName());
    }




}
