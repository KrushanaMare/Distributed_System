module HelloApp {
    interface Hello {
        string sayHello();
        oneway void shutdown();
    };
};
