package com.example.siddhant.myappfinal.api;

import com.example.siddhant.myappfinal.models.Comments;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by siddhant on 05-07-2017.
 */

public interface CommentsAPI {
    @GET("/users/{postId}/comments")
    Call<ArrayList<Comments>> getCommentsById(
            @Path("postId") int PostId
    );
}
