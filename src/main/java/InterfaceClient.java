/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 17-2-28
 * Time: 上午1:48
 * To change this template use File | Settings | File Templates.
 */
public class InterfaceClient {

    public static void main(String[] args){
        RemoteService inter = RPCManagerFactory.getRpc().lookup(RemoteService.class);
        String password = inter.getPassWord("admin");
        System.out.println(password);


    }
}
