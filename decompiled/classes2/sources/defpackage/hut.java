package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
abstract class hut extends defpackage.ger implements amyq {
    private android.content.ContextWrapper c;
    private volatile amxr e;
    private boolean d = false;
    private final java.lang.Object ak = new java.lang.Object();
    private boolean al = false;

    private final void aY() {
        if (this.c == null) {
            this.c = new amyf(super.z(), this);
            this.d = aooc.aq(super.z());
        }
    }

    public final java.lang.Object B() {
        return b().B();
    }

    public final eoe R() {
        return ajsz.dE(this, super.R());
    }

    /* JADX INFO: renamed from: aW, reason: merged with bridge method [inline-methods] */
    public final amxr b() {
        if (this.e == null) {
            synchronized (this.ak) {
                if (this.e == null) {
                    this.e = new amxr(this);
                }
            }
        }
        return this.e;
    }

    protected final void aX() {
        if (this.al) {
            return;
        }
        this.al = true;
        java.lang.Object objB = B();
        defpackage.hus husVar = (defpackage.hus) this;
        defpackage.him himVar = ((his) objB).b;
        husVar.e = himVar.w();
        husVar.c = himVar.v();
        husVar.d = (rlv) himVar.fq.a();
    }

    public final void ah(android.app.Activity activity) {
        super.ah(activity);
        android.content.ContextWrapper contextWrapper = this.c;
        boolean z = true;
        if (contextWrapper != null && amxr.e(contextWrapper) != activity) {
            z = false;
        }
        ajsz.dA(z, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new java.lang.Object[0]);
        aY();
        b().f();
        aX();
    }

    public final android.view.LayoutInflater e(android.os.Bundle bundle) {
        android.view.LayoutInflater layoutInflaterAM = aM();
        return layoutInflaterAM.cloneInContext(new amyf(layoutInflaterAM, this));
    }

    public final void g(android.content.Context context) {
        super.g(context);
        aY();
        b().f();
        aX();
    }

    public final android.content.Context z() {
        if (super.z() == null && !this.d) {
            return null;
        }
        aY();
        return this.c;
    }
}
