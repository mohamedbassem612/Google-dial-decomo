package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class cfo {
    public static final defpackage.dbk A(defpackage.dao daoVar) {
        defpackage.dck dckVar = daoVar.L().z;
        if (dckVar != null) {
            return dckVar.w;
        }
        defpackage.cwh.b("Cannot obtain node coordinator. Is the Modifier.Node attached?");
        throw new defpackage.aoiq();
    }

    public static final defpackage.dck B(defpackage.dao daoVar, int i) {
        defpackage.dck dckVar = daoVar.L().z;
        if (dckVar == null) {
            defpackage.aooh.g();
        }
        if (dckVar.C() == daoVar) {
            int i2 = defpackage.dcl.a;
            int i3 = i & 128;
            if (((i3 != 0) | ((i & 4194304) != 0)) && (dckVar = dckVar.z) == null) {
                defpackage.aooh.g();
            }
        }
        return dckVar;
    }

    public static final defpackage.dcv C(defpackage.dao daoVar) {
        defpackage.dcv dcvVar = A(daoVar).k;
        if (dcvVar != null) {
            return dcvVar;
        }
        defpackage.cwh.b("This node does not have an owner.");
        throw new defpackage.aoiq();
    }

    public static final defpackage.dpf D(defpackage.dao daoVar) {
        return A(daoVar).r;
    }

    public static final defpackage.bdl E(defpackage.dao daoVar) {
        defpackage.dce dceVar;
        java.lang.Object obj;
        defpackage.cmv cmvVar = (defpackage.cmv) daoVar;
        if (!cmvVar.t.D) {
            defpackage.cwh.d("visitAncestors called on an unattached node");
        }
        defpackage.cmv cmvVar2 = cmvVar.t.w;
        defpackage.dbk dbkVarA = A(daoVar);
        while (dbkVarA != null) {
            if ((dbkVarA.v.f.v & 8388640) != 0) {
                while (cmvVar2 != null) {
                    int i = cmvVar2.u;
                    if ((i & 8388640) != 0) {
                        if ((8388608 & i) != 0) {
                            if (!(cmvVar2 instanceof defpackage.bdl)) {
                                if (cmvVar2 instanceof defpackage.dap) {
                                    cmvVar2 = null;
                                    for (defpackage.cmv cmvVar3 = ((defpackage.dap) cmvVar2).F; cmvVar3 != null; cmvVar3 = cmvVar3.x) {
                                        if (true == (cmvVar3 instanceof defpackage.bdl)) {
                                            cmvVar2 = cmvVar3;
                                        }
                                    }
                                } else {
                                    cmvVar2 = null;
                                }
                            }
                            defpackage.bdl bdlVar = (defpackage.bdl) cmvVar2;
                            if (bdlVar != null) {
                                return bdlVar;
                            }
                            return null;
                        }
                        if ((i & 32) == 0) {
                            continue;
                        } else {
                            if (cmvVar2 instanceof defpackage.dad) {
                                obj = cmvVar2;
                            } else if (cmvVar2 instanceof defpackage.dap) {
                                obj = null;
                                for (defpackage.cmv cmvVar4 = ((defpackage.dap) cmvVar2).F; cmvVar4 != null; cmvVar4 = cmvVar4.x) {
                                    if (true == (cmvVar4 instanceof defpackage.dad)) {
                                        obj = cmvVar4;
                                    }
                                }
                            } else {
                                obj = null;
                            }
                            defpackage.dad dadVar = (defpackage.dad) obj;
                            if (dadVar != null) {
                                defpackage.dac dacVarCN = dadVar.cN();
                                oq oqVar = cwu.a;
                                if (dacVarCN.c(oqVar)) {
                                    return (defpackage.bdl) dadVar.cN().a(oqVar);
                                }
                            } else {
                                continue;
                            }
                        }
                    }
                    cmvVar2 = cmvVar2.w;
                }
            }
            dbkVarA = dbkVarA.k();
            cmvVar2 = (dbkVarA == null || (dceVar = dbkVarA.v) == null) ? null : dceVar.e;
        }
        return null;
    }

    public static final void F(defpackage.cfc cfcVar, defpackage.cmv cmvVar) {
        defpackage.cfc cfcVarJ = A(cmvVar).j();
        int i = cfcVarJ.b - 1;
        java.lang.Object[] objArr = cfcVarJ.a;
        if (i < objArr.length) {
            while (i >= 0) {
                cfcVar.n(((defpackage.dbk) objArr[i]).v.f);
                i--;
            }
        }
    }

    public static final java.lang.Object G(defpackage.dan danVar, defpackage.cbd cbdVar) {
        if (!danVar.L().D) {
            defpackage.cwh.d("Cannot read CompositionLocal because the Modifier node is not currently attached.");
        }
        return A(danVar).F.h(cbdVar);
    }

    public static final defpackage.apkl H(defpackage.dao daoVar) {
        return ((defpackage.deg) C(daoVar)).N;
    }

    public static final int a(java.util.ArrayList arrayList, int i, int i2) {
        int iC = c(arrayList, i, i2);
        return iC < 0 ? -(iC + 1) : iC;
    }

    public static final int b(int[] iArr, int i) {
        int i2 = i * 5;
        return iArr[i2 + 4] + java.lang.Integer.bitCount(iArr[i2 + 1] >> 30);
    }

    public static final int c(java.util.ArrayList arrayList, int i, int i2) {
        int size = arrayList.size() - 1;
        int i3 = 0;
        while (i3 <= size) {
            int i4 = (i3 + size) >>> 1;
            int i5 = ((defpackage.cfh) arrayList.get(i4)).a;
            if (i5 < 0) {
                i5 += i2;
            }
            int iA = defpackage.aooh.a(i5, i);
            if (iA < 0) {
                i3 = i4 + 1;
            } else {
                if (iA <= 0) {
                    return i4;
                }
                size = i4 - 1;
            }
        }
        return -(i3 + 1);
    }

    public static final int d(int[] iArr, int i) {
        int i2 = i * 5;
        return iArr[i2 + 4] + java.lang.Integer.bitCount(iArr[i2 + 1] >> 28);
    }

    public static final defpackage.cfh e(java.util.ArrayList arrayList, int i, int i2) {
        int iC = c(arrayList, i, i2);
        if (iC >= 0) {
            return (defpackage.cfh) arrayList.get(iC);
        }
        return null;
    }

    public static final void f() {
        throw new java.util.ConcurrentModificationException();
    }

    public static final defpackage.can g(defpackage.can canVar) {
        if (true != (canVar instanceof defpackage.can)) {
            canVar = null;
        }
        if (canVar != null) {
            return canVar;
        }
        defpackage.cax.a("Inconsistent composition");
        throw new defpackage.aoiq();
    }

    public static final void h(defpackage.cav cavVar, defpackage.aonn aonnVar) {
        defpackage.aoov.f(aonnVar, 2);
        aonnVar.a(cavVar, 1);
    }

    public static final boolean i(defpackage.cdk cdkVar, defpackage.cdk cdkVar2) {
        return cdkVar == null || !cdkVar.p() || defpackage.aooh.n(cdkVar, cdkVar2) || defpackage.aooh.n(cdkVar.e, cdkVar2.e);
    }

    public static final defpackage.cja j(int i, java.lang.Object obj, defpackage.cav cavVar) {
        java.lang.Object objG = cavVar.g();
        if (objG == defpackage.cau.a) {
            objG = new defpackage.cja(i, true, obj);
            cavVar.w(objG);
        }
        defpackage.cja cjaVar = (defpackage.cja) objG;
        if (!defpackage.aooh.n(cjaVar.b, obj)) {
            java.lang.Object obj2 = cjaVar.b;
            cjaVar.b = obj;
            if (obj2 != null && cjaVar.a) {
                defpackage.cdk cdkVar = cjaVar.d;
                if (cdkVar != null) {
                    cdkVar.a();
                    cjaVar.d = null;
                }
                java.util.List list = cjaVar.c;
                if (list != null) {
                    int size = list.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        ((defpackage.cdk) list.get(i2)).a();
                    }
                    list.clear();
                }
            }
        }
        return cjaVar;
    }

    public static defpackage.cmw k(defpackage.cmw cmwVar, defpackage.cmw cmwVar2) {
        return cmwVar2 != defpackage.cmw.c ? new defpackage.cmq(cmwVar, cmwVar2) : cmwVar;
    }

    public static final defpackage.cmw l(defpackage.cav cavVar, defpackage.cmw cmwVar) {
        if (cmwVar.c(new defpackage.ckc(4))) {
            return cmwVar;
        }
        cavVar.J();
        defpackage.cmw cmwVar2 = (defpackage.cmw) cmwVar.b(defpackage.cmw.c, new defpackage.brg(cavVar, 7));
        cavVar.p();
        return cmwVar2;
    }

    public static final defpackage.cmw m(defpackage.cav cavVar, defpackage.cmw cmwVar) {
        cavVar.u(439770924);
        defpackage.cmw cmwVarL = l(cavVar, cmwVar);
        cavVar.o();
        return cmwVarL;
    }

    public static final boolean o(java.lang.Object obj, java.lang.Object obj2) {
        return obj.getClass() == obj2.getClass();
    }

    public static final int p(long[] jArr, long j) {
        int length = jArr.length - 1;
        int i = 0;
        while (i <= length) {
            int i2 = (i + length) >>> 1;
            long j2 = jArr[i2];
            if (j > j2) {
                i = i2 + 1;
            } else {
                if (j >= j2) {
                    return i2;
                }
                length = i2 - 1;
            }
        }
        return -(i + 1);
    }

    public static final defpackage.cmv q(defpackage.dao daoVar, int i) {
        defpackage.cmv cmvVar = daoVar.L().x;
        if (cmvVar == null || (cmvVar.v & i) == 0) {
            return null;
        }
        while (cmvVar != null) {
            int i2 = cmvVar.u;
            if ((i2 & 2) != 0) {
                return null;
            }
            if ((i2 & i) != 0) {
                return cmvVar;
            }
            cmvVar = cmvVar.x;
        }
        return null;
    }

    public static final int r(defpackage.cmu cmuVar, defpackage.cmu cmuVar2) {
        if (defpackage.aooh.n(cmuVar, cmuVar2)) {
            return 2;
        }
        return !o(cmuVar, cmuVar2) ? 0 : 1;
    }

    public static final boolean s(defpackage.dbk dbkVar) {
        if (dbkVar.j == null) {
            return false;
        }
        defpackage.dbk dbkVarK = dbkVar.k();
        return (dbkVarK != null ? dbkVarK.j : null) == null || dbkVar.w.b;
    }

    public static /* synthetic */ java.lang.String t(int i) {
        if (i == 1) {
            return "Measuring";
        }
        if (i == 2) {
            return "LookaheadMeasuring";
        }
        if (i == 3) {
            return "LayingOut";
        }
        if (i != 4) {
            return i != 5 ? "null" : "Idle";
        }
        return "LookaheadLayingOut";
    }

    public static final void u(defpackage.dbd dbdVar) {
        A(dbdVar).H();
    }

    public static final void v(defpackage.dbd dbdVar, defpackage.aonj aonjVar) {
        defpackage.dck dckVar;
        if (!dbdVar.L().D || (dckVar = B(dbdVar, 2).z) == null) {
            return;
        }
        dckVar.ay(aonjVar, true);
    }

    public static final void w(defpackage.dat datVar) {
        if (datVar.L().D) {
            B(datVar, 1).am();
        }
    }

    public static final defpackage.cmv x(defpackage.cfc cfcVar) {
        int i;
        if (cfcVar == null || (i = cfcVar.b) == 0) {
            return null;
        }
        return (defpackage.cmv) cfcVar.c(i - 1);
    }

    public static final defpackage.cxi y(defpackage.dao daoVar) {
        if (!daoVar.L().D) {
            defpackage.cwh.d("Cannot get LayoutCoordinates, Modifier.Node is not attached.");
        }
        defpackage.dck dckVarB = B(daoVar, 2);
        if (!dckVarB.u()) {
            defpackage.cwh.d("LayoutCoordinates is not attached.");
        }
        return dckVarB;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final defpackage.dbd z(defpackage.cmv cmvVar) {
        if ((cmvVar.u & 2) != 0) {
            if (cmvVar instanceof defpackage.dbd) {
                return (defpackage.dbd) cmvVar;
            }
            if (cmvVar instanceof defpackage.dap) {
                defpackage.cmv cmvVar2 = ((defpackage.dap) cmvVar).F;
                while (cmvVar2 != 0) {
                    if (cmvVar2 instanceof defpackage.dbd) {
                        return (defpackage.dbd) cmvVar2;
                    }
                    cmvVar2 = (!(cmvVar2 instanceof defpackage.dap) || (cmvVar2.u & 2) == 0) ? cmvVar2.x : ((defpackage.dap) cmvVar2).F;
                }
            }
        }
        return null;
    }
}
