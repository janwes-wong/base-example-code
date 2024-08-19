package com;

import javax.swing.text.html.HTMLEditorKit;
import javax.swing.text.html.parser.ParserDelegator;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

/**
 * @author Janwes
 * @version 1.0.0
 * @package com
 * @date 2023/8/7 18:14
 * @description html、富文本转换为文本
 */
public class Html2Text extends HTMLEditorKit.ParserCallback {
    private static final Html2Text html2Text = new Html2Text();

    ThreadLocal<StringBuffer> sb = new ThreadLocal<>();

    private Html2Text() {
    }

    public static String getContent(String str) {
        try {
            html2Text.parse(str);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return html2Text.getText();
    }

    /**
     * 解析富文本
     *
     * @param str
     * @throws IOException
     */
    private void parse(String str) throws IOException {
        try (Reader in = new InputStreamReader(new ByteArrayInputStream(str.getBytes()))) {
            sb.set(new StringBuffer());
            ParserDelegator delegator = new ParserDelegator();
            delegator.parse(in, this, Boolean.TRUE); // the third parameter is TRUE to ignore charset directive
        }
    }

    /**
     * 处理文本
     *
     * @param text
     * @param pos
     */
    @Override
    public void handleText(char[] text, int pos) {
        sb.get().append(text);
    }

    /**
     * 获取文本
     *
     * @return
     */
    private String getText() {
        return sb.get().toString();
    }

    public static void main(String[] args) {
        String htmlStr = "<p>未达进度原因：\n" +
                "公园总规仍待市规自局批复，桥梁、建筑、乔木迁移等工作不能开展\n" +
                "需落实事项： 1.<span style=font-size: 0.26rem; text-indent: 2em; letter-spacing: 0px;>请审批专班专题调度推动解决。2</span><span style=font-size: 0.26rem; letter-spacing: 0px;>.请规自局福田局协调市局尽快指导建工署完善方案，协调市规自尽快批复总规。 3.请区城管局提前介入，指导区建工署完善乔木迁移方案，争取与总规批复并行。</span></p>";
        System.out.println(getContent(htmlStr));
    }
}
