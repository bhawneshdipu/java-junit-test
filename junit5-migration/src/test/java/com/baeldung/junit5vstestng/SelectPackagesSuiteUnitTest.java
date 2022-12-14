package com.dipu.junit5vstestng;

import org.junit.platform.suite.api.SelectPackages;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectPackages({ "com.dipu.java.suite.childpackage1", "com.dipu.java.suite.childpackage2" })
public class SelectPackagesSuiteUnitTest {

}
