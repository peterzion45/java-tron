package org.tron.core.config;

import lombok.Getter;

public class Parameter {

  public enum ForkBlockVersionEnum {
    ENERGY_LIMIT(5),
    VERSION_3_2_2(6),
    VERSION_3_5(7),
    VERSION_3_6(8),
    VERSION_3_6_5(9),
    VERSION_3_6_6(10),
    VERSION_4_0(15);

    @Getter
    private int value;

    ForkBlockVersionEnum(int value) {
      this.value = value;
    }
  }

  public static class ChainSymbol {

    public static final byte[] TRX_SYMBOL_BYTES = "_".getBytes(); // TRX symbol
  }

  public class ChainConstant {

    public static final int MAX_ACTIVE_WITNESS_NUM = 27;
    public static final int WITNESS_STANDBY_LENGTH = 127;
    public static final long TRANSFER_FEE = 0; // free
    public static final int BLOCK_PRODUCED_INTERVAL = 3000; //ms,produce block period, must be divisible by 60. millisecond
    public static final int MAX_VOTE_NUMBER = 30;
    public static final int SOLIDIFIED_THRESHOLD = 70; // 70%
    public static final int PRIVATE_KEY_LENGTH = 64;
    public static final int BLOCK_SIZE = 2_000_000;
    public static final long CLOCK_MAX_DELAY = 3600000; // 3600 * 1000 ms
    public static final int BLOCK_PRODUCE_TIMEOUT_PERCENT = 50; // 50%
    public static final long PRECISION = 1_000_000;
    public static final long WINDOW_SIZE_MS = 24 * 3600 * 1000L;
    public static final long MAINTENANCE_SKIP_SLOTS = 2;
    public static final int SINGLE_REPEAT = 1;
    public static final int BLOCK_FILLED_SLOTS_NUMBER = 128;
    public static final int MAX_FROZEN_NUMBER = 1;
    public static final int BLOCK_VERSION = 15;
    public static final long FROZEN_PERIOD = 86_400_000L;
    public static final long TRX_PRECISION = 1000_000L;
  }

  public class NodeConstant {

    public static final int MAX_TRANSACTION_PENDING = 2000;
    public static final int MAX_HTTP_CONNECT_NUMBER = 50;
  }

  public class NetConstants {

    public static final long SYNC_FETCH_BATCH_NUM = 2000;
    public static final long ADV_TIME_OUT = 20000L;
    public static final long SYNC_TIME_OUT = 5000L;
    public static final long NET_MAX_TRX_PER_SECOND = 700L;
    public static final int MSG_CACHE_DURATION_IN_BLOCKS = 5;
    public static final int MAX_BLOCK_FETCH_PER_PEER = 100;
    public static final int MAX_TRX_FETCH_PER_PEER = 1000;
  }

  public class DatabaseConstants {

    public static final int TRANSACTIONS_COUNT_LIMIT_MAX = 1000;
    public static final int PROPOSAL_COUNT_LIMIT_MAX = 1000;
    public static final int EXCHANGE_COUNT_LIMIT_MAX = 1000;
  }

  public class AdaptiveResourceLimitConstants {

    public static final int CONTRACT_RATE_NUMERATOR = 99;
    public static final int CONTRACT_RATE_DENOMINATOR = 100;
    public static final int EXPAND_RATE_NUMERATOR = 1000;
    public static final int EXPAND_RATE_DENOMINATOR = 999;
    public static final int PERIODS_MS = 60_000;
    public static final int LIMIT_MULTIPLIER = 1000; //s
  }


  @Deprecated
  public class ForkBlockVersionConsts {

    public static final int START_NEW_TRANSACTION = 4;
    public static final int ENERGY_LIMIT = 5;
  }

}