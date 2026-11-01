package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class apkl {
    public boolean a;
    public final java.lang.Object b;
    public final java.lang.Object c;
    public final java.lang.Object d;

    public apkl(android.view.ViewGroup viewGroup) {
        this.b = viewGroup;
        this.c = new java.lang.Object();
        this.d = new defpackage.cps();
        if (viewGroup.isAttachedToWindow()) {
            j(viewGroup.getContext());
        }
        viewGroup.addOnAttachStateChangeListener(new defpackage.cpt(this, 0));
    }

    public static void h(android.content.Context context, java.lang.String str, int i) {
        if (defpackage.andt.a.eZ().e(context)) {
            defpackage.aaaj.b().e(str, i);
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [aplp, java.lang.Object] */
    public final defpackage.apjl a(boolean z) throws java.io.IOException {
        try {
            defpackage.apjl apjlVarB = this.c.b(z);
            if (apjlVarB != null) {
                apjlVarB.j = this;
            }
            return apjlVarB;
        } catch (java.io.IOException e) {
            defpackage.apis apisVar = ((defpackage.apks) this.b).c;
            f(e);
            throw e;
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [aplp, java.lang.Object] */
    public final defpackage.apkt b() {
        defpackage.aplo aploVarC = this.c.c();
        defpackage.apkt apktVar = aploVarC instanceof defpackage.apkt ? (defpackage.apkt) aploVarC : null;
        if (apktVar != null) {
            return apktVar;
        }
        throw new java.lang.IllegalStateException("no connection for CONNECT tunnels");
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [aplp, java.lang.Object] */
    public final void c() {
        this.c.c().g();
    }

    public final void d() {
        ((defpackage.apks) this.b).b(this, true, false, false, false, null);
    }

    public final void e() {
        defpackage.apis apisVar = ((defpackage.apks) this.b).c;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [aplp, java.lang.Object] */
    public final void f(java.io.IOException iOException) {
        this.a = true;
        this.c.c().h((defpackage.apks) this.b, iOException);
    }

    public final java.io.IOException g(boolean z, boolean z2, boolean z3, java.io.IOException iOException) {
        if (iOException != null) {
            f(iOException);
        }
        if (z3) {
            java.lang.Object obj = this.b;
            if (iOException != null) {
                defpackage.apis apisVar = ((defpackage.apks) obj).c;
            } else {
                defpackage.apis apisVar2 = ((defpackage.apks) obj).c;
            }
        }
        if (z2) {
            java.lang.Object obj2 = this.b;
            if (iOException != null) {
                defpackage.apis apisVar3 = ((defpackage.apks) obj2).c;
            } else {
                defpackage.apis apisVar4 = ((defpackage.apks) obj2).c;
            }
        }
        java.lang.Object obj3 = this.b;
        return ((defpackage.apks) obj3).b(this, z3 && !z, z2 && !z, z2 && z, z3 && z, iOException);
    }

    public final defpackage.cso i() {
        defpackage.cso csoVar;
        synchronized (this.c) {
            da$.ExternalSyntheticApiModelOutline0.m((android.view.View) this.b);
            csoVar = new defpackage.cso(new defpackage.csp(new defpackage.kaw((byte[]) null, (char[]) null), new defpackage.csh()));
        }
        return csoVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [android.content.ComponentCallbacks, java.lang.Object] */
    public final void j(android.content.Context context) {
        if (this.a) {
            return;
        }
        context.getApplicationContext().registerComponentCallbacks(this.d);
        this.a = true;
    }

    public final void k(defpackage.cso csoVar) {
        synchronized (this.c) {
            if (!csoVar.i) {
                csoVar.i = true;
                csoVar.e();
            }
        }
    }

    public apkl(defpackage.apks apksVar, defpackage.apko apkoVar, defpackage.aplp aplpVar) {
        defpackage.aooh.f(apkoVar, "finder");
        this.b = apksVar;
        this.d = apkoVar;
        this.c = aplpVar;
    }

    public apkl(defpackage.aogc aogcVar, defpackage.adnp adnpVar, defpackage.bfb bfbVar) {
        this.d = aogcVar;
        this.c = adnpVar;
        this.b = bfbVar;
        this.a = true;
    }

    public apkl(defpackage.aonj aonjVar) {
        this.b = aonjVar;
        this.c = new defpackage.gfz(null);
        this.d = new java.util.ArrayList();
    }

    public apkl() {
        this.c = new java.lang.Object();
        this.d = new java.util.ArrayDeque();
        this.b = new java.util.ArrayDeque();
    }
}
