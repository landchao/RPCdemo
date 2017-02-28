import com.lamfire.hydra.rpc.ProviderConfig;
import com.lamfire.hydra.rpc.RpcServer;
import com.lamfire.hydra.rpc.ServiceRegistryConfig;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 17-2-28
 * Time: 上午1:08
 * To change this template use File | Settings | File Templates.
 */
public class InterfaceServer {

    public static void main(String[] args){
        ServiceRegistryConfig config = new ServiceRegistryConfig();
        config.registerService(RemoteService.class,new RemoteServiceImpl());

        ProviderConfig config1 = new ProviderConfig("interface_01");
        config1.setServiceAddr("127.0.0.1");
        config1.setPort(9998);

        RpcServer server = new RpcServer();
        server.setProviderConfig(config1);
        server.setServiceRegistry(config);
        server.startup();


    }



}
