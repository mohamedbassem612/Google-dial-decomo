package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aaba {
    public static final com.google.android.gms.common.Feature a;
    public static final com.google.android.gms.common.Feature b;
    public static final com.google.android.gms.common.Feature c;
    public static final com.google.android.gms.common.Feature[] d;

    static {
        com.google.android.gms.common.Feature feature = new com.google.android.gms.common.Feature("CLIENT_TELEMETRY", -1, 1L, true);
        a = feature;
        com.google.android.gms.common.Feature feature2 = new com.google.android.gms.common.Feature("CLIENT_NOTIFICATION_TELEMETRY", -1, 1L, true);
        b = feature2;
        com.google.android.gms.common.Feature feature3 = new com.google.android.gms.common.Feature("CLIENT_THROTTLING_TELEMETRY", -1, 1L, true);
        c = feature3;
        d = new com.google.android.gms.common.Feature[]{feature, feature2, feature3};
    }
}
