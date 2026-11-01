package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class die implements java.lang.Iterable, defpackage.diq, defpackage.aoow {
    public boolean a;
    public boolean b;
    public final defpackage.adw c;
    private java.util.Map d;

    public die() {
        long[] jArr = defpackage.adx.a;
        this.c = new defpackage.adw(6);
    }

    @Override // defpackage.diq
    public final void a(defpackage.dip dipVar, java.lang.Object obj) {
        if (!(obj instanceof defpackage.dhr) || !f(dipVar)) {
            this.c.n(dipVar, obj);
            return;
        }
        defpackage.adw adwVar = this.c;
        java.lang.Object objA = adwVar.a(dipVar);
        if (objA == null) {
            defpackage.aooh.h("null cannot be cast to non-null type androidx.compose.ui.semantics.AccessibilityAction<*>");
        }
        defpackage.dhr dhrVar = (defpackage.dhr) objA;
        defpackage.dhr dhrVar2 = (defpackage.dhr) obj;
        java.lang.String str = dhrVar2.a;
        if (str == null) {
            str = dhrVar.a;
        }
        defpackage.aoio aoioVar = dhrVar2.b;
        if (aoioVar == null) {
            aoioVar = dhrVar.b;
        }
        adwVar.n(dipVar, new defpackage.dhr(str, aoioVar));
    }

    public final defpackage.die b() {
        defpackage.die dieVar = new defpackage.die();
        dieVar.a = this.a;
        dieVar.b = this.b;
        dieVar.c.l(this.c);
        return dieVar;
    }

    public final java.lang.Object c(defpackage.dip dipVar) {
        java.lang.Object objA = this.c.a(dipVar);
        if (objA != null) {
            return objA;
        }
        throw new java.lang.IllegalStateException(defpackage.a.bg(dipVar, "Key not present: ", " - consider getOrElse or getOrNull"));
    }

    public final java.lang.Object d(defpackage.dip dipVar, defpackage.aomy aomyVar) {
        java.lang.Object objA = this.c.a(dipVar);
        return objA == null ? aomyVar.a() : objA;
    }

    public final void e(defpackage.die dieVar) {
        int i;
        defpackage.adw adwVar = dieVar.c;
        java.lang.Object[] objArr = adwVar.b;
        java.lang.Object[] objArr2 = adwVar.c;
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
                        java.lang.Object obj = objArr[i5];
                        java.lang.Object obj2 = objArr2[i5];
                        defpackage.dip dipVar = (defpackage.dip) obj;
                        defpackage.adw adwVar2 = this.c;
                        java.lang.Object objA = adwVar2.a(dipVar);
                        if (dipVar == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type androidx.compose.ui.semantics.SemanticsPropertyKey<kotlin.Any?>");
                        }
                        java.lang.Object objA2 = dipVar.b.a(objA, obj2);
                        if (objA2 != null) {
                            adwVar2.n(dipVar, objA2);
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

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.die) {
            defpackage.die dieVar = (defpackage.die) obj;
            if (defpackage.aooh.n(this.c, dieVar.c) && this.a == dieVar.a && this.b == dieVar.b) {
                return true;
            }
        }
        return false;
    }

    public final boolean f(defpackage.dip dipVar) {
        return defpackage.adw.f(this.c, dipVar);
    }

    public final java.lang.Object g(defpackage.dip dipVar) {
        java.lang.Object objA = this.c.a(dipVar);
        if (objA == null) {
            return null;
        }
        return objA;
    }

    public final int hashCode() {
        return (((this.c.hashCode() * 31) + (true != this.a ? 1237 : 1231)) * 31) + (true == this.b ? 1231 : 1237);
    }

    @Override // java.lang.Iterable
    public final java.util.Iterator iterator() {
        java.util.Map mapB = this.d;
        if (mapB == null) {
            mapB = this.c.b();
            this.d = mapB;
        }
        return mapB.entrySet().iterator();
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0079 A[DONT_INVERT, PHI: r2
      0x0079: PHI (r2v6 java.lang.String) = (r2v5 java.lang.String), (r2v7 java.lang.String) binds: [B:13:0x003f, B:21:0x0077] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:23:0x007b A[LOOP:0: B:12:0x0031->B:23:0x007b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:27:0x007e A[EDGE_INSN: B:27:0x007e->B:24:0x007e BREAK  A[LOOP:0: B:12:0x0031->B:23:0x007b], SYNTHETIC] */
    public final java.lang.String toString() {
        java.lang.String str;
        int i;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if (this.a) {
            sb.append("mergeDescendants=true");
            str = ", ";
        } else {
            str = "";
        }
        if (this.b) {
            sb.append(str);
            sb.append("isClearingSemantics=true");
            str = ", ";
        }
        defpackage.adw adwVar = this.c;
        java.lang.Object[] objArr = adwVar.b;
        java.lang.Object[] objArr2 = adwVar.c;
        long[] jArr = adwVar.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i2 = 0;
            while (true) {
                long j = jArr[i2];
                if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i2 != length) {
                        break;
                        break;
                    }
                    i2++;
                } else {
                    int i3 = i2 - length;
                    int i4 = 0;
                    while (true) {
                        i = 8 - ((~i3) >>> 31);
                        if (i4 >= i) {
                            break;
                        }
                        if ((j & 255) < 128) {
                            int i5 = (i2 << 3) + i4;
                            java.lang.Object obj = objArr[i5];
                            java.lang.Object obj2 = objArr2[i5];
                            sb.append(str);
                            sb.append(((defpackage.dip) obj).a);
                            sb.append(" : ");
                            sb.append(obj2);
                            str = ", ";
                        }
                        j >>= 8;
                        i4++;
                    }
                    if (i != 8) {
                        break;
                    }
                    if (i2 != length) {
                        break;
                    }
                    i2++;
                }
            }
        }
        return dfg.b(this) + "{ " + ((java.lang.Object) sb) + " }";
    }
}
