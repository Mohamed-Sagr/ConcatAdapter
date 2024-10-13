package com.sagr.concatexample

import com.sagr.concatexample.model.Banner
import com.sagr.concatexample.model.Contact
import com.sagr.concatexample.model.User


object DataSource {

    fun getUser() = ArrayList<User>().apply {
        add(User(1, "Himanshu", "https://s3.amazonaws.com/uifaces/faces/twitter/sunlandictwin/128.jpg"))
        add(User(2, "Alford Hoeger", "https://s3.amazonaws.com/uifaces/faces/twitter/mufaddal_mw/128.jpg"))
        add(User(3, "Terrance Halvorson", "https://s3.amazonaws.com/uifaces/faces/twitter/mufaddal_mw/128.jpg"))
        add(User(3, "Morgan McGlynn", "https://s3.amazonaws.com/uifaces/faces/twitter/allfordesign/128.jpg"))
        add(User(4, "Ms. Ramiro DuBuque", "https://s3.amazonaws.com/uifaces/faces/twitter/shaneIxD/128.jpg"))
        add(User(5, "Kolby Orn", "https://s3.amazonaws.com/uifaces/faces/twitter/johnsmithagency/128.jpg"))
        add(User(6, "Elijah Schoen MD", "https://s3.amazonaws.com/uifaces/faces/twitter/alxndrustinov/128.jpg"))

    }

    fun getBanner() = Banner(R.drawable.publication_site_cover)

    fun getNewContacts() = listOf(
        Contact(1, "John Doe", "https://example.com/johndoe.jpg"),
        Contact(2, "Jane Smith", "https://example.com/janesmith.jpg"),
        Contact(3, "Sam Wilson", "https://example.com/samwilson.jpg")
    )
}


