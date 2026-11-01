package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class cfg {
    public static final void a(defpackage.adw adwVar, java.lang.Object obj, java.lang.Object obj2) {
        int iG = adwVar.g(obj);
        java.lang.Object obj3 = iG < 0 ? null : adwVar.c[iG];
        if (obj3 != null) {
            if (obj3 instanceof defpackage.ady) {
                ((defpackage.ady) obj3).j(obj2);
            } else if (obj3 != obj2) {
                defpackage.ady adyVar = new defpackage.ady(6);
                adyVar.j(obj3);
                adyVar.j(obj2);
                obj2 = adyVar;
            }
            obj2 = obj3;
        }
        if (iG >= 0) {
            adwVar.c[iG] = obj2;
            return;
        }
        int i = ~iG;
        adwVar.b[i] = obj;
        adwVar.c[i] = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0052  */
    public static final void b(defpackage.adw adwVar, java.lang.Object obj) {
        int i;
        long[] jArr = adwVar.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i2 = 0;
        while (true) {
            long j = jArr[i2];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i3 = i2 - length;
                int i4 = 0;
                while (true) {
                    i = 8 - ((~i3) >>> 31);
                    if (i4 >= i) {
                        break;
                    }
                    if ((255 & j) < 128) {
                        int i5 = (i2 << 3) + i4;
                        java.lang.Object obj2 = adwVar.b[i5];
                        java.lang.Object obj3 = adwVar.c[i5];
                        if (obj3 instanceof defpackage.ady) {
                            if (obj3 == null) {
                                defpackage.aooh.h("null cannot be cast to non-null type androidx.collection.MutableScatterSet<Scope of androidx.compose.runtime.collection.ScopeMap>");
                            }
                            defpackage.ady adyVar = (defpackage.ady) obj3;
                            adyVar.l(obj);
                            if (adyVar.b()) {
                                adwVar.j(i5);
                            }
                        } else if (obj3 == obj) {
                            adwVar.j(i5);
                        }
                    }
                    j >>= 8;
                    i4++;
                }
                if (i != 8) {
                    return;
                }
            }
            if (i2 == length) {
                return;
            } else {
                i2++;
            }
        }
    }

    public static final boolean c(defpackage.adw adwVar, java.lang.Object obj, java.lang.Object obj2) {
        java.lang.Object objA = adwVar.a(obj);
        if (objA == null) {
            return false;
        }
        if (objA instanceof defpackage.ady) {
            defpackage.ady adyVar = (defpackage.ady) objA;
            boolean zL = adyVar.l(obj2);
            if (!zL || !adyVar.b()) {
                return zL;
            }
            adwVar.i(obj);
        } else {
            if (!defpackage.aooh.n(objA, obj2)) {
                return false;
            }
            adwVar.i(obj);
        }
        return true;
    }

    public final boolean equals(java.lang.Object obj) {
        throw null;
    }

    public final int hashCode() {
        throw null;
    }

    public final java.lang.String toString() {
        throw null;
    }
}
