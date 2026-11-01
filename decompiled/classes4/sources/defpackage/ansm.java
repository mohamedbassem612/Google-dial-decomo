package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
final class ansm {
    static final int a = 16384;
    private static final java.util.Queue b = new java.util.concurrent.LinkedBlockingQueue(8);

    static void a(byte[] bArr) {
        if (bArr.length == a) {
            b.offer(bArr);
        }
    }

    static byte[] b() {
        return c(a);
    }

    static byte[] c(int i) {
        byte[] bArr;
        return (i != a || (bArr = (byte[]) b.poll()) == null) ? new byte[i] : bArr;
    }
}
