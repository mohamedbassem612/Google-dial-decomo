package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class abar implements defpackage.abav {
    private final defpackage.zzd a;
    private final android.content.Context b;
    private final j$.util.Optional c;
    private final defpackage.adae d;

    public abar(defpackage.zzd zzdVar, android.content.Context context, defpackage.adae adaeVar, j$.util.Optional optional) {
        defpackage.aooh.f(context, "context");
        defpackage.aooh.f(adaeVar, "clientRoleConfigProvider");
        defpackage.aooh.f(optional, "enableHadesEventStartedLogging");
        this.a = zzdVar;
        this.b = context;
        this.d = adaeVar;
        this.c = optional;
    }

    private final void f(ykg ykgVar) {
        this.a.h(ykgVar, defpackage.abtl.b(this.b, new abau())).d();
    }

    private final defpackage.akzx g(defpackage.aazd aazdVar, defpackage.akzc akzcVar, long j) {
        defpackage.aazf aazfVarF = this.d.F(aazdVar);
        defpackage.akzx akzxVarM = ykg.a.m();
        defpackage.akzx akzxVarM2 = ykb.a.m();
        akzxVarM2.u();
        ykb ykbVar = akzxVarM2.b;
        j$.util.Objects.requireNonNull(akzcVar);
        ykbVar.b |= 16;
        ykbVar.c = akzcVar;
        akzxVarM2.u();
        ykb ykbVar2 = akzxVarM2.b;
        ykbVar2.b |= 16384;
        ykbVar2.k = j;
        java.lang.String strD = aazdVar.d();
        if (strD != null) {
            akzxVarM2.u();
            ykb ykbVar3 = akzxVarM2.b;
            j$.util.Objects.requireNonNull(strD);
            ykbVar3.b |= 256;
            ykbVar3.e = strD;
        }
        java.lang.String packageName = aazdVar.c;
        if (packageName == null || packageName.length() == 0) {
            packageName = this.b.getPackageName();
        }
        akzxVarM2.u();
        ykb ykbVar4 = akzxVarM2.b;
        j$.util.Objects.requireNonNull(packageName);
        ykbVar4.b |= 128;
        ykbVar4.d = packageName;
        long jB = abas.b(aazdVar);
        akzxVarM2.u();
        ykb ykbVar5 = akzxVarM2.b;
        ykbVar5.b |= 1024;
        ykbVar5.g = jB;
        akzxVarM2.u();
        ykb ykbVar6 = akzxVarM2.b;
        ykbVar6.b |= 512;
        ykbVar6.f = 1001915728L;
        int i = aazfVarF.c;
        akzxVarM2.u();
        ykb ykbVar7 = akzxVarM2.b;
        ykbVar7.h = 0;
        ykbVar7.b |= 2048;
        int i2 = aazfVarF.d;
        akzxVarM2.u();
        ykb ykbVar8 = akzxVarM2.b;
        ykbVar8.i = 0;
        ykbVar8.b |= 4096;
        int i3 = aazfVarF.e;
        akzxVarM2.u();
        ykb ykbVar9 = akzxVarM2.b;
        ykbVar9.j = 0;
        ykbVar9.b |= 8192;
        ykb ykbVarR = akzxVarM2.r();
        akzxVarM.u();
        ykg ykgVar = akzxVarM.b;
        j$.util.Objects.requireNonNull(ykbVarR);
        ykgVar.d = ykbVarR;
        ykgVar.b |= 2;
        return akzxVarM;
    }

    /* JADX WARN: Code duplicated, block: B:133:0x0540  */
    /* JADX WARN: Code duplicated, block: B:151:0x02d6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:57:0x027d  */
    /* JADX WARN: Code duplicated, block: B:59:0x0287  */
    /* JADX WARN: Code duplicated, block: B:61:0x0293  */
    /* JADX WARN: Code duplicated, block: B:62:0x0296  */
    /* JADX WARN: Code duplicated, block: B:64:0x029c  */
    /* JADX WARN: Code duplicated, block: B:65:0x029e  */
    /* JADX WARN: Code duplicated, block: B:67:0x02d0  */
    /* JADX WARN: Code duplicated, block: B:69:0x02d3  */
    /* JADX WARN: Code duplicated, block: B:73:0x02ed  */
    /* JADX WARN: Code duplicated, block: B:74:0x02f2  */
    /* JADX WARN: Code duplicated, block: B:77:0x030b  */
    /* JADX WARN: Code duplicated, block: B:78:0x0314  */
    @Override // defpackage.abav
    public final void a(defpackage.aazd aazdVar, defpackage.akzc akzcVar, long j, abbb abbbVar) {
        java.util.ArrayList arrayList;
        java.util.List arrayList2;
        byte b;
        yka ykaVar;
        j$.time.Duration durationPlus;
        java.util.ArrayList arrayList3;
        java.lang.String strT;
        b bVarV;
        byte b2;
        j$.time.Duration durationPlus2;
        java.util.ArrayList arrayList4;
        aopp it;
        ajyu ajyuVarE;
        int iCR;
        ajyu ajyuVarE2;
        int iCQ;
        ajyu ajyuVarF;
        ykf ykfVar;
        byte b3;
        byte b4;
        ykk ykkVar;
        defpackage.aooh.f(aazdVar, "clientId");
        defpackage.aooh.f(akzcVar, "protectionToken");
        defpackage.akzx akzxVarG = g(aazdVar, akzcVar, j);
        defpackage.akzx akzxVarM = yjz.a.m();
        j$.time.Duration duration = abbbVar.a;
        long millis = duration.toMillis();
        akzxVarM.u();
        yjz yjzVar = akzxVarM.b;
        byte b5 = 2;
        yjzVar.b |= 2;
        yjzVar.e = millis;
        abbi abbiVarB = abbbVar.b();
        defpackage.akzx akzxVarM2 = yki.a.m();
        int i = defpackage.aaoo.w(abbiVarB.a).j;
        akzxVarM2.u();
        yki ykiVar = akzxVarM2.b;
        byte b6 = 1;
        ykiVar.b |= 1;
        ykiVar.c = i;
        int i2 = abbiVarB.b;
        akzxVarM2.u();
        yki ykiVar2 = akzxVarM2.b;
        ykiVar2.b |= 2;
        ykiVar2.d = defpackage.aaoo.x(i2) - 1;
        yki ykiVarR = akzxVarM2.r();
        defpackage.aooh.e(ykiVarR, "build(...)");
        yki ykiVar3 = ykiVarR;
        akzxVarM.u();
        yjz yjzVar2 = akzxVarM.b;
        j$.util.Objects.requireNonNull(ykiVar3);
        yjzVar2.d = ykiVar3;
        yjzVar2.b |= 1;
        yka ykaVar2 = yka.a;
        defpackage.akzx akzxVarM3 = ykaVar2.m();
        akzxVarM3.u();
        yka ykaVar3 = akzxVarM3.b;
        j$.util.Objects.requireNonNull("tartarus");
        ykaVar3.b |= 1;
        ykaVar3.c = "tartarus";
        akzxVarM3.u();
        yka ykaVar4 = akzxVarM3.b;
        j$.util.Objects.requireNonNull("v0");
        ykaVar4.b |= 2;
        ykaVar4.d = "v0";
        long millis2 = duration.toMillis();
        akzxVarM3.u();
        yka ykaVar5 = akzxVarM3.b;
        ykaVar5.b |= 16;
        ykaVar5.e = millis2;
        akzxVarM3.u();
        yka ykaVar6 = akzxVarM3.b;
        ykaVar6.b |= 2048;
        ykaVar6.l = 1703940;
        abbg abbgVarA = abbbVar.a();
        java.lang.String strC = abbbVar.c();
        defpackage.akzx akzxVarM4 = yjx.a.m();
        byte b7 = 3;
        if (abbgVarA != null) {
            java.util.List list = abbgVarA.a;
            arrayList = new java.util.ArrayList(defpackage.ajsz.bl(list, 10));
            java.util.Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                byte b8 = ((aoiz) it2.next()).a;
                if (b8 == 0) {
                    ykkVar = ykk.a;
                } else if (b8 == 1) {
                    ykkVar = ykk.b;
                } else if (b8 == b5) {
                    ykkVar = ykk.c;
                } else {
                    if (b8 == 3) {
                        ykkVar = ykk.d;
                    } else {
                        b4 = b5;
                        ykkVar = b8 == 4 ? ykk.e : ykk.a;
                    }
                    arrayList.add(ykkVar);
                    b5 = b4;
                }
                b4 = b5;
                arrayList.add(ykkVar);
                b5 = b4;
            }
        } else {
            arrayList = null;
        }
        byte b9 = b5;
        if (arrayList != null) {
            akzxVarM4.u();
            yjx yjxVar = akzxVarM4.b;
            defpackage.alak alakVar = yjxVar.d;
            if (!alakVar.c()) {
                yjxVar.d = defpackage.alad.H(alakVar);
            }
            java.util.Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                yjxVar.d.g(((ykk) it3.next()).f);
            }
        } else {
            akzxVarM4.u();
            yjx yjxVar2 = akzxVarM4.b;
            j$.util.Objects.requireNonNull(strC);
            yjxVar2.b |= 1;
            yjxVar2.c = strC;
        }
        yjx yjxVarR = akzxVarM4.r();
        defpackage.aooh.e(yjxVarR, "build(...)");
        yjx yjxVar3 = yjxVarR;
        akzxVarM3.u();
        yka ykaVar7 = akzxVarM3.b;
        j$.util.Objects.requireNonNull(yjxVar3);
        ykaVar7.g = yjxVar3;
        ykaVar7.b |= 32;
        yka ykaVarR = akzxVarM3.r();
        defpackage.aooh.e(ykaVarR, "build(...)");
        yka ykaVar8 = ykaVarR;
        akzxVarM.u();
        yjz yjzVar3 = akzxVarM.b;
        j$.util.Objects.requireNonNull(ykaVar8);
        yjzVar3.b();
        yjzVar3.c.add(ykaVar8);
        ajyu ajyuVarE3 = abbbVar.e.E();
        if (ajyuVarE3 != null) {
            int i3 = 0;
            defpackage.aopq aopqVarC = defpackage.aooc.C(0, ajyuVarE3.w());
            arrayList2 = new java.util.ArrayList();
            aokj it4 = aopqVarC.iterator();
            while (((aopp) it4).a) {
                ajyu ajyuVarH = ajyuVarE3.H(it4.a());
                if (ajyuVarH == null) {
                    b = b7;
                    ykaVar = null;
                } else {
                    byte bU = ajyuVarH.u();
                    if (bU == b6 || bU == b7) {
                        byte b10 = b6;
                        ajyu ajyuVarG = ajyuVarH.G();
                        if (ajyuVarG != null) {
                            ajyu ajyuVarD = ajyuVarG.d();
                            if (ajyuVarD == null || (durationPlus = j$.time.Duration.ofSeconds(ajyuVarD.m()).plus(j$.time.Duration.ofNanos(ajyu.J(ajyuVarD)))) == null) {
                                durationPlus = j$.time.Duration.ZERO;
                                defpackage.aooh.e(durationPlus, "ZERO");
                            }
                            defpackage.akzx akzxVarM5 = ykaVar2.m();
                            java.lang.String strA = ajyuVarG.A();
                            if (strA == null) {
                                strA = "";
                            }
                            akzxVarM5.u();
                            yka ykaVar9 = akzxVarM5.b;
                            j$.util.Objects.requireNonNull(strA);
                            ykaVar9.b |= 1;
                            ykaVar9.c = strA;
                            java.lang.String strB = ajyuVarG.B();
                            if (strB == null) {
                                strB = "";
                            }
                            akzxVarM5.u();
                            yka ykaVar10 = akzxVarM5.b;
                            j$.util.Objects.requireNonNull(strB);
                            ykaVar10.b |= 2;
                            ykaVar10.d = strB;
                            long millis3 = durationPlus.toMillis();
                            akzxVarM5.u();
                            yka ykaVar11 = akzxVarM5.b;
                            ykaVar11.b |= 16;
                            ykaVar11.e = millis3;
                            int iA = ajyuVarH.a();
                            akzxVarM5.u();
                            yka ykaVar12 = akzxVarM5.b;
                            ykaVar12.b |= 2048;
                            ykaVar12.l = iA;
                            ajyu ajyuVarI = ajyuVarG.I();
                            if (ajyuVarI != null) {
                                if (ajyuVarI.q() > 0) {
                                    defpackage.aopq aopqVarC2 = defpackage.aooc.C(i3, ajyuVarI.q());
                                    arrayList3 = new java.util.ArrayList(defpackage.ajsz.bl(aopqVarC2, 10));
                                    aopp it5 = aopqVarC2.iterator();
                                    while (it5.a) {
                                        int iA2 = it5.a();
                                        defpackage.akzx akzxVarM6 = yjy.a.m();
                                        java.lang.String strValueOf = java.lang.String.valueOf(iA2);
                                        akzxVarM6.u();
                                        ajyu ajyuVar = ajyuVarE3;
                                        yjy yjyVar = akzxVarM6.b;
                                        j$.util.Objects.requireNonNull(strValueOf);
                                        aokj aokjVar = it4;
                                        yjyVar.b |= 1;
                                        yjyVar.c = strValueOf;
                                        float fP = ajyuVarI.p(iA2);
                                        akzxVarM6.u();
                                        yjy yjyVar2 = akzxVarM6.b;
                                        yjyVar2.b |= 2;
                                        yjyVar2.d = fP;
                                        arrayList3.add(akzxVarM6.r());
                                        ajyuVarE3 = ajyuVar;
                                        it4 = aokjVar;
                                    }
                                    ajyuVarE3 = ajyuVarE3;
                                    it4 = it4;
                                } else {
                                    ajyuVarE3 = ajyuVarE3;
                                    it4 = it4;
                                    defpackage.aopq aopqVarC3 = defpackage.aooc.C(0, ajyuVarI.r());
                                    java.util.ArrayList arrayList5 = new java.util.ArrayList(defpackage.ajsz.bl(aopqVarC3, 10));
                                    aopp it6 = aopqVarC3.iterator();
                                    while (it6.a) {
                                        int iA3 = it6.a();
                                        defpackage.akzx akzxVarM7 = yjy.a.m();
                                        ajyu ajyuVarF2 = ajyuVarI.F(iA3);
                                        java.lang.String str = (ajyuVarF2 == null || (strT = ajyuVarF2.t()) == null) ? "" : strT;
                                        akzxVarM7.u();
                                        yjy yjyVar3 = akzxVarM7.b;
                                        j$.util.Objects.requireNonNull(str);
                                        yjyVar3.b |= 1;
                                        yjyVar3.c = str;
                                        ajyu ajyuVarF3 = ajyuVarI.F(iA3);
                                        float fS = ajyuVarF3 != null ? ajyuVarF3.s() : 0.0f;
                                        akzxVarM7.u();
                                        yjy yjyVar4 = akzxVarM7.b;
                                        yjyVar4.b |= 2;
                                        yjyVar4.d = fS;
                                        arrayList5.add(akzxVarM7.r());
                                    }
                                    arrayList3 = arrayList5;
                                }
                                akzxVarM5.u();
                                yka ykaVar13 = akzxVarM5.b;
                                defpackage.alat alatVar = ykaVar13.f;
                                if (!alatVar.c()) {
                                    ykaVar13.f = defpackage.alad.J(alatVar);
                                }
                                defpackage.akyl.i(arrayList3, ykaVar13.f);
                            } else {
                                ajyuVarE3 = ajyuVarE3;
                                it4 = it4;
                            }
                            b = 3;
                            if (ajyuVarH.u() == 3 && ajyuVarG.z() > 0) {
                                byte b11 = b10 != ajyuVarG.C() ? (byte) 3 : b9;
                                akzxVarM5.u();
                                yka ykaVar14 = akzxVarM5.b;
                                ykaVar14.h = b11 - 1;
                                ykaVar14.b |= 256;
                                defpackage.akzx akzxVarM8 = ykf.a.m();
                                akzxVarM8.u();
                                ykf ykfVar2 = akzxVarM8.b;
                                ykfVar2.c = 1;
                                ykfVar2.b |= 1;
                                int iZ = ajyuVarG.z();
                                akzxVarM8.u();
                                ykf ykfVar3 = akzxVarM8.b;
                                ykfVar3.b |= 2;
                                ykfVar3.d = iZ;
                                ykf ykfVarR = akzxVarM8.r();
                                akzxVarM5.u();
                                yka ykaVar15 = akzxVarM5.b;
                                j$.util.Objects.requireNonNull(ykfVarR);
                                ykaVar15.b();
                                ykaVar15.i.add(ykfVarR);
                            }
                            ykaVar = (yka) akzxVarM5.r();
                        } else {
                            b = 3;
                            ykaVar = null;
                        }
                    } else if (bU != 5 || (bVarV = ajyuVarH.v()) == null) {
                        b = b7;
                        ykaVar = null;
                    } else {
                        ajyu ajyuVarD2 = bVarV.d();
                        if (ajyuVarD2 != null) {
                            b2 = b6;
                            durationPlus2 = j$.time.Duration.ofSeconds(ajyuVarD2.m()).plus(j$.time.Duration.ofNanos(ajyu.J(ajyuVarD2)));
                            if (durationPlus2 == null) {
                            }
                            defpackage.akzx akzxVarM9 = ykaVar2.m();
                            java.lang.String strValueOf2 = java.lang.String.valueOf(bVarV.a());
                            akzxVarM9.u();
                            yka ykaVar16 = akzxVarM9.b;
                            j$.util.Objects.requireNonNull(strValueOf2);
                            ykaVar16.b |= 1;
                            ykaVar16.c = strValueOf2;
                            java.lang.String strValueOf3 = java.lang.String.valueOf(bVarV.c());
                            akzxVarM9.u();
                            yka ykaVar17 = akzxVarM9.b;
                            j$.util.Objects.requireNonNull(strValueOf3);
                            ykaVar17.b |= 2;
                            ykaVar17.d = strValueOf3;
                            long millis4 = durationPlus2.toMillis();
                            akzxVarM9.u();
                            yka ykaVar18 = akzxVarM9.b;
                            ykaVar18.b |= 16;
                            ykaVar18.e = millis4;
                            int iA4 = ajyuVarH.a();
                            akzxVarM9.u();
                            yka ykaVar19 = akzxVarM9.b;
                            ykaVar19.b |= 2048;
                            ykaVar19.l = iA4;
                            defpackage.aopq aopqVarC4 = defpackage.aooc.C(i3, bVarV.b());
                            arrayList4 = new java.util.ArrayList();
                            it = aopqVarC4.iterator();
                            while (it.a) {
                                ajyuVarF = bVarV.f(it.a());
                                if (ajyuVarF != null) {
                                    defpackage.akzx akzxVarM10 = ykf.a.m();
                                    if (ajyuVarF.y() > 0) {
                                        b3 = b9;
                                    } else if (ajyu.J(ajyuVarF) > 0) {
                                        b3 = b7;
                                    } else {
                                        b3 = b2;
                                    }
                                    akzxVarM10.u();
                                    ykf ykfVar4 = akzxVarM10.b;
                                    ykfVar4.c = b3 - 1;
                                    ykfVar4.b |= 1;
                                    int iY = ajyuVarF.y() + ajyu.J(ajyuVarF);
                                    akzxVarM10.u();
                                    ykf ykfVar5 = akzxVarM10.b;
                                    ykfVar5.b |= 2;
                                    ykfVar5.d = iY;
                                    ykfVar = (ykf) akzxVarM10.r();
                                } else {
                                    ykfVar = null;
                                }
                                if (ykfVar != null) {
                                    arrayList4.add(ykfVar);
                                }
                                b7 = 3;
                            }
                            akzxVarM9.u();
                            yka ykaVar20 = akzxVarM9.b;
                            ykaVar20.b();
                            defpackage.akyl.i(arrayList4, ykaVar20.i);
                            ajyuVarE = bVarV.e();
                            if (ajyuVarE != null) {
                                iCR = defpackage.afsq.cR(ajyuVarE);
                            } else {
                                iCR = b2;
                            }
                            akzxVarM9.u();
                            yka ykaVar21 = akzxVarM9.b;
                            ykaVar21.j = iCR - 1;
                            ykaVar21.b |= 512;
                            ajyuVarE2 = bVarV.e();
                            if (ajyuVarE2 != null) {
                                iCQ = defpackage.afsq.cQ(ajyuVarE2.x());
                            } else {
                                iCQ = b2;
                            }
                            akzxVarM9.u();
                            yka ykaVar22 = akzxVarM9.b;
                            ykaVar22.k = iCQ - 1;
                            ykaVar22.b |= 1024;
                            ykaVar = (yka) akzxVarM9.r();
                            ajyuVarE3 = ajyuVarE3;
                            it4 = it4;
                            b = 3;
                        } else {
                            b2 = b6;
                        }
                        durationPlus2 = j$.time.Duration.ZERO;
                        defpackage.aooh.e(durationPlus2, "ZERO");
                        defpackage.akzx akzxVarM11 = ykaVar2.m();
                        java.lang.String strValueOf4 = java.lang.String.valueOf(bVarV.a());
                        akzxVarM11.u();
                        yka ykaVar110 = akzxVarM11.b;
                        j$.util.Objects.requireNonNull(strValueOf4);
                        ykaVar110.b |= 1;
                        ykaVar110.c = strValueOf4;
                        java.lang.String strValueOf5 = java.lang.String.valueOf(bVarV.c());
                        akzxVarM11.u();
                        yka ykaVar111 = akzxVarM11.b;
                        j$.util.Objects.requireNonNull(strValueOf5);
                        ykaVar111.b |= 2;
                        ykaVar111.d = strValueOf5;
                        long millis5 = durationPlus2.toMillis();
                        akzxVarM11.u();
                        yka ykaVar112 = akzxVarM11.b;
                        ykaVar112.b |= 16;
                        ykaVar112.e = millis5;
                        int iA5 = ajyuVarH.a();
                        akzxVarM11.u();
                        yka ykaVar113 = akzxVarM11.b;
                        ykaVar113.b |= 2048;
                        ykaVar113.l = iA5;
                        defpackage.aopq aopqVarC5 = defpackage.aooc.C(i3, bVarV.b());
                        arrayList4 = new java.util.ArrayList();
                        it = aopqVarC5.iterator();
                        while (it.a) {
                            ajyuVarF = bVarV.f(it.a());
                            if (ajyuVarF != null) {
                                defpackage.akzx akzxVarM12 = ykf.a.m();
                                if (ajyuVarF.y() > 0) {
                                    b3 = b9;
                                } else if (ajyu.J(ajyuVarF) > 0) {
                                    b3 = b7;
                                } else {
                                    b3 = b2;
                                }
                                akzxVarM12.u();
                                ykf ykfVar6 = akzxVarM12.b;
                                ykfVar6.c = b3 - 1;
                                ykfVar6.b |= 1;
                                int iY2 = ajyuVarF.y() + ajyu.J(ajyuVarF);
                                akzxVarM12.u();
                                ykf ykfVar7 = akzxVarM12.b;
                                ykfVar7.b |= 2;
                                ykfVar7.d = iY2;
                                ykfVar = (ykf) akzxVarM12.r();
                            } else {
                                ykfVar = null;
                            }
                            if (ykfVar != null) {
                                arrayList4.add(ykfVar);
                            }
                            b7 = 3;
                        }
                        akzxVarM11.u();
                        yka ykaVar23 = akzxVarM11.b;
                        ykaVar23.b();
                        defpackage.akyl.i(arrayList4, ykaVar23.i);
                        ajyuVarE = bVarV.e();
                        if (ajyuVarE != null) {
                            iCR = defpackage.afsq.cR(ajyuVarE);
                        } else {
                            iCR = b2;
                        }
                        akzxVarM11.u();
                        yka ykaVar24 = akzxVarM11.b;
                        ykaVar24.j = iCR - 1;
                        ykaVar24.b |= 512;
                        ajyuVarE2 = bVarV.e();
                        if (ajyuVarE2 != null) {
                            iCQ = defpackage.afsq.cQ(ajyuVarE2.x());
                        } else {
                            iCQ = b2;
                        }
                        akzxVarM11.u();
                        yka ykaVar25 = akzxVarM11.b;
                        ykaVar25.k = iCQ - 1;
                        ykaVar25.b |= 1024;
                        ykaVar = (yka) akzxVarM11.r();
                        ajyuVarE3 = ajyuVarE3;
                        it4 = it4;
                        b = 3;
                    }
                }
                if (ykaVar != null) {
                    arrayList2.add(ykaVar);
                }
                b7 = b;
                ajyuVarE3 = ajyuVarE3;
                it4 = it4;
                i3 = 0;
                b6 = 1;
            }
        } else {
            arrayList2 = defpackage.aokc.a;
        }
        akzxVarM.u();
        yjz yjzVar4 = akzxVarM.b;
        yjzVar4.b();
        defpackage.akyl.i(arrayList2, yjzVar4.c);
        akzxVarG.u();
        ykg ykgVar = akzxVarG.b;
        yjz yjzVarR = akzxVarM.r();
        ykg ykgVar2 = ykg.a;
        j$.util.Objects.requireNonNull(yjzVarR);
        ykgVar.c = yjzVarR;
        ykgVar.b |= 1;
        defpackage.alad aladVarR = akzxVarG.r();
        defpackage.aooh.e(aladVarR, "build(...)");
        f((ykg) aladVarR);
    }

    @Override // defpackage.abav
    public final void b(defpackage.aazd aazdVar, defpackage.akzc akzcVar, long j, long j2, abay abayVar, alez alezVar, aley aleyVar) {
        defpackage.aooh.f(aazdVar, "clientId");
        defpackage.aooh.f(akzcVar, "protectionToken");
        defpackage.aooh.f(abayVar, "classificationBackend");
        defpackage.aooh.f(alezVar, "status");
        defpackage.aooh.f(aleyVar, "errorMessage");
        defpackage.akzx akzxVarG = g(aazdVar, akzcVar, j);
        defpackage.akzx akzxVarM = yjw.a.m();
        akzxVarM.u();
        yjw yjwVar = akzxVarM.b;
        yjwVar.b |= 1;
        yjwVar.c = j2;
        int iC = abas.c(abayVar);
        akzxVarM.u();
        yjw yjwVar2 = akzxVarM.b;
        yjwVar2.d = iC - 1;
        yjwVar2.b |= 2;
        int iY = defpackage.aaoo.y(alezVar);
        akzxVarM.u();
        yjw yjwVar3 = akzxVarM.b;
        yjwVar3.e = iY - 1;
        yjwVar3.b |= 4;
        int iQ = xfh.q(aleyVar.a());
        int i = iQ != 0 ? iQ : 1;
        akzxVarM.u();
        yjw yjwVar4 = akzxVarM.b;
        yjwVar4.f = i - 1;
        yjwVar4.b |= 8;
        akzxVarG.u();
        ykg ykgVar = akzxVarG.b;
        yjw yjwVarR = akzxVarM.r();
        ykg ykgVar2 = ykg.a;
        j$.util.Objects.requireNonNull(yjwVarR);
        ykgVar.f = yjwVarR;
        ykgVar.b |= 16;
        defpackage.alad aladVarR = akzxVarG.r();
        defpackage.aooh.e(aladVarR, "build(...)");
        f((ykg) aladVarR);
    }

    @Override // defpackage.abav
    public final void c(defpackage.aazd aazdVar, long j, defpackage.akzc akzcVar, long j2, alez alezVar, aley aleyVar) {
        defpackage.aooh.f(akzcVar, "protectionToken");
        defpackage.aooh.f(alezVar, "status");
        defpackage.aooh.f(aleyVar, "errorMessage");
        if (alezVar == alez.a) {
            defpackage.akzx akzxVarG = g(aazdVar, akzcVar, j2);
            defpackage.akzx akzxVarM = yke.a.m();
            akzxVarM.u();
            yke ykeVar = akzxVarM.b;
            ykeVar.b |= 1;
            ykeVar.c = j;
            akzxVarG.u();
            ykg ykgVar = akzxVarG.b;
            yke ykeVarR = akzxVarM.r();
            ykg ykgVar2 = ykg.a;
            j$.util.Objects.requireNonNull(ykeVarR);
            ykgVar.h = ykeVarR;
            ykgVar.b |= 64;
            defpackage.alad aladVarR = akzxVarG.r();
            defpackage.aooh.e(aladVarR, "build(...)");
            f((ykg) aladVarR);
            return;
        }
        defpackage.akzx akzxVarG2 = g(aazdVar, akzcVar, j2);
        defpackage.akzx akzxVarM2 = ykd.a.m();
        akzxVarM2.u();
        ykd ykdVar = akzxVarM2.b;
        ykdVar.b |= 1;
        ykdVar.c = j;
        int iZ = defpackage.aaoo.z(alezVar);
        akzxVarM2.u();
        ykd ykdVar2 = akzxVarM2.b;
        ykdVar2.d = iZ - 1;
        ykdVar2.b |= 2;
        int iQ = xfh.q(aleyVar.a());
        int i = iQ != 0 ? iQ : 1;
        akzxVarM2.u();
        ykd ykdVar3 = akzxVarM2.b;
        ykdVar3.e = i - 1;
        ykdVar3.b |= 4;
        akzxVarG2.u();
        ykg ykgVar3 = akzxVarG2.b;
        ykd ykdVarR = akzxVarM2.r();
        ykg ykgVar4 = ykg.a;
        j$.util.Objects.requireNonNull(ykdVarR);
        ykgVar3.g = ykdVarR;
        ykgVar3.b |= 32;
        defpackage.alad aladVarR2 = akzxVarG2.r();
        defpackage.aooh.e(aladVarR2, "build(...)");
        f((ykg) aladVarR2);
    }

    @Override // defpackage.abav
    public final void d(defpackage.aazd aazdVar, defpackage.akzc akzcVar, ykh ykhVar) {
        defpackage.aooh.f(akzcVar, "protectionToken");
        defpackage.aooh.f(ykhVar, "protectionDownload");
        defpackage.akzx akzxVarG = g(aazdVar, akzcVar, 0L);
        akzxVarG.u();
        ykg ykgVar = akzxVarG.b;
        ykg ykgVar2 = ykg.a;
        j$.util.Objects.requireNonNull(ykhVar);
        ykgVar.e = ykhVar;
        ykgVar.b |= 8;
        defpackage.alad aladVarR = akzxVarG.r();
        defpackage.aooh.e(aladVarR, "build(...)");
        f((ykg) aladVarR);
    }

    @Override // defpackage.abav
    public final void e(defpackage.aazd aazdVar, int i) {
        if (((java.lang.Boolean) defpackage.aooh.p(this.c, java.lang.Boolean.FALSE)).booleanValue()) {
            defpackage.akzc akzcVar = defpackage.akzc.d;
            defpackage.aooh.e(akzcVar, "EMPTY");
            defpackage.akzx akzxVarG = g(aazdVar, akzcVar, 0L);
            defpackage.akzx akzxVarM = ykc.a.m();
            akzxVarM.u();
            ykc ykcVar = akzxVarM.b;
            ykcVar.b |= 1;
            ykcVar.c = 0L;
            akzxVarM.u();
            ykc ykcVar2 = akzxVarM.b;
            ykcVar2.d = i - 1;
            ykcVar2.b |= 2;
            akzxVarG.u();
            ykg ykgVar = akzxVarG.b;
            ykc ykcVarR = akzxVarM.r();
            ykg ykgVar2 = ykg.a;
            j$.util.Objects.requireNonNull(ykcVarR);
            ykgVar.i = ykcVarR;
            ykgVar.b |= 128;
            defpackage.alad aladVarR = akzxVarG.r();
            defpackage.aooh.e(aladVarR, "build(...)");
            f((ykg) aladVarR);
        }
    }
}
