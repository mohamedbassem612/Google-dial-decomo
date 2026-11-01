package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class fxw {
    public final defpackage.fwe a;
    public final aed b = new aed((byte[]) null);
    public int c;
    public java.lang.String d;
    public java.lang.String e;

    public fxw(defpackage.fwe fweVar) {
        this.a = fweVar;
    }

    public final defpackage.fwc a(java.lang.String str, boolean z) {
        java.lang.Object next;
        defpackage.fwe fweVar;
        defpackage.fwc fwcVar;
        java.util.Iterator itA = aooc.f(sl.b(this.b)).a();
        do {
            if (!itA.hasNext()) {
                next = null;
                break;
            }
            next = itA.next();
            fwcVar = (defpackage.fwc) next;
            if (aoov.s(fwcVar.f(), str, false)) {
                break;
            }
        } while (fwcVar.e(str) == null);
        defpackage.fwc fwcVar2 = (defpackage.fwc) next;
        if (fwcVar2 != null) {
            return fwcVar2;
        }
        if (!z || (fweVar = this.a.c) == null) {
            return null;
        }
        return fweVar.l(str);
    }

    public final defpackage.fwc b(int i, defpackage.fwc fwcVar, boolean z, defpackage.fwc fwcVar2) {
        defpackage.fwc fwcVarM;
        aed aedVar = this.b;
        defpackage.fwc fwcVar3 = (defpackage.fwc) defpackage.aee.a(aedVar, i);
        if (fwcVar2 != null) {
            if (aooh.n(fwcVar3, fwcVar2) && aooh.n(fwcVar3.c, fwcVar2.c)) {
                return fwcVar3;
            }
        } else if (fwcVar3 != null) {
            return fwcVar3;
        }
        if (!z) {
            fwcVarM = null;
            break;
        }
        java.util.Iterator itA = aooc.f(sl.b(aedVar)).a();
        do {
            if (!itA.hasNext()) {
                fwcVarM = null;
                break;
            }
            defpackage.fwc fwcVar4 = (defpackage.fwc) itA.next();
            fwcVarM = (!(fwcVar4 instanceof defpackage.fwe) || aooh.n(fwcVar4, fwcVar)) ? null : ((defpackage.fwe) fwcVar4).m(i, this.a, true, fwcVar2);
        } while (fwcVarM == null);
        if (fwcVarM != null) {
            return fwcVarM;
        }
        defpackage.fwe fweVar = this.a;
        defpackage.fwe fweVar2 = fweVar.c;
        if (fweVar2 == null || aooh.n(fweVar2, fwcVar)) {
            return null;
        }
        defpackage.fwe fweVar3 = fweVar.c;
        aooh.c(fweVar3);
        return fweVar3.m(i, fweVar, z, fwcVar2);
    }

    public final defpackage.fwb c(defpackage.fwb fwbVar, defpackage.fwa fwaVar, boolean z, defpackage.fwc fwcVar) {
        defpackage.fwb fwbVarO;
        aooh.f(fwcVar, "lastVisited");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        defpackage.fwe fweVar = this.a;
        java.util.Iterator it = fweVar.iterator();
        while (true) {
            fwbVarO = null;
            if (!it.hasNext()) {
                break;
            }
            defpackage.fwc fwcVar2 = (defpackage.fwc) it.next();
            fwbVarO = aooh.n(fwcVar2, fwcVar) ? null : fwcVar2.d(fwaVar);
            if (fwbVarO != null) {
                arrayList.add(fwbVarO);
            }
        }
        defpackage.fwb fwbVar2 = (defpackage.fwb) ajsz.bA(arrayList);
        defpackage.fwe fweVar2 = fweVar.c;
        if (fweVar2 != null && z && !aooh.n(fweVar2, fwcVar)) {
            fwbVarO = fweVar2.o(fwaVar, fweVar);
        }
        return (defpackage.fwb) ajsz.bA(ajsz.bc(new defpackage.fwb[]{fwbVar, fwbVar2, fwbVarO}));
    }
}
