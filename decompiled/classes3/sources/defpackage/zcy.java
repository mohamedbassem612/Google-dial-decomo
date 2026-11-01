package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class zcy {
    public static final defpackage.zcy a;
    public static final defpackage.zcy b;
    public static final defpackage.zcy c;
    public static final defpackage.zcy d;
    private static final aimz e;
    private static final /* synthetic */ defpackage.zcy[] f;

    static {
        defpackage.zcy zcyVar = new defpackage.zcy("AUDIO_ONLY", 0);
        a = zcyVar;
        defpackage.zcy zcyVar2 = new defpackage.zcy("BIDIRECTIONAL", 1);
        b = zcyVar2;
        defpackage.zcy zcyVar3 = new defpackage.zcy("RX_ONLY", 2);
        c = zcyVar3;
        defpackage.zcy zcyVar4 = new defpackage.zcy("TX_ONLY", 3);
        d = zcyVar4;
        f = new defpackage.zcy[]{zcyVar, zcyVar2, zcyVar3, zcyVar4};
        e = aimz.i("com/google/android/callingshared/incall/core/video/VideoState");
    }

    public static defpackage.zcy a(android.telecom.Call call) {
        return b(call.getDetails().getVideoState());
    }

    public static defpackage.zcy b(int i) {
        int i2 = i & (-5);
        if (i2 != 0) {
            if (i2 == 1) {
                return d;
            }
            if (i2 == 2) {
                return c;
            }
            if (i2 == 3) {
                return b;
            }
            e.c().m(aioa.b).i(zct.b).l("com/google/android/callingshared/incall/core/video/VideoState", "fromTelecomVideoProfileState", 39, "VideoState.java").w("unknown state %d", i);
        }
        return a;
    }

    public static defpackage.zcy[] values() {
        return (defpackage.zcy[]) f.clone();
    }

    public final boolean c() {
        int iOrdinal = ordinal();
        return iOrdinal == 1 || iOrdinal == 2 || iOrdinal == 3;
    }

    public final boolean d() {
        int iOrdinal = ordinal();
        return iOrdinal == 2 || iOrdinal == 3;
    }

    public final boolean e() {
        int iOrdinal = ordinal();
        return iOrdinal == 1 || iOrdinal == 2;
    }

    public final boolean f() {
        int iOrdinal = ordinal();
        return iOrdinal == 1 || iOrdinal == 3;
    }
}
