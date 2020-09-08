

// import java.util.List;
// import java.util.Optional;
// import java.util.UUID;

// import com.zaini.company.repository.UserRepository;
// import com.zaini.company.model.User;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.beans.factory.annotation.Qualifier;
// import org.springframework.stereotype.Service;

// @Service
// public class UserService {

//     private final UserRepository userRepository;

//     @Autowired
//     public UserService(@Qualifier("fakeRepository") UserRepository userRepository) {
//         this.userRepository = userRepository;
//     }
    
//     public int addUser(User user){

//         return userRepository.save(user);
//     }

//     public List<User> getAllPeople(){

//         return userRepository.findAll();
//     }

//     public Optional<User> getUserById(UUID id){
//         return userRepository.findById(id);
//     }
//     public int deleteUser(UUID id){
//         return userRepository.deleteById(id);
//     }
//     public int updateUser(UUID id, User newUser){
//         return userRepository.updateById(id, newUser);
//     }

// }