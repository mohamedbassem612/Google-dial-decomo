package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class af implements aomy {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;
    public final /* synthetic */ java.lang.Object b;
    public final /* synthetic */ java.lang.Object c;

    public /* synthetic */ af(defpackage.qa qaVar, defpackage.htx htxVar, int i) {
        this.$cid = i;
        this.b = qaVar;
        this.a = "android";
        this.c = htxVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:129:0x038e  */
    /* JADX WARN: Type inference failed for: r0v14, types: [aomy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v27, types: [ajl, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v47, types: [java.lang.Object, qy] */
    /* JADX WARN: Type inference failed for: r0v57, types: [ahth, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v12, types: [aomy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v15, types: [aoss, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v17, types: [aoss, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v18, types: [ajl, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v19, types: [aoss, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v23, types: [aoss, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v25, types: [che, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v27, types: [aonn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v28, types: [java.lang.Object, qa] */
    /* JADX WARN: Type inference failed for: r14v31, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v32, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v10, types: [aqb, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v23, types: [cxi, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v44, types: [ccp, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v65, types: [java.lang.Object, oqx] */
    /* JADX WARN: Type inference failed for: r2v18, types: [aoss, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v35, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v10, types: [aoss, java.lang.Object] */
    public final java.lang.Object a() {
        aqi aqiVar;
        java.lang.Object objA;
        civ civVar;
        int i;
        int i2 = 9;
        int i3 = 1;
        switch (this.$cid) {
            case 0:
                ((defpackage.ag) this.b).d.e((android.view.ViewGroup) this.c, this.a);
                return aojh.a;
            case 1:
                java.lang.Object obj = this.b;
                defpackage.ag agVar = (defpackage.ag) obj;
                java.util.List list = agVar.a;
                if (list.isEmpty()) {
                    if (bo.Z(2)) {
                        android.util.Log.v("FragmentManager", "Animating to start");
                    }
                    java.lang.Object obj2 = this.c;
                    defpackage.ce ceVar = agVar.d;
                    java.lang.Object obj3 = agVar.g;
                    aooh.c(obj3);
                    ceVar.u(obj3, new ad(obj, obj2, 4, (byte[]) null));
                } else {
                    java.util.Iterator it = list.iterator();
                    while (it.hasNext()) {
                        if (!((defpackage.ah) it.next()).a.d) {
                            if (bo.Z(2)) {
                                android.util.Log.v("FragmentManager", "Completing animating immediately");
                            }
                            java.lang.Object obj4 = this.a;
                            defpackage.dxa dxaVar = new defpackage.dxa();
                            defpackage.ce ceVar2 = agVar.d;
                            aw awVar = ((defpackage.ah) list.get(0)).a.a;
                            ceVar2.q(obj4, dxaVar, new ae(obj, 1));
                            dxaVar.a();
                        }
                    }
                    if (bo.Z(2)) {
                        android.util.Log.v("FragmentManager", "Animating to start");
                    }
                    java.lang.Object obj5 = this.c;
                    defpackage.ce ceVar3 = agVar.d;
                    java.lang.Object obj6 = agVar.g;
                    aooh.c(obj6);
                    ceVar3.u(obj6, new ad(obj, obj5, 4, (byte[]) null));
                }
                return aojh.a;
            case 2:
                while (true) {
                    aqiVar = (aqi) this.c;
                    cfc cfcVar = (cfc) aqiVar.i.a;
                    int i4 = cfcVar.b;
                    if (i4 != 0) {
                        if (i4 == 0) {
                            throw new java.util.NoSuchElementException("MutableVector is empty.");
                        }
                        java.lang.Object objA2 = ((aqe) cfcVar.a[i4 - 1]).a.a();
                        if (objA2 == null || aqi.g(aqiVar, (cpn) objA2, 0L, 0L, 3)) {
                            ((aqe) cfcVar.c(cfcVar.b - 1)).b.w(aojh.a);
                        }
                    }
                }
                if (aqiVar.f && (objA = aqiVar.e.a()) != null && aqi.g(aqiVar, (cpn) objA, 0L, 0L, 3)) {
                    aqiVar.f = false;
                }
                ((defpackage.auo) this.a).e = aqiVar.b((aqb) this.b, 0L);
                return aojh.a;
            case 3:
                ?? r0 = this.a;
                ?? r1 = this.c;
                bfp bfpVar = (bfp) this.b;
                cpn cpnVarB = bfp.b(bfpVar, (cxi) r1, (aomy) r0);
                if (cpnVarB == null) {
                    return null;
                }
                aqi aqiVar2 = bfpVar.a;
                if (aqiVar2.g == -1) {
                    defpackage.avo.d("Expected BringIntoViewRequester to not be used before parents are placed.");
                }
                return cpnVarB.g(aqiVar2.e(cpnVarB, aqiVar2.d(), 0L) ^ (-9223372034707292160L));
            case 4:
                defpackage.btt bttVar = (defpackage.btt) this.b;
                int iOrdinal = bttVar.c().ordinal();
                ?? r2 = this.a;
                if (iOrdinal == 1) {
                    this.c.a();
                } else if (iOrdinal != 2) {
                    aoov.an((aoss) r2, (aolr) null, 0, new defpackage.bgx(bttVar, (aoln) null, 6, (short[]) null), 3);
                } else {
                    aoov.an((aoss) r2, (aolr) null, 0, new defpackage.bgx(bttVar, (aoln) null, 5, (char[]) null), 3);
                }
                return aojh.a;
            case 5:
                java.lang.Object obj7 = this.b;
                defpackage.btt bttVar2 = (defpackage.btt) obj7;
                if (((java.lang.Boolean) bttVar2.b.a(defpackage.btu.a)).booleanValue()) {
                    aoov.an((aoss) this.a, (aolr) null, 0, new defpackage.bgx(bttVar2, (aoln) null, 9, (float[]) null), 3).p(new bly(obj7, this.c, 5));
                }
                return aojh.a;
            case 6:
                if (((java.lang.Boolean) ((defpackage.btt) this.b).b.a(defpackage.btu.b)).booleanValue()) {
                    aoov.an((aoss) this.a, (aolr) null, 0, new defpackage.bgx((defpackage.btt) this.c, (aoln) null, 7, (int[]) null), 3);
                }
                return java.lang.Boolean.TRUE;
            case 7:
                ?? r3 = this.b;
                defpackage.btt bttVar3 = (defpackage.btt) this.a;
                bttVar3.e = r3;
                bttVar3.f = this.c;
                return aojh.a;
            case 8:
                java.lang.Object obj8 = this.b;
                defpackage.btt bttVar4 = (defpackage.btt) obj8;
                if (((java.lang.Boolean) bttVar4.b.a(defpackage.btu.a)).booleanValue()) {
                    aoov.an((aoss) this.a, (aolr) null, 0, new defpackage.bgx(bttVar4, (aoln) null, 13, (char[][]) null), 3).p(new bly(obj8, this.c, 7));
                }
                return aojh.a;
            case 9:
                defpackage.btt bttVar5 = (defpackage.btt) this.b;
                defpackage.btu btuVarC = bttVar5.c();
                ?? r4 = this.a;
                if (btuVarC == defpackage.btu.b && bttVar5.k()) {
                    aoov.an((aoss) r4, (aolr) null, 0, new defpackage.bgx(bttVar5, (aoln) null, 14, (short[][]) null), 3);
                } else {
                    aoov.an((aoss) r4, (aolr) null, 0, new defpackage.bgx(bttVar5, (aoln) null, 15, (int[][]) null), 3).p(new defpackage.bru(this.c, i3));
                }
                return aojh.a;
            case 10:
                defpackage.bwj bwjVar = (defpackage.bwj) this.b;
                if (bwjVar.c()) {
                    ?? r5 = this.c;
                    aoov.an((aoss) this.a, (aolr) null, 0, new defpackage.amj(bwjVar, (aoln) null, 10), 3);
                    r5.b(java.lang.Boolean.FALSE);
                }
                return aojh.a;
            case 11:
                java.lang.Object obj9 = this.c;
                java.lang.Object obj10 = this.b;
                if (obj10 != null) {
                    cfp cfpVar = (cfp) obj9;
                    cfpVar.v(cfpVar.a((cfh) obj10) - cfpVar.o);
                }
                ?? r14 = this.a;
                cfp cfpVar2 = (cfp) obj9;
                java.util.List listC = defpackage.cjq.c(cfpVar2, cfpVar2.o, null);
                return new akwb(ajsz.bT(listC, r14.b()), r14.a());
            case 12:
                ((defpackage.ciw) this.b).a();
                int i5 = ((aoor) this.a).a;
                do {
                    civVar = (civ) ((cix) this.c).b;
                    i = civVar.get();
                } while (!civVar.compareAndSet(i, ((i >>> 27) & 15) == i5 ? i - 1 : i));
                return aojh.a;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_LEFT /* 13 */:
                dbt dbtVar = (dbt) ((aoot) this.a).a;
                adw adwVar = dbtVar.q;
                if (adwVar == null) {
                    long[] jArr = adx.a;
                    adwVar = new adw(6);
                    dbtVar.q = adwVar;
                }
                java.lang.Object obj11 = this.b;
                java.lang.Object objA3 = adwVar.a(obj11);
                if (objA3 == null) {
                    objA3 = new defpackage.dbq(dbtVar, (czi) obj11);
                    adwVar.n(obj11, objA3);
                }
                ?? r15 = this.c;
                defpackage.dbq dbqVar = (defpackage.dbq) objA3;
                dbqVar.o();
                r15.a(dbqVar, obj11);
                return aojh.a;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_RIGHT /* 14 */:
                this.b.e((java.lang.String) this.a, this.c);
                return aojh.a;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_NORMAL_LEFT /* 15 */:
                kiu kiuVar = (kiu) this.b;
                defpackage.kbs kbsVar = new defpackage.kbs(new kcy(kiuVar));
                ?? r6 = this.a;
                r6.a(kbsVar);
                if (this.c == lpv.c) {
                    r6.a(new defpackage.kbq(new kcy(kiuVar)));
                }
                return aojh.a;
            case 16:
                this.a.a(new defpackage.kbn((android.content.Context) this.b, (java.lang.String) this.c));
                return aojh.a;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                android.content.Context context = ((android.view.View) this.b).getContext();
                aooh.e(context, "getContext(...)");
                this.c.c(defpackage.jlr.k(context));
                this.a.a(new defpackage.kbt(null));
                return aojh.a;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                ?? r7 = this.a;
                java.lang.Object obj12 = this.b;
                if (r7 != 0) {
                    ahvr.j((ahth) r7, (android.view.View) obj12);
                } else {
                    android.view.View.OnClickListener onClickListener = ((defpackage.mao) this.c).e;
                    if (onClickListener != null) {
                        onClickListener.onClick((android.view.View) obj12);
                    }
                }
                return aojh.a;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                ((defpackage.krl) this.a).c.a(this.b, this.c);
                return aojh.a;
            default:
                java.lang.Object obj13 = this.b;
                aooh.c(obj13);
                java.lang.Object obj14 = this.c;
                defpackage.loi loiVar = (defpackage.loi) obj14;
                loiVar.b((android.view.View) obj13);
                ((android.support.v7.widget.RecyclerView) obj13).setVisibility(0);
                defpackage.lom lomVar = loiVar.p;
                if (lomVar != null) {
                    defpackage.loc locVar = loiVar.d;
                    int iA = lomVar.a();
                    android.view.View viewN = locVar.N();
                    android.support.v7.widget.RecyclerView recyclerViewFindViewById = viewN.findViewById(2131428773);
                    com.android.dialer.widget.emptycontentview.EmptyContentView emptyContentViewFindViewById = viewN.findViewById(2131428110);
                    if (iA == 0) {
                        if (emptyContentViewFindViewById == null) {
                            emptyContentViewFindViewById = mni.cC(viewN);
                        }
                        emptyContentViewFindViewById.f(2131951676);
                        emptyContentViewFindViewById.g(2132017309);
                        emptyContentViewFindViewById.e(2132017310, new defpackage.lde(obj14, i2));
                        emptyContentViewFindViewById.setVisibility(0);
                        recyclerViewFindViewById.setVisibility(8);
                        ahbv.D(locVar);
                    } else {
                        if (emptyContentViewFindViewById != null) {
                            emptyContentViewFindViewById.setVisibility(8);
                        }
                        recyclerViewFindViewById.setVisibility(0);
                    }
                    java.lang.Object obj15 = this.a;
                    lomVar.e();
                    android.support.v7.widget.LinearLayoutManager linearLayoutManager = loiVar.o;
                    if (linearLayoutManager != null) {
                        ((com.android.dialer.chocolatechip.impl.ui.FastScroller) obj15).b(lomVar, linearLayoutManager);
                    }
                    defpackage.lnx lnxVar = loiVar.j.b;
                    ((com.android.dialer.chocolatechip.impl.ui.FastScroller) obj15).b = lnxVar != null ? lnxVar.b.f : null;
                    aimz aimzVar = zih.a;
                    aoov.al(loiVar.f, zih.b.plus(aols.a), 1, new defpackage.loe((aoln) null, loiVar, 2, (byte[]) null));
                    loiVar.g.o(rmx.lo);
                    aomy aomyVar = loiVar.t;
                    aooh.f(aomyVar, "listener");
                    defpackage.fyr fyrVar = lomVar.a;
                    aooh.f(aomyVar, "listener");
                    aooh.f(aomyVar, "listener");
                    fyrVar.e.e.b(aomyVar);
                }
                return aojh.a;
        }
    }

    public /* synthetic */ af(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, int i) {
        this.$cid = i;
        this.b = obj;
        this.c = obj2;
        this.a = obj3;
    }

    public /* synthetic */ af(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, int i, byte[] bArr) {
        this.$cid = i;
        this.b = obj;
        this.a = obj2;
        this.c = obj3;
    }

    public /* synthetic */ af(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, int i, char[] cArr) {
        this.$cid = i;
        this.c = obj;
        this.a = obj2;
        this.b = obj3;
    }

    public /* synthetic */ af(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, int i, short[] sArr) {
        this.$cid = i;
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
    }

    public /* synthetic */ af(java.lang.Object obj, android.view.View view, java.lang.Object obj2, int i) {
        this.$cid = i;
        this.c = obj;
        this.b = view;
        this.a = obj2;
    }
}
