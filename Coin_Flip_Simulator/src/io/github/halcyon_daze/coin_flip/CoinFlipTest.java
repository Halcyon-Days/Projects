package io.github.halcyon_daze.coin_flip;

import static org.junit.Assert.*;

import org.junit.Test;

public class CoinFlipTest {

    @Test
    public void test() {
        Coin coin = new Coin();
        
        coin.flipCoin(1);
        coin.flipCoin(2);
        coin.flipCoin(5);
        coin.flipCoin(10);
        coin.flipCoin(1000);
        coin.flipCoin(60000);
        coin.flipCoin(900000);
    }

}
