package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
final class aoab extends java.io.OutputStream {
    final /* synthetic */ defpackage.aoad a;

    public aoab(defpackage.aoad aoadVar) {
        j$.util.Objects.requireNonNull(aoadVar);
        this.a = aoadVar;
    }

    @Override // java.io.OutputStream
    public final void write(int i) {
        write(new byte[]{(byte) i}, 0, 1);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        this.a.c(bArr, i, i2);
    }
}
