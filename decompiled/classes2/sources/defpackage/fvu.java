package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class fvu extends defpackage.fwp {
    public final defpackage.fwn a;
    public final /* synthetic */ defpackage.fvx b;

    public fvu(defpackage.fvx fvxVar, defpackage.fwn fwnVar) {
        if (fwnVar == null) {
            aooh.i("navigator");
        }
        this.b = fvxVar;
        this.a = fwnVar;
    }

    @Override // defpackage.fwp
    public final defpackage.fvs a(defpackage.fwc fwcVar, android.os.Bundle bundle) {
        defpackage.fxr fxrVar = this.b.b;
        return defpackage.hgt.ai(fxrVar.u(), fwcVar, bundle, fxrVar.a(), fxrVar.t);
    }

    public final void b(defpackage.fvs fvsVar) {
        if (fvsVar == null) {
            aooh.i("backStackEntry");
            aooh.i("backStackEntry");
        }
        synchronized (this.h) {
            aozj aozjVar = this.f;
            aozjVar.e(ajsz.bU((java.util.Collection) aozjVar.c(), fvsVar));
        }
    }

    @Override // defpackage.fwp
    public final void c(defpackage.fvs fvsVar) {
        defpackage.fwl fwlVar;
        aooh.f(fvsVar, "entry");
        defpackage.bxq bxqVar = new defpackage.bxq(this, fvsVar, 12);
        aooh.f(fvsVar, "entry");
        defpackage.fxr fxrVar = this.b.b;
        java.util.Map map = fxrVar.q;
        boolean zN = aooh.n(map.get(fvsVar), java.lang.Boolean.TRUE);
        bxqVar.a();
        map.remove(fvsVar);
        aojw aojwVar = fxrVar.f;
        if (aojwVar.contains(fvsVar)) {
            if (this.c) {
                return;
            }
            fxrVar.l();
            fxrVar.r.e(ajsz.cb(aojwVar));
            fxrVar.s.e(fxrVar.h());
            return;
        }
        fxrVar.s(fvsVar);
        if (fvsVar.f.d.a(emq.c)) {
            fvsVar.b(emq.a);
        }
        if (!aojwVar.isEmpty()) {
            java.util.Iterator it = aojwVar.iterator();
            while (it.hasNext()) {
                if (aooh.n(((defpackage.fvs) it.next()).c, fvsVar.c)) {
                }
            }
            if (!zN && (fwlVar = fxrVar.t) != null) {
                fwlVar.a(fvsVar.c);
            }
        } else if (!zN) {
            fwlVar.a(fvsVar.c);
        }
        fxrVar.l();
        fxrVar.s.e(fxrVar.h());
    }

    @Override // defpackage.fwp
    public final void d(defpackage.fvs fvsVar, boolean z) {
        aooh.f(fvsVar, "popUpTo");
        defpackage.bxq bxqVar = new defpackage.bxq(this, fvsVar, 13);
        aooh.f(fvsVar, "popUpTo");
        defpackage.fxr fxrVar = this.b.b;
        defpackage.fwn fwnVarB = fxrVar.m.b(fvsVar.a.a);
        fxrVar.q.put(fvsVar, java.lang.Boolean.valueOf(z));
        if (!aooh.n(fwnVarB, this.a)) {
            java.lang.Object obj = fxrVar.n.get(fwnVarB);
            aooh.c(obj);
            ((defpackage.fvu) obj).d(fvsVar, z);
            return;
        }
        aonj aonjVar = fxrVar.p;
        if (aonjVar != null) {
            aonjVar.a(fvsVar);
            bxqVar.a();
            return;
        }
        defpackage.fxt fxtVar = new defpackage.fxt(bxqVar, 1);
        aooh.f(fvsVar, "popUpTo");
        aojw aojwVar = fxrVar.f;
        int iIndexOf = aojwVar.indexOf(fvsVar);
        if (iIndexOf < 0) {
            android.util.Log.i("NavController", a.bg(fvsVar, "Ignoring pop of ", " as it was not found on the current back stack"));
            return;
        }
        int i = iIndexOf + 1;
        if (i != aojwVar.a) {
            fxrVar.m(((defpackage.fvs) aojwVar.get(i)).a.b(), true, false);
        }
        defpackage.fxr.q(fxrVar, fvsVar);
        fxtVar.a();
        fxrVar.b.a();
        fxrVar.t();
    }

    @Override // defpackage.fwp
    public final void e(defpackage.fvs fvsVar, boolean z) {
        java.lang.Object objPrevious;
        aooh.f(fvsVar, "popUpTo");
        aooh.f(fvsVar, "popUpTo");
        aozj aozjVar = this.g;
        java.lang.Iterable iterable = (java.lang.Iterable) aozjVar.c();
        if (!(iterable instanceof java.util.Collection) || !((java.util.Collection) iterable).isEmpty()) {
            java.util.Iterator it = iterable.iterator();
            while (it.hasNext()) {
                if (((defpackage.fvs) it.next()) == fvsVar) {
                    java.lang.Iterable iterable2 = (java.lang.Iterable) this.d.c();
                    if ((iterable2 instanceof java.util.Collection) && ((java.util.Collection) iterable2).isEmpty()) {
                        return;
                    }
                    java.util.Iterator it2 = iterable2.iterator();
                    while (it2.hasNext()) {
                        if (((defpackage.fvs) it2.next()) == fvsVar) {
                            break;
                        }
                    }
                    return;
                }
            }
        }
        aozjVar.e(ajsz.aJ((java.util.Set) aozjVar.c(), fvsVar));
        aozh aozhVar = this.d;
        java.util.List list = (java.util.List) aozhVar.c();
        java.util.ListIterator listIterator = list.listIterator(list.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                objPrevious = null;
                break;
            }
            objPrevious = listIterator.previous();
            defpackage.fvs fvsVar2 = (defpackage.fvs) objPrevious;
            if (!aooh.n(fvsVar2, fvsVar) && ((java.util.List) aozhVar.c()).lastIndexOf(fvsVar2) < ((java.util.List) aozhVar.c()).lastIndexOf(fvsVar)) {
                break;
            }
        }
        defpackage.fvs fvsVar3 = (defpackage.fvs) objPrevious;
        if (fvsVar3 != null) {
            aozjVar.e(ajsz.aJ((java.util.Set) aozjVar.c(), fvsVar3));
        }
        d(fvsVar, z);
    }

    @Override // defpackage.fwp
    public final void f(defpackage.fvs fvsVar) {
        if (fvsVar == null) {
            aooh.i("backStackEntry");
        }
        defpackage.fvx fvxVar = this.b;
        if (fvsVar == null) {
            aooh.i("backStackEntry");
        }
        defpackage.fxr fxrVar = fvxVar.b;
        defpackage.fwn fwnVarB = fxrVar.m.b(fvsVar.a.a);
        if (!aooh.n(fwnVarB, this.a)) {
            java.lang.Object obj = fxrVar.n.get(fwnVarB);
            if (obj != null) {
                ((defpackage.fvu) obj).f(fvsVar);
                return;
            }
            throw new java.lang.IllegalStateException("NavigatorBackStack for " + fvsVar.a.a + " should already be created");
        }
        aonj aonjVar = fxrVar.o;
        if (aonjVar != null) {
            aonjVar.a(fvsVar);
            b(fvsVar);
            return;
        }
        android.util.Log.i("NavController", "Ignoring add of destination " + fvsVar.a + " outside of the call to navigate(). ");
    }
}
