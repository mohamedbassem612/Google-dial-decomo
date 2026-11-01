package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class fdb {
    public static final boolean a;
    public final java.util.UUID b;
    public final byte[] c;

    static {
        boolean z = false;
        if ("Amazon".equals(android.os.Build.MANUFACTURER) && ("AFTM".equals(android.os.Build.MODEL) || "AFTB".equals(android.os.Build.MODEL))) {
            z = true;
        }
        a = z;
    }

    @java.lang.Deprecated
    public fdb(java.util.UUID uuid, byte[] bArr) {
        this.b = uuid;
        this.c = bArr;
    }
}
