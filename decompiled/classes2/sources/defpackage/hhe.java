package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public /* synthetic */ class hhe {
    public static /* synthetic */ defpackage.heq A(akzx akzxVar) {
        aooh.f(akzxVar, "builder");
        return new defpackage.heq(akzxVar);
    }

    public static /* synthetic */ defpackage.her B(akzx akzxVar) {
        aooh.f(akzxVar, "builder");
        return new defpackage.her(akzxVar, (byte[]) null);
    }

    public static /* synthetic */ defpackage.hgw C(akzx akzxVar) {
        aooh.f(akzxVar, "builder");
        return new defpackage.hgw(akzxVar);
    }

    public static /* synthetic */ java.lang.String D(int i) {
        if (i == 2) {
            return "NO_BUTTON";
        }
        if (i == 3) {
            return "DOWNLOAD_MODEL";
        }
        if (i == 4) {
            return "UPDATE_GSA";
        }
        if (i != 5) {
            return i != 6 ? "UNRECOGNIZED" : "TRY_AGAIN";
        }
        return "DOWNLOAD_VOICE";
    }

    public static void E(aw awVar, defpackage.lif lifVar) {
        ahvr.e(awVar, defpackage.lie.class, new defpackage.kwp(lifVar, 14));
    }

    public static void F(defpackage.al alVar, defpackage.lhw lhwVar) {
        ahvr.d(alVar, ahtd.class, new defpackage.kwp(lhwVar, 12));
        ahvr.d(alVar, ahtf.class, new defpackage.kwp(lhwVar, 13));
    }

    public static void G(defpackage.ger gerVar, defpackage.lhh lhhVar) {
        ahvr.e(gerVar, defpackage.lir.class, new defpackage.kwp(lhhVar, 11));
    }

    public static j$.util.Optional H(j$.util.Optional optional, java.lang.String str) {
        defpackage.kdb kdbVar = new defpackage.kdb(str, 11);
        if (true != optional.isPresent()) {
            return optional;
        }
        return j$.util.Optional.ofNullable(defpackage.adnw.a((java.io.File) optional.get(), (java.lang.String) kdbVar.a));
    }

    public static ldy I(android.content.Context context) {
        return (ldy) agab.aH(context, ldy.class);
    }

    public static ldv J(android.content.Context context) {
        return (ldv) agab.aH(context, ldv.class);
    }

    public static ldg K(android.content.Context context) {
        return (ldg) agab.aH(context, ldg.class);
    }

    public static void L(defpackage.al alVar) {
        ahvr.d(alVar, ahtd.class, new defpackage.iya(10));
        ahvr.d(alVar, ahtf.class, new defpackage.iya(11));
    }

    public static void M(defpackage.al alVar) {
        ahvr.d(alVar, ahtd.class, new defpackage.iya(8));
        ahvr.d(alVar, ahtf.class, new defpackage.iya(9));
    }

    public static void N(defpackage.al alVar) {
        ahvr.d(alVar, ahtd.class, new defpackage.iya(6));
        ahvr.d(alVar, ahtf.class, new defpackage.iya(7));
    }

    public static void O(defpackage.al alVar) {
        ahvr.d(alVar, ahtd.class, new defpackage.iya(4));
        ahvr.d(alVar, ahtf.class, new defpackage.iya(5));
    }

    public static void P(defpackage.ger gerVar, defpackage.kzs kzsVar) {
        ahvr.e(gerVar, defpackage.kze.class, new defpackage.kwp(kzsVar, 5));
        ahvr.e(gerVar, defpackage.kzw.class, new defpackage.kwp(kzsVar, 6));
        ahvr.e(gerVar, defpackage.lah.class, new defpackage.kwp(kzsVar, 7));
        ahvr.e(gerVar, defpackage.lbd.class, new defpackage.kwp(kzsVar, 8));
    }

    public static void Q(defpackage.al alVar, defpackage.kzf kzfVar) {
        ahvr.d(alVar, ahtf.class, new defpackage.kwp(kzfVar, 4));
    }

    public static /* synthetic */ int R(long j) {
        int i = (int) j;
        if (j == i) {
            return i;
        }
        throw new java.lang.ArithmeticException();
    }

    public static void S(defpackage.al alVar, defpackage.kyg kygVar) {
        ahvr.d(alVar, ahtd.class, new defpackage.kwp(kygVar, 2));
        ahvr.d(alVar, ahtf.class, new defpackage.kwp(kygVar, 3));
    }

    private static java.lang.String T(long j, android.icu.text.MeasureFormat measureFormat) {
        long j2 = j / 1000;
        java.lang.String strM = fh$.ExternalSyntheticApiModelOutline0.m(measureFormat, j2 == 60 ? new android.icu.util.Measure(1, fh$.ExternalSyntheticApiModelOutline0.m()) : new android.icu.util.Measure(java.lang.Long.valueOf(j2), fh$.ExternalSyntheticApiModelOutline0.m$1()));
        aooh.e(strM, "format(...)");
        return strM;
    }

    private static java.lang.String U(long j) {
        java.lang.String elapsedTime = android.text.format.DateUtils.formatElapsedTime(j / 1000);
        aooh.e(elapsedTime, "formatElapsedTime(...)");
        return elapsedTime;
    }

    public static androidx.car.app.model.CarColor a(defpackage.tt ttVar, boolean z) {
        if (z) {
            return androidx.car.app.model.CarColor.createCustom(ttVar.getColor(2131101250), ttVar.getColor(2131101251));
        }
        androidx.car.app.model.CarColor carColor = androidx.car.app.model.CarColor.DEFAULT;
        aooh.e(carColor, "DEFAULT");
        return carColor;
    }

    public static androidx.car.app.model.CarIcon b(defpackage.tt ttVar, int i, boolean z) {
        defpackage.wj wjVar = new defpackage.wj(androidx.core.graphics.drawable.IconCompat.g(ttVar, i));
        androidx.car.app.model.CarColor carColorCreateCustom = z ? androidx.car.app.model.CarColor.createCustom(-16777216, -1) : androidx.car.app.model.CarColor.DEFAULT;
        defpackage.zj.a.a((androidx.car.app.model.CarColor) j$.util.Objects.requireNonNull(carColorCreateCustom));
        java.lang.Object obj = wjVar.c;
        wl wlVar = null;
        if (obj == null) {
            defpackage.wk wkVar = new defpackage.wk(androidx.car.app.model.CarIconStyle.TINTED);
            wkVar.a(carColorCreateCustom);
            wjVar.c = new androidx.car.app.model.CarIconStyle(wkVar, wlVar);
        } else {
            defpackage.wk wkVar2 = new defpackage.wk((androidx.car.app.model.CarIconStyle) obj);
            wkVar2.a(carColorCreateCustom);
            wjVar.c = new androidx.car.app.model.CarIconStyle(wkVar2, wlVar);
        }
        return new androidx.car.app.model.CarIcon(wjVar);
    }

    public static int c(int i) {
        return i == 1 ? alau.a() : i - 2;
    }

    public static int d(int i) {
        if (i != 0) {
            return i != 1 ? 0 : 3;
        }
        return 2;
    }

    public static void e(defpackage.ger gerVar, defpackage.jcp jcpVar) {
        ahvr.e(gerVar, tyr.class, new defpackage.hwo(jcpVar, 13));
    }

    public static j$.nio.file.Path f(j$.nio.file.Path path, android.telecom.PhoneAccountHandle phoneAccountHandle, android.net.Uri uri) {
        aooh.f(path, "parentDir");
        aooh.f(phoneAccountHandle, "phoneAccount");
        java.lang.String id = phoneAccountHandle.getId();
        java.util.Objects.toString(uri);
        j$.nio.file.Path path2 = j$.nio.file.Paths.get(path.toString(), new java.lang.String[]{java.lang.String.valueOf(aoov.Q(aoov.Q(aoov.Q(aoov.Q(java.lang.String.valueOf(id).concat(uri.toString()), "\\", ""), "/", ""), ".", ""), ":", "")).concat(".amr")});
        aooh.e(path2, "get(...)");
        return path2;
    }

    public static csm g(cav cavVar) {
        return new csm(((dpf) cavVar.e(dfo.e)).dl(24.0f), 0.0f, 1, 0, 26);
    }

    public static defpackage.jac h(ccp ccpVar) {
        return (defpackage.jac) ccpVar.a();
    }

    public static void i(defpackage.jad jadVar, defpackage.jac jacVar, aonj aonjVar, boolean z, cav cavVar, int i) {
        int i2;
        boolean z2;
        int i3 = i & 6;
        cav cavVarB = cavVar.b(1268583175);
        if (i3 == 0) {
            i2 = (true != cavVarB.B(jadVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != cavVarB.z(jacVar.ordinal()) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != cavVarB.D(aonjVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != cavVarB.C(z) ? 1024 : 2048;
        }
        if (cavVarB.H((i2 & 1171) != 1170, i2 & 1)) {
            z2 = z;
            den.bz(z2, (cmw) null, aga.n(den.al(cavVarB).a(), 2), aga.o(den.al(cavVarB).a(), 2), (java.lang.String) null, cfo.j(282149343, new jai(jacVar, jadVar, aonjVar, 0), cavVarB), cavVarB, ((i2 >> 9) & 14) | 196608, 18);
        } else {
            z2 = z;
            cavVarB.s();
        }
        cdk cdkVarI = cavVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new ppv(jadVar, jacVar, aonjVar, z2, i, 1);
        }
    }

    /* JADX WARN: Code duplicated, block: B:57:0x013f  */
    public static void j(cmw cmwVar, defpackage.izt iztVar, cav cavVar, int i) {
        int i2;
        cav cavVar2;
        boolean z;
        java.lang.Object objR;
        cbt cbtVar;
        defpackage.izt iztVar2 = iztVar;
        int i3 = i & 6;
        cav cavVarB = cavVar.b(2108226755);
        final int i4 = 1;
        if (i3 == 0) {
            i2 = i | (true != cavVarB.B(cmwVar) ? 2 : 4);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != ((i & 64) == 0 ? cavVarB.B(iztVar2) : cavVarB.D(iztVar2)) ? 16 : 32;
        }
        if (cavVarB.H((i2 & 19) != 18, i2 & 1)) {
            cmw cmwVarD = azm.d(cmwVar, 1.0f);
            cye cyeVarA = azh.a(awi.g, cmh.m, cavVarB, 6);
            cbt cbtVar2 = (cbt) cavVarB;
            int iM = anty.M(cbtVar2.x);
            cje cjeVarAi = cbtVar2.ai();
            cmw cmwVarM = cfo.m(cavVarB, cmwVarD);
            aomy aomyVar = dam.a;
            cavVarB.v();
            if (cbtVar2.w) {
                cavVarB.j(aomyVar);
            } else {
                cavVarB.x();
            }
            cev.c(cavVarB, cyeVarA, dam.e);
            cev.c(cavVarB, cjeVarAi, dam.d);
            cev.c(cavVarB, java.lang.Integer.valueOf(iM), dam.f);
            cev.b(cavVarB, dam.g);
            cev.c(cavVarB, cmwVarM, dam.c);
            ayy ayyVar = defpackage.acpl.a;
            final float f = defpackage.acpl.d;
            cmt cmtVar = cmw.c;
            cmw cmwVarBa = den.ba(azm.f(cmtVar, f, Float.NaN), 24.0f, 0.0f, 8.0f, 0.0f);
            ayy ayyVarH = defpackage.acpl.h(f);
            boolean z2 = iztVar2 instanceof defpackage.izs;
            int i5 = i2 & 112;
            boolean z3 = i5 == 32 || ((i2 & 64) != 0 && cavVarB.D(iztVar2));
            java.lang.Object objR2 = cbtVar2.R();
            if (z3 || objR2 == cau.a) {
                objR2 = new defpackage.hll(iztVar2, 17);
                cbtVar2.ab(objR2);
            }
            int i6 = i2;
            aaoo.am((aomy) objR2, cmwVarBa, z2, (crd) null, (bni) null, ayyVarH, cfo.j(-432846782, new aono() { // from class: jah
                public final java.lang.Object a(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                    float f2;
                    float f3;
                    if (i4 == 0) {
                        cav cavVar3 = (cav) obj2;
                        int iIntValue = ((java.lang.Integer) obj3).intValue();
                        aooh.f((azj) obj, "$this$Button");
                        int i7 = iIntValue & 17;
                        if (cavVar3.H(i7 != 16, iIntValue & 1)) {
                            float f4 = f;
                            java.lang.String strF = dfa.f(2132019844, cavVar3);
                            ayy ayyVar2 = defpackage.acpl.a;
                            ayy ayyVar3 = bnj.a;
                            abrz.k(strF, (cmw) null, 0L, 0L, (dnd) null, (dmq) null, 0L, (dot) null, 0L, 0, false, 0, 0, (aonj) null, bnj.d(f4, cavVar3), cavVar3, 0, 0, 131070);
                        } else {
                            cavVar3.s();
                        }
                        return aojh.a;
                    }
                    cav cavVar4 = (cav) obj2;
                    int iIntValue2 = ((java.lang.Integer) obj3).intValue();
                    aooh.f((azj) obj, "$this$TextButton");
                    if (cavVar4.H((iIntValue2 & 17) != 16, iIntValue2 & 1)) {
                        float f5 = f;
                        cmt cmtVar2 = cmw.c;
                        ayy ayyVar4 = defpackage.acpl.a;
                        float fC = defpackage.acpl.c();
                        float f6 = defpackage.acpl.d;
                        float f7 = defpackage.acpl.e;
                        float f8 = defpackage.acpl.f;
                        if (dpi.a(f5, fC) < 0) {
                            f2 = defpackage.acpl.i;
                        } else if (dpi.a(f5, f6) < 0) {
                            f2 = defpackage.acpl.h;
                        } else if (dpi.a(f5, f7) < 0) {
                            f2 = defpackage.acpl.j;
                        } else {
                            f2 = dpi.a(f5, f8) < 0 ? defpackage.acpl.k : defpackage.acpl.l;
                        }
                        aaoo.V(wv.k(2131231578, cavVar4, 0), (java.lang.String) null, azm.g(cmtVar2, f2), 0L, cavVar4, 56, 8);
                        if (dpi.a(f5, defpackage.acpl.c()) < 0) {
                            f3 = defpackage.acpl.n;
                        } else if (dpi.a(f5, f6) < 0) {
                            f3 = defpackage.acpl.m;
                        } else if (dpi.a(f5, f7) < 0) {
                            f3 = defpackage.acpl.o;
                        } else {
                            f3 = dpi.a(f5, f8) < 0 ? defpackage.acpl.p : defpackage.acpl.q;
                        }
                        den.aR(azm.g(cmtVar2, f3), cavVar4);
                        java.lang.String strF2 = dfa.f(2132019840, cavVar4);
                        ayy ayyVar5 = bnj.a;
                        abrz.k(strF2, (cmw) null, 0L, 0L, (dnd) null, (dmq) null, 0L, (dot) null, 0L, 0, false, 0, 0, (aonj) null, bnj.d(f5, cavVar4), cavVar4, 0, 0, 131070);
                    } else {
                        cavVar4.s();
                    }
                    return aojh.a;
                }
            }, cavVarB), cavVarB, 805306368, 376);
            cmw cmwVarBa2 = den.ba(azm.f(cmtVar, f, Float.NaN), 8.0f, 0.0f, 24.0f, 0.0f);
            ayy ayyVarH2 = defpackage.acpl.h(f);
            if (i5 != 32) {
                iztVar2 = iztVar;
                z = (i6 & 64) != 0 && cavVarB.D(iztVar2);
                objR = cbtVar2.R();
                if (!z || objR == cau.a) {
                    objR = new defpackage.hll(iztVar2, 18);
                    cbtVar = cbtVar2;
                    cbtVar.ab(objR);
                } else {
                    cbtVar = cbtVar2;
                }
                final int i7 = 0;
                aaoo.ak((aomy) objR, cmwVarBa2, z2, (crd) null, (bni) null, (defpackage.bnm) null, (amu) null, ayyVarH2, cfo.j(923964911, new aono() { // from class: jah
                    public final java.lang.Object a(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                        float f2;
                        float f3;
                        if (i7 == 0) {
                            cav cavVar3 = (cav) obj2;
                            int iIntValue = ((java.lang.Integer) obj3).intValue();
                            aooh.f((azj) obj, "$this$Button");
                            int i8 = iIntValue & 17;
                            if (cavVar3.H(i8 != 16, iIntValue & 1)) {
                                float f4 = f;
                                java.lang.String strF = dfa.f(2132019844, cavVar3);
                                ayy ayyVar2 = defpackage.acpl.a;
                                ayy ayyVar3 = bnj.a;
                                abrz.k(strF, (cmw) null, 0L, 0L, (dnd) null, (dmq) null, 0L, (dot) null, 0L, 0, false, 0, 0, (aonj) null, bnj.d(f4, cavVar3), cavVar3, 0, 0, 131070);
                            } else {
                                cavVar3.s();
                            }
                            return aojh.a;
                        }
                        cav cavVar4 = (cav) obj2;
                        int iIntValue2 = ((java.lang.Integer) obj3).intValue();
                        aooh.f((azj) obj, "$this$TextButton");
                        if (cavVar4.H((iIntValue2 & 17) != 16, iIntValue2 & 1)) {
                            float f5 = f;
                            cmt cmtVar2 = cmw.c;
                            ayy ayyVar4 = defpackage.acpl.a;
                            float fC = defpackage.acpl.c();
                            float f6 = defpackage.acpl.d;
                            float f7 = defpackage.acpl.e;
                            float f8 = defpackage.acpl.f;
                            if (dpi.a(f5, fC) < 0) {
                                f2 = defpackage.acpl.i;
                            } else if (dpi.a(f5, f6) < 0) {
                                f2 = defpackage.acpl.h;
                            } else if (dpi.a(f5, f7) < 0) {
                                f2 = defpackage.acpl.j;
                            } else {
                                f2 = dpi.a(f5, f8) < 0 ? defpackage.acpl.k : defpackage.acpl.l;
                            }
                            aaoo.V(wv.k(2131231578, cavVar4, 0), (java.lang.String) null, azm.g(cmtVar2, f2), 0L, cavVar4, 56, 8);
                            if (dpi.a(f5, defpackage.acpl.c()) < 0) {
                                f3 = defpackage.acpl.n;
                            } else if (dpi.a(f5, f6) < 0) {
                                f3 = defpackage.acpl.m;
                            } else if (dpi.a(f5, f7) < 0) {
                                f3 = defpackage.acpl.o;
                            } else {
                                f3 = dpi.a(f5, f8) < 0 ? defpackage.acpl.p : defpackage.acpl.q;
                            }
                            den.aR(azm.g(cmtVar2, f3), cavVar4);
                            java.lang.String strF2 = dfa.f(2132019840, cavVar4);
                            ayy ayyVar5 = bnj.a;
                            abrz.k(strF2, (cmw) null, 0L, 0L, (dnd) null, (dmq) null, 0L, (dot) null, 0L, 0, false, 0, 0, (aonj) null, bnj.d(f5, cavVar4), cavVar4, 0, 0, 131070);
                        } else {
                            cavVar4.s();
                        }
                        return aojh.a;
                    }
                }, cavVarB), cavVarB, 805306368, 376);
                cavVar2 = cavVarB;
                cbtVar.W(true);
            } else {
                iztVar2 = iztVar;
            }
            objR = cbtVar2.R();
            if (z) {
                objR = new defpackage.hll(iztVar2, 18);
                cbtVar = cbtVar2;
                cbtVar.ab(objR);
            } else {
                objR = new defpackage.hll(iztVar2, 18);
                cbtVar = cbtVar2;
                cbtVar.ab(objR);
            }
            final int i8 = 0;
            aaoo.ak((aomy) objR, cmwVarBa2, z2, (crd) null, (bni) null, (defpackage.bnm) null, (amu) null, ayyVarH2, cfo.j(923964911, new aono() { // from class: jah
                public final java.lang.Object a(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                    float f2;
                    float f3;
                    if (i8 == 0) {
                        cav cavVar3 = (cav) obj2;
                        int iIntValue = ((java.lang.Integer) obj3).intValue();
                        aooh.f((azj) obj, "$this$Button");
                        int i9 = iIntValue & 17;
                        if (cavVar3.H(i9 != 16, iIntValue & 1)) {
                            float f4 = f;
                            java.lang.String strF = dfa.f(2132019844, cavVar3);
                            ayy ayyVar2 = defpackage.acpl.a;
                            ayy ayyVar3 = bnj.a;
                            abrz.k(strF, (cmw) null, 0L, 0L, (dnd) null, (dmq) null, 0L, (dot) null, 0L, 0, false, 0, 0, (aonj) null, bnj.d(f4, cavVar3), cavVar3, 0, 0, 131070);
                        } else {
                            cavVar3.s();
                        }
                        return aojh.a;
                    }
                    cav cavVar4 = (cav) obj2;
                    int iIntValue2 = ((java.lang.Integer) obj3).intValue();
                    aooh.f((azj) obj, "$this$TextButton");
                    if (cavVar4.H((iIntValue2 & 17) != 16, iIntValue2 & 1)) {
                        float f5 = f;
                        cmt cmtVar2 = cmw.c;
                        ayy ayyVar4 = defpackage.acpl.a;
                        float fC = defpackage.acpl.c();
                        float f6 = defpackage.acpl.d;
                        float f7 = defpackage.acpl.e;
                        float f8 = defpackage.acpl.f;
                        if (dpi.a(f5, fC) < 0) {
                            f2 = defpackage.acpl.i;
                        } else if (dpi.a(f5, f6) < 0) {
                            f2 = defpackage.acpl.h;
                        } else if (dpi.a(f5, f7) < 0) {
                            f2 = defpackage.acpl.j;
                        } else {
                            f2 = dpi.a(f5, f8) < 0 ? defpackage.acpl.k : defpackage.acpl.l;
                        }
                        aaoo.V(wv.k(2131231578, cavVar4, 0), (java.lang.String) null, azm.g(cmtVar2, f2), 0L, cavVar4, 56, 8);
                        if (dpi.a(f5, defpackage.acpl.c()) < 0) {
                            f3 = defpackage.acpl.n;
                        } else if (dpi.a(f5, f6) < 0) {
                            f3 = defpackage.acpl.m;
                        } else if (dpi.a(f5, f7) < 0) {
                            f3 = defpackage.acpl.o;
                        } else {
                            f3 = dpi.a(f5, f8) < 0 ? defpackage.acpl.p : defpackage.acpl.q;
                        }
                        den.aR(azm.g(cmtVar2, f3), cavVar4);
                        java.lang.String strF2 = dfa.f(2132019840, cavVar4);
                        ayy ayyVar5 = bnj.a;
                        abrz.k(strF2, (cmw) null, 0L, 0L, (dnd) null, (dmq) null, 0L, (dot) null, 0L, 0, false, 0, 0, (aonj) null, bnj.d(f5, cavVar4), cavVar4, 0, 0, 131070);
                    } else {
                        cavVar4.s();
                    }
                    return aojh.a;
                }
            }, cavVarB), cavVarB, 805306368, 376);
            cavVar2 = cavVarB;
            cbtVar.W(true);
        } else {
            cavVar2 = cavVarB;
            cavVar2.s();
        }
        cdk cdkVarI = cavVar2.I();
        if (cdkVarI != null) {
            cdkVarI.c = new defpackage.dqt(cmwVar, iztVar2, i, 10);
        }
    }

    public static void k(cmw cmwVar, aomy aomyVar, cav cavVar, int i) {
        int i2;
        aomy aomyVar2;
        int i3 = i & 6;
        cbt cbtVarB = cavVar.b(-310013741);
        if (i3 == 0) {
            i2 = (true != cbtVarB.B(cmwVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != cbtVarB.D(aomyVar) ? 16 : 32;
        }
        if (cbtVarB.H((i2 & 19) != 18, i2 & 1)) {
            long j = den.ak(cbtVarB).h;
            csm csmVarG = g(cbtVarB);
            cmw cmwVarC = azm.c(cmwVar, 1.0f);
            boolean zA = cbtVarB.A(j) | ((i2 & 112) == 32) | cbtVarB.D(csmVarG);
            cbt cbtVar = cbtVarB;
            java.lang.Object objR = cbtVar.R();
            if (zA || objR == cau.a) {
                aomyVar2 = aomyVar;
                defpackage.kiy kiyVar = new defpackage.kiy(j, aomyVar2, csmVarG, 1);
                cbtVar.ab(kiyVar);
                objR = kiyVar;
            } else {
                aomyVar2 = aomyVar;
            }
            defpackage.yt.a(cmwVarC, (aonj) objR, cbtVarB, 0);
        } else {
            aomyVar2 = aomyVar;
            cbtVarB.s();
        }
        cdk cdkVarI = cbtVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new defpackage.dqt(cmwVar, aomyVar2, i, 9);
        }
    }

    public static void l(cmw cmwVar, aomy aomyVar, csx csxVar, java.lang.String str, cav cavVar, int i) {
        aomy aomyVar2;
        cav cavVarB = cavVar.b(-1938769231);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            i2 |= true != cavVarB.D(aomyVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != cavVarB.B(csxVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != cavVarB.B(str) ? 1024 : 2048;
        }
        if (cavVarB.H((i2 & 1171) != 1170, i2 & 1)) {
            cmwVar = cmw.c;
            cbt cbtVar = (cbt) cavVarB;
            java.lang.Object objR = cbtVar.R();
            java.lang.Object obj = cau.a;
            byte[] bArr = null;
            if (objR == obj) {
                objR = new kaw((byte[]) null, (char[]) null, (byte[]) null);
                cbtVar.ab(objR);
            }
            kaw kawVar = (kaw) objR;
            cer cerVarB = aim.b(true != a.y(defpackage.rv.m(kawVar, cavVarB, 6)) ? 1.0f : 0.8f, den.al(cavVarB).b(), (java.lang.String) null, cavVarB, 0, 28);
            cmw cmwVarG = azm.g(cmwVar, 160.0f);
            boolean zB = cavVarB.B(cerVarB);
            java.lang.Object objR2 = cbtVar.R();
            if (zB || objR2 == obj) {
                objR2 = new defpackage.hll(cerVarB, 19);
                cbtVar.ab(objR2);
            }
            aomyVar2 = aomyVar;
            aaoo.aC(aomyVar2, aehj.aQ(cmwVarG, (aomy) objR2), false, (defpackage.bpw) null, kawVar, (crd) null, cfo.j(1390836943, new defpackage.dqv(csxVar, str, 7, bArr), cavVarB), cavVarB, ((i2 >> 3) & 14) | 1597440, 44);
            cavVarB = cavVarB;
        } else {
            aomyVar2 = aomyVar;
            cavVarB.s();
        }
        cmw cmwVar2 = cmwVar;
        cdk cdkVarI = cavVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new defpackage.biu(cmwVar2, aomyVar2, csxVar, str, i, 7);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: aois */
    public static void m(awy awyVar, defpackage.jad jadVar, defpackage.jac jacVar, aonj aonjVar, boolean z, boolean z2, aii aiiVar, aii aiiVar2, aii aiiVar3, boolean z3, cmw cmwVar, cav cavVar, int i, int i2) throws aois {
        int i3;
        cav cavVar2;
        cmw cmwVar2;
        int i4 = i & 6;
        cav cavVarB = cavVar.b(-686404080);
        if (i4 == 0) {
            i3 = (true != cavVarB.B(awyVar) ? 2 : 4) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= true != cavVarB.B(jadVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i3 |= true != cavVarB.z(jacVar.ordinal()) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i3 |= true != cavVarB.D(aonjVar) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i3 |= true != cavVarB.C(z) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            i3 |= true != cavVarB.C(z2) ? 65536 : 131072;
        }
        if ((1572864 & i) == 0) {
            i3 |= true != ((2097152 & i) == 0 ? cavVarB.B(aiiVar) : cavVarB.D(aiiVar)) ? 524288 : 1048576;
        }
        if ((12582912 & i) == 0) {
            i3 |= true != ((16777216 & i) == 0 ? cavVarB.B(aiiVar2) : cavVarB.D(aiiVar2)) ? 4194304 : 8388608;
        }
        if ((100663296 & i) == 0) {
            i3 |= true != ((134217728 & i) == 0 ? cavVarB.B(aiiVar3) : cavVarB.D(aiiVar3)) ? 33554432 : 67108864;
        }
        if ((805306368 & i) == 0) {
            i3 |= true != cavVarB.C(z3) ? 268435456 : 536870912;
        }
        if (cavVarB.H(((306783379 & i3) == 306783378 && (i2 & 1) == 0) ? false : true, i3 & 1)) {
            cmw cmwVar3 = cmw.c;
            cmw cmwVarE = azm.e(cmwVar3, 256.0f);
            cye cyeVarB = awo.b(cmh.e, false);
            cbt cbtVar = (cbt) cavVarB;
            int iM = anty.M(cbtVar.x);
            cje cjeVarAi = cbtVar.ai();
            cmw cmwVarM = cfo.m(cavVarB, cmwVarE);
            aomy aomyVar = dam.a;
            cavVarB.v();
            if (cbtVar.w) {
                cavVarB.j(aomyVar);
            } else {
                cavVarB.x();
            }
            aonn aonnVar = dam.e;
            cev.c(cavVarB, cyeVarB, aonnVar);
            aonn aonnVar2 = dam.d;
            cev.c(cavVarB, cjeVarAi, aonnVar2);
            java.lang.Integer numValueOf = java.lang.Integer.valueOf(iM);
            aonn aonnVar3 = dam.f;
            cev.c(cavVarB, numValueOf, aonnVar3);
            aonj aonjVar2 = dam.g;
            cev.b(cavVarB, aonjVar2);
            aonn aonnVar4 = dam.c;
            cev.c(cavVarB, cmwVarM, aonnVar4);
            if (jacVar == defpackage.jac.a || (jacVar == defpackage.jac.d && z)) {
                aonnVar3 = aonnVar3;
                cavVarB.u(-1978818249);
                cmw cmwVarK = azm.k(den.aZ(cmwVar3, 0.0f, 20.0f), 216.0f);
                java.lang.Object objR = cbtVar.R();
                java.lang.Object obj = cau.a;
                if (objR == obj) {
                    objR = new defpackage.guv(20);
                    cbtVar.ab(objR);
                }
                cmw cmwVarA = dig.a(cmwVarK, (aonj) objR);
                boolean zD = ((458752 & i3) == 131072) | cavVarB.D(aiiVar) | cavVarB.D(aiiVar2);
                java.lang.Object objR2 = cbtVar.R();
                if (zD || objR2 == obj) {
                    objR2 = new ozh(z2, aiiVar, aiiVar2, 1);
                    cbtVar.ab(objR2);
                }
                k(cmwVarA, (aomy) objR2, cavVarB, 0);
                cbtVar.W(false);
            } else {
                cavVarB.u(-1978062097);
                cmw cmwVarAZ = den.aZ(cmwVar3, 0.0f, 8.0f);
                java.lang.Object objR3 = cbtVar.R();
                java.lang.Object obj2 = cau.a;
                if (objR3 == obj2) {
                    objR3 = new defpackage.jak(1);
                    cbtVar.ab(objR3);
                }
                cmw cmwVarA2 = dig.a(cmwVarAZ, (aonj) objR3);
                boolean zD2 = cavVarB.D(aiiVar3);
                java.lang.Object objR4 = cbtVar.R();
                if (zD2 || objR4 == obj2) {
                    objR4 = new defpackage.hll(aiiVar3, 16);
                    cbtVar.ab(objR4);
                }
                p(cmwVarA2, (aomy) objR4, cavVarB, 0);
                cbtVar.W(false);
            }
            int iOrdinal = jacVar.ordinal();
            if (iOrdinal == 0) {
                cavVarB.u(-1977549636);
                java.lang.Boolean boolValueOf = java.lang.Boolean.valueOf(z2);
                abni abniVar = abts.H(cavVarB).a;
                wi.a(boolValueOf, (cmw) null, den.bv(300, 0, (ajh) null, 6), (java.lang.String) null, cfo.j(-296061709, new defpackage.jag(aiiVar2, z3, 0), cavVarB), cavVarB, ((i3 >> 15) & 14) | 24576, 10);
                cbtVar.W(false);
            } else if (iOrdinal == 1) {
                int i5 = i3 & 7168;
                boolean z4 = (i3 & 112) == 32;
                cavVarB.u(-1976816641);
                boolean z5 = i5 == 2048;
                java.lang.Object objR5 = cbtVar.R();
                if ((z4 | z5) || objR5 == cau.a) {
                    objR5 = new defpackage.hpc(jadVar, aonjVar, 12);
                    cbtVar.ab(objR5);
                }
                l(null, (aomy) objR5, aehj.aL(defpackage.abja.dS, cavVarB), dfa.f(2132019839, cavVarB), cavVarB, 0);
                cbtVar.W(false);
            } else if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    cavVarB.u(1875867840);
                    cbtVar.W(false);
                    throw new aois();
                }
                cavVarB.u(-1977549636);
                java.lang.Boolean boolValueOf2 = java.lang.Boolean.valueOf(z2);
                abni abniVar2 = abts.H(cavVarB).a;
                wi.a(boolValueOf2, (cmw) null, den.bv(300, 0, (ajh) null, 6), (java.lang.String) null, cfo.j(-296061709, new defpackage.jag(aiiVar2, z3, 0), cavVarB), cavVarB, ((i3 >> 15) & 14) | 24576, 10);
                cbtVar.W(false);
            } else {
                int i6 = i3 & 7168;
                boolean z6 = (i3 & 112) == 32;
                cavVarB.u(-1976427467);
                boolean z7 = i6 == 2048;
                java.lang.Object objR6 = cbtVar.R();
                if ((z6 | z7) || objR6 == cau.a) {
                    objR6 = new defpackage.hpc(jadVar, aonjVar, 13);
                    cbtVar.ab(objR6);
                }
                l(null, (aomy) objR6, aehj.aL(defpackage.abja.er, cavVarB), dfa.f(2132019841, cavVarB), cavVarB, 0);
                cbtVar.W(false);
            }
            cbtVar.W(true);
            den.aR(awy.b(cmwVar3, 1.0f, true), cavVarB);
            cmw cmwVarD = azm.d(cmwVar3, 1.0f);
            cye cyeVarA = aww.a(awi.c, cmh.k, cavVarB, 48);
            int iM2 = anty.M(cbtVar.x);
            cje cjeVarAi2 = cbtVar.ai();
            cmw cmwVarM2 = cfo.m(cavVarB, cmwVarD);
            cavVarB.v();
            if (cbtVar.w) {
                cavVarB.j(aomyVar);
            } else {
                cavVarB.x();
            }
            cev.c(cavVarB, cyeVarA, aonnVar);
            cev.c(cavVarB, cjeVarAi2, aonnVar2);
            cev.c(cavVarB, java.lang.Integer.valueOf(iM2), aonnVar3);
            cev.b(cavVarB, aonjVar2);
            cev.c(cavVarB, cmwVarM2, aonnVar4);
            cmwVar2 = cmwVar3;
            wi.a(jacVar, (cmw) null, den.al(cavVarB).a(), (java.lang.String) null, cfo.j(-707330583, new defpackage.jag(z2, aiiVar3, 2), cavVarB), cavVarB, ((i3 >> 6) & 14) | 24576, 10);
            cavVar2 = cavVarB;
            cbtVar.W(true);
        } else {
            cavVar2 = cavVarB;
            cavVar2.s();
            cmwVar2 = cmwVar;
        }
        cdk cdkVarI = cavVar2.I();
        if (cdkVarI != null) {
            cdkVarI.c = new upj(awyVar, jadVar, jacVar, aonjVar, z, z2, aiiVar, aiiVar2, aiiVar3, z3, cmwVar2, i, i2, 1);
        }
    }

    public static void n(cmw cmwVar, aomy aomyVar, boolean z, cav cavVar, int i) {
        boolean z2;
        cbt cbtVarB = cavVar.b(801710813);
        int i2 = i | 6;
        int i3 = 16;
        if ((i & 48) == 0) {
            i2 |= true != cbtVarB.D(aomyVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != cbtVarB.C(z) ? 128 : 256;
        }
        if (cbtVarB.H((i2 & 147) != 146, i2 & 1)) {
            cmwVar = cmw.c;
            cmw cmwVarBn = den.bn(den.aY(azm.g(cmwVar, 160.0f), 14.0f), den.ak(cbtVarB).i, bge.a);
            cye cyeVarB = awo.b(cmh.e, false);
            cbt cbtVar = cbtVarB;
            int iM = anty.M(cbtVar.x);
            cje cjeVarAi = cbtVar.ai();
            cmw cmwVarM = cfo.m(cbtVarB, cmwVarBn);
            aomy aomyVar2 = dam.a;
            cbtVarB.v();
            if (cbtVar.w) {
                cbtVarB.j(aomyVar2);
            } else {
                cbtVarB.x();
            }
            cev.c(cbtVarB, cyeVarB, dam.e);
            cev.c(cbtVarB, cjeVarAi, dam.d);
            cev.c(cbtVarB, java.lang.Integer.valueOf(iM), dam.f);
            cev.b(cbtVarB, dam.g);
            cev.c(cbtVarB, cmwVarM, dam.c);
            z2 = z;
            den.bz(z2, (cmw) null, aga.n(den.al(cbtVarB).a(), 2), aga.o(den.al(cbtVarB).a(), 2), (java.lang.String) null, cfo.j(-2029137221, new defpackage.ant(aomyVar, i3), cbtVarB), cbtVarB, ((i2 >> 6) & 14) | 196608, 18);
            cbtVar.W(true);
        } else {
            z2 = z;
            cbtVarB.s();
        }
        cmw cmwVar2 = cmwVar;
        cdk cdkVarI = cbtVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new bsq(cmwVar2, aomyVar, z2, i, 3);
        }
    }

    public static void o(cmw cmwVar, defpackage.jad jadVar, cav cavVar, int i) {
        cav cavVar2;
        cmw cmwVar2;
        final aii aiiVar;
        boolean z;
        ccp ccpVar;
        boolean z2;
        final aii aiiVar2;
        final aonj aonjVar;
        final ccp ccpVar2;
        final ccp ccpVar3;
        final defpackage.jad jadVar2 = jadVar;
        cav cavVarB = cavVar.b(52541951);
        int i2 = i | 6;
        int i3 = 16;
        if ((i & 48) == 0) {
            i2 |= true != cavVarB.B(jadVar2) ? 16 : 32;
        }
        int i4 = i2;
        int i5 = 18;
        if (cavVarB.H((i4 & 19) != 18, i4 & 1)) {
            cmw cmwVar3 = cmw.c;
            java.lang.Object[] objArr = new java.lang.Object[0];
            cbt cbtVar = (cbt) cavVarB;
            java.lang.Object objR = cbtVar.R();
            java.lang.Object obj = cau.a;
            int i6 = 15;
            if (objR == obj) {
                objR = new defpackage.eli(i6);
                cbtVar.ab(objR);
            }
            ccp ccpVar4 = (ccp) cfd.m(objArr, (aomy) objR, cavVarB, 48);
            boolean zB = cavVarB.B(ccpVar4);
            java.lang.Object objR2 = cbtVar.R();
            if (zB || objR2 == obj) {
                objR2 = new defpackage.izj(ccpVar4, 5);
                cbtVar.ab(objR2);
            }
            aonj aonjVar2 = (aonj) objR2;
            java.lang.Object[] objArr2 = new java.lang.Object[0];
            java.lang.Object objR3 = cbtVar.R();
            if (objR3 == obj) {
                objR3 = new defpackage.eli(i3);
                cbtVar.ab(objR3);
            }
            ceg cegVar = (ceg) cfd.m(objArr2, (aomy) objR3, cavVarB, 48);
            java.lang.Object objR4 = cbtVar.R();
            if (objR4 == obj) {
                objR4 = aij.a(cegVar.c());
                cbtVar.ab(objR4);
            }
            aii aiiVar3 = (aii) objR4;
            java.lang.Object objD = aiiVar3.d();
            boolean zB2 = cavVarB.B(cegVar) | cavVarB.D(aiiVar3);
            java.lang.Object objR5 = cbtVar.R();
            if (zB2 || objR5 == obj) {
                objR5 = new defpackage.fyn(aiiVar3, cegVar, (aoln) null, 15);
                cbtVar.ab(objR5);
            }
            cbp.g(objD, (aonn) objR5, cavVarB);
            java.lang.Object[] objArr3 = new java.lang.Object[0];
            java.lang.Object objR6 = cbtVar.R();
            if (objR6 == obj) {
                objR6 = new defpackage.eli(17);
                cbtVar.ab(objR6);
            }
            ceg cegVar2 = (ceg) cfd.m(objArr3, (aomy) objR6, cavVarB, 48);
            java.lang.Object objR7 = cbtVar.R();
            if (objR7 == obj) {
                objR7 = aij.a(cegVar2.c());
                cbtVar.ab(objR7);
            }
            final aii aiiVar4 = (aii) objR7;
            java.lang.Object objD2 = aiiVar4.d();
            boolean zB3 = cavVarB.B(cegVar2) | cavVarB.D(aiiVar4);
            java.lang.Object objR8 = cbtVar.R();
            if (zB3 || objR8 == obj) {
                objR8 = new defpackage.fyn(aiiVar4, cegVar2, (aoln) null, 16, (byte[]) null);
                cbtVar.ab(objR8);
            }
            cbp.g(objD2, (aonn) objR8, cavVarB);
            abni abniVar = abts.H(cavVarB).a;
            ajh ajhVar = abts.H(cavVarB).b.e;
            ajh ajhVar2 = abts.H(cavVarB).b.b;
            java.lang.Object[] objArr4 = new java.lang.Object[0];
            java.lang.Object objR9 = cbtVar.R();
            if (objR9 == obj) {
                objR9 = new defpackage.eli(i5);
                cbtVar.ab(objR9);
            }
            final ccp ccpVar5 = (ccp) cfd.m(objArr4, (aomy) objR9, cavVarB, 48);
            java.lang.Object[] objArr5 = new java.lang.Object[0];
            java.lang.Object objR10 = cbtVar.R();
            if (objR10 == obj) {
                objR10 = new defpackage.eli(19);
                cbtVar.ab(objR10);
            }
            ccp ccpVar6 = (ccp) cfd.m(objArr5, (aomy) objR10, cavVarB, 48);
            java.lang.Object[] objArr6 = new java.lang.Object[0];
            java.lang.Object objR11 = cbtVar.R();
            if (objR11 == obj) {
                objR11 = new defpackage.eli(20);
                cbtVar.ab(objR11);
            }
            ceg cegVar3 = (ceg) cfd.m(objArr6, (aomy) objR11, cavVarB, 48);
            java.lang.Object objR12 = cbtVar.R();
            if (objR12 == obj) {
                objR12 = aij.a(cegVar3.c());
                cbtVar.ab(objR12);
            }
            aii aiiVar5 = (aii) objR12;
            java.lang.Object objD3 = aiiVar5.d();
            boolean zB4 = cavVarB.B(cegVar3) | cavVarB.D(aiiVar5);
            java.lang.Object objR13 = cbtVar.R();
            if (zB4 || objR13 == obj) {
                objR13 = new defpackage.fyn(aiiVar5, cegVar3, (aoln) null, 17, (char[]) null);
                aiiVar = aiiVar5;
                cbtVar.ab(objR13);
            } else {
                aiiVar = aiiVar5;
            }
            cbp.g(objD3, (aonn) objR13, cavVarB);
            java.lang.Object[] objArr7 = new java.lang.Object[0];
            java.lang.Object objR14 = cbtVar.R();
            if (objR14 == obj) {
                objR14 = new jaf(1);
                cbtVar.ab(objR14);
            }
            ccp ccpVar7 = (ccp) cfd.m(objArr7, (aomy) objR14, cavVarB, 48);
            java.lang.Object[] objArr8 = {h(ccpVar4)};
            java.lang.Object objR15 = cbtVar.R();
            if (objR15 == obj) {
                objR15 = new jaf(0);
                cbtVar.ab(objR15);
            }
            ccp ccpVar8 = (ccp) cfd.m(objArr8, (aomy) objR15, cavVarB, 48);
            defpackage.jac jacVarH = h(ccpVar4);
            boolean zB5 = cavVarB.B(ccpVar8) | cavVarB.D(aiiVar4) | cavVarB.B(ccpVar4) | cavVarB.B(ccpVar5) | cavVarB.B(ccpVar6) | cavVarB.D(aiiVar3) | cavVarB.z(300) | cavVarB.B(ajhVar) | cavVarB.B(aonjVar2) | ((i4 & 112) == 32) | cavVarB.A(60000L) | cavVarB.D(aiiVar) | cavVarB.B(ccpVar7) | cavVarB.B(ajhVar2);
            java.lang.Object objR16 = cbtVar.R();
            if (zB5 || objR16 == obj) {
                z = false;
                ccpVar = ccpVar7;
                z2 = true;
                objR16 = new defpackage.jal(aiiVar4, aiiVar3, ajhVar, aonjVar2, jadVar, aiiVar, ajhVar2, ccpVar8, ccpVar4, ccpVar5, ccpVar6, ccpVar, null);
                aiiVar2 = aiiVar3;
                jadVar2 = jadVar;
                aonjVar = aonjVar2;
                ccpVar2 = ccpVar4;
                ccpVar3 = ccpVar6;
                aiiVar4 = aiiVar4;
                cbtVar.ab(objR16);
            } else {
                ccpVar2 = ccpVar4;
                aiiVar2 = aiiVar3;
                aonjVar = aonjVar2;
                ccpVar3 = ccpVar6;
                z2 = true;
                z = false;
                ccpVar = ccpVar7;
                jadVar2 = jadVar;
            }
            cbp.g(jacVarH, (aonn) objR16, cavVarB);
            final boolean z3 = ((android.content.res.Configuration) cavVarB.e(dep.a)).orientation == 2 ? z2 : z;
            long j = den.ak(cavVarB).F;
            cja cjaVarJ = cfo.j(2049085883, new defpackage.izk(jadVar2, 7), cavVarB);
            final ccp ccpVar9 = ccpVar;
            cavVar2 = cavVarB;
            cmwVar2 = cmwVar3;
            aaoo.K(cmwVar2, cjaVarJ, (aonn) null, (aonn) null, (aonn) null, 0, j, 0L, (azz) null, cfo.j(975868752, new aono() { // from class: jae
                /* JADX INFO: Thrown type has an unknown type hierarchy: aois */
                public final java.lang.Object a(java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) throws aois {
                    ayy ayyVar = (ayy) obj2;
                    cav cavVar3 = (cav) obj3;
                    int iIntValue = ((java.lang.Integer) obj4).intValue();
                    aooh.f(ayyVar, "paddingValues");
                    if ((iIntValue & 6) == 0) {
                        iIntValue |= true != cavVar3.B(ayyVar) ? 2 : 4;
                    }
                    if (cavVar3.H((iIntValue & 19) != 18, iIntValue & 1)) {
                        ccp ccpVar10 = ccpVar5;
                        ccp ccpVar11 = ccpVar3;
                        ccp ccpVar12 = ccpVar9;
                        ccp ccpVar13 = ccpVar2;
                        aii aiiVar6 = aiiVar;
                        aii aiiVar7 = aiiVar2;
                        aii aiiVar8 = aiiVar4;
                        aonj aonjVar3 = aonjVar;
                        defpackage.jad jadVar3 = jadVar2;
                        if (z3) {
                            cavVar3.u(-527561235);
                            cmt cmtVar = cmw.c;
                            cmw cmwVarAZ = den.aZ(den.aX(azm.c(cmtVar, 1.0f), ayyVar), 16.0f, 0.0f);
                            cye cyeVarA = azh.a(awi.a, cmh.n, cavVar3, 48);
                            int iM = anty.M(cavVar3.a());
                            cje cjeVarM = cavVar3.M();
                            cmw cmwVarM = cfo.m(cavVar3, cmwVarAZ);
                            aomy aomyVar = dam.a;
                            cavVar3.L();
                            cavVar3.v();
                            if (cavVar3.F()) {
                                cavVar3.j(aomyVar);
                            } else {
                                cavVar3.x();
                            }
                            aonn aonnVar = dam.e;
                            cev.c(cavVar3, cyeVarA, aonnVar);
                            aonn aonnVar2 = dam.d;
                            cev.c(cavVar3, cjeVarM, aonnVar2);
                            java.lang.Integer numValueOf = java.lang.Integer.valueOf(iM);
                            aonn aonnVar3 = dam.f;
                            cev.c(cavVar3, numValueOf, aonnVar3);
                            aonj aonjVar4 = dam.g;
                            cev.b(cavVar3, aonjVar4);
                            aonn aonnVar4 = dam.c;
                            cev.c(cavVar3, cmwVarM, aonnVar4);
                            azk azkVar = azk.a;
                            cmw cmwVarA = azkVar.a(azm.b(cmtVar, 1.0f), 1.0f, true);
                            cye cyeVarA2 = aww.a(awi.c, cmh.k, cavVar3, 48);
                            int iM2 = anty.M(cavVar3.a());
                            cje cjeVarM2 = cavVar3.M();
                            cmw cmwVarM2 = cfo.m(cavVar3, cmwVarA);
                            cavVar3.L();
                            cavVar3.v();
                            if (cavVar3.F()) {
                                cavVar3.j(aomyVar);
                            } else {
                                cavVar3.x();
                            }
                            cev.c(cavVar3, cyeVarA2, aonnVar);
                            cev.c(cavVar3, cjeVarM2, aonnVar2);
                            cev.c(cavVar3, java.lang.Integer.valueOf(iM2), aonnVar3);
                            cev.b(cavVar3, aonjVar4);
                            cev.c(cavVar3, cmwVarM2, aonnVar4);
                            boolean z4 = jadVar3.g;
                            awy awyVar = awy.a;
                            if (z4) {
                                cavVar3.u(2001171738);
                                den.aR(awy.b(cmtVar, 29.0f, true), cavVar3);
                                cavVar3.o();
                            } else {
                                cavVar3.u(2001236125);
                                cavVar3.o();
                            }
                            defpackage.hhe.m(awyVar, jadVar3, defpackage.hhe.h(ccpVar13), aonjVar3, a.C(ccpVar12), a.C(ccpVar11), aiiVar8, aiiVar7, aiiVar6, a.C(ccpVar10), null, cavVar3, 153092102, 0);
                            den.aR(awy.b(cmtVar, 62.0f, true), cavVar3);
                            cavVar3.n();
                            cmw cmwVarAZ2 = den.aZ(azm.b(azkVar.a(cmtVar, 1.0f, true), 1.0f), 0.0f, 16.0f);
                            cye cyeVarB = awo.b(cmh.h, false);
                            int iM3 = anty.M(cavVar3.a());
                            cje cjeVarM3 = cavVar3.M();
                            cmw cmwVarM3 = cfo.m(cavVar3, cmwVarAZ2);
                            cavVar3.L();
                            cavVar3.v();
                            if (cavVar3.F()) {
                                cavVar3.j(aomyVar);
                            } else {
                                cavVar3.x();
                            }
                            cev.c(cavVar3, cyeVarB, aonnVar);
                            cev.c(cavVar3, cjeVarM3, aonnVar2);
                            cev.c(cavVar3, java.lang.Integer.valueOf(iM3), aonnVar3);
                            cev.b(cavVar3, aonjVar4);
                            cev.c(cavVar3, cmwVarM3, aonnVar4);
                            defpackage.hhe.i(jadVar3, defpackage.hhe.h(ccpVar13), aonjVar3, a.C(ccpVar11), cavVar3, 0);
                            cavVar3.n();
                            cavVar3.n();
                            cavVar3.o();
                        } else {
                            cavVar3.u(-526443437);
                            cmt cmtVar2 = cmw.c;
                            cmw cmwVarAX = den.aX(azm.c(cmtVar2, 1.0f), ayyVar);
                            cye cyeVarA3 = aww.a(awi.c, cmh.k, cavVar3, 48);
                            int iM4 = anty.M(cavVar3.a());
                            cje cjeVarM4 = cavVar3.M();
                            cmw cmwVarM4 = cfo.m(cavVar3, cmwVarAX);
                            aomy aomyVar2 = dam.a;
                            cavVar3.L();
                            cavVar3.v();
                            if (cavVar3.F()) {
                                cavVar3.j(aomyVar2);
                            } else {
                                cavVar3.x();
                            }
                            aonn aonnVar5 = dam.e;
                            cev.c(cavVar3, cyeVarA3, aonnVar5);
                            aonn aonnVar6 = dam.d;
                            cev.c(cavVar3, cjeVarM4, aonnVar6);
                            java.lang.Integer numValueOf2 = java.lang.Integer.valueOf(iM4);
                            aonn aonnVar7 = dam.f;
                            cev.c(cavVar3, numValueOf2, aonnVar7);
                            aonj aonjVar5 = dam.g;
                            cev.b(cavVar3, aonjVar5);
                            aonn aonnVar8 = dam.c;
                            cev.c(cavVar3, cmwVarM4, aonnVar8);
                            awy awyVar2 = awy.a;
                            den.aR(awy.b(cmtVar2, 29.0f, true), cavVar3);
                            defpackage.hhe.m(awyVar2, jadVar3, defpackage.hhe.h(ccpVar13), aonjVar3, a.C(ccpVar12), a.C(ccpVar11), aiiVar8, aiiVar7, aiiVar6, a.C(ccpVar10), null, cavVar3, 153092102, 0);
                            den.aR(awy.b(cmtVar2, 62.0f, true), cavVar3);
                            ayy ayyVar2 = defpackage.acpl.a;
                            cmw cmwVarE = azm.e(azm.d(cmtVar2, 1.0f), defpackage.acpl.d + 48.0f + 0.0f);
                            cye cyeVarB2 = awo.b(cmh.a, false);
                            int iM5 = anty.M(cavVar3.a());
                            cje cjeVarM5 = cavVar3.M();
                            cmw cmwVarM5 = cfo.m(cavVar3, cmwVarE);
                            cavVar3.L();
                            cavVar3.v();
                            if (cavVar3.F()) {
                                cavVar3.j(aomyVar2);
                            } else {
                                cavVar3.x();
                            }
                            cev.c(cavVar3, cyeVarB2, aonnVar5);
                            cev.c(cavVar3, cjeVarM5, aonnVar6);
                            cev.c(cavVar3, java.lang.Integer.valueOf(iM5), aonnVar7);
                            cev.b(cavVar3, aonjVar5);
                            cev.c(cavVar3, cmwVarM5, aonnVar8);
                            defpackage.hhe.i(jadVar3, defpackage.hhe.h(ccpVar13), aonjVar3, a.C(ccpVar11), cavVar3, 0);
                            cavVar3.n();
                            cavVar3.n();
                            cavVar3.o();
                        }
                    } else {
                        cavVar3.s();
                    }
                    return aojh.a;
                }
            }, cavVarB), cavVar2, (i4 & 14) | 805306416, 444);
        } else {
            cavVar2 = cavVarB;
            cavVar2.s();
            cmwVar2 = cmwVar;
        }
        cdk cdkVarI = cavVar2.I();
        if (cdkVarI != null) {
            cdkVarI.c = new defpackage.dqt(cmwVar2, jadVar2, i, 8);
        }
    }

    public static void p(cmw cmwVar, aomy aomyVar, cav cavVar, int i) {
        int i2;
        int i3 = i & 6;
        cbt cbtVarB = cavVar.b(-1282067957);
        if (i3 == 0) {
            i2 = (true != cbtVarB.B(cmwVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != cbtVarB.A(60000L) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != cbtVarB.D(aomyVar) ? 128 : 256;
        }
        int i4 = 0;
        if (cbtVarB.H((i2 & 147) != 146, i2 & 1)) {
            cmw cmwVarG = azm.g(cmwVar, 240.0f);
            csm csmVar = new csm(((dpf) cbtVarB.e(dfo.e)).dl(20.0f), 0.0f, 1, 0, 26);
            csm csmVarG = g(cbtVarB);
            boolean z = (i2 & 896) == 256;
            boolean z2 = (i2 & 112) == 32;
            cbt cbtVar = cbtVarB;
            java.lang.Object objR = cbtVar.R();
            if ((z | z2) || objR == cau.a) {
                objR = new defpackage.jaj(aomyVar, i4);
                cbtVar.ab(objR);
            }
            aomy aomyVar2 = (aomy) objR;
            java.lang.Object objR2 = cbtVar.R();
            if (objR2 == cau.a) {
                objR2 = new defpackage.jak(i4);
                cbtVar.ab(objR2);
            }
            afsq.aO(aomyVar2, cmwVarG, 0L, 0L, csmVar, csmVarG, 0.0f, (aonj) objR2, cbtVarB, 918847488);
        } else {
            cbtVarB.s();
        }
        cdk cdkVarI = cbtVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new defpackage.dqt(cmwVar, aomyVar, i, 12);
        }
    }

    public static void q(cmw cmwVar, aomy aomyVar, cav cavVar, int i) {
        cav cavVar2;
        cmw cmwVar2;
        cav cavVarB = cavVar.b(107443576);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            i2 |= true != cavVarB.A(60000L) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != cavVarB.D(aomyVar) ? 128 : 256;
        }
        if (cavVarB.H((i2 & 147) != 146, i2 & 1)) {
            cmw cmwVar3 = cmw.c;
            java.util.Locale localeM = aa$.ExternalSyntheticApiModelOutline1.m(aa$.ExternalSyntheticApiModelOutline1.m((android.content.res.Configuration) cavVarB.e(dep.a)), 0);
            boolean zB = cavVarB.B(localeM);
            cbt cbtVar = (cbt) cavVarB;
            java.lang.Object objR = cbtVar.R();
            if (zB || objR == cau.a) {
                objR = fh$.ExternalSyntheticApiModelOutline0.m(localeM, fh$.ExternalSyntheticApiModelOutline0.m());
                cbtVar.ab(objR);
            }
            android.icu.text.MeasureFormat measureFormatM = fh$.ExternalSyntheticApiModelOutline0.m(objR);
            boolean zA = cavVarB.A(((java.lang.Number) aomyVar.a()).longValue()) | cavVarB.B(localeM);
            java.lang.Object objR2 = cbtVar.R();
            if (zA || objR2 == cau.a) {
                long jLongValue = ((java.lang.Number) aomyVar.a()).longValue();
                aooh.c(measureFormatM);
                objR2 = T(jLongValue, measureFormatM);
                cbtVar.ab(objR2);
            }
            java.lang.String str = (java.lang.String) objR2;
            boolean zB2 = ((i2 & 112) == 32) | cavVarB.B(localeM);
            java.lang.Object objR3 = cbtVar.R();
            if (zB2 || objR3 == cau.a) {
                aooh.c(measureFormatM);
                objR3 = T(60000L, measureFormatM);
                cbtVar.ab(objR3);
            }
            java.lang.String strG = dfa.g(2132019846, new java.lang.Object[]{str, (java.lang.String) objR3}, cavVarB);
            cmw cmwVarAZ = den.aZ(cmwVar3, 8.0f, 0.0f);
            boolean zB3 = cavVarB.B(strG);
            java.lang.Object objR4 = cbtVar.R();
            if (zB3 || objR4 == cau.a) {
                objR4 = new defpackage.izj(strG, 6);
                cbtVar.ab(objR4);
            }
            cavVar2 = cavVarB;
            abrz.k(U(((java.lang.Number) aomyVar.a()).longValue()) + " / " + U(60000L), dig.a(cmwVarAZ, (aonj) objR4), 0L, 0L, (dnd) null, (dmq) null, 0L, new dot(3), 0L, 0, false, 0, 0, (aonj) null, den.an(cavVarB).g, cavVar2, 0, 0, 130044);
            cmwVar2 = cmwVar3;
        } else {
            cavVar2 = cavVarB;
            cavVar2.s();
            cmwVar2 = cmwVar;
        }
        cdk cdkVarI = cavVar2.I();
        if (cdkVarI != null) {
            cdkVarI.c = new defpackage.dqt(cmwVar2, aomyVar, i, 11);
        }
    }

    public static void s(cmw cmwVar, defpackage.izp izpVar, cav cavVar, int i) {
        int i2;
        cmw cmwVar2;
        int i3 = i & 6;
        cbt cbtVarB = cavVar.b(851715618);
        int i4 = 2;
        if (i3 == 0) {
            i2 = (true != cbtVarB.B(cmwVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != cbtVarB.B(izpVar) ? 16 : 32;
        }
        if (cbtVarB.H((i2 & 19) != 18, i2 & 1)) {
            int i5 = i2 & 112;
            cbt cbtVar = cbtVarB;
            java.lang.Object objR = cbtVar.R();
            if (i5 == 32 || objR == cau.a) {
                objR = new defpackage.izj(izpVar, i4);
                cbtVar.ab(objR);
            }
            aonj aonjVar = (aonj) objR;
            java.lang.Object objR2 = cbtVar.R();
            java.lang.Object obj = cau.a;
            if (objR2 == obj) {
                objR2 = new defpackage.guv(17);
                cbtVar.ab(objR2);
            }
            aonj aonjVar2 = (aonj) objR2;
            java.lang.Object objR3 = cbtVar.R();
            int i6 = 3;
            if (i5 == 32 || objR3 == obj) {
                objR3 = new defpackage.izj(izpVar, i6);
                cbtVar.ab(objR3);
            }
            cmwVar2 = cmwVar;
            defpackage.dqi.b(aonjVar, cmwVar2, aonjVar2, null, (aonj) objR3, cbtVarB, ((i2 << 3) & 112) | 384, 8);
        } else {
            cmwVar2 = cmwVar;
            cbtVarB.s();
        }
        cdk cdkVarI = cbtVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new defpackage.dqt(cmwVar2, izpVar, i, 6);
        }
    }

    public static void t(defpackage.jab jabVar, cmw cmwVar, cav cavVar, int i) {
        int i2;
        cmw cmwVar2;
        int i3 = i & 6;
        cbt cbtVarB = cavVar.b(1084197642);
        if (i3 == 0) {
            i2 = (true != ((i & 8) == 0 ? cbtVarB.B(jabVar) : cbtVarB.D(jabVar)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != cbtVarB.B(cmwVar) ? 16 : 32;
        }
        if (cbtVarB.H((i2 & 19) != 18, i2 & 1)) {
            cbt cbtVar = cbtVarB;
            java.lang.Object objR = cbtVar.R();
            java.lang.Object obj = cau.a;
            if (objR == obj) {
                androidx.compose.runtime.ParcelableSnapshotMutableState parcelableSnapshotMutableState = new androidx.compose.runtime.ParcelableSnapshotMutableState(java.lang.Boolean.valueOf(!jabVar.j), cdu.c);
                cbtVar.ab(parcelableSnapshotMutableState);
                objR = parcelableSnapshotMutableState;
            }
            ccp ccpVar = (ccp) objR;
            aojh aojhVar = aojh.a;
            java.lang.Object objR2 = cbtVar.R();
            if (objR2 == obj) {
                objR2 = new defpackage.icr(ccpVar, (aoln) null, 14);
                cbtVar.ab(objR2);
            }
            cbp.g(aojhVar, (aonn) objR2, cbtVarB);
            cmwVar2 = cmwVar;
            den.bz(a.C(ccpVar), cmwVar2, aga.j(den.al(cbtVarB).b(), 0.0f, 0L, 6), aga.k(den.al(cbtVarB).b(), 0.0f, 0L, 6), (java.lang.String) null, cfo.j(550050610, new defpackage.ant(jabVar, 15), cbtVarB), cbtVarB, (i2 & 112) | 196608, 16);
        } else {
            cmwVar2 = cmwVar;
            cbtVarB.s();
        }
        cdk cdkVarI = cbtVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new defpackage.dqt(jabVar, cmwVar2, i, 7, null);
        }
    }

    public static void u(cmw cmwVar, cav cavVar, int i) {
        int i2;
        cav cavVar2;
        int i3 = i & 6;
        cav cavVarB = cavVar.b(1332041165);
        if (i3 == 0) {
            i2 = (true != cavVarB.B(cmwVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if (cavVarB.H((i2 & 3) != 2, i2 & 1)) {
            cmw cmwVarAY = den.aY(cmwVar, 24.0f);
            cye cyeVarA = aww.a(awi.c, cmh.k, cavVarB, 48);
            cbt cbtVar = (cbt) cavVarB;
            int iM = anty.M(cbtVar.x);
            cje cjeVarAi = cbtVar.ai();
            cmw cmwVarM = cfo.m(cavVarB, cmwVarAY);
            aomy aomyVar = dam.a;
            cavVarB.v();
            if (cbtVar.w) {
                cavVarB.j(aomyVar);
            } else {
                cavVarB.x();
            }
            cev.c(cavVarB, cyeVarA, dam.e);
            cev.c(cavVarB, cjeVarAi, dam.d);
            cev.c(cavVarB, java.lang.Integer.valueOf(iM), dam.f);
            cev.b(cavVarB, dam.g);
            cev.c(cavVarB, cmwVarM, dam.c);
            css cssVarK = wv.k(2131230929, cavVarB, 0);
            java.lang.String strF = dfa.f(2132017555, cavVarB);
            cmt cmtVar = cmw.c;
            rd.f(cssVarK, strF, den.ba(cmtVar, 0.0f, 8.0f, 0.0f, 24.0f), (cmj) null, (defpackage.cwy) null, 0.0f, cavVarB, 392, 120);
            cavVar2 = cavVarB;
            abrz.k(dfa.f(2132017556, cavVarB), den.aZ(cmtVar, 40.0f, 0.0f), den.ak(cavVarB).f, 0L, (dnd) null, (dmq) null, 0L, new dot(3), 0L, 0, false, 0, 0, (aonj) null, den.an(cavVarB).h, cavVar2, 48, 0, 130040);
            cbtVar.W(true);
        } else {
            cavVar2 = cavVarB;
            cavVar2.s();
        }
        cdk cdkVarI = cavVar2.I();
        if (cdkVarI != null) {
            cdkVarI.c = new defpackage.ajs(cmwVar, i, 14);
        }
    }

    public static void v(cmw cmwVar, boolean z, aomy aomyVar, cav cavVar, int i) {
        int i2;
        aomy aomyVar2;
        long j;
        long j2;
        int i3 = i & 6;
        cbt cbtVarB = cavVar.b(-2120863660);
        if (i3 == 0) {
            i2 = (true != cbtVarB.B(cmwVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != cbtVarB.C(z) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            aomyVar2 = aomyVar;
            i2 |= true != cbtVarB.D(aomyVar2) ? 128 : 256;
        } else {
            aomyVar2 = aomyVar;
        }
        if (cbtVarB.H((i2 & 147) != 146, i2 & 1)) {
            bgc bgcVar = bge.a;
            if (z) {
                cbtVarB.u(614861076);
                j = den.ak(cbtVarB).r;
                cbtVarB.W(false);
                cbtVarB.u(615035451);
                j2 = den.ak(cbtVarB).A;
                cbtVarB.W(false);
            } else {
                cbtVarB.u(614924688);
                j = den.ak(cbtVarB).h;
                cbtVarB.W(false);
                cbtVarB.u(615092398);
                j2 = den.ak(cbtVarB).i;
                cbtVarB.W(false);
            }
            aomy aomyVar3 = aomyVar2;
            aaoo.ae(aomyVar3, cmwVar, bgcVar, j, j2, (defpackage.bpn) null, defpackage.izu.c, cbtVarB, ((i2 >> 6) & 14) | 12582912 | ((i2 << 3) & 112));
        } else {
            cbtVarB.s();
        }
        cdk cdkVarI = cbtVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new bsq(cmwVar, z, aomyVar, i, 2);
        }
    }

    public static void w(cmw cmwVar, final boolean z, final defpackage.ixc ixcVar, aomy aomyVar, aomy aomyVar2, aomy aomyVar3, cav cavVar, int i) {
        final aomy aomyVar4;
        final aomy aomyVar5;
        final aomy aomyVar6;
        cmw cmwVar2;
        ccp ccpVar;
        cav cavVarB = cavVar.b(607488610);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            i2 |= true != cavVarB.C(z) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != cavVarB.z(ixcVar.ordinal()) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            aomyVar4 = aomyVar;
            i2 |= true != cavVarB.D(aomyVar4) ? 1024 : 2048;
        } else {
            aomyVar4 = aomyVar;
        }
        if ((i & 24576) == 0) {
            aomyVar5 = aomyVar2;
            i2 |= true != cavVarB.D(aomyVar5) ? 8192 : 16384;
        } else {
            aomyVar5 = aomyVar2;
        }
        if ((196608 & i) == 0) {
            aomyVar6 = aomyVar3;
            i2 |= true != cavVarB.D(aomyVar6) ? 65536 : 131072;
        } else {
            aomyVar6 = aomyVar3;
        }
        if (cavVarB.H((74899 & i2) != 74898, i2 & 1)) {
            cmw cmwVar3 = cmw.c;
            cbt cbtVar = (cbt) cavVarB;
            java.lang.Object objR = cbtVar.R();
            java.lang.Object obj = cau.a;
            if (objR == obj) {
                androidx.compose.runtime.ParcelableSnapshotMutableState parcelableSnapshotMutableState = new androidx.compose.runtime.ParcelableSnapshotMutableState(java.lang.Boolean.FALSE, cdu.c);
                cbtVar.ab(parcelableSnapshotMutableState);
                objR = parcelableSnapshotMutableState;
            }
            ccp ccpVar2 = (ccp) objR;
            cye cyeVarB = awo.b(cmh.a, false);
            int iM = anty.M(cbtVar.x);
            cje cjeVarAi = cbtVar.ai();
            cmw cmwVarM = cfo.m(cavVarB, cmwVar3);
            aomy aomyVar7 = dam.a;
            cavVarB.v();
            if (cbtVar.w) {
                cavVarB.j(aomyVar7);
            } else {
                cavVarB.x();
            }
            cev.c(cavVarB, cyeVarB, dam.e);
            cev.c(cavVarB, cjeVarAi, dam.d);
            cev.c(cavVarB, java.lang.Integer.valueOf(iM), dam.f);
            cev.b(cavVarB, dam.g);
            cev.c(cavVarB, cmwVarM, dam.c);
            boolean z2 = ixcVar == defpackage.ixc.b || !z;
            java.lang.Object objR2 = cbtVar.R();
            if (objR2 == obj) {
                objR2 = new defpackage.hll(ccpVar2, 14);
                cbtVar.ab(objR2);
            }
            aaoo.aC((aomy) objR2, (cmw) null, z2, (defpackage.bpw) null, (kaw) null, (crd) null, defpackage.izu.f, cavVarB, 1572870, 58);
            boolean zC = a.C(ccpVar2);
            java.lang.Object objR3 = cbtVar.R();
            if (objR3 == obj) {
                ccpVar = ccpVar2;
                objR3 = new defpackage.hll(ccpVar, 15);
                cbtVar.ab(objR3);
            } else {
                ccpVar = ccpVar2;
            }
            final ccp ccpVar3 = ccpVar;
            aaoo.Q(zC, (aomy) objR3, azm.k(cmwVar3, 208.0f), 0L, (defpackage.aon) null, (defpackage.drs) null, den.am(cavVarB).d, den.ak(cavVarB).I, 0.0f, cfo.j(-248037683, new aono() { // from class: izy
                public final java.lang.Object a(java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
                    cav cavVar2 = (cav) obj3;
                    int iIntValue = ((java.lang.Integer) obj4).intValue();
                    aooh.f((awy) obj2, "$this$DropdownMenu");
                    int i3 = iIntValue & 17;
                    if (cavVar2.H(i3 != 16, iIntValue & 1)) {
                        ccp ccpVar4 = ccpVar3;
                        boolean z3 = z;
                        if (z3) {
                            cavVar2.u(-1946615147);
                            cavVar2.o();
                        } else {
                            aomy aomyVar8 = aomyVar4;
                            cavVar2.u(-1946833294);
                            aonn aonnVar = defpackage.izu.g;
                            boolean zB = cavVar2.B(aomyVar8);
                            java.lang.Object objG = cavVar2.g();
                            if (zB || objG == cau.a) {
                                objG = new defpackage.hpc(aomyVar8, ccpVar4, 9, null);
                                cavVar2.w(objG);
                            }
                            aaoo.P(aonnVar, (aomy) objG, (cmw) null, (aonn) null, false, (defpackage.brb) null, (ayy) null, cavVar2, 6, 508);
                            cavVar2.o();
                        }
                        defpackage.ixc ixcVar2 = ixcVar;
                        defpackage.ixc ixcVar3 = defpackage.ixc.b;
                        if (ixcVar2 == ixcVar3) {
                            aomy aomyVar9 = aomyVar5;
                            cavVar2.u(-1946572615);
                            aonn aonnVar2 = defpackage.izu.h;
                            boolean zB2 = cavVar2.B(aomyVar9);
                            java.lang.Object objG2 = cavVar2.g();
                            if (zB2 || objG2 == cau.a) {
                                objG2 = new defpackage.hpc(aomyVar9, ccpVar4, 10, null);
                                cavVar2.w(objG2);
                            }
                            aaoo.P(aonnVar2, (aomy) objG2, (cmw) null, (aonn) null, false, (defpackage.brb) null, (ayy) null, cavVar2, 6, 508);
                            cavVar2.o();
                        } else {
                            cavVar2.u(-1946361195);
                            cavVar2.o();
                        }
                        if (ixcVar2 != ixcVar3 || z3) {
                            cavVar2.u(-1946092363);
                            cavVar2.o();
                        } else {
                            aomy aomyVar10 = aomyVar6;
                            cavVar2.u(-1946303783);
                            aonn aonnVar3 = defpackage.izu.i;
                            boolean zB3 = cavVar2.B(aomyVar10);
                            java.lang.Object objG3 = cavVar2.g();
                            if (zB3 || objG3 == cau.a) {
                                objG3 = new defpackage.hpc(aomyVar10, ccpVar4, 11, null);
                                cavVar2.w(objG3);
                            }
                            aaoo.P(aonnVar3, (aomy) objG3, (cmw) null, (aonn) null, false, (defpackage.brb) null, (ayy) null, cavVar2, 6, 508);
                            cavVar2.o();
                        }
                    } else {
                        cavVar2.s();
                    }
                    return aojh.a;
                }
            }, cavVarB), cavVarB, 432, 48, 1848);
            cavVarB = cavVarB;
            cbtVar.W(true);
            cmwVar2 = cmwVar3;
        } else {
            cavVarB.s();
            cmwVar2 = cmwVar;
        }
        cdk cdkVarI = cavVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new defpackage.bxp(cmwVar2, z, ixcVar, aomyVar, aomyVar2, aomyVar3, i, 2);
        }
    }

    public static void x(defpackage.izq izqVar, cmw cmwVar, cav cavVar, int i) {
        int i2;
        cmw cmwVar2;
        int i3 = i & 6;
        cav cavVarB = cavVar.b(-400762185);
        int i4 = 4;
        if (i3 == 0) {
            i2 = i | (true != cavVarB.B(izqVar) ? 2 : 4);
        } else {
            i2 = i;
        }
        int i5 = i2 | 48;
        if (cavVarB.H((i5 & 19) != 18, i5 & 1)) {
            cmwVar2 = cmw.c;
            aaoo.K(cmwVar2, cfo.j(1595781747, new defpackage.izk(izqVar, i4), cavVarB), (aonn) null, (aonn) null, cfo.j(-923654192, new defpackage.izk(izqVar, 5), cavVarB), true != izqVar.a ? 1 : 2, den.ak(cavVarB).F, 0L, (azz) null, cfo.j(522564616, new defpackage.ant(izqVar, 13), cavVarB), cavVarB, ((i5 >> 3) & 14) | 805330992, 396);
        } else {
            cavVarB.s();
            cmwVar2 = cmwVar;
        }
        cdk cdkVarI = cavVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new defpackage.dqt(izqVar, cmwVar2, i, 5, null);
        }
    }

    public static /* synthetic */ defpackage.heq y(akzx akzxVar) {
        aooh.f(akzxVar, "builder");
        return new defpackage.heq(akzxVar);
    }

    public static /* synthetic */ defpackage.heq z(akzx akzxVar) {
        aooh.f(akzxVar, "builder");
        return new defpackage.heq(akzxVar);
    }

    public java.lang.String r() {
        throw null;
    }
}
