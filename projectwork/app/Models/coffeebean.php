<?php

namespace App\Models;

use Illuminate\Database\Eloquent\Factories\HasFactory;
use Illuminate\Database\Eloquent\Model;

class coffeebean extends Model
{
    use HasFactory;
    protected $table = 'coffeebean';
    protected $primaryKey = 'bean_id';
    protected $fillable = [
        'name',
        'region',
    ];
}
