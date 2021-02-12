package com.kevin.learnspringboot;

import com.kevin.learnspringboot.entity.Student;
import com.kevin.learnspringboot.utils.PdfUtil;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


/**
 * @ClassName PdfTest
 * @Description PdfTest
 * @Author Kevin
 * @Date 2021/2/12 8:15 上午
 * @Version 1.0
 **/
@SpringBootTest
public class PdfTest {
    @Test
    public void test() {
        List<Student> list = new ArrayList();
        for (int i = 0; i <= 5; i++) {
            Student student = new Student();
            student.setGender("男");
            student.setName("张三");
            student.setPhone("1320818027" + i);
            student.setStudentId("20153106059" + i);
            student.setMath("9" + i);
            student.setEnglish("8" + i);
            list.add(student);
        }
        String title = "成绩单";
        //这里需要保持标题数组的顺序和Student中定义的顺序一致
        String[] columnHeaders = {"姓名", "性别", "电话", "学号", "数学", "英语"};
        try {
            //生成PDF文件，不带水印
            PdfUtil.generatePdfFile(list, "/Users/kevin/Desktop/testpdf/student.pdf", title, columnHeaders);
            //给刚才生成的PDF文件加水印（时间+用户）
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String date = sdf.format(new Date());
            PdfUtil.waterMark("/Users/kevin/Desktop/testpdf/student.pdf", "/Users/kevin/Desktop/testpdf/studentwater.pdf", date, "debruyne");
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
