package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
final class anab extends defpackage.amzv {
    private final aify a;

    public anab(aify aifyVar) {
        this.a = aifyVar;
    }

    @Override // defpackage.amzv
    public final void a(java.lang.Throwable th) {
        aify aifyVarA = this.a.a();
        int size = aifyVarA.size();
        for (int i = 0; i < size; i++) {
            defpackage.amzv amzvVar = (defpackage.amzv) aifyVarA.get(i);
            try {
                amzvVar.a(th);
            } catch (java.lang.RuntimeException e) {
                defpackage.anah.c(e, amzvVar, "failed", th);
            }
        }
    }

    @Override // defpackage.amzv
    public final void b() {
        aify aifyVarA = this.a.a();
        int size = aifyVarA.size();
        for (int i = 0; i < size; i++) {
            defpackage.amzv amzvVar = (defpackage.amzv) aifyVarA.get(i);
            try {
                amzvVar.b();
            } catch (java.lang.RuntimeException e) {
                defpackage.anah.e(e, amzvVar, "methodFinished");
            }
        }
    }

    @Override // defpackage.amzv
    public final void c() {
        int i = 0;
        while (true) {
            aike aikeVar = this.a;
            if (i >= aikeVar.d) {
                return;
            }
            defpackage.amzv amzvVar = (defpackage.amzv) aikeVar.get(i);
            try {
                amzvVar.c();
            } catch (java.lang.RuntimeException e) {
                defpackage.anah.e(e, amzvVar, "methodStarting");
            }
            i++;
        }
    }

    @Override // defpackage.amzv
    public final void d() {
        int i = 0;
        while (true) {
            aike aikeVar = this.a;
            if (i >= aikeVar.d) {
                return;
            }
            defpackage.amzv amzvVar = (defpackage.amzv) aikeVar.get(i);
            try {
                amzvVar.d();
            } catch (java.lang.RuntimeException e) {
                defpackage.anah.e(e, amzvVar, "requested");
            }
            i++;
        }
    }

    @Override // defpackage.amzv
    public final void e(java.lang.Object obj) {
        aify aifyVarA = this.a.a();
        int size = aifyVarA.size();
        for (int i = 0; i < size; i++) {
            defpackage.amzv amzvVar = (defpackage.amzv) aifyVarA.get(i);
            try {
                amzvVar.e(obj);
            } catch (java.lang.RuntimeException e) {
                defpackage.anah.c(e, amzvVar, "succeeded", obj);
            }
        }
    }

    @Override // defpackage.amzv
    public final void g() {
        aify aifyVarA = this.a.a();
        int size = aifyVarA.size();
        for (int i = 0; i < size; i++) {
            defpackage.amzv amzvVar = (defpackage.amzv) aifyVarA.get(i);
            try {
                amzvVar.g();
            } catch (java.lang.RuntimeException e) {
                defpackage.anah.e(e, amzvVar, "dependenciesRequested");
            }
        }
    }

    @Override // defpackage.amzv
    public final void h() {
        int i = 0;
        while (true) {
            aike aikeVar = this.a;
            if (i >= aikeVar.d) {
                return;
            }
            defpackage.amzv amzvVar = (defpackage.amzv) aikeVar.get(i);
            try {
                amzvVar.h();
            } catch (java.lang.RuntimeException e) {
                defpackage.anah.e(e, amzvVar, "ready");
            }
            i++;
        }
    }
}
