package clase5.modelo;

import java.util.List;

public interface UserService {
    User createUser(User user);
    User getUserById(int id);
    List<User> getAllUsers();
    void updateUser(User user);
    void deleteUser(int id);
    void uploadPhoto(int userId, String photoUrl);
    void addFriend(int userId, int friendId);
    void likePhoto(int userId, String photoId);
}
