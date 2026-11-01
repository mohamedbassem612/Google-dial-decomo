package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class fue implements defpackage.ftx {
    private long e;
    private java.lang.String g;
    private defpackage.fmk h;
    private defpackage.fud i;
    private boolean j;
    private boolean k;
    private defpackage.eqg l;
    private boolean o;
    private final defpackage.jyn q;
    private final java.lang.String a = "video/mp2t";
    private final boolean[] f = new boolean[3];
    private final defpackage.fum b = new defpackage.fum(7);
    private final defpackage.fum c = new defpackage.fum(8);
    private final defpackage.fum d = new defpackage.fum(6);
    private long n = -9223372036854775807L;
    private int m = -1;
    private final defpackage.etx p = new defpackage.etx();

    public fue(defpackage.jyn jynVar) {
        this.q = jynVar;
    }

    private final void g() {
        ahvr.ci(this.h);
        java.lang.String str = eum.a;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    private final void h(long j, int i, int i2, long j2) {
        int i3;
        boolean z = true;
        if (this.l != null) {
            boolean z2 = this.i.b;
        } else {
            defpackage.fum fumVar = this.b;
            fumVar.d(i2);
            defpackage.fum fumVar2 = this.c;
            fumVar2.d(i2);
            if (this.l == null) {
                if (fumVar.a && fumVar2.a) {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    arrayList.add(java.util.Arrays.copyOf(fumVar.b, fumVar.c));
                    arrayList.add(java.util.Arrays.copyOf(fumVar2.b, fumVar2.c));
                    defpackage.evb evbVarG = defpackage.evc.g(fumVar.b, 4, fumVar.c);
                    absu absuVarK = defpackage.evc.k(fumVar2.b, fumVar2.c);
                    java.lang.String strF = defpackage.ete.f(evbVarG.a, evbVarG.b, evbVarG.c);
                    defpackage.eqf eqfVar = new defpackage.eqf();
                    eqfVar.a = this.g;
                    eqfVar.a(this.a);
                    eqfVar.c("video/avc");
                    eqfVar.j = strF;
                    eqfVar.t = evbVarG.e;
                    eqfVar.u = evbVarG.f;
                    eqfVar.D = new defpackage.epy(evbVarG.j, evbVarG.k, evbVarG.l, null, evbVarG.h + 8, evbVarG.i + 8);
                    eqfVar.A = evbVarG.g;
                    eqfVar.q = arrayList;
                    int i4 = evbVarG.m;
                    eqfVar.p = i4;
                    eqfVar.C = this.m;
                    this.l = new defpackage.eqg(eqfVar);
                    this.k = true;
                    this.q.v(i4);
                    this.i.a(evbVarG);
                    this.i.c(absuVarK);
                    fumVar.b();
                    fumVar2.b();
                }
            } else if (fumVar.a) {
                defpackage.evb evbVarG2 = defpackage.evc.g(fumVar.b, 4, fumVar.c);
                this.q.v(evbVarG2.m);
                this.i.a(evbVarG2);
                fumVar.b();
            } else if (fumVar2.a) {
                this.i.c(defpackage.evc.k(fumVar2.b, fumVar2.c));
                fumVar2.b();
            }
        }
        defpackage.fum fumVar3 = this.d;
        if (fumVar3.d(i2)) {
            int iE = defpackage.evc.e(fumVar3.b, fumVar3.c);
            int iD = defpackage.evc.d(fumVar3.b, 4, iE);
            if (iD != -1 && iD != (i3 = this.m) && (iD != 0 || i3 != -1)) {
                this.m = iD;
                defpackage.eqg eqgVar = this.l;
                if (eqgVar != null) {
                    defpackage.eqf eqfVar2 = new defpackage.eqf(eqgVar);
                    eqfVar2.C = iD;
                    this.l = new defpackage.eqg(eqfVar2);
                    this.k = true;
                }
            }
            defpackage.etx etxVar = this.p;
            etxVar.O(fumVar3.b, iE);
            etxVar.Q(4);
            this.q.s(j2, etxVar);
        }
        defpackage.fud fudVar = this.i;
        boolean z3 = this.j;
        if (fudVar.d == 9) {
            if (z3 && fudVar.h) {
                long j3 = fudVar.e;
                int i5 = i + ((int) (j - j3));
                long j4 = fudVar.j;
                if (j4 != -9223372036854775807L) {
                    long j5 = fudVar.i;
                    if (j3 != j5) {
                        fudVar.a.d(j4, fudVar.k ? 1 : 0, (int) (j3 - j5), i5, null);
                    }
                }
            }
            fudVar.i = fudVar.e;
            fudVar.j = fudVar.g;
            fudVar.k = false;
            fudVar.h = true;
        }
        boolean z4 = fudVar.l;
        boolean z5 = fudVar.k;
        int i6 = fudVar.d;
        if (i6 != 5 && (!z4 || i6 != 1)) {
            z = false;
        }
        boolean z6 = z5 | z;
        fudVar.k = z6;
        fudVar.d = 24;
        if (z6) {
            this.o = false;
        }
    }

    private final void i(byte[] bArr, int i, int i2) {
        if (this.l != null) {
            boolean z = this.i.b;
        } else {
            this.b.a(bArr, i, i2);
            this.c.a(bArr, i, i2);
        }
        this.d.a(bArr, i, i2);
        boolean z2 = this.i.f;
    }

    private final void j(long j, int i, long j2) {
        if (this.k && i > 0 && i <= 5) {
            defpackage.fmk fmkVar = this.h;
            defpackage.eqg eqgVar = this.l;
            ahvr.ci(eqgVar);
            fmkVar.p(eqgVar);
            this.j = true;
            this.k = false;
        }
        if (this.l != null) {
            boolean z = this.i.b;
        } else {
            this.b.c(i);
            this.c.c(i);
        }
        this.d.c(i);
        defpackage.fud fudVar = this.i;
        boolean z2 = this.o;
        fudVar.d = i;
        fudVar.g = j2;
        fudVar.e = j;
        fudVar.l = z2;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0037  */
    @Override // defpackage.ftx
    public final void a(defpackage.etx etxVar) {
        int i;
        int i2;
        g();
        int i3 = etxVar.c;
        int i4 = etxVar.d;
        byte[] bArr = etxVar.b;
        this.e += (long) etxVar.d();
        this.h.b(etxVar, etxVar.d());
        while (true) {
            int iB = defpackage.evc.b(bArr, i3, i4, this.f);
            if (iB == i4) {
                i(bArr, i3, i4);
                return;
            }
            int i5 = bArr[iB + 3] & 31;
            if (iB > 0) {
                int i6 = iB - 1;
                if (bArr[i6] == 0) {
                    i2 = 4;
                    i = i6;
                } else {
                    i = iB;
                    i2 = 3;
                }
            } else {
                i = iB;
                i2 = 3;
            }
            int i7 = i - i3;
            if (i7 > 0) {
                i(bArr, i3, i);
            }
            int i8 = i4 - i;
            long j = this.e - ((long) i8);
            h(j, i8, i7 < 0 ? -i7 : 0, this.n);
            j(j, i5, this.n);
            i3 = i + i2;
        }
    }

    @Override // defpackage.ftx
    public final void b(defpackage.fll fllVar, defpackage.fvb fvbVar) {
        fvbVar.c();
        this.g = fvbVar.b();
        this.h = fllVar.r(fvbVar.a(), 2);
        this.i = new defpackage.fud(this.h);
        this.q.t(fllVar, fvbVar);
    }

    @Override // defpackage.ftx
    public final void c() {
        g();
        this.q.u();
        h(this.e, 0, 0, this.n);
        if (!this.j && this.k) {
            defpackage.fmk fmkVar = this.h;
            defpackage.eqg eqgVar = this.l;
            ahvr.ci(eqgVar);
            fmkVar.p(eqgVar);
            this.j = true;
            this.k = false;
        }
        j(this.e, 9, this.n);
        h(this.e, 0, 0, this.n);
    }

    @Override // defpackage.ftx
    public final void e(long j, int i) {
        this.n = j;
        this.o |= (i & 2) != 0;
    }

    @Override // defpackage.ftx
    public final void f() {
        this.e = 0L;
        this.o = false;
        this.n = -9223372036854775807L;
        defpackage.evc.i(this.f);
        this.b.b();
        this.c.b();
        this.d.b();
        this.q.r();
        defpackage.fud fudVar = this.i;
        if (fudVar != null) {
            fudVar.b();
        }
    }

    @Override // defpackage.ftx
    public final /* synthetic */ void d() {
    }
}
