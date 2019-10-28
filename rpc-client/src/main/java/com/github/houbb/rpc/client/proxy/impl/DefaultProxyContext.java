package com.github.houbb.rpc.client.proxy.impl;

import com.github.houbb.rpc.client.constant.enums.CallTypeEnum;
import com.github.houbb.rpc.client.invoke.InvokeService;
import com.github.houbb.rpc.client.proxy.ProxyContext;
import com.github.houbb.rpc.common.rpc.domain.RpcChannelFuture;

import java.util.List;

/**
 * 反射调用上下文
 * @author binbin.hou
 * @since 0.0.6
 */
public class DefaultProxyContext<T> implements ProxyContext<T> {

    /**
     * 服务唯一标识
     * @since 0.0.6
     */
    private String serviceId;

    /**
     * 服务接口
     * @since 0.0.6
     */
    private Class<T> serviceInterface;

    /**
     * channel future 信息
     *
     * @since 0.0.9
     */
    private List<RpcChannelFuture> channelFutures;

    /**
     * channel handler 信息
     *
     * @since 0.0.6
     */
    private InvokeService invokeService;

    /**
     * 超时时间
     * @since 0.0.7
     */
    private long timeout;

    /**
     * 调用方式
     * @since 0.1.0
     */
    private CallTypeEnum callType;

    @Override
    public String serviceId() {
        return serviceId;
    }

    public DefaultProxyContext<T> serviceId(String serviceId) {
        this.serviceId = serviceId;
        return this;
    }

    @Override
    public Class<T> serviceInterface() {
        return serviceInterface;
    }

    public DefaultProxyContext<T> serviceInterface(Class<T> serviceInterface) {
        this.serviceInterface = serviceInterface;
        return this;
    }

    @Override
    public List<RpcChannelFuture> channelFutures() {
        return channelFutures;
    }

    @Override
    public CallTypeEnum callType() {
        return callType;
    }

    public DefaultProxyContext<T> callType(CallTypeEnum callType) {
        this.callType = callType;
        return this;
    }

    public DefaultProxyContext<T> channelFutures(List<RpcChannelFuture> channelFutures) {
        this.channelFutures = channelFutures;
        return this;
    }

    @Override
    public InvokeService invokeService() {
        return invokeService;
    }

    public DefaultProxyContext<T> invokeService(InvokeService invokeService) {
        this.invokeService = invokeService;
        return this;
    }

    @Override
    public long timeout() {
        return timeout;
    }

    public DefaultProxyContext<T> timeout(long timeout) {
        this.timeout = timeout;
        return this;
    }
}
