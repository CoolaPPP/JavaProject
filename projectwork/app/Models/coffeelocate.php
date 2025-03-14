<?php

namespace App\Models;

use Illuminate\Database\Eloquent\Factories\HasFactory;
use Illuminate\Database\Eloquent\Model;

class coffeelocate extends Model
{
    use HasFactory;
    protected $table = "coffeelocate";
    protected $primaryKey = "locate_id";
    protected $fillable = [
        'name',
        'city',
        'country',
        'level',
    ];
}
