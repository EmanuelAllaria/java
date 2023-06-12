package clase5.modelo;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Crear instancia del ShoppingCartAPI
        ShoppingCartAPI shoppingCart = new ShoppingCart();

        // Agregar items al carrito
        Item item1 = new Item("Item 1", 10.0);
        Item item2 = new Item("Item 2", 20.0);
        shoppingCart.addItem(item1);
        shoppingCart.addItem(item2);

        // Mostrar los items en el carrito
        System.out.println("Items en el carrito:");
        for (Item item : shoppingCart.getItems()) {
            System.out.println(item.getName() + ": $" + item.getPrice());
        }

        // Realizar el checkout
        shoppingCart.checkout();

        // Crear instancia del UserService
        UserService userService = new UserServiceImpl();

        // Crear usuarios
        User user1 = new User(1, "John");
        User user2 = new User(2, "Jane");

        // Agregar usuarios al sistema
        userService.createUser(user1);
        userService.createUser(user2);

        // Obtener usuario por ID
        User retrievedUser = userService.getUserById(1);
        System.out.println("Usuario obtenido: " + retrievedUser.getName());

        // Actualizar usuario
        retrievedUser.setName("John Smith");
        userService.updateUser(retrievedUser);
        System.out.println("Nombre de usuario actualizado: " + retrievedUser.getName());

        // Obtener todos los usuarios
        List<User> allUsers = userService.getAllUsers();
        System.out.println("Usuarios registrados:");
        for (User user : allUsers) {
            System.out.println("ID: " + user.getId() + ", Nombre: " + user.getName());
        }

        // Eliminar usuario
        userService.deleteUser(2);
        System.out.println("Usuario eliminado.");

        // Agregar foto al usuario
        userService.uploadPhoto(1, "https://example.com/photo.jpg");
        System.out.println("Foto agregada al usuario.");

        // Agregar amigo al usuario
        userService.addFriend(1, 2);
        System.out.println("Amigo agregado al usuario.");

        // Dar "me gusta" a una foto
        userService.likePhoto(1, "photo123");
        System.out.println("Me gusta dado a la foto.");

        // Obtener todos los usuarios después de las operaciones
        allUsers = userService.getAllUsers();
        System.out.println("Usuarios registrados después de las operaciones:");
        for (User user : allUsers) {
            System.out.println("ID: " + user.getId() + ", Nombre: " + user.getName());
        }
    }
}
