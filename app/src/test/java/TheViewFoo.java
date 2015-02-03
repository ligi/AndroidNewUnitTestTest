import org.junit.Test;
import org.ligi.unittesttest.ViewFoo;

import static junit.framework.Assert.assertEquals;

public class TheViewFoo {

    @Test
    public void testShouldPass() {
        final ViewFoo viewFoo = new ViewFoo(null);
        assertEquals(viewFoo.returnSomething(),"something");
    }


    @Test
    public void testShouldFail() {
        final ViewFoo viewFoo = new ViewFoo(null);
        assertEquals(viewFoo.returnSomething(),"somethingElse");
    }

}