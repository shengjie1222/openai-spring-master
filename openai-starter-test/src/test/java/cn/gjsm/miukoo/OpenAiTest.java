package cn.gjsm.miukoo;

import cn.gjsm.api.openai.OpenAiClient;
import cn.gjsm.api.pojo.completion.CompletionChoice;
import cn.gjsm.miukoo.utils.OpenAiUtils;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.IOException;
import java.util.List;

@SpringBootTest
public class OpenAiTest {

    @Autowired
    OpenAiClient openAiClient;

    /**
     * 测试问答
     */
    @Test
    public void testQA() throws IOException {
//        List<CompletionChoice> questionAnswer = OpenAiUtils.getQuestionAnswer("重庆今天的天气怎么样？");
//        for (CompletionChoice completionChoice : questionAnswer) {
//            System.out.println(completionChoice.getText());
//        }
    }

    /**
     * 测试面试题生成
     */
    @Test
    public void testInterview(){
//        List<CompletionChoice> results = OpenAiUtils.getInterviewQuestion("redis");
//        for (CompletionChoice completionChoice : results) {
//            System.out.println(completionChoice.getText());
//        }
    }

    /**
     * 测试知识学习
     */
    @Test
    public void testStudyNote(){
//        List<CompletionChoice> results = OpenAiUtils.getStudyNote("Java 类是什么？帮举例说明一下");
//        for (CompletionChoice completionChoice : results) {
//            System.out.println(completionChoice.getText());
//        }
    }


}
