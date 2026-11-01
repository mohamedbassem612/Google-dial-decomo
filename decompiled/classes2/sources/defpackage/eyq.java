package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class eyq {
    public final defpackage.ffs a;
    public final java.lang.Object b;
    public final defpackage.fgv[] c;
    public boolean d;
    public boolean e;
    public boolean f;
    public defpackage.eyr g;
    public defpackage.eyq h;
    public defpackage.fhg i = defpackage.fhg.a;
    public defpackage.fin j;
    public long k;
    private final boolean[] l;
    private final boolean[] m;
    private final defpackage.ezg[] n;
    private final defpackage.fim o;
    private final defpackage.eyz p;

    /* JADX WARN: Type inference failed for: r7v10, types: [ffv, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v1, types: [ffw, java.lang.Object] */
    public eyq(defpackage.ezg[] ezgVarArr, long j, defpackage.fim fimVar, defpackage.fio fioVar, defpackage.eyz eyzVar, defpackage.eyr eyrVar, defpackage.fin finVar, boolean z) {
        this.n = ezgVarArr;
        this.k = j;
        this.o = fimVar;
        this.p = eyzVar;
        this.b = eyrVar.a.a;
        this.g = eyrVar;
        this.j = finVar;
        int length = ezgVarArr.length;
        this.c = new defpackage.fgv[length];
        this.l = new boolean[length];
        this.m = new boolean[length];
        defpackage.ffu ffuVar = eyrVar.a;
        long j2 = eyrVar.b;
        java.lang.Object objQ = defpackage.ewy.q(ffuVar.a);
        defpackage.ffu ffuVarA = ffuVar.a(defpackage.ewy.p(ffuVar.a));
        defpackage.eyx eyxVar = (defpackage.eyx) eyzVar.c.get(objQ);
        ahvr.ci(eyxVar);
        eyzVar.f.add(eyxVar);
        izg izgVar = (izg) eyzVar.e.get(eyxVar);
        if (izgVar != null) {
            izgVar.c.f(izgVar.a);
        }
        eyxVar.c.add(ffuVarA);
        defpackage.ffm ffmVarA = eyxVar.a.A(ffuVarA, fioVar, j2);
        eyzVar.b.put(ffmVarA, eyxVar);
        eyzVar.c();
        this.a = ffmVarA;
        if (z) {
            ffmVarA.n();
        }
    }

    private static /* synthetic */ void q(defpackage.eyq eyqVar) {
        if (!eyqVar.l()) {
            return;
        }
        int i = 0;
        while (true) {
            defpackage.fin finVar = eyqVar.j;
            if (i >= finVar.a) {
                return;
            }
            finVar.b(i);
            defpackage.fii fiiVar = eyqVar.j.c[i];
            i++;
        }
    }

    public final long a(defpackage.fin finVar, long j, boolean z, boolean[] zArr) {
        defpackage.ezg[] ezgVarArr;
        int i = 0;
        while (true) {
            boolean z2 = true;
            if (i >= finVar.a) {
                break;
            }
            boolean[] zArr2 = this.m;
            if (z || !finVar.a(this.j, i)) {
                z2 = false;
            }
            zArr2[i] = z2;
            i++;
        }
        int i2 = 0;
        while (true) {
            ezgVarArr = this.n;
            if (i2 >= ezgVarArr.length) {
                break;
            }
            ezgVarArr[i2].dG();
            i2++;
        }
        q(this);
        this.j = finVar;
        q(this);
        defpackage.ffs ffsVar = this.a;
        defpackage.fii[] fiiVarArr = finVar.c;
        boolean[] zArr3 = this.m;
        defpackage.fgv[] fgvVarArr = this.c;
        long jI = ffsVar.i(fiiVarArr, zArr3, fgvVarArr, zArr, j);
        for (defpackage.ezg ezgVar : ezgVarArr) {
            ezgVar.dG();
        }
        this.f = false;
        for (int i3 = 0; i3 < fgvVarArr.length; i3++) {
            if (fgvVarArr[i3] != null) {
                ahvr.bY(finVar.b(i3));
                ezgVarArr[i3].dG();
                this.f = true;
            } else {
                ahvr.bY(fiiVarArr[i3] == null);
            }
        }
        return jI;
    }

    public final long b() {
        if (!this.e) {
            return this.g.b;
        }
        long jA = this.f ? this.a.a() : Long.MIN_VALUE;
        return jA == Long.MIN_VALUE ? this.g.e : jA;
    }

    public final long c() {
        if (this.e) {
            return this.a.b();
        }
        return 0L;
    }

    public final long d() {
        return this.g.b + this.k;
    }

    public final void e(defpackage.eyo eyoVar) {
        ahvr.bY(l());
        this.a.dI(eyoVar);
    }

    public final void f(defpackage.ffr ffrVar, long j) {
        this.d = true;
        this.a.m(ffrVar, j);
    }

    public final void g() {
        q(this);
        defpackage.eyz eyzVar = this.p;
        defpackage.ffs ffsVar = this.a;
        try {
            java.util.IdentityHashMap identityHashMap = eyzVar.b;
            defpackage.eyx eyxVar = (defpackage.eyx) identityHashMap.remove(ffsVar);
            ahvr.ci(eyxVar);
            eyxVar.a.E(ffsVar);
            eyxVar.c.remove(((defpackage.ffm) ffsVar).a);
            if (!identityHashMap.isEmpty()) {
                eyzVar.c();
            }
            eyzVar.d(eyxVar);
        } catch (java.lang.RuntimeException e) {
            defpackage.etr.d("MediaPeriodHolder", "Period release failed.", e);
        }
    }

    public final void h(defpackage.eyq eyqVar) {
        if (eyqVar != this.h) {
            q(this);
            this.h = eyqVar;
            q(this);
        }
    }

    public final void i(int i) {
        this.l[i] = true;
    }

    public final boolean j() {
        if (this.e) {
            return !this.f || this.a.a() == Long.MIN_VALUE;
        }
        return false;
    }

    public final boolean k() {
        if (this.e) {
            return j() || b() - this.g.b >= -9223372036854775807L;
        }
        return false;
    }

    public final boolean l() {
        return this.h == null;
    }

    public final boolean m(int i) {
        return this.l[i];
    }

    public final long n(defpackage.fin finVar, long j) {
        return a(finVar, j, false, new boolean[this.n.length]);
    }

    /* JADX WARN: Type inference failed for: r9v24, types: [java.lang.Object, java.util.Comparator] */
    public final defpackage.fin o() {
        int length;
        long j;
        boolean z;
        int i;
        int[] iArr;
        int length2;
        long j2;
        long[][] jArr;
        defpackage.kvt[] kvtVarArr;
        int i2;
        android.content.Context context;
        android.view.accessibility.CaptioningManager captioningManager;
        java.util.Locale locale;
        android.content.Context context2;
        final boolean z2;
        android.content.Context context3;
        int length3;
        int[] iArr2;
        defpackage.fhg fhgVar = this.i;
        defpackage.ffu ffuVar = this.g.a;
        defpackage.ezg[] ezgVarArr = this.n;
        int i3 = 1;
        int length4 = ezgVarArr.length + 1;
        int[] iArr3 = new int[length4];
        defpackage.ern[][] ernVarArr = new defpackage.ern[length4][];
        int[][][] iArr4 = new int[length4][][];
        for (int i4 = 0; i4 < length4; i4++) {
            int i5 = fhgVar.b;
            ernVarArr[i4] = new defpackage.ern[i5];
            iArr4[i4] = new int[i5][];
        }
        int length5 = ezgVarArr.length;
        final int[] iArr5 = new int[length5];
        for (int i6 = 0; i6 < length5; i6++) {
            iArr5[i6] = ezgVarArr[i6].dE();
        }
        int i7 = 0;
        while (i7 < fhgVar.b) {
            defpackage.ern ernVarB = fhgVar.b(i7);
            int i8 = ernVarB.c;
            int length6 = ezgVarArr.length;
            int i9 = i3;
            int i10 = 0;
            int i11 = 0;
            while (true) {
                length3 = ezgVarArr.length;
                if (i10 >= length3) {
                    break;
                }
                defpackage.ezg ezgVar = ezgVarArr[i10];
                defpackage.fhg fhgVar2 = fhgVar;
                int i12 = i3;
                int iMax = 0;
                for (int i13 = 0; i13 < ernVarB.a; i13++) {
                    iMax = java.lang.Math.max(iMax, ezgVar.Y(ernVarB.a(i13)) & 7);
                }
                int i14 = iArr3[i10] == 0 ? i12 : 0;
                if (iMax > i11) {
                    i9 = i14;
                    length6 = i10;
                    i11 = iMax;
                } else if (iMax == i11 && i8 == 5 && i9 == 0 && i14 != 0) {
                    length6 = i10;
                    i11 = iMax;
                    i9 = i12;
                }
                i10++;
                i3 = i12;
                fhgVar = fhgVar2;
            }
            defpackage.fhg fhgVar3 = fhgVar;
            int i15 = i3;
            if (length6 == length3) {
                iArr2 = new int[ernVarB.a];
            } else {
                defpackage.ezg ezgVar2 = ezgVarArr[length6];
                int i16 = ernVarB.a;
                int[] iArr6 = new int[i16];
                for (int i17 = 0; i17 < i16; i17++) {
                    iArr6[i17] = ezgVar2.Y(ernVarB.a(i17));
                }
                iArr2 = iArr6;
            }
            int i18 = iArr3[length6];
            ernVarArr[length6][i18] = ernVarB;
            iArr4[length6][i18] = iArr2;
            iArr3[length6] = i18 + 1;
            i7++;
            i3 = i15;
            fhgVar = fhgVar3;
        }
        int i19 = i3;
        int i20 = 0;
        int length7 = ezgVarArr.length;
        defpackage.fhg[] fhgVarArr = new defpackage.fhg[length7];
        java.lang.String[] strArr = new java.lang.String[length7];
        int[] iArr7 = new int[length7];
        int i21 = 0;
        while (true) {
            length = ezgVarArr.length;
            if (i21 >= length) {
                break;
            }
            int i22 = iArr3[i21];
            fhgVarArr[i21] = new defpackage.fhg((defpackage.ern[]) eum.aa(ernVarArr[i21], i22));
            iArr4[i21] = (int[][]) eum.aa(iArr4[i21], i22);
            strArr[i21] = ezgVarArr[i21].U();
            iArr7[i21] = ezgVarArr[i21].dG();
            i21++;
        }
        defpackage.fim fimVar = this.o;
        tgf tgfVar = new tgf(iArr7, fhgVarArr, iArr5, iArr4, new defpackage.fhg((defpackage.ern[]) eum.aa(ernVarArr[length], iArr3[length])));
        final defpackage.fih fihVar = (defpackage.fih) fimVar;
        fihVar.e = java.lang.Thread.currentThread();
        if (fihVar.g == null && (context3 = fihVar.b) != null) {
            fihVar.g = java.lang.Boolean.valueOf(eum.X(context3));
        }
        if (fihVar.d.U && android.os.Build.VERSION.SDK_INT >= 32 && fihVar.h == null) {
            fihVar.h = new defpackage.aeic(fihVar.b, new defpackage.fay(fimVar, 10), fihVar.g);
        }
        int i23 = tgfVar.a;
        defpackage.kvt[] kvtVarArr2 = new defpackage.kvt[i23];
        defpackage.fih.h(tgfVar, fihVar.d);
        defpackage.fih.k(tgfVar, fihVar.d, kvtVarArr2);
        defpackage.fih.l(tgfVar, fihVar.d, kvtVarArr2);
        final defpackage.fib fibVar = fihVar.d;
        android.util.Pair pairI = defpackage.fih.i(kvtVarArr2, i19);
        if (pairI == null) {
            int i24 = 0;
            while (true) {
                if (i24 >= i23) {
                    z2 = false;
                    break;
                }
                if (tgfVar.f(i24) == 2 && tgfVar.h(i24).b > 0) {
                    z2 = true;
                    break;
                }
                i24++;
            }
            pairI = defpackage.fih.g(1, tgfVar, iArr4, new defpackage.fie() { // from class: fhv
                @Override // defpackage.fie
                public final java.util.List a(int i25, defpackage.ern ernVar, int[] iArr8) {
                    defpackage.fih fihVar2 = fihVar;
                    defpackage.fib fibVar2 = fibVar;
                    defpackage.lvq lvqVar = new defpackage.lvq(fihVar2, fibVar2, 1, null);
                    int i26 = iArr5[i25];
                    aift aiftVar = new aift(4);
                    for (int i27 = 0; i27 < ernVar.a; i27++) {
                        aiftVar.i(new defpackage.fhx(i25, ernVar, i27, fibVar2, iArr8[i27], z2, lvqVar));
                    }
                    return aiftVar.h();
                }
            }, new defpackage.djh(12));
            if (pairI != null) {
                kvtVarArr2[((java.lang.Integer) pairI.second).intValue()] = (defpackage.kvt) pairI.first;
            }
        }
        final java.lang.String str = pairI == null ? null : ((defpackage.ern) ((defpackage.kvt) pairI.first).b).a(((int[]) ((defpackage.kvt) pairI.first).a)[0]).d;
        android.util.Pair pairI2 = defpackage.fih.i(kvtVarArr2, 2);
        android.util.Pair pairI3 = defpackage.fih.i(kvtVarArr2, 4);
        if (pairI2 == null && pairI3 == null) {
            int i25 = fibVar.w.b;
            final android.graphics.Point pointD = (!fibVar.k || (context2 = fihVar.b) == null) ? null : eum.D(context2);
            android.util.Pair pairG = defpackage.fih.g(2, tgfVar, iArr4, new defpackage.fie() { // from class: fhu
                /* JADX WARN: Code duplicated, block: B:25:0x0044  */
                @Override // defpackage.fie
                public final java.util.List a(int i26, defpackage.ern ernVar, int[] iArr8) {
                    int i27;
                    int i28;
                    int i29;
                    int i30;
                    int i31;
                    int i32;
                    android.graphics.Point point;
                    defpackage.ern ernVar2 = ernVar;
                    int i33 = iArr5[i26];
                    defpackage.fib fibVar2 = fibVar;
                    android.graphics.Point point2 = pointD;
                    if (point2 != null) {
                        i27 = point2.x;
                        i28 = point2.y;
                    } else {
                        i27 = fibVar2.i;
                        i28 = fibVar2.j;
                    }
                    boolean z3 = fibVar2.l;
                    if (i27 == Integer.MAX_VALUE || i28 == Integer.MAX_VALUE) {
                        i29 = Integer.MAX_VALUE;
                    } else {
                        int i34 = Integer.MAX_VALUE;
                        for (int i35 = 0; i35 < ernVar2.a; i35++) {
                            defpackage.eqg eqgVarA = ernVar2.a(i35);
                            int i36 = eqgVarA.v;
                            if (i36 > 0 && (i30 = eqgVarA.w) > 0) {
                                if (!z3) {
                                    i31 = i28;
                                    i32 = i27;
                                } else if ((i36 > i30) != (i27 > i28)) {
                                    i32 = i28;
                                    i31 = i27;
                                } else {
                                    i31 = i28;
                                    i32 = i27;
                                }
                                int i37 = i36 * i31;
                                int i38 = i30 * i32;
                                if (i37 >= i38) {
                                    java.lang.String str2 = eum.a;
                                    point = new android.graphics.Point(i32, ((i38 + i36) - 1) / i36);
                                } else {
                                    java.lang.String str3 = eum.a;
                                    point = new android.graphics.Point(((i37 + i30) - 1) / i30, i31);
                                }
                                int i39 = i36 * i30;
                                if (i36 >= ((int) (point.x * 0.98f)) && i30 >= ((int) (point.y * 0.98f)) && i39 < i34) {
                                    i34 = i39;
                                }
                            }
                        }
                        i29 = i34;
                    }
                    aift aiftVar = new aift(4);
                    int i40 = 0;
                    while (i40 < ernVar2.a) {
                        int iA = ernVar2.a(i40).a();
                        aiftVar.i(new defpackage.fig(i26, ernVar2, i40, fibVar2, iArr8[i40], str, i29 == Integer.MAX_VALUE || (iA != -1 && iA <= i29)));
                        i40++;
                        ernVar2 = ernVar;
                    }
                    return aiftVar.h();
                }
            }, new defpackage.djh(11));
            boolean z3 = fibVar.E;
            android.util.Pair pairG2 = pairG == null ? defpackage.fih.g(4, tgfVar, iArr4, new defpackage.fie() { // from class: fht
                @Override // defpackage.fie
                public final java.util.List a(int i26, defpackage.ern ernVar, int[] iArr8) {
                    aift aiftVar = new aift(4);
                    for (int i27 = 0; i27 < ernVar.a; i27++) {
                        aiftVar.i(new defpackage.fhy(i26, ernVar, i27, fibVar, iArr8[i27]));
                    }
                    return aiftVar.h();
                }
            }, new defpackage.djh(10)) : null;
            if (pairG2 != null) {
                kvtVarArr2[((java.lang.Integer) pairG2.second).intValue()] = (defpackage.kvt) pairG2.first;
            } else if (pairG != null) {
                kvtVarArr2[((java.lang.Integer) pairG.second).intValue()] = (defpackage.kvt) pairG.first;
            }
        }
        if (defpackage.fih.i(kvtVarArr2, 3) == null) {
            int i26 = fibVar.w.b;
            final java.lang.String languageTag = (!fibVar.B || (context = fihVar.b) == null || (captioningManager = (android.view.accessibility.CaptioningManager) context.getSystemService("captioning")) == null || !captioningManager.isEnabled() || (locale = captioningManager.getLocale()) == null) ? null : locale.toLanguageTag();
            android.util.Pair pairG3 = defpackage.fih.g(3, tgfVar, iArr4, new defpackage.fie() { // from class: fhw
                @Override // defpackage.fie
                public final java.util.List a(int i27, defpackage.ern ernVar, int[] iArr8) {
                    aift aiftVar = new aift(4);
                    for (int i28 = 0; i28 < ernVar.a; i28++) {
                        aiftVar.i(new defpackage.fid(i27, ernVar, i28, fibVar, iArr8[i28], str, languageTag));
                    }
                    return aiftVar.h();
                }
            }, new defpackage.djh(9));
            if (pairG3 != null) {
                kvtVarArr2[((java.lang.Integer) pairG3.second).intValue()] = (defpackage.kvt) pairG3.first;
            }
        }
        int i27 = fibVar.w.b;
        aihb aihbVar = new aihb();
        for (int i28 = 0; i28 < i23; i28++) {
            defpackage.kvt kvtVar = kvtVarArr2[i28];
            if (kvtVar != null && !fibVar.a(i28)) {
                aihd aihdVar = fibVar.I;
                defpackage.ern ernVar = (defpackage.ern) kvtVar.b;
                if (!aihdVar.contains(java.lang.Integer.valueOf(ernVar.c))) {
                    aihbVar.i(ernVar.b);
                    int i29 = 0;
                    while (true) {
                        int[] iArr8 = (int[]) kvtVar.a;
                        if (i29 < iArr8.length) {
                            java.lang.String str2 = ernVar.a(iArr8[i29]).n;
                            if (str2 != null) {
                                aihbVar.i(str2);
                            }
                            i29++;
                        }
                    }
                }
            }
        }
        aihd aihdVarH = aihbVar.h();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        int i30 = 0;
        while (i30 < i23) {
            if (tgfVar.f(i30) == 5) {
                defpackage.fhg fhgVarH = tgfVar.h(i30);
                int i31 = 0;
                while (i31 < fhgVarH.b) {
                    defpackage.ern ernVarB2 = fhgVarH.b(i31);
                    arrayList.add(ernVarB2);
                    int[] iArr9 = (int[]) iArr4[i30][i31].clone();
                    defpackage.ezg[] ezgVarArr2 = ezgVarArr;
                    int[][][] iArr10 = iArr4;
                    for (int i32 = 0; i32 < iArr9.length; i32++) {
                        java.lang.String str3 = ernVarB2.a(i32).n;
                        if (str3 != null && !aihdVarH.contains(str3)) {
                            iArr9[i32] = 128;
                        }
                    }
                    arrayList2.add(iArr9);
                    i31++;
                    ezgVarArr = ezgVarArr2;
                    iArr4 = iArr10;
                }
            }
            i30++;
            ezgVarArr = ezgVarArr;
            iArr4 = iArr4;
        }
        defpackage.ezg[] ezgVarArr3 = ezgVarArr;
        int[][][] iArr11 = iArr4;
        int i33 = 128;
        defpackage.ern[] ernVarArr2 = new defpackage.ern[arrayList.size()];
        eum.P(arrayList, ernVarArr2);
        defpackage.fhg fhgVar4 = new defpackage.fhg(ernVarArr2);
        int[][] iArr12 = new int[arrayList2.size()][];
        eum.P(arrayList2, iArr12);
        int i34 = 0;
        while (i34 < i23) {
            if (tgfVar.f(i34) == 5) {
                defpackage.kvt kvtVarJ = defpackage.fih.j(fhgVar4, iArr12, fibVar);
                kvtVarArr2[i34] = kvtVarJ;
                if (kvtVarJ == null) {
                    break;
                }
                i2 = i33;
                java.util.Arrays.fill(iArr12[fhgVar4.a((defpackage.ern) kvtVarJ.b)], i2);
            } else {
                i2 = i33;
            }
            i34++;
            i33 = i2;
        }
        for (int i35 = 0; i35 < i23; i35++) {
            int iF = tgfVar.f(i35);
            if (iF != 2 && iF != 1 && iF != 3 && iF != 4 && iF != 5 && kvtVarArr2[i35] == null) {
                kvtVarArr2[i35] = defpackage.fih.j(tgfVar.h(i35), iArr11[i35], fibVar);
            }
        }
        defpackage.fih.h(tgfVar, fihVar.d);
        defpackage.fih.k(tgfVar, fihVar.d, kvtVarArr2);
        defpackage.fih.l(tgfVar, fihVar.d, kvtVarArr2);
        defpackage.oq oqVar = fihVar.i;
        ahvr.ci(fimVar.k);
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        for (int i36 = 0; i36 < i23; i36++) {
            defpackage.kvt kvtVar2 = kvtVarArr2[i36];
            if (kvtVar2 == null || ((int[]) kvtVar2.a).length <= 1) {
                arrayList3.add(null);
            } else {
                aift aiftVar = new aift(4);
                aiftVar.i(new defpackage.fhq(0L, 0L));
                arrayList3.add(aiftVar);
            }
        }
        long[][] jArr2 = new long[i23][];
        int i37 = 0;
        while (true) {
            j = -1;
            if (i37 >= i23) {
                break;
            }
            defpackage.kvt kvtVar3 = kvtVarArr2[i37];
            if (kvtVar3 == null) {
                jArr2[i37] = new long[i20];
            } else {
                int[] iArr13 = (int[]) kvtVar3.a;
                jArr2[i37] = new long[iArr13.length];
                for (int i38 = 0; i38 < iArr13.length; i38++) {
                    long j3 = ((defpackage.ern) kvtVar3.b).a(iArr13[i38]).j;
                    long[] jArr3 = jArr2[i37];
                    if (j3 == -1) {
                        j3 = 0;
                    }
                    jArr3[i38] = j3;
                }
                java.util.Arrays.sort(jArr2[i37]);
            }
            i37++;
            i20 = 0;
        }
        int[] iArr14 = new int[i23];
        long[] jArr4 = new long[i23];
        for (int i39 = 0; i39 < i23; i39++) {
            long[] jArr5 = jArr2[i39];
            jArr4[i39] = jArr5.length == 0 ? 0L : jArr5[0];
        }
        defpackage.fhr.d(arrayList3, jArr4);
        aijg aijgVar = new aijg(aiju.a);
        j$.util.Objects.requireNonNull(aijgVar);
        aicz aiczVarAz = ahvr.az(aijgVar);
        int i40 = 0;
        while (i40 < i23) {
            int length8 = jArr2[i40].length;
            if (length8 <= 1) {
                jArr = jArr2;
                j2 = j;
                kvtVarArr = kvtVarArr2;
            } else {
                double[] dArr = new double[length8];
                j2 = j;
                int i41 = 0;
                while (true) {
                    long[] jArr6 = jArr2[i40];
                    double dLog = 0.0d;
                    jArr = jArr2;
                    if (i41 >= jArr6.length) {
                        break;
                    }
                    defpackage.kvt[] kvtVarArr3 = kvtVarArr2;
                    long j4 = jArr6[i41];
                    if (j4 != j2) {
                        dLog = java.lang.Math.log(j4);
                    }
                    dArr[i41] = dLog;
                    i41++;
                    kvtVarArr2 = kvtVarArr3;
                    jArr2 = jArr;
                }
                kvtVarArr = kvtVarArr2;
                int i42 = length8 - 1;
                double d = dArr[i42] - dArr[0];
                int i43 = 0;
                while (i43 < i42) {
                    double d2 = dArr[i43];
                    i43++;
                    aiczVarAz.t(java.lang.Double.valueOf(d == 0.0d ? 1.0d : (((d2 + dArr[i43]) * 0.5d) - dArr[0]) / d), java.lang.Integer.valueOf(i40));
                    d = d;
                }
            }
            i40++;
            kvtVarArr2 = kvtVarArr;
            j = j2;
            jArr2 = jArr;
        }
        long[][] jArr7 = jArr2;
        defpackage.kvt[] kvtVarArr4 = kvtVarArr2;
        aify aifyVarN = aify.n(new aicy(aiczVarAz));
        for (int i44 = 0; i44 < aifyVarN.size(); i44++) {
            int iIntValue = ((java.lang.Integer) aifyVarN.get(i44)).intValue();
            int i45 = iArr14[iIntValue] + 1;
            iArr14[iIntValue] = i45;
            jArr4[iIntValue] = jArr7[iIntValue][i45];
            defpackage.fhr.d(arrayList3, jArr4);
        }
        for (int i46 = 0; i46 < i23; i46++) {
            if (arrayList3.get(i46) != null) {
                jArr4[i46] = jArr4[i46] << 1;
            }
        }
        defpackage.fhr.d(arrayList3, jArr4);
        aift aiftVar2 = new aift(4);
        for (int i47 = 0; i47 < arrayList3.size(); i47++) {
            aift aiftVar3 = (aift) arrayList3.get(i47);
            aiftVar2.i(aiftVar3 == null ? aike.a : aiftVar3.h());
        }
        aify aifyVarH = aiftVar2.h();
        defpackage.fii[] fiiVarArr = new defpackage.fii[i23];
        for (int i48 = 0; i48 < i23; i48++) {
            defpackage.kvt kvtVar4 = kvtVarArr4[i48];
            if (kvtVar4 != null && (length2 = (iArr = (int[]) kvtVar4.a).length) != 0) {
                fiiVarArr[i48] = length2 == 1 ? new defpackage.fhs((defpackage.ern) kvtVar4.b, new int[]{iArr[0]}, defpackage.fhs.a) : new defpackage.fhr((defpackage.ern) kvtVar4.b, iArr, (aify) aifyVarH.get(i48), oqVar.a);
            }
        }
        defpackage.ezh[] ezhVarArr = new defpackage.ezh[i23];
        for (int i49 = 0; i49 < i23; i49++) {
            ezhVarArr[i49] = (fihVar.d.a(i49) || fihVar.d.I.contains(java.lang.Integer.valueOf(tgfVar.f(i49))) || (tgfVar.f(i49) != -2 && fiiVarArr[i49] == null)) ? null : defpackage.ezh.a;
        }
        defpackage.fib fibVar2 = fihVar.d;
        boolean z4 = fibVar2.W;
        int i50 = fibVar2.w.b;
        android.util.Pair pairCreate = android.util.Pair.create(ezhVarArr, fiiVarArr);
        defpackage.fik[] fikVarArr = (defpackage.fik[]) pairCreate.second;
        int length9 = fikVarArr.length;
        java.util.List[] listArr = new java.util.List[length9];
        for (int i51 = 0; i51 < fikVarArr.length; i51++) {
            defpackage.fik fikVar = fikVarArr[i51];
            listArr[i51] = fikVar != null ? aify.p(fikVar) : aike.a;
        }
        aift aiftVar4 = new aift(4);
        for (int i52 = 0; i52 < i23; i52++) {
            defpackage.fhg fhgVarH2 = tgfVar.h(i52);
            int i53 = 0;
            while (i53 < fhgVarH2.b) {
                defpackage.ern ernVarB3 = fhgVarH2.b(i53);
                defpackage.fhg[] fhgVarArr2 = (defpackage.fhg[]) tgfVar.f;
                int i54 = fhgVarArr2[i52].b(i53).a;
                int[] iArr15 = new int[i54];
                int i55 = 0;
                int i56 = 0;
                while (i55 < i54) {
                    int i57 = i23;
                    if (tgfVar.g(i52, i53, i55) == 4) {
                        iArr15[i56] = i55;
                        i56++;
                    }
                    i55++;
                    i23 = i57;
                }
                int i58 = i23;
                int[] iArrCopyOf = java.util.Arrays.copyOf(iArr15, i56);
                int iMin = 16;
                java.util.List[] listArr2 = listArr;
                java.lang.String str4 = null;
                int i59 = 0;
                boolean z5 = false;
                int i60 = 0;
                while (i59 < iArrCopyOf.length) {
                    defpackage.fhg fhgVar5 = fhgVarH2;
                    java.lang.String str5 = fhgVarArr2[i52].b(i53).a(iArrCopyOf[i59]).p;
                    int i61 = i60 + 1;
                    if (i60 == 0) {
                        str4 = str5;
                    } else {
                        z5 |= !j$.util.Objects.equals(str4, str5);
                    }
                    iMin = java.lang.Math.min(iMin, ((int[][][]) tgfVar.e)[i52][i53][i59] & 24);
                    i59++;
                    i60 = i61;
                    fhgVarH2 = fhgVar5;
                }
                defpackage.fhg fhgVar6 = fhgVarH2;
                if (z5) {
                    iMin = java.lang.Math.min(iMin, ((int[]) tgfVar.c)[i52]);
                }
                boolean z6 = iMin != 0;
                int i62 = ernVarB3.a;
                int[] iArr16 = new int[i62];
                boolean[] zArr = new boolean[i62];
                for (int i63 = 0; i63 < i62; i63++) {
                    iArr16[i63] = tgfVar.g(i52, i53, i63);
                    boolean z7 = false;
                    int i64 = 0;
                    while (i64 < length9) {
                        java.util.List list = listArr2[i64];
                        int i65 = length9;
                        int i66 = 0;
                        while (true) {
                            if (i66 >= list.size()) {
                                i = i62;
                                break;
                            }
                            defpackage.fik fikVar2 = (defpackage.fik) list.get(i66);
                            i = i62;
                            if (fikVar2.c().equals(ernVarB3) && fikVar2.g(i63) != -1) {
                                z7 = true;
                                break;
                            }
                            i66++;
                            i62 = i;
                        }
                        i64++;
                        length9 = i65;
                        i62 = i;
                    }
                    zArr[i63] = z7;
                }
                aiftVar4.i(new defpackage.ers(ernVarB3, z6, iArr16, zArr));
                i53++;
                i23 = i58;
                listArr = listArr2;
                fhgVarH2 = fhgVar6;
                length9 = length9;
            }
        }
        java.lang.Object obj = tgfVar.b;
        int i67 = 0;
        while (true) {
            defpackage.fhg fhgVar7 = (defpackage.fhg) obj;
            if (i67 >= fhgVar7.b) {
                break;
            }
            defpackage.ern ernVarB4 = fhgVar7.b(i67);
            int i68 = ernVarB4.a;
            int[] iArr17 = new int[i68];
            java.util.Arrays.fill(iArr17, 0);
            aiftVar4.i(new defpackage.ers(ernVarB4, false, iArr17, new boolean[i68]));
            i67++;
        }
        defpackage.fin finVar = new defpackage.fin((defpackage.ezh[]) pairCreate.first, (defpackage.fii[]) pairCreate.second, new defpackage.ert(aiftVar4.h()), tgfVar);
        for (int i69 = 0; i69 < finVar.a; i69++) {
            boolean zB = finVar.b(i69);
            defpackage.fii[] fiiVarArr2 = finVar.c;
            if (zB) {
                if (fiiVarArr2[i69] == null) {
                    ezgVarArr3[i69].dG();
                    z = false;
                } else {
                    z = true;
                }
                ahvr.bY(z);
            } else {
                ahvr.bY(fiiVarArr2[i69] == null);
            }
        }
        for (defpackage.fii fiiVar : finVar.c) {
        }
        return finVar;
    }

    public final void p() {
        this.e = true;
        java.util.Arrays.fill(this.l, false);
        this.i = this.a.j();
        defpackage.fin finVarO = o();
        defpackage.eyr eyrVar = this.g;
        long jMax = eyrVar.b;
        long j = eyrVar.e;
        if (j != -9223372036854775807L && jMax >= j) {
            jMax = java.lang.Math.max(0L, j - 1);
        }
        long jN = n(finVarO, jMax);
        long j2 = this.k;
        defpackage.eyr eyrVar2 = this.g;
        this.k = j2 + (eyrVar2.b - jN);
        this.g = eyrVar2.b(jN, eyrVar2.c);
    }
}
