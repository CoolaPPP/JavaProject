@extends('bean.layout')
@section('title','แสดงข้อมูล Coffee Bean')
@section('content')
    <div class="container">
        <table class="table table-striped">
        <thead>
        <tr>
            <th scope="col">ID</th>
            <th scope="col">Name</th>
            <th scope="col">Region</th>
        </tr>
        </thead>
        <tbody>
            @foreach ($bean as $item)
            <tr>
                <td>{{$item->bean_id}}</td>
                <td>{{$item->name}}</td>
                <td>{{$item->region}}</td>
            </tr>
            @endforeach
        </tbody>
        </table>
    </div>
@endsection
