package com.nagarro;

import com.nagarro.facade.NotificationServiceFacade;
import com.nagarro.model.User;
import com.nagarro.repository.UserRepository;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        UserRepository userRepository = new UserRepository();

        userRepository.addUser(new User(0, "John", true));
        userRepository.addUser(new User(1, "Harry", true));
        userRepository.addUser(new User(2, "Thomas", false));
        userRepository.addUser(new User(3, "Russell", true));
        userRepository.addUser(new User(4, "Alex", true));
        userRepository.addUser(new User(5, "Charles", true));
        userRepository.addUser(new User(6, "Mick", false));
        userRepository.addUser(new User(7, "Oscar", true));
        userRepository.addUser(new User(8, "Bradley", false));
        userRepository.addUser(new User(9, "Peter", true));

        NotificationServiceFacade notificationServiceFacade = new NotificationServiceFacade(userRepository);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input details to send notification.");

        System.out.print("Channel : ");
        String channel = scanner.nextLine();

        System.out.print("Subject : ");
        String subject = scanner.nextLine();

        System.out.print("Body : ");
        String body = scanner.nextLine();

        notificationServiceFacade.sendNotification(channel.trim(), subject, body);

    }
}