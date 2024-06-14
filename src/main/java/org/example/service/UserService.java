package org.example.service;


import org.example.model.listUsers.Root;
import org.example.model.post.UserRequest;
import org.example.model.post.UserResponse;
import org.example.model.singleUser.SingleRoot;
import retrofit2.Call;
import retrofit2.http.*;

public interface UserService {

    @GET("/api/users")
    Call<Root> getUsers(@Query("page") int id);

    @GET("/api/users/{id}")
    Call<SingleRoot> getUserById(@Path("id") int id);

    @POST("/api/users")
    Call<UserResponse> createUser(@Body UserRequest userRequest);

    @DELETE("/api/users/{id}")
    Call<Void> deleteUser(@Path("id")int id);
}
