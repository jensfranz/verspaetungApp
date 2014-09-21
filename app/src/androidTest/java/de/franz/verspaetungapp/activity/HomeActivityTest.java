package de.franz.verspaetungapp.activity;

import android.app.Activity;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;

import static org.junit.Assert.assertTrue;

/*
* To make this test work in Androidstudio:
*
* I. let gradle generate test-classes
*
*     Select default Unit Test run configuration
*     <optional> Working directory: $MODULE_DIR$
*     At before launch: Make, add Run External Tool
*       Program: ./gradlew
*       Parameters: testDebugClasses
*       Working directory: $ProjectFileDir$
*
* II. step by step inside android studio:
*   1. start an unit test, it will fail with stub! or missing classes
*   2. copy to an editor the output from terminal (you only need --classpath "...")
*   3. edit classpath add additional sources (expecting that you use debug variant)
*       - cut the path to junit4 and paste it as the first entry
*       - append at end: /<projectPath>/build/test-classes/debug
*       - append at end: /<projectPath>/build/resources/testDebug
* */
@RunWith(RobolectricTestRunner.class)
@Config(manifest = "./src/main/AndroidManifest.xml")
public class HomeActivityTest {

    private Activity activity;

    @Before
    public void setUp() throws Exception {
        activity = Robolectric.buildActivity(HomeActivity.class).create().get();
    }

    @After
    public void tearDown() throws Exception {

    }


    @Test
    public void testName() throws Exception {
        assertTrue(activity != null);
    }
}