package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class hgz {
    public hgz(defpackage.hil hilVar) {
        j$.util.Objects.requireNonNull(hilVar);
    }

    public static final void A(defpackage.krx krxVar, defpackage.krk krkVar, cmw cmwVar, cav cavVar, int i) {
        int i2;
        cdk cdkVarI;
        defpackage.kko kkoVar;
        defpackage.krx krxVar2 = krxVar;
        defpackage.krk krkVar2 = krkVar;
        int i3 = i & 6;
        cbt cbtVarB = cavVar.b(986650453);
        if (i3 == 0) {
            i2 = (true != cbtVarB.B(krxVar2) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != ((i & 64) == 0 ? cbtVarB.B(krkVar2) : cbtVarB.D(krkVar2)) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != cbtVarB.B(cmwVar) ? 128 : 256;
        }
        if (cbtVarB.H((i2 & 147) != 146, i2 & 1)) {
            defpackage.krp krpVar = krxVar2.c;
            if (krpVar instanceof defpackage.krm) {
                java.util.List list = ((defpackage.krm) krpVar).a;
                if (list.isEmpty()) {
                    cdkVarI = cbtVarB.I();
                    if (cdkVarI == null) {
                        return;
                    } else {
                        kkoVar = new defpackage.kko((java.lang.Object) krxVar, (java.lang.Object) krkVar, cmwVar, i, 5);
                    }
                } else {
                    krkVar2 = krkVar;
                    krxVar2 = krxVar;
                    awh awhVar = awi.c;
                    cmi cmiVar = cmh.j;
                    cye cyeVarA = aww.a(awhVar, cmiVar, cbtVarB, 0);
                    cbt cbtVar = cbtVarB;
                    int iM = anty.M(cbtVar.x);
                    cje cjeVarAi = cbtVar.ai();
                    cmw cmwVarM = cfo.m(cbtVarB, cmwVar);
                    aomy aomyVar = dam.a;
                    cbtVarB.v();
                    if (cbtVar.w) {
                        cbtVarB.j(aomyVar);
                    } else {
                        cbtVarB.x();
                    }
                    aonn aonnVar = dam.e;
                    cev.c(cbtVarB, cyeVarA, aonnVar);
                    aonn aonnVar2 = dam.d;
                    cev.c(cbtVarB, cjeVarAi, aonnVar2);
                    java.lang.Integer numValueOf = java.lang.Integer.valueOf(iM);
                    aonn aonnVar3 = dam.f;
                    cev.c(cbtVarB, numValueOf, aonnVar3);
                    aonj aonjVar = dam.g;
                    cev.b(cbtVarB, aonjVar);
                    aonn aonnVar4 = dam.c;
                    cev.c(cbtVarB, cmwVarM, aonnVar4);
                    int i4 = i2;
                    G(krxVar2, dfa.f(2132019156, cbtVarB), null, cbtVarB, i2 & 14);
                    cmw cmwVarBa = den.ba(cmw.c, 0.0f, 12.0f, 0.0f, 0.0f);
                    cye cyeVarA2 = aww.a(awi.f(8.0f), cmiVar, cbtVarB, 6);
                    int iM2 = anty.M(cbtVar.x);
                    cje cjeVarAi2 = cbtVar.ai();
                    cmw cmwVarM2 = cfo.m(cbtVarB, cmwVarBa);
                    cbtVarB.v();
                    if (cbtVar.w) {
                        cbtVarB.j(aomyVar);
                    } else {
                        cbtVarB.x();
                    }
                    cev.c(cbtVarB, cyeVarA2, aonnVar);
                    cev.c(cbtVarB, cjeVarAi2, aonnVar2);
                    cev.c(cbtVarB, java.lang.Integer.valueOf(iM2), aonnVar3);
                    cev.b(cbtVarB, aonjVar);
                    cev.c(cbtVarB, cmwVarM2, aonnVar4);
                    cbtVarB.u(-1857886904);
                    java.util.Iterator it = list.iterator();
                    while (it.hasNext()) {
                        E((defpackage.krl) it.next(), krkVar2, null, cbtVarB, i4 & 112);
                    }
                    cbtVar.W(false);
                    cbtVar.W(true);
                    cbtVar.W(true);
                }
            } else {
                cdkVarI = cbtVarB.I();
                if (cdkVarI == null) {
                    return;
                } else {
                    kkoVar = new defpackage.kko((java.lang.Object) krxVar2, (java.lang.Object) krkVar2, cmwVar, i, 4);
                }
            }
            cdkVarI.c = kkoVar;
        }
        cbtVarB.s();
        cdkVarI = cbtVarB.I();
        if (cdkVarI != null) {
            kkoVar = new defpackage.kko((java.lang.Object) krxVar2, (java.lang.Object) krkVar2, cmwVar, i, 9);
            cdkVarI.c = kkoVar;
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: aois */
    public static final void B(defpackage.krx krxVar, cmw cmwVar, aomy aomyVar, aomy aomyVar2, aonn aonnVar, defpackage.krk krkVar, android.view.View view, cav cavVar, int i) throws aois {
        int i2;
        cav cavVar2;
        android.view.View view2;
        defpackage.krx krxVar2 = krxVar;
        int i3 = i & 6;
        cav cavVarB = cavVar.b(261772458);
        if (i3 == 0) {
            i2 = (true != cavVarB.B(krxVar2) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != cavVarB.B(cmwVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != cavVarB.D((java.lang.Object) null) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != cavVarB.D(aomyVar) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i2 |= true != cavVarB.D(aomyVar2) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            i2 |= true != cavVarB.D(aonnVar) ? 65536 : 131072;
        }
        if ((1572864 & i) == 0) {
            i2 |= true != ((2097152 & i) == 0 ? cavVarB.B(krkVar) : cavVarB.D(krkVar)) ? 524288 : 1048576;
        }
        if ((12582912 & i) == 0) {
            i2 |= true != cavVarB.D((java.lang.Object) null) ? 4194304 : 8388608;
        }
        if ((100663296 & i) == 0) {
            i2 |= true != cavVarB.D(view) ? 33554432 : 67108864;
        }
        int i4 = i2;
        if (cavVarB.H((38347923 & i4) != 38347922, i4 & 1)) {
            defpackage.hhb.A((android.content.Context) cavVarB.e(dep.b));
            awb awbVarF = awi.f(12.0f);
            cmi cmiVar = cmh.j;
            cye cyeVarA = aww.a(awbVarF, cmiVar, cavVarB, 6);
            cbt cbtVar = (cbt) cavVarB;
            int iM = anty.M(cbtVar.x);
            cje cjeVarAi = cbtVar.ai();
            cmw cmwVarM = cfo.m(cavVarB, cmwVar);
            aomy aomyVar3 = dam.a;
            cavVarB.v();
            if (cbtVar.w) {
                cavVarB.j(aomyVar3);
            } else {
                cavVarB.x();
            }
            aonn aonnVar2 = dam.e;
            cev.c(cavVarB, cyeVarA, aonnVar2);
            aonn aonnVar3 = dam.d;
            cev.c(cavVarB, cjeVarAi, aonnVar3);
            java.lang.Integer numValueOf = java.lang.Integer.valueOf(iM);
            aonn aonnVar4 = dam.f;
            cev.c(cavVarB, numValueOf, aonnVar4);
            aonj aonjVar = dam.g;
            cev.b(cavVarB, aonjVar);
            aonn aonnVar5 = dam.c;
            cev.c(cavVarB, cmwVarM, aonnVar5);
            cmt cmtVar = cmw.c;
            cmw cmwVarBa = den.ba(den.bn(cmtVar, den.ak(cavVarB).F, den.am(cavVarB).d), 0.0f, 9.0f, 0.0f, 16.0f);
            cye cyeVarA2 = aww.a(awi.c, cmiVar, cavVarB, 0);
            int iM2 = anty.M(cbtVar.x);
            cje cjeVarAi2 = cbtVar.ai();
            cmw cmwVarM2 = cfo.m(cavVarB, cmwVarBa);
            cavVarB.v();
            if (cbtVar.w) {
                cavVarB.j(aomyVar3);
            } else {
                cavVarB.x();
            }
            cev.c(cavVarB, cyeVarA2, aonnVar2);
            cev.c(cavVarB, cjeVarAi2, aonnVar3);
            cev.c(cavVarB, java.lang.Integer.valueOf(iM2), aonnVar4);
            cev.b(cavVarB, aonjVar);
            cev.c(cavVarB, cmwVarM2, aonnVar5);
            defpackage.ksn ksnVar = krxVar2.b;
            cavVarB.u(-1825584178);
            den.aR(azm.e(cmtVar, 7.0f), cavVarB);
            cbtVar.W(false);
            C(krxVar2, den.ba(cmtVar, 16.0f, 0.0f, 3.0f, 0.0f), cavVarB, (i4 & 14) | 48 | (i4 & 896), 0);
            java.lang.String str = ((defpackage.ksm) ksnVar).a;
            if (aoov.H(str)) {
                cavVarB.u(-1824947252);
                cbtVar.W(false);
            } else {
                cavVarB.u(-1825100051);
                den.aR(azm.e(cmtVar, 12.0f), cavVarB);
                cbtVar.W(false);
            }
            int i5 = ((i4 << 3) & 112) | 6;
            int i6 = i4 >> 3;
            x(den.aZ(cmtVar, 16.0f, 0.0f), krxVar2, aomyVar, krkVar, aonnVar, cavVarB, (i6 & 896) | i5 | ((i4 >> 9) & 7168) | (i6 & 57344), 0);
            cavVar2 = cavVarB;
            boolean zH = aoov.H(str);
            if (zH) {
                cavVar2.u(-1824418516);
                cbtVar.W(false);
            } else {
                cavVar2.u(-1824475215);
                den.aR(azm.e(cmtVar, 12.0f), cavVar2);
                cbtVar.W(false);
            }
            krxVar2 = krxVar;
            y(den.aZ(cmtVar, 16.0f, 0.0f), krxVar2, aomyVar2, cavVar2, i5 | ((i4 >> 6) & 896), 0);
            view2 = view;
            z(krxVar2.d, view2, zH, cavVar2, (i4 >> 18) & 1008);
            cbtVar.W(true);
            cbtVar.W(true);
        } else {
            cavVar2 = cavVarB;
            view2 = view;
            cavVar2.s();
        }
        cdk cdkVarI = cavVar2.I();
        if (cdkVarI != null) {
            cdkVarI.c = new ciy(krxVar2, cmwVar, aomyVar, aomyVar2, aonnVar, krkVar, view2, i, 2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x004e  */
    /* JADX WARN: Code duplicated, block: B:29:0x0055  */
    /* JADX WARN: Code duplicated, block: B:30:0x0058  */
    /* JADX WARN: Code duplicated, block: B:34:0x0062  */
    /* JADX WARN: Code duplicated, block: B:35:0x0064  */
    /* JADX WARN: Code duplicated, block: B:38:0x006c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:39:0x006e  */
    /* JADX WARN: Code duplicated, block: B:40:0x0072  */
    /* JADX WARN: Code duplicated, block: B:43:0x0096  */
    /* JADX WARN: Code duplicated, block: B:44:0x009a  */
    /* JADX WARN: Code duplicated, block: B:47:0x0172  */
    /* JADX WARN: Code duplicated, block: B:50:0x0179 A[LOOP:0: B:48:0x0175->B:50:0x0179, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:51:0x0181  */
    /* JADX WARN: Code duplicated, block: B:53:0x0185  */
    /* JADX WARN: Code duplicated, block: B:56:0x018b A[LOOP:1: B:54:0x0187->B:56:0x018b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:60:0x019b A[LOOP:2: B:58:0x0197->B:60:0x019b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:63:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:64:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:66:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:69:0x01a3 A[EDGE_INSN: B:69:0x01a3->B:61:0x01a3 BREAK  A[LOOP:0: B:48:0x0175->B:50:0x0179], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:71:0x01a3 A[EDGE_INSN: B:71:0x01a3->B:61:0x01a3 BREAK  A[LOOP:2: B:58:0x0197->B:60:0x019b], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:72:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:73:? A[RETURN, SYNTHETIC] */
    public static final void C(defpackage.krx krxVar, cmw cmwVar, cav cavVar, int i, int i2) {
        int i3;
        cmw cmwVar2;
        boolean z;
        cdk cdkVarI;
        defpackage.bbu bbuVar;
        cmw cmwVar3;
        aomy aomyVar;
        cmw cmwVar4;
        int i4;
        cfl cflVar;
        int i5;
        cfp cfpVar;
        int i6;
        cfp cfpVar2;
        int i7;
        int i8;
        cbt cbtVarB = cavVar.b(231143438);
        cbt cbtVar = cbtVarB;
        int i9 = cbtVar.w ? -cbtVar.r.q : cbtVar.p.h;
        if ((i & 6) == 0) {
            i3 = (true != cbtVarB.B(krxVar) ? 2 : 4) | i;
        } else {
            i3 = i;
        }
        int i10 = i2 & 2;
        if (i10 == 0) {
            if ((i & 48) == 0) {
                cmwVar2 = cmwVar;
                i3 |= true != cbtVarB.B(cmwVar2) ? 16 : 32;
            }
            if ((i & 384) == 0) {
                if (true != cbtVarB.D((java.lang.Object) null)) {
                    i8 = 128;
                } else {
                    i8 = 256;
                }
                i3 |= i8;
            }
            if ((i3 & 147) != 146) {
                z = true;
            } else {
                z = false;
            }
            if (cbtVarB.H(z, i3 & 1)) {
                if (i10 != 0) {
                    cmwVar3 = cmw.c;
                } else {
                    cmwVar3 = cmwVar2;
                }
                defpackage.ksj ksjVar = krxVar.a;
                cye cyeVarA = azh.a(awi.a, cmh.n, cbtVarB, 48);
                int iM = anty.M(cbtVar.x);
                cje cjeVarAi = cbtVar.ai();
                cmw cmwVarM = cfo.m(cbtVarB, cmwVar3);
                aomyVar = dam.a;
                cbtVarB.v();
                if (cbtVar.w) {
                    cbtVarB.j(aomyVar);
                } else {
                    cbtVarB.x();
                }
                cev.c(cbtVarB, cyeVarA, dam.e);
                cev.c(cbtVarB, cjeVarAi, dam.d);
                cev.c(cbtVarB, java.lang.Integer.valueOf(iM), dam.f);
                cev.b(cbtVarB, dam.g);
                cev.c(cbtVarB, cmwVarM, dam.c);
                cbtVarB.u(1018455075);
                cmt cmtVar = cmw.c;
                aaoo.V(wv.k(2131231357, cbtVarB, 0), (java.lang.String) null, den.aY(den.bp(cfd.K(azm.g(cmtVar, 32.0f), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, bge.a, true, 0, 1042431), den.ak(cbtVarB).p), 6.0f), cfd.S(), cbtVarB, 3080, 0);
                den.aR(azm.k(cmtVar, 8.0f), cbtVarB);
                cmwVar4 = cmwVar3;
                i4 = i9;
                abrz.k(ksjVar.a, (cmw) null, den.ak(cbtVarB).q, 0L, (dnd) null, (dmq) null, 0L, (dot) null, 0L, 0, false, 1, 0, (aonj) null, den.an(cbtVarB).m, cbtVarB, 0, 24576, 114682);
                den.aR(azm.k(cmtVar, 8.0f), cbtVarB);
                cbtVarB.u(1019628920);
                cbtVar.W(false);
                if (i4 < 0) {
                    if (cbtVar.w) {
                        cfpVar = cbtVar.r;
                        while (cbtVar.w) {
                            cbtVar.W(cfpVar.S(cfpVar.q));
                        }
                    }
                    cflVar = cbtVar.p;
                    while (true) {
                        i5 = cflVar.h;
                        if (i5 > i4) {
                            break;
                        } else {
                            cbtVar.W(cflVar.B(i5));
                        }
                    }
                } else {
                    i6 = -i4;
                    cfpVar2 = cbtVar.r;
                    while (true) {
                        i7 = cfpVar2.q;
                        if (i7 > i6) {
                            break;
                        } else {
                            cbtVar.W(cfpVar2.S(i7));
                        }
                    }
                }
                cdkVarI = cbtVarB.I();
                if (cdkVarI != null) {
                    return;
                } else {
                    bbuVar = new defpackage.bbu(krxVar, cmwVar4, i, i2, 3);
                }
            } else {
                cbtVarB.s();
                cdkVarI = cbtVarB.I();
                if (cdkVarI != null) {
                    return;
                } else {
                    bbuVar = new defpackage.bbu(krxVar, cmwVar2, i, i2, 4);
                }
            }
            cdkVarI.c = bbuVar;
        }
        i3 |= 48;
        cmwVar2 = cmwVar;
        if ((i & 384) == 0) {
            if (true != cbtVarB.D((java.lang.Object) null)) {
                i8 = 128;
            } else {
                i8 = 256;
            }
            i3 |= i8;
        }
        if ((i3 & 147) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (cbtVarB.H(z, i3 & 1)) {
            if (i10 != 0) {
                cmwVar3 = cmw.c;
            } else {
                cmwVar3 = cmwVar2;
            }
            defpackage.ksj ksjVar2 = krxVar.a;
            cye cyeVarA2 = azh.a(awi.a, cmh.n, cbtVarB, 48);
            int iM2 = anty.M(cbtVar.x);
            cje cjeVarAi2 = cbtVar.ai();
            cmw cmwVarM2 = cfo.m(cbtVarB, cmwVar3);
            aomyVar = dam.a;
            cbtVarB.v();
            if (cbtVar.w) {
                cbtVarB.j(aomyVar);
            } else {
                cbtVarB.x();
            }
            cev.c(cbtVarB, cyeVarA2, dam.e);
            cev.c(cbtVarB, cjeVarAi2, dam.d);
            cev.c(cbtVarB, java.lang.Integer.valueOf(iM2), dam.f);
            cev.b(cbtVarB, dam.g);
            cev.c(cbtVarB, cmwVarM2, dam.c);
            cbtVarB.u(1018455075);
            cmt cmtVar2 = cmw.c;
            aaoo.V(wv.k(2131231357, cbtVarB, 0), (java.lang.String) null, den.aY(den.bp(cfd.K(azm.g(cmtVar2, 32.0f), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, bge.a, true, 0, 1042431), den.ak(cbtVarB).p), 6.0f), cfd.S(), cbtVarB, 3080, 0);
            den.aR(azm.k(cmtVar2, 8.0f), cbtVarB);
            cmwVar4 = cmwVar3;
            i4 = i9;
            abrz.k(ksjVar2.a, (cmw) null, den.ak(cbtVarB).q, 0L, (dnd) null, (dmq) null, 0L, (dot) null, 0L, 0, false, 1, 0, (aonj) null, den.an(cbtVarB).m, cbtVarB, 0, 24576, 114682);
            den.aR(azm.k(cmtVar2, 8.0f), cbtVarB);
            cbtVarB.u(1019628920);
            cbtVar.W(false);
            if (i4 < 0) {
                if (cbtVar.w) {
                    cfpVar = cbtVar.r;
                    while (cbtVar.w) {
                        cbtVar.W(cfpVar.S(cfpVar.q));
                    }
                }
                cflVar = cbtVar.p;
                while (true) {
                    i5 = cflVar.h;
                    if (i5 > i4) {
                        break;
                        break;
                    }
                    cbtVar.W(cflVar.B(i5));
                }
            } else {
                i6 = -i4;
                cfpVar2 = cbtVar.r;
                while (true) {
                    i7 = cfpVar2.q;
                    if (i7 > i6) {
                        break;
                        break;
                    }
                    cbtVar.W(cfpVar2.S(i7));
                }
            }
            cdkVarI = cbtVarB.I();
            if (cdkVarI != null) {
                return;
            } else {
                bbuVar = new defpackage.bbu(krxVar, cmwVar4, i, i2, 3);
            }
        } else {
            cbtVarB.s();
            cdkVarI = cbtVarB.I();
            if (cdkVarI != null) {
                return;
            } else {
                bbuVar = new defpackage.bbu(krxVar, cmwVar2, i, i2, 4);
            }
        }
        cdkVarI.c = bbuVar;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: aois */
    public static final void D(defpackage.krx krxVar, cmw cmwVar, aomy aomyVar, aonn aonnVar, defpackage.krk krkVar, cav cavVar, int i) throws aois {
        int i2;
        aonn aonnVar2;
        cav cavVar2;
        boolean z;
        cmw cmwVarAY;
        int i3 = i & 6;
        cav cavVarB = cavVar.b(421132904);
        if (i3 == 0) {
            i2 = (true != cavVarB.B(krxVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != cavVarB.B(cmwVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != cavVarB.D((java.lang.Object) null) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != cavVarB.D(aomyVar) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            aonnVar2 = aonnVar;
            i2 |= true != cavVarB.D(aonnVar2) ? 8192 : 16384;
        } else {
            aonnVar2 = aonnVar;
        }
        if ((196608 & i) == 0) {
            i2 |= true != ((262144 & i) == 0 ? cavVarB.B(krkVar) : cavVarB.D(krkVar)) ? 65536 : 131072;
        }
        int i4 = i2;
        if (cavVarB.H((74899 & i4) != 74898, i4 & 1)) {
            cye cyeVarA = aww.a(awi.f(8.0f), cmh.j, cavVarB, 6);
            cbt cbtVar = (cbt) cavVarB;
            int iM = anty.M(cbtVar.x);
            cje cjeVarAi = cbtVar.ai();
            cmw cmwVarM = cfo.m(cavVarB, cmwVar);
            aomy aomyVar2 = dam.a;
            cavVarB.v();
            if (cbtVar.w) {
                cavVarB.j(aomyVar2);
            } else {
                cavVarB.x();
            }
            cev.c(cavVarB, cyeVarA, dam.e);
            cev.c(cavVarB, cjeVarAi, dam.d);
            cev.c(cavVarB, java.lang.Integer.valueOf(iM), dam.f);
            cev.b(cavVarB, dam.g);
            cev.c(cavVarB, cmwVarM, dam.c);
            if (ac(krxVar)) {
                z = false;
                cavVarB.u(-1974370864);
                cbtVar.W(false);
            } else {
                cavVarB.u(-1974499638);
                C(krxVar, null, cavVarB, i4 & 910, 2);
                z = false;
                cbtVar.W(false);
            }
            if (ac(krxVar)) {
                cavVarB.u(-1974266797);
                cbtVar.W(z);
                cmwVarAY = den.ba(cmw.c, 0.0f, 0.0f, 0.0f, 8.0f);
            } else {
                cavVarB.u(-1974165644);
                cmwVarAY = den.aY(den.bn(cmw.c, den.ak(cavVarB).G, den.am(cavVarB).d), 16.0f);
                cbtVar.W(false);
            }
            int i5 = (i4 << 3) & 112;
            x(cmwVarAY, krxVar, null, krkVar, aonnVar2, cavVarB, ((i4 >> 6) & 7168) | i5 | (57344 & i4), 4);
            cavVar2 = cavVarB;
            y(null, krxVar, aomyVar, cavVar2, i5 | ((i4 >> 3) & 896), 1);
            cbtVar.W(true);
        } else {
            cavVar2 = cavVarB;
            cavVar2.s();
        }
        cdk cdkVarI = cavVar2.I();
        if (cdkVarI != null) {
            cdkVarI.c = new defpackage.alh(krxVar, cmwVar, aomyVar, aonnVar, krkVar, i, 8);
        }
    }

    public static final void E(defpackage.krl krlVar, defpackage.krk krkVar, cmw cmwVar, cav cavVar, int i) {
        int i2;
        defpackage.krk krkVar2;
        cav cavVar2;
        cmw cmwVar2;
        int i3 = i & 6;
        cav cavVarB = cavVar.b(1387030326);
        if (i3 == 0) {
            i2 = i | (true != cavVarB.B(krlVar) ? 2 : 4);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != ((i & 64) == 0 ? cavVarB.B(krkVar) : cavVarB.D(krkVar)) ? 16 : 32;
        }
        int i4 = i2 | 384;
        if (cavVarB.H((i4 & 147) != 146, i4 & 1)) {
            cmw cmwVar3 = cmw.c;
            java.lang.Object objE = cavVarB.e(defpackage.nr.a);
            aooh.d(objE, "null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
            az azVar = (az) objE;
            boolean z = (i4 & 14) == 4;
            cmw cmwVarD = azm.d(cmwVar3, 1.0f);
            boolean zD = z | cavVarB.D(azVar) | ((i4 & 112) == 32 || ((i4 & 64) != 0 && cavVarB.D(krkVar)));
            cbt cbtVar = (cbt) cavVarB;
            java.lang.Object objR = cbtVar.R();
            if (zD || objR == cau.a) {
                objR = new defpackage.af(krlVar, azVar, krkVar, 19, (short[]) null);
                cbtVar.ab(objR);
            }
            cmw cmwVarBj = den.bj(cmwVarD, true, (java.lang.String) null, (dib) null, (aomy) objR);
            cye cyeVarA = azh.a(awi.a, cmh.n, cavVarB, 48);
            int iM = anty.M(cbtVar.x);
            cje cjeVarAi = cbtVar.ai();
            cmw cmwVarM = cfo.m(cavVarB, cmwVarBj);
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
            aaoo.V(wv.k(r1.a, cavVarB, 0), (java.lang.String) null, azm.g(cmwVar3, 20.0f), den.ak(cavVarB).s, cavVarB, 440, 0);
            den.aR(azm.k(cmwVar3, 12.0f), cavVarB);
            cavVar2 = cavVarB;
            cmwVar2 = cmwVar3;
            abrz.k(krlVar.b, (cmw) null, 0L, 0L, (dnd) null, (dmq) null, 0L, (dot) null, 0L, 0, false, 0, 0, (aonj) null, dkz.z(den.an(cavVarB).k, den.ak(cavVarB).a, 0L, (dnd) null, (dmw) null, (dmq) null, (java.lang.String) null, 0L, 0L, dou.b, 0, 0L, (dki) null, (dos) null, 0, 0, 16773118), cavVar2, 0, 0, 131070);
            krkVar2 = krkVar;
            krkVar2.a(new defpackage.krf(krlVar.d));
            cbtVar.W(true);
        } else {
            krkVar2 = krkVar;
            cavVar2 = cavVarB;
            cavVar2.s();
            cmwVar2 = cmwVar;
        }
        cdk cdkVarI = cavVar2.I();
        if (cdkVarI != null) {
            cdkVarI.c = new defpackage.kko((java.lang.Object) krlVar, (java.lang.Object) krkVar2, cmwVar2, i, 3);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: aois */
    public static final void F(defpackage.krx krxVar, defpackage.krk krkVar, cmw cmwVar, cav cavVar, int i) throws aois {
        int i2;
        cbt cbtVar;
        cmw cmwVar2;
        cdk cdkVarI;
        defpackage.kko kkoVar;
        int i3 = i & 6;
        cbt cbtVarB = cavVar.b(-1236266320);
        if (i3 == 0) {
            i2 = (true != cbtVarB.B(krxVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != ((i & 64) == 0 ? cbtVarB.B(krkVar) : cbtVarB.D(krkVar)) ? 16 : 32;
        }
        int i4 = i2 | 384;
        if (cbtVarB.H((i4 & 147) != 146, i4 & 1)) {
            defpackage.krp krpVar = krxVar.c;
            cbtVar = cbtVarB;
            cmwVar2 = cmw.c;
            if (krpVar == null) {
                cdkVarI = cbtVar.I();
                if (cdkVarI == null) {
                    return;
                } else {
                    kkoVar = new defpackage.kko((java.lang.Object) krxVar, (java.lang.Object) krkVar, cmwVar2, i, 6);
                }
            } else {
                j$.util.Objects.checkIndex(0, 4);
                if ((krpVar instanceof defpackage.krn) || (krpVar instanceof defpackage.kro)) {
                    cbtVar.u(-264979924);
                    cbtVar.W(false);
                    cdkVarI = cbtVar.I();
                    if (cdkVarI == null) {
                        return;
                    } else {
                        kkoVar = new defpackage.kko((java.lang.Object) krxVar, (java.lang.Object) krkVar, cmwVar2, i, 7);
                    }
                } else {
                    if (!(krpVar instanceof defpackage.krm)) {
                        cbtVar.u(1654014544);
                        cbtVar.W(false);
                        throw new aois();
                    }
                    cbtVar.u(1654021236);
                    A(krxVar, krkVar, cmwVar2, cbtVar, i4 & 1022);
                    cbtVar.W(false);
                }
            }
            cdkVarI.c = kkoVar;
        }
        cbtVar = cbtVarB;
        cbtVar.s();
        cmwVar2 = cmwVar;
        cdkVarI = cbtVar.I();
        if (cdkVarI != null) {
            kkoVar = new defpackage.kko((java.lang.Object) krxVar, (java.lang.Object) krkVar, cmwVar2, i, 8);
            cdkVarI.c = kkoVar;
        }
    }

    public static final void G(defpackage.krx krxVar, java.lang.String str, cmw cmwVar, cav cavVar, int i) {
        defpackage.krx krxVar2;
        int i2;
        cbt cbtVar;
        cmw cmwVar2;
        int i3 = i & 6;
        cbt cbtVarB = cavVar.b(-1780828221);
        if (i3 == 0) {
            krxVar2 = krxVar;
            i2 = i | (true != cbtVarB.B(krxVar2) ? 2 : 4);
        } else {
            krxVar2 = krxVar;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != cbtVarB.B(str) ? 16 : 32;
        }
        int i4 = i2 | 384;
        if (cbtVarB.H((i4 & 147) != 146, i4 & 1)) {
            cmw cmwVar3 = cmw.c;
            int i5 = (i4 >> 3) & 126;
            if (ac(krxVar2)) {
                cbtVarB.u(-1217191196);
                cbtVar = cbtVarB;
                abrz.k(str, cmwVar3, den.ak(cbtVarB).q, 0L, (dnd) null, (dmq) null, 0L, (dot) null, 0L, 0, false, 1, 0, (aonj) null, den.an(cbtVarB).m, cbtVar, i5, 24576, 114680);
                cbtVar.W(false);
            } else {
                cbtVarB.u(-1216990192);
                cbtVar = cbtVarB;
                abrz.k(str, cmwVar3, den.ak(cbtVarB).s, 0L, (dnd) null, (dmq) null, 0L, (dot) null, 0L, 0, false, 0, 0, (aonj) null, den.an(cbtVarB).n, cbtVar, i5, 0, 131064);
                cbtVar.W(false);
            }
            cmwVar2 = cmwVar3;
        } else {
            cbtVar = cbtVarB;
            cbtVar.s();
            cmwVar2 = cmwVar;
        }
        cdk cdkVarI = cbtVar.I();
        if (cdkVarI != null) {
            cdkVarI.c = new defpackage.kko(krxVar, str, cmwVar2, i, 10, null);
        }
    }

    public static final void H(defpackage.ksn ksnVar, aomy aomyVar, cmw cmwVar, cav cavVar, int i) {
        int i2;
        cav cavVar2;
        cmw cmwVar2;
        cdk cdkVarI;
        defpackage.kko kkoVar;
        int i3;
        cbt cbtVar;
        boolean z;
        cbt cbtVar2;
        int i4 = i & 6;
        cav cavVarB = cavVar.b(-643562255);
        if (i4 == 0) {
            i2 = i | (true != cavVarB.B(ksnVar) ? 2 : 4);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != cavVarB.D(aomyVar) ? 16 : 32;
        }
        int i5 = i2 | 384;
        if (cavVarB.H((i5 & 147) != 146, i5 & 1)) {
            cmw cmwVar3 = cmw.c;
            if (aoov.H(ad(ksnVar, cavVarB))) {
                cdkVarI = cavVarB.I();
                if (cdkVarI == null) {
                    return;
                } else {
                    kkoVar = new defpackage.kko(ksnVar, aomyVar, cmwVar3, i, 11, null);
                }
            } else {
                cye cyeVarA = aww.a(awi.c, cmh.j, cavVarB, 0);
                cbt cbtVar3 = (cbt) cavVarB;
                int iM = anty.M(cbtVar3.x);
                cje cjeVarAi = cbtVar3.ai();
                cmw cmwVarM = cfo.m(cavVarB, cmwVar3);
                aomy aomyVar2 = dam.a;
                cavVarB.v();
                if (cbtVar3.w) {
                    cavVarB.j(aomyVar2);
                } else {
                    cavVarB.x();
                }
                cev.c(cavVarB, cyeVarA, dam.e);
                cev.c(cavVarB, cjeVarAi, dam.d);
                cev.c(cavVarB, java.lang.Integer.valueOf(iM), dam.f);
                cev.b(cavVarB, dam.g);
                cev.c(cavVarB, cmwVarM, dam.c);
                java.lang.Object objR = cbtVar3.R();
                java.lang.Object obj = cau.a;
                if (objR == obj) {
                    objR = new defpackage.kbz(12);
                    cbtVar3.ab(objR);
                }
                cmw cmwVarBa = den.ba(dig.b(cmwVar3, true, (aonj) objR), 0.0f, 12.0f, 0.0f, 0.0f);
                java.lang.String strAd = ad(ksnVar, cavVarB);
                long j = den.ak(cavVarB).s;
                dkz dkzVar = den.an(cavVarB).k;
                java.lang.Integer num = ((defpackage.ksm) ksnVar).c;
                if (num != null) {
                    num.intValue();
                    i3 = 5;
                } else {
                    i3 = androidx.car.app.model.Alert.DURATION_SHOW_INDEFINITELY;
                }
                abrz.k(strAd, cmwVarBa, j, 0L, (dnd) null, (dmq) null, 0L, (dot) null, 0L, 0, false, i3, 0, (aonj) null, dkzVar, cavVarB, 0, 0, 114680);
                cavVar2 = cavVarB;
                if (aomyVar != null) {
                    cavVar2.u(1340601684);
                    cavVar2.u(-1619322288);
                    defpackage.djf djfVar = new defpackage.djf(16);
                    defpackage.dkx dkxVar = new defpackage.dkx(new dks(den.ak(cavVar2).a, 0L, (dnd) null, (dmw) null, (dmx) null, (dmq) null, (java.lang.String) null, 0L, (dok) null, (doz) null, (dnx) null, 0L, dou.b, (crc) null, 61438), null, null, null);
                    int i6 = i5 & 112;
                    java.lang.Object objR2 = cbtVar3.R();
                    if (i6 == 32 || objR2 == obj) {
                        z = true;
                        objR2 = new defpackage.krq(aomyVar, 1);
                        cbtVar2 = cbtVar3;
                        cbtVar2.ab(objR2);
                    } else {
                        cbtVar2 = cbtVar3;
                        z = true;
                    }
                    int iB = djfVar.b(new defpackage.dju("view full transcript", dkxVar, (defpackage.djx) objR2));
                    try {
                        djfVar.g(dfa.f(2132017704, cavVar2));
                        djfVar.i(iB);
                        dji djiVarC = djfVar.c();
                        cbtVar2.W(false);
                        cmt cmtVar = cmw.c;
                        java.lang.Object objR3 = cbtVar2.R();
                        if (objR3 == cau.a) {
                            objR3 = new defpackage.kbz(13);
                            cbtVar2.ab(objR3);
                        }
                        abrz.l(djiVarC, dig.b(cmtVar, z, (aonj) objR3), den.ak(cavVar2).s, 0L, 0L, (dot) null, 0L, 0, false, 0, 0, (java.util.Map) null, (aonj) null, den.an(cavVar2).k, cavVar2, 0, 0, 262136);
                        cavVar2 = cavVar2;
                        cbtVar = cbtVar2;
                        cbtVar.W(false);
                    } catch (java.lang.Throwable th) {
                        djfVar.i(iB);
                        throw th;
                    }
                } else {
                    cbtVar = cbtVar3;
                    cavVar2.u(1341346459);
                    cbtVar.W(false);
                }
                cbtVar.W(true);
                cmwVar2 = cmwVar3;
            }
            cdkVarI.c = kkoVar;
        }
        cavVar2 = cavVarB;
        cavVar2.s();
        cmwVar2 = cmwVar;
        cdkVarI = cavVar2.I();
        if (cdkVarI != null) {
            kkoVar = new defpackage.kko(ksnVar, aomyVar, cmwVar2, i, 2, null);
            cdkVarI.c = kkoVar;
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: aois */
    /* JADX WARN: Code duplicated, block: B:101:0x0118  */
    /* JADX WARN: Code duplicated, block: B:103:0x012c  */
    /* JADX WARN: Code duplicated, block: B:110:0x013d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:111:0x013f  */
    /* JADX WARN: Code duplicated, block: B:113:0x0144  */
    /* JADX WARN: Code duplicated, block: B:115:0x0147  */
    /* JADX WARN: Code duplicated, block: B:116:0x014f  */
    /* JADX WARN: Code duplicated, block: B:119:0x0154  */
    /* JADX WARN: Code duplicated, block: B:122:0x016f  */
    /* JADX WARN: Code duplicated, block: B:123:0x0194  */
    /* JADX WARN: Code duplicated, block: B:125:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:128:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:130:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:30:0x0062  */
    /* JADX WARN: Code duplicated, block: B:31:0x0065  */
    /* JADX WARN: Code duplicated, block: B:33:0x0069  */
    /* JADX WARN: Code duplicated, block: B:35:0x006f  */
    /* JADX WARN: Code duplicated, block: B:36:0x0072  */
    /* JADX WARN: Code duplicated, block: B:40:0x0079  */
    /* JADX WARN: Code duplicated, block: B:42:0x007e  */
    /* JADX WARN: Code duplicated, block: B:44:0x0082  */
    /* JADX WARN: Code duplicated, block: B:46:0x008a  */
    /* JADX WARN: Code duplicated, block: B:47:0x008d  */
    /* JADX WARN: Code duplicated, block: B:51:0x0095  */
    /* JADX WARN: Code duplicated, block: B:53:0x009b  */
    /* JADX WARN: Code duplicated, block: B:54:0x009e  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:60:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:61:0x00af  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:67:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:72:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:76:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:77:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:79:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:81:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:82:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:86:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:88:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:90:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:92:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:93:0x0100  */
    /* JADX WARN: Code duplicated, block: B:97:0x010d  */
    /* JADX WARN: Code duplicated, block: B:98:0x010f  */
    public static final void I(final defpackage.krx krxVar, final int i, cmw cmwVar, aomy aomyVar, final aomy aomyVar2, final aonn aonnVar, defpackage.krk krkVar, android.view.View view, cav cavVar, final int i2, final int i3) throws aois {
        int i4;
        cmw cmwVar2;
        int i5;
        int i6;
        aomy aomyVar3;
        int i7;
        int i8;
        int i9;
        android.view.View view2;
        int i10;
        boolean z;
        cav cavVar2;
        final defpackage.krk krkVar2;
        final cmw cmwVar3;
        final aomy aomyVar4;
        final android.view.View view3;
        cdk cdkVarI;
        int i11;
        int i12;
        cbt cbtVar;
        defpackage.krk krsVar;
        defpackage.krk krkVar3;
        cmw cmwVar4;
        int i13;
        int i14;
        cmw cmwVar5;
        aomy aomyVar5;
        android.view.View view4;
        int i15;
        boolean zD;
        int i16;
        int i17;
        aooh.f(aomyVar2, "onLearnMoreClick");
        aooh.f(aonnVar, "onSummaryRating");
        int i18 = i2 & 6;
        cav cavVarB = cavVar.b(258622972);
        if (i18 == 0) {
            i4 = (true != cavVarB.B(krxVar) ? 2 : 4) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= true != cavVarB.z(i + (-1)) ? 16 : 32;
        }
        int i19 = i3 & 4;
        if (i19 == 0) {
            if ((i2 & 384) == 0) {
                cmwVar2 = cmwVar;
                i4 |= true != cavVarB.B(cmwVar2) ? 128 : 256;
            }
            if ((i3 & 8) != 0) {
                i4 |= 3072;
            } else if ((i2 & 3072) == 0) {
                if (true != cavVarB.D((java.lang.Object) null)) {
                    i5 = 1024;
                } else {
                    i5 = 2048;
                }
                i4 |= i5;
            }
            i6 = i3 & 16;
            if (i6 != 0) {
                if ((i2 & 24576) == 0) {
                    aomyVar3 = aomyVar;
                    if (true != cavVarB.D(aomyVar3)) {
                        i7 = 8192;
                    } else {
                        i7 = 16384;
                    }
                    i4 |= i7;
                }
                if ((196608 & i2) == 0) {
                    if (true != cavVarB.D(aomyVar2)) {
                        i17 = 65536;
                    } else {
                        i17 = 131072;
                    }
                    i4 |= i17;
                }
                if ((1572864 & i2) == 0) {
                    if (true != cavVarB.D(aonnVar)) {
                        i16 = 524288;
                    } else {
                        i16 = 1048576;
                    }
                    i4 |= i16;
                }
                if ((12582912 & i2) == 0) {
                    i15 = 4194304;
                    if ((i3 & 128) == 0) {
                        if ((16777216 & i2) == 0) {
                            zD = cavVarB.B(krkVar);
                        } else {
                            zD = cavVarB.D(krkVar);
                        }
                        if (zD) {
                            i15 = 8388608;
                        }
                    }
                    i4 |= i15;
                }
                if ((i3 & 256) != 0) {
                    i4 |= 100663296;
                } else if ((i2 & 100663296) == 0) {
                    if (true != cavVarB.D((java.lang.Object) null)) {
                        i8 = 33554432;
                    } else {
                        i8 = 67108864;
                    }
                    i4 |= i8;
                }
                i9 = i3 & 512;
                if (i9 != 0) {
                    if ((805306368 & i2) == 0) {
                        view2 = view;
                        if (true != cavVarB.D(view2)) {
                            i10 = 268435456;
                        } else {
                            i10 = 536870912;
                        }
                        i4 |= i10;
                    }
                    if ((306783379 & i4) != 306783378) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (cavVarB.H(z, i4 & 1)) {
                        i11 = i3 & 128;
                        i12 = i - 1;
                        cbtVar = (cbt) cavVarB;
                        cbtVar.Z(-127, (java.lang.Object) null, 0, (java.lang.Object) null);
                        if ((i2 & 1) != 0 || cavVarB.E()) {
                            if (i19 != 0) {
                                cmwVar2 = cmw.c;
                            }
                            if (i6 != 0) {
                                aomyVar3 = null;
                            }
                            if (i11 != 0) {
                                i4 &= -29360129;
                                krsVar = new defpackage.krs();
                            } else {
                                krsVar = krkVar;
                            }
                            krkVar3 = krsVar;
                            if (i9 != 0) {
                                view2 = null;
                            }
                        } else {
                            cavVarB.s();
                            if (i11 != 0) {
                                i4 &= -29360129;
                            }
                            krkVar3 = krkVar;
                        }
                        cmwVar4 = cmwVar2;
                        cavVarB.l();
                        defpackage.hhb.A((android.content.Context) cavVarB.e(dep.b));
                        i13 = i4 >> 3;
                        i14 = i4 & 14;
                        if (i12 != 0) {
                            cavVarB.u(-571389184);
                            int i20 = i4 >> 6;
                            cavVar2 = cavVarB;
                            D(krxVar, cmwVar4, aomyVar2, aonnVar, krkVar3, cavVar2, i14 | (i13 & 112) | (i13 & 896) | (i20 & 7168) | (57344 & i20) | (i20 & 458752));
                            cmwVar5 = cmwVar4;
                            cbtVar.W(false);
                            aomyVar5 = aomyVar3;
                            view4 = view2;
                        } else {
                            cmwVar5 = cmwVar4;
                            cavVarB.u(-533723138);
                            int i21 = 458752 & i13;
                            int i22 = 3670016 & i13;
                            int i23 = 29360128 & i13;
                            int i24 = i14 | (i13 & 896) | (i13 & 7168) | (57344 & i13) | i21 | i22 | i23 | (i13 & 234881024);
                            aomyVar5 = aomyVar3;
                            view4 = view2;
                            defpackage.krk krkVar4 = krkVar3;
                            B(krxVar, den.ba(cmwVar5, 0.0f, 0.0f, 0.0f, 8.0f), aomyVar5, aomyVar2, aonnVar, krkVar4, view4, cavVarB, i24);
                            krkVar3 = krkVar4;
                            cavVar2 = cavVarB;
                            cbtVar.W(false);
                        }
                        krkVar2 = krkVar3;
                        view3 = view4;
                        cmwVar3 = cmwVar5;
                        aomyVar4 = aomyVar5;
                    } else {
                        cavVar2 = cavVarB;
                        cavVar2.s();
                        krkVar2 = krkVar;
                        cmwVar3 = cmwVar2;
                        aomyVar4 = aomyVar3;
                        view3 = view2;
                    }
                    cdkVarI = cavVar2.I();
                    if (cdkVarI != null) {
                        cdkVarI.c = new aonn() { // from class: krr
                            /* JADX INFO: Thrown type has an unknown type hierarchy: aois */
                            public final java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) throws aois {
                                cav cavVar3 = (cav) obj;
                                ((java.lang.Integer) obj2).intValue();
                                defpackage.krx krxVar2 = krxVar;
                                int i25 = i;
                                cmw cmwVar6 = cmwVar3;
                                aomy aomyVar6 = aomyVar4;
                                int i26 = i2 | 1;
                                int i27 = 306783378 & i26;
                                int i28 = 613566756 & i26;
                                defpackage.hgz.I(krxVar2, i25, cmwVar6, aomyVar6, aomyVar2, aonnVar, krkVar2, view3, cavVar3, (i26 & (-920350135)) | i27 | (i28 >> 1) | ((i27 << 1) & i28), i3);
                                return aojh.a;
                            }
                        };
                    }
                }
                i4 |= 805306368;
                view2 = view;
                if ((306783379 & i4) != 306783378) {
                    z = true;
                } else {
                    z = false;
                }
                if (cavVarB.H(z, i4 & 1)) {
                    i11 = i3 & 128;
                    i12 = i - 1;
                    cbtVar = (cbt) cavVarB;
                    cbtVar.Z(-127, (java.lang.Object) null, 0, (java.lang.Object) null);
                    if ((i2 & 1) != 0) {
                        if (i19 != 0) {
                            cmwVar2 = cmw.c;
                        }
                        if (i6 != 0) {
                            aomyVar3 = null;
                        }
                        if (i11 != 0) {
                            i4 &= -29360129;
                            krsVar = new defpackage.krs();
                        } else {
                            krsVar = krkVar;
                        }
                        krkVar3 = krsVar;
                        if (i9 != 0) {
                            view2 = null;
                        }
                    } else {
                        if (i19 != 0) {
                            cmwVar2 = cmw.c;
                        }
                        if (i6 != 0) {
                            aomyVar3 = null;
                        }
                        if (i11 != 0) {
                            i4 &= -29360129;
                            krsVar = new defpackage.krs();
                        } else {
                            krsVar = krkVar;
                        }
                        krkVar3 = krsVar;
                        if (i9 != 0) {
                            view2 = null;
                        }
                    }
                    cmwVar4 = cmwVar2;
                    cavVarB.l();
                    defpackage.hhb.A((android.content.Context) cavVarB.e(dep.b));
                    i13 = i4 >> 3;
                    i14 = i4 & 14;
                    if (i12 != 0) {
                        cavVarB.u(-571389184);
                        int i25 = i4 >> 6;
                        cavVar2 = cavVarB;
                        D(krxVar, cmwVar4, aomyVar2, aonnVar, krkVar3, cavVar2, i14 | (i13 & 112) | (i13 & 896) | (i25 & 7168) | (57344 & i25) | (i25 & 458752));
                        cmwVar5 = cmwVar4;
                        cbtVar.W(false);
                        aomyVar5 = aomyVar3;
                        view4 = view2;
                    } else {
                        cmwVar5 = cmwVar4;
                        cavVarB.u(-533723138);
                        int i26 = 458752 & i13;
                        int i27 = 3670016 & i13;
                        int i28 = 29360128 & i13;
                        int i29 = i14 | (i13 & 896) | (i13 & 7168) | (57344 & i13) | i26 | i27 | i28 | (i13 & 234881024);
                        aomyVar5 = aomyVar3;
                        view4 = view2;
                        defpackage.krk krkVar5 = krkVar3;
                        B(krxVar, den.ba(cmwVar5, 0.0f, 0.0f, 0.0f, 8.0f), aomyVar5, aomyVar2, aonnVar, krkVar5, view4, cavVarB, i29);
                        krkVar3 = krkVar5;
                        cavVar2 = cavVarB;
                        cbtVar.W(false);
                    }
                    krkVar2 = krkVar3;
                    view3 = view4;
                    cmwVar3 = cmwVar5;
                    aomyVar4 = aomyVar5;
                } else {
                    cavVar2 = cavVarB;
                    cavVar2.s();
                    krkVar2 = krkVar;
                    cmwVar3 = cmwVar2;
                    aomyVar4 = aomyVar3;
                    view3 = view2;
                }
                cdkVarI = cavVar2.I();
                if (cdkVarI != null) {
                    cdkVarI.c = new aonn() { // from class: krr
                        /* JADX INFO: Thrown type has an unknown type hierarchy: aois */
                        public final java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) throws aois {
                            cav cavVar3 = (cav) obj;
                            ((java.lang.Integer) obj2).intValue();
                            defpackage.krx krxVar2 = krxVar;
                            int i210 = i;
                            cmw cmwVar6 = cmwVar3;
                            aomy aomyVar6 = aomyVar4;
                            int i211 = i2 | 1;
                            int i212 = 306783378 & i211;
                            int i213 = 613566756 & i211;
                            defpackage.hgz.I(krxVar2, i210, cmwVar6, aomyVar6, aomyVar2, aonnVar, krkVar2, view3, cavVar3, (i211 & (-920350135)) | i212 | (i213 >> 1) | ((i212 << 1) & i213), i3);
                            return aojh.a;
                        }
                    };
                }
            }
            i4 |= 24576;
            aomyVar3 = aomyVar;
            if ((196608 & i2) == 0) {
                if (true != cavVarB.D(aomyVar2)) {
                    i17 = 65536;
                } else {
                    i17 = 131072;
                }
                i4 |= i17;
            }
            if ((1572864 & i2) == 0) {
                if (true != cavVarB.D(aonnVar)) {
                    i16 = 524288;
                } else {
                    i16 = 1048576;
                }
                i4 |= i16;
            }
            if ((12582912 & i2) == 0) {
                i15 = 4194304;
                if ((i3 & 128) == 0) {
                    if ((16777216 & i2) == 0) {
                        zD = cavVarB.B(krkVar);
                    } else {
                        zD = cavVarB.D(krkVar);
                    }
                    if (zD) {
                        i15 = 8388608;
                    }
                }
                i4 |= i15;
            }
            if ((i3 & 256) != 0) {
                i4 |= 100663296;
            } else if ((i2 & 100663296) == 0) {
                if (true != cavVarB.D((java.lang.Object) null)) {
                    i8 = 33554432;
                } else {
                    i8 = 67108864;
                }
                i4 |= i8;
            }
            i9 = i3 & 512;
            if (i9 != 0) {
                if ((805306368 & i2) == 0) {
                    view2 = view;
                    if (true != cavVarB.D(view2)) {
                        i10 = 268435456;
                    } else {
                        i10 = 536870912;
                    }
                    i4 |= i10;
                }
                if ((306783379 & i4) != 306783378) {
                    z = true;
                } else {
                    z = false;
                }
                if (cavVarB.H(z, i4 & 1)) {
                    i11 = i3 & 128;
                    i12 = i - 1;
                    cbtVar = (cbt) cavVarB;
                    cbtVar.Z(-127, (java.lang.Object) null, 0, (java.lang.Object) null);
                    if ((i2 & 1) != 0) {
                        if (i19 != 0) {
                            cmwVar2 = cmw.c;
                        }
                        if (i6 != 0) {
                            aomyVar3 = null;
                        }
                        if (i11 != 0) {
                            i4 &= -29360129;
                            krsVar = new defpackage.krs();
                        } else {
                            krsVar = krkVar;
                        }
                        krkVar3 = krsVar;
                        if (i9 != 0) {
                            view2 = null;
                        }
                    } else {
                        if (i19 != 0) {
                            cmwVar2 = cmw.c;
                        }
                        if (i6 != 0) {
                            aomyVar3 = null;
                        }
                        if (i11 != 0) {
                            i4 &= -29360129;
                            krsVar = new defpackage.krs();
                        } else {
                            krsVar = krkVar;
                        }
                        krkVar3 = krsVar;
                        if (i9 != 0) {
                            view2 = null;
                        }
                    }
                    cmwVar4 = cmwVar2;
                    cavVarB.l();
                    defpackage.hhb.A((android.content.Context) cavVarB.e(dep.b));
                    i13 = i4 >> 3;
                    i14 = i4 & 14;
                    if (i12 != 0) {
                        cavVarB.u(-571389184);
                        int i210 = i4 >> 6;
                        cavVar2 = cavVarB;
                        D(krxVar, cmwVar4, aomyVar2, aonnVar, krkVar3, cavVar2, i14 | (i13 & 112) | (i13 & 896) | (i210 & 7168) | (57344 & i210) | (i210 & 458752));
                        cmwVar5 = cmwVar4;
                        cbtVar.W(false);
                        aomyVar5 = aomyVar3;
                        view4 = view2;
                    } else {
                        cmwVar5 = cmwVar4;
                        cavVarB.u(-533723138);
                        int i211 = 458752 & i13;
                        int i212 = 3670016 & i13;
                        int i213 = 29360128 & i13;
                        int i214 = i14 | (i13 & 896) | (i13 & 7168) | (57344 & i13) | i211 | i212 | i213 | (i13 & 234881024);
                        aomyVar5 = aomyVar3;
                        view4 = view2;
                        defpackage.krk krkVar6 = krkVar3;
                        B(krxVar, den.ba(cmwVar5, 0.0f, 0.0f, 0.0f, 8.0f), aomyVar5, aomyVar2, aonnVar, krkVar6, view4, cavVarB, i214);
                        krkVar3 = krkVar6;
                        cavVar2 = cavVarB;
                        cbtVar.W(false);
                    }
                    krkVar2 = krkVar3;
                    view3 = view4;
                    cmwVar3 = cmwVar5;
                    aomyVar4 = aomyVar5;
                } else {
                    cavVar2 = cavVarB;
                    cavVar2.s();
                    krkVar2 = krkVar;
                    cmwVar3 = cmwVar2;
                    aomyVar4 = aomyVar3;
                    view3 = view2;
                }
                cdkVarI = cavVar2.I();
                if (cdkVarI != null) {
                    cdkVarI.c = new aonn() { // from class: krr
                        /* JADX INFO: Thrown type has an unknown type hierarchy: aois */
                        public final java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) throws aois {
                            cav cavVar3 = (cav) obj;
                            ((java.lang.Integer) obj2).intValue();
                            defpackage.krx krxVar2 = krxVar;
                            int i215 = i;
                            cmw cmwVar6 = cmwVar3;
                            aomy aomyVar6 = aomyVar4;
                            int i216 = i2 | 1;
                            int i217 = 306783378 & i216;
                            int i218 = 613566756 & i216;
                            defpackage.hgz.I(krxVar2, i215, cmwVar6, aomyVar6, aomyVar2, aonnVar, krkVar2, view3, cavVar3, (i216 & (-920350135)) | i217 | (i218 >> 1) | ((i217 << 1) & i218), i3);
                            return aojh.a;
                        }
                    };
                }
            }
            i4 |= 805306368;
            view2 = view;
            if ((306783379 & i4) != 306783378) {
                z = true;
            } else {
                z = false;
            }
            if (cavVarB.H(z, i4 & 1)) {
                i11 = i3 & 128;
                i12 = i - 1;
                cbtVar = (cbt) cavVarB;
                cbtVar.Z(-127, (java.lang.Object) null, 0, (java.lang.Object) null);
                if ((i2 & 1) != 0) {
                    if (i19 != 0) {
                        cmwVar2 = cmw.c;
                    }
                    if (i6 != 0) {
                        aomyVar3 = null;
                    }
                    if (i11 != 0) {
                        i4 &= -29360129;
                        krsVar = new defpackage.krs();
                    } else {
                        krsVar = krkVar;
                    }
                    krkVar3 = krsVar;
                    if (i9 != 0) {
                        view2 = null;
                    }
                } else {
                    if (i19 != 0) {
                        cmwVar2 = cmw.c;
                    }
                    if (i6 != 0) {
                        aomyVar3 = null;
                    }
                    if (i11 != 0) {
                        i4 &= -29360129;
                        krsVar = new defpackage.krs();
                    } else {
                        krsVar = krkVar;
                    }
                    krkVar3 = krsVar;
                    if (i9 != 0) {
                        view2 = null;
                    }
                }
                cmwVar4 = cmwVar2;
                cavVarB.l();
                defpackage.hhb.A((android.content.Context) cavVarB.e(dep.b));
                i13 = i4 >> 3;
                i14 = i4 & 14;
                if (i12 != 0) {
                    cavVarB.u(-571389184);
                    int i215 = i4 >> 6;
                    cavVar2 = cavVarB;
                    D(krxVar, cmwVar4, aomyVar2, aonnVar, krkVar3, cavVar2, i14 | (i13 & 112) | (i13 & 896) | (i215 & 7168) | (57344 & i215) | (i215 & 458752));
                    cmwVar5 = cmwVar4;
                    cbtVar.W(false);
                    aomyVar5 = aomyVar3;
                    view4 = view2;
                } else {
                    cmwVar5 = cmwVar4;
                    cavVarB.u(-533723138);
                    int i216 = 458752 & i13;
                    int i217 = 3670016 & i13;
                    int i218 = 29360128 & i13;
                    int i219 = i14 | (i13 & 896) | (i13 & 7168) | (57344 & i13) | i216 | i217 | i218 | (i13 & 234881024);
                    aomyVar5 = aomyVar3;
                    view4 = view2;
                    defpackage.krk krkVar7 = krkVar3;
                    B(krxVar, den.ba(cmwVar5, 0.0f, 0.0f, 0.0f, 8.0f), aomyVar5, aomyVar2, aonnVar, krkVar7, view4, cavVarB, i219);
                    krkVar3 = krkVar7;
                    cavVar2 = cavVarB;
                    cbtVar.W(false);
                }
                krkVar2 = krkVar3;
                view3 = view4;
                cmwVar3 = cmwVar5;
                aomyVar4 = aomyVar5;
            } else {
                cavVar2 = cavVarB;
                cavVar2.s();
                krkVar2 = krkVar;
                cmwVar3 = cmwVar2;
                aomyVar4 = aomyVar3;
                view3 = view2;
            }
            cdkVarI = cavVar2.I();
            if (cdkVarI != null) {
                cdkVarI.c = new aonn() { // from class: krr
                    /* JADX INFO: Thrown type has an unknown type hierarchy: aois */
                    public final java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) throws aois {
                        cav cavVar3 = (cav) obj;
                        ((java.lang.Integer) obj2).intValue();
                        defpackage.krx krxVar2 = krxVar;
                        int i2110 = i;
                        cmw cmwVar6 = cmwVar3;
                        aomy aomyVar6 = aomyVar4;
                        int i2111 = i2 | 1;
                        int i2112 = 306783378 & i2111;
                        int i2113 = 613566756 & i2111;
                        defpackage.hgz.I(krxVar2, i2110, cmwVar6, aomyVar6, aomyVar2, aonnVar, krkVar2, view3, cavVar3, (i2111 & (-920350135)) | i2112 | (i2113 >> 1) | ((i2112 << 1) & i2113), i3);
                        return aojh.a;
                    }
                };
            }
        }
        i4 |= 384;
        cmwVar2 = cmwVar;
        if ((i3 & 8) != 0) {
            i4 |= 3072;
        } else if ((i2 & 3072) == 0) {
            if (true != cavVarB.D((java.lang.Object) null)) {
                i5 = 1024;
            } else {
                i5 = 2048;
            }
            i4 |= i5;
        }
        i6 = i3 & 16;
        if (i6 != 0) {
            if ((i2 & 24576) == 0) {
                aomyVar3 = aomyVar;
                if (true != cavVarB.D(aomyVar3)) {
                    i7 = 8192;
                } else {
                    i7 = 16384;
                }
                i4 |= i7;
            }
            if ((196608 & i2) == 0) {
                if (true != cavVarB.D(aomyVar2)) {
                    i17 = 65536;
                } else {
                    i17 = 131072;
                }
                i4 |= i17;
            }
            if ((1572864 & i2) == 0) {
                if (true != cavVarB.D(aonnVar)) {
                    i16 = 524288;
                } else {
                    i16 = 1048576;
                }
                i4 |= i16;
            }
            if ((12582912 & i2) == 0) {
                i15 = 4194304;
                if ((i3 & 128) == 0) {
                    if ((16777216 & i2) == 0) {
                        zD = cavVarB.B(krkVar);
                    } else {
                        zD = cavVarB.D(krkVar);
                    }
                    if (zD) {
                        i15 = 8388608;
                    }
                }
                i4 |= i15;
            }
            if ((i3 & 256) != 0) {
                i4 |= 100663296;
            } else if ((i2 & 100663296) == 0) {
                if (true != cavVarB.D((java.lang.Object) null)) {
                    i8 = 33554432;
                } else {
                    i8 = 67108864;
                }
                i4 |= i8;
            }
            i9 = i3 & 512;
            if (i9 != 0) {
                if ((805306368 & i2) == 0) {
                    view2 = view;
                    if (true != cavVarB.D(view2)) {
                        i10 = 268435456;
                    } else {
                        i10 = 536870912;
                    }
                    i4 |= i10;
                }
                if ((306783379 & i4) != 306783378) {
                    z = true;
                } else {
                    z = false;
                }
                if (cavVarB.H(z, i4 & 1)) {
                    i11 = i3 & 128;
                    i12 = i - 1;
                    cbtVar = (cbt) cavVarB;
                    cbtVar.Z(-127, (java.lang.Object) null, 0, (java.lang.Object) null);
                    if ((i2 & 1) != 0) {
                        if (i19 != 0) {
                            cmwVar2 = cmw.c;
                        }
                        if (i6 != 0) {
                            aomyVar3 = null;
                        }
                        if (i11 != 0) {
                            i4 &= -29360129;
                            krsVar = new defpackage.krs();
                        } else {
                            krsVar = krkVar;
                        }
                        krkVar3 = krsVar;
                        if (i9 != 0) {
                            view2 = null;
                        }
                    } else {
                        if (i19 != 0) {
                            cmwVar2 = cmw.c;
                        }
                        if (i6 != 0) {
                            aomyVar3 = null;
                        }
                        if (i11 != 0) {
                            i4 &= -29360129;
                            krsVar = new defpackage.krs();
                        } else {
                            krsVar = krkVar;
                        }
                        krkVar3 = krsVar;
                        if (i9 != 0) {
                            view2 = null;
                        }
                    }
                    cmwVar4 = cmwVar2;
                    cavVarB.l();
                    defpackage.hhb.A((android.content.Context) cavVarB.e(dep.b));
                    i13 = i4 >> 3;
                    i14 = i4 & 14;
                    if (i12 != 0) {
                        cavVarB.u(-571389184);
                        int i2110 = i4 >> 6;
                        cavVar2 = cavVarB;
                        D(krxVar, cmwVar4, aomyVar2, aonnVar, krkVar3, cavVar2, i14 | (i13 & 112) | (i13 & 896) | (i2110 & 7168) | (57344 & i2110) | (i2110 & 458752));
                        cmwVar5 = cmwVar4;
                        cbtVar.W(false);
                        aomyVar5 = aomyVar3;
                        view4 = view2;
                    } else {
                        cmwVar5 = cmwVar4;
                        cavVarB.u(-533723138);
                        int i2111 = 458752 & i13;
                        int i2112 = 3670016 & i13;
                        int i2113 = 29360128 & i13;
                        int i2114 = i14 | (i13 & 896) | (i13 & 7168) | (57344 & i13) | i2111 | i2112 | i2113 | (i13 & 234881024);
                        aomyVar5 = aomyVar3;
                        view4 = view2;
                        defpackage.krk krkVar8 = krkVar3;
                        B(krxVar, den.ba(cmwVar5, 0.0f, 0.0f, 0.0f, 8.0f), aomyVar5, aomyVar2, aonnVar, krkVar8, view4, cavVarB, i2114);
                        krkVar3 = krkVar8;
                        cavVar2 = cavVarB;
                        cbtVar.W(false);
                    }
                    krkVar2 = krkVar3;
                    view3 = view4;
                    cmwVar3 = cmwVar5;
                    aomyVar4 = aomyVar5;
                } else {
                    cavVar2 = cavVarB;
                    cavVar2.s();
                    krkVar2 = krkVar;
                    cmwVar3 = cmwVar2;
                    aomyVar4 = aomyVar3;
                    view3 = view2;
                }
                cdkVarI = cavVar2.I();
                if (cdkVarI != null) {
                    cdkVarI.c = new aonn() { // from class: krr
                        /* JADX INFO: Thrown type has an unknown type hierarchy: aois */
                        public final java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) throws aois {
                            cav cavVar3 = (cav) obj;
                            ((java.lang.Integer) obj2).intValue();
                            defpackage.krx krxVar2 = krxVar;
                            int i2115 = i;
                            cmw cmwVar6 = cmwVar3;
                            aomy aomyVar6 = aomyVar4;
                            int i2116 = i2 | 1;
                            int i2117 = 306783378 & i2116;
                            int i2118 = 613566756 & i2116;
                            defpackage.hgz.I(krxVar2, i2115, cmwVar6, aomyVar6, aomyVar2, aonnVar, krkVar2, view3, cavVar3, (i2116 & (-920350135)) | i2117 | (i2118 >> 1) | ((i2117 << 1) & i2118), i3);
                            return aojh.a;
                        }
                    };
                }
            }
            i4 |= 805306368;
            view2 = view;
            if ((306783379 & i4) != 306783378) {
                z = true;
            } else {
                z = false;
            }
            if (cavVarB.H(z, i4 & 1)) {
                i11 = i3 & 128;
                i12 = i - 1;
                cbtVar = (cbt) cavVarB;
                cbtVar.Z(-127, (java.lang.Object) null, 0, (java.lang.Object) null);
                if ((i2 & 1) != 0) {
                    if (i19 != 0) {
                        cmwVar2 = cmw.c;
                    }
                    if (i6 != 0) {
                        aomyVar3 = null;
                    }
                    if (i11 != 0) {
                        i4 &= -29360129;
                        krsVar = new defpackage.krs();
                    } else {
                        krsVar = krkVar;
                    }
                    krkVar3 = krsVar;
                    if (i9 != 0) {
                        view2 = null;
                    }
                } else {
                    if (i19 != 0) {
                        cmwVar2 = cmw.c;
                    }
                    if (i6 != 0) {
                        aomyVar3 = null;
                    }
                    if (i11 != 0) {
                        i4 &= -29360129;
                        krsVar = new defpackage.krs();
                    } else {
                        krsVar = krkVar;
                    }
                    krkVar3 = krsVar;
                    if (i9 != 0) {
                        view2 = null;
                    }
                }
                cmwVar4 = cmwVar2;
                cavVarB.l();
                defpackage.hhb.A((android.content.Context) cavVarB.e(dep.b));
                i13 = i4 >> 3;
                i14 = i4 & 14;
                if (i12 != 0) {
                    cavVarB.u(-571389184);
                    int i2115 = i4 >> 6;
                    cavVar2 = cavVarB;
                    D(krxVar, cmwVar4, aomyVar2, aonnVar, krkVar3, cavVar2, i14 | (i13 & 112) | (i13 & 896) | (i2115 & 7168) | (57344 & i2115) | (i2115 & 458752));
                    cmwVar5 = cmwVar4;
                    cbtVar.W(false);
                    aomyVar5 = aomyVar3;
                    view4 = view2;
                } else {
                    cmwVar5 = cmwVar4;
                    cavVarB.u(-533723138);
                    int i2116 = 458752 & i13;
                    int i2117 = 3670016 & i13;
                    int i2118 = 29360128 & i13;
                    int i2119 = i14 | (i13 & 896) | (i13 & 7168) | (57344 & i13) | i2116 | i2117 | i2118 | (i13 & 234881024);
                    aomyVar5 = aomyVar3;
                    view4 = view2;
                    defpackage.krk krkVar9 = krkVar3;
                    B(krxVar, den.ba(cmwVar5, 0.0f, 0.0f, 0.0f, 8.0f), aomyVar5, aomyVar2, aonnVar, krkVar9, view4, cavVarB, i2119);
                    krkVar3 = krkVar9;
                    cavVar2 = cavVarB;
                    cbtVar.W(false);
                }
                krkVar2 = krkVar3;
                view3 = view4;
                cmwVar3 = cmwVar5;
                aomyVar4 = aomyVar5;
            } else {
                cavVar2 = cavVarB;
                cavVar2.s();
                krkVar2 = krkVar;
                cmwVar3 = cmwVar2;
                aomyVar4 = aomyVar3;
                view3 = view2;
            }
            cdkVarI = cavVar2.I();
            if (cdkVarI != null) {
                cdkVarI.c = new aonn() { // from class: krr
                    /* JADX INFO: Thrown type has an unknown type hierarchy: aois */
                    public final java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) throws aois {
                        cav cavVar3 = (cav) obj;
                        ((java.lang.Integer) obj2).intValue();
                        defpackage.krx krxVar2 = krxVar;
                        int i21110 = i;
                        cmw cmwVar6 = cmwVar3;
                        aomy aomyVar6 = aomyVar4;
                        int i21111 = i2 | 1;
                        int i21112 = 306783378 & i21111;
                        int i21113 = 613566756 & i21111;
                        defpackage.hgz.I(krxVar2, i21110, cmwVar6, aomyVar6, aomyVar2, aonnVar, krkVar2, view3, cavVar3, (i21111 & (-920350135)) | i21112 | (i21113 >> 1) | ((i21112 << 1) & i21113), i3);
                        return aojh.a;
                    }
                };
            }
        }
        i4 |= 24576;
        aomyVar3 = aomyVar;
        if ((196608 & i2) == 0) {
            if (true != cavVarB.D(aomyVar2)) {
                i17 = 65536;
            } else {
                i17 = 131072;
            }
            i4 |= i17;
        }
        if ((1572864 & i2) == 0) {
            if (true != cavVarB.D(aonnVar)) {
                i16 = 524288;
            } else {
                i16 = 1048576;
            }
            i4 |= i16;
        }
        if ((12582912 & i2) == 0) {
            i15 = 4194304;
            if ((i3 & 128) == 0) {
                if ((16777216 & i2) == 0) {
                    zD = cavVarB.B(krkVar);
                } else {
                    zD = cavVarB.D(krkVar);
                }
                if (zD) {
                    i15 = 8388608;
                }
            }
            i4 |= i15;
        }
        if ((i3 & 256) != 0) {
            i4 |= 100663296;
        } else if ((i2 & 100663296) == 0) {
            if (true != cavVarB.D((java.lang.Object) null)) {
                i8 = 33554432;
            } else {
                i8 = 67108864;
            }
            i4 |= i8;
        }
        i9 = i3 & 512;
        if (i9 != 0) {
            if ((805306368 & i2) == 0) {
                view2 = view;
                if (true != cavVarB.D(view2)) {
                    i10 = 268435456;
                } else {
                    i10 = 536870912;
                }
                i4 |= i10;
            }
            if ((306783379 & i4) != 306783378) {
                z = true;
            } else {
                z = false;
            }
            if (cavVarB.H(z, i4 & 1)) {
                i11 = i3 & 128;
                i12 = i - 1;
                cbtVar = (cbt) cavVarB;
                cbtVar.Z(-127, (java.lang.Object) null, 0, (java.lang.Object) null);
                if ((i2 & 1) != 0) {
                    if (i19 != 0) {
                        cmwVar2 = cmw.c;
                    }
                    if (i6 != 0) {
                        aomyVar3 = null;
                    }
                    if (i11 != 0) {
                        i4 &= -29360129;
                        krsVar = new defpackage.krs();
                    } else {
                        krsVar = krkVar;
                    }
                    krkVar3 = krsVar;
                    if (i9 != 0) {
                        view2 = null;
                    }
                } else {
                    if (i19 != 0) {
                        cmwVar2 = cmw.c;
                    }
                    if (i6 != 0) {
                        aomyVar3 = null;
                    }
                    if (i11 != 0) {
                        i4 &= -29360129;
                        krsVar = new defpackage.krs();
                    } else {
                        krsVar = krkVar;
                    }
                    krkVar3 = krsVar;
                    if (i9 != 0) {
                        view2 = null;
                    }
                }
                cmwVar4 = cmwVar2;
                cavVarB.l();
                defpackage.hhb.A((android.content.Context) cavVarB.e(dep.b));
                i13 = i4 >> 3;
                i14 = i4 & 14;
                if (i12 != 0) {
                    cavVarB.u(-571389184);
                    int i21110 = i4 >> 6;
                    cavVar2 = cavVarB;
                    D(krxVar, cmwVar4, aomyVar2, aonnVar, krkVar3, cavVar2, i14 | (i13 & 112) | (i13 & 896) | (i21110 & 7168) | (57344 & i21110) | (i21110 & 458752));
                    cmwVar5 = cmwVar4;
                    cbtVar.W(false);
                    aomyVar5 = aomyVar3;
                    view4 = view2;
                } else {
                    cmwVar5 = cmwVar4;
                    cavVarB.u(-533723138);
                    int i21111 = 458752 & i13;
                    int i21112 = 3670016 & i13;
                    int i21113 = 29360128 & i13;
                    int i21114 = i14 | (i13 & 896) | (i13 & 7168) | (57344 & i13) | i21111 | i21112 | i21113 | (i13 & 234881024);
                    aomyVar5 = aomyVar3;
                    view4 = view2;
                    defpackage.krk krkVar10 = krkVar3;
                    B(krxVar, den.ba(cmwVar5, 0.0f, 0.0f, 0.0f, 8.0f), aomyVar5, aomyVar2, aonnVar, krkVar10, view4, cavVarB, i21114);
                    krkVar3 = krkVar10;
                    cavVar2 = cavVarB;
                    cbtVar.W(false);
                }
                krkVar2 = krkVar3;
                view3 = view4;
                cmwVar3 = cmwVar5;
                aomyVar4 = aomyVar5;
            } else {
                cavVar2 = cavVarB;
                cavVar2.s();
                krkVar2 = krkVar;
                cmwVar3 = cmwVar2;
                aomyVar4 = aomyVar3;
                view3 = view2;
            }
            cdkVarI = cavVar2.I();
            if (cdkVarI != null) {
                cdkVarI.c = new aonn() { // from class: krr
                    /* JADX INFO: Thrown type has an unknown type hierarchy: aois */
                    public final java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) throws aois {
                        cav cavVar3 = (cav) obj;
                        ((java.lang.Integer) obj2).intValue();
                        defpackage.krx krxVar2 = krxVar;
                        int i21115 = i;
                        cmw cmwVar6 = cmwVar3;
                        aomy aomyVar6 = aomyVar4;
                        int i21116 = i2 | 1;
                        int i21117 = 306783378 & i21116;
                        int i21118 = 613566756 & i21116;
                        defpackage.hgz.I(krxVar2, i21115, cmwVar6, aomyVar6, aomyVar2, aonnVar, krkVar2, view3, cavVar3, (i21116 & (-920350135)) | i21117 | (i21118 >> 1) | ((i21117 << 1) & i21118), i3);
                        return aojh.a;
                    }
                };
            }
        }
        i4 |= 805306368;
        view2 = view;
        if ((306783379 & i4) != 306783378) {
            z = true;
        } else {
            z = false;
        }
        if (cavVarB.H(z, i4 & 1)) {
            i11 = i3 & 128;
            i12 = i - 1;
            cbtVar = (cbt) cavVarB;
            cbtVar.Z(-127, (java.lang.Object) null, 0, (java.lang.Object) null);
            if ((i2 & 1) != 0) {
                if (i19 != 0) {
                    cmwVar2 = cmw.c;
                }
                if (i6 != 0) {
                    aomyVar3 = null;
                }
                if (i11 != 0) {
                    i4 &= -29360129;
                    krsVar = new defpackage.krs();
                } else {
                    krsVar = krkVar;
                }
                krkVar3 = krsVar;
                if (i9 != 0) {
                    view2 = null;
                }
            } else {
                if (i19 != 0) {
                    cmwVar2 = cmw.c;
                }
                if (i6 != 0) {
                    aomyVar3 = null;
                }
                if (i11 != 0) {
                    i4 &= -29360129;
                    krsVar = new defpackage.krs();
                } else {
                    krsVar = krkVar;
                }
                krkVar3 = krsVar;
                if (i9 != 0) {
                    view2 = null;
                }
            }
            cmwVar4 = cmwVar2;
            cavVarB.l();
            defpackage.hhb.A((android.content.Context) cavVarB.e(dep.b));
            i13 = i4 >> 3;
            i14 = i4 & 14;
            if (i12 != 0) {
                cavVarB.u(-571389184);
                int i21115 = i4 >> 6;
                cavVar2 = cavVarB;
                D(krxVar, cmwVar4, aomyVar2, aonnVar, krkVar3, cavVar2, i14 | (i13 & 112) | (i13 & 896) | (i21115 & 7168) | (57344 & i21115) | (i21115 & 458752));
                cmwVar5 = cmwVar4;
                cbtVar.W(false);
                aomyVar5 = aomyVar3;
                view4 = view2;
            } else {
                cmwVar5 = cmwVar4;
                cavVarB.u(-533723138);
                int i21116 = 458752 & i13;
                int i21117 = 3670016 & i13;
                int i21118 = 29360128 & i13;
                int i21119 = i14 | (i13 & 896) | (i13 & 7168) | (57344 & i13) | i21116 | i21117 | i21118 | (i13 & 234881024);
                aomyVar5 = aomyVar3;
                view4 = view2;
                defpackage.krk krkVar11 = krkVar3;
                B(krxVar, den.ba(cmwVar5, 0.0f, 0.0f, 0.0f, 8.0f), aomyVar5, aomyVar2, aonnVar, krkVar11, view4, cavVarB, i21119);
                krkVar3 = krkVar11;
                cavVar2 = cavVarB;
                cbtVar.W(false);
            }
            krkVar2 = krkVar3;
            view3 = view4;
            cmwVar3 = cmwVar5;
            aomyVar4 = aomyVar5;
        } else {
            cavVar2 = cavVarB;
            cavVar2.s();
            krkVar2 = krkVar;
            cmwVar3 = cmwVar2;
            aomyVar4 = aomyVar3;
            view3 = view2;
        }
        cdkVarI = cavVar2.I();
        if (cdkVarI != null) {
            cdkVarI.c = new aonn() { // from class: krr
                /* JADX INFO: Thrown type has an unknown type hierarchy: aois */
                public final java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) throws aois {
                    cav cavVar3 = (cav) obj;
                    ((java.lang.Integer) obj2).intValue();
                    defpackage.krx krxVar2 = krxVar;
                    int i211110 = i;
                    cmw cmwVar6 = cmwVar3;
                    aomy aomyVar6 = aomyVar4;
                    int i211111 = i2 | 1;
                    int i211112 = 306783378 & i211111;
                    int i211113 = 613566756 & i211111;
                    defpackage.hgz.I(krxVar2, i211110, cmwVar6, aomyVar6, aomyVar2, aonnVar, krkVar2, view3, cavVar3, (i211111 & (-920350135)) | i211112 | (i211113 >> 1) | ((i211112 << 1) & i211113), i3);
                    return aojh.a;
                }
            };
        }
    }

    public static /* synthetic */ java.lang.String J(int i) {
        if (i == 1) {
            return "CREATE_CALENDAR_EVENT";
        }
        if (i != 2) {
            return i != 3 ? "CALL_PERSON" : "CREATE_CONTACT";
        }
        return "CREATE_REMINDER";
    }

    public static final alcf K(defpackage.kqo kqoVar, j$.time.ZonedDateTime zonedDateTime) {
        aooh.f(zonedDateTime, "callDateTime");
        int i = defpackage.kqs.a;
        return defpackage.kqs.a(kqoVar, zonedDateTime, defpackage.kqp.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final defpackage.kqo L(akef akefVar, java.lang.String str) {
        java.lang.Object objAe;
        java.lang.String strM = M(akefVar, "date_string");
        java.lang.String strM2 = M(akefVar, str.concat("day_name"));
        java.lang.Object obj = null;
        if (strM2 != null) {
            aimz aimzVar = defpackage.kqo.a;
            try {
                java.util.Locale locale = java.util.Locale.ROOT;
                aooh.e(locale, "ROOT");
                java.lang.String upperCase = strM2.toUpperCase(locale);
                aooh.e(upperCase, "toUpperCase(...)");
                objAe = j$.time.DayOfWeek.valueOf(upperCase);
            } catch (java.lang.Throwable th) {
                objAe = aooc.ae(th);
            }
            java.lang.Throwable thC = aoiw.c(objAe);
            if (thC != null) {
                defpackage.kqo.a.b().k(thC).l("com/android/dialer/callnotesinfra/summarizer/callaction/PartialTime$Companion", "fromJson$<anonymous>$<anonymous>", 61, "PartialTime.kt").y("Failed to parse day of week for: %s", strM2);
            }
            obj = (j$.time.DayOfWeek) (true != (objAe instanceof aoiv) ? objAe : null);
        }
        return new defpackage.kqo(strM, obj, ae(akefVar, str.concat("day"), defpackage.kqo.b), ae(akefVar, str.concat("month"), defpackage.kqo.c), ae(akefVar, str.concat("year"), defpackage.kqo.d), ae(akefVar, str.concat("hour"), defpackage.kqo.e), ae(akefVar, str.concat("minutes"), defpackage.kqo.f));
    }

    public static final java.lang.String M(akef akefVar, java.lang.String str) {
        aooh.f(akefVar, "<this>");
        akec akecVarB = akefVar.b(str);
        if (akecVarB == null || (akecVarB instanceof akee) || !(akecVarB instanceof akeh)) {
            return null;
        }
        return akecVarB.a();
    }

    public static final j$.time.ZonedDateTime N(defpackage.kpd kpdVar) {
        aooh.f(kpdVar, "<this>");
        j$.time.ZonedDateTime zonedDateTimeOfInstant = j$.time.ZonedDateTime.ofInstant(j$.time.Instant.ofEpochMilli(kpdVar.a), j$.util.TimeZoneRetargetClass.toZoneId(kpdVar.b));
        aooh.e(zonedDateTimeOfInstant, "ofInstant(...)");
        return zonedDateTimeOfInstant;
    }

    public static final alro O(alqv alqvVar) {
        aooh.f(alqvVar, "<this>");
        ajyi ajyiVarI = ahus.I(alro.a.m());
        apdi apdiVar = alqv.f;
        aooh.e(apdiVar, "asrResultEvent");
        ajyiVarI.be(apdiVar, alqvVar);
        return ajyiVarI.ba();
    }

    public static final int P(int i) {
        int i2 = i - 2;
        if (i2 == 1) {
            return 4;
        }
        if (i2 != 2) {
            return i2 == 3 ? 2 : 1;
        }
        return 3;
    }

    public static final int Q(int i) {
        int i2 = i - 1;
        if (i2 == 0 || i2 == 1 || i2 == 2) {
            return 2;
        }
        return i2 != 3 ? 4 : 3;
    }

    public static final long R(amle amleVar) {
        aooh.f(amleVar, "<this>");
        amld amldVar = amleVar.c;
        if (amldVar == null) {
            amldVar = amld.a;
        }
        amlg amlgVar = (amldVar.b == 2 ? (amla) amldVar.c : amla.a).d;
        if (amlgVar == null) {
            amlgVar = amlg.a;
        }
        return amlgVar.c;
    }

    public static koi S(android.content.Context context) {
        return (koi) agab.aH(context, koi.class);
    }

    public static java.lang.CharSequence T(android.content.Context context, java.lang.CharSequence charSequence, long j) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (j <= 0) {
            return charSequence;
        }
        if (!android.text.TextUtils.isEmpty(charSequence)) {
            arrayList.add(charSequence);
        }
        arrayList.add(android.text.format.Formatter.formatShortFileSize(context, j));
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        defpackage.dxt dxtVarA = defpackage.dxt.a();
        java.util.Iterator it = arrayList.iterator();
        boolean z = true;
        while (it.hasNext()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append(dxtVarA.b(((java.lang.CharSequence) it.next()).toString()));
            z = false;
        }
        return dxtVarA.b(sb.toString());
    }

    public static final int U(long j, long j2) {
        j$.time.ZoneId zoneIdSystemDefault = j$.time.ZoneId.systemDefault();
        j$.time.LocalDate localDate = j$.time.Instant.ofEpochMilli(j).atZone(zoneIdSystemDefault).toLocalDate();
        return (int) aooc.y(j$.time.temporal.ChronoUnit.DAYS.between(j$.time.Instant.ofEpochMilli(j2).atZone(zoneIdSystemDefault).toLocalDate(), localDate), -2147483648L, 2147483647L);
    }

    public static final /* synthetic */ defpackage.ni V(akzx akzxVar) {
        aooh.f(akzxVar, "builder");
        return new defpackage.ni(akzxVar);
    }

    public static final /* synthetic */ defpackage.ni W(akzx akzxVar) {
        aooh.f(akzxVar, "builder");
        return new defpackage.ni(akzxVar);
    }

    public static final /* synthetic */ defpackage.oq X(akzx akzxVar) {
        aooh.f(akzxVar, "builder");
        return new defpackage.oq(akzxVar);
    }

    public static final /* synthetic */ defpackage.oq Y(akzx akzxVar) {
        aooh.f(akzxVar, "builder");
        return new defpackage.oq(akzxVar);
    }

    public static final /* synthetic */ defpackage.oq Z(akzx akzxVar) {
        aooh.f(akzxVar, "builder");
        return new defpackage.oq(akzxVar);
    }

    public static final android.view.View a(ahey aheyVar, android.view.ViewGroup viewGroup) {
        aooh.f(aheyVar, "viewContext");
        aooh.f(viewGroup, "viewContainer");
        android.view.View viewAb = ab(viewGroup);
        if (viewAb != null) {
            return viewAb;
        }
        android.view.View viewG = g(aheyVar);
        viewGroup.addView(viewG);
        return viewG;
    }

    public static final boolean aa(kiu kiuVar, isj isjVar, rsr rsrVar) {
        aooh.f(kiuVar, "<this>");
        aooh.f(isjVar, "beeslyCallLogDataIntegration");
        return (rsrVar.O(kiuVar).j || defpackage.hgt.w(kiuVar, isjVar) == null) ? false : true;
    }

    private static final android.view.View ab(android.view.ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            android.view.View childAt = viewGroup.getChildAt(i);
            if (childAt instanceof com.android.dialer.audioplayback.impl.ui.AudioPlaybackView) {
                return childAt;
            }
        }
        return null;
    }

    private static final boolean ac(defpackage.krx krxVar) {
        return ((defpackage.ksm) krxVar.b).a.length() == 0 && krxVar.c != null;
    }

    private static final java.lang.String ad(defpackage.ksn ksnVar, cav cavVar) {
        j$.util.Objects.checkIndex(0, 7);
        cavVar.u(-1035883129);
        ((cbt) cavVar).W(false);
        return ((defpackage.ksm) ksnVar).a;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0035  */
    private static final java.lang.Integer ae(akef akefVar, java.lang.String str, aopq aopqVar) {
        java.lang.Integer numValueOf;
        akec akecVarB = akefVar.b(str);
        if (akecVarB == null || (akecVarB instanceof akee) || !(akecVarB instanceof akeh)) {
            numValueOf = null;
        } else {
            akeh akehVarF = akecVarB.f();
            if (akehVarF.j()) {
                numValueOf = java.lang.Integer.valueOf(akehVarF.j() ? akehVarF.c().intValue() : java.lang.Integer.parseInt(akehVarF.a()));
            } else {
                numValueOf = null;
            }
        }
        if (numValueOf == null) {
            return null;
        }
        int i = ((aopo) aopqVar).a;
        int i2 = ((aopo) aopqVar).b;
        int iIntValue = numValueOf.intValue();
        if (iIntValue <= i2 && i <= iIntValue) {
            return java.lang.Integer.valueOf(iIntValue);
        }
        defpackage.kqo.a.b().l("com/android/dialer/callnotesinfra/summarizer/callaction/PartialTime$Companion", "getBoundedIntField$<anonymous>", 91, "PartialTime.kt").G("%s value is out of range: %s", str, iIntValue);
        return null;
    }

    public static final j$.util.Optional b(android.view.ViewGroup viewGroup) {
        aooh.f(viewGroup, "viewContainer");
        j$.util.Optional optionalOfNullable = j$.util.Optional.ofNullable(ab(viewGroup));
        aooh.e(optionalOfNullable, "ofNullable(...)");
        return optionalOfNullable;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:35:0x00b0  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void c(android.view.View view, defpackage.iek iekVar) {
        defpackage.ied iedVar;
        aooh.f(view, "view");
        aooh.f(iekVar, "model");
        defpackage.ifq ifqVarE = ((com.android.dialer.audioplayback.impl.ui.AudioPlaybackView) view).y();
        aooh.f(iekVar, "model");
        if (aooh.n(iekVar, ifqVarE.k)) {
            return;
        }
        defpackage.iek iekVar2 = ifqVarE.k;
        if (iekVar2 != null) {
            ifqVarE.o = null;
            defpackage.ifq.a.b().l("com/android/dialer/audioplayback/impl/ui/AudioPlaybackViewPeer", "bind$<anonymous>", 304, "AudioPlaybackViewPeer.kt").v("pause previous playback when bind new model");
            iez iezVar = ifqVarE.d;
            defpackage.ied iedVar2 = iekVar2.c;
            if (iedVar2 == null) {
                iedVar2 = defpackage.ied.a;
            }
            aooh.e(iedVar2, "getAudioInfo(...)");
            iezVar.k(iedVar2, false);
        }
        ifqVarE.g.setVisibility(true != iekVar.d ? 8 : 0);
        ifqVarE.h.setVisibility(true != iekVar.e ? 8 : 0);
        if (iekVar.h) {
            iez iezVar2 = ifqVarE.d;
            if (iezVar2.d() == defpackage.iec.UNKNOWN) {
                iedVar = iekVar.c;
                if (iedVar == null) {
                    iedVar = defpackage.ied.a;
                }
                aooh.e(iedVar, "getAudioInfo(...)");
                iezVar2.m(iedVar);
            } else {
                defpackage.ied iedVar3 = iekVar.c;
                if (iedVar3 == null) {
                    iedVar3 = defpackage.ied.a;
                }
                aooh.e(iedVar3, "getAudioInfo(...)");
                if (iezVar2.s(iedVar3)) {
                    iedVar = iekVar.c;
                    if (iedVar == null) {
                        iedVar = defpackage.ied.a;
                    }
                    aooh.e(iedVar, "getAudioInfo(...)");
                    iezVar2.m(iedVar);
                } else {
                    aimw aimwVarL = defpackage.ifq.a.b().l("com/android/dialer/audioplayback/impl/ui/AudioPlaybackViewPeer", "bind", 318, "AudioPlaybackViewPeer.kt");
                    defpackage.ied iedVar4 = iekVar.c;
                    if (iedVar4 == null) {
                        iedVar4 = defpackage.ied.a;
                    }
                    defpackage.iec iecVarB = defpackage.iec.b(iedVar4.e);
                    if (iecVarB == null) {
                        iecVarB = defpackage.iec.UNRECOGNIZED;
                    }
                    aimwVarL.I("Skip prepare in advance for %s because player is busy with %s", iecVarB, iezVar2.d());
                }
            }
        }
        defpackage.ied iedVar5 = iekVar.c;
        if (iedVar5 == null) {
            iedVar5 = defpackage.ied.a;
        }
        long jB = 0;
        if (iedVar5.d > 0) {
            defpackage.ied iedVar6 = iekVar.c;
            if (iedVar6 == null) {
                iedVar6 = defpackage.ied.a;
            }
            jB = iedVar6.d;
        } else {
            iez iezVar3 = ifqVarE.d;
            defpackage.ied iedVar7 = iekVar.c;
            if (iedVar7 == null) {
                iedVar7 = defpackage.ied.a;
            }
            aooh.e(iedVar7, "getAudioInfo(...)");
            if (iezVar3.s(iedVar7) && iezVar3.b() > 0) {
                jB = iezVar3.b();
            }
        }
        ifqVarE.e(jB);
        defpackage.ied iedVar8 = iekVar.c;
        if (iedVar8 == null) {
            iedVar8 = defpackage.ied.a;
        }
        aooh.e(iedVar8, "getAudioInfo(...)");
        ifqVarE.a(iedVar8, ifqVarE.d.t());
        ifqVarE.k = iekVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void d(android.view.View view, defpackage.ieg iegVar) {
        ((com.android.dialer.audioplayback.impl.ui.AudioPlaybackView) view).y().o = iegVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void e(android.view.View view, boolean z) {
        android.view.View viewFindViewById = ((com.android.dialer.audioplayback.impl.ui.AudioPlaybackView) view).findViewById(2131427500);
        aooh.e(viewFindViewById, "findViewById(...)");
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) viewFindViewById;
        if (z) {
            viewGroup.setEnabled(true);
            java.util.Iterator itA = dzl.b(viewGroup).a();
            while (itA.hasNext()) {
                ((android.view.View) itA.next()).setEnabled(true);
            }
            viewGroup.setAlpha(1.0f);
            return;
        }
        viewGroup.setEnabled(false);
        java.util.Iterator itA2 = dzl.b(viewGroup).a();
        while (itA2.hasNext()) {
            ((android.view.View) itA2.next()).setEnabled(false);
        }
        viewGroup.setAlpha(0.3f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void f(android.view.View view) {
        aooh.f(view, "view");
        defpackage.ifq ifqVarE = ((com.android.dialer.audioplayback.impl.ui.AudioPlaybackView) view).y();
        defpackage.iek iekVar = ifqVarE.k;
        if (iekVar != null) {
            defpackage.ied iedVar = iekVar.c;
            if (iedVar == null) {
                iedVar = defpackage.ied.a;
            }
            if (iedVar != null) {
                defpackage.ifq.a.b().l("com/android/dialer/audioplayback/impl/ui/AudioPlaybackViewPeer", "unbind$<anonymous>", 343, "AudioPlaybackViewPeer.kt").v("pause audio playback when unbind");
                ifqVarE.d.k(iedVar, false);
            }
        }
        ifqVarE.k = null;
        ifqVarE.o = null;
    }

    public static final android.view.View g(ahey aheyVar) {
        aooh.f(aheyVar, "viewContext");
        return new com.android.dialer.audioplayback.impl.ui.AudioPlaybackView(aheyVar);
    }

    public static final /* synthetic */ defpackage.hgw h(akzx akzxVar) {
        aooh.f(akzxVar, "builder");
        return new defpackage.hgw(akzxVar);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: aois */
    public static final defpackage.itt i(defpackage.iud iudVar) throws aois {
        defpackage.iua iuaVar = defpackage.iua.UNKNOWN;
        switch (iudVar.a - 1) {
            case 0:
                return new defpackage.its(1);
            case 1:
                return new defpackage.its(4);
            case 2:
                return new defpackage.its(3);
            case 3:
                return new defpackage.its(2);
            case 4:
                return defpackage.itw.a;
            case 5:
                return new defpackage.itv(2);
            case 6:
                return new defpackage.itv(3);
            default:
                throw new aois();
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: aois */
    public static final defpackage.iud j(defpackage.itt ittVar) throws aois {
        if (!(ittVar instanceof defpackage.its)) {
            if (ittVar instanceof defpackage.itv) {
                return ((defpackage.itv) ittVar).a == 2 ? new defpackage.iud(defpackage.iuc.f) : new defpackage.iud(defpackage.iuc.g);
            }
            if (aooh.n(ittVar, defpackage.itw.a)) {
                return new defpackage.iud(defpackage.iuc.e);
            }
            throw new aois();
        }
        int i = ((defpackage.its) ittVar).a;
        defpackage.iua iuaVar = defpackage.iua.UNKNOWN;
        int i2 = i - 1;
        if (i2 == 0) {
            return new defpackage.iud(defpackage.iuc.a);
        }
        if (i2 != 1) {
            return i2 != 2 ? new defpackage.iud(defpackage.iuc.b) : new defpackage.iud(defpackage.iuc.c);
        }
        return new defpackage.iud(defpackage.iuc.d);
    }

    public static /* synthetic */ int k(java.lang.Object obj) {
        j$.util.Objects.checkIndex(0, 4);
        if (obj instanceof defpackage.itp) {
            return 0;
        }
        if (obj instanceof defpackage.itu) {
            return 1;
        }
        return obj instanceof defpackage.itx ? 2 : -2;
    }

    public static final boolean l(defpackage.itc itcVar) {
        return itcVar.d == null;
    }

    public static final boolean m(defpackage.itc itcVar) {
        aooh.f(itcVar, "<this>");
        defpackage.itt ittVar = itcVar.k;
        if (ittVar == null) {
            ittVar = itcVar.l;
        }
        defpackage.its itsVar = ittVar instanceof defpackage.its ? (defpackage.its) ittVar : null;
        int i = itsVar != null ? itsVar.a : 0;
        return i == 3 || i == 2;
    }

    public static final defpackage.ksm n(java.lang.String str, java.lang.Integer num) {
        aooh.f(str, "<this>");
        return new defpackage.ksm(str, num);
    }

    public static final boolean o(mmy mmyVar) {
        aooh.f(mmyVar, "<this>");
        java.lang.String str = mmyVar.c;
        aooh.e(str, "getTranscriptSnippet(...)");
        if (str.length() <= 0) {
            java.lang.String str2 = mmyVar.d;
            aooh.e(str2, "getFallbackSnippet(...)");
            if (str2.length() <= 0) {
                return false;
            }
        }
        return true;
    }

    public static final void p(int i, akzx akzxVar) {
        akzxVar.u();
        isq isqVar = akzxVar.b;
        isq isqVar2 = isq.a;
        isqVar.j = a.T(i);
        isqVar.b |= 128;
    }

    public static final void q(int i, akzx akzxVar) {
        akzxVar.u();
        isq isqVar = akzxVar.b;
        isq isqVar2 = isq.a;
        isqVar.h = i - 2;
        isqVar.b |= 32;
    }

    public static final boolean r(isq isqVar) {
        if ((isqVar.b & 4) != 0) {
            java.lang.String str = isqVar.e;
            aooh.e(str, "getTranscriptText(...)");
            if (aoov.H(str)) {
                return true;
            }
        }
        return false;
    }

    public static final boolean s(isq isqVar) {
        return (isqVar.b & 4) == 0;
    }

    public static final /* synthetic */ defpackage.heq t(akzx akzxVar) {
        aooh.f(akzxVar, "builder");
        return new defpackage.heq(akzxVar);
    }

    public static final /* synthetic */ defpackage.heq u(akzx akzxVar) {
        aooh.f(akzxVar, "builder");
        return new defpackage.heq(akzxVar);
    }

    public static final /* synthetic */ defpackage.her v(akzx akzxVar) {
        aooh.f(akzxVar, "builder");
        return new defpackage.her(akzxVar, (byte[]) null);
    }

    public static final long w(alcf alcfVar) {
        aooh.f(alcfVar, "<this>");
        return alcfVar.b * 1000;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: aois */
    /* JADX WARN: Code duplicated, block: B:33:0x005d  */
    /* JADX WARN: Code duplicated, block: B:35:0x0061  */
    /* JADX WARN: Code duplicated, block: B:36:0x0066  */
    /* JADX WARN: Code duplicated, block: B:38:0x006c  */
    /* JADX WARN: Code duplicated, block: B:39:0x006f  */
    /* JADX WARN: Code duplicated, block: B:43:0x0076  */
    /* JADX WARN: Code duplicated, block: B:45:0x007e  */
    /* JADX WARN: Code duplicated, block: B:46:0x0081  */
    /* JADX WARN: Code duplicated, block: B:48:0x0085  */
    /* JADX WARN: Code duplicated, block: B:51:0x008d  */
    /* JADX WARN: Code duplicated, block: B:52:0x008f  */
    /* JADX WARN: Code duplicated, block: B:55:0x0098  */
    /* JADX WARN: Code duplicated, block: B:57:0x009c  */
    /* JADX WARN: Code duplicated, block: B:58:0x009f  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:64:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:65:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:68:0x011a  */
    /* JADX WARN: Code duplicated, block: B:71:0x0125  */
    /* JADX WARN: Code duplicated, block: B:73:? A[RETURN, SYNTHETIC] */
    public static final void x(cmw cmwVar, defpackage.krx krxVar, aomy aomyVar, defpackage.krk krkVar, aonn aonnVar, cav cavVar, int i, int i2) throws aois {
        cmw cmwVar2;
        int i3;
        aomy aomyVar2;
        aonn aonnVar2;
        boolean z;
        cmw cmwVar3;
        aomy aomyVar3;
        cdk cdkVarI;
        cbt cbtVar;
        aomy aomyVar4;
        int i4;
        boolean zD;
        int i5;
        defpackage.krk krkVar2 = krkVar;
        cbt cbtVarB = cavVar.b(-1886834412);
        int i6 = i2 & 1;
        if (i6 != 0) {
            i3 = i | 6;
            cmwVar2 = cmwVar;
        } else if ((i & 6) == 0) {
            cmwVar2 = cmwVar;
            i3 = (true != cbtVarB.B(cmwVar2) ? 2 : 4) | i;
        } else {
            cmwVar2 = cmwVar;
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= true != cbtVarB.B(krxVar) ? 16 : 32;
        }
        int i7 = i2 & 4;
        if (i7 == 0) {
            if ((i & 384) == 0) {
                aomyVar2 = aomyVar;
                i3 |= true != cbtVarB.D(aomyVar2) ? 128 : 256;
            }
            if ((i & 3072) == 0) {
                if ((i & 4096) == 0) {
                    zD = cbtVarB.B(krkVar2);
                } else {
                    zD = cbtVarB.D(krkVar2);
                }
                if (true != zD) {
                    i5 = 1024;
                } else {
                    i5 = 2048;
                }
                i3 |= i5;
            }
            if ((i & 24576) == 0) {
                aonnVar2 = aonnVar;
                if (true != cbtVarB.D(aonnVar2)) {
                    i4 = 8192;
                } else {
                    i4 = 16384;
                }
                i3 |= i4;
            } else {
                aonnVar2 = aonnVar;
            }
            if ((i3 & 9363) != 9362) {
                z = true;
            } else {
                z = false;
            }
            if (cbtVarB.H(z, i3 & 1)) {
                int i8 = i3 >> 3;
                if (i6 != 0) {
                    cmwVar3 = cmw.c;
                } else {
                    cmwVar3 = cmwVar2;
                }
                if (i7 != 0) {
                    aomyVar2 = null;
                }
                cmw cmwVarD = azm.d(cmwVar3, 1.0f);
                cye cyeVarA = aww.a(awi.f(12.0f), cmh.j, cbtVarB, 6);
                cbtVar = cbtVarB;
                int iM = anty.M(cbtVar.x);
                cje cjeVarAi = cbtVar.ai();
                cmw cmwVarM = cfo.m(cbtVarB, cmwVarD);
                aomyVar4 = dam.a;
                cbtVarB.v();
                if (cbtVar.w) {
                    cbtVarB.j(aomyVar4);
                } else {
                    cbtVarB.x();
                }
                cev.c(cbtVarB, cyeVarA, dam.e);
                cev.c(cbtVarB, cjeVarAi, dam.d);
                cev.c(cbtVarB, java.lang.Integer.valueOf(iM), dam.f);
                cev.b(cbtVarB, dam.g);
                cev.c(cbtVarB, cmwVarM, dam.c);
                defpackage.ksn ksnVar = krxVar.b;
                cbtVarB.u(1008427360);
                H(ksnVar, aomyVar2, null, cbtVarB, i8 & 112);
                cbtVar.W(false);
                krkVar2 = krkVar;
                F(krxVar, krkVar2, null, cbtVarB, (i8 & 14) | ((i3 >> 6) & 112));
                cbtVar.W(true);
            } else {
                cbtVarB.s();
                cmwVar3 = cmwVar2;
            }
            aomyVar3 = aomyVar2;
            cdkVarI = cbtVarB.I();
            if (cdkVarI != null) {
                cdkVarI.c = new defpackage.dqf(cmwVar3, krxVar, aomyVar3, krkVar2, aonnVar2, i, i2, 2);
            }
        }
        i3 |= 384;
        aomyVar2 = aomyVar;
        if ((i & 3072) == 0) {
            if ((i & 4096) == 0) {
                zD = cbtVarB.B(krkVar2);
            } else {
                zD = cbtVarB.D(krkVar2);
            }
            if (true != zD) {
                i5 = 1024;
            } else {
                i5 = 2048;
            }
            i3 |= i5;
        }
        if ((i & 24576) == 0) {
            aonnVar2 = aonnVar;
            if (true != cbtVarB.D(aonnVar2)) {
                i4 = 8192;
            } else {
                i4 = 16384;
            }
            i3 |= i4;
        } else {
            aonnVar2 = aonnVar;
        }
        if ((i3 & 9363) != 9362) {
            z = true;
        } else {
            z = false;
        }
        if (cbtVarB.H(z, i3 & 1)) {
            int i9 = i3 >> 3;
            if (i6 != 0) {
                cmwVar3 = cmw.c;
            } else {
                cmwVar3 = cmwVar2;
            }
            if (i7 != 0) {
                aomyVar2 = null;
            }
            cmw cmwVarD2 = azm.d(cmwVar3, 1.0f);
            cye cyeVarA2 = aww.a(awi.f(12.0f), cmh.j, cbtVarB, 6);
            cbtVar = cbtVarB;
            int iM2 = anty.M(cbtVar.x);
            cje cjeVarAi2 = cbtVar.ai();
            cmw cmwVarM2 = cfo.m(cbtVarB, cmwVarD2);
            aomyVar4 = dam.a;
            cbtVarB.v();
            if (cbtVar.w) {
                cbtVarB.j(aomyVar4);
            } else {
                cbtVarB.x();
            }
            cev.c(cbtVarB, cyeVarA2, dam.e);
            cev.c(cbtVarB, cjeVarAi2, dam.d);
            cev.c(cbtVarB, java.lang.Integer.valueOf(iM2), dam.f);
            cev.b(cbtVarB, dam.g);
            cev.c(cbtVarB, cmwVarM2, dam.c);
            defpackage.ksn ksnVar2 = krxVar.b;
            cbtVarB.u(1008427360);
            H(ksnVar2, aomyVar2, null, cbtVarB, i9 & 112);
            cbtVar.W(false);
            krkVar2 = krkVar;
            F(krxVar, krkVar2, null, cbtVarB, (i9 & 14) | ((i3 >> 6) & 112));
            cbtVar.W(true);
        } else {
            cbtVarB.s();
            cmwVar3 = cmwVar2;
        }
        aomyVar3 = aomyVar2;
        cdkVarI = cbtVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new defpackage.dqf(cmwVar3, krxVar, aomyVar3, krkVar2, aonnVar2, i, i2, 2);
        }
    }

    public static final void y(cmw cmwVar, defpackage.krx krxVar, aomy aomyVar, cav cavVar, int i, int i2) {
        cmw cmwVar2;
        int i3;
        cav cavVar2;
        cmw cmwVar3;
        cdk cdkVarI;
        defpackage.dqg dqgVar;
        cav cavVarB = cavVar.b(1047444393);
        if (i2 != 0) {
            i3 = i | 6;
            cmwVar2 = cmwVar;
        } else if ((i & 6) == 0) {
            cmwVar2 = cmwVar;
            i3 = (true != cavVarB.B(cmwVar2) ? 2 : 4) | i;
        } else {
            cmwVar2 = cmwVar;
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= true != cavVarB.B(krxVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i3 |= true != cavVarB.D(aomyVar) ? 128 : 256;
        }
        if (cavVarB.H((i3 & 147) != 146, i3 & 1)) {
            if (i2 != 0) {
                cmwVar2 = cmw.c;
            }
            if (krxVar.c != null) {
                cye cyeVarA = azh.a(awi.f(8.0f), cmh.n, cavVarB, 54);
                cbt cbtVar = (cbt) cavVarB;
                int iM = anty.M(cbtVar.x);
                cje cjeVarAi = cbtVar.ai();
                cmw cmwVarM = cfo.m(cavVarB, cmwVar2);
                aomy aomyVar2 = dam.a;
                cavVarB.v();
                if (cbtVar.w) {
                    cavVarB.j(aomyVar2);
                } else {
                    cavVarB.x();
                }
                cev.c(cavVarB, cyeVarA, dam.e);
                cev.c(cavVarB, cjeVarAi, dam.d);
                cev.c(cavVarB, java.lang.Integer.valueOf(iM), dam.f);
                cev.b(cavVarB, dam.g);
                cev.c(cavVarB, cmwVarM, dam.c);
                defpackage.ksj ksjVar = krxVar.a;
                cavVarB.u(-783873236);
                defpackage.djf djfVar = new defpackage.djf(16);
                djfVar.g(dfa.f(ksjVar.b, cavVarB));
                djfVar.g(" ");
                defpackage.dkx dkxVar = new defpackage.dkx(new dks(den.ak(cavVarB).a, 0L, (dnd) null, (dmw) null, (dmx) null, (dmq) null, (java.lang.String) null, 0L, (dok) null, (doz) null, (dnx) null, 0L, (dou) null, (crc) null, 65534), null, null, null);
                int i4 = i3 & 896;
                java.lang.Object objR = cbtVar.R();
                if (i4 == 256 || objR == cau.a) {
                    objR = new defpackage.krq(aomyVar, 0);
                    cbtVar.ab(objR);
                }
                int iB = djfVar.b(new defpackage.dju("Learn more", dkxVar, (defpackage.djx) objR));
                try {
                    djfVar.g(dfa.f(2132018781, cavVarB));
                    djfVar.i(iB);
                    cmwVar3 = cmwVar2;
                    dji djiVarC = djfVar.c();
                    cbtVar.W(false);
                    cmt cmtVar = cmw.c;
                    java.lang.Object objR2 = cbtVar.R();
                    if (objR2 == cau.a) {
                        objR2 = new defpackage.kbz(14);
                        cbtVar.ab(objR2);
                    }
                    cavVar2 = cavVarB;
                    abrz.l(djiVarC, dig.b(cmtVar, true, (aonj) objR2), den.ak(cavVarB).q, 0L, 0L, (dot) null, 0L, 0, false, 0, 0, (java.util.Map) null, (aonj) null, den.an(cavVarB).o, cavVar2, 0, 0, 262136);
                    cbtVar.W(true);
                } catch (java.lang.Throwable th) {
                    djfVar.i(iB);
                    throw th;
                }
            } else {
                cmw cmwVar4 = cmwVar2;
                cdkVarI = cavVarB.I();
                if (cdkVarI == null) {
                    return;
                } else {
                    dqgVar = new defpackage.dqg(cmwVar4, krxVar, aomyVar, i, i2, 4);
                }
            }
            cdkVarI.c = dqgVar;
        }
        cavVar2 = cavVarB;
        cavVar2.s();
        cmwVar3 = cmwVar2;
        cdkVarI = cavVar2.I();
        if (cdkVarI != null) {
            dqgVar = new defpackage.dqg(cmwVar3, krxVar, aomyVar, i, i2, 5);
            cdkVarI.c = dqgVar;
        }
    }

    public static final void z(defpackage.krd krdVar, android.view.View view, boolean z, cav cavVar, int i) {
        int i2;
        int i3 = i & 384;
        cbt cbtVarB = cavVar.b(-1177561423);
        if (i3 == 0) {
            i2 = (true != cbtVarB.D(view) ? 128 : 256) | i;
        } else {
            i2 = i;
        }
        if ((i & 3072) == 0) {
            i2 |= true != cbtVarB.C(z) ? 1024 : 2048;
        }
        if (!cbtVarB.H((i2 & 1153) != 1152, i2 & 1)) {
            cbtVarB.s();
        } else {
            if (view == null) {
                cdk cdkVarI = cbtVarB.I();
                if (cdkVarI != null) {
                    cdkVarI.c = new defpackage.oa(krdVar, z, i, 5);
                    return;
                }
                return;
            }
            if (z) {
                cbtVarB.u(560798897);
                cbtVarB.W(false);
            } else {
                cbtVarB.u(560749886);
                den.aR(azm.e(cmw.c, 12.0f), cbtVarB);
                cbtVarB.W(false);
            }
            boolean zD = cbtVarB.D(view);
            cbt cbtVar = cbtVarB;
            java.lang.Object objR = cbtVar.R();
            if (zD || objR == cau.a) {
                objR = new defpackage.jpi(view, 19);
                cbtVar.ab(objR);
            }
            aonj aonjVar = (aonj) objR;
            java.lang.Object objR2 = cbtVar.R();
            if (objR2 == cau.a) {
                objR2 = new defpackage.kbz(15);
                cbtVar.ab(objR2);
            }
            defpackage.dqi.a(aonjVar, null, (aonj) objR2, cbtVarB, 384, 2);
        }
        cdk cdkVarI2 = cbtVarB.I();
        if (cdkVarI2 != null) {
            cdkVarI2.c = new bsq(krdVar, view, z, i, 4, (byte[]) null);
        }
    }
}
