package com.yzx.springwebsocket.util;


import java.io.StringReader;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;

public class WeiXinUtils {
    
    
    /**
     * @Description: 解密消息 aes 微信
     * @Param:
     * @return:
     * @Author: mastermind
     * @Date: 2020-07-01 19:15
     */
    public String jiemi(String str,String tostr){
        String xml = "<xml>\n" +
                "<Encrypt><![CDATA[tOZveQBpG7rIkvyeHwnHI7csRxlTAZwFlx7hXtQzo/y0Gg3IwYpY0UA9LNQ4RgQhShvTppWPM7xd/InJt3q2dBvYaXUA6IuVsIkJA1+IoxfyjCaHn3albXFvkOJGGQr6h5bdwlCNZBLOcpZRPAn+88MIEy3YNYnG/atWKeaGoJL2I85NfcAU4MBKX0dp7Da+LMQCe5l6ZR3kvmYYscswn6QpEPKPXy4ZGM4A4L/D8jV28du6sRgUUuEByPSfDQSqHdt1aN81+xQLAQ1wqW8JYwxlR4pztWyv7+fB4rbKaEGXMl1tjzf1afZ2SFxqcaiWGwrTLE2rBA9m6EgjVjzeJzkG0Fy3doQhdxWlli4UpXVcBsZIL/Cow89Uw9R64ZqKs+DbyvWGlxY/4kUtFwlpmPH0ceREdETwZ7rZK/YOsnW0Bl1UE4sTgwbKd58MucoZ+tVihxuczIzkB3/DVTSpSw==]]></Encrypt>\n" +
                "<MsgSignature><![CDATA[fd4f5349c9705537157384643766d2ac85f13e58]]></MsgSignature>\n" +
                "<TimeStamp>1593601187</TimeStamp>\n" +
                "<Nonce><![CDATA[601419579]]></Nonce>\n" +
                "</xml>";


        return null;
    }
    
    
    

