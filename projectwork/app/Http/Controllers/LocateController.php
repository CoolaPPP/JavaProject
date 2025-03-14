<?php

namespace App\Http\Controllers;

use Illuminate\Http\Request;

class LocateController extends Controller
{
    public function index()
    {
        $locate = Locate::all();
        return view("locate.index", ["locate" => $locate]);
    }
}
