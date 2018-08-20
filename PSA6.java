/* Filename: PSA6.java
 * Created by:  Zinuo Xie, cs8afbfa and Jiaqi Fan, cs8afbct
 * Due Date:    11/10/2015
 *
 * Date:
 * Description: This class is designed to... */
public class PSA6 extends Picture
{ 
//The line below is magic, you don't have to understand it (yet)
    public static void main (String[] args) 
    { 
 
      String contextPic = FileChooser.pickAFile();
      Picture context = new Picture(contextPic);
      context.show();
      String messagePic = FileChooser.pickAFile();
      Picture message = new Picture(messagePic);
      message.show();
      Picture myPicWithMessage = hideSecretMessage2Bits( context, message);
      myPicWithMessage.show();
      
      Picture myPicWithMessageN = hideSecretMessageNBits( context, message, 2);
      myPicWithMessageN.show();
      
      Picture myRecoverPic = recoverSecretMessage2Bits(myPicWithMessage);
      myRecoverPic.show();
      
      Picture myRecoverPic2 = recoverSecretMessageNBits(myPicWithMessageN, 2);
      myRecoverPic2.show();
      
      Picture contextWithMsg = Picture.hideSecretMessage2Bits(context, message);
      contextWithMsg.write(System.getProperty("user.home")+"/my_picture_with_hidden_msg.bmp");
      
      Picture msg = Picture.recoverSecretMessage2Bits(myPicWithMessage);
      msg.write(System.getProperty("user.home")+"/my_hidden_msg.bmp");
      
    } 
}
