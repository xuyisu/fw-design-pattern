import com.yisu.design.pattern.prototype.AdvTemplate;
import com.yisu.design.pattern.prototype.Mail;
import org.junit.Test;

import java.util.Random;

/**
 * @author xuyisu
 * @description 原型模式测试
 * @date 2020/5/14
 */
public class TestPrototype {

    @Test
    public void testProtype() {
        //发送账单的数量，这个值是从数据库中获得
        int MAX_COUNT = 6;
        //模拟发送邮件
        int i = 0;
        //把模板定义出来，这个是从数据中获得
        Mail mail = new Mail(new AdvTemplate());
        mail.setTail("XX银行版权所有");
        while (i < MAX_COUNT) {
        //以下是每封邮件不同的地方
            Mail cloneMail = mail.clone();
            cloneMail.setAppellation(getRandString(5) + " 先生（女士）");
            cloneMail.setReceiver(getRandString(5) + "@" + getRandString(8)+".com"); //然后发送邮件sendMail(cloneMail);
            //然后发送邮件
            sendMail(cloneMail);
            i++;
        }
    }

    //发送邮件
    private static void sendMail(Mail mail) {
        System.out.println("标题：" + mail.getSubject() + "收件人：" + mail.getReceiver() + "发送成功");
    }

    //获得指定长度的随机字符串
    private static String getRandString(int maxLength) {
        String source = "abcdefghijklmnopqrskuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        StringBuffer sb = new StringBuffer();
        Random rand = new Random();
        for (int i = 0; i < maxLength; i++) {
            sb.append(source.charAt(rand.nextInt(source.length())));
        }
        return sb.toString();
    }
}
