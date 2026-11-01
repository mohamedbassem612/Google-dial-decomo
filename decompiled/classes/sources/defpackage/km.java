package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public abstract class km {
    public defpackage.apnt h = null;
    private final java.util.ArrayList a = new java.util.ArrayList();

    public static final kl s(defpackage.ld ldVar) {
        kl klVar = new kl();
        klVar.a(ldVar);
        return klVar;
    }

    public static void t(defpackage.ld ldVar) {
        int i = ldVar.j;
        if (ldVar.t() || (i & 4) != 0) {
            return;
        }
        int i2 = ldVar.d;
        ldVar.a();
    }

    public abstract void b(defpackage.ld ldVar);

    public abstract void c();

    public abstract void d();

    public boolean g(defpackage.ld ldVar, java.util.List list) {
        throw null;
    }

    public abstract boolean h();

    /* JADX WARN: Code duplicated, block: B:30:0x0064  */
    public final void l(defpackage.ld ldVar) {
        defpackage.apnt apntVar = this.h;
        if (apntVar != null) {
            boolean z = true;
            ldVar.n(true);
            if (ldVar.h != null && ldVar.i == null) {
                ldVar.h = null;
            }
            ldVar.i = null;
            if ((ldVar.j & 16) == 0) {
                android.view.View view = ldVar.a;
                android.support.v7.widget.RecyclerView recyclerView = (android.support.v7.widget.RecyclerView) apntVar.a;
                recyclerView.ad();
                defpackage.ip ipVar = recyclerView.h;
                int i = ipVar.c;
                if (i != 1) {
                    if (i == 2) {
                        throw new java.lang.IllegalStateException("Cannot call removeViewIfHidden within removeViewIfHidden");
                    }
                    try {
                        ipVar.c = 2;
                        defpackage.apnt apntVar2 = ipVar.e;
                        int iE = apntVar2.E(view);
                        if (iE == -1) {
                            ipVar.l(view);
                            ipVar.c = 0;
                        } else {
                            defpackage.io ioVar = ipVar.a;
                            if (ioVar.f(iE)) {
                                ioVar.g(iE);
                                ipVar.l(view);
                                apntVar2.H(iE);
                                ipVar.c = 0;
                            } else {
                                ipVar.c = 0;
                            }
                        }
                        if (z) {
                            defpackage.ld ldVarI = android.support.v7.widget.RecyclerView.i(view);
                            defpackage.kt ktVar = recyclerView.e;
                            ktVar.l(ldVarI);
                            ktVar.j(ldVarI);
                        }
                        recyclerView.ae(!z);
                        if (z && ldVar.x()) {
                            ((android.support.v7.widget.RecyclerView) apntVar.a).removeDetachedView(ldVar.a, false);
                            return;
                        }
                    } catch (java.lang.Throwable th) {
                        ipVar.c = 0;
                        throw th;
                    }
                }
                if (ipVar.d != view) {
                    throw new java.lang.IllegalStateException("Cannot call removeViewIfHidden within removeView(At) for a different view");
                }
                z = false;
                if (z) {
                    defpackage.ld ldVarI2 = android.support.v7.widget.RecyclerView.i(view);
                    defpackage.kt ktVar2 = recyclerView.e;
                    ktVar2.l(ldVarI2);
                    ktVar2.j(ldVarI2);
                }
                recyclerView.ae(!z);
                if (z) {
                }
            }
        }
    }

    public final void m() {
        java.util.ArrayList arrayList = this.a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((kk) arrayList.get(i)).a();
        }
        arrayList.clear();
    }

    public abstract boolean n(defpackage.ld ldVar, kl klVar, kl klVar2);

    public abstract boolean o(defpackage.ld ldVar, defpackage.ld ldVar2, kl klVar, kl klVar2);

    public abstract boolean p(defpackage.ld ldVar, kl klVar, kl klVar2);

    public abstract boolean q(defpackage.ld ldVar, kl klVar, kl klVar2);

    public boolean r(defpackage.ld ldVar) {
        throw null;
    }
}
