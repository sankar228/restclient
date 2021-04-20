package com.tmo.restclient.model;

import com.fasterxml.jackson.databind.annotation.JsonNaming;
import com.tmo.restclient.UpperCaseStrategy;
import lombok.Data;

@Data
@JsonNaming(UpperCaseStrategy.class)
public class Nokia5G {
    String DATE_PART;
    String BH;
    String MARKET;
    String CELL;
    double DL_TRAFFIC_MB;
    double UL_TRAFFIC_MB;
    double UL_MAC_CELL_THRPT_MBPS;
    double DL_MAC_CELL_THRPT_MBPS;
    double AVG_NR_NSA_USER;
    double AVG_DL_UE_THR_MBPS;
    double TRAFFIC_UL_MB;
    double TRAFFIC_DL_MB;
    double ACT_DL_UE;
    double ACT_UL_UE;
    double PRB_UTIL_PDSCH;
    double PRB_UTIL_PUSCH;
    double AVG_USERS;
    double AVG_ACTIVE_UE_DATA_BUFF_DL;
    double AVG_ACTIVE_UE_DATA_BUFF_UL;
    double MAX_ACT_UE_DL;
    double MAX_ACT_UE_UL;
    double ROW_NUM;
}
