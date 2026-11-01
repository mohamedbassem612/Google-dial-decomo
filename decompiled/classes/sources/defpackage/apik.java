package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class apik {
    public static final defpackage.apik a;
    public static final defpackage.apik b;
    private static final java.util.List g;
    private static final java.util.List h;
    public final boolean c;
    public final boolean d;
    public final java.lang.String[] e;
    public final java.lang.String[] f;

    static {
        java.util.List listBb = defpackage.ajsz.bb(defpackage.apii.p, defpackage.apii.q, defpackage.apii.r, defpackage.apii.j, defpackage.apii.l, defpackage.apii.k, defpackage.apii.m, defpackage.apii.o, defpackage.apii.n);
        g = listBb;
        java.util.List listBb2 = defpackage.ajsz.bb(defpackage.apii.p, defpackage.apii.q, defpackage.apii.r, defpackage.apii.j, defpackage.apii.l, defpackage.apii.k, defpackage.apii.m, defpackage.apii.o, defpackage.apii.n, defpackage.apii.h, defpackage.apii.i, defpackage.apii.f, defpackage.apii.g, defpackage.apii.d, defpackage.apii.e, defpackage.apii.c);
        h = listBb2;
        defpackage.apij apijVar = new defpackage.apij(true);
        defpackage.apii[] apiiVarArr = (defpackage.apii[]) listBb.toArray(new defpackage.apii[0]);
        apijVar.e((defpackage.apii[]) java.util.Arrays.copyOf(apiiVarArr, apiiVarArr.length));
        apijVar.f(defpackage.apjq.TLS_1_3, defpackage.apjq.TLS_1_2);
        apijVar.c();
        apijVar.a();
        defpackage.apij apijVar2 = new defpackage.apij(true);
        defpackage.apii[] apiiVarArr2 = (defpackage.apii[]) listBb2.toArray(new defpackage.apii[0]);
        apijVar2.e((defpackage.apii[]) java.util.Arrays.copyOf(apiiVarArr2, apiiVarArr2.length));
        apijVar2.f(defpackage.apjq.TLS_1_3, defpackage.apjq.TLS_1_2);
        apijVar2.c();
        a = apijVar2.a();
        defpackage.apij apijVar3 = new defpackage.apij(true);
        defpackage.apii[] apiiVarArr3 = (defpackage.apii[]) listBb2.toArray(new defpackage.apii[0]);
        apijVar3.e((defpackage.apii[]) java.util.Arrays.copyOf(apiiVarArr3, apiiVarArr3.length));
        apijVar3.f(defpackage.apjq.TLS_1_3, defpackage.apjq.TLS_1_2, defpackage.apjq.TLS_1_1, defpackage.apjq.TLS_1_0);
        apijVar3.c();
        apijVar3.a();
        b = new defpackage.apij(false).a();
    }

    public apik(boolean z, boolean z2, java.lang.String[] strArr, java.lang.String[] strArr2) {
        this.c = z;
        this.d = z2;
        this.e = strArr;
        this.f = strArr2;
    }

    public final java.util.List a() {
        java.lang.String[] strArr = this.e;
        if (strArr == null) {
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(strArr.length);
        for (java.lang.String str : strArr) {
            arrayList.add(defpackage.apii.t.W(str));
        }
        return arrayList;
    }

    public final java.util.List b() {
        java.lang.String[] strArr = this.f;
        if (strArr == null) {
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(strArr.length);
        for (java.lang.String str : strArr) {
            defpackage.apjq apjqVar = defpackage.apjq.TLS_1_3;
            arrayList.add(defpackage.aooh.Q(str));
        }
        return arrayList;
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof defpackage.apik)) {
            return false;
        }
        if (obj != this) {
            boolean z = this.c;
            defpackage.apik apikVar = (defpackage.apik) obj;
            if (z != apikVar.c) {
                return false;
            }
            if (z && (!java.util.Arrays.equals(this.e, apikVar.e) || !java.util.Arrays.equals(this.f, apikVar.f) || this.d != apikVar.d)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        if (!this.c) {
            return 17;
        }
        java.lang.String[] strArr = this.e;
        int iHashCode = strArr != null ? java.util.Arrays.hashCode(strArr) : 0;
        java.lang.String[] strArr2 = this.f;
        return ((((iHashCode + 527) * 31) + (strArr2 != null ? java.util.Arrays.hashCode(strArr2) : 0)) * 31) + (!this.d ? 1 : 0);
    }

    public final java.lang.String toString() {
        if (!this.c) {
            return "ConnectionSpec()";
        }
        return "ConnectionSpec(cipherSuites=" + j$.util.Objects.toString(a(), "[all enabled]") + ", tlsVersions=" + j$.util.Objects.toString(b(), "[all enabled]") + ", supportsTlsExtensions=" + this.d + ')';
    }
}
