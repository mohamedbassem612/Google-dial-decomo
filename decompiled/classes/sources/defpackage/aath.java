package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aath {
    public static final com.google.android.gms.common.Feature a;
    public static final com.google.android.gms.common.Feature b;
    public static final com.google.android.gms.common.Feature c;
    public static final com.google.android.gms.common.Feature d;
    public static final com.google.android.gms.common.Feature[] e;

    static {
        com.google.android.gms.common.Feature feature = new com.google.android.gms.common.Feature("get_last_reset_time_api", -1, 1L, true);
        a = feature;
        com.google.android.gms.common.Feature feature2 = new com.google.android.gms.common.Feature("get_dwid_api", -1, 1L, true);
        b = feature2;
        com.google.android.gms.common.Feature feature3 = new com.google.android.gms.common.Feature("set_dwid_api", -1, 1L, true);
        c = feature3;
        com.google.android.gms.common.Feature feature4 = new com.google.android.gms.common.Feature("get_conduit_proxy_dwid_api", -1, 1L, false);
        d = feature4;
        e = new com.google.android.gms.common.Feature[]{feature, feature2, feature3, feature4};
    }
}
