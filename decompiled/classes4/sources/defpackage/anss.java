package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
final class anss {
    final java.io.InputStream a = null;
    final byte[] b;
    final int c;
    final boolean d;

    public anss(byte[] bArr, int i, boolean z) {
        this.b = bArr;
        this.c = i;
        this.d = z;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("TransactionData[");
        sb.append(this.c);
        sb.append("b array");
        sb.append(true != this.d ? "]" : "(last)]");
        return sb.toString();
    }
}
