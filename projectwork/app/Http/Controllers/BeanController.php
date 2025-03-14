<?php

namespace App\Http\Controllers;

use Illuminate\Http\Request;
use App\Models\coffeebean;

class BeanController extends Controller
{
    public function index()
    {
        $bean = coffeebean::all();
        return view("bean.index", ["bean" => $bean]);
    }
}
