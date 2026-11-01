package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class eyj implements android.os.Handler.Callback, defpackage.ffr, defpackage.fil, defpackage.eyy, defpackage.exi, defpackage.ezb, defpackage.esb, defpackage.fjx {
    private static final long q = eum.C(10000);
    private final boolean A;
    private final defpackage.esc B;
    private defpackage.ezk D;
    private boolean F;
    private defpackage.eyi G;
    private int H;
    private defpackage.eza I;
    private defpackage.eyh J;
    private boolean L;
    private boolean M;
    private boolean O;
    private boolean R;
    private int S;
    private defpackage.eyi T;
    private long U;
    private long V;
    private int W;
    private boolean X;
    private defpackage.exl Y;
    public final defpackage.ezi[] a;
    private boolean ab;
    private final defpackage.exe ad;
    private final xtk ae;
    private final rai af;
    public final defpackage.ezg[] b;
    public final defpackage.fim c;
    public final defpackage.fin d;
    public final defpackage.eym e;
    public final defpackage.etk f;
    public final android.os.Looper g;
    public final defpackage.etc h;
    public final defpackage.eyz i;
    public final defpackage.fag k;
    public boolean m;
    public boolean n;
    public defpackage.exp o;
    public final defpackage.ezv p;
    private final boolean[] r;
    private final defpackage.erl s;
    private final defpackage.erk t;
    private final long u;
    private final defpackage.exj v;
    private final java.util.ArrayList w;
    private final defpackage.eys x;
    private final defpackage.etk z;
    private long aa = -9223372036854775807L;
    private int P = 0;
    private boolean Q = false;
    public final long j = 500;
    private boolean K = false;
    private final boolean y = defpackage.eqe.b(3);
    public final boolean l = defpackage.eqe.b(1);
    private float ac = 1.0f;
    private defpackage.ezj E = defpackage.ezj.a;
    private boolean C = true;
    private long Z = -9223372036854775807L;
    private long N = -9223372036854775807L;

    public eyj(android.content.Context context, defpackage.ezf[] ezfVarArr, defpackage.ezf[] ezfVarArr2, defpackage.fim fimVar, defpackage.fin finVar, defpackage.eym eymVar, defpackage.fip fipVar, defpackage.ezv ezvVar, defpackage.ezk ezkVar, defpackage.exe exeVar, android.os.Looper looper, defpackage.etc etcVar, rai raiVar, defpackage.fag fagVar, defpackage.exp expVar, final defpackage.fjx fjxVar) {
        int length;
        java.lang.Object obj;
        this.af = raiVar;
        this.c = fimVar;
        this.d = finVar;
        this.e = eymVar;
        boolean z = false;
        this.D = ezkVar;
        this.ad = exeVar;
        this.h = etcVar;
        this.k = fagVar;
        this.o = expVar;
        this.p = ezvVar;
        this.u = ((defpackage.exh) eymVar).g;
        defpackage.erm ermVar = defpackage.erm.a;
        this.I = defpackage.eza.j(finVar);
        this.J = new defpackage.eyh(this.I);
        int length2 = ezfVarArr.length;
        this.b = new defpackage.ezg[length2];
        this.r = new boolean[length2];
        this.a = new defpackage.ezi[length2];
        int i = 0;
        boolean z2 = false;
        while (true) {
            length = ezfVarArr.length;
            if (i >= length) {
                break;
            }
            ezfVarArr[i].q(i, fagVar, etcVar);
            this.b[i] = ezfVarArr[i].j();
            this.b[i].O((defpackage.fih) fimVar);
            defpackage.ezf ezfVar = ezfVarArr2[i];
            if (ezfVar != null) {
                ezfVar.q(i, fagVar, etcVar);
                z2 = true;
            }
            this.a[i] = new defpackage.ezi(ezfVarArr[i], ezfVarArr2[i], i);
            i++;
        }
        this.A = z2;
        this.v = new defpackage.exj(this);
        this.w = new java.util.ArrayList();
        this.s = new defpackage.erl();
        this.t = new defpackage.erk();
        ahvr.bY(fimVar.j == null);
        fimVar.j = this;
        fimVar.k = fipVar;
        defpackage.fih fihVar = (defpackage.fih) fimVar;
        fihVar.d = fihVar.c;
        this.X = true;
        defpackage.etk etkVarB = etcVar.b(looper, null);
        this.z = etkVarB;
        this.x = new defpackage.eys(ezvVar, etkVarB, new rai(this), expVar, length);
        this.i = new defpackage.eyz(this, ezvVar, etkVarB, fagVar, fipVar);
        xtk xtkVar = new xtk((byte[]) null);
        this.ae = xtkVar;
        synchronized (xtkVar.b) {
            if (xtkVar.c == null) {
                if (xtkVar.a == 0 && xtkVar.d == null) {
                    z = true;
                }
                ahvr.bY(z);
                xtkVar.d = new android.os.HandlerThread("ExoPlayer:Playback", -16);
                ((android.os.HandlerThread) xtkVar.d).start();
                xtkVar.c = ((android.os.HandlerThread) xtkVar.d).getLooper();
            }
            xtkVar.a++;
            obj = xtkVar.c;
        }
        android.os.Looper looper2 = (android.os.Looper) obj;
        this.g = looper2;
        defpackage.etk etkVarB2 = etcVar.b(looper2, this);
        this.f = etkVarB2;
        this.B = new defpackage.esc(context, looper2, this);
        etkVarB2.i(35, new defpackage.fjx() { // from class: eye
            @Override // defpackage.fjx
            public final void a(long j, long j2, defpackage.eqg eqgVar, android.media.MediaFormat mediaFormat) {
                fjxVar.a(j, j2, eqgVar, mediaFormat);
                this.a.a(j, j2, eqgVar, mediaFormat);
            }
        }).b();
        etkVarB2.i(39, new rai(this)).b();
    }

    private final void A(boolean z) {
        defpackage.eyq eyqVar = this.x.g;
        defpackage.ffu ffuVar = eyqVar == null ? this.I.c : eyqVar.g.a;
        boolean zEquals = this.I.l.equals(ffuVar);
        if (!zEquals) {
            this.I = this.I.d(ffuVar);
        }
        defpackage.eza ezaVar = this.I;
        ezaVar.s = eyqVar == null ? ezaVar.u : eyqVar.b();
        this.I.t = k();
        if ((!zEquals || z) && eyqVar != null && eyqVar.e) {
            ar(eyqVar.g.a, eyqVar.j);
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01f8  */
    /* JADX WARN: Code duplicated, block: B:106:0x020d  */
    /* JADX WARN: Code duplicated, block: B:109:0x0218  */
    /* JADX WARN: Code duplicated, block: B:112:0x0220  */
    /* JADX WARN: Code duplicated, block: B:115:0x0227  */
    /* JADX WARN: Code duplicated, block: B:117:0x022d  */
    /* JADX WARN: Code duplicated, block: B:118:0x0231  */
    /* JADX WARN: Code duplicated, block: B:120:0x0240  */
    /* JADX WARN: Code duplicated, block: B:122:0x0246  */
    /* JADX WARN: Code duplicated, block: B:123:0x0248  */
    /* JADX WARN: Code duplicated, block: B:129:0x026c  */
    /* JADX WARN: Code duplicated, block: B:138:0x0291  */
    /* JADX WARN: Code duplicated, block: B:141:0x0298  */
    /* JADX WARN: Code duplicated, block: B:144:0x02a0  */
    /* JADX WARN: Code duplicated, block: B:147:0x02a8  */
    /* JADX WARN: Code duplicated, block: B:148:0x02aa  */
    /* JADX WARN: Code duplicated, block: B:151:0x02b3  */
    /* JADX WARN: Code duplicated, block: B:155:0x02c8  */
    /* JADX WARN: Code duplicated, block: B:157:0x02cd  */
    /* JADX WARN: Code duplicated, block: B:159:0x02d0 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:165:0x02e4  */
    /* JADX WARN: Code duplicated, block: B:17:0x004a  */
    /* JADX WARN: Code duplicated, block: B:310:0x0510  */
    /* JADX WARN: Code duplicated, block: B:311:0x0513  */
    /* JADX WARN: Code duplicated, block: B:314:0x051d  */
    /* JADX WARN: Code duplicated, block: B:316:0x0525 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:317:0x0527  */
    /* JADX WARN: Code duplicated, block: B:318:0x052b  */
    /* JADX WARN: Code duplicated, block: B:322:0x0555  */
    /* JADX WARN: Code duplicated, block: B:91:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:98:0x01f5  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v19 */
    /* JADX WARN: Type inference failed for: r11v20 */
    /* JADX WARN: Type inference failed for: r11v7, types: [boolean] */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r36v0, types: [eyj] */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v17, types: [int] */
    /* JADX WARN: Type inference failed for: r7v45 */
    private final void B(defpackage.erm ermVar, boolean z) throws java.lang.Throwable {
        boolean zAn;
        long j;
        defpackage.ffu ffuVar;
        defpackage.erk erkVar;
        defpackage.erl erlVar;
        defpackage.erm ermVar2;
        int i;
        long jS;
        boolean z2;
        boolean zEquals;
        int iG;
        boolean z3;
        long jMin;
        defpackage.ffu ffuVarM;
        defpackage.eys eysVar;
        defpackage.erm ermVar3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean zEquals2;
        boolean z7;
        int i2;
        int i3;
        boolean z8;
        int i4;
        java.lang.Object obj;
        boolean z9;
        boolean z10;
        int i5;
        boolean z11;
        int i6;
        int i7;
        int[] iArr;
        java.lang.Object obj2;
        int i8;
        java.lang.Object obj3;
        long jLongValue;
        int iG2;
        defpackage.ezf ezfVar;
        defpackage.ezf ezfVar2;
        long j2;
        ?? r11;
        long j3;
        long j4;
        long j5;
        int length;
        long j6;
        int iA;
        boolean z12;
        defpackage.eyr eyrVarL;
        long j7;
        long jM;
        long j8;
        long j9;
        boolean z13;
        defpackage.eys eysVar2 = this.x;
        defpackage.eza ezaVar = this.I;
        defpackage.eyi eyiVar = this.T;
        defpackage.erk erkVar2 = this.t;
        int i9 = this.P;
        boolean z14 = this.Q;
        boolean z15 = this.C;
        int i10 = 4;
        long j10 = 0;
        if (ermVar.n()) {
            defpackage.ffu ffuVar2 = defpackage.eza.a;
            defpackage.ffu ffuVar3 = ezaVar.c;
            boolean z16 = (ffuVar2.equals(ffuVar3) && ezaVar.u == 0) ? false : true;
            if (z16 && z) {
                defpackage.erm ermVar4 = ezaVar.b;
                if (ermVar4.n() || ermVar4.m(ffuVar3.a, erkVar2).g) {
                    z13 = false;
                } else {
                    z13 = true;
                }
            } else {
                z13 = false;
            }
            ffuVarM = ffuVar2;
            z10 = z13;
            zAn = z16;
            jMin = -9223372036854775807L;
            i5 = 0;
            z11 = true;
            z5 = false;
            ermVar3 = ermVar;
            eysVar = eysVar2;
        } else {
            defpackage.ffu ffuVar4 = ezaVar.c;
            java.lang.Object obj4 = ffuVar4.a;
            zAn = an(ezaVar, erkVar2);
            long jLongValue2 = (ffuVar4.c() || zAn) ? ezaVar.d : ezaVar.u;
            defpackage.erl erlVar2 = this.s;
            j = -1;
            if (eyiVar != null) {
                erkVar = erkVar2;
                ffuVar = ffuVar4;
                ermVar2 = ermVar;
                android.util.Pair pairP = p(ermVar2, eyiVar, true, i9, z14, erlVar2, erkVar);
                if (pairP == null) {
                    iG2 = ermVar2.g(z14);
                    obj3 = obj4;
                    jLongValue = jLongValue2;
                    z2 = true;
                    zEquals = false;
                    i10 = 0;
                } else {
                    if (eyiVar.c == -9223372036854775807L) {
                        iG2 = ermVar2.m(pairP.first, erkVar).c;
                        obj3 = obj4;
                        jLongValue = jLongValue2;
                        i10 = 0;
                    } else {
                        obj3 = pairP.first;
                        jLongValue = ((java.lang.Long) pairP.second).longValue();
                        iG2 = -1;
                        i10 = 1;
                    }
                    zEquals = ezaVar.f == 4;
                    z2 = false;
                }
                int i11 = iG2;
                obj4 = obj3;
                erlVar = erlVar2;
                jLongValue2 = jLongValue;
                i = i11;
            } else {
                ffuVar = ffuVar4;
                erkVar = erkVar2;
                erlVar = erlVar2;
                ermVar2 = ermVar;
                defpackage.erm ermVar5 = ezaVar.b;
                if (ermVar5.n()) {
                    iG = ermVar2.g(z14);
                } else if (ermVar2.a(obj4) == -1) {
                    int iB = b(erlVar, erkVar, i9, z14, obj4, ermVar5, ermVar2);
                    if (iB == -1) {
                        erlVar = erlVar;
                        ermVar2 = ermVar2;
                        erkVar = erkVar;
                        obj4 = obj4;
                        iB = ermVar2.g(z14);
                        z3 = true;
                    } else {
                        erlVar = erlVar;
                        ermVar2 = ermVar2;
                        erkVar = erkVar;
                        obj4 = obj4;
                        z3 = false;
                    }
                    i = iB;
                    z2 = z3;
                    obj4 = obj4;
                    zEquals = false;
                    i10 = 0;
                } else if (jLongValue2 == -9223372036854775807L) {
                    iG = ermVar2.m(obj4, erkVar).c;
                } else if (zAn) {
                    ermVar5.m(obj4, erkVar);
                    if (ermVar5.e(erkVar.c, erlVar, 0L).n == ermVar5.a(obj4)) {
                        long j11 = erkVar.f;
                        android.util.Pair pairK = ermVar2.k(erlVar, erkVar, ermVar2.m(obj4, erkVar).c, jLongValue2);
                        obj4 = pairK.first;
                        jLongValue2 = jLongValue2;
                        jS = ((java.lang.Long) pairK.second).longValue();
                    } else if (ermVar2.m(obj4, erkVar).d != -9223372036854775807L) {
                        jLongValue2 = jLongValue2;
                        jS = eum.s(jLongValue2, 0L, erkVar.d - 1);
                        obj4 = obj4;
                    } else {
                        jLongValue2 = jLongValue2;
                        obj4 = obj4;
                        jS = jLongValue2;
                    }
                    jLongValue2 = jS;
                    i = -1;
                    z2 = false;
                    zEquals = false;
                    i10 = 1;
                } else {
                    i = -1;
                    z2 = false;
                    zEquals = false;
                    i10 = 0;
                }
                i = iG;
                z2 = false;
                zEquals = false;
                i10 = 0;
            }
            if (i != -1) {
                android.util.Pair pairK2 = ermVar2.k(erlVar, erkVar, i, -9223372036854775807L);
                obj4 = pairK2.first;
                jLongValue2 = ((java.lang.Long) pairK2.second).longValue();
                jMin = -9223372036854775807L;
            } else {
                jMin = jLongValue2;
            }
            java.lang.Object obj5 = obj4;
            defpackage.erk erkVar3 = erkVar;
            ffuVarM = eysVar2.m(ezaVar, ermVar, obj5, jLongValue2, z15, zAn);
            eysVar = eysVar2;
            ermVar3 = ermVar;
            int i12 = ffuVarM.e;
            defpackage.ffu ffuVar5 = ffuVar;
            boolean z17 = i12 == -1 || ((i8 = ffuVar5.e) != -1 && i12 >= i8);
            defpackage.erk erkVarM = ermVar3.m(obj5, erkVar3);
            boolean z18 = z17;
            int i13 = ffuVar5.e;
            if (i13 == -1) {
                z4 = z2;
                z5 = zEquals;
            } else {
                defpackage.ept eptVar = erkVarM.h;
                z4 = z2;
                int i14 = eptVar.b;
                if (i13 >= 0) {
                    z5 = zEquals;
                } else {
                    defpackage.epr eprVarA = eptVar.a(i13);
                    z5 = zEquals;
                    long j12 = eprVarA.a;
                    long j13 = erkVarM.d;
                    if (j13 >= 0 || j13 == -9223372036854775807L) {
                    }
                    zEquals2 = obj4.equals(obj5);
                    if (zEquals2 || ffuVar5.c() || ffuVarM.c() || !z6 || !z18) {
                        z7 = false;
                    } else {
                        z7 = true;
                    }
                    if (!zAn && jLongValue2 == jMin && (zEquals = obj4.equals((obj2 = ffuVarM.a)))) {
                        ermVar3.m(obj2, erkVar3);
                        if (ffuVar5.c()) {
                            erkVar3.h(ffuVar5.b);
                        }
                        if (ffuVarM.c()) {
                            erkVar3.h(ffuVarM.b);
                        }
                    }
                    if (true == z7) {
                        ffuVarM = ffuVar5;
                    }
                    if (ffuVarM.c()) {
                        if (ffuVarM.equals(ffuVar5)) {
                            j10 = ezaVar.u;
                        } else {
                            ermVar3.m(ffuVarM.a, erkVar3);
                            if (ffuVarM.c == erkVar3.d(ffuVarM.b)) {
                                erkVar3.g();
                            }
                            j10 = 0;
                        }
                    } else if (zEquals2 || !ffuVar5.c()) {
                        j10 = jLongValue2;
                    } else {
                        defpackage.epr eprVarA2 = ermVar3.m(obj5, erkVar3).h.a(ffuVar5.b);
                        long j14 = eprVarA2.i;
                        long j15 = ezaVar.d;
                        if (j15 != -9223372036854775807L) {
                            long j16 = eprVarA2.a;
                            if (j15 < 0) {
                                i2 = eprVarA2.b;
                                i3 = ffuVar5.c;
                                if (i2 > i3 || eprVarA2.e[i3] != 2) {
                                    j10 = jLongValue2;
                                } else {
                                    long j17 = ermVar3.m(obj5, erkVar3).d;
                                    jMin = j17 != -9223372036854775807L ? java.lang.Math.min(j17 - 1, jLongValue2) : jLongValue2;
                                    j10 = jMin;
                                }
                            } else {
                                j10 = jLongValue2;
                            }
                        } else {
                            i2 = eprVarA2.b;
                            i3 = ffuVar5.c;
                            if (i2 > i3) {
                                j10 = jLongValue2;
                            } else {
                                j10 = jLongValue2;
                            }
                        }
                    }
                    if (ffuVarM.equals(ffuVar5) || j10 != ezaVar.u) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    if (ermVar3.a(obj4) == -1) {
                        i4 = 4;
                    } else {
                        i4 = 3;
                    }
                    obj = ffuVarM.a;
                    if (obj.equals(obj4) && (i6 = ffuVarM.b) != -1) {
                        defpackage.epr eprVarA3 = ermVar3.m(obj, erkVar3).h.a(i6);
                        i7 = ffuVarM.c;
                        iArr = eprVarA3.e;
                        if (i7 < iArr.length || iArr[i7] != 2) {
                            i4 = 0;
                        }
                    }
                    if (z8 || !z) {
                        z9 = false;
                    } else {
                        defpackage.erm ermVar6 = ezaVar.b;
                        if (ermVar6.n() || ermVar6.m(obj4, erkVar3).g) {
                            z9 = false;
                        } else {
                            z9 = true;
                        }
                    }
                    z10 = z9;
                    i10 = i4;
                    zAn = z8;
                    i5 = i10;
                    z11 = z4;
                }
                z6 = false;
                zEquals2 = obj4.equals(obj5);
                if (zEquals2) {
                    z7 = false;
                } else {
                    z7 = false;
                }
                if (!zAn) {
                    ermVar3.m(obj2, erkVar3);
                    if (ffuVar5.c()) {
                        erkVar3.h(ffuVar5.b);
                    }
                    if (ffuVarM.c()) {
                        erkVar3.h(ffuVarM.b);
                    }
                }
                if (true == z7) {
                    ffuVarM = ffuVar5;
                }
                if (ffuVarM.c()) {
                    if (ffuVarM.equals(ffuVar5)) {
                        j10 = ezaVar.u;
                    } else {
                        ermVar3.m(ffuVarM.a, erkVar3);
                        if (ffuVarM.c == erkVar3.d(ffuVarM.b)) {
                            erkVar3.g();
                        }
                        j10 = 0;
                    }
                } else if (zEquals2) {
                    j10 = jLongValue2;
                } else {
                    j10 = jLongValue2;
                }
                if (ffuVarM.equals(ffuVar5)) {
                    z8 = true;
                } else {
                    z8 = true;
                }
                if (ermVar3.a(obj4) == -1) {
                    i4 = 4;
                } else {
                    i4 = 3;
                }
                obj = ffuVarM.a;
                if (obj.equals(obj4)) {
                    defpackage.epr eprVarA4 = ermVar3.m(obj, erkVar3).h.a(i6);
                    i7 = ffuVarM.c;
                    iArr = eprVarA4.e;
                    if (i7 < iArr.length) {
                        i4 = 0;
                    } else {
                        i4 = 0;
                    }
                }
                if (z8) {
                    z9 = false;
                } else {
                    z9 = false;
                }
                z10 = z9;
                i10 = i4;
                zAn = z8;
                i5 = i10;
                z11 = z4;
            }
            z6 = true;
            zEquals2 = obj4.equals(obj5);
            if (zEquals2) {
                z7 = false;
            } else {
                z7 = false;
            }
            if (!zAn) {
                ermVar3.m(obj2, erkVar3);
                if (ffuVar5.c()) {
                    erkVar3.h(ffuVar5.b);
                }
                if (ffuVarM.c()) {
                    erkVar3.h(ffuVarM.b);
                }
            }
            if (true == z7) {
                ffuVarM = ffuVar5;
            }
            if (ffuVarM.c()) {
                if (ffuVarM.equals(ffuVar5)) {
                    j10 = ezaVar.u;
                } else {
                    ermVar3.m(ffuVarM.a, erkVar3);
                    if (ffuVarM.c == erkVar3.d(ffuVarM.b)) {
                        erkVar3.g();
                    }
                    j10 = 0;
                }
            } else if (zEquals2) {
                j10 = jLongValue2;
            } else {
                j10 = jLongValue2;
            }
            if (ffuVarM.equals(ffuVar5)) {
                z8 = true;
            } else {
                z8 = true;
            }
            if (ermVar3.a(obj4) == -1) {
                i4 = 4;
            } else {
                i4 = 3;
            }
            obj = ffuVarM.a;
            if (obj.equals(obj4)) {
                defpackage.epr eprVarA5 = ermVar3.m(obj, erkVar3).h.a(i6);
                i7 = ffuVarM.c;
                iArr = eprVarA5.e;
                if (i7 < iArr.length) {
                    i4 = 0;
                } else {
                    i4 = 0;
                }
            }
            if (z8) {
                z9 = false;
            } else {
                z9 = false;
            }
            z10 = z9;
            i10 = i4;
            zAn = z8;
            i5 = i10;
            z11 = z4;
        }
        if (z11) {
            try {
                if (this.I.f != 1) {
                    try {
                        V(4);
                    } catch (java.lang.Throwable th) {
                        th = th;
                        ezfVar2 = null;
                        zEquals = z10;
                        j2 = j10;
                        r11 = ezfVar2;
                    }
                }
                ezfVar = null;
                try {
                    L(false, false, false, true);
                } catch (java.lang.Throwable th2) {
                    th = th2;
                    ezfVar2 = ezfVar;
                    zEquals = z10;
                    j2 = j10;
                    r11 = ezfVar2;
                }
            } catch (java.lang.Throwable th3) {
                th = th3;
                ezfVar = null;
                ezfVar2 = ezfVar;
                zEquals = z10;
                j2 = j10;
                r11 = ezfVar2;
            }
        } else {
            ezfVar = null;
        }
        defpackage.ezi[] eziVarArr = this.a;
        int length2 = eziVarArr.length;
        for (?? r7 = ezfVar; r7 < length2; r7++) {
            defpackage.ezi eziVar = eziVarArr[r7];
            eziVar.a.G(ermVar3);
            ezfVar = eziVar.b;
            if (ezfVar != null) {
                ezfVar.G(ermVar3);
            }
        }
        try {
            if (zAn) {
                zAn = zAn;
                i10 = i10;
                j6 = j10;
                z12 = false;
                zEquals = z10;
                if (ermVar3.n()) {
                    jM = j6;
                } else {
                    try {
                        for (defpackage.eyq eyqVar = eysVar.d; eyqVar != null; eyqVar = eyqVar.h) {
                            if (eyqVar.g.a.equals(ffuVarM)) {
                                eyqVar.g = eysVar.l(ermVar3, eyqVar.g);
                            }
                        }
                        j2 = j6;
                        try {
                            jM = m(ffuVarM, j2, z5);
                        } catch (java.lang.Throwable th4) {
                            th = th4;
                            ermVar3 = ermVar3;
                            r11 = 0;
                            ffuVarM = ffuVarM;
                            defpackage.eza ezaVar2 = this.I;
                            defpackage.erm ermVar7 = ezaVar2.b;
                            defpackage.ffu ffuVar6 = ezaVar2.c;
                            if (1 != i5) {
                                j3 = -9223372036854775807L;
                            } else {
                                j3 = j2;
                            }
                            af(ermVar3, ffuVarM, ermVar7, ffuVar6, j3, false);
                            if (zAn) {
                                if (zEquals) {
                                    j5 = j2;
                                    j4 = j5;
                                } else {
                                    j4 = this.I.e;
                                    j5 = j2;
                                }
                                this.I = q(ffuVarM, j5, jMin, j4, zEquals, i10);
                            } else {
                                if (zEquals) {
                                    j5 = j2;
                                    j4 = j5;
                                } else {
                                    j4 = this.I.e;
                                    j5 = j2;
                                }
                                this.I = q(ffuVarM, j5, jMin, j4, zEquals, i10);
                            }
                            M();
                            O(ermVar3, this.I.b);
                            this.I = this.I.i(ermVar3);
                            if (!ermVar3.n()) {
                                this.T = null;
                            }
                            A(r11);
                            this.f.f(2);
                            throw th;
                        }
                    } catch (java.lang.Throwable th5) {
                        th = th5;
                        j2 = j6;
                    }
                }
            } else {
                try {
                    long[] jArr = new long[eziVarArr.length];
                    int i15 = 0;
                    while (true) {
                        length = eziVarArr.length;
                        if (i15 >= length) {
                            break;
                        }
                        jArr[i15] = j(eysVar.i(i15), i15);
                        i15++;
                        ermVar3 = ermVar3;
                        r11 = ezfVar;
                        ffuVarM = ffuVarM;
                        j2 = j;
                        defpackage.eza ezaVar3 = this.I;
                        defpackage.erm ermVar8 = ezaVar3.b;
                        defpackage.ffu ffuVar7 = ezaVar3.c;
                        if (1 != i5) {
                            j3 = -9223372036854775807L;
                        } else {
                            j3 = j2;
                        }
                        af(ermVar3, ffuVarM, ermVar8, ffuVar7, j3, false);
                        if (zAn || jMin != this.I.d) {
                            if (zEquals) {
                                j5 = j2;
                                j4 = j5;
                            } else {
                                j4 = this.I.e;
                                j5 = j2;
                            }
                            this.I = q(ffuVarM, j5, jMin, j4, zEquals, i10);
                        }
                        M();
                        O(ermVar3, this.I.b);
                        this.I = this.I.i(ermVar3);
                        if (!ermVar3.n()) {
                            this.T = null;
                        }
                        A(r11);
                        this.f.f(2);
                        throw th;
                    }
                    long[] jArr2 = new long[length];
                    for (int i16 = 0; i16 < eziVarArr.length; i16++) {
                        jArr2[i16] = j(eysVar.h(i16), i16);
                    }
                    boolean z19 = z10;
                    zAn = zAn;
                    try {
                        long j18 = this.U;
                        defpackage.eyq eyqVar2 = eysVar.d;
                        defpackage.eyq eyqVar3 = null;
                        while (true) {
                            if (eyqVar2 != null) {
                                try {
                                    defpackage.eyr eyrVar = eyqVar2.g;
                                    if (eyqVar3 == null) {
                                        try {
                                            eyrVarL = eysVar.l(ermVar3, eyrVar);
                                            j7 = j18;
                                            i10 = i10;
                                            j6 = j10;
                                            zEquals = z19;
                                        } catch (java.lang.Throwable th6) {
                                            th = th6;
                                            ffuVarM = ffuVarM;
                                            i10 = i10;
                                            j2 = j10;
                                            r11 = 0;
                                            zEquals = z19;
                                            ermVar3 = ermVar3;
                                        }
                                    } else {
                                        i10 = i10;
                                        try {
                                            defpackage.eyr eyrVarJ = eysVar.j(ermVar3, eyqVar3, j18);
                                            if (eyrVarJ != null) {
                                                j7 = j18;
                                                if (eyrVar.a.equals(eyrVarJ.a)) {
                                                    long j19 = eyrVar.b;
                                                    j6 = j10;
                                                    zEquals = z19;
                                                    long j20 = eyrVarJ.b;
                                                    if (j19 == j20) {
                                                        eyrVarL = eyrVarJ;
                                                    } else {
                                                        long j21 = eyrVar.c;
                                                        if (j21 != -9223372036854775807L) {
                                                            long j22 = eyrVarJ.c;
                                                            if (j22 != -9223372036854775807L) {
                                                                if (java.lang.Math.abs((j20 - j22) - (j19 - j21)) < 5000000) {
                                                                    eyrVarL = eyrVarJ.b(j19, eyrVar.c);
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                                iA = eysVar.a(eyqVar3);
                                            }
                                            j6 = j10;
                                            zEquals = z19;
                                            iA = eysVar.a(eyqVar3);
                                        } catch (java.lang.Throwable th7) {
                                            th = th7;
                                            j6 = j10;
                                            zEquals = z19;
                                            ermVar3 = ermVar3;
                                            ffuVarM = ffuVarM;
                                            j2 = j6;
                                            r11 = 0;
                                            defpackage.eza ezaVar4 = this.I;
                                            defpackage.erm ermVar9 = ezaVar4.b;
                                            defpackage.ffu ffuVar8 = ezaVar4.c;
                                            if (1 != i5) {
                                                j3 = -9223372036854775807L;
                                            } else {
                                                j3 = j2;
                                            }
                                            af(ermVar3, ffuVarM, ermVar9, ffuVar8, j3, false);
                                            if (zAn) {
                                                if (zEquals) {
                                                    j5 = j2;
                                                    j4 = j5;
                                                } else {
                                                    j4 = this.I.e;
                                                    j5 = j2;
                                                }
                                                this.I = q(ffuVarM, j5, jMin, j4, zEquals, i10);
                                            } else {
                                                if (zEquals) {
                                                    j5 = j2;
                                                    j4 = j5;
                                                } else {
                                                    j4 = this.I.e;
                                                    j5 = j2;
                                                }
                                                this.I = q(ffuVarM, j5, jMin, j4, zEquals, i10);
                                            }
                                            M();
                                            O(ermVar3, this.I.b);
                                            this.I = this.I.i(ermVar3);
                                            if (!ermVar3.n()) {
                                                this.T = null;
                                            }
                                            A(r11);
                                            this.f.f(2);
                                            throw th;
                                        }
                                    }
                                    try {
                                        eyqVar2.g = eyrVarL.a(eyrVar.d);
                                        long j23 = eyrVar.e;
                                        long j24 = eyrVarL.e;
                                        if (j23 != j24) {
                                            long j25 = j24 == -9223372036854775807L ? Long.MAX_VALUE : j24 + eyqVar2.k;
                                            boolean z20 = eyqVar2.g.f;
                                            boolean zV = defpackage.eys.v(eysVar.e, jArr, eyqVar2, j25);
                                            boolean zV2 = defpackage.eys.v(eysVar.f, jArr2, eyqVar2, j25);
                                            iA = eysVar.a(eyqVar2);
                                            if (iA == 0) {
                                                int i17 = (!zV || (j23 == -9223372036854775807L && eyrVar.a.e == -1)) ? 0 : 1;
                                                iA = zV2 ? i17 | 2 : i17;
                                            }
                                        } else {
                                            eyqVar3 = eyqVar2;
                                            eyqVar2 = eyqVar2.h;
                                            z19 = zEquals;
                                            i10 = i10;
                                            j18 = j7;
                                            j10 = j6;
                                        }
                                    } catch (java.lang.Throwable th8) {
                                        th = th8;
                                        ermVar3 = ermVar3;
                                        ffuVarM = ffuVarM;
                                        j2 = j6;
                                        r11 = 0;
                                        defpackage.eza ezaVar5 = this.I;
                                        defpackage.erm ermVar10 = ezaVar5.b;
                                        defpackage.ffu ffuVar9 = ezaVar5.c;
                                        if (1 != i5) {
                                            j3 = -9223372036854775807L;
                                        } else {
                                            j3 = j2;
                                        }
                                        af(ermVar3, ffuVarM, ermVar10, ffuVar9, j3, false);
                                        if (zAn) {
                                            if (zEquals) {
                                                j5 = j2;
                                                j4 = j5;
                                            } else {
                                                j4 = this.I.e;
                                                j5 = j2;
                                            }
                                            this.I = q(ffuVarM, j5, jMin, j4, zEquals, i10);
                                        } else {
                                            if (zEquals) {
                                                j5 = j2;
                                                j4 = j5;
                                            } else {
                                                j4 = this.I.e;
                                                j5 = j2;
                                            }
                                            this.I = q(ffuVarM, j5, jMin, j4, zEquals, i10);
                                        }
                                        M();
                                        O(ermVar3, this.I.b);
                                        this.I = this.I.i(ermVar3);
                                        if (!ermVar3.n()) {
                                            this.T = null;
                                        }
                                        A(r11);
                                        this.f.f(2);
                                        throw th;
                                    }
                                } catch (java.lang.Throwable th9) {
                                    th = th9;
                                    i10 = i10;
                                }
                            } else {
                                i10 = i10;
                                j6 = j10;
                                zEquals = z19;
                                iA = 0;
                            }
                            if ((iA & 1) != 0) {
                                z12 = false;
                                Q(false);
                            } else {
                                z12 = false;
                                if ((iA & 2) != 0) {
                                    s();
                                }
                            }
                            jM = j6;
                        }
                    } catch (java.lang.Throwable th10) {
                        th = th10;
                        i10 = i10;
                        j = j10;
                        ezfVar = null;
                        zEquals = z19;
                        ermVar3 = ermVar3;
                        r11 = ezfVar;
                        ffuVarM = ffuVarM;
                        j2 = j;
                    }
                } catch (java.lang.Throwable th11) {
                    th = th11;
                    zAn = zAn;
                    i10 = i10;
                    j = j10;
                    ezfVar = null;
                    zEquals = z10;
                }
            }
            defpackage.eza ezaVar6 = this.I;
            defpackage.ffu ffuVar10 = ffuVarM;
            boolean z21 = z12;
            af(ermVar3, ffuVar10, ezaVar6.b, ezaVar6.c, 1 == i5 ? jM : -9223372036854775807L, false);
            defpackage.erm ermVar11 = ermVar3;
            if (zAn || jMin != this.I.d) {
                if (zEquals) {
                    j9 = jM;
                    j8 = j9;
                } else {
                    j8 = this.I.e;
                    j9 = jM;
                }
                this.I = q(ffuVar10, j9, jMin, j8, zEquals, i10);
            }
            M();
            O(ermVar11, this.I.b);
            this.I = this.I.i(ermVar11);
            if (!ermVar11.n()) {
                this.T = null;
            }
            A(z21);
            this.f.f(2);
        } catch (java.lang.Throwable th12) {
            th = th12;
        }
    }

    private final void C(defpackage.erc ercVar, boolean z) {
        D(ercVar, ercVar.b, true, z);
    }

    private final void D(defpackage.erc ercVar, float f, boolean z, boolean z2) {
        int i;
        if (z) {
            if (z2) {
                this.J.a(1);
            }
            defpackage.eza ezaVar = this.I;
            if (ezaVar.r) {
                this.I = ezaVar.b(android.os.SystemClock.elapsedRealtime());
            }
            defpackage.eza ezaVar2 = this.I;
            defpackage.erm ermVar = ezaVar2.b;
            defpackage.ffu ffuVar = ezaVar2.c;
            long j = ezaVar2.d;
            long j2 = ezaVar2.e;
            int i2 = ezaVar2.f;
            defpackage.exl exlVar = ezaVar2.g;
            boolean z3 = ezaVar2.h;
            defpackage.fhg fhgVar = ezaVar2.i;
            defpackage.fin finVar = ezaVar2.j;
            java.util.List list = ezaVar2.k;
            defpackage.ffu ffuVar2 = ezaVar2.l;
            boolean z4 = ezaVar2.m;
            int i3 = ezaVar2.n;
            int i4 = ezaVar2.o;
            long j3 = ezaVar2.s;
            long j4 = ezaVar2.t;
            long j5 = ezaVar2.u;
            long j6 = ezaVar2.v;
            boolean z5 = ezaVar2.q;
            this.I = new defpackage.eza(ermVar, ffuVar, j, j2, i2, exlVar, z3, fhgVar, finVar, list, ffuVar2, z4, i3, i4, ercVar, j3, j4, j5, j6, false, ezaVar2.r);
        }
        float f2 = ercVar.b;
        defpackage.eyq eyqVar = this.x.d;
        while (true) {
            i = 0;
            if (eyqVar == null) {
                break;
            }
            defpackage.fii[] fiiVarArr = eyqVar.j.c;
            int length = fiiVarArr.length;
            while (i < length) {
                defpackage.fii fiiVar = fiiVarArr[i];
                i++;
            }
            eyqVar = eyqVar.h;
        }
        defpackage.ezi[] eziVarArr = this.a;
        while (i < eziVarArr.length) {
            defpackage.ezi eziVar = eziVarArr[i];
            eziVar.a.F(f, f2);
            defpackage.ezf ezfVar = eziVar.b;
            if (ezfVar != null) {
                ezfVar.F(f, f2);
            }
            i++;
        }
    }

    private final void E() {
        boolean zG;
        defpackage.eys eysVar = this.x;
        if (aq(eysVar.g)) {
            defpackage.eyq eyqVar = eysVar.g;
            long jL = l(eyqVar.c());
            if (eyqVar == eysVar.d) {
                long j = eyqVar.k;
            } else {
                long j2 = eyqVar.k;
                long j3 = eyqVar.g.b;
            }
            long j4 = ap(this.I.b, eyqVar.g.a) ? this.ad.g : -9223372036854775807L;
            defpackage.fag fagVar = this.k;
            defpackage.erm ermVar = this.I.b;
            defpackage.ffu ffuVar = eyqVar.g.a;
            float f = this.v.b().b;
            boolean z = this.I.m;
            defpackage.eyl eylVar = new defpackage.eyl(fagVar, ermVar, ffuVar, jL, f, this.M, j4);
            defpackage.eym eymVar = this.e;
            boolean zG2 = eymVar.g(eylVar);
            defpackage.eyq eyqVar2 = eysVar.d;
            if (zG2 || !eyqVar2.e || jL >= 500000 || this.u <= 0) {
                zG = zG2;
            } else {
                eyqVar2.a.o(this.I.u);
                zG = eymVar.g(eylVar);
            }
        } else {
            zG = false;
        }
        this.O = zG;
        if (zG) {
            defpackage.eyq eyqVar3 = eysVar.g;
            ahvr.ci(eyqVar3);
            defpackage.eyn eynVar = new defpackage.eyn();
            eynVar.a = this.U - eyqVar3.k;
            eynVar.b(this.v.b().b);
            eynVar.a(this.N);
            eyqVar3.e(new defpackage.eyo(eynVar));
        }
        aa();
    }

    private final void F() {
        defpackage.eys eysVar = this.x;
        eysVar.p();
        defpackage.eyq eyqVar = eysVar.h;
        if (eyqVar != null) {
            if (!eyqVar.d || eyqVar.e) {
                defpackage.ffs ffsVar = eyqVar.a;
                if (ffsVar.e()) {
                    return;
                }
                defpackage.eym eymVar = this.e;
                defpackage.erm ermVar = this.I.b;
                defpackage.ffu ffuVar = eyqVar.g.a;
                if (eyqVar.e) {
                    ffsVar.a();
                }
                java.util.Iterator it = ((defpackage.exh) eymVar).h.values().iterator();
                while (it.hasNext()) {
                    if (((defpackage.exg) it.next()).b) {
                        return;
                    }
                }
                if (!eyqVar.d) {
                    eyqVar.f(this, eyqVar.g.b);
                    return;
                }
                defpackage.eyn eynVar = new defpackage.eyn();
                eynVar.a = this.U - eyqVar.k;
                eynVar.b(this.v.b().b);
                eynVar.a(this.N);
                eyqVar.e(new defpackage.eyo(eynVar));
            }
        }
    }

    private final void G(int i) {
        defpackage.eyh eyhVar = this.J;
        defpackage.eza ezaVar = this.I;
        boolean z = eyhVar.a | (eyhVar.b != ezaVar);
        eyhVar.a = z;
        eyhVar.b = ezaVar;
        if (z) {
            if (!this.I.b.n()) {
                defpackage.eza ezaVar2 = this.I;
                boolean z2 = ezaVar2.b.a(ezaVar2.c.a) != -1;
                java.util.Locale locale = java.util.Locale.US;
                defpackage.eza ezaVar3 = this.I;
                ahvr.bZ(z2, java.lang.String.format(locale, "periodUid %s not found in timeline %s with size %d triggered by msg %d", ezaVar3.c.a, ezaVar3.b.getClass().getName(), java.lang.Integer.valueOf(this.I.b.c()), java.lang.Integer.valueOf(i)));
            }
            this.af.w(this.J);
            this.J = new defpackage.eyh(this.I);
        }
    }

    private final void H(int i) {
        defpackage.ezi eziVar = this.a[i];
        try {
            defpackage.eyq eyqVar = this.x.d;
            ahvr.ci(eyqVar);
            defpackage.ezf ezfVarD = eziVar.d(eyqVar);
            ahvr.ci(ezfVarD);
            ezfVarD.r();
        } catch (java.io.IOException | java.lang.RuntimeException e) {
            int iB = eziVar.b();
            if (iB != 3 && iB != 5) {
                throw e;
            }
            defpackage.eys eysVar = this.x;
            defpackage.fin finVar = eysVar.d.j;
            defpackage.fii[] fiiVarArr = finVar.c;
            defpackage.etr.d("ExoPlayerImplInternal", "Disabling track due to error: ".concat(defpackage.eqg.c(fiiVarArr[i].b())), e);
            defpackage.fin finVar2 = new defpackage.fin((defpackage.ezh[]) finVar.b.clone(), (defpackage.fii[]) fiiVarArr.clone(), finVar.d, finVar.e);
            finVar2.b[i] = null;
            finVar2.c[i] = null;
            t(i);
            eysVar.d.n(finVar2, this.I.u);
        }
    }

    private final void I(int i, boolean z) {
        boolean[] zArr = this.r;
        if (zArr[i] != z) {
            zArr[i] = z;
            this.z.d(new defpackage.eyd(this, i, 0));
        }
    }

    private final void J() {
        defpackage.eyj eyjVar;
        defpackage.exj exjVar = this.v;
        float f = exjVar.b().b;
        defpackage.eys eysVar = this.x;
        defpackage.eyq eyqVar = eysVar.d;
        defpackage.eyq eyqVarG = eysVar.g();
        defpackage.fin finVar = null;
        boolean z = true;
        while (eyqVar != null && eyqVar.e) {
            defpackage.eza ezaVar = this.I;
            defpackage.erm ermVar = ezaVar.b;
            boolean z2 = ezaVar.m;
            defpackage.fin finVarO = eyqVar.o();
            defpackage.fin finVar2 = eyqVar == eysVar.d ? finVarO : finVar;
            defpackage.fin finVar3 = eyqVar.j;
            if (finVar3 != null) {
                defpackage.fii[] fiiVarArr = finVarO.c;
                if (finVar3.c.length == fiiVarArr.length) {
                    int i = 0;
                    while (true) {
                        if (i >= fiiVarArr.length) {
                            z &= eyqVar != eyqVarG;
                            eyqVar = eyqVar.h;
                            finVar = finVar2;
                        } else if (finVarO.a(finVar3, i)) {
                            i++;
                        }
                    }
                }
            }
            if (z) {
                defpackage.eyq eyqVar2 = eysVar.d;
                boolean z3 = 1 == (eysVar.a(eyqVar2) & 1);
                defpackage.ezi[] eziVarArr = this.a;
                int length = eziVarArr.length;
                boolean[] zArr = new boolean[length];
                ahvr.ci(finVar2);
                long jA = eyqVar2.a(finVar2, this.I.u, z3, zArr);
                defpackage.eza ezaVar2 = this.I;
                boolean z4 = (ezaVar2.f == 4 || jA == ezaVar2.u) ? false : true;
                defpackage.eza ezaVar3 = this.I;
                boolean z5 = z4;
                eyjVar = this;
                eyjVar.I = q(ezaVar3.c, jA, ezaVar3.d, ezaVar3.e, z5, 5);
                if (z5) {
                    eyjVar.N(jA, true);
                }
                eyjVar.s();
                boolean[] zArr2 = new boolean[length];
                int i2 = 0;
                while (i2 < eziVarArr.length) {
                    int iA = eziVarArr[i2].a();
                    zArr2[i2] = eziVarArr[i2].v();
                    defpackage.ezi eziVar = eziVarArr[i2];
                    defpackage.fgv fgvVar = eyqVar2.c[i2];
                    long j = eyjVar.U;
                    boolean z6 = zArr[i2];
                    defpackage.exj exjVar2 = exjVar;
                    eziVar.f(eziVar.a, fgvVar, exjVar2, j, z6);
                    defpackage.ezf ezfVar = eziVar.b;
                    if (ezfVar != null) {
                        eziVar.f(ezfVar, fgvVar, exjVar2, j, z6);
                    }
                    if (iA - eziVarArr[i2].a() > 0) {
                        eyjVar.I(i2, false);
                    }
                    eyjVar.S -= iA - eziVarArr[i2].a();
                    i2++;
                    exjVar = exjVar2;
                }
                eyjVar.y(zArr2, eyjVar.U);
                eyjVar.S(eyqVar2);
            } else {
                eyjVar = this;
                int i3 = 0;
                eysVar.a(eyqVar);
                if (eyqVar.e) {
                    long jMax = java.lang.Math.max(eyqVar.g.b, eyjVar.U - eyqVar.k);
                    if (eyjVar.A) {
                        while (true) {
                            defpackage.ezi[] eziVarArr2 = eyjVar.a;
                            if (i3 < eziVarArr2.length) {
                                if (j$.util.Objects.equals(eysVar.h(i3), eyqVar) && eziVarArr2[i3].s(eyqVar)) {
                                    eyjVar.s();
                                    break;
                                }
                                i3++;
                            } else {
                                break;
                            }
                        }
                    }
                    eyqVar.n(finVarO, jMax);
                }
            }
            eyjVar.A(true);
            if (eyjVar.I.f != 4) {
                eyjVar.E();
                eyjVar.ae();
                eyjVar.f.f(2);
                return;
            }
            return;
        }
    }

    private final void K() {
        J();
        Q(true);
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00aa A[PHI: r2 r6 r8
      0x00aa: PHI (r2v2 ffu) = (r2v1 ffu), (r2v12 ffu) binds: [B:31:0x0083, B:33:0x00a8] A[DONT_GENERATE, DONT_INLINE]
      0x00aa: PHI (r6v3 long) = (r6v2 long), (r6v12 long) binds: [B:31:0x0083, B:33:0x00a8] A[DONT_GENERATE, DONT_INLINE]
      0x00aa: PHI (r8v2 long) = (r8v1 long), (r8v9 long) binds: [B:31:0x0083, B:33:0x00a8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:48:0x0110 A[PHI: r6
      0x0110: PHI (r6v7 erm) = (r6v6 erm), (r6v6 erm), (r6v11 erm), (r6v11 erm) binds: [B:36:0x00b8, B:38:0x00bc, B:44:0x00e3, B:46:0x00f9] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r0v18, types: [ffw, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v19, types: [ffw, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v8, types: [fct, fga, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v8, types: [ffv, java.lang.Object] */
    private final void L(boolean z, boolean z2, boolean z3, boolean z4) {
        boolean z5;
        defpackage.ffu ffuVar;
        defpackage.erm ermVar;
        defpackage.fhg fhgVar;
        defpackage.fin finVar;
        aify aifyVar;
        this.f.b(2);
        defpackage.eza ezaVar = this.I;
        if (ezaVar.r) {
            this.I = ezaVar.b(android.os.SystemClock.elapsedRealtime());
        }
        this.m = false;
        if (this.G != null) {
            this.J.a(1);
            this.G = null;
        }
        this.Y = null;
        ag(false, true);
        this.v.f();
        this.U = 1000000000000L;
        try {
            u();
        } catch (defpackage.exl | java.lang.RuntimeException e) {
            defpackage.etr.d("ExoPlayerImplInternal", "Disable failed.", e);
        }
        if (z) {
            for (defpackage.ezi eziVar : this.a) {
                try {
                    eziVar.i();
                } catch (java.lang.RuntimeException e2) {
                    defpackage.etr.d("ExoPlayerImplInternal", "Reset failed.", e2);
                }
            }
        }
        this.S = 0;
        defpackage.eza ezaVar2 = this.I;
        defpackage.ffu ffuVar2 = ezaVar2.c;
        long jLongValue = ezaVar2.u;
        long j = (this.I.c.c() || an(this.I, this.t)) ? this.I.d : this.I.u;
        if (z2) {
            this.T = null;
            android.util.Pair pairO = o(this.I.b);
            ffuVar2 = (defpackage.ffu) pairO.first;
            jLongValue = ((java.lang.Long) pairO.second).longValue();
            j = -9223372036854775807L;
            z5 = ffuVar2.equals(this.I.c) ? false : true;
        }
        long j2 = jLongValue;
        long j3 = j;
        defpackage.eys eysVar = this.x;
        eysVar.o();
        this.O = false;
        defpackage.erm ewyVar = this.I.b;
        if (z3 && (ewyVar instanceof defpackage.ewy)) {
            defpackage.ewy ewyVar2 = (defpackage.ewy) ewyVar;
            defpackage.eyz eyzVar = this.i;
            defpackage.erm[] ermVarArr = ewyVar2.c;
            int length = ermVarArr.length;
            izg izgVar = eyzVar.j;
            defpackage.erm[] ermVarArr2 = new defpackage.erm[length];
            for (int i = 0; i < ermVarArr.length; i++) {
                ermVarArr2[i] = new defpackage.eze(ewyVar2, ermVarArr[i]);
            }
            ewyVar = new defpackage.ewy(ermVarArr2, ewyVar2.d, izgVar);
            if (ffuVar2.b != -1) {
                java.lang.Object obj = ffuVar2.a;
                defpackage.erk erkVar = this.t;
                ewyVar.m(obj, erkVar);
                defpackage.erl erlVar = this.s;
                ewyVar.e(erkVar.c, erlVar, 0L);
                if (erlVar.c()) {
                    ermVar = ewyVar;
                    ffuVar = new defpackage.ffu(obj, -1, -1, ffuVar2.d, -1);
                } else {
                    ffuVar = ffuVar2;
                    ermVar = ewyVar;
                }
            } else {
                ffuVar = ffuVar2;
                ermVar = ewyVar;
            }
        } else {
            ffuVar = ffuVar2;
            ermVar = ewyVar;
        }
        defpackage.eza ezaVar3 = this.I;
        int i2 = ezaVar3.f;
        defpackage.exl exlVar = z4 ? null : ezaVar3.g;
        if (z5) {
            fhgVar = defpackage.fhg.a;
            finVar = this.d;
            aifyVar = aike.a;
        } else {
            fhgVar = ezaVar3.i;
            finVar = this.I.j;
            aifyVar = this.I.k;
        }
        defpackage.eza ezaVar4 = this.I;
        this.I = new defpackage.eza(ermVar, ffuVar, j3, j2, i2, exlVar, false, fhgVar, finVar, aifyVar, ffuVar, ezaVar4.m, ezaVar4.n, ezaVar4.o, ezaVar4.p, j2, 0L, j2, 0L, false, false);
        if (z3) {
            eysVar.s();
            defpackage.eyz eyzVar2 = this.i;
            for (izg izgVar2 : eyzVar2.e.values()) {
                try {
                    izgVar2.c.k(izgVar2.a);
                } catch (java.lang.RuntimeException e3) {
                    defpackage.etr.d("MediaSourceList", "Failed to release child source.", e3);
                }
                ?? r0 = izgVar2.c;
                ?? r4 = izgVar2.b;
                r0.n(r4);
                r0.m(r4);
            }
            eyzVar2.e.clear();
            eyzVar2.f.clear();
            eyzVar2.h = false;
        }
    }

    private final void M() {
        defpackage.eyq eyqVar = this.x.d;
        boolean z = false;
        if (eyqVar != null && eyqVar.g.h && this.K) {
            z = true;
        }
        this.L = z;
    }

    private final void N(long j, boolean z) {
        defpackage.eyq eyqVar = this.x.d;
        long j2 = j + (eyqVar == null ? 1000000000000L : eyqVar.k);
        this.U = j2;
        this.v.a.c(j2);
        for (defpackage.ezi eziVar : this.a) {
            long j3 = this.U;
            defpackage.ezf ezfVarD = eziVar.d(eyqVar);
            if (ezfVarD != null) {
                ezfVarD.D(j3, z);
            }
        }
        for (defpackage.eyq eyqVar2 = r0.d; eyqVar2 != null; eyqVar2 = eyqVar2.h) {
            for (defpackage.fii fiiVar : eyqVar2.j.c) {
            }
        }
    }

    private final void O(defpackage.erm ermVar, defpackage.erm ermVar2) {
        if (ermVar.n() && ermVar2.n()) {
            return;
        }
        java.util.ArrayList arrayList = this.w;
        int size = arrayList.size() - 1;
        if (size < 0) {
            java.util.Collections.sort(arrayList);
            return;
        }
        defpackage.eyg eygVar = (defpackage.eyg) arrayList.get(size);
        java.lang.Object obj = eygVar.b;
        defpackage.ezd ezdVar = eygVar.a;
        throw null;
    }

    private final void P(long j) {
        boolean zF = f();
        defpackage.eza ezaVar = this.I;
        long jMin = 1000;
        boolean z = false;
        if (zF) {
            jMin = ezaVar.f != 3 ? q : 1000L;
            for (defpackage.ezi eziVar : this.a) {
                long j2 = this.U;
                long j3 = this.V;
                defpackage.ezf ezfVar = eziVar.a;
                long jE = defpackage.ezi.w(ezfVar) ? ezfVar.e(j2, j3) : Long.MAX_VALUE;
                defpackage.ezf ezfVar2 = eziVar.b;
                if (ezfVar2 != null && defpackage.ezi.w(ezfVar2)) {
                    jE = java.lang.Math.min(jE, ezfVar2.e(j2, j3));
                }
                jMin = java.lang.Math.min(jMin, eum.C(jE));
            }
            if (this.I.k()) {
                defpackage.eyq eyqVar = this.x.d;
                defpackage.eyq eyqVar2 = eyqVar != null ? eyqVar.h : null;
                if (eyqVar2 != null) {
                    if (this.U + (eum.w(jMin) * this.I.p.b) >= eyqVar2.d()) {
                        jMin = java.lang.Math.min(jMin, q);
                    }
                }
            }
        } else if (ezaVar.f != 3 || ao()) {
            jMin = q;
        }
        if (ao() && jMin > q) {
            z = true;
        }
        defpackage.eza ezaVar2 = this.I;
        if (ezaVar2.r != z) {
            boolean z2 = z;
            defpackage.erm ermVar = ezaVar2.b;
            defpackage.ffu ffuVar = ezaVar2.c;
            long j4 = ezaVar2.d;
            long j5 = ezaVar2.e;
            int i = ezaVar2.f;
            defpackage.exl exlVar = ezaVar2.g;
            boolean z3 = ezaVar2.h;
            defpackage.fhg fhgVar = ezaVar2.i;
            defpackage.fin finVar = ezaVar2.j;
            java.util.List list = ezaVar2.k;
            defpackage.ffu ffuVar2 = ezaVar2.l;
            boolean z4 = ezaVar2.m;
            int i2 = ezaVar2.n;
            int i3 = ezaVar2.o;
            defpackage.erc ercVar = ezaVar2.p;
            long j6 = ezaVar2.s;
            long j7 = ezaVar2.t;
            long j8 = ezaVar2.u;
            long j9 = ezaVar2.v;
            boolean z5 = ezaVar2.q;
            this.I = new defpackage.eza(ermVar, ffuVar, j4, j5, i, exlVar, z3, fhgVar, finVar, list, ffuVar2, z4, i2, i3, ercVar, j6, j7, j8, j9, false, z2);
        }
        ((defpackage.euh) this.f).b.sendEmptyMessageAtTime(2, j + jMin);
    }

    private final void Q(boolean z) {
        defpackage.ffu ffuVar = this.x.d.g.a;
        long jN = n(ffuVar, this.I.u, true, false);
        if (jN != this.I.u) {
            defpackage.eza ezaVar = this.I;
            this.I = q(ffuVar, jN, ezaVar.d, ezaVar.e, z, 5);
        }
    }

    private final void R(defpackage.eyi eyiVar) throws java.lang.Throwable {
        long j;
        boolean z;
        defpackage.ffu ffuVar;
        long jLongValue;
        defpackage.ffu ffuVar2;
        boolean z2;
        long j2;
        long j3;
        defpackage.ffu ffuVar3;
        long j4;
        long j5;
        long jF;
        defpackage.eza ezaVar;
        int i;
        if (this.m) {
            if (this.G != null) {
                this.H++;
                this.J.a(1);
            }
            this.G = eyiVar;
            return;
        }
        this.J.a(1);
        defpackage.erm ermVar = this.I.b;
        int i2 = this.P;
        boolean z3 = this.Q;
        defpackage.erl erlVar = this.s;
        defpackage.erk erkVar = this.t;
        android.util.Pair pairP = p(ermVar, eyiVar, true, i2, z3, erlVar, erkVar);
        long jMax = -9223372036854775807L;
        if (pairP == null) {
            android.util.Pair pairO = o(this.I.b);
            ffuVar = (defpackage.ffu) pairO.first;
            jLongValue = ((java.lang.Long) pairO.second).longValue();
            z = !this.I.b.n();
            j = -9223372036854775807L;
        } else {
            java.lang.Object obj = pairP.first;
            long jLongValue2 = ((java.lang.Long) pairP.second).longValue();
            long j6 = eyiVar.c;
            long j7 = j6 == -9223372036854775807L ? -9223372036854775807L : jLongValue2;
            defpackage.eys eysVar = this.x;
            defpackage.eza ezaVar2 = this.I;
            j = -9223372036854775807L;
            jMax = j7;
            defpackage.ffu ffuVarM = eysVar.m(ezaVar2, ezaVar2.b, obj, jLongValue2, true, false);
            if (ffuVarM.c()) {
                this.I.b.m(ffuVarM.a, erkVar);
                int i3 = ffuVarM.b;
                if (erkVar.d(i3) == ffuVarM.c) {
                    erkVar.g();
                }
                defpackage.epr eprVarA = erkVar.h.a(i3);
                long j8 = eprVarA.a;
                long j9 = eprVarA.i;
                jMax = java.lang.Math.max(jMax, 0L);
                z = true;
                ffuVar = ffuVarM;
                jLongValue = 0;
            } else {
                z = j6 == -9223372036854775807L;
                ffuVar = ffuVarM;
                jLongValue = jLongValue2;
            }
        }
        try {
            if (this.I.b.n()) {
                this.T = eyiVar;
            } else {
                defpackage.eza ezaVar3 = this.I;
                if (pairP == null) {
                    if (ezaVar3.f != 1) {
                        V(4);
                    }
                    L(false, true, false, true);
                } else {
                    if (ffuVar.equals(ezaVar3.c)) {
                        defpackage.eyq eyqVar = this.x.d;
                        if (eyqVar == null || !eyqVar.e || jLongValue == 0) {
                            jF = jLongValue;
                        } else {
                            defpackage.ffs ffsVar = eyqVar.a;
                            long j10 = erlVar.m;
                            if (this.F && j10 != j) {
                                java.lang.Double d = this.E.c;
                            }
                            jF = ffsVar.f(jLongValue, this.D);
                        }
                        long j11 = jF;
                        if (eum.C(jF) == eum.C(this.I.u) && ((i = (ezaVar = this.I).f) == 2 || i == 3)) {
                            jLongValue = ezaVar.u;
                        } else {
                            j3 = j11;
                        }
                    } else {
                        j3 = jLongValue;
                    }
                    long jM = m(ffuVar, j3, this.I.f == 4);
                    z2 = (jLongValue != jM) | z;
                    try {
                        defpackage.eza ezaVar4 = this.I;
                        defpackage.erm ermVar2 = ezaVar4.b;
                        defpackage.ffu ffuVar4 = ffuVar;
                        long j12 = jMax;
                        try {
                            af(ermVar2, ffuVar4, ermVar2, ezaVar4.c, j12, true);
                            ffuVar3 = ffuVar4;
                            j4 = j12;
                            j5 = jM;
                            this.I = q(ffuVar3, j5, j4, j5, z2, 2);
                        } catch (java.lang.Throwable th) {
                            th = th;
                            ffuVar2 = ffuVar4;
                            jMax = j12;
                            j2 = jM;
                            this.I = q(ffuVar2, j2, jMax, j2, z2, 2);
                            throw th;
                        }
                    } catch (java.lang.Throwable th2) {
                        th = th2;
                        ffuVar2 = ffuVar;
                    }
                }
            }
            z2 = z;
            ffuVar3 = ffuVar;
            j4 = jMax;
            j5 = jLongValue;
            this.I = q(ffuVar3, j5, j4, j5, z2, 2);
        } catch (java.lang.Throwable th3) {
            th = th3;
            ffuVar2 = ffuVar;
            z2 = z;
            j2 = jLongValue;
        }
    }

    private final void S(defpackage.eyq eyqVar) {
        for (int i = 0; i < this.a.length; i++) {
            eyqVar.i(i);
        }
    }

    private final void T(defpackage.erc ercVar) {
        this.f.b(16);
        defpackage.exj exjVar = this.v;
        defpackage.eyp eypVar = exjVar.d;
        if (eypVar != null) {
            eypVar.d(ercVar);
            ercVar = exjVar.d.b();
        }
        exjVar.a.d(ercVar);
    }

    private final void U(boolean z, int i, boolean z2, int i2) {
        this.J.a(z2 ? 1 : 0);
        ac(z, i, i2);
    }

    private final void V(int i) {
        defpackage.eza ezaVar = this.I;
        if (ezaVar.f != i) {
            if (i != 2) {
                this.Z = -9223372036854775807L;
            }
            if (i != 3) {
                boolean z = ezaVar.q;
            }
            this.I = this.I.h(i);
        }
    }

    private final void W(float f) {
        this.ac = f;
        float f2 = f * this.B.d;
        int i = 0;
        while (true) {
            defpackage.ezi[] eziVarArr = this.a;
            if (i >= eziVarArr.length) {
                return;
            }
            defpackage.ezi eziVar = eziVarArr[i];
            if (eziVar.b() == 1) {
                defpackage.ezf ezfVar = eziVar.a;
                java.lang.Float fValueOf = java.lang.Float.valueOf(f2);
                ezfVar.p(2, fValueOf);
                defpackage.ezf ezfVar2 = eziVar.b;
                if (ezfVar2 != null) {
                    ezfVar2.p(2, fValueOf);
                }
            }
            i++;
        }
    }

    private final void X() {
        defpackage.eyq eyqVar = this.x.d;
        if (eyqVar == null) {
            return;
        }
        defpackage.fin finVar = eyqVar.j;
        int i = 0;
        while (true) {
            defpackage.ezi[] eziVarArr = this.a;
            if (i >= eziVarArr.length) {
                return;
            }
            if (finVar.b(i)) {
                eziVarArr[i].k();
            }
            i++;
        }
    }

    private final void Y(boolean z, boolean z2) {
        L(z || !this.R, false, true, false);
        this.J.a(z2 ? 1 : 0);
        ((defpackage.exh) this.e).d(this.k);
        this.B.a(this.I.m, 1);
        V(1);
    }

    private final void Z() {
        this.v.f();
        int i = 0;
        while (true) {
            defpackage.ezi[] eziVarArr = this.a;
            if (i >= eziVarArr.length) {
                return;
            }
            defpackage.ezi eziVar = eziVarArr[i];
            defpackage.ezf ezfVar = eziVar.a;
            if (defpackage.ezi.w(ezfVar)) {
                defpackage.ezi.A(ezfVar);
            }
            defpackage.ezf ezfVar2 = eziVar.b;
            if (ezfVar2 != null && defpackage.ezi.w(ezfVar2)) {
                defpackage.ezi.A(ezfVar2);
            }
            i++;
        }
    }

    private final void aa() {
        defpackage.eyq eyqVar = this.x.g;
        boolean z = true;
        if (!this.O && (eyqVar == null || !eyqVar.a.e())) {
            z = false;
        }
        defpackage.eza ezaVar = this.I;
        if (z != ezaVar.h) {
            this.I = ezaVar.c(z);
        }
    }

    private final void ab() {
        defpackage.eza ezaVar = this.I;
        ac(ezaVar.m, ezaVar.o, ezaVar.n);
    }

    private final void ac(boolean z, int i, int i2) {
        ad(z, this.B.a(z, this.I.f), i, i2);
    }

    private final void ad(boolean z, int i, int i2, int i3) {
        boolean z2;
        if (!z) {
            z2 = false;
        } else if (i != -1) {
            z2 = true;
        } else {
            i = -1;
            z2 = false;
        }
        if (i == -1) {
            i3 = 2;
        } else if (i3 == 2) {
            i3 = 1;
        }
        boolean z3 = this.F;
        if (i == 0) {
            i2 = 1;
        } else if (i2 == 1) {
            i2 = z3 ? 4 : 0;
        }
        defpackage.eza ezaVar = this.I;
        if (ezaVar.m == z2 && ezaVar.o == i2 && ezaVar.n == i3) {
            return;
        }
        this.I = ezaVar.f(z2, i3, i2);
        ag(false, false);
        defpackage.eys eysVar = this.x;
        for (defpackage.eyq eyqVar = eysVar.d; eyqVar != null; eyqVar = eyqVar.h) {
            for (defpackage.fii fiiVar : eyqVar.j.c) {
            }
        }
        if (!ao()) {
            Z();
            ae();
            boolean z4 = this.I.q;
            eysVar.r(this.U);
            return;
        }
        int i4 = this.I.f;
        if (i4 == 3) {
            this.v.e();
            X();
            this.f.f(2);
        } else if (i4 == 2) {
            this.f.f(2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:76:0x0197  */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0141, code lost:
    
        r9 = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void ae() {
        /*
            Method dump skipped, instruction units count: 756
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eyj.ae():void");
    }

    private final void af(defpackage.erm ermVar, defpackage.ffu ffuVar, defpackage.erm ermVar2, defpackage.ffu ffuVar2, long j, boolean z) {
        if (!ap(ermVar, ffuVar)) {
            defpackage.erc ercVar = ffuVar.c() ? defpackage.erc.a : this.I.p;
            if (this.v.b().equals(ercVar)) {
                return;
            }
            T(ercVar);
            D(this.I.p, ercVar.b, false, false);
            return;
        }
        java.lang.Object obj = ffuVar.a;
        defpackage.erk erkVar = this.t;
        int i = ermVar.m(obj, erkVar).c;
        defpackage.erl erlVar = this.s;
        ermVar.e(i, erlVar, 0L);
        defpackage.exe exeVar = this.ad;
        defpackage.eqp eqpVar = erlVar.j;
        java.lang.String str = eum.a;
        exeVar.c = eum.w(eqpVar.a);
        exeVar.e = eum.w(eqpVar.b);
        exeVar.f = eum.w(eqpVar.c);
        float f = eqpVar.d;
        if (f == -3.4028235E38f) {
            f = 0.97f;
        }
        exeVar.i = f;
        float f2 = eqpVar.e;
        if (f2 == -3.4028235E38f) {
            f2 = 1.03f;
        }
        exeVar.h = f2;
        if (f == 1.0f && f2 == 1.0f) {
            exeVar.c = -9223372036854775807L;
        }
        exeVar.a();
        if (j != -9223372036854775807L) {
            exeVar.b(i(ermVar, obj, j));
            return;
        }
        if (!j$.util.Objects.equals(!ermVar2.n() ? ermVar2.e(ermVar2.m(ffuVar2.a, erkVar).c, erlVar, 0L).b : null, erlVar.b) || z) {
            exeVar.b(-9223372036854775807L);
        }
    }

    private final void ag(boolean z, boolean z2) {
        this.M = z;
        long jElapsedRealtime = -9223372036854775807L;
        if (z && !z2) {
            jElapsedRealtime = android.os.SystemClock.elapsedRealtime();
        }
        this.N = jElapsedRealtime;
    }

    private final boolean ah(defpackage.eyq eyqVar) {
        for (int i = 0; i < this.a.length; i++) {
            if (!eyqVar.m(i)) {
                return false;
            }
        }
        return true;
    }

    private final boolean ai() {
        if (!this.A) {
            return false;
        }
        for (defpackage.ezi eziVar : this.a) {
            if (eziVar.r()) {
                return true;
            }
        }
        return false;
    }

    private final boolean aj(defpackage.eyq eyqVar) {
        if (!eyqVar.e) {
            return false;
        }
        for (defpackage.ezi eziVar : this.a) {
            if (!eziVar.n(eyqVar)) {
                return false;
            }
        }
        return true;
    }

    private final boolean ak() {
        for (int i = 0; i < this.a.length; i++) {
            defpackage.eys eysVar = this.x;
            if (!j$.util.Objects.equals(eysVar.d, eysVar.i(i))) {
                return true;
            }
        }
        return false;
    }

    private final boolean al(int i) {
        if (this.A) {
            return this.a[i].r();
        }
        return false;
    }

    private final boolean am() {
        defpackage.eyq eyqVar = this.x.d;
        long j = eyqVar.g.e;
        if (eyqVar.e) {
            return j == -9223372036854775807L || this.I.u < j || !ao();
        }
        return false;
    }

    private static boolean an(defpackage.eza ezaVar, defpackage.erk erkVar) {
        defpackage.ffu ffuVar = ezaVar.c;
        defpackage.erm ermVar = ezaVar.b;
        return ermVar.n() || ermVar.m(ffuVar.a, erkVar).g;
    }

    private final boolean ao() {
        defpackage.eza ezaVar = this.I;
        return ezaVar.m && ezaVar.o == 0;
    }

    private final boolean ap(defpackage.erm ermVar, defpackage.ffu ffuVar) {
        if (ffuVar.c() || ermVar.n()) {
            return false;
        }
        int i = ermVar.m(ffuVar.a, this.t).c;
        defpackage.erl erlVar = this.s;
        ermVar.e(i, erlVar, 0L);
        return erlVar.c() && erlVar.i && erlVar.f != -9223372036854775807L;
    }

    private static final boolean aq(defpackage.eyq eyqVar) {
        if (eyqVar == null) {
            return false;
        }
        try {
            if (eyqVar.e) {
                for (defpackage.fgv fgvVar : eyqVar.c) {
                    if (fgvVar != null) {
                        fgvVar.c();
                    }
                }
            } else {
                eyqVar.a.l();
            }
            return eyqVar.c() != Long.MIN_VALUE;
        } catch (java.io.IOException unused) {
            return false;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private final void ar(defpackage.ffu ffuVar, defpackage.fin finVar) {
        defpackage.eys eysVar = this.x;
        defpackage.eyq eyqVar = eysVar.g;
        ahvr.ci(eyqVar);
        if (eyqVar != eysVar.d) {
            long j = eyqVar.g.b;
        }
        long jL = l(eyqVar.b());
        long j2 = ap(this.I.b, eyqVar.g.a) ? this.ad.g : -9223372036854775807L;
        defpackage.eym eymVar = this.e;
        defpackage.fag fagVar = this.k;
        defpackage.erm ermVar = this.I.b;
        float f = this.v.b().b;
        boolean z = this.I.m;
        defpackage.eyl eylVar = new defpackage.eyl(fagVar, ermVar, ffuVar, jL, f, this.M, j2);
        defpackage.fii[] fiiVarArr = finVar.c;
        defpackage.fag fagVar2 = eylVar.a;
        defpackage.exh exhVar = (defpackage.exh) eymVar;
        int iB = exhVar.b(fagVar2);
        defpackage.exg exgVar = (defpackage.exg) exhVar.h.get(fagVar2);
        ahvr.ci(exgVar);
        if (iB == -1) {
            boolean zF = exhVar.f(eylVar);
            int length = fiiVarArr.length;
            int i = 0;
            int i2 = 0;
            while (true) {
                int i3 = 13107200;
                if (i < length) {
                    defpackage.fii fiiVar = fiiVarArr[i];
                    if (fiiVar != null) {
                        switch (fiiVar.c().c) {
                            case androidx.car.app.model.Row.NO_DECORATION /* -1 */:
                            case 1:
                                i2 += i3;
                                break;
                            case 0:
                                i3 = 144310272;
                                i2 += i3;
                                break;
                            case 2:
                                i3 = zF ? 19660800 : 131072000;
                                i2 += i3;
                                break;
                            case 3:
                            case 5:
                            default:
                                i3 = 131072;
                                i2 += i3;
                                break;
                            case 4:
                                i3 = 26214400;
                                i2 += i3;
                                break;
                        }
                    }
                    i++;
                } else {
                    iB = eum.c(i2, 13107200, 210239488);
                }
            }
        }
        exgVar.c = iB;
        exhVar.e();
    }

    /* JADX WARN: Code duplicated, block: B:17:0x005a  */
    /* JADX WARN: Code duplicated, block: B:24:? A[RETURN, SYNTHETIC] */
    static int b(defpackage.erl erlVar, defpackage.erk erkVar, int i, boolean z, java.lang.Object obj, defpackage.erm ermVar, defpackage.erm ermVar2) {
        defpackage.erk erkVar2;
        java.lang.Object obj2 = ermVar.e(ermVar.m(obj, erkVar).c, erlVar, 0L).b;
        for (int i2 = 0; i2 < ermVar2.c(); i2++) {
            if (ermVar2.e(i2, erlVar, 0L).b.equals(obj2)) {
                return i2;
            }
        }
        int iA = ermVar.a(obj);
        int iB = ermVar.b();
        int i3 = 0;
        int iA2 = -1;
        while (i3 < iB && iA2 == -1) {
            boolean z2 = z;
            defpackage.erl erlVar2 = erlVar;
            defpackage.erm ermVar3 = ermVar;
            int i4 = i;
            erkVar2 = erkVar;
            int i5 = ermVar3.i(iA, erkVar2, erlVar2, i4, z2);
            if (i5 == -1) {
                iA2 = -1;
                if (iA2 != -1) {
                    return ermVar2.d(iA2, erkVar2, false).c;
                }
                return -1;
            }
            iA2 = ermVar2.a(ermVar3.f(i5));
            i3++;
            ermVar = ermVar3;
            erlVar = erlVar2;
            z = z2;
            iA = i5;
            erkVar = erkVar2;
            i = i4;
        }
        erkVar2 = erkVar;
        if (iA2 != -1) {
            return ermVar2.d(iA2, erkVar2, false).c;
        }
        return -1;
    }

    public static final void g(defpackage.ezd ezdVar) {
        ezdVar.b();
        try {
            ezdVar.a.p(ezdVar.b, ezdVar.c);
        } finally {
            ezdVar.a(true);
        }
    }

    private final long h(defpackage.eyq eyqVar) {
        ahvr.bY(eyqVar.e);
        return (long) ((eyqVar.d() - this.U) / this.v.b().b);
    }

    private final long i(defpackage.erm ermVar, java.lang.Object obj, long j) {
        defpackage.erk erkVar = this.t;
        int i = ermVar.m(obj, erkVar).c;
        defpackage.erl erlVar = this.s;
        ermVar.e(i, erlVar, 0L);
        if (erlVar.f == -9223372036854775807L || !erlVar.c() || !erlVar.i) {
            return -9223372036854775807L;
        }
        long j2 = erlVar.g;
        java.lang.String str = eum.a;
        long jCurrentTimeMillis = (j2 == -9223372036854775807L ? java.lang.System.currentTimeMillis() : j2 + android.os.SystemClock.elapsedRealtime()) - erlVar.f;
        long j3 = erkVar.f;
        return eum.w(jCurrentTimeMillis) - j;
    }

    private final long j(defpackage.eyq eyqVar, int i) {
        if (eyqVar == null) {
            return 0L;
        }
        if (eyqVar.e) {
            defpackage.ezi[] eziVarArr = this.a;
            if (eziVarArr[i].u(eyqVar)) {
                return ((defpackage.ezf) j$.util.Objects.requireNonNull(eziVarArr[i].d(eyqVar))).f();
            }
        }
        return eyqVar.k;
    }

    private final long k() {
        return l(this.I.s);
    }

    private final long l(long j) {
        defpackage.eyq eyqVar = this.x.g;
        if (eyqVar != null) {
            return java.lang.Math.max(0L, j - (this.U - eyqVar.k));
        }
        return 0L;
    }

    private final long m(defpackage.ffu ffuVar, long j, boolean z) {
        return n(ffuVar, j, ak(), z);
    }

    /* JADX WARN: Code duplicated, block: B:65:0x00f6  */
    private final long n(defpackage.ffu ffuVar, long j, boolean z, boolean z2) {
        Z();
        boolean z3 = true;
        ag(false, true);
        if (z2 || this.I.f == 3) {
            V(2);
        }
        defpackage.eys eysVar = this.x;
        defpackage.eyq eyqVar = eysVar.d;
        defpackage.eyq eyqVar2 = eyqVar;
        while (eyqVar2 != null && !ffuVar.equals(eyqVar2.g.a)) {
            eyqVar2 = eyqVar2.h;
        }
        if (z || eyqVar != eyqVar2 || (eyqVar2 != null && eyqVar2.k + j < 0)) {
            u();
            if (eyqVar2 != null) {
                while (eysVar.d != eyqVar2) {
                    eysVar.c();
                }
                eysVar.a(eyqVar2);
                eyqVar2.k = 1000000000000L;
                x();
                S(eyqVar2);
            }
        }
        s();
        if (this.F) {
            for (defpackage.ezi eziVar : this.a) {
                if (eziVar.v() && (eziVar.b() == 2 || eziVar.b() == 4)) {
                    this.m = true;
                    break;
                }
            }
        }
        if (eyqVar2 != null) {
            eysVar.a(eyqVar2);
            if (!eyqVar2.e) {
                eyqVar2.g = eyqVar2.g.b(j, -9223372036854775807L);
            } else if (eyqVar2.f) {
                if (this.F) {
                    boolean z4 = this.E.i;
                    if (this.I.b.n() || !eyqVar2.g.a.equals(this.I.c)) {
                        defpackage.ffs ffsVar = eyqVar2.a;
                        j = ffsVar.h(j);
                        ffsVar.o(j - this.u);
                    } else {
                        long j2 = eyqVar2.k + j;
                        boolean z5 = true;
                        for (defpackage.ezi eziVar2 : this.a) {
                            if (eziVar2.v()) {
                                defpackage.ezf ezfVarD = eziVar2.d(eyqVar2);
                                z5 &= ezfVarD != null && ezfVarD.M(j2);
                            }
                        }
                        if (z5) {
                            defpackage.ffs ffsVar2 = eyqVar2.a;
                            long j3 = this.I.u;
                            defpackage.ezk ezkVar = defpackage.ezk.b;
                            if (ffsVar2.f(j3, ezkVar) == ffsVar2.f(j, ezkVar)) {
                                z3 = false;
                            } else {
                                defpackage.ffs ffsVar3 = eyqVar2.a;
                                j = ffsVar3.h(j);
                                ffsVar3.o(j - this.u);
                            }
                        } else {
                            defpackage.ffs ffsVar4 = eyqVar2.a;
                            j = ffsVar4.h(j);
                            ffsVar4.o(j - this.u);
                        }
                    }
                } else {
                    defpackage.ffs ffsVar5 = eyqVar2.a;
                    j = ffsVar5.h(j);
                    ffsVar5.o(j - this.u);
                }
            }
            N(j, z3);
            E();
        } else {
            eysVar.o();
            N(j, true);
        }
        A(false);
        this.f.f(2);
        return j;
    }

    private final android.util.Pair o(defpackage.erm ermVar) {
        long j = 0;
        if (ermVar.n()) {
            return android.util.Pair.create(defpackage.eza.a, 0L);
        }
        int iG = ermVar.g(this.Q);
        defpackage.erl erlVar = this.s;
        defpackage.erk erkVar = this.t;
        android.util.Pair pairK = ermVar.k(erlVar, erkVar, iG, -9223372036854775807L);
        defpackage.ffu ffuVarM = this.x.m(this.I, ermVar, pairK.first, 0L, true, false);
        long jLongValue = ((java.lang.Long) pairK.second).longValue();
        if (ffuVarM.c()) {
            ermVar.m(ffuVarM.a, erkVar);
            if (ffuVarM.c == erkVar.d(ffuVarM.b)) {
                erkVar.g();
            }
        } else {
            j = jLongValue;
        }
        return android.util.Pair.create(ffuVarM, java.lang.Long.valueOf(j));
    }

    private static android.util.Pair p(defpackage.erm ermVar, defpackage.eyi eyiVar, boolean z, int i, boolean z2, defpackage.erl erlVar, defpackage.erk erkVar) {
        defpackage.erm ermVar2 = eyiVar.a;
        if (ermVar.n()) {
            return null;
        }
        defpackage.erm ermVar3 = true == ermVar2.n() ? ermVar : ermVar2;
        try {
            android.util.Pair pairK = ermVar3.k(erlVar, erkVar, eyiVar.b, eyiVar.c);
            defpackage.erm ermVar4 = ermVar3;
            if (!ermVar.equals(ermVar4)) {
                if (ermVar.a(pairK.first) == -1) {
                    int iB = b(erlVar, erkVar, i, z2, pairK.first, ermVar4, ermVar);
                    if (iB != -1) {
                        return ermVar.k(erlVar, erkVar, iB, -9223372036854775807L);
                    }
                    return null;
                }
                if (ermVar4.m(pairK.first, erkVar).g && ermVar4.e(erkVar.c, erlVar, 0L).n == ermVar4.a(pairK.first)) {
                    return ermVar.k(erlVar, erkVar, ermVar.m(pairK.first, erkVar).c, eyiVar.c);
                }
            }
            return pairK;
        } catch (java.lang.IndexOutOfBoundsException unused) {
            return null;
        }
    }

    private final defpackage.eza q(defpackage.ffu ffuVar, long j, long j2, long j3, boolean z, int i) {
        defpackage.fhg fhgVar;
        defpackage.fin finVar;
        aify aifyVar;
        defpackage.fhg fhgVar2;
        defpackage.fin finVar2;
        defpackage.eyq eyqVar;
        this.X = (!this.X && j == this.I.u && ffuVar.equals(this.I.c)) ? false : true;
        M();
        defpackage.eza ezaVar = this.I;
        defpackage.fhg fhgVar3 = ezaVar.i;
        defpackage.fin finVar3 = ezaVar.j;
        aify aifyVar2 = ezaVar.k;
        if (this.i.h) {
            defpackage.eys eysVar = this.x;
            defpackage.eyq eyqVar2 = eysVar.d;
            if (eyqVar2 == null) {
                fhgVar2 = defpackage.fhg.a;
                finVar2 = this.d;
            } else {
                fhgVar2 = eyqVar2.i;
                finVar2 = eyqVar2.j;
            }
            defpackage.fii[] fiiVarArr = finVar2.c;
            aift aiftVar = new aift(4);
            int length = fiiVarArr.length;
            int i2 = 0;
            boolean z2 = false;
            while (i2 < length) {
                defpackage.fii fiiVar = fiiVarArr[i2];
                if (fiiVar != null) {
                    defpackage.eqy eqyVar = fiiVar.a(0).l;
                    if (eqyVar == null) {
                        aiftVar.i(new defpackage.eqy(-9223372036854775807L, new defpackage.eqx[0]));
                    } else {
                        aiftVar.i(eqyVar);
                        z2 = true;
                    }
                }
                i2++;
                fhgVar2 = fhgVar2;
                finVar2 = finVar2;
                fiiVarArr = fiiVarArr;
            }
            defpackage.fhg fhgVar4 = fhgVar2;
            defpackage.fin finVar4 = finVar2;
            aify aifyVarH = z2 ? aiftVar.h() : aike.a;
            if (eyqVar2 != null) {
                defpackage.eyr eyrVar = eyqVar2.g;
                if (eyrVar.d != j2) {
                    eyqVar2.g = eyrVar.a(j2);
                }
            }
            if (!ak() && (eyqVar = eysVar.d) != null) {
                defpackage.fin finVar5 = eyqVar.j;
                int i3 = 0;
                while (true) {
                    defpackage.ezi[] eziVarArr = this.a;
                    if (i3 >= eziVarArr.length) {
                        break;
                    }
                    if (finVar5.b(i3)) {
                        if (eziVarArr[i3].b() != 1) {
                            break;
                        }
                        int i4 = finVar5.b[i3].b;
                    }
                    i3++;
                }
            }
            aifyVar = aifyVarH;
            fhgVar = fhgVar4;
            finVar = finVar4;
        } else {
            if (!ffuVar.equals(ezaVar.c)) {
                finVar3 = this.d;
                fhgVar3 = defpackage.fhg.a;
                aifyVar2 = aike.a;
            }
            fhgVar = fhgVar3;
            finVar = finVar3;
            aifyVar = aifyVar2;
        }
        if (z) {
            defpackage.eyh eyhVar = this.J;
            if (!eyhVar.d || eyhVar.e == 5) {
                eyhVar.a = true;
                eyhVar.d = true;
                eyhVar.e = i;
            } else {
                ahvr.bM(i == 5);
            }
        }
        return this.I.e(ffuVar, j, j2, j3, k(), android.os.SystemClock.elapsedRealtime(), fhgVar, finVar, aifyVar);
    }

    private final void r() {
        int i = 0;
        while (true) {
            defpackage.ezi[] eziVarArr = this.a;
            if (i >= eziVarArr.length) {
                return;
            }
            defpackage.ezi eziVar = eziVarArr[i];
            defpackage.ezj ezjVar = this.F ? this.E : null;
            eziVar.a.p(18, ezjVar);
            defpackage.ezf ezfVar = eziVar.b;
            if (ezfVar != null) {
                ezfVar.p(18, ezjVar);
            }
            i++;
        }
    }

    private final void s() {
        boolean z;
        defpackage.ezf ezfVar;
        if (this.A && ai()) {
            for (defpackage.ezi eziVar : this.a) {
                int iA = eziVar.a();
                defpackage.exj exjVar = this.v;
                if (eziVar.r()) {
                    int i = eziVar.c;
                    int i2 = 1;
                    if (i == 5) {
                        z = true;
                    } else if (i == 2) {
                        i = 2;
                        z = true;
                    } else {
                        z = false;
                    }
                    if (i != 5 && i != 3) {
                        i2 = 0;
                    }
                    if (z) {
                        try {
                            ezfVar = eziVar.a;
                        } catch (java.lang.RuntimeException e) {
                            defpackage.etr.d("RendererHolder", "Disable prewarming failed.", e);
                        }
                    } else {
                        ezfVar = eziVar.b;
                        ahvr.ci(ezfVar);
                    }
                    eziVar.e(ezfVar, exjVar);
                    try {
                        eziVar.g(z);
                    } catch (java.lang.RuntimeException e2) {
                        defpackage.etr.d("RendererHolder", "Reset prewarming failed.", e2);
                    }
                    eziVar.c = i2;
                }
                this.S -= iA - eziVar.a();
            }
            this.aa = -9223372036854775807L;
        }
    }

    private final void t(int i) {
        defpackage.ezi[] eziVarArr = this.a;
        int iA = eziVarArr[i].a();
        defpackage.ezi eziVar = eziVarArr[i];
        defpackage.ezf ezfVar = eziVar.a;
        defpackage.exj exjVar = this.v;
        eziVar.e(ezfVar, exjVar);
        defpackage.ezf ezfVar2 = eziVar.b;
        if (ezfVar2 != null) {
            int i2 = eziVar.c;
            boolean z = i2 == 5 || i2 == 1 || i2 == 3;
            eziVar.e(ezfVar2, exjVar);
            eziVar.g(false);
            if (z) {
                eziVar.m(true);
            }
        }
        eziVar.c = 0;
        I(i, false);
        this.S -= iA;
    }

    private final void u() {
        for (int i = 0; i < this.a.length; i++) {
            t(i);
        }
        this.aa = -9223372036854775807L;
    }

    /* JADX WARN: Code duplicated, block: B:122:0x024c A[EDGE_INSN: B:122:0x024c->B:123:0x0250 BREAK  A[LOOP:0: B:86:0x01af->B:96:0x01d2]] */
    /* JADX WARN: Code duplicated, block: B:125:0x0256  */
    /* JADX WARN: Code duplicated, block: B:197:0x0387 A[LOOP:16: B:195:0x0384->B:197:0x0387, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:198:0x0395  */
    /* JADX WARN: Code duplicated, block: B:199:0x039a  */
    /* JADX WARN: Code duplicated, block: B:201:0x03a4  */
    /* JADX WARN: Code duplicated, block: B:203:0x03a8  */
    /* JADX WARN: Code duplicated, block: B:206:0x03ae  */
    /* JADX WARN: Code duplicated, block: B:208:0x03b6  */
    /* JADX WARN: Code duplicated, block: B:227:0x03f1 A[LOOP:6: B:225:0x03ee->B:227:0x03f1, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:229:0x0411  */
    /* JADX WARN: Code duplicated, block: B:232:0x0415  */
    /* JADX WARN: Code duplicated, block: B:240:0x0439  */
    /* JADX WARN: Code duplicated, block: B:249:0x044c  */
    /* JADX WARN: Code duplicated, block: B:284:0x04ce  */
    /* JADX WARN: Code duplicated, block: B:343:0x0602  */
    /* JADX WARN: Code duplicated, block: B:348:0x0611  */
    /* JADX WARN: Code duplicated, block: B:379:0x0686  */
    /* JADX WARN: Code duplicated, block: B:386:0x069f  */
    /* JADX WARN: Code duplicated, block: B:387:0x06a3  */
    /* JADX WARN: Code duplicated, block: B:412:0x06e1  */
    /* JADX WARN: Code duplicated, block: B:415:0x0700  */
    /* JADX WARN: Code duplicated, block: B:417:0x0708  */
    /* JADX WARN: Code duplicated, block: B:422:0x0718  */
    /* JADX WARN: Code duplicated, block: B:426:0x0746  */
    /* JADX WARN: Code duplicated, block: B:451:0x078b  */
    /* JADX WARN: Code duplicated, block: B:453:0x0791  */
    /* JADX WARN: Code duplicated, block: B:460:0x07b3  */
    /* JADX WARN: Code duplicated, block: B:473:0x07df  */
    /* JADX WARN: Code duplicated, block: B:552:0x0901  */
    /* JADX WARN: Code duplicated, block: B:554:0x0908  */
    /* JADX WARN: Code duplicated, block: B:556:0x090c  */
    /* JADX WARN: Code duplicated, block: B:557:0x0912  */
    /* JADX WARN: Code duplicated, block: B:558:0x0914  */
    /* JADX WARN: Code duplicated, block: B:560:0x0918  */
    /* JADX WARN: Code duplicated, block: B:562:0x0926  */
    /* JADX WARN: Code duplicated, block: B:563:0x092d  */
    /* JADX WARN: Code duplicated, block: B:569:0x093f  */
    /* JADX WARN: Code duplicated, block: B:575:0x0950  */
    /* JADX WARN: Code duplicated, block: B:600:0x09d9  */
    /* JADX WARN: Code duplicated, block: B:602:0x09dc  */
    /* JADX WARN: Code duplicated, block: B:604:0x09e9  */
    /* JADX WARN: Code duplicated, block: B:605:0x09f5  */
    /* JADX WARN: Code duplicated, block: B:607:0x09fc  */
    /* JADX WARN: Code duplicated, block: B:615:0x0a18  */
    /* JADX WARN: Code duplicated, block: B:617:0x0a1c  */
    /* JADX WARN: Code duplicated, block: B:619:0x0a24 A[LOOP:15: B:618:0x0a22->B:619:0x0a24, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:623:0x0a34  */
    /* JADX WARN: Code duplicated, block: B:625:0x0a3f  */
    /* JADX WARN: Code duplicated, block: B:64:0x0168  */
    /* JADX WARN: Code duplicated, block: B:654:0x0aab  */
    /* JADX WARN: Code duplicated, block: B:65:0x0174  */
    /* JADX WARN: Code duplicated, block: B:68:0x0182  */
    /* JADX WARN: Code duplicated, block: B:706:0x07e2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:707:0x0780 A[EDGE_INSN: B:707:0x0780->B:448:0x0780 BREAK  A[LOOP:9: B:424:0x0741->B:447:0x077d], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:716:0x07d4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:738:0x03d1 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:740:0x04c8 A[EDGE_INSN: B:740:0x04c8->B:281:0x04c8 BREAK  A[LOOP:18: B:247:0x0447->B:280:0x04c5], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:755:0x060a A[EDGE_INSN: B:755:0x060a->B:345:0x060a BREAK  A[LOOP:19: B:282:0x04c9->B:344:0x0604], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:770:0x06a4 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v7, types: [eys] */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r14v7 */
    /* JADX WARN: Type inference failed for: r14v8 */
    /* JADX WARN: Type inference failed for: r44v0, types: [eyj, ffr] */
    /* JADX WARN: Type inference failed for: r5v112 */
    /* JADX WARN: Type inference failed for: r5v113, types: [int] */
    /* JADX WARN: Type inference failed for: r5v128 */
    /* JADX WARN: Type inference failed for: r5v129 */
    /* JADX WARN: Type inference failed for: r5v130 */
    /* JADX WARN: Type inference failed for: r5v131 */
    /* JADX WARN: Type inference failed for: r5v21 */
    /* JADX WARN: Type inference failed for: r5v22 */
    /* JADX WARN: Type inference failed for: r5v27 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v31 */
    /* JADX WARN: Type inference failed for: r5v32, types: [int] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v50 */
    /* JADX WARN: Type inference failed for: r5v51 */
    /* JADX WARN: Type inference failed for: r5v52 */
    /* JADX WARN: Type inference failed for: r5v53 */
    /* JADX WARN: Type inference failed for: r5v55 */
    /* JADX WARN: Type inference failed for: r5v56 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v35 */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v18, types: [int] */
    /* JADX WARN: Type inference failed for: r7v57 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v17 */
    /* JADX WARN: Type inference failed for: r8v18, types: [boolean] */
    /* JADX WARN: Type inference failed for: r8v22 */
    /* JADX WARN: Type inference failed for: r8v27 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v32 */
    /* JADX WARN: Type inference failed for: r8v33, types: [boolean] */
    /* JADX WARN: Type inference failed for: r8v35 */
    /* JADX WARN: Type inference failed for: r8v4, types: [int] */
    /* JADX WARN: Type inference failed for: r8v43 */
    /* JADX WARN: Type inference failed for: r8v44 */
    /* JADX WARN: Type inference failed for: r8v50, types: [boolean] */
    /* JADX WARN: Type inference failed for: r8v51 */
    /* JADX WARN: Type inference failed for: r8v52 */
    /* JADX WARN: Type inference failed for: r8v53 */
    /* JADX WARN: Type inference failed for: r8v54 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* JADX WARN: Type inference failed for: r9v19 */
    /* JADX WARN: Type inference failed for: r9v26 */
    /* JADX WARN: Type inference failed for: r9v27, types: [int] */
    /* JADX WARN: Type inference failed for: r9v52 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8 */
    private final void v() {
        long j;
        ?? r11;
        long j2;
        long j3;
        defpackage.etk etkVar;
        ?? r5;
        ?? r6;
        defpackage.eza ezaVar;
        defpackage.eyq eyqVar;
        defpackage.exe exeVar;
        long j4;
        long j5;
        defpackage.fii[] fiiVarArr;
        int length;
        ?? r8;
        defpackage.eyq eyqVar2;
        long j6;
        defpackage.eyq eyqVar3;
        ?? r9;
        ?? r10;
        long j7;
        long j8;
        long jMin;
        ?? r12;
        ?? r7;
        boolean zAm;
        defpackage.ezi[] eziVarArr;
        defpackage.eys eysVar;
        defpackage.eyr eyrVarJ;
        defpackage.eys eysVar2;
        defpackage.eyq eyqVar4;
        int i;
        ?? r13;
        boolean z;
        boolean z2;
        int i2;
        int i3;
        defpackage.ezi[] eziVarArr2;
        int i4;
        defpackage.eyq eyqVarF;
        defpackage.eyq eyqVarI;
        int iC;
        int i5;
        defpackage.eyq eyqVarI2;
        long j9;
        defpackage.fin finVar;
        int i6;
        defpackage.ezi[] eziVarArr3;
        defpackage.eyq eyqVarH;
        defpackage.eyq eyqVar5;
        boolean z3;
        defpackage.eyq eyqVar6;
        defpackage.eyq eyqVar7;
        defpackage.eyq eyqVarC;
        boolean z4;
        int i7;
        defpackage.ezi[] eziVarArr4;
        defpackage.fin finVar2;
        int i8;
        defpackage.ezf ezfVar;
        defpackage.fgv fgvVar;
        defpackage.ezf ezfVar2;
        defpackage.ffu ffuVar;
        defpackage.ffu ffuVar2;
        ?? r14;
        long j10;
        defpackage.eyq eyqVarF2;
        defpackage.eyq eyqVarF3;
        defpackage.eyq eyqVarF4;
        defpackage.fin finVar3;
        defpackage.ezi[] eziVarArr5;
        int i9;
        int i10;
        int i11;
        int i12;
        defpackage.eyq[] eyqVarArr;
        int i13;
        boolean z5;
        long j11;
        int i14;
        int i15;
        defpackage.eyq eyqVarE;
        defpackage.eyq eyqVar8;
        ?? r15;
        defpackage.etk etkVar2 = this.f;
        long jUptimeMillis = android.os.SystemClock.uptimeMillis();
        etkVar2.b(2);
        defpackage.eza ezaVar2 = this.I;
        int i16 = ezaVar2.f;
        if (i16 == 1 || i16 == 4) {
            return;
        }
        if (ezaVar2.b.n() || !this.i.h) {
            j = jUptimeMillis;
            r11 = 0;
            j2 = -9223372036854775807L;
            j3 = 0;
            etkVar = etkVar2;
        } else {
            defpackage.eys eysVar3 = this.x;
            j2 = -9223372036854775807L;
            eysVar3.r(this.U);
            defpackage.eyq eyqVar9 = eysVar3.g;
            if (eyqVar9 == null || (!eyqVar9.g.i && eyqVar9.j() && eysVar3.g.g.e != -9223372036854775807L && eysVar3.i < 100)) {
                long j12 = this.U;
                defpackage.eza ezaVar3 = this.I;
                defpackage.eyq eyqVar10 = eysVar3.g;
                if (eyqVar10 == null) {
                    eyrVarJ = eysVar3.k(ezaVar3.b, ezaVar3.c, ezaVar3.d, ezaVar3.u, -9223372036854775807L);
                    eysVar2 = eysVar3;
                } else {
                    eysVar = eysVar3;
                    eyrVarJ = eysVar.j(ezaVar3.b, eyqVar10, j12);
                }
                if (eyrVarJ != null) {
                    eysVar2 = eysVar;
                    defpackage.eyq eyqVar11 = eysVar2.g;
                    long j13 = eyqVar11 == null ? 1000000000000L : (eyqVar11.k + eyqVar11.g.e) - eyrVarJ.b;
                    int i17 = 0;
                    while (true) {
                        if (i17 >= eysVar2.k.size()) {
                            eyqVar4 = null;
                            break;
                        }
                        defpackage.eyr eyrVar = ((defpackage.eyq) eysVar2.k.get(i17)).g;
                        long j14 = eyrVar.e;
                        long j15 = eyrVarJ.e;
                        if ((j14 == -9223372036854775807L || j14 == j15) && eyrVar.b == eyrVarJ.b && eyrVar.a.equals(eyrVarJ.a)) {
                            eyqVar4 = (defpackage.eyq) eysVar2.k.remove(i17);
                            break;
                        }
                        i17++;
                    }
                    if (eyqVar4 == null) {
                        defpackage.eyj eyjVar = (defpackage.eyj) eysVar2.m.a;
                        defpackage.exf exfVar = new defpackage.exf((defpackage.exh) eyjVar.e, eyjVar.k);
                        long j16 = eyjVar.o.b;
                        eyqVar4 = new defpackage.eyq(eyjVar.b, j13, eyjVar.c, exfVar, eyjVar.i, eyrVarJ, eyjVar.d, eyjVar.l);
                    } else {
                        eyqVar4.g = eyrVarJ;
                        eyqVar4.k = j13;
                    }
                    defpackage.eyq eyqVar12 = eysVar2.g;
                    if (eyqVar12 != null) {
                        eyqVar12.h(eyqVar4);
                    } else {
                        eysVar2.d = eyqVar4;
                        java.util.Arrays.fill(eysVar2.e, eyqVar4);
                        java.util.Arrays.fill(eysVar2.f, eyqVar4);
                    }
                    eysVar2.j = null;
                    eysVar2.g = eyqVar4;
                    eysVar2.i++;
                    eysVar2.q();
                    if (!eyqVar4.d) {
                        eyqVar4.f(this, eyrVarJ.b);
                    } else if (eyqVar4.e) {
                        etkVar2.i(8, eyqVar4.a).b();
                    }
                    if (eysVar2.d == eyqVar4) {
                        N(eyrVarJ.b, true);
                    }
                    i = 0;
                    A(false);
                    r13 = eysVar2;
                }
                if (this.O) {
                    this.O = aq(r13.g);
                    aa();
                } else {
                    E();
                }
                z = this.l;
                z2 = this.L;
                if (z) {
                    etkVar = etkVar2;
                    i2 = 5;
                    if (!z2 && this.A && !this.ab) {
                        i6 = 0;
                        while (true) {
                            eziVarArr3 = this.a;
                            if (i6 < eziVarArr3.length) {
                                break;
                            }
                            if (!eziVarArr3[i6].p() && !eziVarArr3[i6].r() && (eyqVarH = r13.h(i6)) != null && eyqVarH.e && j$.util.Objects.equals(eyqVarH, r13.i(i6)) && (((!eyqVarH.j.b(i6) && eziVarArr3[i6].v()) || eyqVarH.m(i6)) && (eyqVar5 = eyqVarH.h) != null && eyqVar5.e && h(eyqVar5) <= 10000000)) {
                                r13.n(i6);
                                defpackage.eyq eyqVarH2 = r13.h(i6);
                                if (eyqVarH2 != null && eyqVarH2.j.b(i6) && eziVarArr3[i6].p() && !eziVarArr3[i6].r()) {
                                    eziVarArr3[i6].l();
                                    w(eyqVarH2, i6, false, eyqVarH2.d());
                                }
                            }
                            i6++;
                        }
                    }
                    i3 = 0;
                    while (true) {
                        eziVarArr2 = this.a;
                        if (i3 < eziVarArr2.length) {
                            break;
                        }
                        eyqVarI2 = r13.i(i3);
                        defpackage.ezi eziVar = eziVarArr2[i3];
                        if (eyqVarI2 != null || !eyqVarI2.e) {
                            j9 = jUptimeMillis;
                        } else if (eyqVarI2.h == null || this.L) {
                            j9 = jUptimeMillis;
                            if ((eyqVarI2.g.i || this.L) && eziVar.u(eyqVarI2) && eziVar.o(eyqVarI2)) {
                                long j17 = eyqVarI2.g.e;
                                eziVar.j(eyqVarI2, (j17 == -9223372036854775807L || j17 == Long.MIN_VALUE) ? -9223372036854775807L : j17 + eyqVarI2.k);
                            }
                        } else if ((al(i3) || eziVar.u(eyqVarI2) || aj(eyqVarI2)) && eziVarArr2[i3].n(eyqVarI2) && !(al(i3) && j$.util.Objects.equals(r13.h(i3), r13.i(i3)))) {
                            defpackage.eyq eyqVar13 = eyqVarI2.h;
                            if (eyqVar13.e || (this.U >= eyqVar13.d() && aj(eyqVarI2))) {
                                if (aj(eyqVarI2)) {
                                    j9 = jUptimeMillis;
                                } else {
                                    defpackage.eyq eyqVar14 = eyqVarI2.h;
                                    ahvr.ci(eyqVar14);
                                    if (eyqVarI2.g.a.c() == eyqVar14.g.a.c()) {
                                        defpackage.erl erlVar = new defpackage.erl();
                                        defpackage.erm ermVar = this.I.b;
                                        java.lang.Object obj = eyqVarI2.g.a.a;
                                        defpackage.erk erkVar = this.t;
                                        j9 = jUptimeMillis;
                                        this.I.b.e(ermVar.m(obj, erkVar).c, erlVar, 0L);
                                        boolean zC = erlVar.c();
                                        this.I.b.e(this.I.b.m(eyqVar14.g.a.a, erkVar).c, erlVar, 0L);
                                        boolean zC2 = erlVar.c();
                                        if (zC || zC2) {
                                        }
                                    } else {
                                        j9 = jUptimeMillis;
                                    }
                                }
                                defpackage.eyq eyqVar15 = eyqVarI2.h;
                                if (!eyqVar15.e || h(eyqVar15) <= 10000000) {
                                    boolean zEquals = j$.util.Objects.equals(eyqVarI2, r13.g());
                                    defpackage.fin finVar4 = eyqVarI2.j;
                                    defpackage.eyq eyqVarD = r13.d(i3);
                                    defpackage.fin finVar5 = eyqVarD.j;
                                    if (zEquals) {
                                        defpackage.erm ermVar2 = this.I.b;
                                        finVar = finVar5;
                                        af(ermVar2, eyqVarD.g.a, ermVar2, eyqVarI2.g.a, -9223372036854775807L, false);
                                    } else {
                                        finVar = finVar5;
                                    }
                                    eziVar.h(finVar4, finVar, eyqVarD.d());
                                }
                            } else {
                                j9 = jUptimeMillis;
                            }
                        } else {
                            j9 = jUptimeMillis;
                        }
                        i3++;
                        jUptimeMillis = j9;
                    }
                    j = jUptimeMillis;
                    boolean z6 = true;
                    for (i4 = 0; i4 < eziVarArr2.length; i4++) {
                        eyqVarI = r13.i(i4);
                        if (eyqVarI == null && r13.d != eyqVarI && !eyqVarI.m(i4)) {
                            defpackage.ezi eziVar2 = eziVarArr2[i4];
                            defpackage.eyq eyqVarI3 = r13.i(i4);
                            defpackage.fin finVar6 = eyqVarI3.j;
                            if (eyqVarI3.e && finVar6.b(i4) && eziVar2.v() && !al(i4) && !eziVar2.u(eyqVarI3)) {
                                int iA = eyqVarI3.c[i4].a();
                                if ((iA & 2) != 0) {
                                    z6 = false;
                                } else {
                                    if ((iA & 4) != 0) {
                                        long jD = eyqVarI3.d();
                                        defpackage.ezf ezfVar3 = eziVar2.b;
                                        if (ezfVar3 == null || (i5 = eziVar2.c) == 4 || i5 == 3 || i5 == 0) {
                                            ezfVar3 = eziVar2.a;
                                        }
                                        defpackage.ezi.B(ezfVar3, jD);
                                    }
                                    int iA2 = eziVar2.a();
                                    iC = eziVar2.c(eyqVarI3, finVar6, this.v);
                                    this.S -= iA2 - eziVar2.a();
                                    if ((iC & 1) != 0) {
                                        if (finVar6.b(i4)) {
                                            w(eyqVarI3, i4, false, eyqVarI3.d());
                                        }
                                        if (eyqVarI.e) {
                                            eyqVarI.i(i4);
                                        }
                                    } else {
                                        z6 = false;
                                    }
                                }
                            } else {
                                int iA3 = eziVar2.a();
                                iC = eziVar2.c(eyqVarI3, finVar6, this.v);
                                this.S -= iA3 - eziVar2.a();
                                if ((iC & 1) != 0) {
                                    if (finVar6.b(i4) && !eziVar2.u(eyqVarI3)) {
                                        w(eyqVarI3, i4, false, eyqVarI3.d());
                                    }
                                    if (eyqVarI.e) {
                                        eyqVarI.i(i4);
                                    }
                                } else {
                                    z6 = false;
                                }
                            }
                        }
                    }
                    eyqVarF = r13.f();
                    if (eyqVarF != null && r13.d != eyqVarF && !eyqVarF.e && z6) {
                        S(eyqVarF);
                    }
                } else {
                    if (!z2 || !this.A || this.ab || ai() || (eyqVarE = r13.e()) == null || !eyqVarE.e || !j$.util.Objects.equals(eyqVarE, r13.f()) || (eyqVar8 = eyqVarE.h) == null || !eyqVar8.e) {
                        r14 = i;
                        etkVar = etkVar2;
                        j10 = -9223372036854775807L;
                        break;
                    }
                    int i18 = i;
                    while (true) {
                        defpackage.ezi[] eziVarArr6 = this.a;
                        if (i18 >= eziVarArr6.length) {
                            if (h(eyqVarE.h) <= 10000000) {
                                for (int i19 = i; i19 < r13.f.length; i19++) {
                                    r13.n(i19);
                                }
                                defpackage.eyq eyqVarE2 = r13.e();
                                if (eyqVarE2 != null) {
                                    defpackage.fin finVar7 = eyqVarE2.j;
                                    int i20 = i;
                                    while (i20 < eziVarArr6.length) {
                                        if (finVar7.b(i20) && eziVarArr6[i20].p() && !eziVarArr6[i20].r()) {
                                            eziVarArr6[i20].l();
                                            w(eyqVarE2, i20, false, eyqVarE2.d());
                                        }
                                        i20++;
                                        i = i;
                                        j2 = j2;
                                        etkVar2 = etkVar2;
                                    }
                                    r15 = i;
                                    etkVar = etkVar2;
                                    j10 = j2;
                                    r14 = r15;
                                    if (!ai()) {
                                        break;
                                    }
                                    this.aa = eyqVarE2.a.g();
                                    if (!eyqVarE2.j()) {
                                        r14 = r15;
                                        r13.a(eyqVarE2);
                                        A(r15);
                                        E();
                                        r14 = r15;
                                        break;
                                    }
                                    break;
                                }
                            }
                        } else if (!eziVarArr6[i18].p() || ((!eyqVarE.j.b(i18) && eziVarArr6[i18].v()) || eyqVarE.m(i18))) {
                            i18++;
                        }
                        r14 = i;
                        etkVar = etkVar2;
                        j10 = -9223372036854775807L;
                        break;
                    }
                    r14 = r15;
                    eyqVarF2 = r13.f();
                    if (eyqVarF2 == null) {
                        j2 = j10;
                        i2 = 5;
                    } else if (eyqVarF2.h != null || this.L) {
                        j2 = j10;
                        i2 = 5;
                        if (eyqVarF2.g.i || this.L) {
                            for (defpackage.ezi eziVar3 : this.a) {
                                if (!eziVar3.u(eyqVarF2) && eziVar3.o(eyqVarF2)) {
                                    long j18 = eyqVarF2.g.e;
                                    eziVar3.j(eyqVarF2, (j18 == j2 || j18 == Long.MIN_VALUE) ? j2 : j18 + eyqVarF2.k);
                                }
                            }
                        }
                    } else if (!aj(r13.f()) || (ai() && j$.util.Objects.equals(r13.e(), r13.f()))) {
                        j2 = j10;
                        i2 = 5;
                    } else {
                        defpackage.eyq eyqVar16 = eyqVarF2.h;
                        if (eyqVar16.e || this.U >= eyqVar16.d()) {
                            defpackage.eyq eyqVar17 = eyqVarF2.h;
                            if (!eyqVar17.e || h(eyqVar17) <= 10000000) {
                                defpackage.fin finVar8 = eyqVarF2.j;
                                ?? r16 = r14;
                                while (true) {
                                    eyqVarArr = r13.e;
                                    if (r16 >= eyqVarArr.length) {
                                        break;
                                    }
                                    r13.d(r16);
                                    r16++;
                                }
                                defpackage.eyq eyqVar18 = eyqVarArr[r14];
                                ahvr.ci(eyqVar18);
                                defpackage.fin finVar9 = eyqVar18.j;
                                defpackage.erm ermVar3 = this.I.b;
                                af(ermVar3, eyqVar18.g.a, ermVar3, eyqVarF2.g.a, -9223372036854775807L, false);
                                if (!eyqVar18.e || ((!(z5 = this.A) || this.aa == j10) && eyqVar18.a.g() == j10)) {
                                    j2 = j10;
                                    i2 = 5;
                                    for (defpackage.ezi eziVar4 : this.a) {
                                        eziVar4.h(finVar8, finVar9, eyqVar18.d());
                                    }
                                } else {
                                    this.aa = j10;
                                    if (z5 && !this.ab) {
                                        int i21 = 0;
                                        while (true) {
                                            defpackage.ezi[] eziVarArr7 = this.a;
                                            if (i21 < eziVarArr7.length) {
                                                if (finVar9.b(i21)) {
                                                    eziVarArr7[i21].b();
                                                    defpackage.fii[] fiiVarArr2 = finVar9.c;
                                                    if (defpackage.eqz.e(fiiVarArr2[i21].b().p, fiiVarArr2[i21].b().k) || eziVarArr7[i21].r()) {
                                                    }
                                                }
                                                i21++;
                                            } else {
                                                j2 = j10;
                                                i2 = 5;
                                                while (i13 < r1.length) {
                                                    eziVar4.h(finVar8, finVar9, eyqVar18.d());
                                                }
                                            }
                                        }
                                    }
                                    long jD2 = eyqVar18.d();
                                    defpackage.ezi[] eziVarArr8 = this.a;
                                    int i22 = 0;
                                    while (i22 < eziVarArr8.length) {
                                        defpackage.ezi eziVar5 = eziVarArr8[i22];
                                        defpackage.ezf ezfVar4 = eziVar5.a;
                                        if (!defpackage.ezi.w(ezfVar4) || (i15 = eziVar5.c) == 5) {
                                            j11 = j10;
                                        } else {
                                            j11 = j10;
                                            if (i15 != 2) {
                                                defpackage.ezi.B(ezfVar4, jD2);
                                            }
                                        }
                                        defpackage.ezf ezfVar5 = eziVar5.b;
                                        if (ezfVar5 != null && defpackage.ezi.w(ezfVar5) && (i14 = eziVar5.c) != 4 && i14 != 3) {
                                            defpackage.ezi.B(ezfVar5, jD2);
                                        }
                                        i22++;
                                        j10 = j11;
                                    }
                                    j2 = j10;
                                    if (!eyqVar18.j()) {
                                        r13.a(eyqVar18);
                                        A(false);
                                        E();
                                    }
                                    i2 = 5;
                                }
                            } else {
                                j2 = j10;
                                i2 = 5;
                            }
                        } else {
                            j2 = j10;
                            i2 = 5;
                        }
                    }
                    eyqVarF3 = r13.f();
                    if (eyqVarF3 != null && r13.d != eyqVarF3 && !ah(eyqVarF3)) {
                        eyqVarF4 = r13.f();
                        finVar3 = eyqVarF4.j;
                        eziVarArr5 = this.a;
                        i9 = 1;
                        for (defpackage.ezi eziVar6 : eziVarArr5) {
                            int iA4 = eziVar6.a();
                            int iC2 = eziVar6.c(eyqVarF4, finVar3, this.v);
                            this.S -= iA4 - eziVar6.a();
                            i9 &= iC2 & 1;
                        }
                        if (i9 != 0) {
                            for (i11 = 0; i11 < eziVarArr5.length; i11++) {
                                if (!finVar3.b(i11) && !eziVarArr5[i11].u(eyqVarF4)) {
                                    w(eyqVarF4, i11, false, eyqVarF4.d());
                                }
                            }
                            S(r13.f());
                        }
                    }
                    j = jUptimeMillis;
                }
                z3 = false;
                while (ao() && !this.L && (eyqVar6 = r13.d) != null && (eyqVar7 = eyqVar6.h) != null && this.U >= eyqVar7.d() && ah(eyqVar7)) {
                    if (z3) {
                        G(-1);
                    }
                    this.ab = false;
                    eyqVarC = r13.c();
                    ahvr.ci(eyqVarC);
                    if (this.I.c.a.equals(eyqVarC.g.a.a)) {
                        ffuVar = this.I.c;
                        if (ffuVar.b == -1) {
                            ffuVar2 = eyqVarC.g.a;
                            if (ffuVar2.b == -1 || ffuVar.e == ffuVar2.e) {
                                z4 = false;
                            } else {
                                z4 = true;
                            }
                        } else {
                            z4 = false;
                        }
                    } else {
                        z4 = false;
                    }
                    defpackage.eyr eyrVar2 = eyqVarC.g;
                    defpackage.ffu ffuVar3 = eyrVar2.a;
                    long j19 = eyrVar2.b;
                    int i23 = i2;
                    this.I = q(ffuVar3, j19, eyrVar2.d, j19, !z4, 0);
                    M();
                    ae();
                    i7 = 0;
                    while (true) {
                        eziVarArr4 = this.a;
                        if (i7 < eziVarArr4.length) {
                            break;
                        }
                        if (!al(i7) && j$.util.Objects.equals(eyqVarC, r13.h(i7))) {
                            defpackage.ezi eziVar7 = eziVarArr4[i7];
                            int i24 = eziVar7.c;
                            if (i24 == 4 || i24 == i23) {
                                eziVar7.m(i24 == i23);
                                eziVar7.c = eziVar7.c == i23 ? 0 : 1;
                            } else if (i24 == 2) {
                                eziVar7.c = 0;
                            } else if (i24 == 3) {
                                eziVar7.c = 1;
                            }
                        }
                        i7++;
                    }
                    defpackage.eyq eyqVar19 = r13.d;
                    ahvr.ci(eyqVar19);
                    finVar2 = eyqVar19.j;
                    for (i8 = 0; i8 < eziVarArr4.length; i8++) {
                        if (finVar2.b(i8)) {
                            defpackage.ezi eziVar8 = eziVarArr4[i8];
                            ezfVar = eziVar8.a;
                            if (defpackage.ezi.w(ezfVar) || eziVar8.t() || eziVar8.x(eyqVar19, eziVar8.h)) {
                                fgvVar = null;
                            } else {
                                eziVar8.f = true;
                                fgvVar = null;
                                eziVar8.h = null;
                                ezfVar.o();
                            }
                            ezfVar2 = eziVar8.b;
                            if (ezfVar2 == null && defpackage.ezi.w(ezfVar2) && !eziVar8.y() && !eziVar8.x(eyqVar19, eziVar8.i)) {
                                eziVar8.g = true;
                                eziVar8.i = fgvVar;
                                ezfVar2.o();
                            }
                        }
                    }
                    if (this.I.f == 3) {
                        X();
                    }
                    z3 = true;
                    i2 = i23;
                }
                r11 = 0;
                j3 = 0;
                long j20 = this.o.b;
            } else {
                eysVar2 = eysVar3;
            }
            eysVar2 = eysVar;
            i = 0;
            r13 = eysVar2;
            if (this.O) {
                this.O = aq(r13.g);
                aa();
            } else {
                E();
            }
            z = this.l;
            z2 = this.L;
            if (z) {
                if (!z2) {
                    r14 = i;
                    etkVar = etkVar2;
                    j10 = -9223372036854775807L;
                    break;
                } else {
                    r14 = i;
                    etkVar = etkVar2;
                    j10 = -9223372036854775807L;
                    break;
                }
                r14 = r15;
                eyqVarF2 = r13.f();
                if (eyqVarF2 == null) {
                    j2 = j10;
                    i2 = 5;
                } else if (eyqVarF2.h != null) {
                    j2 = j10;
                    i2 = 5;
                    if (eyqVarF2.g.i) {
                        while (i12 < r2.length) {
                            if (!eziVar3.u(eyqVarF2)) {
                            }
                        }
                    } else {
                        while (i12 < r2.length) {
                            if (!eziVar3.u(eyqVarF2)) {
                            }
                        }
                    }
                } else {
                    j2 = j10;
                    i2 = 5;
                    if (eyqVarF2.g.i) {
                        while (i12 < r2.length) {
                            if (!eziVar3.u(eyqVarF2)) {
                            }
                        }
                    } else {
                        while (i12 < r2.length) {
                            if (!eziVar3.u(eyqVarF2)) {
                            }
                        }
                    }
                }
                eyqVarF3 = r13.f();
                if (eyqVarF3 != null) {
                    eyqVarF4 = r13.f();
                    finVar3 = eyqVarF4.j;
                    eziVarArr5 = this.a;
                    i9 = 1;
                    while (i10 < eziVarArr5.length) {
                        int iA5 = eziVar6.a();
                        int iC3 = eziVar6.c(eyqVarF4, finVar3, this.v);
                        this.S -= iA5 - eziVar6.a();
                        i9 &= iC3 & 1;
                    }
                    if (i9 != 0) {
                        while (i11 < eziVarArr5.length) {
                            if (!finVar3.b(i11)) {
                            }
                        }
                        S(r13.f());
                    }
                }
                j = jUptimeMillis;
            } else {
                etkVar = etkVar2;
                i2 = 5;
                if (!z2) {
                    i6 = 0;
                    while (true) {
                        eziVarArr3 = this.a;
                        if (i6 < eziVarArr3.length) {
                            break;
                            break;
                        } else {
                            if (!eziVarArr3[i6].p()) {
                            }
                            i6++;
                        }
                    }
                }
                i3 = 0;
                while (true) {
                    eziVarArr2 = this.a;
                    if (i3 < eziVarArr2.length) {
                        break;
                        break;
                    }
                    eyqVarI2 = r13.i(i3);
                    defpackage.ezi eziVar9 = eziVarArr2[i3];
                    if (eyqVarI2 != null) {
                        j9 = jUptimeMillis;
                    } else {
                        j9 = jUptimeMillis;
                    }
                    i3++;
                    jUptimeMillis = j9;
                }
                j = jUptimeMillis;
                boolean z7 = true;
                while (i4 < eziVarArr2.length) {
                    eyqVarI = r13.i(i4);
                    if (eyqVarI == null) {
                    }
                }
                eyqVarF = r13.f();
                if (eyqVarF != null) {
                    S(eyqVarF);
                }
            }
            z3 = false;
            while (ao()) {
                if (z3) {
                    G(-1);
                }
                this.ab = false;
                eyqVarC = r13.c();
                ahvr.ci(eyqVarC);
                if (this.I.c.a.equals(eyqVarC.g.a.a)) {
                    ffuVar = this.I.c;
                    if (ffuVar.b == -1) {
                        ffuVar2 = eyqVarC.g.a;
                        if (ffuVar2.b == -1) {
                            z4 = false;
                        } else {
                            z4 = false;
                        }
                    } else {
                        z4 = false;
                    }
                } else {
                    z4 = false;
                }
                defpackage.eyr eyrVar3 = eyqVarC.g;
                defpackage.ffu ffuVar4 = eyrVar3.a;
                long j110 = eyrVar3.b;
                int i25 = i2;
                this.I = q(ffuVar4, j110, eyrVar3.d, j110, !z4, 0);
                M();
                ae();
                i7 = 0;
                while (true) {
                    eziVarArr4 = this.a;
                    if (i7 < eziVarArr4.length) {
                        break;
                        break;
                    } else {
                        if (!al(i7)) {
                        }
                        i7++;
                    }
                }
                defpackage.eyq eyqVar110 = r13.d;
                ahvr.ci(eyqVar110);
                finVar2 = eyqVar110.j;
                while (i8 < eziVarArr4.length) {
                    if (finVar2.b(i8)) {
                        defpackage.ezi eziVar10 = eziVarArr4[i8];
                        ezfVar = eziVar10.a;
                        if (defpackage.ezi.w(ezfVar)) {
                            fgvVar = null;
                        } else {
                            fgvVar = null;
                        }
                        ezfVar2 = eziVar10.b;
                        if (ezfVar2 == null) {
                        }
                    }
                }
                if (this.I.f == 3) {
                    X();
                }
                z3 = true;
                i2 = i25;
            }
            r11 = 0;
            j3 = 0;
            long j21 = this.o.b;
        }
        defpackage.eys eysVar4 = this.x;
        defpackage.eyq eyqVar20 = eysVar4.d;
        long j22 = j;
        if (eyqVar20 == null) {
            P(j22);
            return;
        }
        android.os.Trace.beginSection("doSomeWork");
        ae();
        if (eyqVar20.e) {
            this.V = eum.w(android.os.SystemClock.elapsedRealtime());
            eyqVar20.a.o(this.I.u - this.u);
            ?? r17 = r11;
            r5 = 1;
            r6 = 1;
            while (true) {
                eziVarArr = this.a;
                if (r17 >= eziVarArr.length) {
                    break;
                }
                defpackage.ezi eziVar11 = eziVarArr[r17];
                if (eziVar11.a() == 0) {
                    I(r17, r11);
                } else {
                    long j23 = this.U;
                    long j24 = this.V;
                    defpackage.ezf ezfVar6 = eziVar11.a;
                    if (defpackage.ezi.w(ezfVar6)) {
                        ezfVar6.V(j23, j24);
                    }
                    defpackage.ezf ezfVar7 = eziVar11.b;
                    if (ezfVar7 != null && defpackage.ezi.w(ezfVar7)) {
                        ezfVar7.V(j23, j24);
                    }
                    r5 = (r5 == 0 || !eziVar11.q()) ? r11 : 1;
                    defpackage.ezf ezfVarD = eziVar11.d(eyqVar20);
                    ?? r18 = (ezfVarD == null || ezfVarD.J() || ezfVarD.X() || ezfVarD.W()) ? 1 : r11;
                    I(r17, r18);
                    r6 = (r6 == 0 || r18 == 0) ? r11 : 1;
                    if (r18 == 0) {
                        H(r17);
                    }
                }
                r5 = r5;
                r6 = r6;
                r17++;
            }
            if (this.m && !etkVar.c(37)) {
                ?? r19 = r11;
                while (true) {
                    if (r19 >= eziVarArr.length) {
                        etkVar.h(37).b();
                        break;
                    }
                    defpackage.ezi eziVar12 = eziVarArr[r19];
                    if (eziVar12.v() && ((eziVar12.b() == 2 || eziVar12.b() == 4) && !eziVar12.q())) {
                        break;
                    } else {
                        r19++;
                    }
                }
            }
        } else {
            eyqVar20.a.l();
            r5 = 1;
            r6 = 1;
        }
        long j25 = eyqVar20.g.e;
        if (r5 == 0 || !eyqVar20.e || (j25 != j2 && j25 > this.I.u)) {
            ezaVar = this.I;
            if (ezaVar.f != 2) {
                r7 = zAm;
                if (this.I.f == 3 && (this.S != 0 ? r6 == 0 : !am())) {
                    ag(ao(), r11);
                    V(2);
                    if (this.M) {
                        for (eyqVar = eysVar4.d; eyqVar != null; eyqVar = eyqVar.h) {
                            fiiVarArr = eyqVar.j.c;
                            length = fiiVarArr.length;
                            for (r8 = r11; r8 < length; r8++) {
                                defpackage.fii fiiVar = fiiVarArr[r8];
                            }
                        }
                        exeVar = this.ad;
                        j4 = exeVar.g;
                        if (j4 != j2) {
                            long j26 = j4 + exeVar.b;
                            exeVar.g = j26;
                            j5 = exeVar.f;
                            if (j5 != j2 && j26 > j5) {
                                exeVar.g = j5;
                            }
                            exeVar.k = j2;
                        }
                    }
                    Z();
                }
            } else {
                if (this.S == 0) {
                    zAm = am();
                } else if (r6 == 0) {
                    r7 = zAm;
                    if (this.I.f == 3) {
                        ag(ao(), r11);
                        V(2);
                        if (this.M) {
                            while (eyqVar != null) {
                                fiiVarArr = eyqVar.j.c;
                                length = fiiVarArr.length;
                                while (r8 < length) {
                                    defpackage.fii fiiVar2 = fiiVarArr[r8];
                                }
                            }
                            exeVar = this.ad;
                            j4 = exeVar.g;
                            if (j4 != j2) {
                                long j27 = j4 + exeVar.b;
                                exeVar.g = j27;
                                j5 = exeVar.f;
                                if (j5 != j2) {
                                    exeVar.g = j5;
                                }
                                exeVar.k = j2;
                            }
                        }
                        Z();
                    }
                } else {
                    if (ezaVar.h) {
                        eyqVar2 = eysVar4.d;
                        if (ap(ezaVar.b, eyqVar2.g.a)) {
                            j6 = this.ad.g;
                        } else {
                            j6 = j2;
                        }
                        eyqVar3 = eysVar4.g;
                        if (eyqVar3.j() || !eyqVar3.g.i) {
                            r9 = r11;
                        } else {
                            r9 = 1;
                        }
                        if (eyqVar3.g.a.c() || eyqVar3.e) {
                            r10 = r11;
                        } else {
                            r10 = 1;
                        }
                        if (r9 != 0 && r10 == 0) {
                            long jL = l(eyqVar3.b());
                            defpackage.eym eymVar = this.e;
                            defpackage.fag fagVar = this.k;
                            defpackage.erm ermVar4 = this.I.b;
                            defpackage.ffu ffuVar5 = eyqVar2.g.a;
                            long j28 = eyqVar2.k;
                            float f = this.v.b().b;
                            boolean z8 = this.I.m;
                            defpackage.eyl eylVar = new defpackage.eyl(fagVar, ermVar4, ffuVar5, jL, f, this.M, j6);
                            boolean z9 = eylVar.f;
                            float f2 = eylVar.e;
                            long j29 = eylVar.d;
                            defpackage.exh exhVar = (defpackage.exh) eymVar;
                            boolean zF = exhVar.f(eylVar);
                            long jV = eum.v(j29, f2);
                            if (z9) {
                                if (zF) {
                                    j8 = exhVar.f;
                                    jMin = j8;
                                    r12 = 1;
                                } else {
                                    j7 = exhVar.e;
                                    jMin = j7;
                                    r12 = r11;
                                }
                            } else if (zF) {
                                j8 = exhVar.d;
                                jMin = j8;
                                r12 = 1;
                            } else {
                                j7 = exhVar.c;
                                jMin = j7;
                                r12 = r11;
                            }
                            long j30 = eylVar.g;
                            if (j30 != j2) {
                                jMin = java.lang.Math.min(j30 / 2, jMin);
                            }
                            if (jMin <= j3 || jV >= jMin) {
                                r7 = 1;
                            } else {
                                if (!defpackage.exh.h(r12)) {
                                    defpackage.fag fagVar2 = eylVar.a;
                                    if (exhVar.c(fagVar2) >= exhVar.a(fagVar2)) {
                                        r7 = 1;
                                    }
                                }
                                r7 = r11;
                            }
                        }
                    }
                    r7 = zAm;
                    V(3);
                    this.Y = null;
                    if (ao()) {
                        ag(r11, r11);
                        this.v.e();
                        X();
                    }
                }
                if (r7 != 0) {
                    r7 = zAm;
                    V(3);
                    this.Y = null;
                    if (ao()) {
                        ag(r11, r11);
                        this.v.e();
                        X();
                    }
                } else {
                    r7 = zAm;
                    if (this.I.f == 3) {
                        ag(ao(), r11);
                        V(2);
                        if (this.M) {
                            while (eyqVar != null) {
                                fiiVarArr = eyqVar.j.c;
                                length = fiiVarArr.length;
                                while (r8 < length) {
                                    defpackage.fii fiiVar3 = fiiVarArr[r8];
                                }
                            }
                            exeVar = this.ad;
                            j4 = exeVar.g;
                            if (j4 != j2) {
                                long j210 = j4 + exeVar.b;
                                exeVar.g = j210;
                                j5 = exeVar.f;
                                if (j5 != j2) {
                                    exeVar.g = j5;
                                }
                                exeVar.k = j2;
                            }
                        }
                        Z();
                    }
                }
            }
        } else {
            if (this.L) {
                this.L = r11;
                U(r11, this.I.o, r11, 5);
            }
            if (eyqVar20.g.i) {
                V(4);
                Z();
            } else {
                ezaVar = this.I;
                if (ezaVar.f != 2) {
                    r7 = zAm;
                    if (this.I.f == 3) {
                        ag(ao(), r11);
                        V(2);
                        if (this.M) {
                            while (eyqVar != null) {
                                fiiVarArr = eyqVar.j.c;
                                length = fiiVarArr.length;
                                while (r8 < length) {
                                    defpackage.fii fiiVar4 = fiiVarArr[r8];
                                }
                            }
                            exeVar = this.ad;
                            j4 = exeVar.g;
                            if (j4 != j2) {
                                long j211 = j4 + exeVar.b;
                                exeVar.g = j211;
                                j5 = exeVar.f;
                                if (j5 != j2) {
                                    exeVar.g = j5;
                                }
                                exeVar.k = j2;
                            }
                        }
                        Z();
                    }
                } else {
                    if (this.S == 0) {
                        zAm = am();
                    } else if (r6 == 0) {
                        r7 = zAm;
                        if (this.I.f == 3) {
                            ag(ao(), r11);
                            V(2);
                            if (this.M) {
                                while (eyqVar != null) {
                                    fiiVarArr = eyqVar.j.c;
                                    length = fiiVarArr.length;
                                    while (r8 < length) {
                                        defpackage.fii fiiVar5 = fiiVarArr[r8];
                                    }
                                }
                                exeVar = this.ad;
                                j4 = exeVar.g;
                                if (j4 != j2) {
                                    long j212 = j4 + exeVar.b;
                                    exeVar.g = j212;
                                    j5 = exeVar.f;
                                    if (j5 != j2) {
                                        exeVar.g = j5;
                                    }
                                    exeVar.k = j2;
                                }
                            }
                            Z();
                        }
                    } else {
                        if (ezaVar.h) {
                            eyqVar2 = eysVar4.d;
                            if (ap(ezaVar.b, eyqVar2.g.a)) {
                                j6 = this.ad.g;
                            } else {
                                j6 = j2;
                            }
                            eyqVar3 = eysVar4.g;
                            if (eyqVar3.j()) {
                                r9 = r11;
                            } else {
                                r9 = r11;
                            }
                            if (eyqVar3.g.a.c()) {
                                r10 = r11;
                            } else {
                                r10 = r11;
                            }
                            if (r9 != 0) {
                            }
                        }
                        r7 = zAm;
                        V(3);
                        this.Y = null;
                        if (ao()) {
                            ag(r11, r11);
                            this.v.e();
                            X();
                        }
                    }
                    if (r7 != 0) {
                        r7 = zAm;
                        V(3);
                        this.Y = null;
                        if (ao()) {
                            ag(r11, r11);
                            this.v.e();
                            X();
                        }
                    } else {
                        r7 = zAm;
                        if (this.I.f == 3) {
                            ag(ao(), r11);
                            V(2);
                            if (this.M) {
                                while (eyqVar != null) {
                                    fiiVarArr = eyqVar.j.c;
                                    length = fiiVarArr.length;
                                    while (r8 < length) {
                                        defpackage.fii fiiVar6 = fiiVarArr[r8];
                                    }
                                }
                                exeVar = this.ad;
                                j4 = exeVar.g;
                                if (j4 != j2) {
                                    long j213 = j4 + exeVar.b;
                                    exeVar.g = j213;
                                    j5 = exeVar.f;
                                    if (j5 != j2) {
                                        exeVar.g = j5;
                                    }
                                    exeVar.k = j2;
                                }
                            }
                            Z();
                        }
                    }
                }
            }
        }
        if (this.I.f == 2) {
            ?? r20 = r11;
            while (true) {
                defpackage.ezi[] eziVarArr9 = this.a;
                if (r20 >= eziVarArr9.length) {
                    break;
                }
                if (eziVarArr9[r20].u(eyqVar20)) {
                    H(r20);
                }
                r20++;
            }
            defpackage.eza ezaVar4 = this.I;
            if (ezaVar4.h || ezaVar4.t >= 500000 || !aq(eysVar4.g) || !ao()) {
                this.Z = -9223372036854775807L;
            } else if (this.Z == -9223372036854775807L) {
                this.Z = android.os.SystemClock.elapsedRealtime();
            } else if (android.os.SystemClock.elapsedRealtime() - this.Z >= 4000) {
                throw new defpackage.euf(r11, 4000);
            }
        } else {
            this.Z = -9223372036854775807L;
        }
        ?? r110 = (ao() && this.I.f == 3) ? 1 : r11;
        boolean z10 = this.I.q;
        int i26 = this.I.f;
        if (i26 != 4 && (r110 != 0 || i26 == 2 || (i26 == 3 && this.S != 0))) {
            P(j22);
        }
        android.os.Trace.endSection();
    }

    private final void w(defpackage.eyq eyqVar, int i, boolean z, long j) {
        defpackage.ezi eziVar = this.a[i];
        if (eziVar.v()) {
            return;
        }
        defpackage.eyq eyqVar2 = this.x.d;
        boolean z2 = eyqVar == eyqVar2;
        defpackage.fin finVar = eyqVar.j;
        defpackage.ezh ezhVar = finVar.b[i];
        defpackage.fii fiiVar = finVar.c[i];
        boolean z3 = ao() && this.I.f == 3;
        boolean z4 = !z && z3;
        this.S++;
        defpackage.fgv fgvVar = eyqVar.c[i];
        long j2 = eyqVar.k;
        defpackage.ffu ffuVar = eyqVar.g.a;
        defpackage.exj exjVar = this.v;
        defpackage.fgv fgvVar2 = eyqVar == eyqVar2 ? null : fgvVar;
        defpackage.eqg[] eqgVarArrZ = defpackage.ezi.z(fiiVar);
        int i2 = eziVar.c;
        if (i2 == 0 || i2 == 2 || i2 == 5) {
            eziVar.d = true;
            eziVar.f = z2;
            eziVar.h = fgvVar2;
            defpackage.ezf ezfVar = eziVar.a;
            ezfVar.P(ezhVar, eqgVarArrZ, fgvVar, z4, z2, j, j2, ffuVar);
            exjVar.c(ezfVar);
        } else {
            eziVar.e = true;
            eziVar.g = z2;
            eziVar.i = fgvVar2;
            defpackage.ezf ezfVar2 = eziVar.b;
            ahvr.ci(ezfVar2);
            ezfVar2.P(ezhVar, eqgVarArrZ, fgvVar, z4, z2, j, j2, ffuVar);
            exjVar.c(ezfVar2);
        }
        rai raiVar = new rai(this);
        defpackage.ezf ezfVarD = eziVar.d(eyqVar);
        ahvr.ci(ezfVarD);
        ezfVarD.p(11, raiVar);
        if (z3 && z2) {
            eziVar.k();
        }
    }

    private final void x() {
        ahvr.bY(!ak());
        y(new boolean[this.a.length], this.x.f().d());
    }

    private final void y(boolean[] zArr, long j) {
        defpackage.ezi[] eziVarArr;
        defpackage.eyj eyjVar;
        long j2;
        ahvr.bY(!ak());
        defpackage.eyq eyqVarF = this.x.f();
        defpackage.fin finVar = eyqVarF.j;
        int i = 0;
        while (true) {
            eziVarArr = this.a;
            if (i >= eziVarArr.length) {
                break;
            }
            if (!finVar.b(i)) {
                eziVarArr[i].i();
            }
            i++;
        }
        int i2 = 0;
        while (i2 < eziVarArr.length) {
            if (!finVar.b(i2) || eziVarArr[i2].u(eyqVarF)) {
                eyjVar = this;
                j2 = j;
            } else {
                eyjVar = this;
                j2 = j;
                eyjVar.w(eyqVarF, i2, zArr[i2], j2);
            }
            i2++;
            this = eyjVar;
            j = j2;
        }
    }

    private final void z(java.io.IOException iOException, int i) {
        defpackage.exl exlVar = new defpackage.exl(0, iOException, i, null, -1, null, 4, null, false);
        defpackage.eyq eyqVar = this.x.d;
        if (eyqVar != null) {
            exlVar = exlVar.a(eyqVar.g.a);
        }
        defpackage.etr.d("ExoPlayerImplInternal", "Playback error", exlVar);
        Y(false, false);
        this.I = this.I.g(exlVar);
    }

    @Override // defpackage.fjx
    public final void a(long j, long j2, defpackage.eqg eqgVar, android.media.MediaFormat mediaFormat) {
        if (this.m) {
            this.f.h(37).b();
        }
    }

    @Override // defpackage.fgw
    public final /* bridge */ /* synthetic */ void c(defpackage.fgx fgxVar) {
        this.f.i(9, (defpackage.ffs) fgxVar).b();
    }

    @Override // defpackage.ffr
    public final void d(defpackage.ffs ffsVar) {
        this.f.i(8, ffsVar).b();
    }

    public final void e(int i, boolean z) {
        defpackage.etk etkVar = this.f;
        defpackage.yz yzVarJ = etkVar.j(40, i, 0);
        if (z) {
            etkVar.k(yzVarJ);
        } else {
            yzVarJ.b();
        }
    }

    public final boolean f() {
        if (this.y) {
            return true;
        }
        if (!this.F) {
            return false;
        }
        boolean z = this.E.g;
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:255:0x05a0 A[Catch: RuntimeException -> 0x06c7, IOException -> 0x06c9, fex -> 0x06cb, evs -> 0x06cd, era -> 0x06cf, fcr -> 0x06d1, exl -> 0x06d4, TryCatch #8 {era -> 0x06cf, evs -> 0x06cd, exl -> 0x06d4, fcr -> 0x06d1, fex -> 0x06cb, IOException -> 0x06c9, RuntimeException -> 0x06c7, blocks: (B:244:0x0575, B:246:0x057e, B:248:0x0585, B:250:0x058d, B:253:0x059b, B:255:0x05a0, B:257:0x05bd, B:260:0x05c5, B:280:0x0651, B:282:0x0661, B:283:0x066e, B:284:0x066f, B:285:0x0678, B:286:0x0684, B:287:0x069a, B:288:0x06a7, B:289:0x06b0, B:293:0x06bb), top: B:434:0x0013 }] */
    /* JADX WARN: Code duplicated, block: B:257:0x05bd A[Catch: RuntimeException -> 0x06c7, IOException -> 0x06c9, fex -> 0x06cb, evs -> 0x06cd, era -> 0x06cf, fcr -> 0x06d1, exl -> 0x06d4, TryCatch #8 {era -> 0x06cf, evs -> 0x06cd, exl -> 0x06d4, fcr -> 0x06d1, fex -> 0x06cb, IOException -> 0x06c9, RuntimeException -> 0x06c7, blocks: (B:244:0x0575, B:246:0x057e, B:248:0x0585, B:250:0x058d, B:253:0x059b, B:255:0x05a0, B:257:0x05bd, B:260:0x05c5, B:280:0x0651, B:282:0x0661, B:283:0x066e, B:284:0x066f, B:285:0x0678, B:286:0x0684, B:287:0x069a, B:288:0x06a7, B:289:0x06b0, B:293:0x06bb), top: B:434:0x0013 }] */
    /* JADX WARN: Code duplicated, block: B:348:0x0764  */
    /* JADX WARN: Code duplicated, block: B:350:0x076a A[LOOP:9: B:347:0x0762->B:350:0x076a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:353:0x0773  */
    /* JADX WARN: Code duplicated, block: B:373:0x07d5  */
    /* JADX WARN: Code duplicated, block: B:374:0x07d7  */
    /* JADX WARN: Code duplicated, block: B:399:0x0838  */
    /* JADX WARN: Code duplicated, block: B:401:0x083c  */
    /* JADX WARN: Code duplicated, block: B:404:0x0846  */
    /* JADX WARN: Code duplicated, block: B:406:0x0850  */
    /* JADX WARN: Code duplicated, block: B:408:0x0854  */
    /* JADX WARN: Code duplicated, block: B:410:0x0860 A[LOOP:13: B:407:0x0852->B:410:0x0860, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:414:0x086f A[LOOP:14: B:412:0x0867->B:414:0x086f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:418:0x0895  */
    /* JADX WARN: Code duplicated, block: B:428:0x08ba  */
    /* JADX WARN: Code duplicated, block: B:464:0x076d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:465:0x0771 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:473:0x0863 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:474:0x0867 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v126, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v12 */
    /* JADX WARN: Type inference failed for: r15v15 */
    /* JADX WARN: Type inference failed for: r15v16 */
    /* JADX WARN: Type inference failed for: r15v2 */
    /* JADX WARN: Type inference failed for: r15v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r15v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r15v5, types: [int] */
    /* JADX WARN: Type inference failed for: r15v7 */
    /* JADX WARN: Type inference failed for: r28v0, types: [eyj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v14, types: [eys] */
    /* JADX WARN: Type inference failed for: r3v27, types: [boolean] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // android.os.Handler.Callback
    public final boolean handleMessage(android.os.Message message) throws java.lang.Throwable {
        int i;
        defpackage.exl exlVar;
        int i2;
        defpackage.exl exlVar2;
        defpackage.exl exlVar3;
        int i3;
        defpackage.eys eysVar;
        defpackage.eyq eyqVarF;
        defpackage.ffu ffuVar;
        ?? r3;
        defpackage.eyq eyqVarF2;
        defpackage.ffu ffuVar2;
        defpackage.eys eysVar2;
        defpackage.ezi eziVar;
        defpackage.eyq eyqVarF3;
        int i4;
        defpackage.aeic aeicVar;
        ?? r15 = 4;
        i = 4;
        int i5 = 4;
        ?? r16 = 4;
        int i6 = 1;
        try {
            try {
                defpackage.eyq eyqVar = null;
                try {
                    try {
                        switch (message.what) {
                            case 1:
                                i6 = 1;
                                U(message.arg1 != 0, message.arg2 >> 4, true, message.arg2 & 15);
                                G(message.what);
                                return i6;
                            case 2:
                                i6 = 1;
                                v();
                                G(message.what);
                                return i6;
                            case 3:
                                i6 = 1;
                                R((defpackage.eyi) message.obj);
                                G(message.what);
                                return i6;
                            case 4:
                                i6 = 1;
                                T((defpackage.erc) message.obj);
                                C(this.v.b(), true);
                                G(message.what);
                                return i6;
                            case 5:
                                i6 = 1;
                                this.D = (defpackage.ezk) message.obj;
                                G(message.what);
                                return i6;
                            case 6:
                                i6 = 1;
                                Y(false, true);
                                G(message.what);
                                return i6;
                            case 7:
                                i6 = 1;
                                defpackage.agze agzeVar = (defpackage.agze) message.obj;
                                try {
                                    L(true, false, true, false);
                                    int i7 = 0;
                                    while (true) {
                                        defpackage.ezi[] eziVarArr = this.a;
                                        if (i7 >= eziVarArr.length) {
                                            defpackage.eym eymVar = this.e;
                                            ((defpackage.exh) eymVar).d(this.k);
                                            if (((defpackage.exh) eymVar).h.isEmpty()) {
                                                ((defpackage.exh) eymVar).i = -1L;
                                            }
                                            defpackage.esc escVar = this.B;
                                            escVar.a = null;
                                            escVar.b();
                                            escVar.d(0);
                                            defpackage.fim fimVar = this.c;
                                            if (((defpackage.fih) fimVar).e != null) {
                                                ahvr.bZ(java.lang.Thread.currentThread().equals(((defpackage.fih) fimVar).e), "DefaultTrackSelector is accessed on the wrong thread.");
                                            }
                                            if (android.os.Build.VERSION.SDK_INT >= 32 && (aeicVar = ((defpackage.fih) fimVar).h) != null) {
                                                aeicVar.a();
                                                ((defpackage.fih) fimVar).h = null;
                                            }
                                            fimVar.j = null;
                                            fimVar.k = null;
                                            V(1);
                                            return i6;
                                        }
                                        this.b[i7].m();
                                        defpackage.ezi eziVar2 = eziVarArr[i7];
                                        eziVar2.a.A();
                                        eziVar2.d = false;
                                        defpackage.ezf ezfVar = eziVar2.b;
                                        if (ezfVar != null) {
                                            ezfVar.A();
                                            eziVar2.e = false;
                                        }
                                        i7++;
                                    }
                                } finally {
                                    this.f.e();
                                    this.ae.g();
                                    agzeVar.g();
                                }
                                break;
                            case 8:
                                defpackage.ffs ffsVar = (defpackage.ffs) message.obj;
                                defpackage.eys eysVar3 = this.x;
                                if (eysVar3.t(ffsVar)) {
                                    defpackage.eyq eyqVar2 = eysVar3.g;
                                    ahvr.ci(eyqVar2);
                                    if (!eyqVar2.e) {
                                        float f = this.v.b().b;
                                        defpackage.eza ezaVar = this.I;
                                        defpackage.erm ermVar = ezaVar.b;
                                        boolean z = ezaVar.m;
                                        eyqVar2.p();
                                    }
                                    ar(eyqVar2.g.a, eyqVar2.j);
                                    if (eyqVar2 == eysVar3.d) {
                                        N(eyqVar2.g.b, true);
                                        x();
                                        S(eyqVar2);
                                        defpackage.eza ezaVar2 = this.I;
                                        defpackage.ffu ffuVar3 = ezaVar2.c;
                                        long j = eyqVar2.g.b;
                                        i6 = 1;
                                        this.I = q(ffuVar3, j, ezaVar2.d, j, false, 5);
                                    } else {
                                        i6 = 1;
                                    }
                                    E();
                                } else {
                                    i6 = 1;
                                    for (int i8 = 0; i8 < eysVar3.k.size(); i8++) {
                                        defpackage.eyq eyqVar3 = (defpackage.eyq) eysVar3.k.get(i8);
                                        if (eyqVar3.a == ffsVar) {
                                            eyqVar = eyqVar3;
                                            if (eyqVar != null) {
                                                ahvr.bY(!eyqVar.e);
                                                float f2 = this.v.b().b;
                                                defpackage.eza ezaVar3 = this.I;
                                                defpackage.erm ermVar2 = ezaVar3.b;
                                                boolean z2 = ezaVar3.m;
                                                eyqVar.p();
                                                if (eysVar3.u(ffsVar)) {
                                                    F();
                                                }
                                            }
                                        }
                                    }
                                    if (eyqVar != null) {
                                        ahvr.bY(!eyqVar.e);
                                        float f3 = this.v.b().b;
                                        defpackage.eza ezaVar4 = this.I;
                                        defpackage.erm ermVar3 = ezaVar4.b;
                                        boolean z3 = ezaVar4.m;
                                        eyqVar.p();
                                        if (eysVar3.u(ffsVar)) {
                                            F();
                                        }
                                    }
                                }
                                G(message.what);
                                return i6;
                            case 9:
                                defpackage.ffs ffsVar2 = (defpackage.ffs) message.obj;
                                defpackage.eys eysVar4 = this.x;
                                if (eysVar4.t(ffsVar2)) {
                                    eysVar4.r(this.U);
                                    E();
                                } else if (eysVar4.u(ffsVar2)) {
                                    F();
                                }
                                i6 = 1;
                                G(message.what);
                                return i6;
                            case 10:
                                defpackage.err errVar = (defpackage.err) message.obj;
                                defpackage.fim fimVar2 = this.c;
                                if (errVar != null) {
                                    if (errVar instanceof defpackage.fib) {
                                        ((defpackage.fih) fimVar2).d = (defpackage.fib) errVar;
                                    } else {
                                        defpackage.fia fiaVar = new defpackage.fia(((defpackage.fih) fimVar2).d);
                                        fiaVar.b(errVar);
                                        ((defpackage.fih) fimVar2).d = new defpackage.fib(fiaVar);
                                    }
                                }
                                J();
                                i6 = 1;
                                G(message.what);
                                return i6;
                            case 11:
                                int i9 = message.arg1;
                                this.P = i9;
                                defpackage.eys eysVar5 = this.x;
                                defpackage.erm ermVar4 = this.I.b;
                                eysVar5.a = i9;
                                int iB = eysVar5.b(ermVar4);
                                if ((iB & 1) != 0) {
                                    Q(true);
                                } else if ((iB & 2) != 0) {
                                    s();
                                }
                                A(false);
                                i6 = 1;
                                G(message.what);
                                return i6;
                            case 12:
                                boolean z4 = message.arg1 != 0;
                                this.Q = z4;
                                defpackage.eys eysVar6 = this.x;
                                defpackage.erm ermVar5 = this.I.b;
                                eysVar6.b = z4;
                                int iB2 = eysVar6.b(ermVar5);
                                if ((iB2 & 1) != 0) {
                                    Q(true);
                                } else if ((iB2 & 2) != 0) {
                                    s();
                                }
                                A(false);
                                i6 = 1;
                                G(message.what);
                                return i6;
                            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_LEFT /* 13 */:
                                boolean z5 = message.arg1 != 0;
                                defpackage.agze agzeVar2 = (defpackage.agze) message.obj;
                                if (this.R != z5) {
                                    this.R = z5;
                                    if (!z5) {
                                        for (defpackage.ezi eziVar3 : this.a) {
                                            eziVar3.i();
                                        }
                                    }
                                }
                                if (agzeVar2 != null) {
                                    agzeVar2.g();
                                }
                                i6 = 1;
                                G(message.what);
                                return i6;
                            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_RIGHT /* 14 */:
                                defpackage.ezd ezdVar = (defpackage.ezd) message.obj;
                                long j2 = ezdVar.e;
                                if (ezdVar.d == this.g) {
                                    g(ezdVar);
                                    int i10 = this.I.f;
                                    if (i10 == 3 || i10 == 2) {
                                        this.f.f(2);
                                    }
                                } else {
                                    this.f.i(15, ezdVar).b();
                                }
                                i6 = 1;
                                G(message.what);
                                return i6;
                            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_NORMAL_LEFT /* 15 */:
                                defpackage.ezd ezdVar2 = (defpackage.ezd) message.obj;
                                android.os.Looper looper = ezdVar2.d;
                                if (looper.getThread().isAlive()) {
                                    this.h.b(looper, null).d(new defpackage.drn(ezdVar2, 9));
                                } else {
                                    defpackage.etr.f("TAG", "Trying to send message on a dead thread.");
                                    ezdVar2.a(false);
                                }
                                i6 = 1;
                                G(message.what);
                                return i6;
                            case 16:
                                C((defpackage.erc) message.obj, false);
                                i6 = 1;
                                G(message.what);
                                return i6;
                            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                                defpackage.eyf eyfVar = (defpackage.eyf) message.obj;
                                this.J.a(1);
                                int i11 = eyfVar.b;
                                if (i11 != -1) {
                                    this.T = new defpackage.eyi(new defpackage.ewy(eyfVar.a, eyfVar.d), i11, eyfVar.c);
                                }
                                defpackage.eyz eyzVar = this.i;
                                java.util.List list = eyfVar.a;
                                izg izgVar = eyfVar.d;
                                java.util.List list2 = eyzVar.a;
                                eyzVar.f(0, list2.size());
                                B(eyzVar.g(list2.size(), list, izgVar), false);
                                i6 = 1;
                                G(message.what);
                                return i6;
                            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                                defpackage.eyf eyfVar2 = (defpackage.eyf) message.obj;
                                int iA = message.arg1;
                                this.J.a(1);
                                defpackage.eyz eyzVar2 = this.i;
                                if (iA == -1) {
                                    iA = eyzVar2.a();
                                }
                                B(eyzVar2.g(iA, eyfVar2.a, eyfVar2.d), false);
                                i6 = 1;
                                G(message.what);
                                return i6;
                            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                                ahox ahoxVar = (ahox) message.obj;
                                this.J.a(1);
                                defpackage.eyz eyzVar3 = this.i;
                                int i12 = ahoxVar.b;
                                int i13 = ahoxVar.a;
                                int i14 = ahoxVar.c;
                                java.lang.Object obj = ahoxVar.d;
                                ahvr.bM((boolean) ((eyzVar3.a() ^ (-1)) >>> 31));
                                eyzVar3.j = null;
                                B(eyzVar3.b(), false);
                                i6 = 1;
                                G(message.what);
                                return i6;
                            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_U_TURN_RIGHT /* 20 */:
                                int i15 = message.arg1;
                                int i16 = message.arg2;
                                izg izgVar2 = (izg) message.obj;
                                this.J.a(1);
                                defpackage.eyz eyzVar4 = this.i;
                                ahvr.bM(i15 >= 0 && i15 <= i16 && i16 <= eyzVar4.a());
                                eyzVar4.j = izgVar2;
                                eyzVar4.f(i15, i16);
                                B(eyzVar4.b(), false);
                                i6 = 1;
                                G(message.what);
                                return i6;
                            case androidx.car.app.navigation.model.Maneuver.TYPE_OFF_RAMP_SLIGHT_LEFT /* 21 */:
                                izg izgVarB = (izg) message.obj;
                                this.J.a(1);
                                defpackage.eyz eyzVar5 = this.i;
                                int iA2 = eyzVar5.a();
                                if (izgVarB.u() != iA2) {
                                    izgVarB = izgVarB.A().B(iA2);
                                }
                                eyzVar5.j = izgVarB;
                                B(eyzVar5.b(), false);
                                i6 = 1;
                                G(message.what);
                                return i6;
                            case androidx.car.app.navigation.model.Maneuver.TYPE_OFF_RAMP_SLIGHT_RIGHT /* 22 */:
                                B(this.i.b(), true);
                                i6 = 1;
                                G(message.what);
                                return i6;
                            case androidx.car.app.navigation.model.Maneuver.TYPE_OFF_RAMP_NORMAL_LEFT /* 23 */:
                                this.K = message.arg1 != 0;
                                M();
                                if (this.L && ak()) {
                                    Q(true);
                                    A(false);
                                }
                                i6 = 1;
                                G(message.what);
                                return i6;
                            case androidx.car.app.navigation.model.Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                                this.C = message.arg1 != 0;
                                i6 = 1;
                                G(message.what);
                                return i6;
                            case androidx.car.app.navigation.model.Maneuver.TYPE_FORK_LEFT /* 25 */:
                                K();
                                i6 = 1;
                                G(message.what);
                                return i6;
                            case androidx.car.app.navigation.model.Maneuver.TYPE_FORK_RIGHT /* 26 */:
                                K();
                                i6 = 1;
                                G(message.what);
                                return i6;
                            case androidx.car.app.navigation.model.Maneuver.TYPE_MERGE_LEFT /* 27 */:
                                int i17 = message.arg1;
                                int i18 = message.arg2;
                                java.util.List list3 = (java.util.List) message.obj;
                                this.J.a(1);
                                defpackage.eyz eyzVar6 = this.i;
                                ahvr.bM(i17 >= 0 && i17 <= i18 && i18 <= eyzVar6.a());
                                ahvr.bM(list3.size() == i18 - i17);
                                for (int i19 = i17; i19 < i18; i19++) {
                                    ((defpackage.eyx) eyzVar6.a.get(i19)).a.o((defpackage.eqt) list3.get(i19 - i17));
                                }
                                B(eyzVar6.b(), false);
                                i6 = 1;
                                G(message.what);
                                return i6;
                            case androidx.car.app.navigation.model.Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                                defpackage.exp expVar = (defpackage.exp) message.obj;
                                this.o = expVar;
                                defpackage.eys eysVar7 = this.x;
                                defpackage.erm ermVar6 = this.I.b;
                                eysVar7.c = expVar;
                                long j3 = eysVar7.c.b;
                                eysVar7.s();
                                i6 = 1;
                                G(message.what);
                                return i6;
                            case androidx.car.app.navigation.model.Maneuver.TYPE_MERGE_SIDE_UNSPECIFIED /* 29 */:
                                this.J.a(1);
                                L(false, false, false, true);
                                defpackage.eym eymVar2 = this.e;
                                defpackage.fag fagVar = this.k;
                                long id = java.lang.Thread.currentThread().getId();
                                long j4 = ((defpackage.exh) eymVar2).i;
                                ahvr.bZ(j4 == -1 || j4 == id, "Players that share the same LoadControl must share the same playback thread. See ExoPlayer.Builder.setPlaybackLooper(Looper).");
                                ((defpackage.exh) eymVar2).i = id;
                                j$.util.concurrent.ConcurrentHashMap concurrentHashMap = ((defpackage.exh) eymVar2).h;
                                defpackage.exg exgVar = (defpackage.exg) concurrentHashMap.get(fagVar);
                                if (exgVar == null) {
                                    concurrentHashMap.put(fagVar, new defpackage.exg());
                                } else {
                                    exgVar.a++;
                                }
                                defpackage.exg exgVar2 = (defpackage.exg) concurrentHashMap.get(fagVar);
                                ahvr.ci(exgVar2);
                                int iB3 = ((defpackage.exh) eymVar2).b(fagVar);
                                if (iB3 == -1) {
                                    iB3 = 13107200;
                                }
                                exgVar2.c = iB3;
                                exgVar2.b = false;
                                V(true != this.I.b.n() ? 2 : 4);
                                ab();
                                defpackage.eyz eyzVar7 = this.i;
                                ahvr.bY(!eyzVar7.h);
                                int i20 = 0;
                                while (true) {
                                    java.util.List list4 = eyzVar7.a;
                                    if (i20 >= list4.size()) {
                                        eyzVar7.h = true;
                                        this.f.f(2);
                                        i6 = 1;
                                        G(message.what);
                                        return i6;
                                    }
                                    defpackage.eyx eyxVar = (defpackage.eyx) list4.get(i20);
                                    eyzVar7.e(eyxVar);
                                    eyzVar7.f.add(eyxVar);
                                    i20++;
                                }
                                break;
                            case 30:
                                try {
                                    android.util.Pair pair = (android.util.Pair) message.obj;
                                    java.lang.Object obj2 = pair.first;
                                    defpackage.agze agzeVar3 = (defpackage.agze) pair.second;
                                    defpackage.ezi[] eziVarArr2 = this.a;
                                    int length = eziVarArr2.length;
                                    int i21 = 0;
                                    while (i21 < length) {
                                        defpackage.ezi eziVar4 = eziVarArr2[i21];
                                        if (eziVar4.b() != 2) {
                                            i4 = i5;
                                        } else {
                                            int i22 = eziVar4.c;
                                            i4 = i5;
                                            if (i22 == 5 || i22 == 3 || i22 == 1) {
                                                defpackage.ezf ezfVar2 = eziVar4.b;
                                                ahvr.ci(ezfVar2);
                                                ezfVar2.p(1, obj2);
                                            } else {
                                                eziVar4.a.p(1, obj2);
                                            }
                                        }
                                        i21++;
                                        i5 = i4;
                                    }
                                    int i23 = this.I.f;
                                    if (i23 == 3 || i23 == 2) {
                                        this.f.f(2);
                                    }
                                    if (agzeVar3 != null) {
                                        agzeVar3.g();
                                    }
                                    i6 = 1;
                                } catch (defpackage.exl e) {
                                    e = e;
                                    i = i5;
                                    r16 = 0;
                                    if (e.c == i6 && e.h == null) {
                                        defpackage.ezi[] eziVarArr3 = this.a;
                                        int i24 = e.e;
                                        eysVar2 = this.x;
                                        eziVar = eziVarArr3[i24];
                                        eyqVarF3 = eysVar2.d;
                                        while (true) {
                                            if (eyqVarF3 != null) {
                                                eyqVarF3 = eysVar2.f();
                                            } else if (!eziVar.u(eyqVarF3)) {
                                                eyqVarF3 = eyqVarF3.h;
                                            }
                                        }
                                        if (eyqVarF3 != null) {
                                            e = e.a(eyqVarF3.g.a);
                                        }
                                    }
                                    exlVar = e;
                                    i2 = exlVar.c;
                                    if (i2 != i6 && (ffuVar2 = exlVar.h) != null) {
                                        int i25 = exlVar.e;
                                        defpackage.eys eysVar8 = this.x;
                                        if (eysVar8.h(i25) != null && eysVar8.h(i25).g.a.equals(ffuVar2) && this.a[i25].s(eysVar8.h(i25))) {
                                            this.ab = i6;
                                            s();
                                            defpackage.eyq eyqVarH = eysVar8.h(i25);
                                            defpackage.eyq eyqVar4 = eysVar8.d;
                                            if (eyqVar4 != eyqVarH) {
                                                while (eyqVar4 != null) {
                                                    defpackage.eyq eyqVar5 = eyqVar4.h;
                                                    if (eyqVar5 != eyqVarH) {
                                                        eyqVar4 = eyqVar5;
                                                    }
                                                }
                                            }
                                            eysVar8.a(eyqVar4);
                                            if (this.I.f != i) {
                                                E();
                                                this.f.f(2);
                                            }
                                        } else if (i2 == i6) {
                                            exlVar2 = this.Y;
                                            if (exlVar2 != null) {
                                                exlVar2.addSuppressed(exlVar);
                                                exlVar = this.Y;
                                            }
                                            exlVar3 = exlVar;
                                            if (exlVar3.c == i6) {
                                                eysVar = this.x;
                                                if (eysVar.d != eysVar.g()) {
                                                    eyqVarF = eysVar.d;
                                                    while (true) {
                                                        if (eyqVarF != null) {
                                                            eyqVarF = eysVar.f();
                                                        } else if (!j$.util.Objects.equals(eyqVarF.g.a, exlVar3.h)) {
                                                            eyqVarF = eyqVarF.h;
                                                        }
                                                    }
                                                    while (!j$.util.Objects.equals(eysVar.d, eyqVarF)) {
                                                        eysVar.c();
                                                    }
                                                    defpackage.eyq eyqVar6 = eysVar.d;
                                                    ahvr.ci(eyqVar6);
                                                    G(message.what);
                                                    defpackage.eyr eyrVar = eyqVar6.g;
                                                    defpackage.ffu ffuVar4 = eyrVar.a;
                                                    long j5 = eyrVar.b;
                                                    this.I = q(ffuVar4, j5, eyrVar.d, j5, true, 0);
                                                }
                                            }
                                            if (exlVar3.i) {
                                                defpackage.etr.d("ExoPlayerImplInternal", "Playback error", exlVar3);
                                                Y(i6, r16);
                                                this.I = this.I.g(exlVar3);
                                            } else {
                                                defpackage.etr.d("ExoPlayerImplInternal", "Playback error", exlVar3);
                                                Y(i6, r16);
                                                this.I = this.I.g(exlVar3);
                                            }
                                        } else {
                                            exlVar2 = this.Y;
                                            if (exlVar2 != null) {
                                                exlVar2.addSuppressed(exlVar);
                                                exlVar = this.Y;
                                            }
                                            exlVar3 = exlVar;
                                            if (exlVar3.c == i6) {
                                                eysVar = this.x;
                                                if (eysVar.d != eysVar.g()) {
                                                    eyqVarF = eysVar.d;
                                                    while (true) {
                                                        if (eyqVarF != null) {
                                                            eyqVarF = eysVar.f();
                                                        } else if (!j$.util.Objects.equals(eyqVarF.g.a, exlVar3.h)) {
                                                            eyqVarF = eyqVarF.h;
                                                        }
                                                    }
                                                    while (!j$.util.Objects.equals(eysVar.d, eyqVarF)) {
                                                        eysVar.c();
                                                    }
                                                    defpackage.eyq eyqVar7 = eysVar.d;
                                                    ahvr.ci(eyqVar7);
                                                    G(message.what);
                                                    defpackage.eyr eyrVar2 = eyqVar7.g;
                                                    defpackage.ffu ffuVar5 = eyrVar2.a;
                                                    long j6 = eyrVar2.b;
                                                    this.I = q(ffuVar5, j6, eyrVar2.d, j6, true, 0);
                                                }
                                            }
                                            if (exlVar3.i) {
                                                defpackage.etr.d("ExoPlayerImplInternal", "Playback error", exlVar3);
                                                Y(i6, r16);
                                                this.I = this.I.g(exlVar3);
                                            } else {
                                                defpackage.etr.d("ExoPlayerImplInternal", "Playback error", exlVar3);
                                                Y(i6, r16);
                                                this.I = this.I.g(exlVar3);
                                            }
                                        }
                                    } else if (i2 == i6 || (ffuVar = exlVar.h) == null || (eyqVarF2 = (r3 = this.x).f()) == null) {
                                        exlVar2 = this.Y;
                                        if (exlVar2 != null) {
                                            exlVar2.addSuppressed(exlVar);
                                            exlVar = this.Y;
                                        }
                                        exlVar3 = exlVar;
                                        if (exlVar3.c == i6) {
                                            eysVar = this.x;
                                            if (eysVar.d != eysVar.g()) {
                                                eyqVarF = eysVar.d;
                                                while (true) {
                                                    if (eyqVarF != null) {
                                                        eyqVarF = eysVar.f();
                                                    } else if (!j$.util.Objects.equals(eyqVarF.g.a, exlVar3.h)) {
                                                        eyqVarF = eyqVarF.h;
                                                    }
                                                }
                                                while (!j$.util.Objects.equals(eysVar.d, eyqVarF)) {
                                                    eysVar.c();
                                                }
                                                defpackage.eyq eyqVar8 = eysVar.d;
                                                ahvr.ci(eyqVar8);
                                                G(message.what);
                                                defpackage.eyr eyrVar3 = eyqVar8.g;
                                                defpackage.ffu ffuVar6 = eyrVar3.a;
                                                long j7 = eyrVar3.b;
                                                this.I = q(ffuVar6, j7, eyrVar3.d, j7, true, 0);
                                            }
                                        }
                                        if (exlVar3.i || !(this.Y == null || (i3 = exlVar3.a) == 5004 || i3 == 5003)) {
                                            defpackage.etr.d("ExoPlayerImplInternal", "Playback error", exlVar3);
                                            Y(i6, r16);
                                            this.I = this.I.g(exlVar3);
                                        } else {
                                            defpackage.etr.g("ExoPlayerImplInternal", "Recoverable renderer error", exlVar3);
                                            if (this.Y == null) {
                                                this.Y = exlVar3;
                                            }
                                            defpackage.etk etkVar = this.f;
                                            etkVar.k(etkVar.i(25, exlVar3));
                                        }
                                    } else {
                                        defpackage.eyq eyqVar9 = eyqVarF2.h;
                                        while (true) {
                                            if (eyqVar9 == null) {
                                                exlVar2 = this.Y;
                                                if (exlVar2 != null) {
                                                    exlVar2.addSuppressed(exlVar);
                                                    exlVar = this.Y;
                                                }
                                                exlVar3 = exlVar;
                                                if (exlVar3.c == i6) {
                                                    eysVar = this.x;
                                                    if (eysVar.d != eysVar.g()) {
                                                        eyqVarF = eysVar.d;
                                                        while (true) {
                                                            if (eyqVarF != null) {
                                                                eyqVarF = eysVar.f();
                                                            } else if (!j$.util.Objects.equals(eyqVarF.g.a, exlVar3.h)) {
                                                                eyqVarF = eyqVarF.h;
                                                            }
                                                        }
                                                        while (!j$.util.Objects.equals(eysVar.d, eyqVarF)) {
                                                            eysVar.c();
                                                        }
                                                        defpackage.eyq eyqVar10 = eysVar.d;
                                                        ahvr.ci(eyqVar10);
                                                        G(message.what);
                                                        defpackage.eyr eyrVar4 = eyqVar10.g;
                                                        defpackage.ffu ffuVar7 = eyrVar4.a;
                                                        long j8 = eyrVar4.b;
                                                        this.I = q(ffuVar7, j8, eyrVar4.d, j8, true, 0);
                                                    }
                                                }
                                                if (exlVar3.i) {
                                                    defpackage.etr.d("ExoPlayerImplInternal", "Playback error", exlVar3);
                                                    Y(i6, r16);
                                                    this.I = this.I.g(exlVar3);
                                                } else {
                                                    defpackage.etr.d("ExoPlayerImplInternal", "Playback error", exlVar3);
                                                    Y(i6, r16);
                                                    this.I = this.I.g(exlVar3);
                                                }
                                            } else if (eyqVar9.g.a.equals(ffuVar)) {
                                                s();
                                                defpackage.eyq eyqVarF4 = r3.f();
                                                ahvr.ci(eyqVarF4);
                                                for (?? r17 = r16; r17 < this.a.length; r17++) {
                                                    if (r17 == exlVar.e || r3.i(r17) != eyqVarF4) {
                                                        try {
                                                            t(r17);
                                                        } catch (defpackage.exl e2) {
                                                            defpackage.etr.d("ExoPlayerImplInternal", "Failed to disable renderer.", e2);
                                                        }
                                                        this.a[r17].i();
                                                        break;
                                                    }
                                                }
                                                this.x.a(eyqVarF4);
                                                if (this.I.f != 4) {
                                                    E();
                                                    this.f.f(2);
                                                }
                                            } else {
                                                eyqVar9 = eyqVar9.h;
                                            }
                                        }
                                    }
                                }
                                G(message.what);
                                return i6;
                            case 31:
                                defpackage.epu epuVar = (defpackage.epu) message.obj;
                                int i26 = message.arg1;
                                defpackage.fim fimVar3 = this.c;
                                if (!((defpackage.fih) fimVar3).f.equals(epuVar)) {
                                    ((defpackage.fih) fimVar3).f = epuVar;
                                    ((defpackage.fih) fimVar3).e();
                                }
                                defpackage.esc escVar2 = this.B;
                                defpackage.epu epuVar2 = i26 != 0 ? epuVar : null;
                                if (!j$.util.Objects.equals(escVar2.b, epuVar2)) {
                                    escVar2.b = epuVar2;
                                    int i27 = epuVar2 == null ? 0 : epuVar2.c != 1 ? 2 : 1;
                                    escVar2.c = i27;
                                    ahvr.bN(i27 == 1 || i27 == 0, "Automatic handling of audio focus is only available for USAGE_MEDIA and USAGE_GAME.");
                                }
                                ab();
                                i6 = 1;
                                G(message.what);
                                return i6;
                            case 32:
                                W(((java.lang.Float) message.obj).floatValue());
                                i6 = 1;
                                G(message.what);
                                return i6;
                            case androidx.car.app.navigation.model.Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CW_WITH_ANGLE /* 33 */:
                                int i28 = message.arg1;
                                defpackage.eza ezaVar5 = this.I;
                                ad(ezaVar5.m, i28, ezaVar5.o, ezaVar5.n);
                                i6 = 1;
                                G(message.what);
                                return i6;
                            case androidx.car.app.navigation.model.Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CCW /* 34 */:
                                W(this.ac);
                                i6 = 1;
                                G(message.what);
                                return i6;
                            case androidx.car.app.navigation.model.Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CCW_WITH_ANGLE /* 35 */:
                                defpackage.fjx fjxVar = (defpackage.fjx) message.obj;
                                for (defpackage.ezi eziVar5 : this.a) {
                                    if (eziVar5.b() == 2 || eziVar5.b() == 4) {
                                        eziVar5.a.p(7, fjxVar);
                                        defpackage.ezf ezfVar3 = eziVar5.b;
                                        if (ezfVar3 != null) {
                                            ezfVar3.p(7, fjxVar);
                                        }
                                    }
                                }
                                i6 = 1;
                                G(message.what);
                                return i6;
                            case androidx.car.app.navigation.model.Maneuver.TYPE_STRAIGHT /* 36 */:
                                boolean zBooleanValue = ((java.lang.Boolean) message.obj).booleanValue();
                                if (!zBooleanValue) {
                                    if (this.G != null && this.m && !this.f.c(37)) {
                                        this.H++;
                                    }
                                    if (this.H > 0) {
                                        this.z.d(new defpackage.drn((java.lang.Object) this, 8));
                                    }
                                    this.H = 0;
                                    this.m = false;
                                    this.f.b(37);
                                    defpackage.eyi eyiVar = this.G;
                                    if (eyiVar != null) {
                                        R(eyiVar);
                                        this.G = null;
                                        this.m = false;
                                    }
                                }
                                this.F = zBooleanValue;
                                r();
                                i6 = 1;
                                G(message.what);
                                return i6;
                            case androidx.car.app.navigation.model.Maneuver.TYPE_FERRY_BOAT /* 37 */:
                                this.m = false;
                                defpackage.eyi eyiVar2 = this.G;
                                if (eyiVar2 != null) {
                                    R(eyiVar2);
                                    this.G = null;
                                }
                                i6 = 1;
                                G(message.what);
                                return i6;
                            case androidx.car.app.navigation.model.Maneuver.TYPE_FERRY_TRAIN /* 38 */:
                                this.E = (defpackage.ezj) message.obj;
                                r();
                                i6 = 1;
                                G(message.what);
                                return i6;
                            case androidx.car.app.navigation.model.Maneuver.TYPE_DESTINATION /* 39 */:
                                rai raiVar = (rai) message.obj;
                                for (defpackage.ezi eziVar6 : this.a) {
                                    if (eziVar6.b() == 4) {
                                        eziVar6.a.p(23, raiVar);
                                        defpackage.ezf ezfVar4 = eziVar6.b;
                                        if (ezfVar4 != null) {
                                            ezfVar4.p(23, raiVar);
                                        }
                                    }
                                }
                                i6 = 1;
                                G(message.what);
                                return i6;
                            case androidx.car.app.navigation.model.Maneuver.TYPE_DESTINATION_STRAIGHT /* 40 */:
                                int i29 = message.arg1;
                                for (defpackage.ezi eziVar7 : this.a) {
                                    if (eziVar7.b() == 1 || eziVar7.b() == 2) {
                                        defpackage.ezf ezfVar5 = eziVar7.a;
                                        java.lang.Integer numValueOf = java.lang.Integer.valueOf(i29);
                                        ezfVar5.p(10, numValueOf);
                                        defpackage.ezf ezfVar6 = eziVar7.b;
                                        if (ezfVar6 != null) {
                                            ezfVar6.p(10, numValueOf);
                                        }
                                    }
                                }
                                i6 = 1;
                                G(message.what);
                                return i6;
                            default:
                                return false;
                        }
                    } catch (defpackage.exl e3) {
                        e = e3;
                    }
                } catch (defpackage.era e4) {
                    e = e4;
                    z(e, e.b == 1 ? true != e.a ? 3003 : 3001 : 1000);
                } catch (defpackage.evs e5) {
                    e = e5;
                    z(e, e.a);
                } catch (defpackage.exl e6) {
                    e = e6;
                    if (e.c == i6) {
                        defpackage.ezi[] eziVarArr4 = this.a;
                        int i210 = e.e;
                        eysVar2 = this.x;
                        eziVar = eziVarArr4[i210];
                        eyqVarF3 = eysVar2.d;
                        while (true) {
                            if (eyqVarF3 != null) {
                                eyqVarF3 = eysVar2.f();
                            } else if (!eziVar.u(eyqVarF3)) {
                                eyqVarF3 = eyqVarF3.h;
                            }
                        }
                        if (eyqVarF3 != null) {
                            e = e.a(eyqVarF3.g.a);
                        }
                    }
                    exlVar = e;
                    i2 = exlVar.c;
                    if (i2 != i6) {
                        if (i2 == i6) {
                            exlVar2 = this.Y;
                            if (exlVar2 != null) {
                                exlVar2.addSuppressed(exlVar);
                                exlVar = this.Y;
                            }
                            exlVar3 = exlVar;
                            if (exlVar3.c == i6) {
                                eysVar = this.x;
                                if (eysVar.d != eysVar.g()) {
                                    eyqVarF = eysVar.d;
                                    while (true) {
                                        if (eyqVarF != null) {
                                            eyqVarF = eysVar.f();
                                        } else if (!j$.util.Objects.equals(eyqVarF.g.a, exlVar3.h)) {
                                            eyqVarF = eyqVarF.h;
                                        }
                                    }
                                    while (!j$.util.Objects.equals(eysVar.d, eyqVarF)) {
                                        eysVar.c();
                                    }
                                    defpackage.eyq eyqVar11 = eysVar.d;
                                    ahvr.ci(eyqVar11);
                                    G(message.what);
                                    defpackage.eyr eyrVar5 = eyqVar11.g;
                                    defpackage.ffu ffuVar8 = eyrVar5.a;
                                    long j9 = eyrVar5.b;
                                    this.I = q(ffuVar8, j9, eyrVar5.d, j9, true, 0);
                                }
                            }
                            if (exlVar3.i) {
                                defpackage.etr.d("ExoPlayerImplInternal", "Playback error", exlVar3);
                                Y(i6, r16);
                                this.I = this.I.g(exlVar3);
                            } else {
                                defpackage.etr.d("ExoPlayerImplInternal", "Playback error", exlVar3);
                                Y(i6, r16);
                                this.I = this.I.g(exlVar3);
                            }
                        } else {
                            exlVar2 = this.Y;
                            if (exlVar2 != null) {
                                exlVar2.addSuppressed(exlVar);
                                exlVar = this.Y;
                            }
                            exlVar3 = exlVar;
                            if (exlVar3.c == i6) {
                                eysVar = this.x;
                                if (eysVar.d != eysVar.g()) {
                                    eyqVarF = eysVar.d;
                                    while (true) {
                                        if (eyqVarF != null) {
                                            eyqVarF = eysVar.f();
                                        } else if (!j$.util.Objects.equals(eyqVarF.g.a, exlVar3.h)) {
                                            eyqVarF = eyqVarF.h;
                                        }
                                    }
                                    while (!j$.util.Objects.equals(eysVar.d, eyqVarF)) {
                                        eysVar.c();
                                    }
                                    defpackage.eyq eyqVar12 = eysVar.d;
                                    ahvr.ci(eyqVar12);
                                    G(message.what);
                                    defpackage.eyr eyrVar6 = eyqVar12.g;
                                    defpackage.ffu ffuVar9 = eyrVar6.a;
                                    long j10 = eyrVar6.b;
                                    this.I = q(ffuVar9, j10, eyrVar6.d, j10, true, 0);
                                }
                            }
                            if (exlVar3.i) {
                                defpackage.etr.d("ExoPlayerImplInternal", "Playback error", exlVar3);
                                Y(i6, r16);
                                this.I = this.I.g(exlVar3);
                            } else {
                                defpackage.etr.d("ExoPlayerImplInternal", "Playback error", exlVar3);
                                Y(i6, r16);
                                this.I = this.I.g(exlVar3);
                            }
                        }
                    } else if (i2 == i6) {
                        exlVar2 = this.Y;
                        if (exlVar2 != null) {
                            exlVar2.addSuppressed(exlVar);
                            exlVar = this.Y;
                        }
                        exlVar3 = exlVar;
                        if (exlVar3.c == i6) {
                            eysVar = this.x;
                            if (eysVar.d != eysVar.g()) {
                                eyqVarF = eysVar.d;
                                while (true) {
                                    if (eyqVarF != null) {
                                        eyqVarF = eysVar.f();
                                    } else if (!j$.util.Objects.equals(eyqVarF.g.a, exlVar3.h)) {
                                        eyqVarF = eyqVarF.h;
                                    }
                                }
                                while (!j$.util.Objects.equals(eysVar.d, eyqVarF)) {
                                    eysVar.c();
                                }
                                defpackage.eyq eyqVar13 = eysVar.d;
                                ahvr.ci(eyqVar13);
                                G(message.what);
                                defpackage.eyr eyrVar7 = eyqVar13.g;
                                defpackage.ffu ffuVar10 = eyrVar7.a;
                                long j11 = eyrVar7.b;
                                this.I = q(ffuVar10, j11, eyrVar7.d, j11, true, 0);
                            }
                        }
                        if (exlVar3.i) {
                            defpackage.etr.d("ExoPlayerImplInternal", "Playback error", exlVar3);
                            Y(i6, r16);
                            this.I = this.I.g(exlVar3);
                        } else {
                            defpackage.etr.d("ExoPlayerImplInternal", "Playback error", exlVar3);
                            Y(i6, r16);
                            this.I = this.I.g(exlVar3);
                        }
                    } else {
                        exlVar2 = this.Y;
                        if (exlVar2 != null) {
                            exlVar2.addSuppressed(exlVar);
                            exlVar = this.Y;
                        }
                        exlVar3 = exlVar;
                        if (exlVar3.c == i6) {
                            eysVar = this.x;
                            if (eysVar.d != eysVar.g()) {
                                eyqVarF = eysVar.d;
                                while (true) {
                                    if (eyqVarF != null) {
                                        eyqVarF = eysVar.f();
                                    } else if (!j$.util.Objects.equals(eyqVarF.g.a, exlVar3.h)) {
                                        eyqVarF = eyqVarF.h;
                                    }
                                }
                                while (!j$.util.Objects.equals(eysVar.d, eyqVarF)) {
                                    eysVar.c();
                                }
                                defpackage.eyq eyqVar14 = eysVar.d;
                                ahvr.ci(eyqVar14);
                                G(message.what);
                                defpackage.eyr eyrVar8 = eyqVar14.g;
                                defpackage.ffu ffuVar11 = eyrVar8.a;
                                long j12 = eyrVar8.b;
                                this.I = q(ffuVar11, j12, eyrVar8.d, j12, true, 0);
                            }
                        }
                        if (exlVar3.i) {
                            defpackage.etr.d("ExoPlayerImplInternal", "Playback error", exlVar3);
                            Y(i6, r16);
                            this.I = this.I.g(exlVar3);
                        } else {
                            defpackage.etr.d("ExoPlayerImplInternal", "Playback error", exlVar3);
                            Y(i6, r16);
                            this.I = this.I.g(exlVar3);
                        }
                    }
                } catch (defpackage.fcr e7) {
                    e = e7;
                    z(e, e.a);
                } catch (defpackage.fex e8) {
                    e = e8;
                    z(e, 1002);
                } catch (java.io.IOException e9) {
                    e = e9;
                    z(e, 2000);
                } catch (java.lang.RuntimeException e10) {
                    e = e10;
                    defpackage.exl exlVar4 = new defpackage.exl(2, e, ((e instanceof java.lang.IllegalStateException) || (e instanceof java.lang.IllegalArgumentException)) ? 1004 : 1000, null, -1, null, 4, null, false);
                    defpackage.etr.d("ExoPlayerImplInternal", "Playback error", exlVar4);
                    Y(true, r15);
                    this.I = this.I.g(exlVar4);
                }
            } catch (defpackage.exl e11) {
                e = e11;
                i = 4;
                r16 = 0;
            }
        } catch (defpackage.era e12) {
            e = e12;
            i6 = 1;
        } catch (defpackage.evs e13) {
            e = e13;
            i6 = 1;
        } catch (defpackage.fcr e14) {
            e = e14;
            i6 = 1;
        } catch (defpackage.fex e15) {
            e = e15;
            i6 = 1;
        } catch (java.io.IOException e16) {
            e = e16;
            i6 = 1;
        } catch (java.lang.RuntimeException e17) {
            e = e17;
            r15 = 0;
            i6 = 1;
        }
    }
}
