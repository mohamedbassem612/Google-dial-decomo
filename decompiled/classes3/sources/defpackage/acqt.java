package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class acqt {
    public static final defpackage.acqt a = new defpackage.acqt();
    private static final bfy b;
    private static final bfy c;
    private static final bfy d;
    private static final bfy e;
    private static final bfy f;
    private static final bfy g;
    private static final bfy h;
    private static final bfy i;
    private static final bfy j;
    private static final bfy k;
    private static final ayy l;
    private static final ayy m;
    private static final ayy n;
    private static final ayy o;
    private static final ayy p;
    private static final ayy q;
    private static final ayy r;
    private static final ayy s;
    private static final ayy t;
    private static final ayy u;
    private static final float v;
    private static final float w;
    private static final float x;
    private static final float y;

    static {
        bfy bfyVar = defpackage.actg.a;
        b = defpackage.actg.a;
        bfy bfyVar2 = defpackage.acte.a;
        c = defpackage.acte.a;
        bfy bfyVar3 = defpackage.actd.a;
        d = defpackage.actd.a;
        bfy bfyVar4 = defpackage.actc.a;
        e = defpackage.actc.a;
        bfy bfyVar5 = defpackage.actf.a;
        f = defpackage.actf.a;
        g = defpackage.actg.b;
        h = defpackage.acte.b;
        i = defpackage.actd.b;
        j = defpackage.actc.b;
        k = defpackage.actf.b;
        l = den.bc(defpackage.actg.c, 0.0f, defpackage.actg.d, 0.0f, 10);
        m = den.bc(defpackage.acte.c, 0.0f, defpackage.acte.d, 0.0f, 10);
        n = den.bc(defpackage.actd.c, 0.0f, defpackage.actd.d, 0.0f, 10);
        o = den.bc(defpackage.actc.c, 0.0f, defpackage.actc.d, 0.0f, 10);
        p = den.bc(defpackage.actf.c, 0.0f, defpackage.actf.d, 0.0f, 10);
        q = den.bc(defpackage.actg.e, 0.0f, defpackage.actg.f, 0.0f, 10);
        r = den.bc(defpackage.acte.e, 0.0f, defpackage.acte.f, 0.0f, 10);
        s = den.bc(defpackage.actd.e, 0.0f, defpackage.actd.f, 0.0f, 10);
        t = den.bc(defpackage.actc.e, 0.0f, defpackage.actc.f, 0.0f, 10);
        u = den.bc(defpackage.actf.e, 0.0f, defpackage.actf.f, 0.0f, 10);
        v = 40.0f;
        w = 56.0f;
        x = 96.0f;
        y = 136.0f;
    }

    public static final bfy a() {
        bfy bfyVar = defpackage.acte.a;
        return den.ax((int) defpackage.acte.h);
    }

    public static final bgc b(bfy bfyVar) {
        return new bgc(a(), bfyVar, bfyVar, a());
    }

    public static final bgc c(bfy bfyVar) {
        return new bgc(bfyVar, a(), a(), bfyVar);
    }

    private static final bvi h(bfy bfyVar, bfy bfyVar2) {
        return new bvi(b(bfyVar), b(bfyVar2), (crd) null);
    }

    private static final bvi i(bfy bfyVar, bfy bfyVar2) {
        bgc bgcVarC = c(bfyVar);
        bgc bgcVarC2 = c(bfyVar2);
        bgc bgcVar = actb.a;
        return new bvi(bgcVarC, bgcVarC2, actb.e);
    }

    public final void d(aomy aomyVar, cmw cmwVar, boolean z, bvi bviVar, bni bniVar, ayy ayyVar, aono aonoVar, cav cavVar, int i2, int i3) {
        int i4;
        cmw cmwVar2;
        ayy ayyVar2;
        defpackage.acqt acqtVar;
        int i5;
        aooh.f(aomyVar, "onClick");
        aooh.f(aonoVar, "content");
        int i6 = i2 & 6;
        cbt cbtVarB = cavVar.b(-570514247);
        if (i6 == 0) {
            i4 = (true != cbtVarB.D(aomyVar) ? 2 : 4) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            cmwVar2 = cmwVar;
            i4 |= true != cbtVarB.B(cmwVar2) ? 16 : 32;
        } else {
            cmwVar2 = cmwVar;
        }
        if ((i2 & 384) == 0) {
            i4 |= true != cbtVarB.C(z) ? 128 : 256;
        }
        if ((i2 & 3072) == 0) {
            i4 |= true != ((i2 & 4096) == 0 ? cbtVarB.B(bviVar) : cbtVarB.D(bviVar)) ? 1024 : 2048;
        }
        if ((i2 & 24576) == 0) {
            i4 |= true != cbtVarB.B(bniVar) ? 8192 : 16384;
        }
        if ((196608 & i2) == 0) {
            i4 |= true != cbtVarB.B((java.lang.Object) null) ? 65536 : 131072;
        }
        if ((1572864 & i2) == 0) {
            i4 |= true != cbtVarB.B((java.lang.Object) null) ? 524288 : 1048576;
        }
        if ((12582912 & i2) == 0) {
            ayyVar2 = ayyVar;
            i4 |= true != cbtVarB.B(ayyVar2) ? 4194304 : 8388608;
        } else {
            ayyVar2 = ayyVar;
        }
        if ((100663296 & i2) == 0) {
            i4 |= true != cbtVarB.B((java.lang.Object) null) ? 33554432 : 67108864;
        }
        if ((805306368 & i2) == 0) {
            i4 |= true != cbtVarB.D(aonoVar) ? 268435456 : 536870912;
        }
        if ((i3 & 6) == 0) {
            acqtVar = this;
            i5 = i3 | (true != cbtVarB.B(acqtVar) ? 2 : 4);
        } else {
            acqtVar = this;
            i5 = i3;
        }
        if (cbtVarB.H(((306783379 & i4) == 306783378 && (i5 & 3) == 2) ? false : true, i4 & 1)) {
            cbtVarB.Z(-127, (java.lang.Object) null, 0, (java.lang.Object) null);
            if ((i2 & 1) != 0 && !cbtVarB.E()) {
                cbtVarB.s();
            }
            cbtVarB.l();
            bvf.a.a(aomyVar, cmwVar2, z, bviVar, bniVar, ayyVar2, aonoVar, cbtVarB, i4 & 2147483646, 6);
        } else {
            cbtVarB.s();
        }
        cdk cdkVarI = cbtVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new defpackage.acpq(acqtVar, aomyVar, cmwVar, z, bviVar, bniVar, ayyVar, aonoVar, i2, i3, 2);
        }
    }

    public final void e(aomy aomyVar, cmw cmwVar, boolean z, bvi bviVar, bni bniVar, ayy ayyVar, aono aonoVar, cav cavVar, int i2, int i3) {
        int i4;
        defpackage.acqt acqtVar;
        int i5;
        cmw cmwVar2;
        boolean z2;
        bvi bviVar2;
        bni bniVar2;
        ayy ayyVar2;
        cmw cmwVar3;
        bvi bviVarH;
        ayy ayyVar3;
        bni bniVar3;
        boolean z3;
        bvi bviVar3;
        ayy ayyVar4;
        aooh.f(aomyVar, "onClick");
        aooh.f(aonoVar, "content");
        int i6 = i2 & 6;
        cbt cbtVarB = cavVar.b(1988512315);
        if (i6 == 0) {
            i4 = (true != cbtVarB.D(aomyVar) ? 2 : 4) | i2;
        } else {
            i4 = i2;
        }
        int i7 = i4 | 432;
        if ((i2 & 3072) == 0) {
            i7 = i4 | 1456;
        }
        if ((i2 & 24576) == 0) {
            i7 |= 8192;
        }
        int i8 = i7 | 196608;
        if ((1572864 & i2) == 0) {
            i8 |= true != cbtVarB.B((java.lang.Object) null) ? 524288 : 1048576;
        }
        if ((12582912 & i2) == 0) {
            i8 |= 4194304;
        }
        int i9 = i8 | 100663296;
        if ((805306368 & i2) == 0) {
            i9 |= true != cbtVarB.D(aonoVar) ? 268435456 : 536870912;
        }
        if ((i3 & 6) == 0) {
            acqtVar = this;
            i5 = i3 | (true != cbtVarB.B(acqtVar) ? 2 : 4);
        } else {
            acqtVar = this;
            i5 = i3;
        }
        if (cbtVarB.H(((306783379 & i9) == 306783378 && (i5 & 3) == 2) ? false : true, i9 & 1)) {
            cbt cbtVar = cbtVarB;
            cbtVar.Z(-127, (java.lang.Object) null, 0, (java.lang.Object) null);
            if ((i2 & 1) == 0 || cbtVarB.E()) {
                cmwVar3 = cmw.c;
                float f2 = v;
                ayy ayyVar5 = acpl.a;
                float f3 = acpl.c;
                float fC = acpl.c();
                float f4 = acpl.d;
                float f5 = acpl.e;
                float f6 = acpl.f;
                if (dpi.a(f2, (((f3 + fC) + 0.0f) / 2.0f) + 0.0f) <= 0) {
                    cbtVarB.u(1984201976);
                    bviVarH = h(b, g);
                    cbtVar.W(false);
                } else if (dpi.a(f2, (((fC + f4) + 0.0f) / 2.0f) + 0.0f) <= 0) {
                    cbtVarB.u(1984209166);
                    bviVarH = h(c, h);
                    cbtVar.W(false);
                } else if (dpi.a(f2, (((f4 + f5) + 0.0f) / 2.0f) + 0.0f) <= 0) {
                    cbtVarB.u(1984216048);
                    bviVarH = h(d, i);
                    cbtVar.W(false);
                } else if (dpi.a(f2, (((f5 + f6) + 0.0f) / 2.0f) + 0.0f) <= 0) {
                    cbtVarB.u(1984222990);
                    bviVarH = h(e, j);
                    cbtVar.W(false);
                } else {
                    cbtVarB.u(1984228472);
                    bviVarH = h(f, k);
                    cbtVar.W(false);
                }
                bni bniVarE = acpl.e(0L, cbtVarB, 15);
                float f7 = w;
                float f8 = x;
                float f9 = y;
                if (dpi.a(f2, f2) < 0) {
                    ayyVar3 = l;
                } else if (dpi.a(f2, f7) < 0) {
                    ayyVar3 = m;
                } else if (dpi.a(f2, f8) < 0) {
                    ayyVar3 = n;
                } else {
                    ayyVar3 = dpi.a(f2, f9) < 0 ? o : p;
                }
                ayy ayyVar6 = ayyVar3;
                bniVar3 = bniVarE;
                z3 = true;
                bviVar3 = bviVarH;
                ayyVar4 = ayyVar6;
            } else {
                cbtVarB.s();
                cmwVar3 = cmwVar;
                z3 = z;
                bviVar3 = bviVar;
                bniVar3 = bniVar;
                ayyVar4 = ayyVar;
            }
            cbtVarB.l();
            int i10 = i5 & 14;
            cmw cmwVar4 = cmwVar3;
            bni bniVar4 = bniVar3;
            acqtVar.d(aomyVar, cmwVar4, z3, bviVar3, bniVar4, ayyVar4, aonoVar, cbtVarB, i9 & 2118059006, i10);
            ayyVar2 = ayyVar4;
            bniVar2 = bniVar4;
            bviVar2 = bviVar3;
            z2 = z3;
            cmwVar2 = cmwVar4;
        } else {
            cbtVarB.s();
            cmwVar2 = cmwVar;
            z2 = z;
            bviVar2 = bviVar;
            bniVar2 = bniVar;
            ayyVar2 = ayyVar;
        }
        cdk cdkVarI = cbtVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new defpackage.acpq(this, aomyVar, cmwVar2, z2, bviVar2, bniVar2, ayyVar2, aonoVar, i2, i3, 3);
        }
    }

    public final void f(boolean z, aonj aonjVar, cmw cmwVar, boolean z2, bvi bviVar, bni bniVar, ayy ayyVar, aono aonoVar, cav cavVar, int i2, int i3) {
        boolean z3;
        int i4;
        int i5;
        defpackage.acqt acqtVar;
        boolean z4;
        bvi bviVar2;
        bni bniVar2;
        ayy ayyVar2;
        bvi bviVarI;
        ayy ayyVar3;
        bni bniVar3;
        bvi bviVar3;
        aooh.f(aonjVar, "onCheckedChange");
        aooh.f(aonoVar, "content");
        int i6 = i2 & 6;
        cbt cbtVarB = cavVar.b(1165299272);
        boolean z5 = true;
        if (i6 == 0) {
            z3 = z;
            i4 = (true != cbtVarB.C(z3) ? 2 : 4) | i2;
        } else {
            z3 = z;
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= true != cbtVarB.D(aonjVar) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i4 |= true != cbtVarB.B(cmwVar) ? 128 : 256;
        }
        int i7 = i4 | 3072;
        if ((i2 & 24576) == 0) {
            i7 = i4 | 11264;
        }
        if ((196608 & i2) == 0) {
            i7 |= 65536;
        }
        int i8 = i7 | 1572864;
        if ((12582912 & i2) == 0) {
            i8 |= true != cbtVarB.B((java.lang.Object) null) ? 4194304 : 8388608;
        }
        if ((100663296 & i2) == 0) {
            i8 |= 33554432;
        }
        if ((i3 & 6) == 0) {
            i5 = i3 | (true == cbtVarB.D(aonoVar) ? 4 : 2);
        } else {
            i5 = i3;
        }
        if ((i3 & 48) == 0) {
            acqtVar = this;
            i5 |= true == cbtVarB.B(acqtVar) ? 32 : 16;
        } else {
            acqtVar = this;
        }
        int i9 = i8 | 805306368;
        if (cbtVarB.H(((306783379 & i9) == 306783378 && (i5 & 19) == 18) ? false : true, i9 & 1)) {
            cbt cbtVar = cbtVarB;
            cbtVar.Z(-127, (java.lang.Object) null, 0, (java.lang.Object) null);
            if ((i2 & 1) == 0 || cbtVarB.E()) {
                float f2 = v;
                ayy ayyVar4 = acpl.a;
                float f3 = acpl.c;
                float fC = acpl.c();
                float f4 = acpl.d;
                float f5 = acpl.e;
                float f6 = acpl.f;
                if (dpi.a(f2, (((f3 + fC) + 0.0f) / 2.0f) + 0.0f) <= 0) {
                    cbtVarB.u(592187279);
                    bviVarI = i(b, g);
                    cbtVar.W(false);
                } else if (dpi.a(f2, (((fC + f4) + 0.0f) / 2.0f) + 0.0f) <= 0) {
                    cbtVarB.u(592194629);
                    bviVarI = i(c, h);
                    cbtVar.W(false);
                } else if (dpi.a(f2, (((f4 + f5) + 0.0f) / 2.0f) + 0.0f) <= 0) {
                    cbtVarB.u(592201671);
                    bviVarI = i(d, i);
                    cbtVar.W(false);
                } else if (dpi.a(f2, (((f5 + f6) + 0.0f) / 2.0f) + 0.0f) <= 0) {
                    cbtVarB.u(592208773);
                    bviVarI = i(e, j);
                    cbtVar.W(false);
                } else {
                    cbtVarB.u(592214415);
                    bviVarI = i(f, k);
                    cbtVar.W(false);
                }
                bni bniVarE = acpl.e(0L, cbtVarB, 15);
                float f7 = w;
                float f8 = x;
                float f9 = y;
                if (dpi.a(f2, f2) < 0) {
                    ayyVar3 = q;
                } else if (dpi.a(f2, f7) < 0) {
                    ayyVar3 = r;
                } else if (dpi.a(f2, f8) < 0) {
                    ayyVar3 = s;
                } else {
                    ayyVar3 = dpi.a(f2, f9) < 0 ? t : u;
                }
                bniVar3 = bniVarE;
                bviVar3 = bviVarI;
            } else {
                cbtVarB.s();
                z5 = z2;
                bviVar3 = bviVar;
                bniVar3 = bniVar;
                ayyVar3 = ayyVar;
            }
            cbtVarB.l();
            acqtVar.g(z3, aonjVar, cmwVar, z5, bviVar3, bniVar3, ayyVar3, aonoVar, cbtVarB, i9 & 1912086526, i5 & 126);
            ayyVar2 = ayyVar3;
            bniVar2 = bniVar3;
            bviVar2 = bviVar3;
            z4 = z5;
        } else {
            cbtVarB.s();
            z4 = z2;
            bviVar2 = bviVar;
            bniVar2 = bniVar;
            ayyVar2 = ayyVar;
        }
        cdk cdkVarI = cbtVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new defpackage.acqs(this, z, aonjVar, cmwVar, z4, bviVar2, bniVar2, ayyVar2, aonoVar, i2, i3, 2);
        }
    }

    public final void g(boolean z, aonj aonjVar, cmw cmwVar, boolean z2, bvi bviVar, bni bniVar, ayy ayyVar, aono aonoVar, cav cavVar, int i2, int i3) {
        int i4;
        cmw cmwVar2;
        boolean z3;
        bni bniVar2;
        ayy ayyVar2;
        int i5;
        aooh.f(aonjVar, "onCheckedChange");
        aooh.f(aonoVar, "content");
        int i6 = i2 & 6;
        cbt cbtVarB = cavVar.b(-756571766);
        if (i6 == 0) {
            i4 = (true != cbtVarB.C(z) ? 2 : 4) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= true != cbtVarB.D(aonjVar) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            cmwVar2 = cmwVar;
            i4 |= true != cbtVarB.B(cmwVar2) ? 128 : 256;
        } else {
            cmwVar2 = cmwVar;
        }
        if ((i2 & 3072) == 0) {
            z3 = z2;
            i4 |= true != cbtVarB.C(z3) ? 1024 : 2048;
        } else {
            z3 = z2;
        }
        if ((i2 & 24576) == 0) {
            i4 |= true != ((32768 & i2) == 0 ? cbtVarB.B(bviVar) : cbtVarB.D(bviVar)) ? 8192 : 16384;
        }
        if ((196608 & i2) == 0) {
            bniVar2 = bniVar;
            i4 |= true != cbtVarB.B(bniVar2) ? 65536 : 131072;
        } else {
            bniVar2 = bniVar;
        }
        if ((1572864 & i2) == 0) {
            i4 |= true != cbtVarB.B((java.lang.Object) null) ? 524288 : 1048576;
        }
        if ((12582912 & i2) == 0) {
            i4 |= true != cbtVarB.B((java.lang.Object) null) ? 4194304 : 8388608;
        }
        if ((100663296 & i2) == 0) {
            ayyVar2 = ayyVar;
            i4 |= true != cbtVarB.B(ayyVar2) ? 33554432 : 67108864;
        } else {
            ayyVar2 = ayyVar;
        }
        if ((805306368 & i2) == 0) {
            i4 |= true != cbtVarB.B((java.lang.Object) null) ? 268435456 : 536870912;
        }
        if ((i3 & 6) == 0) {
            i5 = i3 | (true != cbtVarB.D(aonoVar) ? 2 : 4);
        } else {
            i5 = i3;
        }
        if ((i3 & 48) == 0) {
            i5 |= true != cbtVarB.B(this) ? 16 : 32;
        }
        if (cbtVarB.H(((306783379 & i4) == 306783378 && (i5 & 19) == 18) ? false : true, i4 & 1)) {
            cbtVarB.Z(-127, (java.lang.Object) null, 0, (java.lang.Object) null);
            if ((i2 & 1) != 0 && !cbtVarB.E()) {
                cbtVarB.s();
            }
            cbtVarB.l();
            bvf.a.b(z, aonjVar, cmwVar2, z3, bviVar, bniVar2, ayyVar2, aonoVar, cbtVarB, i4 & 2147483646, (i5 & 14) | 48);
        } else {
            cbtVarB.s();
        }
        cdk cdkVarI = cbtVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new defpackage.acqs(this, z, aonjVar, cmwVar, z2, bviVar, bniVar, ayyVar, aonoVar, i2, i3, 0);
        }
    }
}
