# Laporan Praktikum Pertemuan 14 - Tree
oleh: Maria Fadilla - 2141720063 (17 / TI-1G)

---
## Latihan dan Jawaban Pertanyaan

### **6.2 Searching/Pencarian Menggunakan Algoritma Sequential Search**
> **Percobaan .2.1**
- Kode Program
    <img src = "image_1.png">
    <img src = "image_2.png">
    <img src = "image_3.png">
    <img src = "image_4.png">

> **Hasil Percobaan .2.2**
- Hasil Run Program
    <img src = "image_run1.png">
    <img src = "image_run2.png">

> **Jawaban Pertanyaan**
1. Mengapa dalam binary search tree proses pencarian data bisa lebih efektif dilakukan dibanding binary tree biasa?
- Karena dalam binary search tree left-child (anak kiri) sudah ditentukan harus lebih kecil daripada right-child (anak kanan) dan parentnya agar apabila ada pencarian node lebih mudah. Jika nilai node yang dicari lebih kecil daripada node pada tree yang ditunjuk saat itu, maka pencarian akan mengarah ke left-child dan jika lebih besar akan mengarah ke right-child.

2. Untuk apakah di class Node, kegunaan dari atribut left dan right?
- Untuk menunjukkan leftchild dan rightchild dari sebuah node.

3. a. Untuk apakah kegunaan dari atribut root di dalam class BinaryTree?
- root di dalam class BInaryTree digunakan untuk menyimpan data parent.
b. Ketika objek tree pertama kali dibuat, apakah nilai dari root?
- ketika objek tree pertama kali dibuat, nilai root pertama kali diset null.

4. Ketika tree masih kosong, dan akan ditambahkan sebuah node baru, proses apa yang akan terjadi?
- Ketika tree masih kosong dan akan ditambahkan node baru, maka node baru yang akan ditambahkan tersebut akan menjadi root.

5. Perhatikan method add(), di dalamnya terdapat baris program seperti di bawah ini. Jelaskan secara detil untuk apa baris program tersebut?
```java
     if(data< current.data){
                if(current.left!=null){
                    current=current.left;
                }else{
                    current.left=new Node(data);//node baru sbg leftchild root
                    break;
                }
```
- Jika data yang akan ditambahkan lebih kecil dari current, maka setelah itu akan dilakukan pengecekan apakah current memiliki left-child ataukah tidak. Jika ada, maka current baru berada di left child dari current awal. Jika tidak ada, maka data yang akan ditambahkan akan menjadi node baru yang bertindak sebgai leftchild dari current awal.

-----------------
```
```
1. Apakah kegunaan dari atribut data dan idxLast yang ada di class BinaryTreeArray?
- Atribut data digunakan untuk menyimpan data dalam array, sedangkan idxLast untuk menyimpan indeks terakhir dari data pada array.

2. Apakah kegunaan dari method populateData()?
- Method `populateData()` digunakan agar bisa mengisi data dalam bentuk array dan indeks terakhir pada array

3. Apakah kegunaan dari method traverseInOrder()?
-  Kegunaan dari method `traverseInOrder()` adalah untuk mencetak penelusuran seluruh node secara inorder, yaitu dengan menecetak seluruh data pada subtree kiri dulu baru setelah itu menecetak root dan mencetak subtree kanan.

4. Jika suatu node binary tree disimpan dalam array indeks 2, maka di indeks berapakah posisi left child dan rigth child masing-masing?
- Left child = 2 x 2 + 1 = 5 
- Right child = 2 x 2 + 2 = 6

5. Apa kegunaan statement int idxLast = 6 pada praktikum 2 percobaan nomor 4? 
- Kegunaan statement `int idxLast = 6` ialah untuk menunjukkan bahwa indeks terakhir hanya sampai di indeks ke-6

-------
```
```
## Menambahkan Node Secra Rekursif
- Kode Program dan Output
<img src = "imagea_1.png">
<img src = "imagea_run1.png">
## Menampilkan nilai paling kecil dan paling besar di tree
- Kode Program dan Output
<img src = "imageb_2.png">
<img src = "imageb_run2.png">
## Menampilkan data Leaf
- Kode Program dan Output
<img src = "imagec_3.png">
<img src = "imagec_run3.png">
## Menampilkan jumlah Leaf
- Kode Program dan Output
<img src = "imaged_4.png">
<img src = "imaged_run4.png">
## Method add, traversePreOrder, traversePostOrder di BinaryTreeArray
- Kode Program dan Output
<img src = "imagee_5.png">
<img src = "imagee_run5.png">

### **Latihan Praktikum**
1.
> Kode Program

<img src = "imageprak_.png">

> Hasil Running

<img src = "imageprak_run.png">

