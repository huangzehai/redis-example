package huangzehai.redis.message;

import redis.clients.jedis.JedisPubSub;

class ProductMergingListener extends JedisPubSub {
    public void onMessage(String channel, String message) {
        System.out.println("get message:" + message);
    }

    public void onSubscribe(String channel, int subscribedChannels) {
    }

    public void onUnsubscribe(String channel, int subscribedChannels) {
    }

    public void onPSubscribe(String pattern, int subscribedChannels) {
    }

    public void onPUnsubscribe(String pattern, int subscribedChannels) {
    }

    public void onPMessage(String pattern, String channel, String message) {
    }
}