package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class cjj {
    public static final long a;

    static {
        long id;
        try {
            id = android.os.Looper.getMainLooper().getThread().getId();
        } catch (java.lang.Exception unused) {
            id = -1;
        }
        a = id;
    }
}
