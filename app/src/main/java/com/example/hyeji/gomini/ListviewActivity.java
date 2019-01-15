package com.example.hyeji.gomini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ListviewActivity extends AppCompatActivity {
    ListView listView;
    ListviewAdapter myListAdapter;
    ArrayList<Listviewitem> list_itemArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        listView = (ListView)findViewById(R.id.my_listView);

        list_itemArrayList = new ArrayList<Listviewitem>();

        list_itemArrayList.add(
                new Listviewitem("https://lh3.googleusercontent.com/6ydRZrDUKujB1Ba2Tmn3-Hwjyiib8TlpDk8uefX3NqvNKz57gVnrIO4k83yUk6tQ29clJEZ7_6evZrIpvv-OpVDrzc-1-qNKipvuNcDYjO_zYO6APblnysPH95N76APPWVwv5CrO1PT0h26sIFrlJgeHs0B1aXnIpt_Hid-24iXLXmDm2iSBssDR-peEgKD7S5kU6pqxB8IUb6AgpEnmMu9OSqXbPZkNSVVBWvjOVKU2z8qlg3aLoC8HdKH0eRSBP9xhy_m-XtM1Vwo1_TRFzNAo-OG-klFay_Uvn5EzSdLo3kDAubAXSngUWRWwgcanZ4VGa-M-rWsthLt66wlDkN02SSF0yBvqi0xTm1eizXqLoHDIWecXBR6BI1rRYmR5JlJF6qy_13ycGB6qVwcywZZ3NC3pti3Znkvy3TwhIbb4TNbNikN60X47NjYWJo-9bBRDCmbaBhI4-x7MoNqf0z8b1oIR7CIR0_FHoIpaa1c7hlYjfZuTeeBuMr-tdCCKMk4dihHWaPqih-gPetgAyWOHd-RQNvPn8LcYGktMRA1CELCzfSjH0T_6A9xKClyhJjXg1_5KccA_a8b1JBqPvso8Hr108kU7G4HTfbADzvySZcw4GNgaAKZELPHWQI92-YexCN8v8zTwMnoLGw=w1577-h904-no",
                        "빨리 집에 가서 쉬고싶다."));
        list_itemArrayList.add(
                new Listviewitem("https://lh3.googleusercontent.com/hvzjGpTmay1zGgJONLoO2mB8y_BEtuHEoPd-2TMvpN58NJrMjGVol8LIHfxLM_8hy2wA4PvaIsIg0DLSC7KW-Ywi1C3-pFrPo8MNS22r-17acJfB4UjZYuBTgHLoDUDjv3xfOOBQ_CTOUpf1fHvKKCE0K2Ik-JhgFLVragqv_BKLMB3GjLkBSUdaJCkZHQhpmDWuZghIgR7Uc4mKNsiCm_3RxT6daLS5WxiDTvW0hNZVNf5Ef1w-YXqXgR6MGPWo8Px0daJUAbQ9ugV3Q2gbdeuWtEYm1wZQvStcH6cTGjQRfGvALANaJw1krbcsuNBfwBBJgGnOQeqINzAvSAhTXBf_hNyoqsl-lDQVR5FpJZN9uNlmlTM3pi5USSIech_ZWMaH3pZu-VyXmgovJgqEhYvuD3m7pLT6DA87x0C5ZDwKDaqBQ-PEsA7LWC_3BpqMvLYifWUn-zUJ-EuIjMBBMeUeWBOhv6wV-akk77y7Lf3z3wIZ1pF04omkODEdh63FN3WCIHM4uzw5_NUhh8MgevvNzOGwHGXpsbLrP_WM36HIRb3QjBzS4tQnXs_WOcB5aN3fKhX3fqKejmQ_HZhiyQXnwjkdZelpUog-Cogrydx5PaxGBW2ZFJfEgAVOQlXkzkZSAknyTOl8ssZ83g=w1664-h904-no",
                        "오늘을 힘든 날이었지만 고미니가 뽑아준 카드에 위로를 받았다.\n 누군가 수고했다고 말해주는 것만으로도 힘이 되는 것 같다."));
        list_itemArrayList.add(
                new Listviewitem("https://lh3.googleusercontent.com/UF_Jgrf_qcy5TeosH5Ea226tWqQIAF1-eAnowd8nwvzoOzOKoIUimX7FMsUZvGfv5GYqKo2H4o2vSBEe2FhGZZCCl3_8Sj5mDxlAf9_RwB0sKeNJlfjY4X14jUc9EWxhsFPlWQvVObhJo58cHyrtdkixKx59iaOm9gxIl_JKgAh9V7Up9h3XRVSktg0tMo7hUE10ME8887dZaYF2UNJcx2rKU8E7Tb_LP4ei7Yy1CSB9j-m36UwvLkR1iM1hz--MyJPkYWNf8VPY4rLAXUIdPVuRdKed2q7m7DAzgDbcXWSYXVx4-HcOET5yzcpjqf4_rqZ8px_9hZVxw-4-JNPwhC7GLqVYtFN4xDWxPlH-ZzHhyUFpeo1T1R6MGjPUjwaF4cB2bOQ1poidinv4NTWKgNVaIHr0BSL0zbjeyeX1XJNP3axw3b3p8ge04wrFYeIT6RzqV_vR3TPahNKBbRDX6hsaicw75PzX89NrCKezYVrS_uoHMiC133log7hkaXSna2lpi-oBeHZLmkiJmb1Rf7hmKPhABn0fSsEDNScS467Gq4k-8J5iW8CeDGNEhpD8REoI-F2Q3lcq4kXmzNT9aYtPVP2_oTcVdYJospFwL-ZIaB3PJavLV-Ac5MrNrBye8x6j16DTiopLEbUdTg=w828-h518-no",
                        "행복은 야옹하는 고양이다."));
        list_itemArrayList.add(
                new Listviewitem("https://lh3.googleusercontent.com/mA64_UasJo1AhTegVGDhN7p2o_cmIYT7OQnj2FW1T8H3r--FVOD_Cva3R3zMtQd-5nSFOMfmpBs-_Atz9-7IY5RJg8lGb9npJEjgEbmmKK1ndbmn4tbSZfCk2uX-seHycJHxDJbvoxLLtv3pWbjETMejZvvQ8Ukemf1u3bAoKAbBc9CXNCqTqnPM6vMnMs7SKoIXY3mOs2p4QsXxLRXzCBDqQq6nhx24DmZnUO0E7lTSzww8Uej4RzrAd6E4KHoPK59M-sc8mU6o059RIr0P0DE9ewdUzd_73AwO55OxEdmUF9NEE2ow5hfAG_N7-Vt_bxEhNCKhghiPmlc21461ZYVhvoOOQ37nwUs6yaD-A85quVm1GufwVwLGjceOH5zBmyt1of_vlhn82PIrRtiha3fiTEiyVTSj313LYmWUBL06xMe7hy0x_g0i1d37FkILZcWuKbDWqxSczlJuD7SiPTa9EZlWA1qbVzOovkqGGZa2LftXQiIOiTeq8wQV3nXAXUTnH8qmtIDrMDSKmXbrEqbjzGhiqPrMdk0CPTWNCGqA04HWIaUnaLxykuCUKCee5vhTd-6OrPRs0eP-vpVph4oyGS0ErpHlpxzoeTgfsLUqGQg4aDSepltmw1XY8gWX3W2lvlrtoHN92yp7lA=w828-h553-no",
                        "너는 내게로 와 꽃이 되었다."));
        list_itemArrayList.add(
                new Listviewitem("https://lh3.googleusercontent.com/tFmThxmmtB2dSVed-0RLZLQfbvD90sh_HoX4VLmIAPG4NRzPbw0DfLZUdzSZpbtrhO3QO04hOq91ttXX-1upNO0eOcMashzMhiiay2a4PYuXnwgoGV1THP5-wMslbOHChF3iUCBrgA3hx3VNbu5xAcVe-yEH3g6RRKMrwJh6otqgybrYn9CV-gZwFtwOS3lQQCmNhmpZXIrdIFiSlM3UDa63STcXM28z-n-ICVqHHvJaZpmHInYxoQaJuIL6bubLUIRfst0hscrvj_qqG1GQ5ILddbrU0V1-gIWeSCNbE7QQAzFiTQVhfe2AN7mKCBlFl3JiEIeYQz0IiJ3Wgus0NhRcYqMRT6-CkWB2DZmoboJHflhaEKzL5gvEiGlk5cVWgQKpCMUKPpaN5aqk9YcDMBcPurVeBBgJSH_GUm5VpqAX8EnrP2UTEHR498ycA-uKSOy-q2ol-aiipp36705DFLtYltbk3tWnwLVUExTkpa_qPHS3RmmDGSpCYwiZ-cGMXefO9BdKok_qhcbjQfz-0Xh4RklNPG0son22Bv_4UJSIBUAgpLOFBPWh4FXfHs1I5Z11sDaiz3Xk1oTwZvFaRLGMKTQdDlQON51DPTPyF5h3ARC_h6NWHX85chmYucawLNUWpb7IR6h897KLew=w828-h552-no",
                        "시작한 이상 끝은 생각하지 말자."));




        myListAdapter = new ListviewAdapter(this,list_itemArrayList);
        listView.setAdapter(myListAdapter);
    }
}
