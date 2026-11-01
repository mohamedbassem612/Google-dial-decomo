package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
@defpackage.fwm(a = "navigation")
public class fwg extends defpackage.fwn {
    private final defpackage.fwo c;

    public fwg(defpackage.fwo fwoVar) {
        if (fwoVar == null) {
            aooh.i("navigatorProvider");
        }
        this.c = fwoVar;
    }

    @Override // defpackage.fwn
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public defpackage.fwe a() {
        return new defpackage.fwe(this);
    }

    @Override // defpackage.fwn
    public final void e(java.util.List list, defpackage.fwj fwjVar) {
        if (list == null) {
            aooh.i("entries");
        }
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            defpackage.fvs fvsVar = (defpackage.fvs) it.next();
            defpackage.fwc fwcVar = fvsVar.a;
            if (fwcVar == null) {
                aooh.h("null cannot be cast to non-null type androidx.navigation.NavGraph");
            }
            defpackage.fwe fweVar = (defpackage.fwe) fwcVar;
            aoot aootVar = new aoot();
            aootVar.a = fvsVar.a();
            int i = fweVar.i();
            java.lang.String strN = fweVar.n();
            if (i == 0) {
                if (strN == null) {
                    java.lang.String strValueOf = java.lang.String.valueOf(fweVar.b());
                    if (strValueOf == null) {
                        aooh.i("superName");
                    }
                    if (fweVar.f.a.b() == 0) {
                        strValueOf = "the root navigation";
                    }
                    throw new java.lang.IllegalStateException("no start destination defined via app:startDestination for ".concat(java.lang.String.valueOf(strValueOf)));
                }
                i = 0;
            }
            defpackage.fwc fwcVarA = strN != null ? fweVar.f.a(strN, false) : (defpackage.fwc) defpackage.aee.a(fweVar.j(), i);
            if (fwcVarA == null) {
                defpackage.fxw fxwVar = fweVar.f;
                if (fxwVar.d == null) {
                    java.lang.String strValueOf2 = fxwVar.e;
                    if (strValueOf2 == null) {
                        strValueOf2 = java.lang.String.valueOf(fxwVar.c);
                    }
                    fxwVar.d = strValueOf2;
                }
                java.lang.String str = fxwVar.d;
                if (str == null) {
                    aooh.g();
                }
                throw new java.lang.IllegalArgumentException(a.bk(str, "navigation destination ", " is not a direct child of this NavGraph"));
            }
            if (strN != null) {
                if (!aooh.n(strN, fwcVarA.f())) {
                    defpackage.fwb fwbVarE = fwcVarA.e(strN);
                    android.os.Bundle bundle = fwbVarE != null ? fwbVarE.b : null;
                    if (bundle != null && !bundle.isEmpty()) {
                        android.os.Bundle bundleR = dpe.r((aoiu[]) java.util.Arrays.copyOf(new aoiu[0], 0));
                        bundleR.putAll(bundle);
                        android.os.Bundle bundle2 = (android.os.Bundle) aootVar.a;
                        if (bundle2 != null) {
                            bundleR.putAll(bundle2);
                        }
                        aootVar.a = bundleR;
                    }
                }
                if (fwcVarA.g().isEmpty()) {
                    continue;
                } else {
                    java.util.List listAb = defpackage.hgt.ab(fwcVarA.g(), new dih(aootVar, 16));
                    if (!listAb.isEmpty()) {
                        throw new java.lang.IllegalArgumentException(a.bm((byte) 93, listAb, fwcVarA, "Cannot navigate to startDestination ", ". Missing required arguments ["));
                    }
                }
            }
            defpackage.fwn fwnVarB = this.c.b(fwcVarA.a);
            java.util.List listSingletonList = java.util.Collections.singletonList(f().a(fwcVarA, fwcVarA.c((android.os.Bundle) aootVar.a)));
            aooh.e(listSingletonList, "singletonList(...)");
            fwnVarB.e(listSingletonList, fwjVar);
        }
    }
}
