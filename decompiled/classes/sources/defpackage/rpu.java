package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
abstract class rpu extends defpackage.ahfw implements defpackage.amyq {
    private android.content.ContextWrapper c;
    private volatile defpackage.amxr e;
    private boolean d = false;
    private final java.lang.Object ak = new java.lang.Object();
    private boolean al = false;

    private final void q() {
        if (this.c == null) {
            this.c = new defpackage.amyf(super.z(), this);
            this.d = defpackage.aooc.aq(super.z());
        }
    }

    @Override // defpackage.amyp
    public final java.lang.Object B() {
        return b().B();
    }

    @Override // defpackage.aw, defpackage.emn
    public final defpackage.eoe R() {
        return defpackage.ajsz.dE(this, super.R());
    }

    @Override // defpackage.aw
    public void ah(android.app.Activity activity) {
        super.ah(activity);
        android.content.ContextWrapper contextWrapper = this.c;
        boolean z = true;
        if (contextWrapper != null && defpackage.amxr.e(contextWrapper) != activity) {
            z = false;
        }
        defpackage.ajsz.dA(z, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new java.lang.Object[0]);
        q();
        b().f();
        p();
    }

    @Override // defpackage.amyq
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final defpackage.amxr b() {
        if (this.e == null) {
            synchronized (this.ak) {
                if (this.e == null) {
                    this.e = f();
                }
            }
        }
        return this.e;
    }

    protected defpackage.amxr f() {
        throw null;
    }

    @Override // defpackage.ahfw, defpackage.aw
    public void g(android.content.Context context) {
        super.g(context);
        q();
        b().f();
        p();
    }

    protected final void p() {
        if (this.al) {
            return;
        }
        this.al = true;
        B();
    }

    @Override // defpackage.aw
    public android.content.Context z() {
        if (super.z() == null && !this.d) {
            return null;
        }
        q();
        return this.c;
    }
}
