package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class fgc implements defpackage.ffs, defpackage.ffr {
    private final defpackage.ffs[] a;
    private final boolean[] b;
    private final java.util.IdentityHashMap c;
    private final java.util.ArrayList d = new java.util.ArrayList();
    private final java.util.HashMap e = new java.util.HashMap();
    private defpackage.ffr f;
    private defpackage.fhg g;
    private defpackage.ffs[] h;
    private defpackage.fgx i;

    public fgc(long[] jArr, defpackage.ffs... ffsVarArr) {
        this.a = ffsVarArr;
        aify aifyVar = aike.a;
        this.i = new defpackage.ffd(aifyVar, aifyVar);
        this.c = new java.util.IdentityHashMap();
        this.h = new defpackage.ffs[0];
        this.b = new boolean[ffsVarArr.length];
        for (int i = 0; i < ffsVarArr.length; i++) {
            long j = jArr[i];
            if (j != 0) {
                this.b[i] = true;
                this.a[i] = new defpackage.fhe(ffsVarArr[i], j);
            }
        }
    }

    @Override // defpackage.ffs, defpackage.fgx
    public final long a() {
        return this.i.a();
    }

    @Override // defpackage.ffs, defpackage.fgx
    public final long b() {
        return this.i.b();
    }

    @Override // defpackage.fgw
    public final /* bridge */ /* synthetic */ void c(defpackage.fgx fgxVar) {
        defpackage.ffr ffrVar = this.f;
        ahvr.ci(ffrVar);
        ffrVar.c(this);
    }

    @Override // defpackage.ffr
    public final void d(defpackage.ffs ffsVar) {
        java.util.ArrayList arrayList = this.d;
        arrayList.remove(ffsVar);
        if (arrayList.isEmpty()) {
            defpackage.ffs[] ffsVarArr = this.a;
            int i = 0;
            for (defpackage.ffs ffsVar2 : ffsVarArr) {
                i += ffsVar2.j().b;
            }
            defpackage.ern[] ernVarArr = new defpackage.ern[i];
            int i2 = 0;
            for (int i3 = 0; i3 < ffsVarArr.length; i3++) {
                defpackage.fhg fhgVarJ = ffsVarArr[i3].j();
                int i4 = fhgVarJ.b;
                int i5 = 0;
                while (i5 < i4) {
                    defpackage.ern ernVarB = fhgVarJ.b(i5);
                    int i6 = ernVarB.a;
                    defpackage.eqg[] eqgVarArr = new defpackage.eqg[i6];
                    int i7 = 0;
                    while (i7 < i6) {
                        defpackage.eqg eqgVarA = ernVarB.a(i7);
                        defpackage.eqf eqfVar = new defpackage.eqf(eqgVarA);
                        java.lang.String str = eqgVarA.a;
                        if (str == null) {
                            str = "";
                        }
                        java.lang.StringBuilder sb = new java.lang.StringBuilder();
                        sb.append(i3);
                        defpackage.ffs[] ffsVarArr2 = ffsVarArr;
                        sb.append(':');
                        sb.append(str);
                        eqfVar.a = sb.toString();
                        java.lang.String str2 = eqgVarA.n;
                        if (str2 != null) {
                            eqfVar.l = i3 + ':' + str2;
                        }
                        eqgVarArr[i7] = new defpackage.eqg(eqfVar);
                        i7++;
                        ffsVarArr = ffsVarArr2;
                    }
                    defpackage.ffs[] ffsVarArr3 = ffsVarArr;
                    defpackage.ern ernVar = new defpackage.ern(i3 + ':' + ernVarB.b, eqgVarArr);
                    this.e.put(ernVar, ernVarB);
                    ernVarArr[i2] = ernVar;
                    i5++;
                    i2++;
                    ffsVarArr = ffsVarArr3;
                }
            }
            this.g = new defpackage.fhg(ernVarArr);
            defpackage.ffr ffrVar = this.f;
            ahvr.ci(ffrVar);
            ffrVar.d(this);
        }
    }

    @Override // defpackage.ffs, defpackage.fgx
    public final void dH(long j) {
        this.i.dH(j);
    }

    @Override // defpackage.ffs, defpackage.fgx
    public final boolean dI(defpackage.eyo eyoVar) {
        java.util.ArrayList arrayList = this.d;
        if (arrayList.isEmpty()) {
            return this.i.dI(eyoVar);
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((defpackage.ffs) arrayList.get(i)).dI(eyoVar);
        }
        return false;
    }

    @Override // defpackage.ffs, defpackage.fgx
    public final boolean e() {
        return this.i.e();
    }

    @Override // defpackage.ffs
    public final long f(long j, defpackage.ezk ezkVar) {
        defpackage.ffs[] ffsVarArr = this.h;
        return (ffsVarArr.length > 0 ? ffsVarArr[0] : this.a[0]).f(j, ezkVar);
    }

    @Override // defpackage.ffs
    public final long g() {
        long j = -9223372036854775807L;
        for (defpackage.ffs ffsVar : this.h) {
            long jG = ffsVar.g();
            if (jG == -9223372036854775807L) {
                if (j != -9223372036854775807L && ffsVar.h(j) != j) {
                    throw new java.lang.IllegalStateException("Unexpected child seekToUs result.");
                }
            } else if (j == -9223372036854775807L) {
                for (defpackage.ffs ffsVar2 : this.h) {
                    if (ffsVar2 == ffsVar) {
                        break;
                    }
                    if (ffsVar2.h(jG) != jG) {
                        throw new java.lang.IllegalStateException("Unexpected child seekToUs result.");
                    }
                }
                j = jG;
            } else if (jG != j) {
                throw new java.lang.IllegalStateException("Conflicting discontinuities.");
            }
        }
        return j;
    }

    @Override // defpackage.ffs
    public final long h(long j) {
        long jH = this.h[0].h(j);
        int i = 1;
        while (true) {
            defpackage.ffs[] ffsVarArr = this.h;
            if (i >= ffsVarArr.length) {
                return jH;
            }
            if (ffsVarArr[i].h(jH) != jH) {
                throw new java.lang.IllegalStateException("Unexpected child seekToUs result.");
            }
            i++;
        }
    }

    @Override // defpackage.ffs
    public final long i(defpackage.fii[] fiiVarArr, boolean[] zArr, defpackage.fgv[] fgvVarArr, boolean[] zArr2, long j) {
        int length;
        int length2 = fiiVarArr.length;
        int[] iArr = new int[length2];
        int[] iArr2 = new int[length2];
        int i = 0;
        int i2 = 0;
        while (true) {
            length = fiiVarArr.length;
            if (i2 >= length) {
                break;
            }
            defpackage.fgv fgvVar = fgvVarArr[i2];
            java.lang.Integer num = fgvVar == null ? null : (java.lang.Integer) this.c.get(fgvVar);
            iArr[i2] = num == null ? -1 : num.intValue();
            defpackage.fii fiiVar = fiiVarArr[i2];
            if (fiiVar != null) {
                java.lang.String str = fiiVar.c().b;
                iArr2[i2] = java.lang.Integer.parseInt(str.substring(0, str.indexOf(":")));
            } else {
                iArr2[i2] = -1;
            }
            i2++;
        }
        java.util.IdentityHashMap identityHashMap = this.c;
        identityHashMap.clear();
        defpackage.ffs[] ffsVarArr = this.a;
        defpackage.fgv[] fgvVarArr2 = new defpackage.fgv[length];
        defpackage.fgv[] fgvVarArr3 = new defpackage.fgv[length];
        defpackage.fii[] fiiVarArr2 = new defpackage.fii[length];
        java.util.ArrayList arrayList = new java.util.ArrayList(ffsVarArr.length);
        long j2 = j;
        int i3 = 0;
        while (i3 < ffsVarArr.length) {
            int i4 = i;
            while (i4 < fiiVarArr.length) {
                fgvVarArr3[i4] = iArr[i4] == i3 ? fgvVarArr[i4] : null;
                if (iArr2[i4] == i3) {
                    defpackage.fii fiiVar2 = fiiVarArr[i4];
                    ahvr.ci(fiiVar2);
                    defpackage.ern ernVar = (defpackage.ern) this.e.get(fiiVar2.c());
                    ahvr.ci(ernVar);
                    fiiVarArr2[i4] = new defpackage.fgb(fiiVar2, ernVar);
                } else {
                    fiiVarArr2[i4] = null;
                }
                i4++;
                iArr2 = iArr2;
            }
            int[] iArr3 = iArr2;
            java.util.ArrayList arrayList2 = arrayList;
            int i5 = i3;
            long jI = ffsVarArr[i3].i(fiiVarArr2, zArr, fgvVarArr3, zArr2, j2);
            if (i5 == 0) {
                j2 = jI;
            } else if (jI != j2) {
                throw new java.lang.IllegalStateException("Children enabled at different positions.");
            }
            boolean z = false;
            for (int i6 = 0; i6 < fiiVarArr.length; i6++) {
                if (iArr3[i6] == i5) {
                    defpackage.fgv fgvVar2 = fgvVarArr3[i6];
                    ahvr.ci(fgvVar2);
                    fgvVarArr2[i6] = fgvVarArr3[i6];
                    identityHashMap.put(fgvVar2, java.lang.Integer.valueOf(i5));
                    z = true;
                } else if (iArr[i6] == i5) {
                    ahvr.bY(fgvVarArr3[i6] == null);
                }
            }
            if (z) {
                arrayList2.add(ffsVarArr[i5]);
            }
            i3 = i5 + 1;
            arrayList = arrayList2;
            iArr2 = iArr3;
            i = 0;
        }
        int i7 = i;
        java.util.ArrayList arrayList3 = arrayList;
        java.lang.System.arraycopy(fgvVarArr2, i7, fgvVarArr, i7, length);
        this.h = (defpackage.ffs[]) arrayList3.toArray(new defpackage.ffs[i7]);
        this.i = new defpackage.ffd(arrayList3, ahvr.aO(arrayList3, new defpackage.exn(3)));
        return j2;
    }

    @Override // defpackage.ffs
    public final defpackage.fhg j() {
        defpackage.fhg fhgVar = this.g;
        ahvr.ci(fhgVar);
        return fhgVar;
    }

    public final defpackage.ffs k(int i) {
        boolean z = this.b[i];
        defpackage.ffs[] ffsVarArr = this.a;
        return z ? ((defpackage.fhe) ffsVarArr[i]).a : ffsVarArr[i];
    }

    @Override // defpackage.ffs
    public final void l() {
        int i = 0;
        while (true) {
            defpackage.ffs[] ffsVarArr = this.a;
            if (i >= ffsVarArr.length) {
                return;
            }
            ffsVarArr[i].l();
            i++;
        }
    }

    @Override // defpackage.ffs
    public final void m(defpackage.ffr ffrVar, long j) {
        this.f = ffrVar;
        java.util.ArrayList arrayList = this.d;
        defpackage.ffs[] ffsVarArr = this.a;
        java.util.Collections.addAll(arrayList, ffsVarArr);
        for (defpackage.ffs ffsVar : ffsVarArr) {
            ffsVar.m(this, j);
        }
    }

    @Override // defpackage.ffs
    public final void n() {
        int i = 0;
        while (true) {
            defpackage.ffs[] ffsVarArr = this.a;
            if (i >= ffsVarArr.length) {
                return;
            }
            ffsVarArr[i].n();
            i++;
        }
    }

    @Override // defpackage.ffs
    public final void o(long j) {
        for (defpackage.ffs ffsVar : this.h) {
            ffsVar.o(j);
        }
    }
}
