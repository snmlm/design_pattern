import com.snmlm.dynamic_proxy.*;

/**
 * @author: snmlm
 * @create: 2021-05-08
 */
//客户
public class Dynamic_proxyText {
    public static void main(String[] args) {
        ((AbstractHouseOwner)new ProxyInvocationHandler(new HouseOwner(),new ProxyExpandImpl()).getProxy()).rent();
        ((HouseOwner)new ProxyMethodInterceptor(new HouseOwner(),new ProxyExpandImpl()).getProxy()).rent();
    }
}
