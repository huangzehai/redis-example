package huangzehai.redis.message;

import redis.clients.jedis.Jedis;

public class SubscribeExample {
    public static void main(String[] args) {
        Jedis jedis = new Jedis("localhost");
        ProductMergingListener listener = new ProductMergingListener();
        jedis.subscribe(listener, "mergeProducts");
    }
}
