package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class eqy {
    public final defpackage.eqx[] a;
    public final long b;

    public eqy(java.util.List list) {
        this(-9223372036854775807L, (defpackage.eqx[]) list.toArray(new defpackage.eqx[0]));
    }

    private static final defpackage.eqx h(defpackage.eqx eqxVar, java.lang.Class cls, ahyp ahypVar) {
        if (cls.isAssignableFrom(eqxVar.getClass())) {
            defpackage.eqx eqxVar2 = (defpackage.eqx) cls.cast(eqxVar);
            if (ahypVar.a(eqxVar2)) {
                return eqxVar2;
            }
        }
        return null;
    }

    public final int a() {
        return this.a.length;
    }

    public final defpackage.eqx b(int i) {
        return this.a[i];
    }

    public final defpackage.eqx c(java.lang.Class cls, ahyp ahypVar) {
        for (defpackage.eqx eqxVar : this.a) {
            defpackage.eqx eqxVarH = h(eqxVar, cls, ahypVar);
            if (eqxVarH != null) {
                return eqxVarH;
            }
        }
        return null;
    }

    public final defpackage.eqy d(defpackage.eqx... eqxVarArr) {
        int length = eqxVarArr.length;
        if (length == 0) {
            return this;
        }
        long j = this.b;
        defpackage.eqx[] eqxVarArr2 = this.a;
        java.lang.String str = eum.a;
        int length2 = eqxVarArr2.length;
        java.lang.Object[] objArrCopyOf = java.util.Arrays.copyOf(eqxVarArr2, length2 + length);
        java.lang.System.arraycopy(eqxVarArr, 0, objArrCopyOf, length2, length);
        return new defpackage.eqy(j, (defpackage.eqx[]) objArrCopyOf);
    }

    public final defpackage.eqy e(defpackage.eqy eqyVar) {
        return eqyVar != null ? d(eqyVar.a) : this;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            defpackage.eqy eqyVar = (defpackage.eqy) obj;
            if (java.util.Arrays.equals(this.a, eqyVar.a) && this.b == eqyVar.b) {
                return true;
            }
        }
        return false;
    }

    public final aify f(java.lang.Class cls) {
        aift aiftVar = new aift(4);
        for (defpackage.eqx eqxVar : this.a) {
            if (cls.isAssignableFrom(eqxVar.getClass())) {
                aiftVar.i((defpackage.eqx) cls.cast(eqxVar));
            }
        }
        return aiftVar.h();
    }

    public final aify g(java.lang.Class cls, ahyp ahypVar) {
        aift aiftVar = new aift(4);
        for (defpackage.eqx eqxVar : this.a) {
            defpackage.eqx eqxVarH = h(eqxVar, cls, ahypVar);
            if (eqxVarH != null) {
                aiftVar.i(eqxVarH);
            }
        }
        return aiftVar.h();
    }

    public final int hashCode() {
        return (java.util.Arrays.hashCode(this.a) * 31) + anty.M(this.b);
    }

    public final java.lang.String toString() {
        long j = this.b;
        return "entries=" + java.util.Arrays.toString(this.a) + (j == -9223372036854775807L ? "" : a.bz(j, ", presentationTimeUs="));
    }

    public eqy(long j, defpackage.eqx... eqxVarArr) {
        this.b = j;
        this.a = eqxVarArr;
    }
}
