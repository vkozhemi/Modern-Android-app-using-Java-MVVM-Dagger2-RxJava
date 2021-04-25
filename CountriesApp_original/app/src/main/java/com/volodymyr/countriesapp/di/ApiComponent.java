package com.volodymyr.countriesapp.di;

import com.volodymyr.countriesapp.model.CountriesService;
import com.volodymyr.countriesapp.viewmodel.ListViewModel;

import dagger.Component;

@Component(modules = {ApiModule.class})
public interface ApiComponent {

    void inject(CountriesService service);

    void inject(ListViewModel viewModel);
}
