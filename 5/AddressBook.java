import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddressBook {
    private List<Contact> contacts;

    public AddressBook() {
        this.contacts = new ArrayList<>();
    }

    public void addContact(Contact contact) {
        contacts.add(contact);
    }

    public void editContact(int index, Contact newContact) {
        if (index >= 0 && index < contacts.size()) {
            contacts.set(index, newContact);
        } else {
            System.out.println("Недопустимый индекс");
        }
    }

    public void deleteContact(int index) {
        if (index >= 0 && index < contacts.size()) {
            contacts.remove(index);
        } else {
            System.out.println("Недопустимый индекс");
        }
    }

    public void printContacts() {
        for (Contact contact : contacts) {
            System.out.println(contact);
        }
    }

    public static void main(String[] args) {
        AddressBook addressBook = new AddressBook();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nМеню записной книжки");
            System.out.println("1. Добавить контакт");
            System.out.println("2. Редактировать контакт");
            System.out.println("3. Удалить контакт");
            System.out.println("4. Вывести контакт");
            System.out.println("5. Выйти");
            System.out.print("Введите свой выбор: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == 1) {
                System.out.print("Добавьте имя: ");
                String name = scanner.nextLine();
                System.out.print("Добавьте номер телефона: ");
                String phoneNumber = scanner.nextLine();
                System.out.print("Добавьте email: ");
                String email = scanner.nextLine();

                Contact newContact = new Contact(name, phoneNumber, email);
                addressBook.addContact(newContact);
                System.out.println("Контакт успешно добавлен");
            } else if (choice == 2) {
                System.out.print("Введите номер контакта для редактирования: ");
                int index = scanner.nextInt();
                scanner.nextLine();

                if (index >= 0 && index < addressBook.contacts.size()) {
                    Contact existingContact = addressBook.contacts.get(index);
                    System.out.print("Введите новое имя контакта: ");
                    String name = scanner.nextLine();
                    System.out.print("Введите новый номер телефона контакта: ");
                    String phoneNumber = scanner.nextLine();
                    System.out.print("Введите новый email контакта: ");
                    String email = scanner.nextLine();

                    Contact newContact = new Contact(name, phoneNumber, email);
                    addressBook.editContact(index, newContact);
                    System.out.println("Контакт успешно отредактирован");
                } else {
                    System.out.println("Недопустимый индекс");
                }
            } else if (choice == 3) {
                System.out.print("Введите индекс контакта, который вы хотите удалить: ");
                int index = scanner.nextInt();
                scanner.nextLine();
                addressBook.deleteContact(index);
            } else if (choice == 4) {
                if (addressBook.contacts.isEmpty()) {
                    System.out.println("Контакты не найдены");
                } else {
                    System.out.println("Контакты:");
                    addressBook.printContacts();
                }
            } else if (choice == 5) {
                break;
            } else {
                System.out.println("Неверный выбор. Пожалуйста, попробуйте снова");
            }
        }

        System.out.println("Выход из записной книжки");
        scanner.close();
    }
}