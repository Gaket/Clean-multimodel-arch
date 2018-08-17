package com.example.scanner.di;

import com.example.core.data.db.DbClient;
import com.example.core.data.network.HttpClient;
import com.example.core.utils.SomeUtils;
import com.example.purchase_api.domain.PurchaseInteractor;

public interface ScannerFeatureDependencies {

    DbClient dbClient();
    HttpClient httpClient();
    SomeUtils someUtils();
    PurchaseInteractor purchaseInteractor();

}