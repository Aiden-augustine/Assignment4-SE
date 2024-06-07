import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class PostTest {

    @Test
    void Case1() {
        String[] tags1 = {"tagone", "tagtwo"};
        post data1 = new post("abcdefghij", "This is a body with more than 250 characters. ".repeat(10), tags1, "Normal", "Not Urgent");
        assertTrue(data1.addPost());

        String[] tags2 = {"tagthree", "tagfour"};
        post data2 = new post("abcdefghik", "This is a body with more than 250 characters. ".repeat(10), tags2, "Normal", "Not Urgent");
        assertTrue(data2.addPost());
    }

    @Test
    void Case2() {
        String[] tags1 = {"tagone", "tagtwo"};
        post data1 = new post("abcdefghij", "This is a body with more than 250 characters. ".repeat(10), tags1, "Normal", "Not Urgent");
        assertTrue(data1.addPost());

        String[] tags2 = {"tagthree", "tagfour"};
        post data2 = new post("abcdefghik", "This is a body with more than 250 characters. ".repeat(10), tags2, "Normal", "Not Urgent");
        assertTrue(data2.addPost());
    }

    @Test
    void Case3() {
        String[] tags1 = {"tagone", "tagtwo"};
        post data1 = new post("abcdefghij", "This is a body with more than 250 characters. ".repeat(10), tags1, "Normal", "Not Urgent");
        assertTrue(data1.addPost());

        String[] tags2 = {"tagthree", "tagfour"};
        post data2 = new post("abcdefghik", "This is a body with more than 250 characters. ".repeat(10), tags2, "Normal", "Not Urgent");
        assertTrue(data2.addPost());
    }

    @Test
    void Case4() {
        String[] tags1 = {"tagone", "tagtwo"};
        post data1 = new post("abcdefghij", "This is a body with more than 250 characters. ".repeat(10), tags1, "Normal", "Not Urgent");
        assertTrue(data1.addPost());

        String[] tags2 = {"tagthree", "tagfour"};
        post data2 = new post("abcdefghik", "This is a body with more than 250 characters. ".repeat(10), tags2, "Normal", "Not Urgent");
        assertTrue(data2.addPost());
    }

    @Test
    void Case5() {
        String[] tags1 = {"tagone", "tagtwo"};
        post data1 = new post("abcdefghij", "This is a body with more than 250 characters. ".repeat(10), tags1, "Normal", "Not Urgent");
        assertTrue(data1.addPost());

        String[] tags2 = {"tagthree", "tagfour"};
        post data2 = new post("abcdefghik", "This is a body with more than 250 characters. ".repeat(10), tags2, "Normal", "Not Urgent");
        assertTrue(data2.addPost());
    }

    @Test
    void Case6() {
        String[] tags1 = {"tagone", "tagtwo"};
        post data1 = new post("abcdefghij", "This is a body with more than 250 characters. ".repeat(10), tags1, "Normal", "Not Urgent");
        assertTrue(data1.addPost());

        String[] tags2 = {"tagthree", "tagfour"};
        post data2 = new post("abcdefghik", "This is a body with more than 250 characters. ".repeat(10), tags2, "Normal", "Not Urgent");
        assertTrue(data2.addPost());
    }
}
