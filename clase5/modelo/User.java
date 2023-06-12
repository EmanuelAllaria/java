package clase5.modelo;

import java.util.ArrayList;
import java.util.List;

public class User {
    private int id;
    private String name;
    private List<Integer> friends;
    private List<String> likedPhotos;

    public User(int id, String name) {
        this.id = id;
        this.name = name;
        this.friends = new ArrayList<>();
        this.likedPhotos = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Integer> getFriends() {
        return friends;
    }

    public List<String> getLikedPhotos() {
        return likedPhotos;
    }

    public void addFriend(int friendId) {
        friends.add(friendId);
    }

    public void likePhoto(String photoId) {
        likedPhotos.add(photoId);
    }
}
