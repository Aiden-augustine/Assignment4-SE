import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class PostTest {

    @Test
    void PostCase1() {
        String[] tags1 = {"tag1", "tag2"};
        post data1 = new post("Valid Post Title", "This is a body with more than 250 characters. ".repeat(10), tags1, "Normal", "Not Urgent");
        assertTrue(data1.addPost());

        String[] tags2 = {"tagthree", "tagfour"};
        post data2 = new post("Valid post Title 2",  "This is a body with over 250 characters".repeat(10), tags2, "easy", "ordinary");
        assertTrue(data2.addPost());
    }
    

    @Test
    void PostCase2() {
        String[] tags1 = {"tag1", "tag2"};
        post data1 = new post("pretty easy post", "This is a valid body of an easys post".repeat(10), tags1, "Easy", " Ordinary");
        assertTrue(data1.addPost());

        String[] tags2 = {"tagthree", "tagfour"};
        post data2 = new post("This is an easy post", "This is a valid body of an easy post ".repeat(10), tags2, "Easy", "Highly Needed");
        assertTrue(data2.addPost());
    }

    @Test
    void PostCase3() {
        String[] tags1 = {"tag1", "tag2"};
        post data1 = new post("Very Difficult post title", "This is the body of a hard post".repeat(10), tags1, "Very Difficult", "Highly needed");
        assertTrue(data1.addPost());

        String[] tags2 = {"tag1", "tag2"};
        post data2 = new post("Very Difficult post part 2", "This is a body with more than 250 characters. and is from a difficult post".repeat(10), tags2, "Very Difficult", "Ordinary");
        assertTrue(data2.addPost());
    }

    @Test
    void PostCase4() {
        String[] tags1 = {"tag1", "tag2"};
        post data1 = new post("sma", "This is a body with more than 250 characters. ".repeat(10), tags1, "Easy", "Ordinary");
        assertTrue(data1.addPost());

        String[] tags2 = {"tag1", "tag2"};
        post data2 = new post("shor", "This is a body with more than 250 characters and is from the short post. ".repeat(10), tags2, "Normal", "Not Urgent");
        assertTrue(data2.addPost());
    }

    @Test
    void PostCase5() {
        String[] tags1 = {"tag1", "tag2"};
        post data1 = new post("Short body", "shor ", tags1, "Easy", "Ordinary");
        assertTrue(data1.addPost());

        String[] tags2 = {"tag1", "tag2"};
        post data2 = new post("Shorten body", "smak", tags2, "Emergenc", "Not Urgent");
        assertTrue(data2.addPost());
    }

    @Test
    void PostCase6() {
        String[] tags1 = {"tag48", "&^&Tagged123"};
        post data1 = new post("Invalid tag", "This is a body with more than 250 characters and invalid tags. ".repeat(10), tags1, "Easy", "Ordianry");
        assertTrue(data1.addPost());

        String[] tags2 = {"13tagfdthree", "tadgfour"};
        post data2 = new post("Messed up Tag", "This is a body with more than 250 characters. ".repeat(10), tags2, "Easy", "Not Urgent");
        assertTrue(data2.addPost());
    }
    
  @Test
   void CommCase1() {
       String[] tags1 = {"tag1", "tag2"};
        post data1 = new post("abcdefghij", "This is a body with more than 250 characters. ".repeat(10), tags1, "Normal", "Not Urgent");
        assertTrue(data1.addPost());

        String[] tags2 = {"tagthree", "tagfour"};
        post data2 = new post("abcdefghik", "This is a body with more than 250 characters. ".repeat(10), tags2, "Normal", "Not Urgent");
        assertTrue(data2.addPost());
    }

    @Test
    void CommCase2() {
        String[] tags1 = {"tag1", "tag2"};
        post data1 = new post("abcdefghij", "This is a body with more than 250 characters. ".repeat(10), tags1, "Normal", "Not Urgent");
        assertTrue(data1.addPost());

        String[] tags2 = {"tagthree", "tagfour"};
        post data2 = new post("abcdefghik", "This is a body with more than 250 characters. ".repeat(10), tags2, "Normal", "Not Urgent");
        assertTrue(data2.addPost());
    }

    @Test
    void CommCase3() {
        String[] tags1 = {"tag1", "tag2"};
        post data1 = new post("abcdefghij", "This is a body with more than 250 characters. ".repeat(10), tags1, "Normal", "Not Urgent");
        assertTrue(data1.addPost());

        String[] tags2 = {"tagthree", "tagfour"};
        post data2 = new post("abcdefghik", "This is a body with more than 250 characters. ".repeat(10), tags2, "Normal", "Not Urgent");
        assertTrue(data2.addPost());
    }

    @Test
    void CommCase4() {
        String[] tags1 = {"tag1", "tag2"};
        post data1 = new post("abcdefghij", "This is a body with more than 250 characters. ".repeat(10), tags1, "Normal", "Not Urgent");
        assertTrue(data1.addPost());

        String[] tags2 = {"tagthree", "tagfour"};
        post data2 = new post("abcdefghik", "This is a body with more than 250 characters. ".repeat(10), tags2, "Normal", "Not Urgent");
        assertTrue(data2.addPost());
    }

    @Test
    void CommCase5() {
        String[] tags1 = {"tag1", "tag2"};
        post data1 = new post("abcdefghij", "This is a body with more than 250 characters. ".repeat(10), tags1, "Normal", "Not Urgent");
        assertTrue(data1.addPost());

        String[] tags2 = {"tagthree", "tagfour"};
        post data2 = new post("abcdefghik", "This is a body with more than 250 characters. ".repeat(10), tags2, "Normal", "Not Urgent");
        assertTrue(data2.addPost());
    }

    @Test
    void CommCase6() {
        String[] tags1 = {"tag1", "tag2"};
        post data1 = new post("abcdefghij", "This is a body with more than 250 characters. ".repeat(10), tags1, "Normal", "Not Urgent");
        assertTrue(data1.addPost());

        String[] tags2 = {"tagthree", "tagfour"};
        post data2 = new post("abcdefghik", "This is a body with more than 250 characters. ".repeat(10), tags2, "Normal", "Not Urgent");
        assertTrue(data2.addPost());
    }
    
    
    
    
    
    
    
    
    
    
    
    
}