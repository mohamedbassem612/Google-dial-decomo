package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class eyw implements defpackage.fga, defpackage.fct {
    public final /* synthetic */ defpackage.eyz a;
    private final defpackage.eyx b;

    public eyw(defpackage.eyz eyzVar, defpackage.eyx eyxVar) {
        j$.util.Objects.requireNonNull(eyzVar);
        this.a = eyzVar;
        this.b = eyxVar;
    }

    private final android.util.Pair k(defpackage.ffu ffuVar) {
        defpackage.ffu ffuVarA;
        defpackage.ffu ffuVar2 = null;
        if (ffuVar != null) {
            defpackage.eyx eyxVar = this.b;
            int i = 0;
            while (true) {
                java.util.List list = eyxVar.c;
                if (i >= list.size()) {
                    ffuVarA = null;
                    break;
                }
                if (((defpackage.ffu) list.get(i)).d == ffuVar.d) {
                    java.lang.Object obj = ffuVar.a;
                    java.lang.Object obj2 = eyxVar.b;
                    int i2 = defpackage.ewy.e;
                    ffuVarA = ffuVar.a(android.util.Pair.create(obj2, obj));
                    break;
                }
                i++;
            }
            if (ffuVarA == null) {
                return null;
            }
            ffuVar2 = ffuVarA;
        }
        return android.util.Pair.create(java.lang.Integer.valueOf(this.b.d), ffuVar2);
    }

    @Override // defpackage.fga
    public final void I(int i, defpackage.ffu ffuVar, defpackage.ffq ffqVar) {
        android.util.Pair pairK = k(ffuVar);
        if (pairK != null) {
            defpackage.eyz eyzVar = this.a;
            eyzVar.g.d(new defpackage.ac((java.lang.Object) this, (java.lang.Object) pairK, (java.lang.Object) ffqVar, 10, (char[]) null));
        }
    }

    @Override // defpackage.fct
    public final void J(int i, defpackage.ffu ffuVar) {
        android.util.Pair pairK = k(ffuVar);
        if (pairK != null) {
            defpackage.eyz eyzVar = this.a;
            eyzVar.g.d(new defpackage.esz(this, pairK, 8, null));
        }
    }

    @Override // defpackage.fct
    public final void K(int i, defpackage.ffu ffuVar, int i2) {
        android.util.Pair pairK = k(ffuVar);
        if (pairK != null) {
            defpackage.eyz eyzVar = this.a;
            eyzVar.g.d(new defpackage.mo(this, pairK, i2, 4));
        }
    }

    @Override // defpackage.fct
    public final void L(int i, defpackage.ffu ffuVar, java.lang.Exception exc) {
        android.util.Pair pairK = k(ffuVar);
        if (pairK != null) {
            defpackage.eyz eyzVar = this.a;
            eyzVar.g.d(new defpackage.ac((java.lang.Object) this, (java.lang.Object) pairK, (java.lang.Object) exc, 9, (char[]) null));
        }
    }

    @Override // defpackage.fga
    public final void N(int i, defpackage.ffu ffuVar, defpackage.ffl fflVar, defpackage.ffq ffqVar) {
        android.util.Pair pairK = k(ffuVar);
        if (pairK != null) {
            defpackage.eyz eyzVar = this.a;
            eyzVar.g.d(new defpackage.abb(this, pairK, fflVar, ffqVar, 2));
        }
    }

    @Override // defpackage.fga
    public final void O(int i, defpackage.ffu ffuVar, defpackage.ffl fflVar, defpackage.ffq ffqVar) {
        android.util.Pair pairK = k(ffuVar);
        if (pairK != null) {
            defpackage.eyz eyzVar = this.a;
            eyzVar.g.d(new defpackage.abb(this, pairK, fflVar, ffqVar, 3));
        }
    }

    @Override // defpackage.fct
    public final void R(int i, defpackage.ffu ffuVar, defpackage.hgt hgtVar) {
        android.util.Pair pairK = k(ffuVar);
        if (pairK != null) {
            defpackage.eyz eyzVar = this.a;
            eyzVar.g.d(new defpackage.ac((java.lang.Object) this, (java.lang.Object) pairK, (java.lang.Object) hgtVar, 8, (char[]) null));
        }
    }

    @Override // defpackage.fct
    public final void e(int i, defpackage.ffu ffuVar) {
        android.util.Pair pairK = k(ffuVar);
        if (pairK != null) {
            defpackage.eyz eyzVar = this.a;
            eyzVar.g.d(new defpackage.esz(this, pairK, 9, null));
        }
    }

    @Override // defpackage.fga
    public final void h(int i, defpackage.ffu ffuVar, defpackage.ffl fflVar, defpackage.ffq ffqVar, java.io.IOException iOException, boolean z) {
        android.util.Pair pairK = k(ffuVar);
        if (pairK != null) {
            defpackage.eyz eyzVar = this.a;
            eyzVar.g.d(new defpackage.aeli(this, pairK, fflVar, ffqVar, iOException, z, 1));
        }
    }

    @Override // defpackage.fga
    public final void i(int i, defpackage.ffu ffuVar, defpackage.ffl fflVar, defpackage.ffq ffqVar, int i2) {
        android.util.Pair pairK = k(ffuVar);
        if (pairK != null) {
            defpackage.eyz eyzVar = this.a;
            eyzVar.g.d(new defpackage.eyv(this, pairK, fflVar, ffqVar, i2, 0));
        }
    }
}
