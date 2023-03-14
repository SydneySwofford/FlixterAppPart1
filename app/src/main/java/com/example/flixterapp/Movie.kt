package com.example.flixterapp

import com.google.gson.annotations.SerializedName

class Movie {
    @SerializedName("title")
    var title : String?=null

    @SerializedName("overview")
    var overview : String?=null

    @SerializedName("poster_path")
    var poster_path : String?=null
}