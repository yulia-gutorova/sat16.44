package com.Gutorova.Yulia;

import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(JUnitPlatform.class)
@SelectClasses({TestConvertMethods.class, TestGettersAndSetters.class})
public class SuiteTest {}
