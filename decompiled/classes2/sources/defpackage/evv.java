package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class evv {
    public final android.net.Uri a;
    public final int b;
    public final byte[] c;
    public final java.util.Map d;
    public final long e;
    public final long f;
    public final int g;

    static {
        defpackage.equ.b("media3.datasource");
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [boolean, int] */
    public evv(android.net.Uri uri, int i, byte[] bArr, java.util.Map map, long j, int i2) {
        ?? r0 = ((j > 0L ? 1 : (j == 0L ? 0 : -1)) ^ (-1)) >>> 31;
        ahvr.bM((boolean) r0);
        ahvr.bM((boolean) r0);
        ahvr.ci(uri);
        this.a = uri;
        this.b = i;
        this.c = (bArr == null || bArr.length == 0) ? null : bArr;
        this.d = j$.util.DesugarCollections.unmodifiableMap(new java.util.HashMap(map));
        this.e = j;
        this.f = -1L;
        this.g = i2;
    }

    public static java.lang.String a(int i) {
        if (i == 1) {
            return "GET";
        }
        if (i == 2) {
            return "POST";
        }
        throw new java.lang.IllegalStateException();
    }

    public final boolean b(int i) {
        return (this.g & i) == i;
    }

    public final java.lang.String toString() {
        android.net.Uri uri = this.a;
        return "DataSpec[" + a(this.b) + ' ' + uri.toString() + ", " + this.e + ", -1, null, " + this.g + ']';
    }
}
