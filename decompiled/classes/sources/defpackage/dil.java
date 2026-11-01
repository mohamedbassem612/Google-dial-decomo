package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class dil {
    private static final defpackage.cpn a = new defpackage.cpn(0.0f, 0.0f, 10.0f, 10.0f);

    public static final boolean a(defpackage.dij dijVar) {
        defpackage.dck dckVarF = dijVar.f();
        if (dckVarF != null && dckVarF.aA()) {
            return true;
        }
        defpackage.die dieVar = dijVar.b;
        return dieVar.f(defpackage.din.q) || dieVar.f(defpackage.din.p);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0056 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:20:0x0058 A[LOOP:0: B:9:0x0020->B:20:0x0058, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:23:0x0067  */
    /* JADX WARN: Code duplicated, block: B:25:0x006b  */
    /* JADX WARN: Code duplicated, block: B:27:0x0070  */
    /* JADX WARN: Code duplicated, block: B:29:0x0074  */
    /* JADX WARN: Code duplicated, block: B:32:0x007a  */
    /* JADX WARN: Code duplicated, block: B:51:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:53:0x00b9 A[LOOP:2: B:24:0x0069->B:53:0x00b9, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:56:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:58:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:60:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:62:0x00cf A[LOOP:5: B:57:0x00c4->B:62:0x00cf, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:67:0x005b A[EDGE_INSN: B:67:0x005b->B:21:0x005b BREAK  A[LOOP:0: B:9:0x0020->B:20:0x0058], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:72:0x0078 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:73:0x00bc A[EDGE_INSN: B:73:0x00bc->B:54:0x00bc BREAK  A[LOOP:2: B:24:0x0069->B:53:0x00b9], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:86:0x00d2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:87:0x00d3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:89:? A[RETURN, SYNTHETIC] */
    public static final boolean b(defpackage.dij dijVar) {
        defpackage.dce dceVar;
        java.lang.Object obj;
        defpackage.ddc ddcVar;
        defpackage.cmv cmvVarL;
        defpackage.cmv cmvVar;
        defpackage.cmv cmvVarX;
        defpackage.cfc cfcVar;
        if (a(dijVar)) {
            return false;
        }
        defpackage.die dieVar = dijVar.b;
        if (!dieVar.a) {
            defpackage.adw adwVar = dieVar.c;
            java.lang.Object[] objArr = adwVar.b;
            java.lang.Object[] objArr2 = adwVar.c;
            long[] jArr = adwVar.a;
            int length = jArr.length - 2;
            if (length < 0) {
                dceVar = dijVar.a.v;
                obj = null;
                if ((dceVar.a() & 8) != 0) {
                    loop2: for (cmvVar = dceVar.f; cmvVar != null; cmvVar = cmvVar.x) {
                        if ((cmvVar.u & 8) != 0) {
                            if ((cmvVar.v & 8) != 0) {
                                break;
                                break;
                            }
                        } else {
                            cmvVarX = cmvVar;
                            cfcVar = null;
                            while (cmvVarX != null) {
                                if (cmvVarX instanceof defpackage.ddc) {
                                    obj = cmvVarX;
                                    break loop2;
                                }
                                if ((cmvVarX.u & 8) == 0) {
                                }
                                cmvVarX = defpackage.cfo.x(cfcVar);
                            }
                            if ((cmvVar.v & 8) != 0) {
                                break;
                                break;
                            }
                        }
                    }
                }
                ddcVar = (defpackage.ddc) obj;
                if (ddcVar != null) {
                    return false;
                }
                for (cmvVarL = ddcVar.L(); cmvVarL != null; cmvVarL = cmvVarL.x) {
                    if (!(cmvVarL instanceof defpackage.cms)) {
                        if ((cmvVarL.v & 8) != 0) {
                            return false;
                        }
                    }
                }
                return false;
            }
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i != length) {
                        break;
                        break;
                    }
                    i++;
                } else {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            int i4 = (i << 3) + i3;
                            java.lang.Object obj2 = objArr[i4];
                            java.lang.Object obj3 = objArr2[i4];
                            if (!((defpackage.dip) obj2).c) {
                            }
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    }
                    if (i != length) {
                        break;
                    }
                    i++;
                }
            }
            dceVar = dijVar.a.v;
            obj = null;
            if ((dceVar.a() & 8) != 0) {
                loop2: while (cmvVar != null) {
                    if ((cmvVar.u & 8) != 0) {
                        if ((cmvVar.v & 8) != 0) {
                            break;
                            break;
                        }
                    } else {
                        cmvVarX = cmvVar;
                        cfcVar = null;
                        while (cmvVarX != null) {
                            if (cmvVarX instanceof defpackage.ddc) {
                                obj = cmvVarX;
                                break loop2;
                            }
                            if ((cmvVarX.u & 8) == 0 && (cmvVarX instanceof defpackage.dap)) {
                                int i5 = 0;
                                for (defpackage.cmv cmvVar2 = ((defpackage.dap) cmvVarX).F; cmvVar2 != null; cmvVar2 = cmvVar2.x) {
                                    if ((cmvVar2.u & 8) != 0) {
                                        i5++;
                                        if (i5 == 1) {
                                            cmvVarX = cmvVar2;
                                        } else {
                                            if (cfcVar == null) {
                                                cfcVar = new defpackage.cfc(new defpackage.cmv[16]);
                                            }
                                            if (cmvVarX != null) {
                                                cfcVar.n(cmvVarX);
                                            }
                                            cfcVar.n(cmvVar2);
                                            cmvVarX = null;
                                        }
                                    }
                                }
                                if (i5 != 1) {
                                }
                            }
                            cmvVarX = defpackage.cfo.x(cfcVar);
                        }
                        if ((cmvVar.v & 8) != 0) {
                            break;
                        }
                    }
                }
            }
            ddcVar = (defpackage.ddc) obj;
            if (ddcVar != null) {
                return false;
            }
            while (cmvVarL != null) {
                if (!(cmvVarL instanceof defpackage.cms)) {
                    if ((cmvVarL.v & 8) != 0) {
                        return false;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public static final defpackage.aco c(defpackage.dik dikVar, defpackage.aonj aonjVar) {
        defpackage.aco acoVarA;
        android.os.Trace.beginSection("getAllUncoveredSemanticsNodesToIntObjectMap");
        try {
            defpackage.dij dijVarA = dikVar.a();
            defpackage.dbk dbkVar = dijVarA.a;
            if (dbkVar.am() && dbkVar.al()) {
                defpackage.cpn cpnVarB = dijVarA.b();
                acoVarA = new defpackage.aco(48);
                defpackage.ipc ipcVar = new defpackage.ipc((byte[]) null, (char[]) null, (byte[]) null);
                ipcVar.ac(defpackage.dfd.j(cpnVarB));
                f(dijVarA, acoVarA, aonjVar, dijVarA, new defpackage.ipc((byte[]) null, (char[]) null, (byte[]) null), ipcVar, false);
            } else {
                acoVarA = defpackage.acp.a();
            }
            return acoVarA;
        } finally {
            android.os.Trace.endSection();
        }
    }

    private static final void d(defpackage.aco acoVar, defpackage.dij dijVar, defpackage.dij dijVar2, boolean z) {
        defpackage.dbk dbkVar;
        defpackage.dij dijVarJ = dijVar2.j();
        defpackage.cpn cpnVarB = (dijVarJ == null || (dbkVar = dijVarJ.a) == null || !dbkVar.am()) ? a : dijVarJ.b();
        int i = dijVar.c;
        int i2 = dijVar2.c;
        if (i2 == i) {
            i2 = -1;
        }
        acoVar.g(i2, new defpackage.ajwz(dijVar2, defpackage.dfd.j(cpnVarB), z));
    }

    /* JADX WARN: Code duplicated, block: B:18:0x003d  */
    private static final void e(defpackage.aco acoVar, defpackage.aonj aonjVar, defpackage.dij dijVar, defpackage.dij dijVar2, defpackage.ipc ipcVar, defpackage.ipc ipcVar2, boolean z) {
        boolean z2;
        defpackage.aco acoVar2;
        defpackage.aonj aonjVar2;
        defpackage.dij dijVar3;
        defpackage.ipc ipcVar3;
        defpackage.ipc ipcVar4;
        defpackage.dbk dbkVar = dijVar2.a;
        if (!dbkVar.am() || !dbkVar.al() || ipcVar2.ad()) {
            if (dijVar2.k()) {
                d(acoVar, dijVar, dijVar2, z);
                return;
            }
            return;
        }
        defpackage.cpn cpnVarD = dijVar2.d();
        if (cpnVarD.i()) {
            cpnVarD = dijVar2.e();
        }
        defpackage.dpo dpoVarJ = defpackage.dfd.j(cpnVarD);
        ipcVar.ac(dpoVarJ);
        if (z) {
            z2 = true;
        } else {
            defpackage.die dieVar = dijVar2.b;
            if (dieVar.a && dieVar.f(defpackage.din.q)) {
                z2 = true;
            } else {
                z2 = false;
            }
        }
        if (ipcVar.aj(ipcVar2)) {
            int i = dijVar.c;
            int i2 = dijVar2.c;
            if (i2 == i) {
                i2 = -1;
            }
            acoVar.g(i2, new defpackage.ajwz(dijVar2, ipcVar.ab(), z2));
            java.util.List listL = dijVar2.l((4 & 1) != 0 ? !dijVar2.e : false, ((4 & 2) == 0) & true);
            int size = listL.size() - 1;
            while (size >= 0) {
                if (((java.lang.Boolean) aonjVar.a(listL.get(size))).booleanValue()) {
                    acoVar2 = acoVar;
                    aonjVar2 = aonjVar;
                    dijVar3 = dijVar;
                    ipcVar3 = ipcVar;
                    ipcVar4 = ipcVar2;
                } else {
                    acoVar2 = acoVar;
                    aonjVar2 = aonjVar;
                    dijVar3 = dijVar;
                    ipcVar3 = ipcVar;
                    ipcVar4 = ipcVar2;
                    e(acoVar2, aonjVar2, dijVar3, (defpackage.dij) listL.get(size), ipcVar3, ipcVar4, z2);
                }
                size--;
                acoVar = acoVar2;
                aonjVar = aonjVar2;
                dijVar = dijVar3;
                ipcVar = ipcVar3;
                ipcVar2 = ipcVar4;
            }
            defpackage.ipc ipcVar5 = ipcVar2;
            if (b(dijVar2)) {
                ipcVar5.ae(dpoVarJ);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0076  */
    /* JADX WARN: Code duplicated, block: B:53:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:60:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:71:0x0149  */
    /* JADX WARN: Code duplicated, block: B:73:0x0152  */
    /* JADX WARN: Code duplicated, block: B:75:0x0162  */
    /* JADX WARN: Code duplicated, block: B:94:0x0172 A[SYNTHETIC] */
    private static final void f(defpackage.dij dijVar, defpackage.aco acoVar, defpackage.aonj aonjVar, defpackage.dij dijVar2, defpackage.ipc ipcVar, defpackage.ipc ipcVar2, boolean z) {
        defpackage.cpn cpnVarR;
        boolean z2;
        boolean z3;
        int size;
        defpackage.dij dijVar3 = dijVar;
        defpackage.aco acoVar2 = acoVar;
        defpackage.aonj aonjVar2 = aonjVar;
        defpackage.ipc ipcVar3 = ipcVar;
        defpackage.dbk dbkVar = dijVar2.a;
        boolean z4 = (dbkVar.am() && dbkVar.al()) ? false : true;
        if (!ipcVar2.ad() || dijVar2.c == dijVar3.c) {
            if (!z4 || dijVar2.k()) {
                defpackage.dpo dpoVarJ = defpackage.dfd.j(dijVar2.d());
                defpackage.ddc ddcVarG = dijVar2.g();
                if (ddcVarG == null) {
                    cpnVarR = dbkVar.o().af(true);
                } else {
                    cpnVarR = defpackage.den.r(ddcVarG.L(), defpackage.den.t(dijVar2.b), true, true);
                }
                int i = dijVar3.c;
                int i2 = dijVar2.c;
                if (i2 == i) {
                    i2 = -1;
                }
                defpackage.dpo dpoVarJ2 = defpackage.dfd.j(cpnVarR);
                if (z) {
                    z2 = true;
                } else {
                    defpackage.die dieVar = dijVar2.b;
                    if (dieVar.a && dieVar.f(defpackage.din.q)) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                }
                ipcVar3.ac(dpoVarJ2);
                if (!ipcVar.aj(ipcVar2)) {
                    boolean z5 = z2;
                    if (dijVar2.k()) {
                        d(acoVar2, dijVar3, dijVar2, z);
                        return;
                    } else {
                        if (i2 == -1) {
                            acoVar2.g(-1, new defpackage.ajwz(dijVar2, ipcVar.ab(), z5));
                            return;
                        }
                        return;
                    }
                }
                if (!defpackage.aooh.n(dpoVarJ2, dpoVarJ)) {
                    ipcVar3.ac(dpoVarJ);
                    ipcVar.aj(ipcVar2);
                }
                acoVar2.g(i2, new defpackage.ajwz(dijVar2, ipcVar3.ab(), z2));
                java.util.List listL = dijVar2.l((4 & 1) != 0 ? !dijVar2.e : false, ((4 & 2) == 0) & true);
                if (dijVar2.b.a) {
                    defpackage.dij dijVarJ = dijVar2.j();
                    while (true) {
                        if (dijVarJ == null) {
                            dijVarJ = null;
                            break;
                        }
                        defpackage.die dieVar2 = dijVarJ.b;
                        if (dieVar2.f(defpackage.din.x) || dieVar2.f(defpackage.din.w)) {
                            break;
                        } else {
                            dijVarJ = dijVarJ.j();
                        }
                    }
                    if (dijVarJ == null) {
                        z3 = z2;
                        size = listL.size() - 1;
                        while (size >= 0) {
                            if (!((java.lang.Boolean) aonjVar2.a(listL.get(size))).booleanValue()) {
                                f(dijVar, acoVar, aonjVar2, (defpackage.dij) listL.get(size), ipcVar3, ipcVar2, z3);
                            }
                            size--;
                            aonjVar2 = aonjVar;
                            ipcVar3 = ipcVar;
                        }
                    } else {
                        defpackage.dck dckVarF = dijVar2.f();
                        if (dckVarF == null) {
                            dckVarF = null;
                        } else {
                            if (true != dckVarF.u()) {
                                dckVarF = null;
                            }
                            if (dckVarF == null) {
                                dckVarF = null;
                            }
                        }
                        defpackage.dck dckVarF2 = dijVarJ.f();
                        if (dckVarF2 == null) {
                            dckVarF2 = null;
                        } else {
                            if (true != dckVarF2.u()) {
                                dckVarF2 = null;
                            }
                            if (dckVarF2 == null) {
                                dckVarF2 = null;
                            }
                        }
                        if (dckVarF == null || dckVarF2 == null) {
                            z3 = z2;
                            size = listL.size() - 1;
                            while (size >= 0) {
                                if (!((java.lang.Boolean) aonjVar2.a(listL.get(size))).booleanValue()) {
                                    f(dijVar, acoVar, aonjVar2, (defpackage.dij) listL.get(size), ipcVar3, ipcVar2, z3);
                                }
                                size--;
                                aonjVar2 = aonjVar;
                                ipcVar3 = ipcVar;
                            }
                        } else {
                            defpackage.cpn cpnVarQ = dckVarF2.q(dckVarF, false);
                            if (defpackage.aooh.n(cpnVarQ, cpnVarQ.e(defpackage.cdh.x(0L, defpackage.dpy.l(dckVarF2.h()))))) {
                                z3 = z2;
                                size = listL.size() - 1;
                                while (size >= 0) {
                                    if (!((java.lang.Boolean) aonjVar2.a(listL.get(size))).booleanValue()) {
                                        f(dijVar, acoVar, aonjVar2, (defpackage.dij) listL.get(size), ipcVar3, ipcVar2, z3);
                                    }
                                    size--;
                                    aonjVar2 = aonjVar;
                                    ipcVar3 = ipcVar;
                                }
                            } else {
                                boolean z6 = z2;
                                defpackage.ipc ipcVar4 = new defpackage.ipc((byte[]) null, (char[]) null, (byte[]) null);
                                ipcVar4.ac(defpackage.dfd.j(dijVar2.e()));
                                int size2 = listL.size() - 1;
                                while (size2 >= 0) {
                                    if (!((java.lang.Boolean) aonjVar2.a(listL.get(size2))).booleanValue()) {
                                        defpackage.aonj aonjVar3 = aonjVar2;
                                        e(acoVar2, aonjVar3, dijVar3, (defpackage.dij) listL.get(size2), new defpackage.ipc((byte[]) null, (char[]) null, (byte[]) null), ipcVar4, z6);
                                        aonjVar2 = aonjVar3;
                                    }
                                    size2--;
                                    dijVar3 = dijVar;
                                    acoVar2 = acoVar;
                                }
                            }
                        }
                    }
                } else {
                    z3 = z2;
                    size = listL.size() - 1;
                    while (size >= 0) {
                        if (!((java.lang.Boolean) aonjVar2.a(listL.get(size))).booleanValue()) {
                            f(dijVar, acoVar, aonjVar2, (defpackage.dij) listL.get(size), ipcVar3, ipcVar2, z3);
                        }
                        size--;
                        aonjVar2 = aonjVar;
                        ipcVar3 = ipcVar;
                    }
                }
                if (b(dijVar2)) {
                    ipcVar2.ae(dpoVarJ2);
                }
            }
        }
    }
}
