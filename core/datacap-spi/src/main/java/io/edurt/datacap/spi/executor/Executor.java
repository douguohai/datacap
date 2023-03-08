package io.edurt.datacap.spi.executor;

public interface Executor
{
    default String name()
    {
        // Intercept the suffix Executor to mark the executor name
        return this.getClass().getSimpleName().replace("Executor", "");
    }

    default String description()
    {
        return String.format("Integrate %s executor", this.name());
    }

    void start(ExecutorConfigure configure);
}
