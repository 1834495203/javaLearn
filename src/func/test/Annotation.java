package func.test;

public class Annotation {
    public static void main(String[] args) {
        User user = new User();
        user.setUsername("Marias");
        user.setAddress("123456");
        user.setPassword("114514");
        user.setGender("女");

        HasAuth<User> auth = new HasAuth<>("10011", user, User.class);
        User userAfterAuth = auth.afterAuth();
        System.out.println(userAfterAuth.getPassword());
    }
}
