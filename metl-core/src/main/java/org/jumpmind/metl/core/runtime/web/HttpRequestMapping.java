package org.jumpmind.metl.core.runtime.web;

import java.io.Serializable;

import org.jumpmind.metl.core.model.AgentDeployment;
import org.jumpmind.metl.core.runtime.component.SecurityScheme;

public class HttpRequestMapping implements Serializable, Comparable<HttpRequestMapping> {

    private static final long serialVersionUID = 1L;

    String path;

    HttpMethod method;

    AgentDeployment deployment;

    int priority;
    
    SecurityScheme securityScheme;
    
    String securityUsername;
    
    String securityPassword;
    
    String requestDescription;
    
    String responseDescription;
    
    String flowDescription;
    
    public HttpMethod getMethod() {
        return method;
    }

    public void setMethod(HttpMethod method) {
        this.method = method;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public void setDeployment(AgentDeployment deployment) {
        this.deployment = deployment;
    }

    public AgentDeployment getDeployment() {
        return deployment;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }
    
    public void setSecurityScheme(SecurityScheme securityScheme) {
        this.securityScheme = securityScheme;
    }
    
    public SecurityScheme getSecurityScheme() {
        return securityScheme;
    }
    
    public void setSecurityUsername(String securityUsername) {
        this.securityUsername = securityUsername;
    }
    
    public String getSecurityUsername() {
        return securityUsername;
    }
    
    public void setSecurityPassword(String securityPassword) {
        this.securityPassword = securityPassword;
    }
    
    public String getSecurityPassword() {
        return securityPassword;
    }
    
    public void setRequestDescription(String description) {
        this.requestDescription = description;
    }
    
    public String getRequestDescription() {
        return requestDescription;
    }
    
    public void setResponseDescription(String responseDescription) {
        this.responseDescription = responseDescription;
    }
    
    public String getResponseDescription() {
        return responseDescription;
    }
    
    public void setFlowDescription(String flowDescription) {
        this.flowDescription = flowDescription;
    }
    
    public String getFlowDescription() {
        return flowDescription;
    }

    @Override
    public int compareTo(HttpRequestMapping o) {
        int compare = new Integer(priority).compareTo(new Integer(o.getPriority()));
        if (compare == 0) {
            compare = path.compareTo(o.path);
        }
        return compare;
    }

    @Override
    public int hashCode() {
        return deployment.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof HttpRequestMapping) {
            return deployment.equals(((HttpRequestMapping) obj).deployment);
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return new StringBuilder("{ \"requestmapping\":[\"path\":").append(path).append("\",\"deployment\":\"").append(deployment.getName())
                .append("\"]}").toString();
    }

}
