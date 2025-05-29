Studi Kasus: Perusahaan Logistik dan Jalur Pengiriman

Perusahaan logistik ini memiliki 5 gudang :

* Gudang A (0)
* Gudang B (1)
* Gudang C (2)
* Gudang D (3)
* Gudang E (4)

Dengan 7 jalur sebagai berikut:

(A → B) → (0 → 1)

(A → C) → (0 → 2)

(B → D) → (1 → 3)

(C → D) → (2 → 3)

(C → E) → (2 → 4)

(D → E) → (3 → 4)

(E → A) → (4 → 0)

> Breadth-First Search (BFS)
Urutan Penelusuran:
A → B → C → D → E
(0 → 1 → 2 → 3 → 4)

Penjelasan:

BFS menggunakan struktur queue (antrian) untuk menjelajah secara melebar.

*Mulai dari simpul A (0), simpul-simpul tetangga langsung yaitu B (1) dan C (2) dimasukkan ke antrian.

*Kemudian lanjut ke B (1) yang menjangkau D (3).

*Setelah itu, dari C (2) ke E (4).

*Semua simpul telah dikunjungi, traversal selesai.

Ciri BFS adalah menjelajahi tetangga terdekat terlebih dahulu sebelum bergerak lebih dalam.



> Depth-First Search (DFS)
Urutan Penelusuran:
A → B → D → E → C
(0 → 1 → 3 → 4 → 2)

Penjelasan:

DFS menggunakan rekursi atau stack dan bergerak sedalam mungkin di satu cabang sebelum beralih ke cabang lain.

*Dari simpul A (0), DFS menjelajah ke B (1), lalu ke D (3), kemudian ke E (4).

*Setelah mencapai ujung, DFS kembali mundur dan lanjut ke C (2), yang belum dikunjungi.

*Traversal selesai setelah semua simpul dikunjungi.

Ciri DFS adalah masuk lebih dalam terlebih dahulu sebelum menyelesaikan simpul lainnya.



