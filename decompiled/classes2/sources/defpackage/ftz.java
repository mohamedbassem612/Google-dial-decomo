package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ftz implements defpackage.ftx {
    private static final double[] a = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};
    private java.lang.String b;
    private defpackage.fmk c;
    private final java.lang.String d;
    private final defpackage.etx e;
    private final defpackage.fum f;
    private final boolean[] g = new boolean[4];
    private final defpackage.fty h = new defpackage.fty();
    private long i;
    private boolean j;
    private boolean k;
    private long l;
    private long m;
    private long n;
    private long o;
    private boolean p;
    private boolean q;
    private final defpackage.jkq r;

    public ftz(defpackage.jkq jkqVar, java.lang.String str) {
        defpackage.etx etxVar;
        this.r = jkqVar;
        this.d = str;
        if (jkqVar != null) {
            this.f = new defpackage.fum(178);
            etxVar = new defpackage.etx();
        } else {
            etxVar = null;
            this.f = null;
        }
        this.e = etxVar;
        this.m = -9223372036854775807L;
        this.o = -9223372036854775807L;
    }

    /* JADX WARN: Code duplicated, block: B:43:0x010a  */
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
    @Override // defpackage.ftx
    public final void a(defpackage.etx etxVar) {
        int i;
        long j;
        boolean z;
        boolean z2;
        int i2;
        int i3;
        int i4;
        float f;
        int i5;
        long j2;
        double d;
        int i6;
        int i7;
        ahvr.ci(this.c);
        int i8 = etxVar.c;
        int i9 = etxVar.d;
        byte[] bArr = etxVar.b;
        this.i += (long) etxVar.d();
        this.c.b(etxVar, etxVar.d());
        while (true) {
            int iB = defpackage.evc.b(bArr, i8, i9, this.g);
            if (iB == i9) {
                break;
            }
            int i10 = iB + 3;
            int i11 = etxVar.b[i10] & 255;
            int i12 = iB - i8;
            if (this.k) {
                i = i9;
            } else {
                if (i12 > 0) {
                    this.h.a(bArr, i8, iB);
                }
                int i13 = i12 < 0 ? -i12 : 0;
                defpackage.fty ftyVar = this.h;
                if (ftyVar.b) {
                    int i14 = ftyVar.c - i13;
                    ftyVar.c = i14;
                    if (ftyVar.d == 0 && i11 == 181) {
                        ftyVar.d = i14;
                        i = i9;
                        i11 = 181;
                    } else {
                        ftyVar.b = false;
                        java.lang.String str = this.b;
                        ahvr.ci(str);
                        java.lang.String str2 = this.d;
                        byte[] bArrCopyOf = java.util.Arrays.copyOf(ftyVar.e, ftyVar.c);
                        int i15 = bArrCopyOf[4] & 255;
                        byte b = bArrCopyOf[5];
                        i = i9;
                        int i16 = bArrCopyOf[6] & 255;
                        int i17 = (i15 << 4) | ((b & 255) >> 4);
                        int i18 = (bArrCopyOf[7] & 240) >> 4;
                        int i19 = ((b & 15) << 8) | i16;
                        if (i18 == 2) {
                            i3 = i19 << 2;
                            i4 = i17 * 3;
                        } else if (i18 != 3) {
                            if (i18 != 4) {
                                f = 1.0f;
                            } else {
                                i3 = i19 * 121;
                                i4 = i17 * 100;
                            }
                            defpackage.eqf eqfVar = new defpackage.eqf();
                            eqfVar.a = str;
                            eqfVar.a(str2);
                            eqfVar.c("video/mpeg2");
                            eqfVar.t = i17;
                            eqfVar.u = i19;
                            eqfVar.A = f;
                            eqfVar.q = java.util.Collections.singletonList(bArrCopyOf);
                            defpackage.eqg eqgVar = new defpackage.eqg(eqfVar);
                            i5 = (bArrCopyOf[7] & 15) - 1;
                            j2 = 0;
                            if (i5 >= 0 && i5 < 8) {
                                d = a[i5];
                                byte b2 = bArrCopyOf[ftyVar.d + 9];
                                i6 = (b2 & 96) >> 5;
                                i7 = b2 & 31;
                                if (i6 != i7) {
                                    d *= (((double) i6) + 1.0d) / ((double) (i7 + 1));
                                }
                                j2 = (long) (1000000.0d / d);
                            }
                            android.util.Pair pairCreate = android.util.Pair.create(eqgVar, java.lang.Long.valueOf(j2));
                            this.c.p((defpackage.eqg) pairCreate.first);
                            this.l = ((java.lang.Long) pairCreate.second).longValue();
                            this.k = true;
                        } else {
                            i3 = i19 << 4;
                            i4 = i17 * 9;
                        }
                        f = i3 / i4;
                        defpackage.eqf eqfVar2 = new defpackage.eqf();
                        eqfVar2.a = str;
                        eqfVar2.a(str2);
                        eqfVar2.c("video/mpeg2");
                        eqfVar2.t = i17;
                        eqfVar2.u = i19;
                        eqfVar2.A = f;
                        eqfVar2.q = java.util.Collections.singletonList(bArrCopyOf);
                        defpackage.eqg eqgVar2 = new defpackage.eqg(eqfVar2);
                        i5 = (bArrCopyOf[7] & 15) - 1;
                        j2 = 0;
                        if (i5 >= 0) {
                            d = a[i5];
                            byte b3 = bArrCopyOf[ftyVar.d + 9];
                            i6 = (b3 & 96) >> 5;
                            i7 = b3 & 31;
                            if (i6 != i7) {
                                d *= (((double) i6) + 1.0d) / ((double) (i7 + 1));
                            }
                            j2 = (long) (1000000.0d / d);
                        }
                        android.util.Pair pairCreate2 = android.util.Pair.create(eqgVar2, java.lang.Long.valueOf(j2));
                        this.c.p((defpackage.eqg) pairCreate2.first);
                        this.l = ((java.lang.Long) pairCreate2.second).longValue();
                        this.k = true;
                    }
                } else {
                    i = i9;
                    if (i11 == 179) {
                        ftyVar.b = true;
                        i11 = 179;
                    }
                }
                ftyVar.a(defpackage.fty.a, 0, 3);
            }
            defpackage.fum fumVar = this.f;
            if (fumVar != null) {
                if (i12 > 0) {
                    fumVar.a(bArr, i8, iB);
                    i2 = 0;
                } else {
                    i2 = -i12;
                }
                if (fumVar.d(i2)) {
                    int iE = defpackage.evc.e(fumVar.b, fumVar.c);
                    defpackage.etx etxVar2 = this.e;
                    java.lang.String str3 = eum.a;
                    etxVar2.O(fumVar.b, iE);
                    this.r.d(this.o, etxVar2);
                }
                if (i11 == 178) {
                    if (etxVar.b[iB + 2] == 1) {
                        fumVar.c(178);
                    }
                    i11 = 178;
                }
            }
            if (i11 == 0 || i11 == 179) {
                int i20 = i - iB;
                if (this.q && this.k) {
                    j = -9223372036854775807L;
                    long j3 = this.o;
                    if (j3 != -9223372036854775807L) {
                        j = -9223372036854775807L;
                        this.c.d(j3, this.p ? 1 : 0, ((int) (this.i - this.n)) - i20, i20, null);
                    }
                } else {
                    j = -9223372036854775807L;
                }
                if (!this.j || this.q) {
                    this.n = this.i - ((long) i20);
                    long j4 = this.m;
                    if (j4 == j) {
                        long j5 = this.o;
                        j4 = j5 != j ? j5 + this.l : j;
                    }
                    this.o = j4;
                    z = false;
                    this.p = false;
                    this.m = j;
                    z2 = true;
                    this.j = true;
                } else {
                    z2 = true;
                    z = false;
                }
                this.q = i11 == 0 ? z2 : z;
            } else if (i11 == 184) {
                this.p = true;
            }
            i8 = i10;
            i9 = i;
        }
        if (!this.k) {
            this.h.a(bArr, i8, i9);
        }
        defpackage.fum fumVar2 = this.f;
        if (fumVar2 != null) {
            fumVar2.a(bArr, i8, i9);
        }
    }

    @Override // defpackage.ftx
    public final void b(defpackage.fll fllVar, defpackage.fvb fvbVar) {
        fvbVar.c();
        this.b = fvbVar.b();
        this.c = fllVar.r(fvbVar.a(), 2);
        defpackage.jkq jkqVar = this.r;
        if (jkqVar != null) {
            jkqVar.e(fllVar, fvbVar);
        }
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
    @Override // defpackage.ftx
    public final void c() {
        ahvr.ci(this.c);
        long j = this.o;
        if (j != -9223372036854775807L) {
            boolean z = this.p;
            long j2 = this.i - this.n;
            this.c.d(j, z ? 1 : 0, (int) j2, 0, null);
        }
    }

    @Override // defpackage.ftx
    public final void e(long j, int i) {
        this.m = j;
    }

    @Override // defpackage.ftx
    public final void f() {
        defpackage.evc.i(this.g);
        defpackage.fty ftyVar = this.h;
        ftyVar.b = false;
        ftyVar.c = 0;
        ftyVar.d = 0;
        defpackage.fum fumVar = this.f;
        if (fumVar != null) {
            fumVar.b();
        }
        this.i = 0L;
        this.j = false;
        this.m = -9223372036854775807L;
        this.o = -9223372036854775807L;
    }

    @Override // defpackage.ftx
    public final /* synthetic */ void d() {
    }
}
