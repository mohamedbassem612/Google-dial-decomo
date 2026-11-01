package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class abbb {
    public final j$.time.Duration a;
    public final akzc b;
    public final long c;
    public final defpackage.abay d;
    public final defpackage.ajyu e;

    public abbb(defpackage.ajyu ajyuVar, j$.time.Duration duration, akzc akzcVar, long j, defpackage.abay abayVar) {
        aooh.f(duration, "classifyDuration");
        aooh.f(akzcVar, "protectionToken");
        this.e = ajyuVar;
        this.a = duration;
        this.b = akzcVar;
        this.c = j;
        this.d = abayVar;
    }

    public final defpackage.abbg a() {
        defpackage.ajyu ajyuVarE = this.e.E();
        defpackage.abbg abbgVar = null;
        if (ajyuVarE != null) {
            defpackage.ajyu ajyuVar = new defpackage.ajyu();
            int iH = ajyuVarE.h(6);
            if (iH != 0) {
                int iG = ajyuVarE.g(iH + ajyuVarE.a);
                java.nio.ByteBuffer byteBuffer = ajyuVarE.b;
                aooh.e(byteBuffer, "bb");
                aooh.f(byteBuffer, "_bb");
                aooh.f(byteBuffer, "_bb");
                ajyuVar.l(iG, byteBuffer);
            } else {
                ajyuVar = null;
            }
            if (ajyuVar != null) {
                int iH2 = ajyuVar.h(4);
                aopq aopqVarC = aooc.C(0, iH2 != 0 ? ajyuVar.j(iH2) : 0);
                java.util.ArrayList arrayList = new java.util.ArrayList();
                defpackage.aokj aokjVarA = aopqVarC.a();
                while (((defpackage.aopp) aokjVarA).a) {
                    int iA = aokjVarA.a();
                    int iH3 = ajyuVar.h(4);
                    arrayList.add(new defpackage.aoiz(iH3 != 0 ? ajyuVar.b.get(ajyuVar.i(iH3) + iA) : (byte) 0));
                }
                abbgVar = new defpackage.abbg(arrayList);
            }
        }
        return abbgVar;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: abbe */
    /* JADX WARN: Code duplicated, block: B:27:0x0040 A[PHI: r1
      0x0040: PHI (r1v3 int) = (r1v2 int), (r1v5 int) binds: [B:20:0x0033, B:26:0x003e] A[DONT_GENERATE, DONT_INLINE]] */
    public final defpackage.abbi b() throws abbe {
        defpackage.ajyu ajyuVarD = this.e.D();
        if (ajyuVarD == null) {
            throw new abbe(alez.g, aley.k, (java.lang.String) null, (java.lang.Throwable) null, (akzc) null, 0L, (defpackage.abay) null, 124);
        }
        int iJ = defpackage.ajyu.J(ajyuVarD);
        java.lang.String str = "UNKNOWN";
        int i = 1;
        if (iJ != 0) {
            if (iJ == 1) {
                str = "NONE";
            } else if (iJ == 19) {
                str = "PHISHING";
            } else if (iJ == 22) {
                str = "SUSPICIOUS";
            } else if (iJ == 26) {
                str = "RECURRENT_SPAM_PATTERN";
            }
        }
        byte bO = ajyuVarD.o();
        if (bO != 0) {
            int i2 = 2;
            if (bO == 1) {
                i = i2;
            } else if (bO == 2) {
                i = 3;
            } else {
                i = 6;
                if (bO != 5) {
                    i2 = 7;
                    if (bO == 6) {
                        i = i2;
                    } else {
                        i = bO == 7 ? 8 : 4;
                    }
                }
            }
        }
        return new defpackage.abbi(str, i);
    }

    public final java.lang.String c() {
        defpackage.ajyu ajyuVar = this.e;
        int iH = ajyuVar.h(6);
        java.lang.String strK = iH != 0 ? ajyuVar.k(iH + ajyuVar.a) : null;
        return strK == null ? "" : strK;
    }

    public final java.util.List d() {
        defpackage.ajyu ajyuVar;
        defpackage.aokj aokjVar;
        int i;
        defpackage.abbd abbdVar;
        java.util.Map mapAQ;
        java.lang.String strT;
        java.util.Map mapAR;
        java.lang.Integer numValueOf;
        int iH;
        defpackage.ajyu ajyuVarE = this.e.E();
        if (ajyuVarE == null) {
            return aokc.a;
        }
        int i2 = 0;
        aopq aopqVarC = aooc.C(0, ajyuVarE.w());
        java.util.ArrayList arrayList = new java.util.ArrayList();
        defpackage.aokj aokjVarA = aopqVarC.a();
        while (((defpackage.aopp) aokjVarA).a) {
            defpackage.ajyu ajyuVarH = ajyuVarE.H(aokjVarA.a());
            if (ajyuVarH == null) {
                ajyuVar = ajyuVarE;
                aokjVar = aokjVarA;
                i = i2;
                abbdVar = null;
            } else {
                byte bU = ajyuVarH.u();
                if (bU == 1 || bU == 3) {
                    ajyuVar = ajyuVarE;
                    aokjVar = aokjVarA;
                    defpackage.ajyu ajyuVarG = ajyuVarH.G();
                    if (ajyuVarG != null) {
                        java.lang.String strA = ajyuVarG.A();
                        java.lang.String str = strA == null ? "" : strA;
                        java.lang.String strB = ajyuVarG.B();
                        java.lang.String str2 = strB == null ? "" : strB;
                        defpackage.ajyu ajyuVarI = ajyuVarG.I();
                        if (ajyuVarI != null) {
                            aopq aopqVarC2 = aooc.C(0, ajyuVarI.q());
                            java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(aooc.t(ajsz.aL(ajsz.bl(aopqVarC2, 10)), 16));
                            defpackage.aokj aokjVarA2 = aopqVarC2.a();
                            while (((defpackage.aopp) aokjVarA2).a) {
                                int iA = aokjVarA2.a();
                                linkedHashMap.put(java.lang.String.valueOf(iA), java.lang.Float.valueOf(ajyuVarI.p(iA)));
                            }
                            i = 0;
                            aopq aopqVarC3 = aooc.C(0, ajyuVarI.r());
                            java.util.LinkedHashMap linkedHashMap2 = new java.util.LinkedHashMap(aooc.t(ajsz.aL(ajsz.bl(aopqVarC3, 10)), 16));
                            defpackage.aokj aokjVarA3 = aopqVarC3.a();
                            while (((defpackage.aopp) aokjVarA3).a) {
                                int iA2 = aokjVarA3.a();
                                defpackage.ajyu ajyuVarF = ajyuVarI.F(iA2);
                                if (ajyuVarF == null || (strT = ajyuVarF.t()) == null) {
                                    strT = "";
                                }
                                defpackage.ajyu ajyuVarF2 = ajyuVarI.F(iA2);
                                linkedHashMap2.put(strT, java.lang.Float.valueOf(ajyuVarF2 != null ? ajyuVarF2.s() : 0.0f));
                            }
                            mapAQ = ajsz.aQ(linkedHashMap, linkedHashMap2);
                        } else {
                            i = 0;
                            mapAQ = null;
                        }
                        abbdVar = new defpackage.abbd(str, str2, mapAQ, ajyuVarG.z(), ajyuVarG.C());
                    } else {
                        i = 0;
                        abbdVar = null;
                    }
                } else {
                    int i3 = 4;
                    if (bU == 4) {
                        defpackage.ajyu ajyuVar2 = new defpackage.ajyu();
                        int iH2 = ajyuVarH.h(10);
                        if (iH2 != 0) {
                            int iG = ajyuVarH.g(iH2 + ajyuVarH.a);
                            java.nio.ByteBuffer byteBuffer = ajyuVarH.b;
                            aooh.e(byteBuffer, "bb");
                            aooh.f(byteBuffer, "_bb");
                            aooh.f(byteBuffer, "_bb");
                            ajyuVar2.l(iG, byteBuffer);
                        } else {
                            ajyuVar2 = null;
                        }
                        if (ajyuVar2 != null) {
                            int iH3 = ajyuVar2.h(4);
                            java.lang.String strK = iH3 != 0 ? ajyuVar2.k(iH3 + ajyuVar2.a) : null;
                            int i4 = 6;
                            int iH4 = ajyuVar2.h(6);
                            java.lang.String strK2 = iH4 != 0 ? ajyuVar2.k(iH4 + ajyuVar2.a) : null;
                            defpackage.ajyu ajyuVar3 = new defpackage.ajyu();
                            int iH5 = ajyuVar2.h(8);
                            if (iH5 != 0) {
                                int iG2 = ajyuVar2.g(iH5 + ajyuVar2.a);
                                java.nio.ByteBuffer byteBuffer2 = ajyuVar2.b;
                                aooh.e(byteBuffer2, "bb");
                                aooh.f(byteBuffer2, "_bb");
                                aooh.f(byteBuffer2, "_bb");
                                ajyuVar3.l(iG2, byteBuffer2);
                            } else {
                                ajyuVar3 = null;
                            }
                            if (ajyuVar3 != null) {
                                int iH6 = ajyuVar3.h(4);
                                aopq aopqVarC4 = aooc.C(i2, iH6 != 0 ? ajyuVar3.j(iH6) : i2);
                                java.util.ArrayList<defpackage.ajyu> arrayList2 = new java.util.ArrayList();
                                defpackage.aokj aokjVarA4 = aopqVarC4.a();
                                while (((defpackage.aopp) aokjVarA4).a) {
                                    int iA3 = aokjVarA4.a();
                                    defpackage.ajyu ajyuVar4 = new defpackage.ajyu();
                                    int iH7 = ajyuVar3.h(4);
                                    if (iH7 != 0) {
                                        int iG3 = ajyuVar3.g(ajyuVar3.i(iH7) + (iA3 << 2));
                                        java.nio.ByteBuffer byteBuffer3 = ajyuVar3.b;
                                        aooh.e(byteBuffer3, "bb");
                                        aooh.f(byteBuffer3, "_bb");
                                        aooh.f(byteBuffer3, "_bb");
                                        ajyuVar4.l(iG3, byteBuffer3);
                                    } else {
                                        ajyuVar4 = null;
                                    }
                                    if (ajyuVar4 != null) {
                                        arrayList2.add(ajyuVar4);
                                    }
                                }
                                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                                for (defpackage.ajyu ajyuVar5 : arrayList2) {
                                    int iH8 = ajyuVar5.h(i4);
                                    int i5 = iH8 != 0 ? ajyuVar5.b.getInt(iH8 + ajyuVar5.a) : 0;
                                    java.lang.StringBuilder sb = new java.lang.StringBuilder();
                                    sb.append(i5);
                                    sb.append(':');
                                    java.lang.String string = sb.toString();
                                    int iH9 = ajyuVar5.h(i3);
                                    aopq aopqVarC5 = aooc.C(0, iH9 != 0 ? ajyuVar5.j(iH9) : 0);
                                    java.util.ArrayList<defpackage.ajyu> arrayList4 = new java.util.ArrayList(ajsz.bl(aopqVarC5, 10));
                                    defpackage.aokj aokjVarA5 = aopqVarC5.a();
                                    while (((defpackage.aopp) aokjVarA5).a) {
                                        int iA4 = aokjVarA5.a();
                                        defpackage.ajyu ajyuVar6 = new defpackage.ajyu();
                                        defpackage.ajyu ajyuVar7 = ajyuVarE;
                                        defpackage.aokj aokjVar2 = aokjVarA;
                                        int iH10 = ajyuVar5.h(4);
                                        if (iH10 != 0) {
                                            int iG4 = ajyuVar5.g(ajyuVar5.i(iH10) + (iA4 << 2));
                                            java.nio.ByteBuffer byteBuffer4 = ajyuVar5.b;
                                            aooh.e(byteBuffer4, "bb");
                                            aooh.f(byteBuffer4, "_bb");
                                            aooh.f(byteBuffer4, "_bb");
                                            ajyuVar6.l(iG4, byteBuffer4);
                                        } else {
                                            ajyuVar6 = null;
                                        }
                                        arrayList4.add(ajyuVar6);
                                        ajyuVarE = ajyuVar7;
                                        aokjVarA = aokjVar2;
                                    }
                                    defpackage.ajyu ajyuVar8 = ajyuVarE;
                                    defpackage.aokj aokjVar3 = aokjVarA;
                                    java.util.ArrayList arrayList5 = new java.util.ArrayList(ajsz.bl(arrayList4, 10));
                                    for (defpackage.ajyu ajyuVar9 : arrayList4) {
                                        if (ajyuVar9 != null) {
                                            int iH11 = ajyuVar9.h(4);
                                            numValueOf = java.lang.Integer.valueOf(iH11 != 0 ? ajyuVar9.b.getInt(iH11 + ajyuVar9.a) : 0);
                                        } else {
                                            numValueOf = null;
                                        }
                                        arrayList5.add(new aoiu(string.concat(java.lang.String.valueOf(numValueOf)), java.lang.Float.valueOf((ajyuVar9 == null || (iH = ajyuVar9.h(6)) == 0) ? 0.0f : ajyuVar9.b.getFloat(iH + ajyuVar9.a))));
                                    }
                                    i4 = 6;
                                    ajsz.bv(arrayList3, arrayList5);
                                    ajyuVarE = ajyuVar8;
                                    aokjVarA = aokjVar3;
                                    i3 = 4;
                                }
                                ajyuVar = ajyuVarE;
                                aokjVar = aokjVarA;
                                mapAR = ajsz.aR(arrayList3);
                            } else {
                                ajyuVar = ajyuVarE;
                                aokjVar = aokjVarA;
                                mapAR = null;
                            }
                            abbdVar = new defpackage.abbd(strK == null ? "" : strK, strK2 == null ? "" : strK2, mapAR, 0, false);
                            i = 0;
                        }
                    }
                    ajyuVar = ajyuVarE;
                    aokjVar = aokjVarA;
                    i = i2;
                    abbdVar = null;
                }
            }
            if (abbdVar != null) {
                arrayList.add(abbdVar);
            }
            i2 = i;
            ajyuVarE = ajyuVar;
            aokjVarA = aokjVar;
        }
        return arrayList;
    }
}
