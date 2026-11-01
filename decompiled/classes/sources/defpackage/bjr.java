package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class bjr extends defpackage.cmv implements defpackage.dbd, defpackage.dat, defpackage.ddc {
    public java.lang.String a;
    public defpackage.dkz b;
    public defpackage.dnx c;
    public int d;
    public boolean e;
    public int f;
    public int g;
    public defpackage.cqi h = null;
    public defpackage.aonj i;
    public bjq j;
    public defpackage.gat k;
    private java.util.Map l;
    private defpackage.bjc m;

    public bjr(java.lang.String str, defpackage.dkz dkzVar, defpackage.gat gatVar, defpackage.dnx dnxVar, int i, boolean z, int i2, int i3) {
        this.a = str;
        this.b = dkzVar;
        this.k = gatVar;
        this.c = dnxVar;
        this.d = i;
        this.e = z;
        this.f = i2;
        this.g = i3;
    }

    private final defpackage.bjc k(defpackage.cxf cxfVar) {
        defpackage.bjc bjcVarN = n();
        bjcVarN.e(cxfVar);
        return bjcVarN;
    }

    private final defpackage.bjc n() {
        defpackage.bjc bjcVar;
        bjq bjqVar = this.j;
        if (bjqVar != null) {
            if (true != bjqVar.b) {
                bjqVar = null;
            }
            if (bjqVar != null && (bjcVar = bjqVar.c) != null) {
                return bjcVar;
            }
        }
        return d();
    }

    @Override // defpackage.cmv
    public final boolean cO() {
        return false;
    }

    @Override // defpackage.ddc
    public final void cQ(defpackage.diq diqVar) {
        defpackage.aonj bjpVar = this.i;
        if (bjpVar == null) {
            bjpVar = new defpackage.bjp(this, 0);
            this.i = bjpVar;
        }
        defpackage.dji djiVar = new defpackage.dji(this.a);
        defpackage.dip dipVar = defpackage.din.D;
        java.util.List listSingletonList = java.util.Collections.singletonList(djiVar);
        defpackage.aooh.e(listSingletonList, "singletonList(...)");
        diqVar.a(dipVar, listSingletonList);
        bjq bjqVar = this.j;
        if (bjqVar != null) {
            diqVar.a(defpackage.din.F, java.lang.Boolean.valueOf(bjqVar.b));
            diqVar.a(defpackage.din.E, new defpackage.dji(bjqVar.a));
        }
        diqVar.a(defpackage.did.l, new defpackage.dhr(null, new defpackage.bjp(this, 2)));
        diqVar.a(defpackage.did.m, new defpackage.dhr(null, new defpackage.bjp(this, 3)));
        diqVar.a(defpackage.did.n, new defpackage.dhr(null, new defpackage.ml(this, 20)));
        diqVar.a(defpackage.did.a, new defpackage.dhr(null, bjpVar));
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00ce A[Catch: all -> 0x0190, TryCatch #0 {all -> 0x0190, blocks: (B:3:0x0007, B:5:0x0019, B:7:0x0024, B:9:0x002c, B:11:0x0030, B:13:0x0034, B:15:0x003a, B:17:0x003e, B:48:0x0122, B:50:0x0126, B:51:0x0129, B:53:0x012d, B:54:0x0130, B:56:0x0134, B:58:0x0140, B:59:0x0147, B:60:0x0169, B:62:0x017d, B:63:0x0180, B:20:0x004c, B:22:0x0056, B:24:0x0060, B:26:0x006b, B:28:0x0071, B:30:0x0075, B:31:0x0078, B:33:0x00b1, B:35:0x00bd, B:38:0x00c8, B:39:0x00ce, B:41:0x0105, B:43:0x0111, B:47:0x011e), top: B:69:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x011b  */
    @Override // defpackage.dbd
    public final defpackage.cyf cX(defpackage.cyi cyiVar, defpackage.cyd cydVar, long j) {
        long j2;
        boolean z;
        defpackage.dkc dkcVar;
        android.os.Trace.beginSection("TextStringSimpleNode::measure");
        try {
            defpackage.bjc bjcVarK = k(cyiVar);
            defpackage.dpq dpqVarP = cyiVar.p();
            bjcVarK.d(3L);
            boolean z2 = true;
            long jB = bjcVarK.g > 1 ? bjcVarK.b(j, dpqVarP, bjcVarK.b) : j;
            defpackage.djb djbVar = bjcVarK.o;
            if (djbVar == null || (dkcVar = bjcVarK.k) == null || bjcVarK.n || dkcVar.c() || dpqVarP != bjcVarK.l) {
                j2 = 4294967295L;
                defpackage.djb djbVarF = bjcVarK.f(jB, dpqVarP);
                bjcVarK.n = false;
                bjcVarK.m = jB;
                long jD = defpackage.dpe.d(jB, (((long) java.lang.Math.round((float) java.lang.Math.ceil(djbVarF.e()))) << 32) | (((long) java.lang.Math.round((float) java.lang.Math.ceil(djbVarF.d))) & 4294967295L));
                bjcVarK.j = jD;
                if (bjcVarK.d != 3 || (((int) (jD >> 32)) >= djbVarF.e() && ((int) (jD & 4294967295L)) >= djbVarF.d)) {
                    z = false;
                } else {
                    z = true;
                }
                bjcVarK.i = z;
                bjcVarK.o = djbVarF;
            } else {
                long j3 = bjcVarK.m;
                if (jB == j3) {
                    z2 = false;
                    j2 = 4294967295L;
                } else if (defpackage.dpd.b(jB) != defpackage.dpd.b(j3) || defpackage.dpd.d(jB) != defpackage.dpd.d(j3) || defpackage.dpd.a(jB) < djbVar.d || djbVar.i()) {
                    j2 = 4294967295L;
                    defpackage.djb djbVarF2 = bjcVarK.f(jB, dpqVarP);
                    bjcVarK.n = false;
                    bjcVarK.m = jB;
                    long jD2 = defpackage.dpe.d(jB, (((long) java.lang.Math.round((float) java.lang.Math.ceil(djbVarF2.e()))) << 32) | (((long) java.lang.Math.round((float) java.lang.Math.ceil(djbVarF2.d))) & 4294967295L));
                    bjcVarK.j = jD2;
                    if (bjcVarK.d != 3) {
                        z = false;
                    } else {
                        z = false;
                    }
                    bjcVarK.i = z;
                    bjcVarK.o = djbVarF2;
                } else {
                    defpackage.djb djbVar2 = bjcVarK.o;
                    if (djbVar2 == null) {
                        defpackage.aooh.g();
                    }
                    j2 = 4294967295L;
                    long jD3 = defpackage.dpe.d(jB, (((long) java.lang.Math.round((float) java.lang.Math.ceil(java.lang.Math.min(djbVar2.a.a(), djbVar2.e())))) << 32) | (((long) java.lang.Math.round((float) java.lang.Math.ceil(djbVar2.d))) & 4294967295L));
                    bjcVarK.j = jD3;
                    if (bjcVarK.d == 3 || (((int) (jD3 >> 32)) >= djbVar2.e() && ((int) (jD3 & 4294967295L)) >= djbVar2.d)) {
                        z2 = false;
                    }
                    bjcVarK.i = z2;
                    bjcVarK.m = jB;
                    z2 = false;
                }
            }
            defpackage.dkc dkcVar2 = bjcVarK.k;
            if (dkcVar2 != null) {
                dkcVar2.c();
            }
            defpackage.djb djbVar3 = bjcVarK.o;
            if (djbVar3 == null) {
                defpackage.aooh.g();
            }
            long j4 = bjcVarK.j;
            if (z2) {
                defpackage.cfo.B(this, 2).am();
                java.util.Map map = this.l;
                if (map == null) {
                    map = new java.util.HashMap(2);
                    this.l = map;
                }
                map.put(defpackage.cwn.a, java.lang.Integer.valueOf(java.lang.Math.round(djbVar3.b(0))));
                map.put(defpackage.cwn.b, java.lang.Integer.valueOf(java.lang.Math.round(djbVar3.a())));
            }
            int i = (int) (j4 & j2);
            int i2 = (int) (j4 >> 32);
            defpackage.czc czcVarV = cydVar.v(defpackage.dpe.k(i2, i2, i, i));
            java.util.Map map2 = this.l;
            if (map2 == null) {
                defpackage.aooh.g();
            }
            return cyiVar.du(i2, i, map2, new defpackage.bjp(czcVarV, 4));
        } finally {
            android.os.Trace.endSection();
        }
    }

    public final defpackage.bjc d() {
        defpackage.dkz dkzVar = this.b;
        defpackage.bjc bjcVar = this.m;
        if (bjcVar == null) {
            bjcVar = new defpackage.bjc(this.a, dkzVar, this.k, this.c, this.d, this.e, this.f, this.g);
            this.m = bjcVar;
        }
        if (bjcVar == null) {
            defpackage.aooh.g();
        }
        return bjcVar;
    }

    @Override // defpackage.dbd
    public final int e(defpackage.cxf cxfVar, defpackage.cxe cxeVar, int i) {
        return k(cxfVar).a(i, cxfVar.p());
    }

    @Override // defpackage.dbd
    public final int f(defpackage.cxf cxfVar, defpackage.cxe cxeVar, int i) {
        return java.lang.Math.round((float) java.lang.Math.ceil(k(cxfVar).c(cxfVar.p()).a()));
    }

    public final void g() {
        this.j = null;
    }

    public final void h() {
        defpackage.cfo.A(this).I();
        defpackage.cfo.A(this).H();
        defpackage.cfo.w(this);
    }

    @Override // defpackage.dbd
    public final int i(defpackage.cxf cxfVar, defpackage.cxe cxeVar, int i) {
        return k(cxfVar).a(i, cxfVar.p());
    }

    @Override // defpackage.dbd
    public final int j(defpackage.cxf cxfVar, defpackage.cxe cxeVar, int i) {
        return java.lang.Math.round((float) java.lang.Math.ceil(k(cxfVar).c(cxfVar.p()).b()));
    }

    @Override // defpackage.dat
    public final void o(defpackage.dbm dbmVar) {
        if (this.D) {
            defpackage.bjc bjcVarN = n();
            defpackage.djb djbVar = bjcVarN.o;
            if (djbVar == null) {
                avo.a("Internal Error: ParagraphLayoutCache could not provide a Paragraph during the draw phase. Please report this bug on the official Issue Tracker with the following diagnostic information: (layoutCache=" + this.m + ", textSubstitution=" + this.j + ')');
                throw new defpackage.aoiq();
            }
            defpackage.cqf cqfVarB = dbmVar.q().b();
            boolean z = bjcVarN.i;
            if (z) {
                long j = bjcVarN.j;
                cqfVarB.g();
                cqfVarB.a(0.0f, 0.0f, (int) (j >> 32), (int) (j & 4294967295L), 1);
            }
            try {
                defpackage.dkz dkzVar = this.b;
                defpackage.dou douVarT = dkzVar.t();
                if (douVarT == null) {
                    douVarT = defpackage.dou.a;
                }
                defpackage.dou douVar = douVarT;
                defpackage.crc crcVarK = dkzVar.k();
                if (crcVarK == null) {
                    crcVarK = defpackage.crc.a;
                }
                defpackage.crc crcVar = crcVarK;
                defpackage.den denVarA = dkzVar.A();
                if (denVarA == null) {
                    denVarA = defpackage.csl.a;
                }
                defpackage.den denVar = denVarA;
                defpackage.cqd cqdVarJ = dkzVar.j();
                if (cqdVarJ != null) {
                    djbVar.k(cqfVarB, cqdVarJ, dkzVar.a(), crcVar, douVar, denVar);
                } else {
                    float[] fArr = defpackage.crp.a;
                    long jN = defpackage.cfd.N(0.0f, 0.0f, 0.0f, 0.0f, defpackage.crp.u);
                    if (jN == 16) {
                        jN = dkzVar.f() != 16 ? dkzVar.f() : -72057594037927936L;
                    }
                    djbVar.j(cqfVarB, jN, crcVar, douVar, denVar);
                }
            } finally {
                if (z) {
                    cqfVarB.e();
                }
            }
        }
    }

    @Override // defpackage.ddc
    public final /* synthetic */ boolean w() {
        return false;
    }

    @Override // defpackage.ddc
    public final /* synthetic */ boolean x() {
        return false;
    }

    @Override // defpackage.ddc
    public final /* synthetic */ boolean y() {
        return true;
    }

    @Override // defpackage.dat
    public final /* synthetic */ void m() {
    }
}
