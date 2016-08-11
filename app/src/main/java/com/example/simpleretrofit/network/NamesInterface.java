package com.example.simpleretrofit.network;

import com.example.simpleretrofit.entities.Student;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface NamesInterface {

    //1. Add dependencies
    //2. add base URL - after domain name
    @GET("/v2/57a4dfb40f0000821dc9a3b8")
    Call<ArrayList<Student>> retrieveStudents();

    @GET("/v2/57ab95a1120000c12173b6d4")
    Call<ArrayList<Student>> retrieveStudentsImages();
}
