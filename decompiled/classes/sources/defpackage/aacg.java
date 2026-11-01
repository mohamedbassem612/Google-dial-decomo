package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
abstract class aacg extends defpackage.aahd {
    private static final java.lang.ref.WeakReference a = new java.lang.ref.WeakReference(null);
    private java.lang.ref.WeakReference b;

    public aacg(byte[] bArr) {
        super(bArr);
        this.b = a;
    }

    protected abstract byte[] a();

    @Override // defpackage.aahd
    public final byte[] eO() {
        byte[] bArrA;
        synchronized (this) {
            bArrA = (byte[]) this.b.get();
            if (bArrA == null) {
                bArrA = a();
                this.b = new java.lang.ref.WeakReference(bArrA);
            }
        }
        return bArrA;
    }
}
