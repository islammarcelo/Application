package data;

import java.util.List;

import pojo.PostModel;
import retrofit2.Call;
import retrofit2.http.GET;

public interface PostInterface {
    @GET("posts")
    public Call<List<PostModel>> getPost();
}
