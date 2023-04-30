package Lesson1;

import lombok.*;

@ToString(exclude = {"password"})
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class Student {
    String name;
    int age;
    String password;

    public int tenYearsLater() {
        return (age + 10);
    }

}