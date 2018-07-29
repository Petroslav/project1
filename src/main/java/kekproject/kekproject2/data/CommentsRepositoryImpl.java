package kekproject.kekproject2.data;

import kekproject.kekproject2.models.Comment;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.ArrayList;
import java.util.List;

public class CommentsRepositoryImpl implements CommentsRepository {

    private SessionFactory session;

    public CommentsRepositoryImpl(SessionFactory session) {
        this.session = session;
        System.out.println("Comments Repository initialized successfully.");
    }

    @Override
    public List<Comment> getAll() {
        List<Comment> comments = new ArrayList<>();
        try(Session s = session.openSession()){
            s.beginTransaction();
            comments = s.createQuery("FROM Comment", Comment.class).list();
            s.getTransaction().commit();
            System.out.println("Comments retrieved successfully.");
        }catch(Exception e){
            System.out.print(e.getMessage());
            e.printStackTrace();
        }
        return comments;
    }

    @Override
    public List<Comment> getUserComments(int authorId) {
        List<Comment> userComments = new ArrayList<>();
        try(Session s = session.openSession()){
            s.beginTransaction();
            userComments = s.createQuery("FROM Comment WHERE author = " + authorId, Comment.class).list();
            s.getTransaction().commit();
            System.out.println("User comments retrieved successfully.");
        }catch(Exception e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }

        return userComments;
    }

    @Override
    public Comment getCommentById(int commentId) {
        Comment c = null;
        try(Session s = session.openSession()){
            s.beginTransaction();
            c = s.get(Comment.class, commentId);
            s.getTransaction().commit();;
            System.out.println("Comment retrieved successfully.");
        }catch (Exception e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        return c;
    }

    @Override
    public boolean saveComment(Comment c) {
        try(Session s = session.openSession()){
            s.beginTransaction();
            s.save(c);
            s.getTransaction().commit();;
            System.out.println("Comment saved successfully.");
            return true;
        }catch (Exception e){
            System.out.println(e.getMessage());
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean updateComment(Comment c){
        try(Session s = session.openSession()){
            s.beginTransaction();
            s.update(c);
            s.getTransaction().commit();;
            System.out.println("Comment updated successfully.");
            return true;
        }catch (Exception e){
            System.out.println(e.getMessage());
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean deleteComment(int commentId) {
        try(Session s = session.openSession()){
            s.beginTransaction();
            int rows = s.createQuery("DELETE FROM Comment WHERE id = " + commentId).executeUpdate();
            s.getTransaction().commit();;
            if(rows != 0){
                System.out.println("Comment deleted successfully.");
                return true;
            }else{
                System.out.println("Could not find comment");
                return false;
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
            e.printStackTrace();
            return false;
        }
    }
}
