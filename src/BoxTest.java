import org.junit.jupiter.api.Test;

public class BoxTest {

    @Test
    public void TestWidthChange() {
        Box myBox = new Box();
        assert(myBox.width == 50);

        myBox.setWidth(60);
        assert(myBox.width == 60);
    }
}
