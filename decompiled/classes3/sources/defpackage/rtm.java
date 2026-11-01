package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
abstract class rtm extends ahfw implements amyq {
    private android.content.ContextWrapper c;
    private volatile amxr e;
    private boolean d = false;
    private final java.lang.Object ak = new java.lang.Object();
    private boolean al = false;

    private final void q() {
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

    public void ah(android.app.Activity activity) {
        super.ah(activity);
        android.content.ContextWrapper contextWrapper = this.c;
        boolean z = true;
        if (contextWrapper != null && amxr.e(contextWrapper) != activity) {
            z = false;
        }
        ajsz.dA(z, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new java.lang.Object[0]);
        q();
        b().f();
        p();
    }

    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final amxr b() {
        if (this.e == null) {
            synchronized (this.ak) {
                if (this.e == null) {
                    this.e = f();
                }
            }
        }
        return this.e;
    }

    protected amxr f() {
        throw null;
    }

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

    public android.content.Context z() {
        if (super.z() == null && !this.d) {
            return null;
        }
        q();
        return this.c;
    }
}
