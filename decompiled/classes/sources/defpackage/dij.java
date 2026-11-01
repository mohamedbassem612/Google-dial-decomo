package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class dij {
    public final defpackage.dbk a;
    public final defpackage.die b;
    public final int c;
    private final defpackage.cmv d;
    private final boolean e;
    private defpackage.dij f;

    public dij(defpackage.cmv cmvVar, boolean z, defpackage.dbk dbkVar, defpackage.die dieVar) {
        this.d = cmvVar;
        this.e = z;
        this.a = dbkVar;
        this.b = dieVar;
        this.c = dbkVar.c;
    }

    private final defpackage.dij o(defpackage.dib dibVar, defpackage.aonj aonjVar) {
        defpackage.die dieVar = new defpackage.die();
        dieVar.a = false;
        dieVar.b = false;
        aonjVar.a(dieVar);
        defpackage.dij dijVar = new defpackage.dij(new defpackage.dii(aonjVar), false, new defpackage.dbk(true, this.c + (dibVar != null ? 1000000000 : 2000000000)), dieVar);
        dijVar.f = this;
        return dijVar;
    }

    private final void p(java.util.List list, defpackage.die dieVar) {
        if (this.b.b) {
            return;
        }
        n(list, false);
        int size = list.size();
        for (int size2 = list.size(); size2 < size; size2++) {
            defpackage.dij dijVar = (defpackage.dij) list.get(size2);
            if (!dijVar.q()) {
                dieVar.e(dijVar.b);
                dijVar.p(list, dieVar);
            }
        }
    }

    private final boolean q() {
        return this.e && this.b.a;
    }

    private final void r(defpackage.dbk dbkVar, java.util.List list) {
        defpackage.cfc cfcVarI = dbkVar.i();
        java.lang.Object[] objArr = cfcVarI.a;
        int i = cfcVarI.b;
        for (int i2 = 0; i2 < i; i2++) {
            defpackage.dbk dbkVar2 = (defpackage.dbk) objArr[i2];
            if (dbkVar2.al() && !dbkVar2.D) {
                if (dbkVar2.v.i(8)) {
                    list.add(defpackage.dfb.t(dbkVar2, this.e));
                } else {
                    r(dbkVar2, list);
                }
            }
        }
    }

    private final void s(java.util.List list, java.util.List list2) {
        n(list, false);
        int size = list.size();
        for (int size2 = list.size(); size2 < size; size2++) {
            defpackage.dij dijVar = (defpackage.dij) list.get(size2);
            if (dijVar.q()) {
                list2.add(dijVar);
            } else if (!dijVar.b.b) {
                dijVar.s(list, list2);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10, types: [cmv] */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12, types: [cmv] */
    /* JADX WARN: Type inference failed for: r1v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [cfc] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [cfc] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v7 */
    public final defpackage.cpn a(defpackage.cxi cxiVar) {
        ?? X;
        defpackage.dij dijVarJ = j();
        if (dijVarJ == null) {
            return defpackage.cpn.a;
        }
        defpackage.dce dceVar = dijVarJ.a.v;
        if ((dceVar.a() & 8) == 0) {
            X = 0;
            break;
        }
        defpackage.cmv cmvVar = dceVar.f;
        loop0: while (true) {
            if (cmvVar != null) {
                if ((cmvVar.u & 8) != 0) {
                    X = cmvVar;
                    ?? cfcVar = 0;
                    while (X != 0) {
                        if (X instanceof defpackage.ddc) {
                            if (((defpackage.ddc) X).y()) {
                                break loop0;
                            }
                        } else if ((X.u & 8) != 0 && (X instanceof defpackage.dap)) {
                            defpackage.cmv cmvVar2 = ((defpackage.dap) X).F;
                            int i = 0;
                            while (cmvVar2 != null) {
                                if ((cmvVar2.u & 8) != 0) {
                                    i++;
                                    if (i == 1) {
                                        X = X;
                                        cfcVar = cfcVar;
                                        cfcVar = cfcVar;
                                        X = cmvVar2;
                                    } else {
                                        if (cfcVar == 0) {
                                            cfcVar = new defpackage.cfc(new defpackage.cmv[16]);
                                        }
                                        if (X != 0) {
                                            cfcVar.n(X);
                                        }
                                        cfcVar.n(cmvVar2);
                                        X = 0;
                                    }
                                } else {
                                    X = X;
                                    cfcVar = cfcVar;
                                }
                                cmvVar2 = cmvVar2.x;
                                X = X;
                                cfcVar = cfcVar;
                            }
                            if (i != 1) {
                                X = X;
                                cfcVar = cfcVar;
                            } else {
                                X = X;
                                cfcVar = cfcVar;
                            }
                        }
                        X = defpackage.cfo.x(cfcVar);
                    }
                }
                if ((cmvVar.v & 8) != 0) {
                    cmvVar = cmvVar.x;
                }
            }
            X = 0;
            break;
        }
        defpackage.ddc ddcVar = (defpackage.ddc) X;
        defpackage.dck dckVarB = ddcVar != null ? defpackage.cfo.B(ddcVar, 8) : null;
        return dckVarB == null ? dijVarJ.a(cxiVar) : dckVarB.q(cxiVar, true);
    }

    public final defpackage.cpn b() {
        defpackage.dck dckVarF = f();
        if (dckVarF != null) {
            if (true != dckVarF.u()) {
                dckVarF = null;
            }
            if (dckVarF != null) {
                return defpackage.den.G(dckVarF).q(dckVarF, true);
            }
        }
        return defpackage.cpn.a;
    }

    public final defpackage.cpn c() {
        defpackage.dck dckVarF = f();
        if (dckVarF != null) {
            if (true != dckVarF.u()) {
                dckVarF = null;
            }
            if (dckVarF != null) {
                return defpackage.den.F(dckVarF, true);
            }
        }
        return defpackage.cpn.a;
    }

    public final defpackage.cpn d() {
        defpackage.ddc ddcVarG = g();
        if (ddcVarG == null) {
            return this.a.o().af(false);
        }
        return defpackage.den.r(ddcVarG.L(), defpackage.den.t(this.b), true, false);
    }

    public final defpackage.cpn e() {
        defpackage.ddc ddcVarG = g();
        if (ddcVarG == null) {
            defpackage.dck dckVarO = this.a.o();
            return defpackage.den.G(dckVarO).q(dckVarO, false);
        }
        return defpackage.den.r(ddcVarG.L(), defpackage.den.t(this.b), false, false);
    }

    public final defpackage.dck f() {
        defpackage.dck dckVarB;
        if (!k()) {
            defpackage.ddc ddcVarG = g();
            return (ddcVarG == null || (dckVarB = defpackage.cfo.B(ddcVarG, 8)) == null) ? this.a.o() : dckVarB;
        }
        defpackage.dij dijVarJ = j();
        if (dijVarJ != null) {
            return dijVarJ.f();
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11, types: [cmv] */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v24 */
    /* JADX WARN: Type inference failed for: r0v25 */
    /* JADX WARN: Type inference failed for: r0v26 */
    /* JADX WARN: Type inference failed for: r0v27 */
    /* JADX WARN: Type inference failed for: r0v28 */
    /* JADX WARN: Type inference failed for: r0v29 */
    /* JADX WARN: Type inference failed for: r0v30 */
    /* JADX WARN: Type inference failed for: r0v31 */
    /* JADX WARN: Type inference failed for: r0v32 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9, types: [cmv] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v20 */
    /* JADX WARN: Type inference failed for: r5v21 */
    /* JADX WARN: Type inference failed for: r5v22 */
    /* JADX WARN: Type inference failed for: r5v23 */
    /* JADX WARN: Type inference failed for: r5v3, types: [cfc] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [cfc] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r7v4 */
    public final defpackage.ddc g() {
        ?? X;
        boolean z;
        ?? r0;
        boolean z2 = this.b.a;
        defpackage.dbk dbkVar = this.a;
        ?? r4 = 0;
        r4 = 0;
        r4 = 0;
        r4 = 0;
        if (!z2) {
            defpackage.dce dceVar = dbkVar.v;
            if ((dceVar.a() & 8) != 0) {
                loop3: for (defpackage.cmv cmvVar = dceVar.f; cmvVar != null; cmvVar = cmvVar.x) {
                    if ((cmvVar.u & 8) != 0) {
                        X = cmvVar;
                        ?? cfcVar = 0;
                        while (true) {
                            if (X != 0) {
                                if (X instanceof defpackage.ddc) {
                                    if (((defpackage.ddc) X).y()) {
                                        r4 = X;
                                    }
                                } else if ((X.u & 8) != 0 && (X instanceof defpackage.dap)) {
                                    defpackage.cmv cmvVar2 = ((defpackage.dap) X).F;
                                    int i = 0;
                                    while (cmvVar2 != null) {
                                        if ((cmvVar2.u & 8) != 0) {
                                            i++;
                                            if (i == 1) {
                                                X = X;
                                                cfcVar = cfcVar;
                                                cfcVar = cfcVar;
                                                X = cmvVar2;
                                            } else {
                                                if (cfcVar == 0) {
                                                    cfcVar = new defpackage.cfc(new defpackage.cmv[16]);
                                                }
                                                if (X != 0) {
                                                    cfcVar.n(X);
                                                }
                                                cfcVar.n(cmvVar2);
                                                X = 0;
                                            }
                                        } else {
                                            X = X;
                                            cfcVar = cfcVar;
                                        }
                                        cmvVar2 = cmvVar2.x;
                                        X = X;
                                        cfcVar = cfcVar;
                                    }
                                    if (i != 1) {
                                        X = X;
                                        cfcVar = cfcVar;
                                    } else {
                                        X = X;
                                        cfcVar = cfcVar;
                                    }
                                }
                                X = defpackage.cfo.x(cfcVar);
                            }
                        }
                    }
                    if ((cmvVar.v & 8) == 0) {
                        break;
                    }
                }
            }
        } else {
            defpackage.dce dceVar2 = dbkVar.v;
            if ((dceVar2.a() & 8) != 0) {
                defpackage.cmv cmvVar3 = dceVar2.f;
                X = 0;
                while (cmvVar3 != null) {
                    if ((cmvVar3.u & 8) != 0) {
                        defpackage.cmv cmvVarX = cmvVar3;
                        defpackage.cfc cfcVar2 = null;
                        while (cmvVarX != null) {
                            if (cmvVarX instanceof defpackage.ddc) {
                                defpackage.ddc ddcVar = (defpackage.ddc) cmvVarX;
                                if (ddcVar.y()) {
                                    if (ddcVar.x()) {
                                        r0 = X;
                                        r0 = X;
                                        return ddcVar;
                                    }
                                    if (X == 0) {
                                        r0 = ddcVar;
                                    }
                                }
                                r0 = X;
                                z = false;
                                X = r0;
                            } else {
                                z = true;
                            }
                            if (z) {
                                X = X;
                                if ((cmvVarX.u & 8) != 0 && (cmvVarX instanceof defpackage.dap)) {
                                    int i2 = 0;
                                    for (defpackage.cmv cmvVar4 = ((defpackage.dap) cmvVarX).F; cmvVar4 != null; cmvVar4 = cmvVar4.x) {
                                        if ((cmvVar4.u & 8) != 0) {
                                            i2++;
                                            if (i2 == 1) {
                                                cmvVarX = cmvVar4;
                                            } else {
                                                if (cfcVar2 == null) {
                                                    cfcVar2 = new defpackage.cfc(new defpackage.cmv[16]);
                                                }
                                                if (cmvVarX != null) {
                                                    cfcVar2.n(cmvVarX);
                                                }
                                                cfcVar2.n(cmvVar4);
                                                cmvVarX = null;
                                            }
                                        }
                                    }
                                    if (i2 != 1) {
                                    }
                                }
                            } else {
                                X = X;
                            }
                            cmvVarX = defpackage.cfo.x(cfcVar2);
                        }
                    }
                    if ((cmvVar3.v & 8) == 0) {
                        break;
                    }
                    cmvVar3 = cmvVar3.x;
                    X = X;
                }
                r4 = X;
            }
        }
        return (defpackage.ddc) r4;
    }

    public final defpackage.die h() {
        boolean zQ = q();
        defpackage.die dieVar = this.b;
        if (!zQ) {
            return dieVar;
        }
        defpackage.die dieVarB = dieVar.b();
        p(new java.util.ArrayList(), dieVarB);
        return dieVarB;
    }

    public final defpackage.dij i() {
        return new defpackage.dij(this.d, true, this.a, this.b);
    }

    public final defpackage.dij j() {
        defpackage.dbk dbkVarK;
        defpackage.dij dijVar = this.f;
        if (dijVar != null) {
            return dijVar;
        }
        boolean z = this.e;
        if (!z) {
            dbkVarK = null;
            break;
        }
        dbkVarK = this.a.k();
        while (true) {
            if (dbkVarK != null) {
                defpackage.die dieVarQ = dbkVarK.q();
                if (dieVarQ != null && dieVarQ.a) {
                    break;
                }
                dbkVarK = dbkVarK.k();
            } else {
                dbkVarK = null;
                break;
            }
        }
        if (dbkVarK == null) {
            dbkVarK = this.a.k();
            while (dbkVarK != null) {
                if (!dbkVarK.v.i(8)) {
                    dbkVarK = dbkVarK.k();
                }
            }
            dbkVarK = null;
        }
        if (dbkVarK == null) {
            return null;
        }
        return defpackage.dfb.t(dbkVarK, z);
    }

    public final boolean k() {
        return this.f != null;
    }

    public final java.util.List l(boolean z, boolean z2) {
        if (!z && this.b.b) {
            return defpackage.aokc.a;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (!q()) {
            return n(arrayList, z2);
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        s(arrayList, arrayList2);
        return arrayList2;
    }

    public final java.util.List n(java.util.List list, boolean z) {
        final java.lang.String str;
        if (k()) {
            return defpackage.aokc.a;
        }
        r(this.a, list);
        if (!z) {
            return list;
        }
        defpackage.die dieVar = this.b;
        defpackage.dib dibVar = (defpackage.dib) dieVar.g(defpackage.din.A);
        if (dibVar != null && dieVar.a && !list.isEmpty()) {
            list.add(o(dibVar, new defpackage.ddz(dibVar, 8)));
        }
        defpackage.dip dipVar = defpackage.din.a;
        if (!dieVar.f(dipVar) || list.isEmpty() || !dieVar.a) {
            return list;
        }
        java.util.List list2 = (java.util.List) dieVar.g(dipVar);
        final int i = 0;
        if (list2 != null) {
            str = (java.lang.String) (list2.isEmpty() ? null : list2.get(0));
        } else {
            str = null;
        }
        if (str == null) {
            return list;
        }
        list.add(0, o(null, new defpackage.aonj() { // from class: dih
            /* JADX WARN: Type inference failed for: r14v14, types: [dao, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r14v22, types: [java.lang.Object, java.util.List] */
            @Override // defpackage.aonj
            public final java.lang.Object a(java.lang.Object obj) {
                dey deyVar;
                android.graphics.Rect rect = null;
                switch (i) {
                    case 0:
                        java.lang.Object obj2 = str;
                        defpackage.dip dipVar2 = defpackage.din.a;
                        java.util.List listSingletonList = java.util.Collections.singletonList(obj2);
                        defpackage.aooh.e(listSingletonList, "singletonList(...)");
                        ((defpackage.diq) obj).a(dipVar2, listSingletonList);
                        return defpackage.aojh.a;
                    case 1:
                        if (((java.lang.Throwable) obj) != null) {
                            ((android.os.CancellationSignal) str).cancel();
                        }
                        return defpackage.aojh.a;
                    case 2:
                        ((dqc) str).r = (defpackage.aonj) obj;
                        return defpackage.aojh.a;
                    case 3:
                        ((defpackage.dbk) str).aa((defpackage.dpf) obj);
                        return defpackage.aojh.a;
                    case 4:
                        defpackage.dcv dcvVar = (defpackage.dcv) obj;
                        defpackage.deg degVar = dcvVar instanceof defpackage.deg ? (defpackage.deg) dcvVar : null;
                        java.lang.Object obj3 = str;
                        if (degVar != null && (deyVar = degVar.v) != null) {
                            deyVar.removeViewInLayout((android.view.View) obj3);
                            java.lang.Object objRemove = deyVar.a.remove(obj3);
                            java.util.HashMap map = deyVar.b;
                            defpackage.aoov.g(map);
                            map.remove(objRemove);
                            ((dqc) obj3).setImportantForAccessibility(0);
                        }
                        ((dqc) obj3).removeAllViewsInLayout();
                        return defpackage.aojh.a;
                    case 5:
                        defpackage.cpn cpnVar = (defpackage.cpn) obj;
                        java.lang.Object obj4 = str;
                        defpackage.cmv cmvVar = (defpackage.cmv) obj4;
                        if (cmvVar.D) {
                            defpackage.aoov.an(cmvVar.M(), null, 0, new defpackage.bnl((dql) obj4, cpnVar, (defpackage.aoln) null, 13), 3);
                        }
                        return defpackage.aojh.a;
                    case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                        ?? r14 = str;
                        coh cohVar = (coh) obj;
                        android.view.View viewG = dpm.g((defpackage.cmv) r14);
                        if (!viewG.isFocused() && !viewG.hasFocus()) {
                            defpackage.cou couVar = ((defpackage.deg) defpackage.cfo.C(r14)).F;
                            android.view.View viewF = defpackage.wl.f(r14);
                            java.lang.Integer numD = defpackage.con.d(cohVar.a);
                            int[] iArr = new int[2];
                            viewF.getLocationOnScreen(iArr);
                            int[] iArr2 = new int[2];
                            viewG.getLocationOnScreen(iArr2);
                            defpackage.cpn cpnVarC = couVar.c();
                            if (cpnVarC != null) {
                                int i2 = iArr[0];
                                int i3 = ((int) cpnVarC.b) + i2;
                                int i4 = iArr2[0];
                                int i5 = iArr[1];
                                int i6 = ((int) cpnVarC.c) + i5;
                                int i7 = iArr2[1];
                                rect = new android.graphics.Rect(i3 - i4, i6 - i7, (((int) cpnVarC.d) + i2) - i4, (((int) cpnVarC.e) + i5) - i7);
                            }
                            if (!defpackage.con.e(viewG, numD, rect)) {
                                cohVar.b = true;
                            }
                        }
                        return defpackage.aojh.a;
                    case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                        dpm.g((defpackage.cmv) str);
                        return defpackage.aojh.a;
                    case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                        java.lang.Object obj5 = str;
                        ((drk) obj5).show();
                        return new ali(obj5, 7);
                    case 9:
                        return defpackage.mni.bi(str, (defpackage.czb) obj);
                    case 10:
                        defpackage.cbd cbdVar = dra.a;
                        defpackage.cxi cxiVarDn = ((defpackage.cxi) obj).dn();
                        defpackage.aooh.c(cxiVarDn);
                        drq drqVar = (drq) str;
                        drqVar.h.b(cxiVarDn);
                        drqVar.m();
                        return defpackage.aojh.a;
                    case 11:
                        defpackage.cbd cbdVar2 = dra.a;
                        drq drqVar2 = (drq) str;
                        drqVar2.g.b((defpackage.dpp) obj);
                        drqVar2.n();
                        return defpackage.aojh.a;
                    case 12:
                        drk drkVar = (drk) str;
                        boolean z2 = drkVar.b.a;
                        drkVar.a.a();
                        return defpackage.aojh.a;
                    case 13:
                        ((drq) str).l = (defpackage.fyi) obj;
                        return defpackage.aojh.a;
                    case 14:
                        defpackage.aomy aomyVar = (defpackage.aomy) obj;
                        drq drqVar3 = (drq) str;
                        android.os.Handler handler = drqVar3.getHandler();
                        if ((handler != null ? handler.getLooper() : null) == android.os.Looper.myLooper()) {
                            aomyVar.a();
                        } else {
                            android.os.Handler handler2 = drqVar3.getHandler();
                            if (handler2 != null) {
                                handler2.post(new drn(aomyVar, 0));
                            }
                        }
                        return defpackage.aojh.a;
                    case 15:
                        java.lang.Object obj6 = str;
                        java.lang.String str2 = (java.lang.String) obj;
                        defpackage.aorg aorgVar = fvz.a;
                        defpackage.aooh.f(str2, "argName");
                        return java.lang.Boolean.valueOf(!defpackage.gie.f((android.os.Bundle) obj6, str2));
                    case 16:
                        java.lang.String str3 = (java.lang.String) obj;
                        defpackage.aooh.f(str3, "key");
                        java.lang.Object obj7 = ((defpackage.aoot) str).a;
                        return java.lang.Boolean.valueOf(obj7 == null || !defpackage.gie.f((android.os.Bundle) obj7, str3));
                    case 17:
                        fvs fvsVar = (fvs) obj;
                        defpackage.aooh.f(fvsVar, "backStackEntry");
                        fwc fwcVar = fvsVar.a;
                        if (true != (fwcVar instanceof fwc)) {
                            fwcVar = null;
                        }
                        if (fwcVar == null) {
                            return null;
                        }
                        java.lang.Object obj8 = str;
                        fvsVar.a();
                        fwn fwnVar = (fwn) obj8;
                        fwc fwcVarC = fwnVar.c(fwcVar);
                        return defpackage.aooh.n(fwcVarC, fwcVar) ? fvsVar : fwnVar.f().a(fwcVarC, fwcVarC.c(fvsVar.a()));
                    case 18:
                        android.os.Bundle bundle = (android.os.Bundle) obj;
                        fvx fvxVarAf = hgu.af((android.content.Context) str);
                        if (bundle != null) {
                            bundle.setClassLoader(fvxVarAf.a.getClassLoader());
                        }
                        fxr fxrVar = fvxVarAf.b;
                        if (bundle != null) {
                            fxrVar.d = defpackage.gie.f(bundle, "android-support-nav:controller:navigatorState") ? defpackage.gie.a(bundle, "android-support-nav:controller:navigatorState") : null;
                            fxrVar.e = defpackage.gie.f(bundle, "android-support-nav:controller:backStack") ? (android.os.Bundle[]) defpackage.gie.c(bundle, "android-support-nav:controller:backStack").toArray(new android.os.Bundle[0]) : null;
                            java.util.Map map2 = fxrVar.i;
                            map2.clear();
                            if (defpackage.gie.f(bundle, "android-support-nav:controller:backStackDestIds") && defpackage.gie.f(bundle, "android-support-nav:controller:backStackIds")) {
                                int[] intArray = bundle.getIntArray("android-support-nav:controller:backStackDestIds");
                                if (intArray == null) {
                                    hgu.L("android-support-nav:controller:backStackDestIds");
                                    throw new defpackage.aoiq();
                                }
                                java.util.List listD = defpackage.gie.d(bundle, "android-support-nav:controller:backStackIds");
                                int i8 = 0;
                                int i9 = 0;
                                while (i8 < intArray.length) {
                                    int i10 = i9 + 1;
                                    fxrVar.h.put(java.lang.Integer.valueOf(intArray[i8]), !defpackage.aooh.n(listD.get(i9), "") ? (java.lang.String) listD.get(i9) : null);
                                    i8++;
                                    i9 = i10;
                                }
                            }
                            if (defpackage.gie.f(bundle, "android-support-nav:controller:backStackStates")) {
                                for (java.lang.String str4 : defpackage.gie.d(bundle, "android-support-nav:controller:backStackStates")) {
                                    if (defpackage.gie.f(bundle, "android-support-nav:controller:backStackStates:".concat(java.lang.String.valueOf(str4)))) {
                                        java.util.List listC = defpackage.gie.c(bundle, "android-support-nav:controller:backStackStates:".concat(java.lang.String.valueOf(str4)));
                                        defpackage.aojw aojwVar = new defpackage.aojw(listC.size());
                                        java.util.Iterator it = listC.iterator();
                                        while (it.hasNext()) {
                                            aojwVar.addLast(new vk((android.os.Bundle) it.next()));
                                        }
                                        map2.put(str4, aojwVar);
                                    }
                                }
                            }
                        }
                        if (bundle != null) {
                            boolean z3 = bundle.getBoolean("android-support-nav:controller:deepLinkHandled", false);
                            java.lang.Boolean boolValueOf = (z3 || !bundle.getBoolean("android-support-nav:controller:deepLinkHandled", true)) ? java.lang.Boolean.valueOf(z3) : null;
                            fvxVarAf.d = boolValueOf != null ? boolValueOf.booleanValue() : false;
                        }
                        return fvxVarAf;
                    case 19:
                        fwc fwcVar2 = (fwc) obj;
                        defpackage.aooh.f(fwcVar2, "destination");
                        return java.lang.Boolean.valueOf(!((fxr) str).h.containsKey(java.lang.Integer.valueOf(fwcVar2.b())));
                    default:
                        return java.lang.Boolean.valueOf(defpackage.aooh.n((java.lang.String) obj, str));
                }
            }
        }));
        return list;
    }
}
