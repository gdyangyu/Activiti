package io.workplus.activiti.variable;

import java.util.*;

/**
 * 一个流程变量辅助类，便于以流式接口创建多个流程变量。
 * Created by yyang on 2016/12/2.
 */
public class Variables {

    private Map<String, Object> variables = new HashMap<String, Object>();

    public Variables put(String key, Object value) {
        variables.put(key, value);
        return this;
    }

    public Variables putAll(Map<String, Object> variables) {
        this.variables.putAll(variables);
        return this;
    }

    public Variables remove(String key) {
        variables.remove(key);
        return this;
    }

    public Variables removeAll(Collection<String> keys) {
        for (String key : keys) {
            variables.remove(key);
        }
        return this;
    }

    public Variables removeAll(String[] keys) {
        return removeAll(Arrays.asList(keys));
    }

    public Map<String, Object> get() {
        return Collections.unmodifiableMap(variables);
    }

}
