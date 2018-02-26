# ChartView
## PieView
### 使用
gradle
```
  implementation 'com.jimmylee.chartview:pieview:0.0.1'
```
布局文件添加
```
    <com.jimmylee.pieview.PieView
        android:id="@+id/pieView"
        android:layout_width="100dp"
        android:layout_height="100dp"
        app:backgroundColor="#e5e5e5"
        app:startAngle="138" />
```
java引用
```java
        PieView pieView = findViewById(R.id.pieView);

        List<Part> parts = new ArrayList<>();
        parts.add(new Part(60, ContextCompat.getColor(this, R.color.colorPrimary)));
        parts.add(new Part(100, Color.GREEN));
        parts.add(new Part(100, Color.TRANSPARENT));
        parts.add(new Part(100, 0xffff0000));
        pieView.setParts(parts);
```
