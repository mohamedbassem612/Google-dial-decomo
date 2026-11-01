package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
@defpackage.fwm(a = "composable")
public final class fwz extends defpackage.fwn {
    public final ccp c = new androidx.compose.runtime.ParcelableSnapshotMutableState(java.lang.Boolean.FALSE, cdu.c);

    @Override // defpackage.fwn
    public final /* bridge */ /* synthetic */ defpackage.fwc a() {
        return new defpackage.fwy(this, defpackage.fwu.a);
    }

    public final aozh d() {
        return f().d;
    }

    @Override // defpackage.fwn
    public final void e(java.util.List list, defpackage.fwj fwjVar) {
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            defpackage.fvs fvsVar = (defpackage.fvs) it.next();
            defpackage.fwp fwpVarF = f();
            aooh.f(fvsVar, "backStackEntry");
            aozj aozjVar = fwpVarF.g;
            java.lang.Iterable iterable = (java.lang.Iterable) aozjVar.c();
            if (!(iterable instanceof java.util.Collection) || !((java.util.Collection) iterable).isEmpty()) {
                java.util.Iterator it2 = iterable.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        if (((defpackage.fvs) it2.next()) == fvsVar) {
                            java.lang.Iterable iterable2 = (java.lang.Iterable) fwpVarF.d.c();
                            if (!(iterable2 instanceof java.util.Collection) || !((java.util.Collection) iterable2).isEmpty()) {
                                java.util.Iterator it3 = iterable2.iterator();
                                while (true) {
                                    if (it3.hasNext()) {
                                        if (((defpackage.fvs) it3.next()) == fvsVar) {
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            defpackage.fvs fvsVar2 = (defpackage.fvs) ajsz.bJ((java.util.List) fwpVarF.d.c());
            if (fvsVar2 != null) {
                aozjVar.e(ajsz.aJ((java.util.Set) aozjVar.c(), fvsVar2));
            }
            aozjVar.e(ajsz.aJ((java.util.Set) aozjVar.c(), fvsVar));
            fwpVarF.f(fvsVar);
        }
        this.c.b(java.lang.Boolean.FALSE);
    }

    @Override // defpackage.fwn
    public final void g(defpackage.fvs fvsVar, boolean z) {
        f().e(fvsVar, z);
        this.c.b(java.lang.Boolean.TRUE);
    }

    public final void h(defpackage.fvs fvsVar) {
        f().c(fvsVar);
    }

    public final void i(defpackage.fvs fvsVar) {
        defpackage.fwp fwpVarF = f();
        aooh.f(fvsVar, "entry");
        aooh.f(fvsVar, "entry");
        aozj aozjVar = fwpVarF.g;
        aozjVar.e(ajsz.aJ((java.util.Set) aozjVar.c(), fvsVar));
        defpackage.fvx fvxVar = ((defpackage.fvu) fwpVarF).b;
        aooh.f(fvsVar, "entry");
        if (!fvxVar.b.f.contains(fvsVar)) {
            throw new java.lang.IllegalStateException("Cannot transition entry that is not in the back stack");
        }
        fvsVar.b(emq.d);
    }
}
