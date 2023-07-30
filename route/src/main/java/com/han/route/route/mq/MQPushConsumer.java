package com.han.route.route.mq;

import org.apache.rocketmq.client.consumer.DefaultMQPushConsumer;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @Author: Wuj
 * @Description: 消息发送
 * @DateTime: 2023/7/28 21:38
 **/
@Component
public class MQPushConsumer {

  public List<DefaultMQPushConsumer>     defaultMQPushConsumerList;


}
