package es.upm.miw.apiArchitectureSports.wrappers;


    import java.util.ArrayList;
    import java.util.List;

    public class UserListWrapper {
            List<UserWrapper> userList;

            
            public UserListWrapper() {
                userList = new ArrayList<>();
            }

            public List<UserWrapper> getsportList() {
                return userList;
            }

            public void addUserWrapper(UserWrapper UserWrapper){
                userList.add(UserWrapper);
            }

            @Override
            public String toString() {
                return "UserListWrapper [userList=" + userList + "]";
            }
    }
