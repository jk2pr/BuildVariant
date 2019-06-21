package com.jk.buildvariant

class DataViewModel {

    var data:ArrayList<Item> = arrayListOf(Item("Android"),Item("iOS"))

    var adapter=DataAdapter(data)



}
