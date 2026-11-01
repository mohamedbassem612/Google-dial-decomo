package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class dyb extends defpackage.dya {
    private final java.lang.Object a;

    public dyb(int i) {
        super(i);
        this.a = new java.lang.Object();
    }

    @Override // defpackage.dya, defpackage.dxz
    public final java.lang.Object a() {
        java.lang.Object objA;
        synchronized (this.a) {
            objA = super.a();
        }
        return objA;
    }

    @Override // defpackage.dya, defpackage.dxz
    public final boolean b(java.lang.Object obj) {
        boolean zB;
        if (obj == null) {
            defpackage.aooh.i("instance");
        }
        synchronized (this.a) {
            zB = super.b(obj);
        }
        return zB;
    }
}
