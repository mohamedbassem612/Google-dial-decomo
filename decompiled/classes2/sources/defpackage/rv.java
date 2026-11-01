package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class rv {
    static int a(android.app.appsearch.SearchResult.MatchInfo matchInfo) {
        return rk$.ExternalSyntheticApiModelOutline0.m$1(ae$.ExternalSyntheticApiModelOutline0.m(matchInfo));
    }

    static int b(android.app.appsearch.SearchResult.MatchInfo matchInfo) {
        return rk$.ExternalSyntheticApiModelOutline0.m(ae$.ExternalSyntheticApiModelOutline0.m(matchInfo));
    }

    public static java.util.List c(java.util.List list) {
        return list == null ? java.util.Collections.EMPTY_LIST : list;
    }

    public static java.util.List d(java.util.List list) {
        return list == null ? java.util.Collections.EMPTY_LIST : j$.util.DesugarCollections.unmodifiableList(new java.util.ArrayList(list));
    }

    public static final float e(float f, float f2) {
        if (f2 == 0.0f) {
            return 0.0f;
        }
        if (f2 > 0.0f) {
            if (f <= f2) {
                return f;
            }
        } else if (f >= f2) {
            return f;
        }
        return f2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public static final java.lang.Object f(asv asvVar, float f, float f2, air airVar, aiq aiqVar, aonj aonjVar, aoln aolnVar) {
        defpackage.aux auxVar;
        float fFloatValue;
        air airVar2;
        aooq aooqVar;
        float f3 = f;
        if (aolnVar instanceof defpackage.aux) {
            auxVar = (defpackage.aux) aolnVar;
            int i = auxVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                auxVar.d = i - Integer.MIN_VALUE;
            } else {
                auxVar = new defpackage.aux(aolnVar);
            }
        } else {
            auxVar = new defpackage.aux(aolnVar);
        }
        defpackage.aux auxVar2 = auxVar;
        java.lang.Object obj = auxVar2.c;
        aolu aoluVar = aolu.a;
        int i2 = auxVar2.d;
        if (i2 == 0) {
            aooc.af(obj);
            aooq aooqVar2 = new aooq();
            fFloatValue = ((java.lang.Number) airVar.b()).floatValue();
            java.lang.Float f4 = new java.lang.Float(f3);
            boolean z = ((java.lang.Number) airVar.b()).floatValue() != 0.0f;
            defpackage.auv auvVar = new defpackage.auv(f2, aooqVar2, asvVar, aonjVar, 0);
            auxVar2.e = airVar;
            auxVar2.f = aooqVar2;
            auxVar2.a = f3;
            auxVar2.b = fFloatValue;
            auxVar2.d = 1;
            if (defpackage.wx.d(airVar, f4, aiqVar, z, auvVar, auxVar2) == aoluVar) {
                return aoluVar;
            }
            airVar2 = airVar;
            aooqVar = aooqVar2;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            float f5 = auxVar2.b;
            float f6 = auxVar2.a;
            aooqVar = auxVar2.f;
            airVar2 = auxVar2.e;
            aooc.af(obj);
            fFloatValue = f5;
            f3 = f6;
        }
        return new vx(new java.lang.Float(f3 - aooqVar.a), den.bs(airVar2, 0.0f, e(((java.lang.Number) airVar2.b()).floatValue(), fFloatValue), 29), (char[]) null);
    }

    public static final aojh g(float f, aooq aooqVar, asv asvVar, aonj aonjVar, defpackage.aip aipVar) {
        float fA;
        float fE = e(((java.lang.Number) aipVar.a()).floatValue(), f);
        float f2 = fE - aooqVar.a;
        try {
            fA = asvVar.a(f2);
        } catch (java.util.concurrent.CancellationException unused) {
            aipVar.b();
            fA = 0.0f;
        }
        aonjVar.a(java.lang.Float.valueOf(fA));
        if (java.lang.Math.abs(f2 - fA) > 0.5f || fE != ((java.lang.Number) aipVar.a()).floatValue()) {
            aipVar.b();
        }
        aooqVar.a += fA;
        return aojh.a;
    }

    public static final void h(defpackage.aip aipVar, asv asvVar, aonj aonjVar, float f) {
        float fA;
        try {
            fA = asvVar.a(f);
        } catch (java.util.concurrent.CancellationException unused) {
            aipVar.b();
            fA = 0.0f;
        }
        aonjVar.a(java.lang.Float.valueOf(fA));
        if (java.lang.Math.abs(f - fA) > 0.5f) {
            aipVar.b();
        }
    }

    public static final boolean i(int i) {
        return i == 1 || i == 2;
    }

    public static final cmw j(cmw cmwVar) {
        return cmwVar.a(defpackage.cpf.a);
    }

    public static final cmw k(cmw cmwVar, aonj aonjVar) {
        return cmwVar.a(new defpackage.coi(aonjVar));
    }

    public static final java.lang.Object l(cpg cpgVar, int i, aonj aonjVar) {
        int i2;
        java.lang.Object objA;
        cmv cmvVarX;
        bdl bdlVarE;
        dce dceVar;
        if (!((cmv) cpgVar).t.D) {
            cwh.d("visitAncestors called on an unattached node");
        }
        cmv cmvVar = ((cmv) cpgVar).t.w;
        dbk dbkVarA = cfo.A(cpgVar);
        loop0: while (true) {
            objA = null;
            if (dbkVarA == null) {
                cmvVarX = null;
                break;
            }
            if ((dbkVarA.v.f.v & 1024) != 0) {
                while (cmvVar != null) {
                    if ((cmvVar.u & 1024) != 0) {
                        cmvVarX = cmvVar;
                        cfc cfcVar = null;
                        while (cmvVarX != null) {
                            if (cmvVarX instanceof cpg) {
                                break loop0;
                            }
                            if ((cmvVarX.u & 1024) != 0 && (cmvVarX instanceof dap)) {
                                int i3 = 0;
                                for (cmv cmvVar2 = ((dap) cmvVarX).F; cmvVar2 != null; cmvVar2 = cmvVar2.x) {
                                    if ((cmvVar2.u & 1024) != 0) {
                                        i3++;
                                        if (i3 == 1) {
                                            cmvVarX = cmvVar2;
                                        } else {
                                            if (cfcVar == null) {
                                                cfcVar = new cfc(new cmv[16]);
                                            }
                                            if (cmvVarX != null) {
                                                cfcVar.n(cmvVarX);
                                            }
                                            cfcVar.n(cmvVar2);
                                            cmvVarX = null;
                                        }
                                    }
                                }
                                if (i3 != 1) {
                                }
                            }
                            cmvVarX = cfo.x(cfcVar);
                        }
                    }
                    cmvVar = cmvVar.w;
                }
            }
            dbkVarA = dbkVarA.k();
            cmvVar = (dbkVarA == null || (dceVar = dbkVarA.v) == null) ? null : dceVar.e;
        }
        cpg cpgVar2 = (cpg) cmvVarX;
        if ((cpgVar2 != null && aooh.n(cfo.E(cpgVar2), cfo.E(cpgVar))) || (bdlVarE = cfo.E(cpgVar)) == null) {
            return null;
        }
        int i4 = 5;
        if (!a.x(i, 5)) {
            i4 = 6;
            if (!a.x(i, 6)) {
                i4 = 3;
                if (!a.x(i, 3)) {
                    i4 = 4;
                    if (!a.x(i, 4)) {
                        if (a.x(i, 1)) {
                            i4 = 2;
                        } else {
                            if (!a.x(i, 2)) {
                                throw new java.lang.IllegalStateException("Unsupported direction for beyond bounds layout");
                            }
                            i4 = 1;
                        }
                    }
                }
            }
        }
        if (bdlVarE.b.b() <= 0 || !bdlVarE.b.e() || !((cmv) bdlVarE).D) {
            return aonjVar.a(bdl.a);
        }
        int iC = bdlVarE.g(i4) ? bdlVarE.b.c() : bdlVarE.b.a();
        aoot aootVar = new aoot();
        aootVar.a = bdlVarE.e.as(iC, iC);
        int iD = bdlVarE.b.d() << 1;
        int iB = bdlVarE.b.b();
        if (iD > iB) {
            iD = iB;
        }
        for (i2 = 0; objA == null && bdlVarE.d((bdh) aootVar.a, i4) && i2 < iD; i2++) {
            bdh bdhVar = (bdh) aootVar.a;
            int i5 = bdhVar.a;
            int i6 = bdhVar.b;
            if (bdlVarE.g(i4)) {
                i6++;
            } else {
                i5--;
            }
            bdh bdhVarAs = bdlVarE.e.as(i5, i6);
            bdlVarE.e.at((bdh) aootVar.a);
            aootVar.a = bdhVarAs;
            cfo.A(bdlVarE).C();
            objA = aonjVar.a(new defpackage.bdk(bdlVarE, aootVar, i4));
        }
        bdlVarE.e.at((bdh) aootVar.a);
        cfo.A(bdlVarE).C();
        return objA;
    }

    public static final cer m(kaw kawVar, cav cavVar, int i) {
        kaw kawVar2;
        cbt cbtVar = (cbt) cavVar;
        java.lang.Object objR = cbtVar.R();
        java.lang.Object obj = cau.a;
        if (objR == obj) {
            androidx.compose.runtime.ParcelableSnapshotMutableState parcelableSnapshotMutableState = new androidx.compose.runtime.ParcelableSnapshotMutableState(java.lang.Boolean.FALSE, cdu.c);
            cbtVar.ab(parcelableSnapshotMutableState);
            objR = parcelableSnapshotMutableState;
        }
        ccp ccpVar = (ccp) objR;
        boolean z = true;
        if ((((i & 14) ^ 6) <= 4 || !cavVar.B(kawVar)) && (i & 6) != 4) {
            z = false;
        }
        java.lang.Object objR2 = cbtVar.R();
        if (z || objR2 == obj) {
            kawVar2 = kawVar;
            defpackage.amg amgVar = new defpackage.amg(kawVar2, ccpVar, (aoln) null, 15, (char[]) null);
            cbtVar.ab(amgVar);
            objR2 = amgVar;
        } else {
            kawVar2 = kawVar;
        }
        cbp.g(kawVar2, (aonn) objR2, cavVar);
        return ccpVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final java.lang.Object n(asv asvVar, float f, air airVar, kaw kawVar, aonj aonjVar, aoln aolnVar) {
        defpackage.auw auwVar;
        float f2;
        aooq aooqVar;
        if (aolnVar instanceof defpackage.auw) {
            auwVar = (defpackage.auw) aolnVar;
            int i = auwVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                auwVar.c = i - Integer.MIN_VALUE;
            } else {
                auwVar = new defpackage.auw(aolnVar);
            }
        } else {
            auwVar = new defpackage.auw(aolnVar);
        }
        java.lang.Object obj = auwVar.b;
        aolu aoluVar = aolu.a;
        int i2 = auwVar.c;
        if (i2 == 0) {
            aooc.af(obj);
            aooq aooqVar2 = new aooq();
            boolean z = ((java.lang.Number) airVar.b()).floatValue() != 0.0f;
            defpackage.auv auvVar = new defpackage.auv(f, aooqVar2, asvVar, aonjVar, 1);
            auwVar.d = airVar;
            auwVar.e = aooqVar2;
            auwVar.a = f;
            auwVar.c = 1;
            if (defpackage.wx.l(airVar, kawVar, z, auvVar, auwVar) == aoluVar) {
                return aoluVar;
            }
            f2 = f;
            aooqVar = aooqVar2;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f2 = auwVar.a;
            aooqVar = auwVar.e;
            airVar = auwVar.d;
            aooc.af(obj);
        }
        return new vx(new java.lang.Float(f2 - aooqVar.a), airVar, (char[]) null);
    }
}
