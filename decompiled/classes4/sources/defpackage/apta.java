package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public abstract class apta extends java.io.FilterInputStream implements j$.io.InputStreamRetargetInterface {
    protected apta(java.io.InputStream inputStream) {
        super(inputStream);
    }

    public abstract int d(defpackage.aptw aptwVar);

    @Override // java.io.InputStream
    public final /* synthetic */ long transferTo(java.io.OutputStream outputStream) {
        return j$.io.DesugarInputStream.transferTo(this, outputStream);
    }
}
