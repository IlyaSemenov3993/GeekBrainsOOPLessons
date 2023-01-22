import dto.StudentGroup;
import dto.User;

import java.util.List;

public interface UserService<U extends User> {

    U createUser(U user);

    U findById(Integer id);

    U findByLastName(String lastName);

    void sortUsers(List<U> users);

    void sortUsersByName(List<U> users);
    
    StudentGroup findGroup(int groupNumber);

}