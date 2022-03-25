package com.example.fee_management_new;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.navigation.NavController;
import androidx.navigation.NavDestination;
import androidx.navigation.fragment.NavHostFragment;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.example.fee_management_new.Api.AllSettlementsResponse;
import com.example.fee_management_new.Api.ApiClient;
import com.example.fee_management_new.Api.ApiService;
import com.example.fee_management_new.Api.CancelRequestResponse;
import com.example.fee_management_new.Api.DeleteRequestResponse;
import com.example.fee_management_new.Api.DownloadInvoiceResponse;
import com.example.fee_management_new.Api.DownloadReportResponse;
import com.example.fee_management_new.Api.FeeManagement;
import com.example.fee_management_new.Api.GeneratePaymentForClassRequest;
import com.example.fee_management_new.Api.GeneratePaymentForClassResponse;
import com.example.fee_management_new.Api.GeneratePaymentForIndividualRequest;
import com.example.fee_management_new.Api.GeneratePaymentForIndividualResponse;
import com.example.fee_management_new.Api.GetGroupStandardsResponse;
import com.example.fee_management_new.Api.GetTransactionDetailsByIdResponse;
import com.example.fee_management_new.Api.GetUserInClassResponse;
import com.example.fee_management_new.Api.Io;
import com.example.fee_management_new.Api.ItemAllSett;
import com.example.fee_management_new.Api.SendReminderResponse;
import com.example.fee_management_new.Api.TransactionByUserResponse;
import com.example.fee_management_new.Api.UpdateOfflineTransactionRequest;
import com.example.fee_management_new.Api.UpdateOfflineTransactionResponse;
import com.example.fee_management_new.Api.UpdateSettingPostRequest;
import com.example.fee_management_new.Api.UpdateSettingPostResponse;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

public class MainActivity extends AppCompatActivity {
    NavController navController;
    AppBarConfiguration appBarConfiguration;
    BottomNavigationView bottomNavigationView;
    UpdateSettingPostRequest updateSettingPostRequest;
    UpdateSettingPostResponse updateSettingPostResponse;
    GeneratePaymentForClassResponse generatePaymentForClassResponse;
    GeneratePaymentForClassRequest generatePaymentForClassRequest;
    GeneratePaymentForIndividualRequest generatePaymentForIndividualRequest;
    GeneratePaymentForIndividualResponse generatePaymentForIndividualResponse;
    UpdateOfflineTransactionRequest updateOfflineTransactionRequest;
    UpdateOfflineTransactionResponse updateOfflineTransactionResponse;
    GetTransactionDetailsByIdResponse getTransactionDetailsByIdResponse;
    DownloadReportResponse downloadReportResponse;
    GetGroupStandardsResponse getGroupStandardsResponse;
    List<GetUserInClassResponse> getUserInClassResponse;
    DownloadInvoiceResponse downloadInvoiceResponse;
    TransactionByUserResponse transactionByUserResponse;
    CancelRequestResponse cancelRequestResponse;
    DeleteRequestResponse deleteRequestResponse;
    SendReminderResponse sendReminderResponse;
    AllSettlementsResponse allSettlementsResponse;

    Retrofit retrofit;
    ApiService apiService;
    int c = 0;
    ConstraintLayout parent_layout;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        NavHostFragment navHostFragment = (NavHostFragment) getSupportFragmentManager().findFragmentById(R.id.activity_main_nav_host_fragment);
        navController = navHostFragment.getNavController();
        parent_layout = findViewById(R.id.Parent_layout);
        bottomNavigationView = findViewById(R.id.activity_main_bottom_navigation_view);

        NavigationUI.setupWithNavController(bottomNavigationView, navController);
        //Toolbar

        appBarConfiguration = new AppBarConfiguration.Builder(navController.getGraph()).build();
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        NavigationUI.setupWithNavController(toolbar, navController, appBarConfiguration);
//        parent_layout.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                c++;
//                if (c % 2 == 0) {
//                  bottomNavigationView.setVisibility(View.VISIBLE);
//                } else {
//                    bottomNavigationView.setVisibility(View.GONE);
//                }
//
//            }
//        });

//        CoordinatorLayout.LayoutParams layoutParams = (CoordinatorLayout.LayoutParams) bottomNavigationView.getLayoutParams();
//        layoutParams.setBehavior(new BottomNavBehivaour());