    public static void main(String[] args) {


        try {
////            // 需要加密的明文
//            String encodingAesKey = "Yu6ohLOdyCqL3rvWHMgiD7AbhT59LemybWnrlz5Rube";
//            String token = "ecinxcloud";
//            String timestamp = "1593601187";
//            String nonce = "601419579";
//            String appId = "wx386a63cab44bff7f";
//            String replyMsg = "<xml><ToUserName><![CDATA[oia2TjjewbmiOUlr6X-1crbLOvLw]]></ToUserName><FromUserName><![CDATA[gh_7f083739789a]]></FromUserName><CreateTime>1407743423</CreateTime><MsgType><![CDATA[video]]></MsgType><Video><MediaId><![CDATA[eYJ1MbwPRJtOvIEabaxHs7TX2D-HV71s79GUxqdUkjm6Gs2Ed1KF3ulAOA9H1xG0]]></MediaId><Title><![CDATA[testCallBackReplyVideo]]></Title><Description><![CDATA[testCallBackReplyVideo]]></Description></Video></xml>";
////
//            WXBizMsgCrypt pc = new WXBizMsgCrypt(token, encodingAesKey, appId);
//            String mingwen = pc.encryptMsg(replyMsg, timestamp, nonce);
//            System.out.println("加密后: " + mingwen);
//
//
//            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
//            DocumentBuilder db = dbf.newDocumentBuilder();
//            StringReader sr = new StringReader(mingwen);
//            InputSource is = new InputSource(sr);
//            Document document = db.parse(is);
//
//            Element root = document.getDocumentElement();
//            NodeList nodelist1 = root.getElementsByTagName("Encrypt");
//            NodeList nodelist2 = root.getElementsByTagName("MsgSignature");
//
//            String encrypt = nodelist1.item(0).getTextContent();
//            String msgSignature = nodelist2.item(0).getTextContent();
//
//            String format = "<xml><ToUserName><![CDATA[toUser]]></ToUserName><Encrypt><![CDATA[%1$s]]></Encrypt></xml>";
//            String fromXML = String.format(format, encrypt);
//
//            //
//            // 公众平台发送消息给第三方，第三方处理
//            //
//
//            // 第三方收到公众号平台发送的消息
//            String result2 = pc.decryptMsg(msgSignature, timestamp, nonce, fromXML);
//            System.out.println("解密后明文: " + result2);


            // 需要加密的明文
            String encodingAesKey = "Yu6ohLOdyCqL3rvWHMgiD7AbhT59LemybWnrlz5Rube";
            String token = "ecinxcloud";
            String timestamp = "1593608761";
            String nonce = "2045330914";
            String appId = "wx386a63cab44bff7f";

            String mingwen = " <xml>\n" +
                    "    <Encrypt><![CDATA[UbwY8B4VXlLHFlhTbwtooXl32ElgqrIhxFJmQ7kfDOyOKiTU/NgjrsGy09d01XurWUJtmrQr3prEsoC71gN+ytLjSzJXpTQ7NM/1mxqan0god/G96iJ69I0qFH/fqz1q9hZOzLIO5B71k9biLF2Vd8LdRxemp9PKbDZNsCivFltXu2jMwJLS9Rqcaxcj1S7td9dxppUxymYjAa1D3kXU0kx/huYgTUMNuYYrhsuD/Yc5ru0flRPgvAIOeAkhVcw+pVDhSx0xDli4EbP6PouCPp8IJ+knk+SR0EeiBBJXv8dYugaqHOC4mskHrjGaxrXpBiGSbsd/9umvhksfjRc1ccHOd4Jt9cIlnoSDFXBjxTa8m7SCiObbOG2RS8GU7kHl8/m5IgY5mZYCE23DcNCnwoZiHHhMC2wNolHyEF4knHVn8iYx3AAl00W/ZIHMFHTrAIzBMHhVofDgqpOPGa2KLPLicoFTnqNOlKPO7LqL4g22aaGxBzkb1JyrRPmRXncVr7uWRDxQPf7X3EMb/mDKj7w2jZmnbRj5QNVtYaw8hanyB4F57VHwW+Pr4uH2ChRn8/X0tl7n3V1/OHJe/5Ee3dxNocq4FDhsKXbzMw8kTwJbvMg4+PS3LLyeM/BNoCUCkyKejCJua4D7bZuW5KFbTljdBqkHpqQ/U/bXwqn2PgDOn8Tf3W4R+yFPGZBYWu9Ru7VMW6+4G9uVtJFw89alJ7gWN04Rq+IMs8pX2y8G+tFbp9Hod+XbtCN4ZDlStt46aSflwHA+ui5EVNjfILcyb2I9GcG4t4KYgovAIPhxysQ=]]></Encrypt>\n" +
                    "<MsgSignature><![CDATA[4dda2e767d7e1d9757a385fd539bf66f458fd1e4]]></MsgSignature>\n" +
                    "<TimeStamp>1593608761</TimeStamp>\n" +
                    "<Nonce><![CDATA[2045330914]]></Nonce>\n" +
                    "</xml>";

            WXBizMsgCrypt pc = new WXBizMsgCrypt(token, encodingAesKey, appId);


            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            StringReader sr = new StringReader(mingwen);
            InputSource is = new InputSource(sr);
            Document document = db.parse(is);

            Element root = document.getDocumentElement();
            NodeList nodelist1 = root.getElementsByTagName("Encrypt");
            NodeList nodelist2 = root.getElementsByTagName("MsgSignature");

            String encrypt = nodelist1.item(0).getTextContent();
            String msgSignature = nodelist2.item(0).getTextContent();

            String format = "<xml><ToUserName><![CDATA[toUser]]></ToUserName><Encrypt><![CDATA[%1$s]]></Encrypt></xml>";
            String fromXML = String.format(format, encrypt);

            //
            // 公众平台发送消息给第三方，第三方处理
            //

            // 第三方收到公众号平台发送的消息
            String result2 = pc.decryptMsg(msgSignature, timestamp, nonce, fromXML);
            System.out.println("解密后明文: " + result2);
//

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
