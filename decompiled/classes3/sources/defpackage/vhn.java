package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class vhn extends java.io.FilterInputStream implements j$.io.InputStreamRetargetInterface {
    final /* synthetic */ defpackage.vho a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vhn(defpackage.vho vhoVar, java.io.InputStream inputStream) {
        super(inputStream);
        j$.util.Objects.requireNonNull(vhoVar);
        this.a = vhoVar;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws java.io.IOException {
        super.close();
        this.a.a.delete();
    }

    @Override // java.io.InputStream
    public final /* synthetic */ long transferTo(java.io.OutputStream outputStream) {
        return j$.io.DesugarInputStream.transferTo(this, outputStream);
    }
}
