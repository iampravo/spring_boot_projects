package com.iampravo.apps.GraphQL.resolvers;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.iampravo.apps.GraphQL.enums.UserType;
import com.iampravo.apps.GraphQL.models.User;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class Query implements GraphQLQueryResolver {
    public List<User> users() {
        List<User> users = new ArrayList<User>();

        User user = new User();
        user.setUserId(15718);
        user.setUserName("Pravinkumar Singh");
        user.setUserType(UserType.PERMANENT);
        user.setUserAge(29);

        users.add(user);
        return users;
    }
}
