package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class fuc implements defpackage.ftx {
    private static final float[] a = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};
    private defpackage.fub f;
    private long g;
    private java.lang.String h;
    private defpackage.fmk i;
    private boolean j;
    private final defpackage.jkq l;
    private final boolean[] c = new boolean[4];
    private final defpackage.fua d = new defpackage.fua();
    private long k = -9223372036854775807L;
    private final defpackage.fum e = new defpackage.fum(178);
    private final defpackage.etx b = new defpackage.etx();

    public fuc(defpackage.jkq jkqVar) {
        this.l = jkqVar;
    }

    @Override // defpackage.ftx
    public final void a(defpackage.etx etxVar) {
        int i;
        int i2;
        int i3;
        boolean z;
        int i4;
        boolean z2;
        float f;
        ahvr.ci(this.f);
        ahvr.ci(this.i);
        int i5 = etxVar.c;
        int i6 = etxVar.d;
        byte[] bArr = etxVar.b;
        this.g += (long) etxVar.d();
        this.i.b(etxVar, etxVar.d());
        while (true) {
            int iB = defpackage.evc.b(bArr, i5, i6, this.c);
            if (iB == i6) {
                break;
            }
            int i7 = iB + 3;
            byte b = etxVar.b[i7];
            int i8 = b & 255;
            int i9 = iB - i5;
            if (this.j) {
                i = i6;
                i2 = i7;
            } else {
                if (i9 > 0) {
                    this.d.a(bArr, i5, iB);
                }
                int i10 = i9 < 0 ? -i9 : 0;
                defpackage.fua fuaVar = this.d;
                int i11 = fuaVar.c;
                if (i11 != 0) {
                    i = i6;
                    if (i11 == 1) {
                        i2 = i7;
                        if (i8 != 181) {
                            defpackage.etr.f("H263Reader", "Unexpected start code value");
                            fuaVar.b();
                        } else {
                            fuaVar.c = 2;
                        }
                    } else if (i11 == 2) {
                        i2 = i7;
                        if (i8 > 31) {
                            defpackage.etr.f("H263Reader", "Unexpected start code value");
                            fuaVar.b();
                        } else {
                            fuaVar.c = 3;
                        }
                    } else if (i11 != 3) {
                        if (i8 != 179) {
                            if (i8 == 181) {
                                i8 = 181;
                            } else {
                                i2 = i7;
                            }
                        }
                        fuaVar.d -= i10;
                        fuaVar.b = false;
                        defpackage.fmk fmkVar = this.i;
                        int i12 = fuaVar.e;
                        java.lang.String str = this.h;
                        ahvr.ci(str);
                        byte[] bArrCopyOf = java.util.Arrays.copyOf(fuaVar.f, fuaVar.d);
                        defpackage.etv etvVar = new defpackage.etv(bArrCopyOf);
                        etvVar.o(i12);
                        etvVar.o(4);
                        etvVar.m();
                        etvVar.n(8);
                        if (etvVar.p()) {
                            etvVar.n(4);
                            etvVar.n(3);
                        }
                        int iD = etvVar.d(4);
                        i2 = i7;
                        if (iD == 15) {
                            int iD2 = etvVar.d(8);
                            int iD3 = etvVar.d(8);
                            if (iD3 == 0) {
                                defpackage.etr.f("H263Reader", "Invalid aspect ratio");
                                f = 1.0f;
                            } else {
                                f = iD2 / iD3;
                            }
                        } else if (iD < 7) {
                            f = a[iD];
                        } else {
                            defpackage.etr.f("H263Reader", "Invalid aspect ratio");
                            f = 1.0f;
                        }
                        if (etvVar.p()) {
                            etvVar.n(2);
                            etvVar.n(1);
                            if (etvVar.p()) {
                                etvVar.n(15);
                                etvVar.m();
                                etvVar.n(15);
                                etvVar.m();
                                etvVar.n(15);
                                etvVar.m();
                                etvVar.n(3);
                                etvVar.n(11);
                                etvVar.m();
                                etvVar.n(15);
                                etvVar.m();
                            }
                        }
                        if (etvVar.d(2) != 0) {
                            defpackage.etr.f("H263Reader", "Unhandled video object layer shape");
                        }
                        etvVar.m();
                        int iD4 = etvVar.d(16);
                        etvVar.m();
                        if (etvVar.p()) {
                            if (iD4 == 0) {
                                defpackage.etr.f("H263Reader", "Invalid vop_increment_time_resolution");
                            } else {
                                int i13 = iD4 - 1;
                                int i14 = 0;
                                while (i13 > 0) {
                                    i13 >>= 1;
                                    i14++;
                                }
                                etvVar.n(i14);
                            }
                        }
                        etvVar.m();
                        int iD5 = etvVar.d(13);
                        etvVar.m();
                        int iD6 = etvVar.d(13);
                        etvVar.m();
                        etvVar.m();
                        defpackage.eqf eqfVar = new defpackage.eqf();
                        eqfVar.a = str;
                        eqfVar.a("video/mp2t");
                        eqfVar.c("video/mp4v-es");
                        eqfVar.t = iD5;
                        eqfVar.u = iD6;
                        eqfVar.A = f;
                        eqfVar.q = java.util.Collections.singletonList(bArrCopyOf);
                        fmkVar.p(new defpackage.eqg(eqfVar));
                        this.j = true;
                    } else {
                        i2 = i7;
                        if ((b & 240) != 32) {
                            defpackage.etr.f("H263Reader", "Unexpected start code value");
                            fuaVar.b();
                        } else {
                            fuaVar.e = fuaVar.d;
                            fuaVar.c = 4;
                        }
                    }
                } else {
                    i = i6;
                    i2 = i7;
                    if (i8 == 176) {
                        fuaVar.c = 1;
                        fuaVar.b = true;
                        i8 = 176;
                    }
                }
                fuaVar.a(defpackage.fua.a, 0, 3);
            }
            this.f.a(bArr, i5, iB);
            defpackage.fum fumVar = this.e;
            if (i9 > 0) {
                fumVar.a(bArr, i5, iB);
                i3 = 0;
            } else {
                i3 = -i9;
            }
            if (fumVar.d(i3)) {
                int iE = defpackage.evc.e(fumVar.b, fumVar.c);
                defpackage.etx etxVar2 = this.b;
                java.lang.String str2 = eum.a;
                etxVar2.O(fumVar.b, iE);
                this.l.d(this.k, etxVar2);
            }
            if (i8 == 178) {
                z = true;
                if (etxVar.b[iB + 2] == 1) {
                    fumVar.c(178);
                }
                i8 = 178;
            } else {
                z = true;
            }
            int i15 = i - iB;
            this.f.b(this.g - ((long) i15), i15, this.j);
            defpackage.fub fubVar = this.f;
            long j = this.k;
            fubVar.d = i8;
            fubVar.c = false;
            if (i8 == 182) {
                i4 = i8;
                z2 = z;
            } else if (i8 == 179) {
                z2 = z;
                i4 = 179;
            } else {
                i4 = i8;
                z2 = false;
            }
            fubVar.a = z2;
            fubVar.b = i4 == 182 ? z : false;
            fubVar.e = 0;
            fubVar.f = j;
            i6 = i;
            i5 = i2;
        }
        if (!this.j) {
            this.d.a(bArr, i5, i6);
        }
        this.f.a(bArr, i5, i6);
        this.e.a(bArr, i5, i6);
    }

    @Override // defpackage.ftx
    public final void b(defpackage.fll fllVar, defpackage.fvb fvbVar) {
        fvbVar.c();
        this.h = fvbVar.b();
        this.i = fllVar.r(fvbVar.a(), 2);
        this.f = new defpackage.fub(this.i);
        this.l.e(fllVar, fvbVar);
    }

    @Override // defpackage.ftx
    public final void c() {
        ahvr.ci(this.f);
        this.f.b(this.g, 0, this.j);
        this.f.c();
    }

    @Override // defpackage.ftx
    public final void e(long j, int i) {
        this.k = j;
    }

    @Override // defpackage.ftx
    public final void f() {
        defpackage.evc.i(this.c);
        this.d.b();
        defpackage.fub fubVar = this.f;
        if (fubVar != null) {
            fubVar.c();
        }
        this.e.b();
        this.g = 0L;
        this.k = -9223372036854775807L;
    }

    @Override // defpackage.ftx
    public final /* synthetic */ void d() {
    }
}
