package test;

import org.junit.Test;
import play.libs.F.Callback;
import play.test.TestBrowser;

import static org.junit.Assert.assertTrue;
import static play.test.Helpers.running;
import static play.test.Helpers.testServer;
import static play.test.Helpers.fakeApplication;
import static play.test.Helpers.inMemoryDatabase;
import static play.test.Helpers.HTMLUNIT;

/**
 * Provides application's integration tests.
 */
public class IntegrationTest {

    /**
     * Test application against in memory database.  Make sure that welcome page contains key text.
     */
    @Test
    public void test() {
        running(testServer(3333, fakeApplication(inMemoryDatabase())), HTMLUNIT, new Callback<TestBrowser>() {
            public void invoke(TestBrowser browser) {
                browser.goTo("http://localhost:3333");
                assertTrue(browser.pageSource().contains("Your new application is ready."));
            }
        });
    }

}
