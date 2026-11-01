package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class cey {
    public final defpackage.adw a;

    public /* synthetic */ cey(defpackage.adw adwVar) {
        this.a = adwVar;
    }

    public static final java.lang.Object a(defpackage.adw adwVar, java.lang.Object obj) {
        java.lang.Object objA = adwVar.a(obj);
        if (objA == null) {
            return null;
        }
        if (!(objA instanceof defpackage.adq)) {
            adwVar.i(obj);
            return objA;
        }
        defpackage.adq adqVar = (defpackage.adq) objA;
        if (adqVar.f()) {
            throw new java.util.NoSuchElementException("List is empty.");
        }
        int i = adqVar.b - 1;
        java.lang.Object objC = adqVar.c(i);
        adqVar.h(i);
        if (objC == null) {
            defpackage.aooh.h("null cannot be cast to non-null type V of androidx.compose.runtime.collection.MultiValueMap");
        }
        if (adqVar.f()) {
            adwVar.i(obj);
        }
        if (adqVar.b == 1) {
            adwVar.n(obj, adqVar.b());
        }
        return objC;
    }

    public static final void b(defpackage.adw adwVar, java.lang.Object obj, java.lang.Object obj2) {
        int iG = adwVar.g(obj);
        java.lang.Object obj3 = iG < 0 ? null : adwVar.c[iG];
        defpackage.aoov.c(obj3);
        if (obj3 != null) {
            if (obj3 instanceof defpackage.adq) {
                defpackage.adq adqVar = (defpackage.adq) obj3;
                adqVar.q(obj2);
                obj2 = adqVar;
            } else {
                obj2 = defpackage.adr.c(obj3, obj2);
            }
        }
        if (iG >= 0) {
            adwVar.c[iG] = obj2;
            return;
        }
        int i = ~iG;
        adwVar.b[i] = obj;
        adwVar.c[i] = obj2;
    }

    public static final void c(defpackage.adw adwVar, java.lang.Object obj, defpackage.aonj aonjVar) {
        java.lang.Object objA = adwVar.a(obj);
        if (objA != null) {
            if (!(objA instanceof defpackage.adq)) {
                if (((java.lang.Boolean) aonjVar.a(objA)).booleanValue()) {
                    adwVar.i(obj);
                    return;
                }
                return;
            }
            defpackage.adq adqVar = (defpackage.adq) objA;
            int i = adqVar.b;
            java.lang.Object[] objArr = adqVar.a;
            int i2 = 0;
            defpackage.aopq aopqVarC = defpackage.aooc.C(0, i);
            int i3 = aopqVarC.a;
            int i4 = aopqVarC.b;
            if (i3 <= i4) {
                while (true) {
                    objArr[i3 - i2] = objArr[i3];
                    if (((java.lang.Boolean) aonjVar.a(objArr[i3])).booleanValue()) {
                        i2++;
                    }
                    if (i3 == i4) {
                        break;
                    } else {
                        i3++;
                    }
                }
            }
            int i5 = i - i2;
            if (objArr == null) {
                defpackage.aooh.i("<this>");
            }
            java.util.Arrays.fill(objArr, i5, i, (java.lang.Object) null);
            adqVar.b -= i2;
            if (adqVar.f()) {
                adwVar.i(obj);
            }
            if (adqVar.b == 1) {
                adwVar.n(obj, adqVar.b());
            }
        }
    }

    public final boolean equals(java.lang.Object obj) {
        return (obj instanceof defpackage.cey) && defpackage.aooh.n(this.a, ((defpackage.cey) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final java.lang.String toString() {
        return "MultiValueMap(map=" + this.a + ')';
    }
}
