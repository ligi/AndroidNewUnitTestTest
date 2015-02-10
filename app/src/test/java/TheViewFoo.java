import org.junit.Test;
import org.junit.runner.RunWith;
import org.ligi.unittesttest.ViewFoo;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;

import static junit.framework.Assert.assertEquals;

@RunWith(RobolectricTestRunner.class)
@Config(emulateSdk = 18,manifest = "app/src/main/AndroidManifest.xml")

public class TheViewFoo {

    @Test
    public void testShouldPass() {
        final ViewFoo viewFoo = new ViewFoo(Robolectric.application);
        assertEquals(viewFoo.returnSomething(),"something");
    }


    @Test
    public void testShouldFail() {
        final ViewFoo viewFoo = new ViewFoo(Robolectric.application);
        assertEquals(viewFoo.returnSomething(),"somethingElse");
    }

    @Test
    public void testResourceStringShouldLoad() {
        final ViewFoo viewFoo = new ViewFoo(Robolectric.application);

        assertEquals(viewFoo.returnTestStringFromRes(),"test_string");
    }

}
