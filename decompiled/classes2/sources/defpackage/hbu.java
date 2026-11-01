package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class hbu extends defpackage.hbd {
    private final java.lang.Object e;

    public hbu(defpackage.hgp hgpVar, java.lang.Object obj) {
        super(java.util.Collections.EMPTY_LIST);
        this.d = hgpVar;
        this.e = obj;
    }

    @Override // defpackage.hbd
    public final float a() {
        return 1.0f;
    }

    @Override // defpackage.hbd
    public final java.lang.Object e() {
        defpackage.hgp hgpVar = this.d;
        java.lang.Object obj = this.e;
        float f = this.c;
        return hgpVar.b(0.0f, 0.0f, obj, obj, f, f, f);
    }

    @Override // defpackage.hbd
    public final java.lang.Object f(defpackage.hgn hgnVar, float f) {
        return e();
    }

    @Override // defpackage.hbd
    public final void i() {
        if (this.d != null) {
            super.i();
        }
    }

    @Override // defpackage.hbd
    public final void j(float f) {
        this.c = f;
    }
}
