package com.example.glow_by_fw;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface ApiInterface {


    // Define All API Interface and methods here and we will access these methods in our activities or fragments.

    /**
     * For Users
     */

    /**
     * Send OTP To User
     * Method .post
     * Required Params
     * 1. Phone Number
     */
    @POST("user/send/otp")
    Call<ResponseBody> SendOTP(@Query("phone_number") String phone_number);


    /**
     * Register A User API Interface
     * Method .post
     * Required Parameters list
     * 1. email
     * 2. username
     * 3. role
     * 4. password
     * URL is created in config file and we will add remaining url part in the following method.
     */

    @POST("user/register")
    Call<ResponseBody> UserRegister(@Query("email")String email, @Query("username")String username, @Query("role")String role, @Query("password")String password);

    /**
     * For Vendor
     */


}
