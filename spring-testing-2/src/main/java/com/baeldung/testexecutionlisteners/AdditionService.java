package com.dipu.testexecutionlisteners;

import org.springframework.stereotype.Service;

@Service
public class AdditionService {
    public int add(int a, int b) {
        return a + b;
    }
}
