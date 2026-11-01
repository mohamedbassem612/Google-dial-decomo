package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public class fwe extends defpackage.fwc implements java.lang.Iterable, aoow {
    public static final /* synthetic */ int g = 0;
    public final defpackage.fxw f;

    public fwe(defpackage.fwn fwnVar) {
        super(fwnVar);
        this.f = new defpackage.fxw(this);
    }

    @Override // defpackage.fwc
    public final defpackage.fwb d(defpackage.fwa fwaVar) {
        defpackage.fxw fxwVar = this.f;
        return fxwVar.c(super.d(fwaVar), fwaVar, false, fxwVar.a);
    }

    @Override // defpackage.fwc
    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof defpackage.fwe) && super.equals(obj)) {
            defpackage.fwe fweVar = (defpackage.fwe) obj;
            if (j().c() == fweVar.j().c() && i() == fweVar.i()) {
                java.util.Iterator itA = aooc.f(sl.b(j())).a();
                while (itA.hasNext()) {
                    defpackage.fwc fwcVar = (defpackage.fwc) itA.next();
                    if (!aooh.n(fwcVar, defpackage.aee.a(fweVar.j(), fwcVar.b()))) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.fwc
    public final int hashCode() {
        int i = i();
        aed aedVarJ = j();
        int iC = aedVarJ.c();
        for (int i2 = 0; i2 < iC; i2++) {
            i = (((i * 31) + aedVarJ.b(i2)) * 31) + ((defpackage.fwc) aedVarJ.e(i2)).hashCode();
        }
        return i;
    }

    public final int i() {
        return this.f.c;
    }

    @Override // java.lang.Iterable
    public final java.util.Iterator iterator() {
        return new defpackage.fxv(this.f);
    }

    public final aed j() {
        return this.f.b;
    }

    public final defpackage.fwc k(int i) {
        defpackage.fxw fxwVar = this.f;
        return fxwVar.b(i, fxwVar.a, false, null);
    }

    public final defpackage.fwc l(java.lang.String str) {
        if (str == null || aoov.H(str)) {
            return null;
        }
        return this.f.a(str, true);
    }

    public final defpackage.fwc m(int i, defpackage.fwc fwcVar, boolean z, defpackage.fwc fwcVar2) {
        return this.f.b(i, fwcVar, z, fwcVar2);
    }

    public final java.lang.String n() {
        return this.f.e;
    }

    public final defpackage.fwb o(defpackage.fwa fwaVar, defpackage.fwc fwcVar) {
        aooh.f(fwcVar, "lastVisited");
        return this.f.c(super.d(fwaVar), fwaVar, true, fwcVar);
    }

    public final defpackage.fwb p(java.lang.String str, boolean z, defpackage.fwc fwcVar) {
        defpackage.fwb fwbVarP;
        aooh.f(fwcVar, "lastVisited");
        aooh.f(fwcVar, "lastVisited");
        defpackage.fwe fweVar = this.f.a;
        defpackage.fwb fwbVarE = fweVar.e(str);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = fweVar.iterator();
        while (true) {
            fwbVarP = null;
            if (!it.hasNext()) {
                break;
            }
            defpackage.fwc fwcVar2 = (defpackage.fwc) it.next();
            if (!aooh.n(fwcVar2, fwcVar)) {
                fwbVarP = fwcVar2 instanceof defpackage.fwe ? ((defpackage.fwe) fwcVar2).p(str, false, fweVar) : fwcVar2.e(str);
            }
            if (fwbVarP != null) {
                arrayList.add(fwbVarP);
            }
        }
        defpackage.fwb fwbVar = (defpackage.fwb) ajsz.bA(arrayList);
        defpackage.fwe fweVar2 = fweVar.c;
        if (fweVar2 != null && z && !aooh.n(fweVar2, fwcVar)) {
            fwbVarP = fweVar2.p(str, true, fweVar);
        }
        return (defpackage.fwb) ajsz.bA(ajsz.bc(new defpackage.fwb[]{fwbVarE, fwbVar, fwbVarP}));
    }

    @Override // defpackage.fwc
    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(super.toString());
        defpackage.fwc fwcVarL = l(n());
        if (fwcVarL == null) {
            fwcVarL = k(i());
        }
        sb.append(" startDestination=");
        if (fwcVarL != null) {
            sb.append('{');
            sb.append(fwcVarL.toString());
            sb.append('}');
        } else if (n() != null) {
            sb.append(n());
        } else {
            defpackage.fxw fxwVar = this.f;
            java.lang.String str = fxwVar.d;
            if (str != null) {
                sb.append(str);
            } else {
                sb.append("0x".concat(java.lang.String.valueOf(java.lang.Integer.toHexString(fxwVar.c))));
            }
        }
        return sb.toString();
    }
}
