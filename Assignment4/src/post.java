import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class post {
    private int postID;
    private String postTitle;
    private String postBody;
    private String[] postTags;
    private String postType;
    private String postEmergency;
    private ArrayList<String> postComments = new ArrayList<>();

    // Constructor
    public post(String postTitle, String postBody, String[] postTags, String postType, String postEmergency) {
        this.postTitle = postTitle;
        this.postBody = postBody;
        this.postTags = postTags;
        this.postType = postType;
        this.postEmergency = postEmergency;
    }

    // Method to add a post
    public boolean addPost() {
        if (!isPostValid()) {
            System.out.println("Post is not valid.");
            return false;
        }

        try (FileWriter writePost = new FileWriter("post.txt", true)) {
            writePost.write("Title: " + postTitle + "\n");
            writePost.write("Body: " + postBody + "\n");
            writePost.write("Tags: " + String.join(", ", postTags) + "\n");
            writePost.write("Type: " + postType + "\n");
            writePost.write("Urgency: " + postEmergency + "\n");
            writePost.write("\n");
            System.out.println("Post written to file successfully.");
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }

        return true;
    }

    // Method to add a comment
    public boolean addComment(String commentText) {
        if (!isCommentValid(commentText)) {
            System.out.println("Comment is not valid.");
            return false;
        }

        postComments.add(commentText);

        try (FileWriter writer = new FileWriter("/Assignment4/src/comment.txt", true)) {
            writer.write("Post ID: " + postID + "\n");
            writer.write("Comment: " + commentText + "\n");
            writer.write("\n");
            System.out.println("Comment written to file successfully.");
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }

        return true;
    }

    // Helper method to validate post
    private boolean isPostValid() {
        if (postTitle.length() < 10 || postTitle.length() > 250) {
            return false;
        }
        if (!postTitle.substring(0, 5).matches("[a-zA-Z]{5}")) {
            return false;
        }
        if (postBody.length() < 250) {
            return false;
        }
        if (postTags.length < 2 || postTags.length > 5) {
            return false;
        }
        for (String tag : postTags) {
            if (tag.length() < 2 || tag.length() > 10 || !tag.equals(tag.toLowerCase())) {
                return false;
            }
        }
        if (postType.equals("Easy") && postTags.length > 3) {
            return false;
        }
        if ((postType.equals("Very Difficult") || postType.equals("Difficult")) && postBody.length() < 300) {
            return false;
        }
        if (postType.equals("Easy")
                && (postEmergency.equals("Immediately Needed") || postEmergency.equals("Highly Needed"))) {
            return false;
        }
        if ((postType.equals("Very Difficult") || postType.equals("Difficult")) && postEmergency.equals("Ordinary")) {
            return false;
        }

        return true;
    }

    // Helper method to validate comment
    private boolean isCommentValid(String commentText) {
        String[] words = commentText.split(" ");
        if (words.length < 4 || words.length > 10) {
            return false;
        }
        if (!Character.isUpperCase(words[0].charAt(0))) {
            return false;
        }
        if (postComments.size() >= 5 ||
                ((postType.equals("Easy") || postEmergency.equals("Ordinary")) && postComments.size() >= 3)) {
            return false;
        }

        return true;
    }
}
