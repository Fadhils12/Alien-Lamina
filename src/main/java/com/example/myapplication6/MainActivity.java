package com.example.myapplication6;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";

    private final ArrayList<String> name = new ArrayList<>();
    private final ArrayList<String> imageUrl = new ArrayList<>();
    private final ArrayList<String> desc = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate: started.");

        data();
    }

    private void data() {
        Log.d(TAG, "initImageBitmaps: preparing bitmaps.");

        imageUrl.add("https://cdn.idntimes.com/content-images/community/2020/02/03-f70d7dc20cbf96e9f745a7b26b39d2e3.jpg");
        name.add("Iguana Laut");
        desc.add("Iguana laut (Amblyrhynchus cristatus)adalah spesies iguana yang hanya ditemukan di Kepulauan Galapagos (Ekuador). Di antara kadal modern, iguana laut adalah reptil laut yang memiliki kemampuan menyelam untuk mencari makan, makanan utamanya adalah ganggang laut, yang berada di dasar batu. [2] Jantan berukuran besar dapat menyelam untuk mencari ganggang, sementara betina dan jantan yang lebih kecil mencari makan saat air surut di zona intertidal.\n" +
                "\n" +
                "Mereka terutama hidup di koloni di pantai berbatu di mana mereka berjemur setelah menyelam di perairan yang relatif dingin atau zona intertidal, tetapi juga dapat dilihat di rawa-rawa, hutan bakau dan pantai. Jantan besar mempertahankan wilayah untuk waktu yang singkat, tetapi jantan kecil memiliki strategi pemuliaan lainnya. Setelah kawin, sang betina menggali lubang sarang di tanah tempat ia bertelur, membiarkannya menetas sendiri beberapa bulan kemudian.\n" +
                "\n" +
                "source : https://id.wikipedia.org/wiki/Iguana_laut");

        imageUrl.add("https://1.bp.blogspot.com/-VgDlf1oV-wE/XYEixSjFpNI/AAAAAAACv8U/FRjE50V7Ys4cowUeVAebLLRN9I_Pa3rPQCLcBGAsYHQ/s640/katak%2Bpinokio.jpg");
        name.add("Katak Pinokio ");
        desc.add("Katak pinokio atau katak pohon pinokio utara (Litoria pinocchio) adalah spesies katak dalam keluarga Hylidae.[1][2][3][4] Katak ini ditemukan di Pegunungan Foja Provinsi Papua di Indonesia oleh Konservasi Internasional dan Masyarakat Geografis Nasional selama Ekspedisi 2008, di mana secara tidak sengaja terlihat oleh Paul Oliver, seorang herpetologist.[5][6][7] Meskipun ditemukan pada tahun 2008, katak tersebut tetap tidak dideskripsikan dan telah lama dikenal sebagai \"katak Pinokio\" (tanpa nama ilmiah yang diberikan) hingga 2019, ketika akhirnya digambarkan sebagai Litoria pinocchio.[4] Katak ini dinamai Pinokio karena hidungnya dapat membesar dan mengembang dalam situasi tertentu.[3]\n" +
                "\n" +
                        "source : https://id.wikipedia.org/wiki/Katak_pinokio");


        imageUrl.add("https://cdn.idntimes.com/content-images/community/2018/09/9564c4bdf8a953f0768960922b173f26.jpg");
        name.add("Semut Panda");
        desc.add("Julukan semut panda memang tepat. Spesies tersebut memang menyerupai keduanya. Namun, jangan salah, spesies ini sama sekali bukan semut dan sama sekali bukan panda! E militaris adalah sejenis tawon tak bersayap yang memiliki sengatan kuat. Saking kuatnya, jenis ini juga dijuluki \"cow killer\", mampu melumpuhkan sapi. Meski memiliki penampilan lucu, spesies ini rupanya belum menarik banyak perhatian ilmuwan. Hingga saat ini, masih sedikit studi yang dilakukan. Sejauh ini, hanya diketahui bahwa spesies ini dideskripsikan pertama kali pada tahun 1938, ditemukan di Cile, serta identitasnya ternyata bukan semut.\n" +
                "\n" +
                "Artikel ini telah tayang di Kompas.com dengan judul \"Semut Panda, Serangga Menggemaskan dengan Sengatan Menakutkan\", Klik untuk baca: https://sains.kompas.com/read/2013/12/02/1334088/Semut.Panda.Serangga.Menggemaskan.dengan.Sengatan.Menakutkan.\n" +
                "Penulis : Yunanto Wiji Utomo\n" +
                "\n" +
                "Download aplikasi Kompas.com untuk akses berita lebih mudah dan cepat:\n" +
                "Android: https://bit.ly/3g85pkA\n" +
                "source : https://sains.kompas.com/read/2013/12/02/1334088/Semut.Panda.Serangga.Menggemaskan.dengan.Sengatan.Menakutkan");


        imageUrl.add("https://asset-a.grid.id/crop/0x0:0x0/700x465/photo/nationalgeographic/201802201565718_b.jpg");
        name.add("Gurita Dumbo");
        desc.add("Grimpoteuthis adalah genus dari gurita berpayung yang tinggal di zona pelagik yang juga dikenal sebagai Gurita Dumbo.[1] Nama 'Dumbo' diambil berdasarkan kemiripan mereka dengan karakter Film Disney Dumbo yang dirilis pada tahun 1941, memiliki sirip yang terlihat seperti telinga yang menonjol di mantel yang terletak di atas kedua bawah mata mereka. Ada 13 spesies yang telah terdaftar sebagai genus Grimpoteuthis.[2] Mereka biasanya memangsa Krustasea, Bivalvia, Cacing dan Copepoda.[1] Rata-rata spesies Grimpoteuthis memiliki jangka hidup 3 sampai 5 tahun.\n" +
                "\n" +
                "Semua spesies Grimpoteuthis hidup pada kedalaman 3,000 sampai 4,000 meter (9,800 sampai 13,100 kaki), beberapa ada yang hidup pada kedalaman lebih dari 7,000 meter (23,000 kaki) dibawah permukaan laut, yang diketahui sebagai gurita yang hidup dikedalaman laut paling dalam.[3] Meskipun ia berada diseluruh perairan dunia yang termasuk Selandia Baru, Australia, Monterey Bay, Oregon, Filipina, Martha's Vineyard, Papua Nugini, dan Azores, mereka sebenarnya salah satu spesies gurita langka. Gurita Dumbo terbesar yang pernah tercatat memiliki panjang tubuh sepanjang 1,8 meter (5,9 kaki) dan berat tubuh seberat 5,9 kilogram (13 lb).[4] Ukuran rata-rata panjang tubuh dari sebagian besar spesies adalah diantara 20-30 cm (7,9–12 inci). Berat rata-rata masih belum ditentukan.\n" +
                "\n" +
                "source : https://id.wikipedia.org/wiki/Grimpoteuthis");


        imageUrl.add("https://cf.shopee.co.id/file/2659b773549845e1477d7a52a37d2bfb");
        name.add("Kelelawar Putih Honduras");
        desc.add("Kelelawar Putih Honduras, spesies hewan yang memiliki penampilan bak boneka. Rata-rata panjang tubuh Kelelawar Putih Honduras adalah 3,7 hingga 4,7 cm yang menjadikannya sebagai kelelawar mungil. Kelelawar Putih Honduras memiliki mantel putih yang halus. Sedangkan telinga, wajah, hidung, bagian kaki, serta sayapnya berwarna oranye cerah. Selain itu, keunikan kelelawar ini terdapat pada hidung yang menonjol dan berbentuk segitiga, sehingga para ilmuwan menyebutnya sebagai “kelelawar berhidung daun”. Terdapat pula selaput hitam tipis yang menutupi tengkorak mereka dan berfungsi untuk memberi perlindungan dari radiasi ultraviolet. \n" +
                "Melansir Rainforest Alliance, Kelelawar Putih Honduras hanya ditemukan di hutan hujan dataran rendah di Honduras Timur, Nikaragua Utara, Kostarika Timur, dan Panama Barat. Kecerdikan hewan ini mampu mendirikan “tenda” untuk tempat berlindung dengan memotong daun heliconia. Tumbuhan endemik Amerika Tengah itu membantu kelelawar putih honduras terlindung dari hujan, terik matahari dan pemangsa. Selain itu, batang tanaman heliconia tidak terlalu kuat, sehingga rentan sekali bergetar yang memungkinkan kelelawar untuk segera pergi ketika predator akan menyerang.\n" +
                "Predator yang menjadi musuh utama kelelawar putih honduras adalah ular, opossum, dan monyet tupai. Sedangkan untuk makanan, kelelawar putih honduras hanya mengonsumsi buah-buahan serta tumbuh-tumbuhan, terutama buah ara. Namun, kelelawar putih honduras tetap mencari jenis buah lainnya pada malam hari.\n" +
                "\n" +
                "source : https://kumparan.com/dasar-binatang/malah-bikin-gemas-ini-fakta-kelelawar-putih-honduras-yang-mungil-1txKz5UeK4r/full");

        imageUrl.add("https://3.bp.blogspot.com/-279nIkdhNq8/VYdudAaWfqI/AAAAAAAACKE/CkxT-HSgOjE/s1600/lobster-galaksi-indonesia-2.jpg");
        name.add("Lobster Galaksi");
        desc.add("Seorang ilmuwan Jerman, baru-baru ini menemukan seekor lobster paling indah di daerah Papua, Indonesia. Lobster 'Galaksi' (Cherax pulcher) yang masih berkerabat dengan udang dan lobster air tawar ini merupakan hewan asli Indonesia.\n" +
                "\n" +
                "Memiliki kulit terang yang penuh warna-warni, membuat lobster ini terlihat seperti awan nebula. Titik-titik putih di sekujur kulitnya, bagaikan bintang bertebaran di galaksi. Penemuan lobster oleh Christian Lukhaup ini dilatarbelakangi dengan kejadian ironis.\n" +
                "\n" +
                "Ternyata para pedagang hewan peliharaan telah mengetahui keberadaan lobster cantik ini dan telah diperjual belikan selama bertahun-tahun, tapi mereka tidak tahu (atau sengaja menutupi) asal lobster ini.\n" +
                "\n" +
                "source : https://www.viva.co.id/blog/international/641766-ilmuwan-temukan-lobster-galaksi-di-indonesia");


        imageUrl.add("https://lh3.googleusercontent.com/proxy/Jom3sqPullcNbmdQCGIv2t_o2ajABt4mhYaqt3HXINB2nvVpgjiIDayY7rHFIa3tRW5fADEGvWA-HwmDHwVRpGkOiUhsSVlFO6eMJ0tXAx0QYAft8976KH_zoS0G");
        name.add("Ili Pika");
        desc.add("Kelucuan hewan tersebut mendadak kondang setelah National Geographic menampilkan foto-fotonya. Potret binatang itu sontak beredar di internet.\n" +
                "\n" +
                "Ili Pika sejatinya sudah dikenal lebih dari 30 tahun oleh Li Weidong, 60. Pensiunan konservasionis itu melakukan misinya untuk mendokumentasikan dan melindungi binatang yang terancam punah.\n" +
                "\n" +
                "Dengan jumlah kurang dari 1.000 ekor, populasi mereka lebih langka dari panda.\n" +
                "\n" +
                "https://www.bbc.com/indonesia/majalah/2015/03/150327_majalah_kelinci_cina");


        imageUrl.add("https://blue.kumparan.com/image/upload/fl_progressive,fl_lossy,c_fill,q_auto:best,w_640/v1524121515/ce2qjbtnokgsisvevn7k.jpg");
        name.add("Monyet hidung melesak");
        desc.add("Memang ada banyak hal unik yang terjadi di dunia, termasuk beragamnya jenis flora dan fauna. Salah satu spesies yang unik adalah Snub Nosed Monkey atau monyet hidung pesek yang benar-benar memiliki hidung yang hampir rata dengan wajahnya!\n" +
                "Monyet hidung terpesek ini berasal dari Asia.\n" +
                "\n" +
                "Selain bentuk hidungnya yang unik, ternyata primata ini pun termasuk jenis primata tertua di dunia dari genus Rhinopithecus dan diberi namaÂ Rhinopithecus strykeri.\n" +
                "Sekalipun banyak tersebar di wilayah Asia, namun jenis monyet unik ini jarang diketahui keberadaan akibat jumlahnya yang sedikit. Selain itu, monyet tersebut memiliki habitat di hutan yang memiliki ketinggian di atas 4.000 meter.\n" +
                "Seperti namanya, monyet satu ini khas dengan ciri fisik khusus yang berhidung pesek dan hampir rata dengan wajahnya, bahkan lubang hidungnya pun menghadap ke depan.\n" +
                "Monyet dengan variasi bulu beragam!\n" +
                "\n" +
                "source : https://kumparan.com/tandaseru-tv/ada-monyet-hidung-terpesek-di-dunia-yang-mirip-manusia/full");


        imageUrl.add("https://rysarvian.files.wordpress.com/2011/03/ikan-bertangan-pink.jpg");
        name.add("Ikan pink bertangan");
        desc.add("\n" +
                "Tim peneliti gabungan dari University of Tasmania dan Reef Live Survey yang dipimpin oleh Antonia Cooper berhasil menemukan spesies ikan langka di lepas pantai tenggara Tasmania.\n" +
                "\n" +
                "Awalnya, mereka hampir menyerah karena tak menemukan tanda-tanda keberadaan ikan yang disebut handfish merah itu setelah menyelam selama tiga setengah jam. Namun ketika Cooper dengan setengah hati mengutak-atik sepotong ganggang liar, dia melihat sesuatu berwarna merah di air.\n" +
                "\n" +
                "\"Begitulah, saya menemukan handfish merah,\" kata Cooper dalam sebuah video. \"Itu sangat menggairahkan.\"\n" +
                "\n" +
                "Tim tersebut bergerak ke area yang lebih sempit. Di dalam bentangan terumbu karang seukuran lapangan badminton, mereka menemukan delapan handfish merah.\n" +
                "\n" +
                "Diberi nama karena siripnya yang berbentuk menyerupai tangan, Handfish merah merupakan penghuni zona bentik yang merayap di dasar lautan dengan tangannya. Ikan ini bisa tumbuh hingga sepanjang dua hingga lima inci, dan memangsa krustasesa kecil serta cacing. Handfish merah sebenarnya memiliki dua variasi warna: merah cerah dan corak kemerahan.\n" +
                "\n" +
                "Spesies ini termasuk salah satu ikan paling langka di dunia, ujar peneliti dari University of Tasmania, Rick Stuart Smith. Ikan yang sulit dipahami itu pertama kali terlihat di dekat Port Arthur di Semenajung Tasman pada 1800-an, Hingga kini, sekelompok handfish yang terdiri 20-40 individu diketahui tinggal di bentangan terumbu karang di dekat Teluk Frederick Hendry, Hobart.\n" +
                "\n" +
                "source : https://nationalgeographic.grid.id/read/13309331/handfish-ikan-bertangan-langka-ditemukan-di-tasmania");


        imageUrl.add("https://cdn1-production-assets-kly.akamaized.net/medias/1196269/big/066090500_1460084280-1187305-650-1460038947-kuznechik.jpg");
        name.add("Caedicia bermata pink");
        desc.add("Spesies yang ditemukan dalam famili Tettigoniidae dibedakan dari ensifera lain dengan adanya sayap depan yang dapat dijauhkan dari tubuh yang dimodifikasi untuk membantu mimikri daun dan akustik , serta ovipositor betina . [1] Secara umum, katydids memiliki antena yang sangat panjang sebanding dengan ukuran tubuhnya, serta tubuh yang silindris atau dikompresi secara lateral dengan 3 set kaki panjang dan kurus yang digunakan untuk lompat jarak jauh. Di antara semua katydids, Caedicia simplexdianggap sebagai spesies biasa-biasa saja dalam penampilan. Katydid taman umum sangat menyerupai daun kecil dalam penampilan dengan warna hijau seperti rumput, berukuran sekitar 4-6 cm saat dewasa. Pada tahap nimfa, bagaimanapun, C. simpleks kadang-kadang berwarna merah-merah muda cerah, tidak memiliki penampilan seperti daun dari rekan-rekan dewasa mereka. [2] Caedicia simplex memiliki kepala oval kecil yang jelas dengan penampilan hijau beludru dan mata merah oranye cerah. Pronotum beludru pada katydids taman umum jelas lunas, ditandai dengan garis kuning, memiliki margin berlekuk anterior dan posterior membulat. [3]\n" +
                "source : https://translate.google.com/translate?u=https://en.wikipedia.org/wiki/Caedicia_simplex&hl=id&sl=en&tl=id&client=srp&prev=search");


        dataRecyclerView();
    }

    private void dataRecyclerView() {
        Log.d(TAG, "initRecyclerView: init recyclerview.");
        RecyclerView recyclerView = findViewById(R.id.recyclerv_view);
        Adapter adapter = new Adapter(name, imageUrl, desc, this);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}