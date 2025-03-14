<?php

namespace App\Models;

use Illuminate\Database\Eloquent\Factories\HasFactory;
use Illuminate\Database\Eloquent\Model;

class coffeeproduct extends Model
{
    use HasFactory;
    protected $table = "coffeeproduct";
    protected $primaryKey = "product_id";
    protected $fillable = [
        'name',
        'detail',
        'price',
    ];
}
