/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 17-2-28
 * Time: 上午12:50
 * To change this template use File | Settings | File Templates.
 */
public class RemoteServiceImpl implements RemoteService{

    @Override
    public String getPassWord(String password) {
        return "password : "+password;  //To change body of implemented methods use File | Settings | File Templates.
    }
}
