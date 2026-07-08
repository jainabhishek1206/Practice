package com.practice.Thread;

import java.util.concurrent.Callable;

/*As callable returns a value hence you have to specify the object type that it will return,
if you dont do so then it will consider it as Object type*/

public class DemoCallable implements Callable<Integer> {
    @Override
    public Integer call() throws Exception {
        return 10 + 20;
    }
}
