/*
* Licensed to the Apache Software Foundation (ASF) under one or more
* contributor license agreements.  See the NOTICE file distributed with
* this work for additional information regarding copyright ownership.
* The ASF licenses this file to You under the Apache License, Version 2.0
* (the "License"); you may not use this file except in compliance with
* the License.  You may obtain a copy of the License at
*
*     http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
*/

    package io.grpc.reflection.v1alpha;

import org.apache.dubbo.common.stream.StreamObserver;
import org.apache.dubbo.common.URL;
import org.apache.dubbo.rpc.Invoker;
import org.apache.dubbo.rpc.PathResolver;
import org.apache.dubbo.rpc.RpcException;
import org.apache.dubbo.rpc.ServerService;
import org.apache.dubbo.rpc.TriRpcStatus;
import org.apache.dubbo.rpc.model.MethodDescriptor;
import org.apache.dubbo.rpc.model.ServiceDescriptor;
import org.apache.dubbo.rpc.model.StubMethodDescriptor;
import org.apache.dubbo.rpc.model.StubServiceDescriptor;
import org.apache.dubbo.rpc.stub.BiStreamMethodHandler;
import org.apache.dubbo.rpc.stub.ServerStreamMethodHandler;
import org.apache.dubbo.rpc.stub.StubInvocationUtil;
import org.apache.dubbo.rpc.stub.StubInvoker;
import org.apache.dubbo.rpc.stub.StubMethodHandler;
import org.apache.dubbo.rpc.stub.StubSuppliers;
import org.apache.dubbo.rpc.stub.UnaryStubMethodHandler;

import com.google.protobuf.Message;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.concurrent.CompletableFuture;

public final class DubboServerReflectionTriple {

    public static final String SERVICE_NAME = ServerReflection.SERVICE_NAME;

    private static final StubServiceDescriptor serviceDescriptor = new StubServiceDescriptor(SERVICE_NAME,ServerReflection.class);

    static {
        org.apache.dubbo.rpc.protocol.tri.service.SchemaDescriptorRegistry.addSchemaDescriptor(SERVICE_NAME,ServerReflectionProto.getDescriptor());
        StubSuppliers.addSupplier(SERVICE_NAME, DubboServerReflectionTriple::newStub);
        StubSuppliers.addSupplier(ServerReflection.JAVA_SERVICE_NAME,  DubboServerReflectionTriple::newStub);
        StubSuppliers.addDescriptor(SERVICE_NAME, serviceDescriptor);
        StubSuppliers.addDescriptor(ServerReflection.JAVA_SERVICE_NAME, serviceDescriptor);
    }

    @SuppressWarnings("all")
    public static ServerReflection newStub(Invoker<?> invoker) {
        return new ServerReflectionStub((Invoker<ServerReflection>)invoker);
    }




    /**
         * <pre>
         *  The reflection service is structured as a bidirectional stream, ensuring
         *  all related requests go to a single server.
         * </pre>
         */
    private static final StubMethodDescriptor serverReflectionInfoMethod = new StubMethodDescriptor("ServerReflectionInfo",
    io.grpc.reflection.v1alpha.ServerReflectionRequest.class, io.grpc.reflection.v1alpha.ServerReflectionResponse.class, serviceDescriptor, MethodDescriptor.RpcType.BI_STREAM,
    obj -> ((Message) obj).toByteArray(), obj -> ((Message) obj).toByteArray(), io.grpc.reflection.v1alpha.ServerReflectionRequest::parseFrom,
    io.grpc.reflection.v1alpha.ServerReflectionResponse::parseFrom);

    public static class ServerReflectionStub implements ServerReflection{
        private final Invoker<ServerReflection> invoker;

        public ServerReflectionStub(Invoker<ServerReflection> invoker) {
            this.invoker = invoker;
        }



            /**
         * <pre>
         *  The reflection service is structured as a bidirectional stream, ensuring
         *  all related requests go to a single server.
         * </pre>
         */
        @Override
        public StreamObserver<io.grpc.reflection.v1alpha.ServerReflectionRequest> serverReflectionInfo(StreamObserver<io.grpc.reflection.v1alpha.ServerReflectionResponse> responseObserver){
            return StubInvocationUtil.biOrClientStreamCall(invoker, serverReflectionInfoMethod , responseObserver);
        }

    }

    public static abstract class ServerReflectionImplBase implements ServerReflection, ServerService<ServerReflection> {

        @Override
        public final Invoker<ServerReflection> getInvoker(URL url) {
            PathResolver pathResolver = url.getOrDefaultFrameworkModel()
            .getExtensionLoader(PathResolver.class)
            .getDefaultExtension();
            Map<String,StubMethodHandler<?, ?>> handlers = new HashMap<>();

            pathResolver.addNativeStub( "/" + SERVICE_NAME + "/ServerReflectionInfo" );




            handlers.put(serverReflectionInfoMethod.getMethodName(), new BiStreamMethodHandler<>(this::serverReflectionInfo));

            return new StubInvoker<>(this, url, ServerReflection.class, handlers);
        }




        @Override
        public StreamObserver<io.grpc.reflection.v1alpha.ServerReflectionRequest> serverReflectionInfo(StreamObserver<io.grpc.reflection.v1alpha.ServerReflectionResponse> responseObserver){
            throw unimplementedMethodException(serverReflectionInfoMethod);
        }


        @Override
        public final ServiceDescriptor getServiceDescriptor() {
            return serviceDescriptor;
        }
        private RpcException unimplementedMethodException(StubMethodDescriptor methodDescriptor) {
            return TriRpcStatus.UNIMPLEMENTED.withDescription(String.format("Method %s is unimplemented",
                "/" + serviceDescriptor.getInterfaceName() + "/" + methodDescriptor.getMethodName())).asException();
        }
    }

}
