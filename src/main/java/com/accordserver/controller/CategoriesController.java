package com.accordserver.controller;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class CategoriesController {

//    @Autowired
//    // This means to get the bean called userRepository. Which is auto-generated by Spring, we will use it to handle the data
//    private ServerRepository serverRepository;

//    @Autowired
//    private UserRepository userRepository;

    /**
     * creates a new category
     * AND needs to control the OneToMany connection with Server.
     *
     * @param data name of the new Category
     * @return rest answer
     */

//    @PostMapping("/servers") // Map ONLY POST Requests - createCategory
//    public @ResponseBody
//    ResponseMessage createCategory(@RequestBody Map<String, Object> data, @RequestHeader(value = "userKey") String userKey) {
//
//        Server server = new Server(data.get("name").toString()).setOwner(userKey);
//        serverRepository.save(server);
//
//        User user = userRepository.findByUserKey(userKey);
//        user.setServer(server);
//        userRepository.save(user);
//
//        System.out.println(user.getName());
//        System.out.println(server.getId());
//
//        JsonObject serverData = new JsonObject();
//        serverData.put("id", server.getId());
//        serverData.put("name", server.getName());
//
//        return new ResponseMessage(SUCCESS, "", serverData);
//    }
//
//    /**
//     * Gets all registered users
//     *
//     * @return json list of users
//     */
////    @GetMapping("/users")
////    public ResponseEntity<String> getUsers(@RequestHeader(value = "userKey") String userKey) {
////        return new ResponseEntity<String>(userKey + " userKey", HttpStatus.OK);
////    }
//    @GetMapping("/users")
//    public @ResponseBody
//    ResponseMessage getUsers(@RequestHeader(value = "userKey") String userKey) {
//        List<User> onlineUsers = (List<User>) userRepository.findByOnline(true);
//
//        for (User user : onlineUsers) {
//            if (user.getUserKey().equals(userKey)) {
//
//                JsonArray onlineUserData = new JsonArray();
//                for (User cleanUser : onlineUsers) {
//                    JsonObject newUserData = new JsonObject();
//                    newUserData.put("id", cleanUser.getId());
//                    newUserData.put("name", cleanUser.getName());
//                    onlineUserData.add(newUserData);
//                }
//
//                System.out.println("onlineUser: " + onlineUsers);
//                return new ResponseMessage(SUCCESS, "", onlineUserData);
//            }
//        }
//        return new ResponseMessage(FAILED, "UserKey is not valid!", new JsonObject());
//    }
//
//    /**
//     * login with an available user
//     *
//     * @param loginForm name and password of the user
//     * @return rest answer
//     */
//    @PostMapping("/users/login")
//    public ResponseMessage login(@RequestBody LoginForm loginForm) {
//
//        User user = userRepository.findByName(loginForm.getName());
//
//        if (user != null) {
//            if (user.getPassword().equals(loginForm.getPassword())) {
//                UUID userKeyUuid = UUID.randomUUID();
//                String userKeyString = userKeyUuid.toString();
//                System.out.println(userKeyString);
//
//                user.setOnline(true).setUserKey(userKeyString);
//                userRepository.save(user);
//
//                JsonObject data = new JsonObject();
//                data.put(USERKEY, userKeyString);
//
//                // generate WebSocket Connection
//
//                return new ResponseMessage(SUCCESS, loginForm.getName() + " logged in!", data);
//            } else {
//                return new ResponseMessage(FAILED, "Wrong user-password!", new JsonObject());
//            }
//        } else {
//            return new ResponseMessage(FAILED, loginForm.getName() + " can't logged in!", new JsonObject());
//        }
//    }
//
//    /**
//     * logout with an available user
//     *
//     * @param userKey userKey of the user
//     * @return rest answer
//     */
//    @PostMapping("/users/logout")
//    public ResponseMessage logout(@RequestHeader(value = USERKEY) String userKey) {
//
//        for (User user : userRepository.findAll()) {
//            System.out.println(user.getName() + " : " + user.getUserKey());
//        }
//
//        User user = userRepository.findByUserKey(userKey);
//        if (user != null) {
//            if (user.isOnline()) {
//                // disconnect WebSocket Connection
//
//                user.setOnline(false).setUserKey(null);
//                userRepository.save(user);
//
//                // generate WebSocket Connection
//
//                return new ResponseMessage(SUCCESS, "Logged out", new JsonObject());
//            } else {
//                return new ResponseMessage(FAILED, "User is offline!", new JsonObject());
//            }
//        } else {
//            return new ResponseMessage(FAILED, "You can't logged out!", new JsonObject());
//        }
//    }
}