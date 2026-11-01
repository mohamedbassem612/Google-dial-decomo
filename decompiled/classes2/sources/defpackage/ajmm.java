package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ajmm {
    public static final defpackage.ajst a = defpackage.ajst.b(new byte[0]);
    public final long[] b;
    public final java.util.List[] c;
    public final java.util.List d;

    public ajmm(long[] jArr, java.util.List[] listArr, java.util.List list) {
        this.b = jArr;
        this.c = listArr;
        this.d = list;
    }

    public static long a(byte[] bArr) {
        return ((((long) bArr[0]) & 255) << 32) | ((((long) bArr[1]) & 255) << 24) | ((((long) bArr[2]) & 255) << 16) | ((((long) bArr[3]) & 255) << 8) | (((long) bArr[4]) & 255);
    }
}
