public class Contact {
    
            private String name;
            private String phoneNumber;
            private String email;
        
            public Contact(String name, String phoneNumber, String email) {
                this.name = name;
                this.phoneNumber = phoneNumber;
                this.email = email;
            }
        
            @Override
            public String toString() {
                return "Имя: " + name + ", Телефон: " + phoneNumber + ", Email: " + email;
            }
    
}
