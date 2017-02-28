import com.lamfire.hydra.rpc.HydraRPC;
import com.lamfire.hydra.rpc.ProviderConfig;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 17-2-28
 * Time: 上午1:24
 * To change this template use File | Settings | File Templates.
 */
public class RPCManagerFactory {

    static HydraRPC rpc = null;

    public  static HydraRPC getRpc(){
        if(rpc != null){
            return rpc;
        }

        ProviderConfig provider = new ProviderConfig("interface_01");
        provider.setServiceAddr("127.0.0.1");
        provider.setPort(9998);

        rpc = new HydraRPC();
        rpc.addProvider(provider);
        return rpc;

    }

}
