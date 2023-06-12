package clase5.modelo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserServiceImpl implements UserService {
    private Map<Integer, User> users;

    public UserServiceImpl() {
        this.users = new HashMap<>();
    }

    @Override
    public User createUser(User user) {
        users.put(user.getId(), user);
        return user;
    }

    @Override
    public User getUserById(int id) {
        return users.get(id);
    }

    @Override
    public List<User> getAllUsers() {
        return new ArrayList<>(users.values());
    }

    @Override
    public void updateUser(User user) {
        users.put(user.getId(), user);
    }

    @Override
    public void deleteUser(int id) {
        users.remove(id);
    }

    @Override
    public void uploadPhoto(int userId, String photoUrl) {
        User user = users.get(userId);
        if (user != null) {
            user.getLikedPhotos().add(photoUrl);
        }
    }

    @Override
    public void addFriend(int userId, int friendId) {
        User user = users.get(userId);
        User friend = users.get(friendId);
        if (user != null && friend != null) {
            user.getFriends().add(friendId);
            friend.getFriends().add(userId);
        }
    }

    @Override
    public void likePhoto(int userId, String photoId) {
        User user = users.get(userId);
        if (user != null) {
            user.getLikedPhotos().add(photoId);
        }
    }
}
