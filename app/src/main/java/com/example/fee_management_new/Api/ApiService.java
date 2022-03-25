package com.example.fee_management_new.Api;

import java.util.Date;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface ApiService {
    String token = "Authorization:Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpZCI6MTEzMywicGhvbmUiOiIrOTE5ODEyMTY4NTk5IiwidXJsIjoidGVzdC50aGVjbGFzc3Jvb20uYml6Iiwib3JnSWQiOiI0Y2IyNTA5ZC03MGY1LTQzNWUtODc5Mi1kMjQ5Mzc3NDNiNTMiLCJicm93c2VyTG9naW5Db2RlIjoiKzkxOTgxMjE2ODU5OTExMzM3Y2ZiOWE5Ny1iN2FlLTRhMDctYjI2OS0yNmYyZDk3NDczYjUiLCJkZXZpY2VMb2dpbkNvZGUiOm51bGwsImlhdCI6MTY0NjgwMzIxM30.dg4fn5RhRFjohWB94Ao3vHYgXbYpOBBK5CRsZf45OEQ";
    String link = "orgurl:test.theclassroom.biz";

    @Headers({token, link})
    @GET("feev2")
    Call<OverViewResponse> OVER_VIEW_RESPONSE_CALL(@Query("startDate")String startDate,@Query("endDate")String endDate,@Query("type")String type);

    @Headers({token, link})
    @POST("feev2/updateSettings")
    Call<UpdateSettingPostResponse> updateSettingCall(@Body UpdateSettingPostRequest updateSettingPostRequest);

    @Headers({token, link})
    @POST("feev2/standard")
    Call<GeneratePaymentForClassResponse> generatePaymentClassCall(@Body GeneratePaymentForClassRequest generatePaymentForClassRequest);

    @Headers({token, link})
    @POST("feev2")
    Call<GeneratePaymentForIndividualResponse> generatePaymentIndiviCall(@Body GeneratePaymentForIndividualRequest generatePaymentForIndividualRequest);

    @Headers({token, link})
    @POST("feev2/update-offline-transactions")
    Call<UpdateOfflineTransactionResponse> updateOffTransactionCall(@Body UpdateOfflineTransactionRequest updateOfflineTransactionRequest);

    @Headers({token, link})
    @GET("feev2/transaction/870")
    Call<GetTransactionDetailsByIdResponse> transactionDetailCall();

    @Headers({token, link})
    @GET("feev2/download-report")
    Call<DownloadReportResponse>  downloadReportCall(@Query("filter") String filter,@Query("format") String format);

    @Headers({token, link})
    @GET("feev2/byStandards")
    Call<GetGroupStandardsResponse>  standardsCall();

}
