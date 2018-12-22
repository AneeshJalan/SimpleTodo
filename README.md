# Pre-work - *Simple Todo*

**Simple Todo** is an android app that allows building a todo list and basic todo items management functionality including adding new items, editing and deleting an existing item.

Submitted by: **Aneesh Jalan**

Time spent: **6** hours spent in total

## User Stories

The following **required** functionality is completed:

* [x] User can **successfully add and remove items** from the todo list
* [ ] User can **tap a todo item in the list and bring up an edit screen for the todo item** and then have any changes to the text reflected in the todo list.
* [x] User can **persist todo items** and retrieve them properly on app restart

The following **optional** features are implemented:

* [ ] Persist the todo items [into SQLite](http://guides.codepath.com/android/Persisting-Data-to-the-Device#sqlite) instead of a text file
* [ ] Improve style of the todo items in the list [using a custom adapter](http://guides.codepath.com/android/Using-an-ArrayAdapter-with-ListView)
* [ ] Add support for completion due dates for todo items (and display within listview item)
* [ ] Use a [DialogFragment](http://guides.codepath.com/android/Using-DialogFragment) instead of new Activity for editing items
* [ ] Add support for selecting the priority of each todo item (and display in listview item)
* [ ] Tweak the style improving the UI / UX, play with colors, images or backgrounds

The following **additional** features are implemented:

* [ ] List anything else that you can get done to improve the app functionality!

## Video Walkthrough

Here's a walkthrough of implemented user stories:

<img src='http://i.imgur.com/link/to/your/gif/file.gif' title='Video Walkthrough' width='' alt='Video Walkthrough' />

GIF created with [LiceCap](http://www.cockos.com/licecap/).

## Project Analysis

As part of your pre-work submission, please reflect on the app and answer the following questions below:

**Question 1:** "What are your reactions to the Android app development platform so far? Compare and contrast Android's approach to layouts and user interfaces in past platforms you've used."

**Answer:**
  
  The Android app development platform is very user friendly with the simple and elegant user interface and IDE, a wide selection of in-built helper classes to choose from and the conveniently integrable and modular approach to the various libraries.
  
  As a new Android developer, I have found that app development isn't as hard as it seemed to me. At CodePath was the first time that I started this journey and so I have very limited experience working on app development.
  However, due to the simple approach to app development in Android even this limited experiece has made me feel confident in that I can think of an app, I can successfully make it as well.
  Yet, there are some aspects of android development that are complex to understand (such as the implicit calls to a few functions and their execution) and it may take some time to get used to.


**Question 2:** "Take a moment to reflect on the `ArrayAdapter` used in your pre-work. How would you describe an adapter in this context and what is its function in Android? Why do you think the adapter is important? Explain the purpose of the `convertView` in the `getView` method of the `ArrayAdapter`."

**Answer:** 

  An adapter acts as the middleman in the sense that it allows easier integration of backend data structures with the UI aspect of the app.
  Using an adapter becomes a necessity when it comes to implementing a UI component that can be used with several data structures. In order for that to happen,each of the stored components in any data structure is "adapted" into a single common object type so that all of the data can be seamlessly displayed using a single type of UI component and that is exactly what an Adapter does.
  
  The parameter convertView is a crucial part of the function getView as it resolves which View must the given data be adapted to. If null, a new View is created to which the data is conformed. If non-null, convertView references a View that has been scrolled off-screen and so can be reused to display new data.
  

## Notes

Describe any challenges encountered while building the app.

## License

    Copyright [2018] [Aneesh Jalan]

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

        http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
