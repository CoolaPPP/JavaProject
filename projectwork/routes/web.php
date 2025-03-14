<?php

use App\Http\Controllers\BeanController;
use App\Http\Controllers\LocateController;
use App\Http\Controllers\ProductController;
use Illuminate\Support\Facades\Route;

Route::get('/', function () {
    return view('welcome');

});
Route::get('/bean',[BeanController::class,'index']);
Route::get('/locate',[LocateController::class,'index'])->name('locate.index');
Route::get('/product',[ProductController::class,'index'])->name('product.index');

// ->name('bean.index')