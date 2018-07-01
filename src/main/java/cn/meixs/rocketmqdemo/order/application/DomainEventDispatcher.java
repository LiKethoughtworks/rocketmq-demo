package cn.meixs.rocketmqdemo.order.application;

import cn.meixs.rocketmqdemo.order.domain.DomainEvent;

import java.util.List;


public interface DomainEventDispatcher {
    void dispatch(List<DomainEvent> events);
}
