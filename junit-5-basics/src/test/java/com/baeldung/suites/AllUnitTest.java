package com.dipu.suites;

import org.junit.platform.suite.api.ExcludePackages;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectPackages("com.dipu")
@ExcludePackages("com.dipu.suites")
public class AllUnitTest {

}
 