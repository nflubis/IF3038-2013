TUGAS BESAR PROGIN 5

Nurul Fithria Lubis	- 13510010
Tino Eka Krisna Sambora	- 13510062
Frilla Amanda		- 13510068


DOKUMENTASI PROTOKOL:

Sistem diimplementasikan berdasarkan tiga elemen dasar:
- Console (server)
- Client
- Serverthread (protocol)

Console merupakan sistem yang mengimplementasikan fungsi dan tugas server,
isinya berupa listener yang terus-menerus menunggu masukan dari client
untuk dimasukkan kedalam serverthread guna menangani banyak user.

Di dalam Serverthread, masukan diproses untuk melakukan fungsi-fungsi sistem:
login, logout, serta update.

1. Message yang dipertukarkan:
    - username dan password
    - task list seorang pengguna
    - task status seorang pengguna
    - update task dari pengguna
    - status pengguna (log in - log out)

2. Fitur yang diimplementasikan:
    - login secara mobile antara client-server
    - validasi login
    - membuat list dari seorang client yang sudah login beserta statusnya
    - multiple user
    - update task secara realtime