package com.example.espresso_android_testing;

import android.app.Activity;
import android.content.Context;
import android.test.ActivityInstrumentationTestCase2;

import com.example.espresso_android_testing.MainActivity;
import com.example.espresso_android_testing.ActivityFinisher;
import com.example.espresso_android_testing.BuildConfig;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class MainActivitySteps extends Instrumentation<MainActivity> {
    private Activity mActivity;
    private Context mInstrumentationContext;
    private Context mAppContext;

    public MainActivitySteps(){
        super(MainActivity.class);
    }

    @Before
    public void setUp() throws Exception {
        super.setUp();
        mInstrumentationContext = getInstrumentation().getContext();
        mAppContext = getInstrumentation().getTargetContext();
        mActivity = getActivity(); // Start Activity before each test scenario
        assertNotNull(mActivity);
    }

    @After
    public void tearDown() throws Exception {
        ActivityFinisher.finishOpenActivities();
        getActivity().finish();
        super.tearDown(); // This step scrubs everything in this class so always call it last
    }
}