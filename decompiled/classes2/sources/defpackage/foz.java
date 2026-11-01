package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class foz {
    public final byte[] a = new byte[8];
    public final java.util.ArrayDeque b = new java.util.ArrayDeque();
    public final defpackage.fpf c = new defpackage.fpf();
    public int d;
    public int e;
    public long f;
    public rai g;

    public final long a(defpackage.flk flkVar, int i) {
        byte[] bArr = this.a;
        ((defpackage.flc) flkVar).o(bArr, 0, i, false);
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            j = (j << 8) | ((long) (bArr[i2] & 255));
        }
        return j;
    }
}
