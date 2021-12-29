<pre>
<img src="" width="300">
</pre>

<h1 align="center">
    EasyEmptyListState
</h1>

<p align="center">
    <a><img src="https://img.shields.io/badge/Version-1.0.0-brightgreen.svg?style=flat"></a>
    <a><img src="https://img.shields.io/badge/ID-gzeinnumer-blue.svg?style=flat"></a>
    <a><img src="https://img.shields.io/badge/Java-Suport-green?logo=java&style=flat"></a>
    <a><img src="https://img.shields.io/badge/kotlin-Suport-green?logo=kotlin&style=flat"></a>
    <a href="https://github.com/gzeinnumer"><img src="https://img.shields.io/github/followers/gzeinnumer?label=follow&style=social"></a>
    <br>
    <p>Easy Recyclerview Empty State View.</p>
</p>

---
# Content List
* [Download](#download)
* [Feature List](#feature-list)
* [Tech stack and 3rd library](#tech-stack-and-3rd-library)
* [Usage](#usage)
* [Example Code/App](#example-codeapp)
* [Version](#version)
* [Contribution](#contribution)

---
# Download
Add maven `jitpack.io` and `dependencies` in `build.gradle (Project)` :
```gradle
// build.gradle project
allprojects {
  repositories {
    ...
    maven { url 'https://jitpack.io' }
  }
}

// build.gradle app/module
dependencies {
  ...
  implementation 'com.github.gzeinnumer:EasyRangeSeekBar:version'
}
```

---
# Feature List

- [x] [No Nested](#No Nested)
- [x] [Nested](#Nested)

#
#### No Nested
```java
DummyAdapterV2 adapter = new DummyAdapterV2();
EasyEmptyList easyEmptyList = findViewById(R.id.easy_empty_list);
easyEmptyList.rv.setAdapter(adapter);
easyEmptyList.rv.hasFixedSize();
easyEmptyList.rv.setLayoutManager(new LinearLayoutManager(this));

//use list.size();
//if size == 0 , R.drawable.no_data_custom will SHOW RecyclerView will HIDE
//if size > 0, R.drawable.no_data_custom will HIDE RecyclerView will SHOW
easyEmptyList.setSize(1);
easyEmptyList.setImageEmpty(R.drawable.no_data_custom);
```
```xml
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout
    ...
    android:layout_width="match_parent"
    android:layout_height="match_parent">

    <com.gzeinnumer.eels.EasyEmptyList
        android:id="@+id/easy_empty_list"
        android:layout_width="match_parent"
        android:layout_height="match_parent"/>
</LinearLayout>
```

#
#### Nested
```java
DummyAdapterV2 adapter = new DummyAdapterV2();
EasyEmptyList easyEmptyList = findViewById(R.id.easy_empty_list);
easyEmptyList.rv.setAdapter(adapter);
easyEmptyList.rv.hasFixedSize();
easyEmptyList.rv.setLayoutManager(new LinearLayoutManager(this));

//use list.size();
//if size == 0 , R.drawable.no_data_custom will SHOW RecyclerView will HIDE
//if size > 0, R.drawable.no_data_custom will HIDE RecyclerView will SHOW
easyEmptyList.setSize(1);
easyEmptyList.setImageEmpty(R.drawable.no_data_custom);
easyEmptyList.rv.setNestedScrollingEnabled(true); // enable nested
```

```xml
<?xml version="1.0" encoding="utf-8"?>
<androidx.core.widget.NestedScrollView
    ...
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:fillViewport="true">

    <LinearLayout
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        android:orientation="vertical">

        <com.gzeinnumer.eels.EasyEmptyList
            android:id="@+id/easy_empty_list"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:layout_weight="1" />
    </LinearLayout>
</androidx.core.widget.NestedScrollView>
```

---
# Example Code/App

[MainActivity.java](https://github.com/gzeinnumer/EasyRangeSeekBar/blob/master/app/src/main/java/com/gzeinnumer/easyrangeseekbar/MainActivity.java)
[activity_main.xml](https://github.com/gzeinnumer/EasyRangeSeekBar/blob/master/app/src/main/res/layout/activity_main.xml)

[Sample Code And App](https://github.com/gzeinnumer/EasyRangeSeekBarExample)

---
# Version
- **1.0.0**
  - First Release

---
# Contribution
You can sent your constribution to `branch` `open-pull`.

### Fore More [All My Library](https://github.com/gzeinnumer#my-library-list)

---

```
Copyright 2021 M. Fadli Zein
```