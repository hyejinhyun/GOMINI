package com.example.hyeji.gomini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    MyListAdapter myListAdapter;
    ArrayList<list_item> list_itemArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = (ListView)findViewById(R.id.my_listView);

        list_itemArrayList = new ArrayList<list_item>();

        list_itemArrayList.add(
                new list_item("https://lh3.googleusercontent.com/6ydRZrDUKujB1Ba2Tmn3-Hwjyiib8TlpDk8uefX3NqvNKz57gVnrIO4k83yUk6tQ29clJEZ7_6evZrIpvv-OpVDrzc-1-qNKipvuNcDYjO_zYO6APblnysPH95N76APPWVwv5CrO1PT0h26sIFrlJgeHs0B1aXnIpt_Hid-24iXLXmDm2iSBssDR-peEgKD7S5kU6pqxB8IUb6AgpEnmMu9OSqXbPZkNSVVBWvjOVKU2z8qlg3aLoC8HdKH0eRSBP9xhy_m-XtM1Vwo1_TRFzNAo-OG-klFay_Uvn5EzSdLo3kDAubAXSngUWRWwgcanZ4VGa-M-rWsthLt66wlDkN02SSF0yBvqi0xTm1eizXqLoHDIWecXBR6BI1rRYmR5JlJF6qy_13ycGB6qVwcywZZ3NC3pti3Znkvy3TwhIbb4TNbNikN60X47NjYWJo-9bBRDCmbaBhI4-x7MoNqf0z8b1oIR7CIR0_FHoIpaa1c7hlYjfZuTeeBuMr-tdCCKMk4dihHWaPqih-gPetgAyWOHd-RQNvPn8LcYGktMRA1CELCzfSjH0T_6A9xKClyhJjXg1_5KccA_a8b1JBqPvso8Hr108kU7G4HTfbADzvySZcw4GNgaAKZELPHWQI92-YexCN8v8zTwMnoLGw=w1577-h904-no",
                        "빨리 집에 가서 쉬고싶다."));
        list_itemArrayList.add(
                new list_item("https://lh3.googleusercontent.com/hvzjGpTmay1zGgJONLoO2mB8y_BEtuHEoPd-2TMvpN58NJrMjGVol8LIHfxLM_8hy2wA4PvaIsIg0DLSC7KW-Ywi1C3-pFrPo8MNS22r-17acJfB4UjZYuBTgHLoDUDjv3xfOOBQ_CTOUpf1fHvKKCE0K2Ik-JhgFLVragqv_BKLMB3GjLkBSUdaJCkZHQhpmDWuZghIgR7Uc4mKNsiCm_3RxT6daLS5WxiDTvW0hNZVNf5Ef1w-YXqXgR6MGPWo8Px0daJUAbQ9ugV3Q2gbdeuWtEYm1wZQvStcH6cTGjQRfGvALANaJw1krbcsuNBfwBBJgGnOQeqINzAvSAhTXBf_hNyoqsl-lDQVR5FpJZN9uNlmlTM3pi5USSIech_ZWMaH3pZu-VyXmgovJgqEhYvuD3m7pLT6DA87x0C5ZDwKDaqBQ-PEsA7LWC_3BpqMvLYifWUn-zUJ-EuIjMBBMeUeWBOhv6wV-akk77y7Lf3z3wIZ1pF04omkODEdh63FN3WCIHM4uzw5_NUhh8MgevvNzOGwHGXpsbLrP_WM36HIRb3QjBzS4tQnXs_WOcB5aN3fKhX3fqKejmQ_HZhiyQXnwjkdZelpUog-Cogrydx5PaxGBW2ZFJfEgAVOQlXkzkZSAknyTOl8ssZ83g=w1664-h904-no",
                        "오늘을 힘든 날이었지만 고미니가 뽑아준 카드에 위로를 받았다.\n 누군가 수고했다고 말해주는 것만으로도 힘이 되는 것 같다."));
        list_itemArrayList.add(
                new list_item("https://lh3.googleusercontent.com/6ydRZrDUKujB1Ba2Tmn3-Hwjyiib8TlpDk8uefX3NqvNKz57gVnrIO4k83yUk6tQ29clJEZ7_6evZrIpvv-OpVDrzc-1-qNKipvuNcDYjO_zYO6APblnysPH95N76APPWVwv5CrO1PT0h26sIFrlJgeHs0B1aXnIpt_Hid-24iXLXmDm2iSBssDR-peEgKD7S5kU6pqxB8IUb6AgpEnmMu9OSqXbPZkNSVVBWvjOVKU2z8qlg3aLoC8HdKH0eRSBP9xhy_m-XtM1Vwo1_TRFzNAo-OG-klFay_Uvn5EzSdLo3kDAubAXSngUWRWwgcanZ4VGa-M-rWsthLt66wlDkN02SSF0yBvqi0xTm1eizXqLoHDIWecXBR6BI1rRYmR5JlJF6qy_13ycGB6qVwcywZZ3NC3pti3Znkvy3TwhIbb4TNbNikN60X47NjYWJo-9bBRDCmbaBhI4-x7MoNqf0z8b1oIR7CIR0_FHoIpaa1c7hlYjfZuTeeBuMr-tdCCKMk4dihHWaPqih-gPetgAyWOHd-RQNvPn8LcYGktMRA1CELCzfSjH0T_6A9xKClyhJjXg1_5KccA_a8b1JBqPvso8Hr108kU7G4HTfbADzvySZcw4GNgaAKZELPHWQI92-YexCN8v8zTwMnoLGw=w1577-h904-no","내용3"));

        myListAdapter = new MyListAdapter(MainActivity.this,list_itemArrayList);
        listView.setAdapter(myListAdapter);
    }
}
