package org.jumpmind.symmetric.is.core.runtime.component;

import org.jumpmind.symmetric.is.core.config.ComponentFlowNode;
import org.jumpmind.symmetric.is.core.runtime.IExecutionTracker;
import org.jumpmind.symmetric.is.core.runtime.Message;
import org.jumpmind.symmetric.is.core.runtime.connection.IConnectionFactory;
import org.jumpmind.symmetric.is.core.runtime.flow.IMessageTarget;

public interface IComponent {

    public void start(IExecutionTracker tracker, IConnectionFactory connectionFactory, ComponentFlowNode componentNode);

    public void stop();

    public void handle(Message inputMessage, IMessageTarget messageTarget);

}
