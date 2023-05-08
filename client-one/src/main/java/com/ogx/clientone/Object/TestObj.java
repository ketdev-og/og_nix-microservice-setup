package com.ogx.clientone.Object;

public class TestObj {

    String testName;
    int testId;

    public String getTestName() {
        return testName;
    }

    public void setTestName(String testName) {
        this.testName = testName;
    }

    public int getTestId() {
        return testId;
    }

    public void setTestId(int testId) {
        this.testId = testId;
    }

    public TestObj(String testName, int testId){
            this.testId = testId;
            this.testName = testName;
    }
}
