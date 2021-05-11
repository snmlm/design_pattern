import com.snmlm.static_proxy.HouseOwner;
import com.snmlm.static_proxy.Proxy;

/**
 * @author: snmlm
 * @create: 2021-05-08
 */
//客户
public class Static_proxyTest {
    public static void main(String[] args) {
        Proxy proxy = new Proxy(new HouseOwner());
        proxy.rent();
    }
}
