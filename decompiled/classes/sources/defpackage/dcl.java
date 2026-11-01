package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class dcl {
    public static final /* synthetic */ int a = 0;
    private static final defpackage.ado b;

    static {
        defpackage.ado adoVar = defpackage.adp.a;
        b = new defpackage.ado(6);
    }

    public static final int a(defpackage.cmu cmuVar) {
        int i = true == (cmuVar instanceof defpackage.cxm) ? 3 : 1;
        if (cmuVar instanceof defpackage.cnz) {
            i |= 4;
        }
        if (cmuVar instanceof defpackage.dif) {
            i |= 8;
        }
        if (cmuVar instanceof cvs) {
            i |= 16;
        }
        if ((cmuVar instanceof defpackage.daa) || (cmuVar instanceof defpackage.dae)) {
            i |= 32;
        }
        if (cmuVar instanceof defpackage.col) {
            i |= 4096;
        }
        if (cmuVar instanceof defpackage.cor) {
            i |= 2048;
        }
        if (cmuVar instanceof defpackage.cyo) {
            i |= 256;
        }
        if (cmuVar instanceof defpackage.cyz) {
            i |= 64;
        }
        if (cmuVar instanceof defpackage.cyt) {
            i |= 4194304;
        }
        if (cmuVar instanceof defpackage.cyv) {
            i |= 128;
        }
        return cmuVar instanceof defpackage.dhd ? i | 524288 : i;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0053  */
    /* JADX WARN: Code duplicated, block: B:41:0x0059  */
    /* JADX WARN: Code duplicated, block: B:44:0x005f  */
    /* JADX WARN: Code duplicated, block: B:47:0x0065  */
    /* JADX WARN: Code duplicated, block: B:50:0x006b  */
    /* JADX WARN: Code duplicated, block: B:53:0x0071  */
    /* JADX WARN: Code duplicated, block: B:56:0x0077  */
    /* JADX WARN: Code duplicated, block: B:59:0x007d  */
    /* JADX WARN: Code duplicated, block: B:62:0x0085  */
    /* JADX WARN: Code duplicated, block: B:65:0x008c  */
    /* JADX WARN: Code duplicated, block: B:68:0x0093  */
    /* JADX WARN: Code duplicated, block: B:71:0x009a  */
    /* JADX WARN: Code duplicated, block: B:74:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:77:0x00a8  */
    public static final int b(defpackage.cmv cmvVar) {
        int i;
        int i2 = cmvVar.u;
        if (i2 != 0) {
            return i2;
        }
        defpackage.ado adoVar = b;
        java.lang.Class<?> cls = cmvVar.getClass();
        int iA = adoVar.a(cls);
        if (iA >= 0) {
            return adoVar.c[iA];
        }
        int i3 = true == (cmvVar instanceof defpackage.dbd) ? 3 : 1;
        if (cmvVar instanceof defpackage.dat) {
            i3 |= 4;
        }
        if (cmvVar instanceof defpackage.ddc) {
            i3 |= 8;
        }
        if (cmvVar instanceof defpackage.ddb) {
            i3 |= 16;
        }
        if (cmvVar instanceof defpackage.dad) {
            i3 |= 32;
        }
        if (cmvVar instanceof defpackage.dcz) {
            i3 |= 64;
        }
        if (!(cmvVar instanceof defpackage.cyu)) {
            if (cmvVar instanceof defpackage.dbb) {
                i = 4194432;
            } else if (cmvVar instanceof defpackage.dbz) {
                i3 |= 128;
            }
            if (cmvVar instanceof defpackage.dau) {
                i3 |= 256;
            }
            if (cmvVar instanceof defpackage.cwq) {
                i3 |= 512;
            }
            if (cmvVar instanceof defpackage.cpg) {
                i3 |= 1024;
            }
            if (cmvVar instanceof defpackage.coy) {
                i3 |= 2048;
            }
            if (cmvVar instanceof defpackage.com) {
                i3 |= 4096;
            }
            if (cmvVar instanceof defpackage.cuk) {
                i3 |= 8192;
            }
            if (cmvVar instanceof defpackage.dea) {
                i3 |= 16384;
            }
            if (cmvVar instanceof defpackage.dan) {
                i3 |= 32768;
            }
            if (cmvVar instanceof defpackage.cum) {
                i3 |= 131072;
            }
            if (cmvVar instanceof defpackage.ddh) {
                i3 |= 262144;
            }
            if (cmvVar instanceof defpackage.dhd) {
                i3 |= 524288;
            }
            if (cmvVar instanceof defpackage.ddj) {
                i3 |= 1048576;
            }
            if (cmvVar instanceof defpackage.cug) {
                i3 |= 2097152;
            }
            if (cmvVar instanceof defpackage.bdl) {
                i3 |= 8388608;
            }
            adoVar.h(cls, i3);
            return i3;
        }
        i = 4194304;
        i3 |= i;
        if (cmvVar instanceof defpackage.dau) {
            i3 |= 256;
        }
        if (cmvVar instanceof defpackage.cwq) {
            i3 |= 512;
        }
        if (cmvVar instanceof defpackage.cpg) {
            i3 |= 1024;
        }
        if (cmvVar instanceof defpackage.coy) {
            i3 |= 2048;
        }
        if (cmvVar instanceof defpackage.com) {
            i3 |= 4096;
        }
        if (cmvVar instanceof defpackage.cuk) {
            i3 |= 8192;
        }
        if (cmvVar instanceof defpackage.dea) {
            i3 |= 16384;
        }
        if (cmvVar instanceof defpackage.dan) {
            i3 |= 32768;
        }
        if (cmvVar instanceof defpackage.cum) {
            i3 |= 131072;
        }
        if (cmvVar instanceof defpackage.ddh) {
            i3 |= 262144;
        }
        if (cmvVar instanceof defpackage.dhd) {
            i3 |= 524288;
        }
        if (cmvVar instanceof defpackage.ddj) {
            i3 |= 1048576;
        }
        if (cmvVar instanceof defpackage.cug) {
            i3 |= 2097152;
        }
        if (cmvVar instanceof defpackage.bdl) {
            i3 |= 8388608;
        }
        adoVar.h(cls, i3);
        return i3;
    }

    public static final int c(defpackage.cmv cmvVar) {
        if (!(cmvVar instanceof defpackage.dap)) {
            return b(cmvVar);
        }
        defpackage.dap dapVar = (defpackage.dap) cmvVar;
        int iC = dapVar.E;
        for (defpackage.cmv cmvVar2 = dapVar.F; cmvVar2 != null; cmvVar2 = cmvVar2.x) {
            iC |= c(cmvVar2);
        }
        return iC;
    }

    public static final void d(defpackage.cmv cmvVar) {
        if (!cmvVar.D) {
            defpackage.cwh.d("autoInvalidateInsertedNode called on unattached node");
        }
        e(cmvVar, -1, 1);
    }

    public static final void e(defpackage.cmv cmvVar, int i, int i2) {
        if (!(cmvVar instanceof defpackage.dap)) {
            h(cmvVar, cmvVar.u & i, i2);
            return;
        }
        defpackage.dap dapVar = (defpackage.dap) cmvVar;
        int i3 = dapVar.E;
        h(cmvVar, i3 & i, i2);
        int i4 = i & (~i3);
        for (defpackage.cmv cmvVar2 = dapVar.F; cmvVar2 != null; cmvVar2 = cmvVar2.x) {
            e(cmvVar2, i4, i2);
        }
    }

    public static final void f(defpackage.cmv cmvVar) {
        if (!cmvVar.D) {
            defpackage.cwh.d("autoInvalidateRemovedNode called on unattached node");
        }
        e(cmvVar, -1, 2);
    }

    public static final void g(defpackage.cmv cmvVar) {
        if (!cmvVar.D) {
            defpackage.cwh.d("autoInvalidateUpdatedNode called on unattached node");
        }
        e(cmvVar, -1, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final void h(defpackage.cmv cmvVar, int i, int i2) {
        if (i2 != 0 || cmvVar.cO()) {
            if ((i & 2) != 0 && (cmvVar instanceof defpackage.dbd)) {
                defpackage.cfo.A((defpackage.dbd) cmvVar).H();
                if (i2 == 2) {
                    defpackage.cfo.B(cmvVar, 2).ar();
                }
            }
            if ((i & 128) != 0 && i2 != 2) {
                defpackage.cfo.A(cmvVar).H();
            }
            if ((4194304 & i) != 0 && i2 != 2) {
                defpackage.cfo.A(cmvVar).V(false);
            }
            if ((i & 256) != 0 && (cmvVar instanceof defpackage.dau)) {
                if (i2 == 1) {
                    defpackage.dbk dbkVarA = defpackage.cfo.A(cmvVar);
                    dbkVarA.ab(dbkVarA.C + 1);
                } else if (i2 == 2) {
                    defpackage.dbk dbkVarA2 = defpackage.cfo.A(cmvVar);
                    dbkVarA2.ab(dbkVarA2.C - 1);
                }
                if (i2 != 2) {
                    defpackage.dbk dbkVarA3 = defpackage.cfo.A(cmvVar);
                    if (dbkVarA3.C != 0 && !dbkVarA3.ah() && !dbkVarA3.ak() && !dbkVarA3.B) {
                        defpackage.dbn.a(dbkVarA3).E(dbkVarA3);
                    }
                }
            }
            if ((i & 4) != 0 && (cmvVar instanceof defpackage.dat)) {
                defpackage.cfo.w((defpackage.dat) cmvVar);
            }
            if ((i & 8) != 0 && (cmvVar instanceof defpackage.ddc)) {
                defpackage.cfo.A(cmvVar).o = true;
            }
            if ((i & 64) != 0 && (cmvVar instanceof defpackage.dcz)) {
                defpackage.dbo dboVar = defpackage.cfo.A((defpackage.dcz) cmvVar).w;
                dboVar.o.q = true;
                defpackage.dbv dbvVar = dboVar.p;
                if (dbvVar != null) {
                    dbvVar.t = true;
                }
            }
            if ((i & 2048) != 0 && (cmvVar instanceof defpackage.coy)) {
                defpackage.coy coyVar = (defpackage.coy) cmvVar;
                dal.b = null;
                coyVar.c(dal.a);
                if (dal.b != null) {
                    if (!coyVar.L().D) {
                        defpackage.cwh.d("visitChildren called on an unattached node");
                    }
                    defpackage.cfc cfcVar = new defpackage.cfc(new defpackage.cmv[16]);
                    defpackage.cmv cmvVar2 = coyVar.L().x;
                    if (cmvVar2 == null) {
                        defpackage.cfo.F(cfcVar, coyVar.L());
                    } else {
                        cfcVar.n(cmvVar2);
                    }
                    while (true) {
                        int i3 = cfcVar.b;
                        if (i3 == 0) {
                            break;
                        }
                        defpackage.cmv cmvVarX = (defpackage.cmv) cfcVar.c(i3 - 1);
                        if ((cmvVarX.v & 1024) == 0) {
                            defpackage.cfo.F(cfcVar, cmvVarX);
                        } else {
                            while (cmvVarX != null) {
                                if ((cmvVarX.u & 1024) != 0) {
                                    defpackage.cfc cfcVar2 = null;
                                    while (cmvVarX != null) {
                                        if (cmvVarX instanceof defpackage.cpg) {
                                            defpackage.cpg cpgVar = (defpackage.cpg) cmvVarX;
                                            defpackage.cop copVar = ((defpackage.deg) defpackage.cfo.C(cpgVar)).F.d;
                                            if (((defpackage.ady) copVar.d).j(cpgVar)) {
                                                copVar.a();
                                            }
                                        } else if ((cmvVarX.u & 1024) != 0 && (cmvVarX instanceof defpackage.dap)) {
                                            int i4 = 0;
                                            for (defpackage.cmv cmvVar3 = ((defpackage.dap) cmvVarX).F; cmvVar3 != null; cmvVar3 = cmvVar3.x) {
                                                if ((cmvVar3.u & 1024) != 0) {
                                                    i4++;
                                                    if (i4 == 1) {
                                                        cmvVarX = cmvVar3;
                                                    } else {
                                                        if (cfcVar2 == null) {
                                                            cfcVar2 = new defpackage.cfc(new defpackage.cmv[16]);
                                                        }
                                                        if (cmvVarX != null) {
                                                            cfcVar2.n(cmvVarX);
                                                        }
                                                        cfcVar2.n(cmvVar3);
                                                        cmvVarX = null;
                                                    }
                                                }
                                            }
                                            if (i4 != 1) {
                                            }
                                        }
                                        cmvVarX = defpackage.cfo.x(cfcVar2);
                                    }
                                    break;
                                }
                                cmvVarX = cmvVarX.x;
                            }
                        }
                    }
                }
            }
            if ((i & 4096) != 0 && (cmvVar instanceof defpackage.com)) {
                defpackage.com comVar = (defpackage.com) cmvVar;
                defpackage.cop copVar2 = ((defpackage.deg) defpackage.cfo.C(comVar)).F.d;
                if (((defpackage.ady) copVar2.e).j(comVar)) {
                    copVar2.a();
                }
            }
            if ((i & 2097152) != 0 && (cmvVar instanceof defpackage.cug) && i2 == 2) {
                ((defpackage.cug) cmvVar).H();
            }
        }
    }
}
