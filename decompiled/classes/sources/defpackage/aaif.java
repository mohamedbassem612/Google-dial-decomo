package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aaif {
    public final int a;
    public final java.lang.Object b;
    public final java.lang.Object c;

    public aaif(defpackage.aopq aopqVar, defpackage.bdq bdqVar) {
        defpackage.aodd aoddVarC = bdqVar.c();
        final int i = aopqVar.a;
        if (i < 0) {
            avo.d("negative nearestRange.first");
        }
        final int iMin = java.lang.Math.min(aopqVar.b, aoddVarC.b - 1);
        if (iMin < i) {
            defpackage.ado adoVar = defpackage.adp.a;
            if (adoVar == null) {
                defpackage.aooh.h("null cannot be cast to non-null type androidx.collection.ObjectIntMap<K of androidx.collection.ObjectIntMapKt.emptyObjectIntMap>");
            }
            this.c = adoVar;
            this.b = new java.lang.Object[0];
            this.a = 0;
            return;
        }
        int i2 = (iMin - i) + 1;
        this.b = new java.lang.Object[i2];
        this.a = i;
        final defpackage.ado adoVar2 = new defpackage.ado(i2);
        defpackage.aonj aonjVar = new defpackage.aonj() { // from class: bex
            /* JADX WARN: Code duplicated, block: B:7:0x002d  */
            @Override // defpackage.aonj
            public final java.lang.Object a(java.lang.Object obj) {
                java.lang.Object defaultLazyKey;
                defpackage.apnb apnbVar = (defpackage.apnb) obj;
                defpackage.aonj aonjVarA = ((defpackage.bdp) apnbVar.c).a();
                int i3 = apnbVar.b;
                int iMax = java.lang.Math.max(i, i3);
                int iMin2 = java.lang.Math.min(iMin, (apnbVar.a + i3) - 1);
                if (iMax <= iMin2) {
                    while (true) {
                        if (aonjVarA == null) {
                            defaultLazyKey = new androidx.compose.foundation.lazy.layout.DefaultLazyKey(iMax);
                        } else {
                            defaultLazyKey = aonjVarA.a(java.lang.Integer.valueOf(iMax - i3));
                            if (defaultLazyKey == null) {
                                defaultLazyKey = new androidx.compose.foundation.lazy.layout.DefaultLazyKey(iMax);
                            }
                        }
                        defpackage.aaif aaifVar = this;
                        adoVar2.h(defaultLazyKey, iMax);
                        ((java.lang.Object[]) aaifVar.b)[iMax - aaifVar.a] = defaultLazyKey;
                        if (iMax == iMin2) {
                            break;
                        }
                        iMax++;
                    }
                }
                return defpackage.aojh.a;
            }
        };
        if (i < 0 || i >= aoddVarC.b) {
            avo.e("Index " + i + ", size " + aoddVarC.b);
        }
        if (iMin < 0 || iMin >= aoddVarC.b) {
            avo.e("Index " + iMin + ", size " + aoddVarC.b);
        }
        if (iMin < i) {
            avo.c(defpackage.a.bv((byte) 41, i, iMin, "toIndex (", ") should be not smaller than fromIndex ("));
        }
        defpackage.cfc cfcVar = (defpackage.cfc) aoddVarC.a;
        int iAH = defpackage.den.aH(cfcVar, i);
        int i3 = ((defpackage.apnb) cfcVar.a[iAH]).b;
        while (i3 <= iMin) {
            defpackage.apnb apnbVar = (defpackage.apnb) cfcVar.a[iAH];
            aonjVar.a(apnbVar);
            i3 += apnbVar.a;
            iAH++;
        }
        this.c = adoVar2;
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v0, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v3, types: [aoin, java.lang.Object] */
    public static defpackage.aihd l(defpackage.aogc aogcVar) {
        defpackage.aihb aihbVar = new defpackage.aihb();
        int i = 6;
        int[] iArr = {1, 2, 3, 4, 5, 6};
        for (int i2 = 0; i2 < 6; i2++) {
            int i3 = iArr[i2];
            android.content.Context context = (android.content.Context) aogcVar.c.a();
            context.getClass();
            ((defpackage.xeh) aogcVar.b.a()).getClass();
            defpackage.ljb ljbVar = (defpackage.ljb) aogcVar.a.a();
            ljbVar.getClass();
            if (i3 == 0) {
                throw null;
            }
            defpackage.aaif aaifVar = new defpackage.aaif(context, ljbVar, i3);
            j$.util.Objects.requireNonNull(aaifVar);
            m(aihbVar, new defpackage.vmp(aaifVar, 2));
            j$.util.Objects.requireNonNull(aaifVar);
            m(aihbVar, new defpackage.vmp(aaifVar, 11));
            j$.util.Objects.requireNonNull(aaifVar);
            m(aihbVar, new defpackage.vmp(aaifVar, 12));
            j$.util.Objects.requireNonNull(aaifVar);
            m(aihbVar, new defpackage.vmp(aaifVar, 13));
            j$.util.Objects.requireNonNull(aaifVar);
            m(aihbVar, new defpackage.vmp(aaifVar, 14));
            j$.util.Objects.requireNonNull(aaifVar);
            m(aihbVar, new defpackage.vmp(aaifVar, 15));
            j$.util.Objects.requireNonNull(aaifVar);
            m(aihbVar, new defpackage.vmp(aaifVar, 3));
            j$.util.Objects.requireNonNull(aaifVar);
            m(aihbVar, new defpackage.vmp(aaifVar, 4));
            j$.util.Objects.requireNonNull(aaifVar);
            m(aihbVar, new defpackage.vmp(aaifVar, 5));
            j$.util.Objects.requireNonNull(aaifVar);
            m(aihbVar, new defpackage.vmp(aaifVar, i));
            j$.util.Objects.requireNonNull(aaifVar);
            m(aihbVar, new defpackage.vmp(aaifVar, 7));
            j$.util.Objects.requireNonNull(aaifVar);
            m(aihbVar, new defpackage.vmp(aaifVar, 8));
            j$.util.Objects.requireNonNull(aaifVar);
            m(aihbVar, new defpackage.vmp(aaifVar, 9));
            j$.util.Objects.requireNonNull(aaifVar);
            m(aihbVar, new defpackage.vmp(aaifVar, 10));
        }
        return aihbVar.g();
    }

    private static void m(defpackage.aihb aihbVar, java.util.function.Supplier supplier) {
        try {
            aihbVar.c((java.lang.String) aa$.ExternalSyntheticApiModelOutline1.m(supplier));
        } catch (defpackage.xei unused) {
        }
    }

    private final int n(long j) {
        int i = this.a - 1;
        if (i == -1) {
            return -1;
        }
        int i2 = 0;
        if (i == 0) {
            long j2 = ((long[]) this.c)[0];
            if (j2 == j) {
                return 0;
            }
            return j2 > j ? -2 : -1;
        }
        while (i2 <= i) {
            int i3 = (i2 + i) >>> 1;
            long j3 = ((long[]) this.c)[i3] - j;
            if (j3 < 0) {
                i2 = i3 + 1;
            } else {
                if (j3 <= 0) {
                    return i3;
                }
                i = i3 - 1;
            }
        }
        return -(i2 + 1);
    }

    protected final java.lang.String a(java.lang.String str) {
        return ((java.lang.String) this.c).concat(str);
    }

    public final void b(java.lang.String str) {
        if (this.a <= 3) {
            android.util.Log.d((java.lang.String) this.b, a(str));
        }
    }

    public final void c(java.lang.String str, java.lang.Throwable th) {
        android.util.Log.e((java.lang.String) this.b, a(str), th);
    }

    public final void d(java.lang.String str) {
        android.util.Log.e((java.lang.String) this.b, a(str));
    }

    public final void e(java.lang.String str) {
        android.util.Log.w((java.lang.String) this.b, a(str));
    }

    public final boolean f() {
        return ((defpackage.ljb) this.b).a().equals(defpackage.ljb.c);
    }

    public final java.lang.Object g(long j) {
        int iN = n(j);
        if (iN >= 0) {
            return ((java.lang.Object[]) this.b)[iN];
        }
        return null;
    }

    public final boolean h(long j, java.lang.Object obj) {
        int iN = n(j);
        if (iN < 0) {
            return false;
        }
        ((java.lang.Object[]) this.b)[iN] = obj;
        return true;
    }

    public final int i(java.lang.Object obj) {
        defpackage.ado adoVar = (defpackage.ado) this.c;
        int iA = adoVar.a(obj);
        if (iA >= 0) {
            return adoVar.c[iA];
        }
        return -1;
    }

    public final java.lang.Object j(int i) {
        int i2 = i - this.a;
        if (i2 >= 0) {
            java.lang.Object[] objArr = (java.lang.Object[]) this.b;
            if (i2 < objArr.length) {
                return objArr[i2];
            }
        }
        return null;
    }

    public final defpackage.aaif k(long j, java.lang.Object obj) {
        java.lang.Object[] objArr;
        int i;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            objArr = (java.lang.Object[]) this.b;
            if (i3 >= objArr.length) {
                break;
            }
            if (objArr[i3] != null) {
                i4++;
            }
            i3++;
        }
        int i5 = i4 + 1;
        long[] jArr = new long[i5];
        java.lang.Object[] objArr2 = new java.lang.Object[i5];
        if (i5 > 1) {
            int i6 = 0;
            while (true) {
                i = this.a;
                if (i2 >= i5 || i6 >= i) {
                    break;
                }
                long j2 = ((long[]) this.c)[i6];
                java.lang.Object obj2 = objArr[i6];
                if (j2 > j) {
                    jArr[i2] = j;
                    objArr2[i2] = obj;
                    i2++;
                    break;
                }
                if (obj2 != null) {
                    jArr[i2] = j2;
                    objArr2[i2] = obj2;
                    i2++;
                }
                i6++;
            }
            if (i6 == i) {
                jArr[i4] = j;
                objArr2[i4] = obj;
            } else {
                while (i2 < i5) {
                    long j3 = ((long[]) this.c)[i6];
                    java.lang.Object obj3 = objArr[i6];
                    if (obj3 != null) {
                        jArr[i2] = j3;
                        objArr2[i2] = obj3;
                        i2++;
                    }
                    i6++;
                }
            }
        } else {
            jArr[0] = j;
            objArr2[0] = obj;
        }
        return new defpackage.aaif(i5, jArr, objArr2);
    }

    public aaif(defpackage.aadw aadwVar, int i, defpackage.aada aadaVar) {
        this.b = aadwVar;
        this.a = i;
        this.c = aadaVar;
    }

    public aaif(defpackage.aenj aenjVar, int i, defpackage.aoin aoinVar) {
        this.c = aenjVar;
        this.a = i;
        this.b = aoinVar;
    }

    public aaif(android.content.Context context, defpackage.ljb ljbVar, int i) {
        this.c = context;
        this.a = i;
        this.b = ljbVar;
    }

    public aaif(int i, long[] jArr, java.lang.Object[] objArr) {
        this.a = i;
        this.c = jArr;
        this.b = objArr;
    }

    public aaif(java.lang.String str, java.lang.String... strArr) {
        java.lang.String string;
        if (strArr.length == 0) {
            string = "";
        } else {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append('[');
            java.lang.String str2 = strArr[0];
            if (sb.length() > 1) {
                sb.append(',');
            }
            sb.append(str2);
            sb.append("] ");
            string = sb.toString();
        }
        this.c = string;
        this.b = str;
        int i = 2;
        while (i <= 7 && !android.util.Log.isLoggable((java.lang.String) this.b, i)) {
            i++;
        }
        this.a = i;
    }
}
