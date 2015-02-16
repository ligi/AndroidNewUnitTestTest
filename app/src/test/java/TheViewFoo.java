import org.junit.Test;
import org.junit.runner.RunWith;
import org.ligi.unittesttest.ViewFoo;
import org.robolectric.Robolectric;

import static junit.framework.Assert.assertEquals;

@RunWith(CustomRobolectricRunner.class)

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


    @Test
    public void testResourceStringFromLibraryShouldLoad() {
        final ViewFoo viewFoo = new ViewFoo(Robolectric.application);

        assertEquals(viewFoo.returnTestStringFromLibraryRes(),"Navigate home");
    }

}
