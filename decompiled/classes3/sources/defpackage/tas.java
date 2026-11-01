package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
abstract class tas extends gel implements amyq {
    private android.content.ContextWrapper ak;
    private volatile amxr am;
    private boolean al = false;
    private final java.lang.Object an = new java.lang.Object();
    private boolean ap = false;

    private final void aZ() {
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

    public void ah(android.app.Activity activity) {
        super.ah(activity);
        android.content.ContextWrapper contextWrapper = this.ak;
        boolean z = true;
        if (contextWrapper != null && amxr.e(contextWrapper) != activity) {
            z = false;
        }
        ajsz.dA(z, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new java.lang.Object[0]);
        aZ();
        b().f();
        bf();
    }

    protected amxr bd() {
        throw null;
    }

    /* JADX INFO: renamed from: be, reason: merged with bridge method [inline-methods] */
    public final amxr b() {
        if (this.am == null) {
            synchronized (this.an) {
                if (this.am == null) {
                    this.am = bd();
                }
            }
        }
        return this.am;
    }

    protected final void bf() {
        if (this.ap) {
            return;
        }
        this.ap = true;
        B();
    }

    public android.view.LayoutInflater e(android.os.Bundle bundle) {
        android.view.LayoutInflater layoutInflaterE = super.e(bundle);
        return layoutInflaterE.cloneInContext(new amyf(layoutInflaterE, this));
    }

    public void g(android.content.Context context) {
        super.g(context);
        aZ();
        b().f();
        bf();
    }

    public android.content.Context z() {
        if (super.z() == null && !this.al) {
            return null;
        }
        aZ();
        return this.ak;
    }
}
