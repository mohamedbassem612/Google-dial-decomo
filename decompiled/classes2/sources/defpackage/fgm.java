package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class fgm implements defpackage.ffs, defpackage.fll, defpackage.fis, defpackage.fiu, defpackage.fgt {
    public static final java.util.Map a;
    public static final defpackage.eqg b;
    private final defpackage.fio A;
    private final boolean B;
    private final defpackage.eqg C;
    private final long D;
    private boolean H;
    private boolean I;
    private boolean J;
    private int L;
    private defpackage.agpn M;
    private final alic N;
    public defpackage.ffr h;
    public defpackage.fnz i;
    public boolean k;
    public defpackage.fma l;
    public long m;
    public boolean n;
    public boolean p;
    public boolean q;
    public boolean r;
    public final defpackage.fgp s;
    public final defpackage.fey t;
    public final alic v;
    private final android.net.Uri x;
    private final defpackage.evr y;
    private final defpackage.fcx z;
    private final long K = Long.MIN_VALUE;
    public final defpackage.fix c = new defpackage.fix(new defpackage.fjb(eum.N("ExoPlayer:Loader:ProgressiveMediaPeriod"), new defpackage.fch(3)));
    public final defpackage.agze u = new defpackage.agze(null);
    public final java.lang.Runnable d = new defpackage.fay(this, 8);
    public final java.lang.Runnable e = new defpackage.fay(this, 9);
    public final android.os.Handler f = eum.ah();
    private defpackage.fgl[] G = new defpackage.fgl[0];
    public defpackage.fgu[] j = new defpackage.fgu[0];
    private defpackage.fgh[] F = new defpackage.fgh[0];
    private final java.util.List E = new java.util.ArrayList();
    public final defpackage.fgj g = new defpackage.fgj();
    public int o = 1;

    static {
        java.util.HashMap map = new java.util.HashMap();
        map.put("Icy-MetaData", "1");
        a = j$.util.DesugarCollections.unmodifiableMap(map);
        defpackage.eqf eqfVar = new defpackage.eqf();
        eqfVar.a = "icy";
        eqfVar.c("application/x-icy");
        b = new defpackage.eqg(eqfVar);
    }

    public fgm(android.net.Uri uri, defpackage.evr evrVar, defpackage.fey feyVar, defpackage.fcx fcxVar, alic alicVar, alic alicVar2, defpackage.fgp fgpVar, defpackage.fio fioVar, boolean z, defpackage.eqg eqgVar, long j) {
        this.x = uri;
        this.y = evrVar;
        this.z = fcxVar;
        this.N = alicVar;
        this.v = alicVar2;
        this.s = fgpVar;
        this.A = fioVar;
        this.B = z;
        this.C = eqgVar;
        this.t = feyVar;
        this.D = j;
    }

    private static int C(int i) {
        if (i == 1) {
            return 3;
        }
        if (i == 2) {
            return 4;
        }
        if (i != 3) {
            return i != 4 ? 0 : 2;
        }
        return 1;
    }

    private final void D() {
        ahvr.bY(this.k);
        ahvr.ci(this.M);
        ahvr.ci(this.l);
    }

    private final void E() {
        defpackage.fgj fgjVar = this.g;
        boolean zF = fgjVar.f();
        long j = zF ? fgjVar.c : -9223372036854775807L;
        boolean z = this.k;
        long j2 = this.m;
        int iK = k();
        if (!z || !fgjVar.f() || j2 == -9223372036854775807L || fgjVar.c <= j2) {
            fgjVar.d = iK;
            fgjVar.c = -9223372036854775807L;
            fgjVar.a = 2;
        } else {
            fgjVar.c = -9223372036854775807L;
            fgjVar.a = 4;
        }
        if (fgjVar.e()) {
            return;
        }
        this.q = false;
        defpackage.agze agzeVar = this.u;
        agzeVar.g();
        defpackage.fgi fgiVar = new defpackage.fgi(this, this.x, this.y, this.t, this, agzeVar);
        if (this.k) {
            if (zF) {
                defpackage.fma fmaVar = this.l;
                ahvr.ci(fmaVar);
                fgiVar.b(fmaVar.b(j).a.c, j);
                for (defpackage.fgu fguVar : this.j) {
                    fguVar.m = j;
                }
            } else {
                D();
                ahvr.bY(this.L > 0);
                long jMin = Long.MAX_VALUE;
                int i = 0;
                while (true) {
                    defpackage.fgu[] fguVarArr = this.j;
                    if (i >= fguVarArr.length) {
                        ahvr.bY(jMin != Long.MAX_VALUE);
                        break;
                    }
                    defpackage.agpn agpnVar = this.M;
                    if (((boolean[]) agpnVar.e)[i] && (((boolean[]) agpnVar.d)[i] || !agpnVar.a)) {
                        long jK = fguVarArr[i].k();
                        if (jK == Long.MIN_VALUE) {
                            jMin = fgjVar.b;
                            break;
                        }
                        jMin = java.lang.Math.min(jMin, jK);
                    }
                    i++;
                }
                defpackage.fma fmaVar2 = this.l;
                ahvr.ci(fmaVar2);
                defpackage.fmb fmbVar = fmaVar2.b(jMin).a;
                fgiVar.b(fmbVar.c, fmbVar.b);
                for (defpackage.fgu fguVar2 : this.j) {
                    int i2 = fguVar2.j;
                    if (i2 > 0) {
                        fguVar2.s = false;
                        fguVar2.u = fguVar2.i[fguVar2.g(i2 - 1)];
                        int i3 = 0;
                        for (int i4 = fguVar2.j - 1; i4 >= 0; i4--) {
                            if (java.lang.Math.abs(fguVar2.i[fguVar2.g(i4)] - fguVar2.u) > 1000) {
                                break;
                            }
                            i3++;
                        }
                        fguVar2.v = i3;
                        fguVar2.t = true;
                    } else {
                        fguVar2.t = false;
                        fguVar2.v = 0;
                    }
                }
            }
        }
        defpackage.fix fixVar = this.c;
        android.os.Looper looperMyLooper = android.os.Looper.myLooper();
        ahvr.ci(looperMyLooper);
        fixVar.b = null;
        new defpackage.fit(fixVar, looperMyLooper, fgiVar, this, android.os.SystemClock.elapsedRealtime()).b(0L);
    }

    private final boolean F(int i, long j) {
        defpackage.fly flyVarB;
        if (this.J) {
            return false;
        }
        D();
        defpackage.eqg eqgVarA = ((defpackage.fhg) this.M.b).b(i).a(0);
        if (defpackage.fgu.u(eqgVarA.p, eqgVarA.k) || !this.l.d()) {
            return false;
        }
        int i2 = this.G[i].a;
        defpackage.fma fmaVar = this.l;
        if (fmaVar instanceof defpackage.fmi) {
            defpackage.fmi fmiVar = (defpackage.fmi) fmaVar;
            flyVarB = fmiVar.f(i2) ? fmiVar.e(j, i2) : this.l.b(j);
        } else {
            flyVarB = fmaVar.b(j);
        }
        return flyVarB.a.b < j;
    }

    public final boolean A() {
        return false;
    }

    @Override // defpackage.fis
    public final /* bridge */ /* synthetic */ void B(defpackage.fgi fgiVar, long j, long j2, boolean z) {
        defpackage.ewl ewlVar = fgiVar.c;
        defpackage.ffk ffkVar = new defpackage.ffk(fgiVar.a, fgiVar.h, j);
        ffkVar.d = ewlVar.b;
        ffkVar.e = ewlVar.c;
        ffkVar.f = j2;
        ffkVar.g = ewlVar.a;
        this.v.g(new defpackage.ffl(ffkVar), new defpackage.ffq(this.o, -1, null, eum.C(fgiVar.g), eum.C(this.m)));
        defpackage.fgj fgjVar = this.g;
        boolean zA = A();
        if (!z) {
            int i = fgjVar.a;
            int i2 = 1;
            if (i == 7) {
                if (zA && !fgjVar.f()) {
                    i2 = 8;
                }
                fgjVar.a = i2;
            } else if (i == 3) {
                fgjVar.a = 1;
            }
        }
        if (z) {
            return;
        }
        if (fgjVar.c()) {
            t();
        } else if (fgjVar.f()) {
            for (defpackage.fgu fguVar : this.j) {
                fguVar.r(false);
            }
        }
        if (this.L <= 0 || fgjVar.e()) {
            return;
        }
        defpackage.ffr ffrVar = this.h;
        ahvr.ci(ffrVar);
        ffrVar.c(this);
    }

    @Override // defpackage.ffs, defpackage.fgx
    public final long a() {
        long jP;
        D();
        defpackage.fgj fgjVar = this.g;
        if (fgjVar.e() || this.L == 0) {
            return Long.MIN_VALUE;
        }
        if (fgjVar.f()) {
            return fgjVar.c;
        }
        if (this.I) {
            int length = this.j.length;
            jP = Long.MAX_VALUE;
            for (int i = 0; i < length; i++) {
                defpackage.agpn agpnVar = this.M;
                if (((boolean[]) agpnVar.d)[i] && ((boolean[]) agpnVar.e)[i] && !this.j[i].v()) {
                    jP = java.lang.Math.min(jP, this.j[i].k());
                }
            }
        } else {
            jP = Long.MAX_VALUE;
        }
        if (jP == Long.MAX_VALUE) {
            jP = p(false);
        }
        return jP == Long.MIN_VALUE ? fgjVar.b : jP;
    }

    @Override // defpackage.ffs, defpackage.fgx
    public final long b() {
        return a();
    }

    @Override // defpackage.ffs, defpackage.fgx
    public final void dH(long j) {
        if (this.L <= 0 || !A()) {
            return;
        }
        this.g.a();
        t();
    }

    @Override // defpackage.ffs, defpackage.fgx
    public final boolean dI(defpackage.eyo eyoVar) {
        boolean z = this.k || this.C != null;
        defpackage.fgj fgjVar = this.g;
        int i = this.L;
        int i2 = fgjVar.a;
        if (i2 != 1 && i2 != 2) {
            return false;
        }
        if (z && i <= 0) {
            return false;
        }
        if (this.c.a == null) {
            E();
            return true;
        }
        if (!this.q) {
            return false;
        }
        this.q = false;
        return this.u.g();
    }

    @Override // defpackage.ffs, defpackage.fgx
    public final boolean e() {
        defpackage.fgj fgjVar = this.g;
        return (fgjVar.a == 2 || fgjVar.b()) && this.u.f();
    }

    /* JADX WARN: Code duplicated, block: B:24:0x005e  */
    /* JADX WARN: Code duplicated, block: B:26:0x0062  */
    /* JADX WARN: Code duplicated, block: B:27:0x0064  */
    @Override // defpackage.ffs
    public final long f(long j, defpackage.ezk ezkVar) {
        D();
        if (!this.l.d()) {
            return 0L;
        }
        defpackage.fly flyVarB = this.l.b(j);
        defpackage.fmb fmbVar = flyVarB.a;
        defpackage.fmb fmbVar2 = flyVarB.b;
        long j2 = ezkVar.d;
        if (j2 == 0) {
            if (ezkVar.e == 0) {
                return j;
            }
            j2 = 0;
        }
        java.lang.String str = eum.a;
        long j3 = j - j2;
        long j4 = Long.MAX_VALUE;
        long j5 = ((((j2 ^ j) > 0L ? 1 : ((j2 ^ j) == 0L ? 0 : -1)) ^ (-1)) | (((j ^ j3) > 0L ? 1 : ((j ^ j3) == 0L ? 0 : -1)) ^ (-1))) < 0 ? j3 : ((j3 >>> 63) ^ 1) + Long.MAX_VALUE;
        if (j5 != Long.MIN_VALUE) {
            if (j5 == Long.MAX_VALUE) {
                if (j3 != Long.MAX_VALUE) {
                    j5 = Long.MIN_VALUE;
                } else {
                    j5 = Long.MAX_VALUE;
                }
            }
        } else if (j3 == Long.MIN_VALUE) {
            j3 = Long.MIN_VALUE;
            if (j5 == Long.MAX_VALUE) {
                if (j3 != Long.MAX_VALUE) {
                    j5 = Long.MIN_VALUE;
                } else {
                    j5 = Long.MAX_VALUE;
                }
            }
        } else {
            j5 = Long.MIN_VALUE;
        }
        long j6 = ezkVar.e;
        long jAi = aiql.ai(j, j6);
        if (jAi != Long.MIN_VALUE || j + j6 == Long.MIN_VALUE) {
            if (jAi == Long.MAX_VALUE) {
                int i = ((j6 + j) > Long.MAX_VALUE ? 1 : ((j6 + j) == Long.MAX_VALUE ? 0 : -1));
            } else {
                j4 = jAi;
            }
        }
        long j7 = fmbVar.b;
        boolean z = j5 <= j7 && j7 <= j4;
        long j8 = fmbVar2.b;
        boolean z2 = j5 <= j8 && j8 <= j4;
        if (z) {
            return (!z2 || java.lang.Math.abs(j7 - j) <= java.lang.Math.abs(j8 - j)) ? j7 : j8;
        }
        return !z2 ? j5 : j8;
    }

    @Override // defpackage.ffs
    public final long g() {
        defpackage.fgj fgjVar = this.g;
        int iK = k();
        if (!fgjVar.h && fgjVar.f) {
            fgjVar.f = false;
        } else {
            if (!fgjVar.e || (!fgjVar.e() && iK <= fgjVar.d)) {
                return -9223372036854775807L;
            }
            fgjVar.e = false;
        }
        return fgjVar.b;
    }

    /* JADX WARN: Code duplicated, block: B:59:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:61:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:63:0x00d6 A[LOOP:2: B:62:0x00d4->B:63:0x00d6, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:65:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:67:0x00ef A[LOOP:3: B:66:0x00ed->B:67:0x00ef, LOOP_END] */
    /* JADX WARN: Instruction removed from duplicated block: B:61:0x00d1, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:65:0x00e4, please report this as an issue */
    @Override // defpackage.ffs
    public final long h(long j) {
        boolean z;
        int i;
        int i2;
        java.util.Iterator it = this.E.iterator();
        while (it.hasNext()) {
            ((defpackage.fgf) it.next()).d();
        }
        D();
        java.lang.Object obj = this.M.d;
        long j2 = true != this.l.d() ? 0L : j;
        defpackage.fgj fgjVar = this.g;
        boolean zF = fgjVar.f();
        long j3 = fgjVar.b;
        int i3 = this.o;
        if (fgjVar.f() || i3 == 7 || (!fgjVar.e() && (i2 = fgjVar.a) != 1 && i2 != 2 && i2 != 7 && i2 != 5)) {
            z = false;
            break;
        }
        int length = this.j.length;
        int i4 = 0;
        while (true) {
            if (i4 >= length) {
                z = true;
                break;
            }
            defpackage.fgu fguVar = this.j[i4];
            if (this.F[i4].e()) {
                if (!this.J) {
                    long j4 = fguVar.j();
                    if (j4 == Long.MIN_VALUE || j2 > j4 || fguVar.k != 0 || j3 != j2) {
                        if (!fguVar.x(j2, fgjVar.e()) && (((boolean[]) obj)[i4] || !this.I)) {
                            z = false;
                            break;
                        }
                    } else {
                        fguVar.A(0);
                    }
                } else {
                    fguVar.A(fguVar.k);
                }
            }
            i4++;
        }
        fgjVar.e = false;
        fgjVar.b = j2;
        if (fgjVar.f()) {
            fgjVar.c = j2;
            if (!z) {
                if (!zF) {
                    if (fgjVar.b()) {
                        for (defpackage.fgu fguVar2 : this.j) {
                            fguVar2.o();
                        }
                        this.c.a();
                    } else {
                        this.c.b();
                        for (defpackage.fgu fguVar3 : this.j) {
                            fguVar3.r(false);
                        }
                    }
                }
            }
        } else if (!z) {
            fgjVar.c = j2;
            fgjVar.f = false;
            int i5 = fgjVar.a;
            if (i5 == 2 || i5 == 3 || i5 == 7) {
                fgjVar.a = 3;
            } else {
                fgjVar.a = 1;
            }
            if (!zF) {
                if (fgjVar.b()) {
                    while (i < r2) {
                        fguVar2.o();
                    }
                    this.c.a();
                } else {
                    this.c.b();
                    while (i < r1) {
                        fguVar3.r(false);
                    }
                }
            }
        }
        return j2;
    }

    /* JADX WARN: Code duplicated, block: B:126:0x0276  */
    /* JADX WARN: Code duplicated, block: B:135:0x0296  */
    /* JADX WARN: Code duplicated, block: B:137:0x02a0  */
    /* JADX WARN: Code duplicated, block: B:149:0x02bd  */
    /* JADX WARN: Code duplicated, block: B:151:0x02ca  */
    /* JADX WARN: Code duplicated, block: B:155:0x02d6  */
    /* JADX WARN: Code duplicated, block: B:157:0x02dc  */
    /* JADX WARN: Code duplicated, block: B:159:0x02e2 A[LOOP:9: B:158:0x02e0->B:159:0x02e2, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:161:0x02f0  */
    /* JADX WARN: Code duplicated, block: B:163:0x02fb A[LOOP:10: B:162:0x02f9->B:163:0x02fb, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:164:0x0304  */
    /* JADX WARN: Code duplicated, block: B:166:0x0307  */
    /* JADX WARN: Code duplicated, block: B:169:0x030f  */
    /* JADX WARN: Code duplicated, block: B:171:0x0313  */
    /* JADX WARN: Code duplicated, block: B:173:0x031b  */
    /* JADX WARN: Code duplicated, block: B:200:0x028d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:206:0x02d2 A[EDGE_INSN: B:206:0x02d2->B:153:0x02d2 BREAK  A[LOOP:8: B:147:0x02b8->B:152:0x02cf], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:208:0x02cf A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:213:0x0320 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:214:0x0320 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:216:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:157:0x02dc, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:161:0x02f0, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v13 */
    /* JADX WARN: Type inference failed for: r10v14 */
    /* JADX WARN: Type inference failed for: r10v15 */
    /* JADX WARN: Type inference failed for: r10v16 */
    /* JADX WARN: Type inference failed for: r10v17 */
    /* JADX WARN: Type inference failed for: r10v24 */
    /* JADX WARN: Type inference failed for: r10v37 */
    /* JADX WARN: Type inference failed for: r10v38 */
    /* JADX WARN: Type inference failed for: r10v39 */
    /* JADX WARN: Type inference failed for: r10v40 */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r23v0 */
    /* JADX WARN: Type inference failed for: r23v1 */
    /* JADX WARN: Type inference failed for: r23v13 */
    /* JADX WARN: Type inference failed for: r23v2, types: [int] */
    /* JADX WARN: Type inference failed for: r23v3 */
    /* JADX WARN: Type inference failed for: r23v4 */
    /* JADX WARN: Type inference failed for: r23v5 */
    /* JADX WARN: Type inference failed for: r23v6 */
    /* JADX WARN: Type inference failed for: r23v9 */
    @Override // defpackage.ffs
    public final long i(defpackage.fii[] fiiVarArr, boolean[] zArr, defpackage.fgv[] fgvVarArr, boolean[] zArr2, long j) {
        boolean z;
        boolean z2;
        boolean z3;
        int i;
        defpackage.fhg fhgVar;
        boolean z4;
        int i2;
        defpackage.fgv fgvVar;
        int i3;
        int i4;
        boolean[] zArr3;
        int length;
        boolean[] zArr4;
        int i5;
        int i6;
        defpackage.fgh[] fghVarArr;
        defpackage.fgh fghVar;
        boolean z5;
        java.lang.Object obj;
        java.lang.Object obj2;
        boolean z6;
        boolean z7;
        ?? r23;
        defpackage.fii fiiVar;
        ?? r24;
        java.lang.String str;
        java.lang.Integer numX;
        boolean z8;
        defpackage.fii[] fiiVarArr2 = fiiVarArr;
        D();
        defpackage.agpn agpnVar = this.M;
        java.lang.Object obj3 = agpnVar.b;
        java.lang.Object obj4 = agpnVar.e;
        int i7 = this.L;
        boolean z9 = false;
        int i8 = 0;
        while (true) {
            z = true;
            if (i8 >= fiiVarArr2.length) {
                z2 = false;
                break;
            }
            defpackage.fii fiiVar2 = fiiVarArr2[i8];
            if (fiiVar2 != null) {
                defpackage.fhg fhgVar2 = (defpackage.fhg) obj3;
                if (j$.util.Objects.equals(fhgVar2.b(fhgVar2.a(fiiVar2.c())).a(0).p, "application/x-itut-t35")) {
                    z2 = true;
                    break;
                }
            }
            i8++;
        }
        int i9 = 0;
        while (i9 < fiiVarArr2.length) {
            defpackage.fgv fgvVar2 = fgvVarArr[i9];
            if (fgvVar2 == null || !(fiiVarArr2[i9] == null || !zArr[i9] || (z2 && (fgvVar2 instanceof defpackage.fgf)))) {
                z8 = z9;
            } else {
                if (fgvVar2 instanceof defpackage.fgf) {
                    defpackage.fgf fgfVar = (defpackage.fgf) fgvVar2;
                    this.E.remove(fgfVar);
                    int i10 = ((defpackage.fgk) fgfVar.a).a;
                    boolean[] zArr5 = (boolean[]) obj4;
                    ahvr.bY(zArr5[i10]);
                    z8 = z9;
                    this.L--;
                    zArr5[i10] = z8;
                    int i11 = ((defpackage.fgk) fgfVar.b).a;
                    ahvr.bY(zArr5[i11]);
                    this.L--;
                    zArr5[i11] = z8;
                } else {
                    z8 = z9;
                    int i12 = ((defpackage.fgk) fgvVar2).a;
                    boolean[] zArr6 = (boolean[]) obj4;
                    ahvr.bY(zArr6[i12]);
                    this.L--;
                    zArr6[i12] = z8;
                }
                fgvVarArr[i9] = null;
            }
            i9++;
            z9 = z8;
        }
        boolean z10 = z9;
        defpackage.fgj fgjVar = this.g;
        boolean z11 = (!fgjVar.g ? !(j == 0 || this.J) : i7 == 0) ? z10 : true;
        boolean z12 = z10;
        boolean z13 = z12;
        boolean z14 = z2;
        ?? r10 = z12;
        while (r10 < fiiVarArr2.length) {
            if (fgvVarArr[r10 == true ? 1 : 0] != null || (fiiVar = fiiVarArr2[r10 == true ? 1 : 0]) == null) {
                obj = obj4;
                obj2 = obj3;
                z6 = z11;
                z7 = z14;
                r23 = r10 == true ? 1 : 0;
            } else {
                ahvr.bY(fiiVar.h() == z ? z : z10);
                ahvr.bY(fiiVar.e(z10 ? 1 : 0) == 0 ? z : false);
                boolean z15 = z;
                defpackage.fhg fhgVar3 = (defpackage.fhg) obj3;
                int iA = fhgVar3.a(fiiVar.c());
                boolean[] zArr7 = (boolean[]) obj4;
                ahvr.bY(!zArr7[iA]);
                this.L++;
                zArr7[iA] = z15;
                boolean zF = F(iA, j);
                obj = obj4;
                obj2 = obj3;
                z13 = (z13 ? 1 : 0) | (F(iA, 0L) ? 1 : 0);
                defpackage.fgv fgkVar = new defpackage.fgk(this, iA, zF);
                if (android.os.Build.VERSION.SDK_INT < 37 || z14 || !defpackage.eqz.i(fiiVar.b().p)) {
                    z6 = z11;
                    z7 = z14;
                    r23 = r10;
                    break;
                }
                int i13 = 0;
                z14 = z14;
                r10 = r10;
                while (true) {
                    if (i13 >= fhgVar3.b) {
                        z6 = z11;
                        z7 = z14;
                        r23 = r10;
                        break;
                    }
                    z6 = z11;
                    defpackage.eqg eqgVarA = fhgVar3.b(i13).a(0);
                    defpackage.eqg eqgVarB = fiiVar.b();
                    byte[] bArr = defpackage.ete.a;
                    boolean z16 = z14;
                    if (!j$.util.Objects.equals(eqgVarA.p, "application/x-itut-t35")) {
                        r24 = r10;
                        break;
                        break;
                    }
                    java.util.Iterator it = eqgVarA.s.iterator();
                    r10 = r10;
                    while (true) {
                        if (!it.hasNext()) {
                            r24 = r10;
                            break;
                        }
                        java.util.Iterator it2 = it;
                        byte[] bArr2 = (byte[]) it.next();
                        r24 = r10 == true ? 1 : 0;
                        if (defpackage.ete.j(bArr2, bArr2.length)) {
                            defpackage.eqy eqyVar = eqgVarA.l;
                            if (eqyVar != null && (str = eqgVarB.a) != null && (numX = aiql.X(str)) != null) {
                                aify aifyVarF = eqyVar.f(defpackage.eux.class);
                                int i14 = 0;
                                while (i14 < ((aike) aifyVarF).d) {
                                    defpackage.eux euxVar = (defpackage.eux) aifyVarF.get(i14);
                                    aify aifyVar = aifyVarF;
                                    int i15 = euxVar.a;
                                    int i16 = i14;
                                    if ((i15 == 1919837298 || i15 == 1667527523) && euxVar.b.contains(numX)) {
                                        ahvr.bY(!zArr7[i13]);
                                        this.L++;
                                        zArr7[i13] = z15;
                                        defpackage.fgf fgfVar2 = new defpackage.fgf(fgkVar, new defpackage.fgk(this, i13, false), fiiVar.b());
                                        this.E.add(fgfVar2);
                                        fgkVar = fgfVar2;
                                        z7 = z16;
                                        r23 = r24;
                                        break;
                                    }
                                    i14 = i16 + 1;
                                    aifyVarF = aifyVar;
                                }
                                break;
                            }
                            break;
                        }
                        r10 = r24 == true ? 1 : 0;
                        it = it2;
                    }
                    i13++;
                    z11 = z6;
                    z14 = z16;
                    r10 = r24;
                }
                fgvVarArr[r23 == true ? 1 : 0] = fgkVar;
                zArr2[r23 == true ? 1 : 0] = z15;
                if (this.B && !this.F[iA].e()) {
                    z11 = z6 | fgjVar.g;
                } else if (!z6) {
                    defpackage.fgu fguVar = this.j[iA];
                    z11 = (fguVar.e() == 0 || fguVar.x(j, z15)) ? false : true;
                }
                fiiVarArr2 = fiiVarArr;
                obj3 = obj2;
                obj4 = obj;
                z14 = z7;
                z = true;
                z10 = false;
                r10 = r23 + 1;
                z13 = z13;
            }
            z11 = z6;
            fiiVarArr2 = fiiVarArr;
            obj3 = obj2;
            obj4 = obj;
            z14 = z7;
            z = true;
            z10 = false;
            r10 = r23 + 1;
            z13 = z13;
        }
        java.lang.Object obj5 = obj4;
        java.lang.Object obj6 = obj3;
        boolean z17 = z11;
        if (this.L == 0) {
            fgjVar.e = false;
            fgjVar.f = false;
            int i17 = fgjVar.a;
            if (i17 == 2 || i17 == 3 || i17 == 7) {
                fgjVar.a = 3;
            } else {
                z3 = true;
                fgjVar.a = 1;
            }
            fgjVar.g = z3;
            i = 0;
            while (true) {
                fhgVar = (defpackage.fhg) obj6;
                if (i < fhgVar.b) {
                    z4 = false;
                    break;
                }
                if (!((boolean[]) obj5)[i] && ((boolean[]) this.M.d)[i]) {
                    z4 = true;
                    break;
                }
                i++;
            }
            this.M.a = z4;
            if (this.B) {
                zArr3 = (boolean[]) obj5;
                length = zArr3.length;
                zArr4 = new boolean[length];
                for (i5 = 0; i5 < length; i5++) {
                    int i18 = fhgVar.b(i5).c;
                    zArr4[i5] = (i18 == 2 && i18 != 4) || zArr3[i5];
                }
                i6 = 0;
                while (true) {
                    fghVarArr = this.F;
                    if (i6 < fghVarArr.length) {
                        break;
                    }
                    fghVar = fghVarArr[i6];
                    z5 = zArr4[i6];
                    fghVar.b.set(!z5);
                    if (!z5) {
                        fghVar.a.o();
                    }
                    i6++;
                }
            }
            if (this.L == 0) {
                if (z17) {
                    return j;
                }
                long jH = h(j);
                for (i2 = 0; i2 < fgvVarArr.length; i2++) {
                    fgvVar = fgvVarArr[i2];
                    if (fgvVar != null) {
                        zArr2[i2] = true;
                        if (fgvVar instanceof defpackage.fgf) {
                            ((defpackage.fgf) fgvVar).d();
                        }
                    }
                }
                return jH;
            }
            if (fgjVar.b()) {
                for (defpackage.fgu fguVar2 : this.j) {
                    fguVar2.o();
                }
                this.c.a();
                return j;
            }
            this.c.b();
            for (defpackage.fgu fguVar3 : this.j) {
                fguVar3.r(false);
            }
            return j;
        }
        if (fgjVar.f || !fgjVar.g) {
            fgjVar.f = z13;
        }
        z3 = true;
        fgjVar.g = z3;
        i = 0;
        while (true) {
            fhgVar = (defpackage.fhg) obj6;
            if (i < fhgVar.b) {
                z4 = false;
                break;
            }
            if (!((boolean[]) obj5)[i]) {
            }
            i++;
        }
        this.M.a = z4;
        if (this.B) {
            zArr3 = (boolean[]) obj5;
            length = zArr3.length;
            zArr4 = new boolean[length];
            while (i5 < length) {
                int i19 = fhgVar.b(i5).c;
                zArr4[i5] = (i19 == 2 && i19 != 4) || zArr3[i5];
            }
            i6 = 0;
            while (true) {
                fghVarArr = this.F;
                if (i6 < fghVarArr.length) {
                    break;
                    break;
                }
                fghVar = fghVarArr[i6];
                z5 = zArr4[i6];
                fghVar.b.set(!z5);
                if (!z5) {
                    fghVar.a.o();
                }
                i6++;
            }
        }
        if (this.L == 0) {
            if (z17) {
                return j;
            }
            long jH2 = h(j);
            while (i2 < fgvVarArr.length) {
                fgvVar = fgvVarArr[i2];
                if (fgvVar != null) {
                    zArr2[i2] = true;
                    if (fgvVar instanceof defpackage.fgf) {
                        ((defpackage.fgf) fgvVar).d();
                    }
                }
            }
            return jH2;
        }
        if (fgjVar.b()) {
            while (i4 < r2) {
                fguVar2.o();
            }
            this.c.a();
            return j;
        }
        this.c.b();
        while (i3 < r1) {
            fguVar3.r(false);
        }
        return j;
    }

    @Override // defpackage.ffs
    public final defpackage.fhg j() {
        D();
        return (defpackage.fhg) this.M.b;
    }

    public final int k() {
        int i = 0;
        for (defpackage.fgu fguVar : this.j) {
            i += fguVar.i();
        }
        return i;
    }

    @Override // defpackage.ffs
    public final void l() throws java.io.IOException {
        x();
        if (this.g.e() && !this.k) {
            throw new defpackage.era("Loading finished before preparation is complete.", null, true, 1);
        }
    }

    @Override // defpackage.ffs
    public final void m(defpackage.ffr ffrVar, long j) {
        this.h = ffrVar;
        defpackage.eqg eqgVar = this.C;
        if (eqgVar == null) {
            E();
            return;
        }
        this.g.c = j;
        r(0, 3).p(eqgVar);
        z(new defpackage.flu(new long[]{0}, new long[]{0}, -9223372036854775807L));
        s();
    }

    @Override // defpackage.ffs
    public final void n() {
        this.g.h = true;
    }

    @Override // defpackage.ffs
    public final void o(long j) {
        if (this.J) {
            return;
        }
        D();
        if (this.g.f()) {
            return;
        }
        java.lang.Object obj = this.M.e;
        int length = this.j.length;
        for (int i = 0; i < length; i++) {
            defpackage.fgu fguVar = this.j[i];
            fguVar.a.d(fguVar.y(j, ((boolean[]) obj)[i]));
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0017  */
    public final long p(boolean z) {
        long jMax = Long.MIN_VALUE;
        for (int i = 0; i < this.j.length; i++) {
            if (z) {
                jMax = java.lang.Math.max(jMax, this.j[i].k());
            } else {
                defpackage.agpn agpnVar = this.M;
                ahvr.ci(agpnVar);
                if (((boolean[]) agpnVar.e)[i]) {
                    jMax = java.lang.Math.max(jMax, this.j[i].k());
                }
            }
        }
        return jMax;
    }

    public final defpackage.fmk q(defpackage.fgl fglVar) {
        int length = this.j.length;
        for (int i = 0; i < length; i++) {
            if (fglVar.equals(this.G[i])) {
                return this.j[i];
            }
        }
        if (this.H) {
            defpackage.etr.f("ProgressiveMediaPeriod", "Extractor added new track (id=" + fglVar.a + ") after finishing tracks.");
            return new defpackage.flg();
        }
        defpackage.fgu fguVar = new defpackage.fgu(this.A, this.z, this.N);
        defpackage.fgh fghVar = new defpackage.fgh(fguVar);
        fguVar.d = this;
        int i2 = length + 1;
        defpackage.fgl[] fglVarArr = (defpackage.fgl[]) java.util.Arrays.copyOf(this.G, i2);
        fglVarArr[length] = fglVar;
        java.lang.String str = eum.a;
        this.G = fglVarArr;
        defpackage.fgu[] fguVarArr = (defpackage.fgu[]) java.util.Arrays.copyOf(this.j, i2);
        fguVarArr[length] = fguVar;
        this.j = fguVarArr;
        defpackage.fgh[] fghVarArr = (defpackage.fgh[]) java.util.Arrays.copyOf(this.F, i2);
        fghVarArr[length] = fghVar;
        this.F = fghVarArr;
        return fghVar;
    }

    @Override // defpackage.fll
    public final defpackage.fmk r(int i, int i2) {
        return q(new defpackage.fgl(i, false));
    }

    @Override // defpackage.fll
    public final void s() {
        this.H = true;
        this.f.post(this.d);
    }

    public final void t() {
        long j;
        defpackage.fgj fgjVar = this.g;
        if (fgjVar.a == 7) {
            this.c.a();
            return;
        }
        if (fgjVar.c()) {
            for (defpackage.fgu fguVar : this.j) {
                long jL = fguVar.l();
                long j2 = jL != Long.MIN_VALUE ? 1 + jL : Long.MIN_VALUE;
                if (fguVar.j != 0) {
                    ahvr.bM(j2 > fguVar.l());
                    int i = fguVar.j;
                    int iG = fguVar.g(i - 1);
                    while (true) {
                        if (i <= fguVar.l || fguVar.i[iG] < j2) {
                            break;
                        }
                        i--;
                        iG--;
                        if (iG == -1) {
                            iG = fguVar.f - 1;
                        }
                    }
                    int i2 = fguVar.k + i;
                    defpackage.fgr fgrVar = fguVar.a;
                    int i3 = fguVar.i() - i2;
                    ahvr.bM(i3 >= 0 && i3 <= fguVar.j - fguVar.l);
                    int i4 = fguVar.j - i3;
                    fguVar.j = i4;
                    fguVar.o = java.lang.Math.max(fguVar.n, fguVar.m(i4));
                    fguVar.r = i3 == 0 && fguVar.r;
                    int i5 = fguVar.p;
                    if (i5 != -1 && i2 < i5) {
                        fguVar.p = -1;
                    }
                    int i6 = fguVar.q;
                    if (i6 != -1 && i2 < i6) {
                        fguVar.q = -1;
                    }
                    defpackage.fhc fhcVar = fguVar.c;
                    android.util.SparseArray sparseArray = fhcVar.b;
                    for (int size = sparseArray.size() - 1; size >= 0 && i2 < sparseArray.keyAt(size); size--) {
                        aa$.ExternalSyntheticApiModelOutline1.m(fhcVar.c, sparseArray.valueAt(size));
                        sparseArray.removeAt(size);
                    }
                    fhcVar.a = sparseArray.size() > 0 ? java.lang.Math.min(fhcVar.a, sparseArray.size() - 1) : -1;
                    int i7 = fguVar.j;
                    if (i7 != 0) {
                        int iG2 = fguVar.g(i7 - 1);
                        j = fguVar.g[iG2] + ((long) fguVar.h[iG2]);
                    } else {
                        j = 0;
                    }
                    fgrVar.e(j);
                }
            }
        }
    }

    public final void u() {
        int i;
        if (this.r || this.k || !this.H || this.l == null) {
            return;
        }
        for (defpackage.fgu fguVar : this.j) {
            if (fguVar.n() == null) {
                return;
            }
        }
        this.u.e();
        this.q = true;
        int length = this.j.length;
        int i2 = 0;
        int i3 = -1;
        for (int i4 = 0; i4 < length; i4++) {
            defpackage.eqg eqgVarN = this.j[i4].n();
            ahvr.ci(eqgVarN);
            int iB = defpackage.eqz.b(eqgVarN.p);
            if (C(iB) > C(i3)) {
                i2 = i4;
                i3 = iB;
            }
        }
        defpackage.ern[] ernVarArr = new defpackage.ern[length];
        boolean[] zArr = new boolean[length];
        for (int i5 = 0; i5 < length; i5++) {
            defpackage.eqg eqgVarN2 = this.j[i5].n();
            ahvr.ci(eqgVarN2);
            java.lang.String str = eqgVarN2.p;
            boolean zF = defpackage.eqz.f(str);
            boolean z = zF || defpackage.eqz.i(str);
            zArr[i5] = z;
            this.I |= z;
            this.J = this.D != -9223372036854775807L && length == 1 && defpackage.eqz.g(str);
            defpackage.fnz fnzVar = this.i;
            if (fnzVar != null) {
                if (zF || this.G[i5].b) {
                    defpackage.eqy eqyVar = eqgVarN2.l;
                    defpackage.eqy eqyVar2 = eqyVar == null ? new defpackage.eqy(-9223372036854775807L, fnzVar) : eqyVar.d(fnzVar);
                    defpackage.eqf eqfVar = new defpackage.eqf(eqgVarN2);
                    eqfVar.k = eqyVar2;
                    eqgVarN2 = new defpackage.eqg(eqfVar);
                }
                if (zF && eqgVarN2.h == -1 && eqgVarN2.i == -1 && (i = fnzVar.a) != -1) {
                    defpackage.eqf eqfVar2 = new defpackage.eqf(eqgVarN2);
                    eqfVar2.h = i;
                    eqgVarN2 = new defpackage.eqg(eqfVar2);
                }
            }
            defpackage.eqg eqgVarB = eqgVarN2.b(this.z.a(eqgVarN2));
            if (i5 != i2) {
                defpackage.eqf eqfVar3 = new defpackage.eqf(eqgVarB);
                eqfVar3.l = java.lang.Integer.toString(i2);
                eqgVarB = new defpackage.eqg(eqfVar3);
            }
            ernVarArr[i5] = new defpackage.ern(java.lang.Integer.toString(i5), eqgVarB);
            this.j[i5].s(Long.MIN_VALUE);
        }
        this.M = new defpackage.agpn(new defpackage.fhg(ernVarArr), zArr);
        if (this.J && this.m == -9223372036854775807L) {
            this.m = this.D;
            this.l = new defpackage.fgg(this, this.l);
        }
        this.s.t(this.m, this.l, this.n);
        this.k = true;
        defpackage.ffr ffrVar = this.h;
        ahvr.ci(ffrVar);
        ffrVar.d(this);
    }

    public final void v(int i) {
        D();
        defpackage.agpn agpnVar = this.M;
        boolean[] zArr = (boolean[]) agpnVar.c;
        if (zArr[i]) {
            return;
        }
        defpackage.eqg eqgVarA = ((defpackage.fhg) agpnVar.b).b(i).a(0);
        this.v.f(new defpackage.ffq(1, defpackage.eqz.b(eqgVarA.p), eqgVarA, eum.C(this.g.b), -9223372036854775807L));
        zArr[i] = true;
    }

    public final void w(int i) {
        D();
        defpackage.fgj fgjVar = this.g;
        if (fgjVar.d()) {
            if ((!this.I || ((boolean[]) this.M.d)[i]) && !this.j[i].w(false)) {
                fgjVar.c = 0L;
                fgjVar.e = true;
                fgjVar.b = 0L;
                fgjVar.d = 0;
                fgjVar.a = 1;
                for (defpackage.fgu fguVar : this.j) {
                    fguVar.r(false);
                }
                defpackage.ffr ffrVar = this.h;
                ahvr.ci(ffrVar);
                ffrVar.c(this);
            }
        }
    }

    final void x() throws java.io.IOException {
        java.io.IOException iOException;
        int iAo = defpackage.hgt.ao(this.o);
        defpackage.fix fixVar = this.c;
        java.io.IOException iOException2 = fixVar.b;
        if (iOException2 != null) {
            throw iOException2;
        }
        defpackage.fit fitVar = fixVar.a;
        if (fitVar != null && (iOException = fitVar.a) != null && fitVar.b > iAo) {
            throw iOException;
        }
    }

    @Override // defpackage.fll
    public final void y(defpackage.fma fmaVar) {
        this.f.post(new defpackage.esz(this, fmaVar, 17));
    }

    public final void z(defpackage.fma fmaVar) {
        this.l = this.i == null ? fmaVar : new defpackage.flz(-9223372036854775807L, 0L);
        this.m = fmaVar.a();
        boolean z = false;
        if (!this.p && fmaVar.a() == -9223372036854775807L) {
            z = true;
        }
        this.n = z;
        this.o = true == z ? 7 : 1;
        if (this.k) {
            this.s.t(this.m, fmaVar, z);
        } else {
            u();
        }
    }
}
