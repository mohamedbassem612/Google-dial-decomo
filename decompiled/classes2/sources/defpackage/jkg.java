package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
class jkg extends defpackage.al implements amyq {
    private android.content.ContextWrapper ak;
    private volatile amxr am;
    private boolean al = false;
    private final java.lang.Object an = new java.lang.Object();
    private boolean ao = false;

    private final void aU() {
        if (this.ak == null) {
            this.ak = new amyf(super.z(), this);
            this.al = aooc.aq(super.z());
        }
    }

    public final java.lang.Object B() {
        return b().B();
    }

    public final eoe R() {
        return ajsz.dE(this, super.R());
    }

    protected amxr aV() {
        throw null;
    }

    /* JADX INFO: renamed from: aW, reason: merged with bridge method [inline-methods] */
    public final amxr b() {
        if (this.am == null) {
            synchronized (this.an) {
                if (this.am == null) {
                    this.am = aV();
                }
            }
        }
        return this.am;
    }

    protected final void aX() {
        if (this.ao) {
            return;
        }
        this.ao = true;
        B();
    }

    public void ah(android.app.Activity activity) {
        super.ah(activity);
        android.content.ContextWrapper contextWrapper = this.ak;
        boolean z = true;
        if (contextWrapper != null && amxr.e(contextWrapper) != activity) {
            z = false;
        }
        ajsz.dA(z, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new java.lang.Object[0]);
        aU();
        b().f();
        aX();
    }

    @Override // defpackage.al
    public android.view.LayoutInflater e(android.os.Bundle bundle) {
        android.view.LayoutInflater layoutInflaterE = super.e(bundle);
        return layoutInflaterE.cloneInContext(new amyf(layoutInflaterE, this));
    }

    @Override // defpackage.al
    public void g(android.content.Context context) {
        super.g(context);
        aU();
        b().f();
        aX();
    }

    public android.content.Context z() {
        if (super.z() == null && !this.al) {
            return null;
        }
        aU();
        return this.ak;
    }
}
