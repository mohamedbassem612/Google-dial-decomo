package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class rx {
    /* JADX INFO: Thrown type has an unknown type hierarchy: aois */
    public static final int A(cpg cpgVar, int i) throws aois {
        cmv cmvVar;
        dce dceVar;
        int iOrdinal = cpgVar.e().ordinal();
        if (iOrdinal == 0) {
            return 1;
        }
        if (iOrdinal == 1) {
            return z(G(cpgVar), i);
        }
        if (iOrdinal == 2) {
            return 1;
        }
        if (iOrdinal != 3) {
            throw new aois();
        }
        if (!((cmv) cpgVar).t.D) {
            cwh.d("visitAncestors called on an unattached node");
        }
        cmv cmvVar2 = ((cmv) cpgVar).t.w;
        dbk dbkVarA = cfo.A(cpgVar);
        loop0: while (true) {
            cmvVar = null;
            if (dbkVarA == null) {
                break;
            }
            if ((dbkVarA.v.f.v & 1024) != 0) {
                while (cmvVar2 != null) {
                    if ((cmvVar2.u & 1024) != 0) {
                        cmv cmvVarX = cmvVar2;
                        cfc cfcVar = null;
                        while (cmvVarX != null) {
                            if (cmvVarX instanceof cpg) {
                                cmvVar = cmvVarX;
                                break loop0;
                            }
                            if ((cmvVarX.u & 1024) != 0 && (cmvVarX instanceof dap)) {
                                int i2 = 0;
                                for (cmv cmvVar3 = ((dap) cmvVarX).F; cmvVar3 != null; cmvVar3 = cmvVar3.x) {
                                    if ((cmvVar3.u & 1024) != 0) {
                                        i2++;
                                        if (i2 == 1) {
                                            cmvVarX = cmvVar3;
                                        } else {
                                            if (cfcVar == null) {
                                                cfcVar = new cfc(new cmv[16]);
                                            }
                                            if (cmvVarX != null) {
                                                cfcVar.n(cmvVarX);
                                            }
                                            cfcVar.n(cmvVar3);
                                            cmvVarX = null;
                                        }
                                    }
                                }
                                if (i2 != 1) {
                                }
                            }
                            cmvVarX = cfo.x(cfcVar);
                        }
                    }
                    cmvVar2 = cmvVar2.w;
                }
            }
            dbkVarA = dbkVarA.k();
            cmvVar2 = (dbkVarA == null || (dceVar = dbkVarA.v) == null) ? null : dceVar.e;
        }
        cpg cpgVar2 = (cpg) cmvVar;
        if (cpgVar2 == null) {
            return 1;
        }
        int iOrdinal2 = cpgVar2.e().ordinal();
        if (iOrdinal2 == 0) {
            return H(cpgVar2, i);
        }
        if (iOrdinal2 == 1) {
            return A(cpgVar2, i);
        }
        if (iOrdinal2 == 2) {
            return 2;
        }
        if (iOrdinal2 != 3) {
            throw new aois();
        }
        int iA = A(cpgVar2, i);
        int i3 = iA == 1 ? 0 : iA;
        return i3 == 0 ? H(cpgVar2, i) : i3;
    }

    public static final cmw B(cmw cmwVar, defpackage.coz cozVar) {
        return cmwVar.a(new defpackage.cpa(cozVar));
    }

    private static final boolean C(cpg cpgVar, cpg cpgVar2, int i, aonj aonjVar) {
        if (r(cpgVar, cpgVar2, i, aonjVar)) {
            return true;
        }
        java.lang.Boolean bool = (java.lang.Boolean) defpackage.rv.l(cpgVar, i, new defpackage.cpj(cfo.C(cpgVar).F.b(), cpgVar, cpgVar2, i, aonjVar, 1));
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    private static final boolean D(cpg cpgVar, aonj aonjVar) {
        cfc cfcVar = new cfc(new cpg[16]);
        if (!((cmv) cpgVar).t.D) {
            cwh.d("visitChildren called on an unattached node");
        }
        cfc cfcVar2 = new cfc(new cmv[16]);
        cmv cmvVar = ((cmv) cpgVar).t;
        cmv cmvVar2 = cmvVar.x;
        if (cmvVar2 == null) {
            cfo.F(cfcVar2, cmvVar);
        } else {
            cfcVar2.n(cmvVar2);
        }
        while (true) {
            int i = cfcVar2.b;
            if (i == 0) {
                break;
            }
            cmv cmvVarX = (cmv) cfcVar2.c(i - 1);
            if ((cmvVarX.v & 1024) == 0) {
                cfo.F(cfcVar2, cmvVarX);
            } else {
                while (cmvVarX != null) {
                    if ((cmvVarX.u & 1024) != 0) {
                        cfc cfcVar3 = null;
                        while (cmvVarX != null) {
                            if (cmvVarX instanceof cpg) {
                                cfcVar.n((cpg) cmvVarX);
                            } else if ((cmvVarX.u & 1024) != 0 && (cmvVarX instanceof dap)) {
                                int i2 = 0;
                                for (cmv cmvVar3 = ((dap) cmvVarX).F; cmvVar3 != null; cmvVar3 = cmvVar3.x) {
                                    if ((cmvVar3.u & 1024) != 0) {
                                        i2++;
                                        if (i2 == 1) {
                                            cmvVarX = cmvVar3;
                                        } else {
                                            if (cfcVar3 == null) {
                                                cfcVar3 = new cfc(new cmv[16]);
                                            }
                                            if (cmvVarX != null) {
                                                cfcVar3.n(cmvVarX);
                                            }
                                            cfcVar3.n(cmvVar3);
                                            cmvVarX = null;
                                        }
                                    }
                                }
                                if (i2 != 1) {
                                }
                            }
                            cmvVarX = cfo.x(cfcVar3);
                        }
                        break;
                    }
                    cmvVarX = cmvVarX.x;
                }
            }
        }
        cfcVar.j(cph.a);
        int i3 = cfcVar.b - 1;
        java.lang.Object[] objArr = cfcVar.a;
        if (i3 >= objArr.length) {
            return false;
        }
        while (i3 >= 0) {
            cpg cpgVar2 = (cpg) objArr[i3];
            if (v(cpgVar2) && p(cpgVar2, aonjVar)) {
                return true;
            }
            i3--;
        }
        return false;
    }

    private static final boolean E(cpg cpgVar, aonj aonjVar) {
        cfc cfcVar = new cfc(new cpg[16]);
        if (!((cmv) cpgVar).t.D) {
            cwh.d("visitChildren called on an unattached node");
        }
        cfc cfcVar2 = new cfc(new cmv[16]);
        cmv cmvVar = ((cmv) cpgVar).t;
        cmv cmvVar2 = cmvVar.x;
        if (cmvVar2 == null) {
            cfo.F(cfcVar2, cmvVar);
        } else {
            cfcVar2.n(cmvVar2);
        }
        while (true) {
            int i = cfcVar2.b;
            if (i == 0) {
                break;
            }
            cmv cmvVarX = (cmv) cfcVar2.c(i - 1);
            if ((cmvVarX.v & 1024) == 0) {
                cfo.F(cfcVar2, cmvVarX);
            } else {
                while (cmvVarX != null) {
                    if ((cmvVarX.u & 1024) != 0) {
                        cfc cfcVar3 = null;
                        while (cmvVarX != null) {
                            if (cmvVarX instanceof cpg) {
                                cfcVar.n((cpg) cmvVarX);
                            } else if ((cmvVarX.u & 1024) != 0 && (cmvVarX instanceof dap)) {
                                int i2 = 0;
                                for (cmv cmvVar3 = ((dap) cmvVarX).F; cmvVar3 != null; cmvVar3 = cmvVar3.x) {
                                    if ((cmvVar3.u & 1024) != 0) {
                                        i2++;
                                        if (i2 == 1) {
                                            cmvVarX = cmvVar3;
                                        } else {
                                            if (cfcVar3 == null) {
                                                cfcVar3 = new cfc(new cmv[16]);
                                            }
                                            if (cmvVarX != null) {
                                                cfcVar3.n(cmvVarX);
                                            }
                                            cfcVar3.n(cmvVar3);
                                            cmvVarX = null;
                                        }
                                    }
                                }
                                if (i2 != 1) {
                                }
                            }
                            cmvVarX = cfo.x(cfcVar3);
                        }
                        break;
                    }
                    cmvVarX = cmvVarX.x;
                }
            }
        }
        cfcVar.j(cph.a);
        java.lang.Object[] objArr = cfcVar.a;
        int i3 = cfcVar.b;
        for (int i4 = 0; i4 < i3; i4++) {
            cpg cpgVar2 = (cpg) objArr[i4];
            if (v(cpgVar2) && q(cpgVar2, aonjVar)) {
                return true;
            }
        }
        return false;
    }

    private static final dbk F(dbk dbkVar, dbk dbkVar2) {
        while (dbkVar2.k() != null && dbkVar2.k() != dbkVar) {
            dbkVar2 = dbkVar2.k();
            if (dbkVar2 == null) {
                aooh.g();
            }
        }
        if (dbkVar2.k() != dbkVar) {
            return null;
        }
        return dbkVar2;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: aois */
    private static final cpg G(cpg cpgVar) throws aois {
        cpg cpgVarT = t(cpgVar);
        if (cpgVarT != null) {
            return cpgVarT;
        }
        throw new java.lang.IllegalArgumentException("ActiveParent with no focused child");
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0037  */
    private static final int H(cpg cpgVar, int i) {
        int i2 = 1;
        if (!cpgVar.c) {
            cpgVar.c = true;
            try {
                defpackage.cow cowVarB = cpgVar.b();
                defpackage.coh cohVar = new defpackage.coh(i);
                cou couVar = cfo.C(cpgVar).F;
                cpg cpgVarB = couVar.b();
                ((defpackage.cox) cowVarB).j.a(cohVar);
                cpg cpgVarB2 = couVar.b();
                if (cohVar.b) {
                    i2 = 2;
                } else if (cpgVarB != cpgVarB2 && cpgVarB2 != null) {
                    if (defpackage.coz.c == defpackage.coz.b) {
                        i2 = 2;
                    } else {
                        i2 = 3;
                    }
                }
            } finally {
                cpgVar.c = false;
            }
        }
        return i2;
    }

    static void a(android.app.appsearch.SearchSpec.Builder builder, java.util.List list) {
        builder.addFilterDocumentIds(list);
    }

    static void b(android.app.appsearch.SearchSpec.Builder builder, java.util.List list) {
        builder.addInformationalRankingExpressions(list);
    }

    static void c(android.app.appsearch.SearchSpec.Builder builder, defpackage.qt qtVar) {
        if (qtVar.h()) {
            builder.setListFilterMatchScoreExpressionFunctionEnabled(true);
        }
    }

    static void d(android.app.appsearch.SearchSpec.Builder builder, boolean z) {
        builder.setScorablePropertyRankingEnabled(z);
    }

    public static java.lang.Object e(java.lang.String str, defpackage.abd abdVar) {
        try {
            if (android.util.Log.isLoggable("CarApp", 3)) {
                android.util.Log.d("CarApp", a.bk(str, "Dispatching call ", " to host"));
            }
            return abdVar.a();
        } catch (java.lang.SecurityException e) {
            throw e;
        } catch (java.lang.RuntimeException e2) {
            throw new defpackage.tx(a.bk(str, "Remote ", " call failed"), e2);
        }
    }

    public static void f(androidx.car.app.IOnDoneCallback iOnDoneCallback, java.lang.String str, defpackage.abc abcVar) {
        defpackage.abn.b(new defpackage.ac((java.lang.Object) iOnDoneCallback, (java.lang.Object) str, (java.lang.Object) abcVar, 4, (short[]) null));
    }

    public static void g(ems emsVar, java.lang.String str, defpackage.abc abcVar) {
        defpackage.abn.b(new defpackage.ac((java.lang.Object) emsVar, (java.lang.Object) abcVar, (java.lang.Object) str, 3, (char[]) null));
    }

    public static void h(ems emsVar, androidx.car.app.IOnDoneCallback iOnDoneCallback, java.lang.String str, defpackage.abc abcVar) {
        defpackage.abn.b(new defpackage.abb(emsVar, iOnDoneCallback, str, abcVar, 0));
    }

    public static void i(java.lang.String str, defpackage.abd abdVar) {
        try {
            e(str, abdVar);
        } catch (android.os.RemoteException e) {
            android.util.Log.e("CarApp.Dispatch", "Host unresponsive when dispatching call ".concat(str), e);
        }
    }

    public static void j(androidx.car.app.IOnDoneCallback iOnDoneCallback, java.lang.String str, java.lang.Throwable th) {
        i(java.lang.String.valueOf(str).concat(" onFailure"), new defpackage.aba(iOnDoneCallback, th, str, 2));
    }

    public static void k(androidx.car.app.IOnDoneCallback iOnDoneCallback, java.lang.String str, java.lang.Object obj) {
        i(str.concat(" onSuccess"), new defpackage.aba(iOnDoneCallback, obj, str, 0));
    }

    public static final cmw l(cmw cmwVar, float f, boolean z) {
        return cmwVar.a(new defpackage.awj(f, z));
    }

    public static final boolean m(long j, int i, int i2) {
        if (i <= dpd.b(j) && dpd.d(j) <= i) {
            int iC = dpd.c(j);
            if (i2 <= dpd.a(j) && iC <= i2) {
                return true;
            }
        }
        return false;
    }

    public static /* synthetic */ cmw n(cwk cwkVar, float f, float f2, int i) {
        if ((i & 4) != 0) {
            f2 = Float.NaN;
        }
        if ((i & 2) != 0) {
            f = Float.NaN;
        }
        return new defpackage.avt(cwkVar, f, f2);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: aois */
    public static final boolean p(cpg cpgVar, aonj aonjVar) throws aois {
        int iOrdinal = cpgVar.e().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                cpg cpgVarT = t(cpgVar);
                if (cpgVarT == null) {
                    throw new java.lang.IllegalStateException("ActiveParent must have a focusedChild");
                }
                int iOrdinal2 = cpgVarT.e().ordinal();
                if (iOrdinal2 != 0) {
                    if (iOrdinal2 != 1) {
                        if (iOrdinal2 != 2) {
                            if (iOrdinal2 != 3) {
                                throw new aois();
                            }
                            throw new java.lang.IllegalStateException("ActiveParent must have a focusedChild");
                        }
                    } else if (!p(cpgVarT, aonjVar) && !C(cpgVar, cpgVarT, 2, aonjVar) && (!((defpackage.cox) cpgVarT.b()).a || !((java.lang.Boolean) aonjVar.a(cpgVarT)).booleanValue())) {
                        return false;
                    }
                }
                return C(cpgVar, cpgVarT, 2, aonjVar);
            }
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    throw new aois();
                }
                if (!D(cpgVar, aonjVar) && (!((defpackage.cox) cpgVar.b()).a || !((java.lang.Boolean) aonjVar.a(cpgVar)).booleanValue())) {
                    return false;
                }
            }
            return true;
        }
        return D(cpgVar, aonjVar);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: aois */
    public static final boolean q(cpg cpgVar, aonj aonjVar) throws aois {
        int iOrdinal = cpgVar.e().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                cpg cpgVarT = t(cpgVar);
                if (cpgVarT != null) {
                    return q(cpgVarT, aonjVar) || C(cpgVar, cpgVarT, 1, aonjVar);
                }
                throw new java.lang.IllegalStateException("ActiveParent must have a focusedChild");
            }
            if (iOrdinal != 2) {
                if (iOrdinal == 3) {
                    return ((defpackage.cox) cpgVar.b()).a ? ((java.lang.Boolean) aonjVar.a(cpgVar)).booleanValue() : E(cpgVar, aonjVar);
                }
                throw new aois();
            }
        }
        return E(cpgVar, aonjVar);
    }

    public static final boolean r(cpg cpgVar, cpg cpgVar2, int i, aonj aonjVar) {
        cmv cmvVar;
        dce dceVar;
        if (cpgVar.e() != cpe.b) {
            throw new java.lang.IllegalStateException("This function should only be used within a parent that has focus.");
        }
        cfc cfcVar = new cfc(new cpg[16]);
        if (!((cmv) cpgVar).t.D) {
            cwh.d("visitChildren called on an unattached node");
        }
        cfc cfcVar2 = new cfc(new cmv[16]);
        cmv cmvVar2 = ((cmv) cpgVar).t;
        cmv cmvVar3 = cmvVar2.x;
        if (cmvVar3 == null) {
            cfo.F(cfcVar2, cmvVar2);
        } else {
            cfcVar2.n(cmvVar3);
        }
        while (true) {
            int i2 = cfcVar2.b;
            cmvVar = null;
            if (i2 == 0) {
                break;
            }
            cmv cmvVarX = (cmv) cfcVar2.c(i2 - 1);
            if ((cmvVarX.v & 1024) == 0) {
                cfo.F(cfcVar2, cmvVarX);
            } else {
                while (cmvVarX != null) {
                    if ((cmvVarX.u & 1024) != 0) {
                        cfc cfcVar3 = null;
                        while (cmvVarX != null) {
                            if (cmvVarX instanceof cpg) {
                                cfcVar.n((cpg) cmvVarX);
                            } else if ((cmvVarX.u & 1024) != 0 && (cmvVarX instanceof dap)) {
                                int i3 = 0;
                                for (cmv cmvVar4 = ((dap) cmvVarX).F; cmvVar4 != null; cmvVar4 = cmvVar4.x) {
                                    if ((cmvVar4.u & 1024) != 0) {
                                        i3++;
                                        if (i3 == 1) {
                                            cmvVarX = cmvVar4;
                                        } else {
                                            if (cfcVar3 == null) {
                                                cfcVar3 = new cfc(new cmv[16]);
                                            }
                                            if (cmvVarX != null) {
                                                cfcVar3.n(cmvVarX);
                                            }
                                            cfcVar3.n(cmvVar4);
                                            cmvVarX = null;
                                        }
                                    }
                                }
                                if (i3 != 1) {
                                }
                            }
                            cmvVarX = cfo.x(cfcVar3);
                        }
                        break;
                    }
                    cmvVarX = cmvVarX.x;
                }
            }
        }
        cfcVar.j(cph.a);
        if (!a.x(i, 1)) {
            if (!a.x(i, 2)) {
                throw new java.lang.IllegalStateException("This function should only be used for 1-D focus search");
            }
            aopq aopqVarC = aooc.C(0, cfcVar.b);
            int i4 = ((aopo) aopqVarC).a;
            int i5 = ((aopo) aopqVarC).b;
            if (i4 <= i5) {
                boolean zN = false;
                while (true) {
                    if (zN) {
                        cpg cpgVar3 = (cpg) cfcVar.a[i5];
                        if (v(cpgVar3) && p(cpgVar3, aonjVar)) {
                            return true;
                        }
                    }
                    zN |= aooh.n(cfcVar.a[i5], cpgVar2);
                    if (i5 == i4) {
                        break;
                    }
                    i5--;
                }
            }
            return a.x(i, 1) ? false : false;
        }
        aopq aopqVarC2 = aooc.C(0, cfcVar.b);
        int i6 = ((aopo) aopqVarC2).a;
        int i7 = ((aopo) aopqVarC2).b;
        if (i6 <= i7) {
            boolean zN2 = false;
            while (true) {
                if (zN2) {
                    cpg cpgVar4 = (cpg) cfcVar.a[i6];
                    if (v(cpgVar4) && q(cpgVar4, aonjVar)) {
                        return true;
                    }
                }
                zN2 |= aooh.n(cfcVar.a[i6], cpgVar2);
                if (i6 == i7) {
                    break;
                }
                i6++;
            }
        }
        if (a.x(i, 1) && ((defpackage.cox) cpgVar.b()).a) {
            if (!((cmv) cpgVar).t.D) {
                cwh.d("visitAncestors called on an unattached node");
            }
            cmv cmvVar5 = ((cmv) cpgVar).t.w;
            dbk dbkVarA = cfo.A(cpgVar);
            loop5: while (dbkVarA != null) {
                if ((dbkVarA.v.f.v & 1024) != 0) {
                    while (cmvVar5 != null) {
                        if ((cmvVar5.u & 1024) != 0) {
                            cmv cmvVarX2 = cmvVar5;
                            cfc cfcVar4 = null;
                            while (cmvVarX2 != null) {
                                if (cmvVarX2 instanceof cpg) {
                                    cmvVar = cmvVarX2;
                                    break loop5;
                                }
                                if ((cmvVarX2.u & 1024) != 0 && (cmvVarX2 instanceof dap)) {
                                    int i8 = 0;
                                    for (cmv cmvVar6 = ((dap) cmvVarX2).F; cmvVar6 != null; cmvVar6 = cmvVar6.x) {
                                        if ((cmvVar6.u & 1024) != 0) {
                                            i8++;
                                            if (i8 == 1) {
                                                cmvVarX2 = cmvVar6;
                                            } else {
                                                if (cfcVar4 == null) {
                                                    cfcVar4 = new cfc(new cmv[16]);
                                                }
                                                if (cmvVarX2 != null) {
                                                    cfcVar4.n(cmvVarX2);
                                                }
                                                cfcVar4.n(cmvVar6);
                                                cmvVarX2 = null;
                                            }
                                        }
                                    }
                                    if (i8 != 1) {
                                    }
                                }
                                cmvVarX2 = cfo.x(cfcVar4);
                            }
                        }
                        cmvVar5 = cmvVar5.w;
                    }
                }
                dbkVarA = dbkVarA.k();
                cmvVar5 = (dbkVarA == null || (dceVar = dbkVarA.v) == null) ? null : dceVar.e;
            }
            if (cmvVar != null) {
                return ((java.lang.Boolean) aonjVar.a(cpgVar)).booleanValue();
            }
            return false;
        }
    }

    public static final cpg s(cpg cpgVar) {
        cpg cpgVarB = cfo.C(cpgVar).F.b();
        if (cpgVarB == null || !((cmv) cpgVarB).D) {
            return null;
        }
        return cpgVarB;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: aois */
    public static final cpg t(cpg cpgVar) throws aois {
        boolean z = ((cmv) cpgVar).t.D;
        if (!z) {
            return null;
        }
        if (!z) {
            cwh.d("visitChildren called on an unattached node");
        }
        cfc cfcVar = new cfc(new cmv[16]);
        cmv cmvVar = ((cmv) cpgVar).t;
        cmv cmvVar2 = cmvVar.x;
        if (cmvVar2 == null) {
            cfo.F(cfcVar, cmvVar);
        } else {
            cfcVar.n(cmvVar2);
        }
        while (true) {
            int i = cfcVar.b;
            if (i == 0) {
                return null;
            }
            cmv cmvVarX = (cmv) cfcVar.c(i - 1);
            if ((cmvVarX.v & 1024) == 0) {
                cfo.F(cfcVar, cmvVarX);
            } else {
                while (cmvVarX != null) {
                    if ((cmvVarX.u & 1024) != 0) {
                        cfc cfcVar2 = null;
                        while (cmvVarX != null) {
                            if (cmvVarX instanceof cpg) {
                                cpg cpgVar2 = (cpg) cmvVarX;
                                if (((cmv) cpgVar2).t.D) {
                                    int iOrdinal = cpgVar2.e().ordinal();
                                    if (iOrdinal == 0 || iOrdinal == 1 || iOrdinal == 2) {
                                        return cpgVar2;
                                    }
                                    if (iOrdinal != 3) {
                                        throw new aois();
                                    }
                                }
                            } else if ((cmvVarX.u & 1024) != 0 && (cmvVarX instanceof dap)) {
                                int i2 = 0;
                                for (cmv cmvVar3 = ((dap) cmvVarX).F; cmvVar3 != null; cmvVar3 = cmvVar3.x) {
                                    if ((cmvVar3.u & 1024) != 0) {
                                        i2++;
                                        if (i2 == 1) {
                                            cmvVarX = cmvVar3;
                                        } else {
                                            if (cfcVar2 == null) {
                                                cfcVar2 = new cfc(new cmv[16]);
                                            }
                                            if (cmvVarX != null) {
                                                cfcVar2.n(cmvVarX);
                                            }
                                            cfcVar2.n(cmvVar3);
                                            cmvVarX = null;
                                        }
                                    }
                                }
                                if (i2 != 1) {
                                }
                            }
                            cmvVarX = cfo.x(cfcVar2);
                        }
                        break;
                    }
                    cmvVarX = cmvVarX.x;
                }
            }
        }
    }

    public static final cpn u(cpg cpgVar) {
        dck dckVar;
        cxi cxiVarG;
        if (((cmv) cpgVar).D && (dckVar = ((cmv) cpgVar).z) != null && (cxiVarG = den.G(dckVar)) != null) {
            if (true != cxiVarG.u()) {
                cxiVarG = null;
            }
            if (cxiVarG != null) {
                return cpgVar.f(cxiVarG);
            }
        }
        return cpn.a;
    }

    public static final boolean v(cpg cpgVar) {
        dbk dbkVar;
        dck dckVar;
        dbk dbkVar2;
        dck dckVar2 = ((cmv) cpgVar).z;
        return (dckVar2 == null || (dbkVar = dckVar2.w) == null || !dbkVar.am() || (dckVar = ((cmv) cpgVar).z) == null || (dbkVar2 = dckVar.w) == null || !dbkVar2.al() || w(cpgVar)) ? false : true;
    }

    public static final boolean w(cpg cpgVar) {
        dbk dbkVar;
        deg degVar;
        dck dckVar;
        dbk dbkVar2;
        dbk dbkVarF;
        dbk dbkVarF2;
        dck dckVar2 = ((cmv) cpgVar).z;
        if (dckVar2 == null || (dbkVar = dckVar2.w) == null || (degVar = dbkVar.k) == null) {
            return false;
        }
        deg degVar2 = degVar;
        cfc cfcVar = degVar2.F.b;
        if (cfcVar.b == 0) {
            return false;
        }
        dck dckVarO = degVar2.n.o();
        dck dckVar3 = ((cmv) cpgVar).z;
        if (dckVar3 == null || !dckVar3.u()) {
            return false;
        }
        cpn cpnVarQ = dckVarO.q(dckVar3, false);
        int i = cfcVar.b;
        for (int i2 = 0; i2 < i; i2++) {
            cms cmsVar = (cms) cfcVar.a[i2];
            if (((cmv) cmsVar).D && (dckVar = ((cmv) cmsVar).z) != null && (dbkVar2 = dckVar.w) != null && dbkVar2.am() && dbkVar2 != dbkVar) {
                dck dckVarO2 = dbkVar2.o();
                if (dckVarO2.u()) {
                    cpn cpnVarQ2 = dckVarO.q(dckVarO2, true);
                    if (!cpnVarQ2.i() && cpnVarQ2.b <= cpnVarQ.b && cpnVarQ2.d >= cpnVarQ.d && cpnVarQ2.c <= cpnVarQ.c && cpnVarQ2.e >= cpnVarQ.e) {
                        int i3 = 0;
                        for (dbk dbkVarK = dbkVar; dbkVarK != null; dbkVarK = dbkVarK.k()) {
                            i3++;
                        }
                        int i4 = 0;
                        for (dbk dbkVarK2 = dbkVar2; dbkVarK2 != null; dbkVarK2 = dbkVarK2.k()) {
                            i4++;
                        }
                        dbk dbkVarK3 = dbkVar;
                        while (true) {
                            if (i3 <= i4) {
                                break;
                            }
                            dbkVarK3 = dbkVarK3 != null ? dbkVarK3.k() : null;
                            i3--;
                        }
                        dbk dbkVarK4 = dbkVar2;
                        while (i4 > i3) {
                            dbkVarK4 = dbkVarK4 != null ? dbkVarK4.k() : null;
                            i4--;
                        }
                        while (dbkVarK3 != null && dbkVarK4 != null && dbkVarK3 != dbkVarK4) {
                            dbkVarK3 = dbkVarK3.k();
                            dbkVarK4 = dbkVarK4.k();
                        }
                        dbk dbkVar3 = dbkVarK3 == dbkVarK4 ? dbkVarK3 : null;
                        if (dbkVar3 != null && dbkVar3 != dbkVar2 && dbkVar3 != dbkVar && (dbkVarF = F(dbkVar3, dbkVar)) != null && (dbkVarF2 = F(dbkVar3, dbkVar2)) != null) {
                            cfc cfcVarI = dbkVar3.i();
                            int i5 = cfcVarI.b;
                            int i6 = -1;
                            int i7 = -1;
                            for (int i8 = 0; i8 < i5; i8++) {
                                dbk dbkVar4 = (dbk) cfcVarI.a[i8];
                                if (dbkVar4 == dbkVarF) {
                                    i6 = i8;
                                }
                                if (dbkVar4 == dbkVarF2) {
                                    i7 = i8;
                                }
                                if (i6 >= 0 && i7 >= 0) {
                                    break;
                                }
                            }
                            if (i6 >= 0 && i7 > i6) {
                                return true;
                            }
                        }
                    }
                } else {
                    continue;
                }
            }
        }
        return false;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: aois */
    public static final boolean x(cpg cpgVar) throws aois {
        cfc cfcVar;
        boolean z;
        dce dceVar;
        int i;
        dce dceVar2;
        if (w(cpgVar)) {
            return false;
        }
        cou couVar = cfo.C(cpgVar).F;
        cpg cpgVarB = couVar.b();
        cpe cpeVarE = cpgVar.e();
        int i2 = 1;
        if (cpgVarB == cpgVar) {
            cpgVar.j(cpeVarE, cpeVarE);
            return true;
        }
        if ((cpgVarB == null || cpgVarB.a) && !cpgVar.a && !cfo.C(cpgVar).F.k()) {
            return false;
        }
        if (cpgVarB != null) {
            cfcVar = new cfc(new cpg[16]);
            if (!((cmv) cpgVarB).t.D) {
                cwh.d("visitAncestors called on an unattached node");
            }
            cmv cmvVar = ((cmv) cpgVarB).t.w;
            dbk dbkVarA = cfo.A(cpgVarB);
            while (dbkVarA != null) {
                if ((dbkVarA.v.f.v & 1024) != 0) {
                    while (cmvVar != null) {
                        if ((cmvVar.u & 1024) != 0) {
                            cmv cmvVarX = cmvVar;
                            cfc cfcVar2 = null;
                            while (cmvVarX != null) {
                                if (cmvVarX instanceof cpg) {
                                    cfcVar.n((cpg) cmvVarX);
                                } else if ((cmvVarX.u & 1024) != 0 && (cmvVarX instanceof dap)) {
                                    int i3 = 0;
                                    for (cmv cmvVar2 = ((dap) cmvVarX).F; cmvVar2 != null; cmvVar2 = cmvVar2.x) {
                                        if ((cmvVar2.u & 1024) != 0) {
                                            i3++;
                                            if (i3 == 1) {
                                                cmvVarX = cmvVar2;
                                            } else {
                                                if (cfcVar2 == null) {
                                                    cfcVar2 = new cfc(new cmv[16]);
                                                }
                                                if (cmvVarX != null) {
                                                    cfcVar2.n(cmvVarX);
                                                }
                                                cfcVar2.n(cmvVar2);
                                                cmvVarX = null;
                                            }
                                        }
                                    }
                                    if (i3 != 1) {
                                    }
                                }
                                cmvVarX = cfo.x(cfcVar2);
                            }
                        }
                        cmvVar = cmvVar.w;
                    }
                }
                dbkVarA = dbkVarA.k();
                cmvVar = (dbkVarA == null || (dceVar2 = dbkVarA.v) == null) ? null : dceVar2.e;
            }
        } else {
            cfcVar = null;
        }
        cfc cfcVar3 = new cfc(new cpg[16]);
        cfc cfcVar4 = new cfc(new cpg[16]);
        if (!((cmv) cpgVar).t.D) {
            cwh.d("visitAncestors called on an unattached node");
        }
        cmv cmvVar3 = ((cmv) cpgVar).t.w;
        dbk dbkVarA2 = cfo.A(cpgVar);
        int i4 = 1;
        while (dbkVarA2 != null) {
            if ((dbkVarA2.v.f.v & 1024) != 0) {
                while (cmvVar3 != null) {
                    if ((cmvVar3.u & 1024) != 0) {
                        cmv cmvVarX2 = cmvVar3;
                        cfc cfcVar5 = null;
                        while (cmvVarX2 != null) {
                            if (cmvVarX2 instanceof cpg) {
                                cpg cpgVar2 = (cpg) cmvVarX2;
                                if (aooh.n(cfcVar != null ? java.lang.Boolean.valueOf(cfcVar.m(cpgVar2)) : null, java.lang.Boolean.TRUE)) {
                                    cfcVar3.n(cpgVar2);
                                } else {
                                    cfcVar4.n(cpgVar2);
                                }
                                i4 &= cpgVar2 == cpgVarB ? 0 : i2;
                                i = 0;
                            } else {
                                i = i2;
                            }
                            if (i != 0 && (cmvVarX2.u & 1024) != 0 && (cmvVarX2 instanceof dap)) {
                                cmv cmvVar4 = ((dap) cmvVarX2).F;
                                int i5 = 0;
                                while (cmvVar4 != null) {
                                    if ((cmvVar4.u & 1024) != 0) {
                                        i5++;
                                        if (i5 == i2) {
                                            cmvVarX2 = cmvVar4;
                                        } else {
                                            if (cfcVar5 == null) {
                                                cfcVar5 = new cfc(new cmv[16]);
                                            }
                                            if (cmvVarX2 != null) {
                                                cfcVar5.n(cmvVarX2);
                                            }
                                            cfcVar5.n(cmvVar4);
                                            cmvVarX2 = null;
                                        }
                                    }
                                    cmvVar4 = cmvVar4.x;
                                    i2 = 1;
                                }
                                int i6 = i2;
                                if (i5 == i6) {
                                    i2 = i6;
                                }
                            }
                            cmvVarX2 = cfo.x(cfcVar5);
                            i2 = 1;
                        }
                    }
                    cmvVar3 = cmvVar3.w;
                    i2 = 1;
                }
            }
            dbkVarA2 = dbkVarA2.k();
            if (dbkVarA2 == null || (dceVar = dbkVarA2.v) == null) {
                i2 = 1;
                cmvVar3 = null;
            } else {
                cmvVar3 = dceVar.e;
                i2 = 1;
            }
        }
        if (i4 == 0 || cpgVarB == null) {
            z = false;
        } else {
            z = false;
            if (!y(cpgVarB, false)) {
                return false;
            }
        }
        den.u(cpgVar, new defpackage.bup(cpgVar, 10));
        int iOrdinal = cpgVar.e().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                cfo.C(cpgVar).F.g(cpgVar);
            } else if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    throw new aois();
                }
                cfo.C(cpgVar).F.g(cpgVar);
            }
        }
        if (i4 != 0 && cpgVarB != null) {
            cpgVarB.j(cpe.a, cpe.d);
        }
        if (cfcVar != null) {
            int i7 = cfcVar.b - 1;
            java.lang.Object[] objArr = cfcVar.a;
            if (i7 < objArr.length) {
                while (i7 >= 0) {
                    cpg cpgVar3 = (cpg) objArr[i7];
                    if (couVar.b() != cpgVar) {
                        return z;
                    }
                    cpgVar3.j(cpe.b, cpe.d);
                    i7--;
                }
            }
        }
        int i8 = cfcVar4.b - 1;
        java.lang.Object[] objArr2 = cfcVar4.a;
        if (i8 < objArr2.length) {
            while (i8 >= 0) {
                cpg cpgVar4 = (cpg) objArr2[i8];
                if (couVar.b() != cpgVar) {
                    return z;
                }
                cpgVar4.j(cpgVar4 == cpgVarB ? cpe.a : cpe.d, cpe.b);
                i8--;
            }
        }
        if (couVar.b() != cpgVar) {
            return z;
        }
        cpgVar.j(cpeVarE, cpe.a);
        if (couVar.b() == cpgVar) {
            return true;
        }
        return z;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: aois */
    public static final boolean y(cpg cpgVar, boolean z) throws aois {
        int iOrdinal = cpgVar.e().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                cpg cpgVarT = t(cpgVar);
                if (cpgVarT != null && !y(cpgVarT, z)) {
                    return false;
                }
                cpgVar.j(cpe.b, cpe.d);
            } else {
                if (iOrdinal == 2) {
                    return z;
                }
                if (iOrdinal != 3) {
                    throw new aois();
                }
            }
        }
        return true;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: aois */
    public static final int z(cpg cpgVar, int i) throws aois {
        int iOrdinal = cpgVar.e().ordinal();
        if (iOrdinal == 0) {
            return 1;
        }
        if (iOrdinal == 1) {
            int iZ = z(G(cpgVar), i);
            if (iZ == 1) {
                iZ = 0;
            }
            if (iZ != 0) {
                return iZ;
            }
            if (cpgVar.b) {
                return 1;
            }
            cpgVar.b = true;
            try {
                defpackage.cow cowVarB = cpgVar.b();
                defpackage.coh cohVar = new defpackage.coh(i);
                cou couVar = cfo.C(cpgVar).F;
                cpg cpgVarB = couVar.b();
                ((defpackage.cox) cowVarB).k.a(cohVar);
                cpg cpgVarB2 = couVar.b();
                if (!cohVar.b) {
                    if (cpgVarB == cpgVarB2 || cpgVarB2 == null) {
                        return 1;
                    }
                    if (defpackage.coz.c != defpackage.coz.b) {
                        cpgVar.b = false;
                        return 3;
                    }
                }
            } finally {
                cpgVar.b = false;
            }
        } else if (iOrdinal != 2) {
            if (iOrdinal != 3) {
                throw new aois();
            }
            return 1;
        }
        return 2;
    }
}