        navController.addOnDestinationChangedListener(new NavController.OnDestinationChangedListener() {
            @Override
            public void onDestinationChanged(@NonNull NavController navController, @NonNull NavDestination navDestination, @Nullable Bundle bundle) {
                if (navDestination.getId() == R.id.generatePaymentRequest) {
                    bottomNavigationView.setVisibility(View.GONE);
                } else if (navDestination.getId() == R.id.addOfflinePayment){
                    bottomNavigationView.setVisibility(View.GONE);

                }else if (navDestination.getId() == R.id.transaction){
                    bottomNavigationView.setVisibility(View.GONE);
                }else {
                    bottomNavigationView.setVisibility(View.VISIBLE);
                }
            }
        });
        apiInIt();
//        updateSetting();
//        generatePaymentClass();
//        generatePaymentIndivi();
//        updateOfflineTransaction();
//        transactionDetailById();
//        downloadReport();
//        groupStandard();
//        getUserInClass();
//        downloadInvoice();
//        cancelRequest();
//        deleteRequest();
//        sendReminder();
        allSettlements();

    }
    public void apiInIt() {

        retrofit = ApiClient.getRetrofit();
        apiService = ApiClient.getApiService();

    }
    public void updateSetting()
    {

        updateSettingPostRequest= new UpdateSettingPostRequest("student");
        Call<UpdateSettingPostResponse> call=apiService.updateSettingCall(updateSettingPostRequest);
        call.enqueue(new Callback<UpdateSettingPostResponse>() {
            @Override
            public void onResponse(Call<UpdateSettingPostResponse> call, Response<UpdateSettingPostResponse> response) {
                if(!response.isSuccessful())
                {
                    Toast.makeText(getApplicationContext(), response.code(), Toast.LENGTH_SHORT).show();
                }
                updateSettingPostResponse=response.body();
                Toast.makeText(getApplicationContext(), String.valueOf(updateSettingPostResponse.show.message), Toast.LENGTH_SHORT).show();

            }

            @Override
            public void onFailure(Call<UpdateSettingPostResponse> call, Throwable t) {
                Toast.makeText(getApplicationContext(), "error update setting", Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void generatePaymentClass()
    {
        generatePaymentForClassRequest=new GeneratePaymentForClassRequest(419,"2021-01-27",5,"5","Hello world");
        Call<GeneratePaymentForClassResponse> call=apiService.generatePaymentClassCall(generatePaymentForClassRequest);
        call.enqueue(new Callback<GeneratePaymentForClassResponse>() {
            @Override
            public void onResponse(Call<GeneratePaymentForClassResponse> call, Response<GeneratePaymentForClassResponse> response) {
                if(!response.isSuccessful())
                {
                    Toast.makeText(getApplicationContext(), response.code(), Toast.LENGTH_SHORT).show();
                }
                generatePaymentForClassResponse=response.body();
                Toast.makeText(getApplicationContext(), String.valueOf(generatePaymentForClassResponse.show.message), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onFailure(Call<GeneratePaymentForClassResponse> call, Throwable t) {
                Toast.makeText(getApplicationContext(), "Error in generate class", Toast.LENGTH_SHORT).show();
            }
        });
    }
    public void generatePaymentIndivi()
    {
        List<Integer> userId=new ArrayList<>() ;
        userId.add(339);
        generatePaymentForIndividualRequest=new GeneratePaymentForIndividualRequest(3,"asdfe5rygh465tuy","online","null","[{\\\"name\\\":\\\"wqd2e\\\",\\\"amount\\\":\\\"1\\\",\\\"details\\\":\\\"1wdr234wer\\\"}","null","2022-03-31",userId,30);
        Call<GeneratePaymentForIndividualResponse> call=apiService.generatePaymentIndiviCall(generatePaymentForIndividualRequest);
        call.enqueue(new Callback<GeneratePaymentForIndividualResponse>() {
            @Override
            public void onResponse(Call<GeneratePaymentForIndividualResponse> call, Response<GeneratePaymentForIndividualResponse> response) {
                if(!response.isSuccessful())
                {
                    Toast.makeText(getApplicationContext(), response.code(), Toast.LENGTH_SHORT).show();
                }
                generatePaymentForIndividualResponse=response.body();
                Toast.makeText(getApplicationContext(), String.valueOf(generatePaymentForIndividualResponse.show.message), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onFailure(Call<GeneratePaymentForIndividualResponse> call, Throwable t) {
                Toast.makeText(getApplicationContext(), "Error payment individual", Toast.LENGTH_SHORT).show();
            }
        });
    }
    public void updateOfflineTransaction()
    {
        updateOfflineTransactionRequest=new UpdateOfflineTransactionRequest(816,"UPI","SBIN6473248383");
        Call<UpdateOfflineTransactionResponse> call=apiService.updateOffTransactionCall(updateOfflineTransactionRequest);
        call.enqueue(new Callback<UpdateOfflineTransactionResponse>() {
            @Override
            public void onResponse(Call<UpdateOfflineTransactionResponse> call, Response<UpdateOfflineTransactionResponse> response) {
                if(!response.isSuccessful())
                {
                    Toast.makeText(getApplicationContext(), response.code(), Toast.LENGTH_SHORT).show();
                }
                updateOfflineTransactionResponse=response.body();
                Toast.makeText(getApplicationContext(), String.valueOf(updateOfflineTransactionResponse.show.message), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onFailure(Call<UpdateOfflineTransactionResponse> call, Throwable t) {
                Toast.makeText(getApplicationContext(), "error update offline transaction", Toast.LENGTH_SHORT).show();
            }
        });
    }
    public void transactionDetailById()
    {
        Call<GetTransactionDetailsByIdResponse> call=apiService.transactionDetailCall();
        call.enqueue(new Callback<GetTransactionDetailsByIdResponse>() {
            @Override
            public void onResponse(Call<GetTransactionDetailsByIdResponse> call, Response<GetTransactionDetailsByIdResponse> response) {
                if(!response.isSuccessful())
                {
                    Toast.makeText(getApplicationContext(), response.code(), Toast.LENGTH_SHORT).show();
                }
                getTransactionDetailsByIdResponse=response.body();
                Toast.makeText(getApplicationContext(), String.valueOf(getTransactionDetailsByIdResponse.id), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onFailure(Call<GetTransactionDetailsByIdResponse> call, Throwable t) {
                Toast.makeText(getApplicationContext(), "error get transaction ", Toast.LENGTH_SHORT).show();
            }
        });
    }
    public void downloadReport()
    {
        Call<DownloadReportResponse> call=apiService.downloadReportCall("yeartodate","json");
        call.enqueue(new Callback<DownloadReportResponse>() {
            @Override
            public void onResponse(Call<DownloadReportResponse> call, Response<DownloadReportResponse> response) {
                if(!response.isSuccessful())
                {
                    Toast.makeText(getApplicationContext(), response.code(), Toast.LENGTH_SHORT).show();
                }
                downloadReportResponse=response.body();
                Toast.makeText(getApplicationContext(), String.valueOf(downloadReportResponse.file), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onFailure(Call<DownloadReportResponse> call, Throwable t) {

            }
        });
    }
    public void groupStandard()
    {
        Call<GetGroupStandardsResponse> call=apiService.standardsCall();
        call.enqueue(new Callback<GetGroupStandardsResponse>() {
            @Override
            public void onResponse(Call<GetGroupStandardsResponse> call, Response<GetGroupStandardsResponse> response) {
                if(!response.isSuccessful())
                {
                    Toast.makeText(getApplicationContext(), response.code(), Toast.LENGTH_SHORT).show();
                }
                getGroupStandardsResponse=response.body();
                FeeManagement response1=getGroupStandardsResponse.feeManagement.get(0);
                Toast.makeText(getApplicationContext(),String.valueOf(response1.std ), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onFailure(Call<GetGroupStandardsResponse> call, Throwable t) {
                Toast.makeText(getApplicationContext(), "error group standard", Toast.LENGTH_SHORT).show();
            }
        });
    }
    public void getUserInClass()
    {
        Call<List<GetUserInClassResponse>> call=apiService.getUserInClassCall(405,"");
        call.enqueue(new Callback<List<GetUserInClassResponse>>() {
            @Override
            public void onResponse(Call<List<GetUserInClassResponse>> call, Response<List<GetUserInClassResponse>> response) {
                if(!response.isSuccessful())
                {
                    Toast.makeText(getApplicationContext(), response.code(), Toast.LENGTH_SHORT).show();
                }
                getUserInClassResponse=response.body();
                GetUserInClassResponse response1=getUserInClassResponse.get(0);
                Toast.makeText(getApplicationContext(), String.valueOf(response1.email), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onFailure(Call<List<GetUserInClassResponse>> call, Throwable t) {
                Toast.makeText(getApplicationContext(), "Error get user", Toast.LENGTH_SHORT).show();
            }
        });
    }
    public void downloadInvoice()
    {
        Call<DownloadInvoiceResponse> call=apiService.downloadInvoiceCall();
        call.enqueue(new Callback<DownloadInvoiceResponse>() {
            @Override
            public void onResponse(Call<DownloadInvoiceResponse> call, Response<DownloadInvoiceResponse> response) {
                if(!response.isSuccessful())
                {
                    Toast.makeText(getApplicationContext(), response.code(), Toast.LENGTH_SHORT).show();
                }
                downloadInvoiceResponse=response.body();
                Toast.makeText(getApplicationContext(), downloadInvoiceResponse.name, Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onFailure(Call<DownloadInvoiceResponse> call, Throwable t) {
                Toast.makeText(getApplicationContext(), "error download invoice", Toast.LENGTH_SHORT).show();
            }
        });
    }
    public void cancelRequest()
    {
        Call<CancelRequestResponse> call=apiService.cancelReqCall();
        call.enqueue(new Callback<CancelRequestResponse>() {
            @Override
            public void onResponse(Call<CancelRequestResponse> call, Response<CancelRequestResponse> response) {
                if(!response.isSuccessful())
                {
                    Toast.makeText(getApplicationContext(), response.code(), Toast.LENGTH_SHORT).show();
                }
                cancelRequestResponse=response.body();
                Toast.makeText(getApplicationContext(), cancelRequestResponse.show.message, Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onFailure(Call<CancelRequestResponse> call, Throwable t) {
                Toast.makeText(getApplicationContext(), "cancel request error", Toast.LENGTH_SHORT).show();
            }
        });
    }
    public void deleteRequest()
    {
        Call<DeleteRequestResponse> call=apiService.deleteReqCall();
        call.enqueue(new Callback<DeleteRequestResponse>() {
            @Override
            public void onResponse(Call<DeleteRequestResponse> call, Response<DeleteRequestResponse> response) {
                if(!response.isSuccessful())
                {
                    Toast.makeText(getApplicationContext(),response.code(), Toast.LENGTH_SHORT).show();
                }
                deleteRequestResponse=response.body();
                Toast.makeText(getApplicationContext(), deleteRequestResponse.show.message, Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onFailure(Call<DeleteRequestResponse> call, Throwable t) {
                Toast.makeText(getApplicationContext(), "error delete request", Toast.LENGTH_SHORT).show();
            }
        });
    }
    public void sendReminder()
    {
        Call<SendReminderResponse> call=apiService.sendReminderCall(508,828);
        call.enqueue(new Callback<SendReminderResponse>() {
            @Override
            public void onResponse(Call<SendReminderResponse> call, Response<SendReminderResponse> response) {
                if(!response.isSuccessful())
                {
                    Toast.makeText(getApplicationContext(), response.code(), Toast.LENGTH_SHORT).show();
                }
                sendReminderResponse=response.body();
                Toast.makeText(getApplicationContext(), sendReminderResponse.show.message, Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onFailure(Call<SendReminderResponse> call, Throwable t) {
                Toast.makeText(getApplicationContext(), "error send reminder", Toast.LENGTH_SHORT).show();
            }
        });
    }
    public void allSettlements()
    {
        Call<AllSettlementsResponse> call=apiService.allSettleCall(1,100);
        call.enqueue(new Callback<AllSettlementsResponse>() {
            @Override
            public void onResponse(Call<AllSettlementsResponse> call, Response<AllSettlementsResponse> response) {
                if(!response.isSuccessful())
                {
                    Toast.makeText(getApplicationContext(), response.code(), Toast.LENGTH_SHORT).show();
                }
                allSettlementsResponse=response.body();
                ItemAllSett response1=allSettlementsResponse.items.get(0);
                Toast.makeText(getApplicationContext(), response1.status, Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onFailure(Call<AllSettlementsResponse> call, Throwable t) {
                Toast.makeText(getApplicationContext(), "error all settlement", Toast.LENGTH_SHORT).show();
            }
        });
    }
    @Override
    public boolean onSupportNavigateUp() {
        return navController.navigateUp();
//        return NavigationUI.navigateUp(navController,appBarConfiguration);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.tool_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
//        navController = Navigation.findNavController(this, R.id.activity_main_nav_host_fragment);
        return NavigationUI.onNavDestinationSelected(item, navController)
                || super.onOptionsItemSelected(item);

    }


}