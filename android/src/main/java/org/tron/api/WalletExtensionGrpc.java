package org.tron.api;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.12.0)",
    comments = "Source: api/api.proto")
public final class WalletExtensionGrpc {

  private WalletExtensionGrpc() {}

  public static final String SERVICE_NAME = "protocol.WalletExtension";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getGetTransactionsFromThisMethod()} instead. 
  public static final io.grpc.MethodDescriptor<org.tron.api.GrpcAPI.AccountPaginated,
      org.tron.api.GrpcAPI.TransactionList> METHOD_GET_TRANSACTIONS_FROM_THIS = getGetTransactionsFromThisMethodHelper();

  private static volatile io.grpc.MethodDescriptor<org.tron.api.GrpcAPI.AccountPaginated,
      org.tron.api.GrpcAPI.TransactionList> getGetTransactionsFromThisMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<org.tron.api.GrpcAPI.AccountPaginated,
      org.tron.api.GrpcAPI.TransactionList> getGetTransactionsFromThisMethod() {
    return getGetTransactionsFromThisMethodHelper();
  }

  private static io.grpc.MethodDescriptor<org.tron.api.GrpcAPI.AccountPaginated,
      org.tron.api.GrpcAPI.TransactionList> getGetTransactionsFromThisMethodHelper() {
    io.grpc.MethodDescriptor<org.tron.api.GrpcAPI.AccountPaginated, org.tron.api.GrpcAPI.TransactionList> getGetTransactionsFromThisMethod;
    if ((getGetTransactionsFromThisMethod = WalletExtensionGrpc.getGetTransactionsFromThisMethod) == null) {
      synchronized (WalletExtensionGrpc.class) {
        if ((getGetTransactionsFromThisMethod = WalletExtensionGrpc.getGetTransactionsFromThisMethod) == null) {
          WalletExtensionGrpc.getGetTransactionsFromThisMethod = getGetTransactionsFromThisMethod = 
              io.grpc.MethodDescriptor.<org.tron.api.GrpcAPI.AccountPaginated, org.tron.api.GrpcAPI.TransactionList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "protocol.WalletExtension", "GetTransactionsFromThis"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.api.GrpcAPI.AccountPaginated.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.api.GrpcAPI.TransactionList.getDefaultInstance()))
                  .setSchemaDescriptor(new WalletExtensionMethodDescriptorSupplier("GetTransactionsFromThis"))
                  .build();
          }
        }
     }
     return getGetTransactionsFromThisMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getGetTransactionsToThisMethod()} instead. 
  public static final io.grpc.MethodDescriptor<org.tron.api.GrpcAPI.AccountPaginated,
      org.tron.api.GrpcAPI.TransactionList> METHOD_GET_TRANSACTIONS_TO_THIS = getGetTransactionsToThisMethodHelper();

  private static volatile io.grpc.MethodDescriptor<org.tron.api.GrpcAPI.AccountPaginated,
      org.tron.api.GrpcAPI.TransactionList> getGetTransactionsToThisMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<org.tron.api.GrpcAPI.AccountPaginated,
      org.tron.api.GrpcAPI.TransactionList> getGetTransactionsToThisMethod() {
    return getGetTransactionsToThisMethodHelper();
  }

  private static io.grpc.MethodDescriptor<org.tron.api.GrpcAPI.AccountPaginated,
      org.tron.api.GrpcAPI.TransactionList> getGetTransactionsToThisMethodHelper() {
    io.grpc.MethodDescriptor<org.tron.api.GrpcAPI.AccountPaginated, org.tron.api.GrpcAPI.TransactionList> getGetTransactionsToThisMethod;
    if ((getGetTransactionsToThisMethod = WalletExtensionGrpc.getGetTransactionsToThisMethod) == null) {
      synchronized (WalletExtensionGrpc.class) {
        if ((getGetTransactionsToThisMethod = WalletExtensionGrpc.getGetTransactionsToThisMethod) == null) {
          WalletExtensionGrpc.getGetTransactionsToThisMethod = getGetTransactionsToThisMethod = 
              io.grpc.MethodDescriptor.<org.tron.api.GrpcAPI.AccountPaginated, org.tron.api.GrpcAPI.TransactionList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "protocol.WalletExtension", "GetTransactionsToThis"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.api.GrpcAPI.AccountPaginated.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.api.GrpcAPI.TransactionList.getDefaultInstance()))
                  .setSchemaDescriptor(new WalletExtensionMethodDescriptorSupplier("GetTransactionsToThis"))
                  .build();
          }
        }
     }
     return getGetTransactionsToThisMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static WalletExtensionStub newStub(io.grpc.Channel channel) {
    return new WalletExtensionStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static WalletExtensionBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new WalletExtensionBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static WalletExtensionFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new WalletExtensionFutureStub(channel);
  }

  /**
   */
  public static abstract class WalletExtensionImplBase implements io.grpc.BindableService {

    /**
     */
    public void getTransactionsFromThis(org.tron.api.GrpcAPI.AccountPaginated request,
        io.grpc.stub.StreamObserver<org.tron.api.GrpcAPI.TransactionList> responseObserver) {
      asyncUnimplementedUnaryCall(getGetTransactionsFromThisMethodHelper(), responseObserver);
    }

    /**
     */
    public void getTransactionsToThis(org.tron.api.GrpcAPI.AccountPaginated request,
        io.grpc.stub.StreamObserver<org.tron.api.GrpcAPI.TransactionList> responseObserver) {
      asyncUnimplementedUnaryCall(getGetTransactionsToThisMethodHelper(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetTransactionsFromThisMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                org.tron.api.GrpcAPI.AccountPaginated,
                org.tron.api.GrpcAPI.TransactionList>(
                  this, METHODID_GET_TRANSACTIONS_FROM_THIS)))
          .addMethod(
            getGetTransactionsToThisMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                org.tron.api.GrpcAPI.AccountPaginated,
                org.tron.api.GrpcAPI.TransactionList>(
                  this, METHODID_GET_TRANSACTIONS_TO_THIS)))
          .build();
    }
  }

  /**
   */
  public static final class WalletExtensionStub extends io.grpc.stub.AbstractStub<WalletExtensionStub> {
    private WalletExtensionStub(io.grpc.Channel channel) {
      super(channel);
    }

    private WalletExtensionStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected WalletExtensionStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new WalletExtensionStub(channel, callOptions);
    }

    /**
     */
    public void getTransactionsFromThis(org.tron.api.GrpcAPI.AccountPaginated request,
        io.grpc.stub.StreamObserver<org.tron.api.GrpcAPI.TransactionList> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetTransactionsFromThisMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getTransactionsToThis(org.tron.api.GrpcAPI.AccountPaginated request,
        io.grpc.stub.StreamObserver<org.tron.api.GrpcAPI.TransactionList> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetTransactionsToThisMethodHelper(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class WalletExtensionBlockingStub extends io.grpc.stub.AbstractStub<WalletExtensionBlockingStub> {
    private WalletExtensionBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private WalletExtensionBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected WalletExtensionBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new WalletExtensionBlockingStub(channel, callOptions);
    }

    /**
     */
    public org.tron.api.GrpcAPI.TransactionList getTransactionsFromThis(org.tron.api.GrpcAPI.AccountPaginated request) {
      return blockingUnaryCall(
          getChannel(), getGetTransactionsFromThisMethodHelper(), getCallOptions(), request);
    }

    /**
     */
    public org.tron.api.GrpcAPI.TransactionList getTransactionsToThis(org.tron.api.GrpcAPI.AccountPaginated request) {
      return blockingUnaryCall(
          getChannel(), getGetTransactionsToThisMethodHelper(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class WalletExtensionFutureStub extends io.grpc.stub.AbstractStub<WalletExtensionFutureStub> {
    private WalletExtensionFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private WalletExtensionFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected WalletExtensionFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new WalletExtensionFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.tron.api.GrpcAPI.TransactionList> getTransactionsFromThis(
        org.tron.api.GrpcAPI.AccountPaginated request) {
      return futureUnaryCall(
          getChannel().newCall(getGetTransactionsFromThisMethodHelper(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.tron.api.GrpcAPI.TransactionList> getTransactionsToThis(
        org.tron.api.GrpcAPI.AccountPaginated request) {
      return futureUnaryCall(
          getChannel().newCall(getGetTransactionsToThisMethodHelper(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_TRANSACTIONS_FROM_THIS = 0;
  private static final int METHODID_GET_TRANSACTIONS_TO_THIS = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final WalletExtensionImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(WalletExtensionImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_TRANSACTIONS_FROM_THIS:
          serviceImpl.getTransactionsFromThis((org.tron.api.GrpcAPI.AccountPaginated) request,
              (io.grpc.stub.StreamObserver<org.tron.api.GrpcAPI.TransactionList>) responseObserver);
          break;
        case METHODID_GET_TRANSACTIONS_TO_THIS:
          serviceImpl.getTransactionsToThis((org.tron.api.GrpcAPI.AccountPaginated) request,
              (io.grpc.stub.StreamObserver<org.tron.api.GrpcAPI.TransactionList>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class WalletExtensionBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    WalletExtensionBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.tron.api.GrpcAPI.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("WalletExtension");
    }
  }

  private static final class WalletExtensionFileDescriptorSupplier
      extends WalletExtensionBaseDescriptorSupplier {
    WalletExtensionFileDescriptorSupplier() {}
  }

  private static final class WalletExtensionMethodDescriptorSupplier
      extends WalletExtensionBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    WalletExtensionMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (WalletExtensionGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new WalletExtensionFileDescriptorSupplier())
              .addMethod(getGetTransactionsFromThisMethodHelper())
              .addMethod(getGetTransactionsToThisMethodHelper())
              .build();
        }
      }
    }
    return result;
  }
}
