package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final /* synthetic */ class ahcw implements defpackage.ahek {
    public final /* synthetic */ j$.util.Optional a;
    public final /* synthetic */ defpackage.aoin b;
    public final /* synthetic */ defpackage.ahct c;
    public final /* synthetic */ defpackage.aexi d;
    public final /* synthetic */ defpackage.adag e;

    public /* synthetic */ ahcw(defpackage.adag adagVar, j$.util.Optional optional, defpackage.aoin aoinVar, defpackage.ahct ahctVar, defpackage.aexi aexiVar) {
        this.e = adagVar;
        this.a = optional;
        this.b = aoinVar;
        this.c = ahctVar;
        this.d = aexiVar;
    }

    /* JADX WARN: Type inference failed for: r13v2, types: [ajct, java.lang.Object] */
    @Override // defpackage.ahek
    public final defpackage.ajcq a() throws java.io.IOException {
        if (!defpackage.agab.aT(this.e, this.a)) {
            return defpackage.ajcm.a;
        }
        defpackage.ahct ahctVar = this.c;
        java.lang.Object objA = this.b.a();
        defpackage.aooh.e(objA, "get(...)");
        int i = 12;
        if (!((java.lang.Boolean) defpackage.aooh.p((j$.util.Optional) objA, java.lang.Boolean.FALSE)).booleanValue()) {
            defpackage.ahcy ahcyVar = new defpackage.ahcy(this.d);
            defpackage.ahou ahouVar = defpackage.ahot.a;
            defpackage.ahoq ahoqVarX = defpackage.ahvr.X(1364, "Registering packages with phenotype", ahouVar, true);
            try {
                defpackage.aihd aihdVarKeySet = ((defpackage.aikj) ahctVar.f).keySet();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                defpackage.ailj it = ((defpackage.aikh) aihdVarKeySet).iterator();
                while (it.hasNext()) {
                    java.lang.Object next = it.next();
                    java.lang.Object obj = ahctVar.j;
                    ((j$.util.Optional) obj).isPresent();
                    defpackage.aooh.e(obj, "map(...)");
                    if (((java.lang.Boolean) defpackage.aooh.p((j$.util.Optional) obj, java.lang.Boolean.TRUE)).booleanValue()) {
                        arrayList.add(next);
                    }
                }
                java.util.ArrayList arrayList2 = new java.util.ArrayList(defpackage.ajsz.bl(arrayList, 10));
                java.util.Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    java.lang.String strC = ((defpackage.apnt) ahctVar.l).c((java.lang.String) it2.next());
                    defpackage.ahoq ahoqVarX2 = defpackage.ahvr.X(1366, "Getting registration info from individual reader", ahouVar, true);
                    try {
                        java.lang.Object obj2 = ahctVar.k;
                        defpackage.ajcq ajcqVarSubmit = ((defpackage.apdi) obj2).b.submit(defpackage.ahqx.i(new defpackage.nyf(obj2, strC, 18)));
                        defpackage.aooh.e(ajcqVarSubmit, "submit(...)");
                        ahoqVarX2.a(ajcqVarSubmit);
                        defpackage.ajsz.ak(ahoqVarX2, null);
                        defpackage.ajcq ajcqVarI = defpackage.ahvr.I(ajcqVarSubmit, new defpackage.afgz(new defpackage.cju(ahctVar, strC, (defpackage.aonp) ahcyVar, 6), 12), ahctVar.a);
                        final defpackage.nxi nxiVar = new defpackage.nxi(ahctVar, strC, 8);
                        defpackage.ajcq ajcqVarI2 = defpackage.ahvr.I(ajcqVarI, new defpackage.ajat() { // from class: ahcs
                            @Override // defpackage.ajat
                            public final /* synthetic */ defpackage.ajcq a(java.lang.Object obj3) {
                                return (defpackage.ajcq) nxiVar.a(obj3);
                            }
                        }, defpackage.ajbm.INSTANCE);
                        defpackage.agsm.i(1367, ajcqVarI2, "Failed to register for %s", strC);
                        arrayList2.add(ajcqVarI2);
                    } catch (java.lang.Throwable th) {
                        try {
                            throw th;
                        } catch (java.lang.Throwable th2) {
                            defpackage.ajsz.ak(ahoqVarX2, th);
                            throw th2;
                        }
                    }
                }
                defpackage.ajcq ajcqVarP = defpackage.ahvr.ah(arrayList2).p(new defpackage.nya(ahctVar, 20), defpackage.ajbm.INSTANCE);
                ahoqVarX.a(ajcqVarP);
                defpackage.ajsz.ak(ahoqVarX, null);
                return ajcqVarP;
            } catch (java.lang.Throwable th3) {
                try {
                    throw th3;
                } catch (java.lang.Throwable th4) {
                    defpackage.ajsz.ak(ahoqVarX, th3);
                    throw th4;
                }
            }
        }
        defpackage.ahou ahouVar2 = defpackage.ahot.a;
        defpackage.ahoq ahoqVarX3 = defpackage.ahvr.X(1354, "Bulk Registering packages with phenotype", ahouVar2, true);
        try {
            defpackage.aihd aihdVarKeySet2 = ((defpackage.aikj) ahctVar.f).keySet();
            java.util.ArrayList<java.lang.String> arrayList3 = new java.util.ArrayList();
            defpackage.ailj it3 = ((defpackage.aikh) aihdVarKeySet2).iterator();
            while (it3.hasNext()) {
                java.lang.Object next2 = it3.next();
                java.lang.Object obj3 = ahctVar.j;
                ((j$.util.Optional) obj3).isPresent();
                defpackage.aooh.e(obj3, "map(...)");
                if (((java.lang.Boolean) defpackage.aooh.p((j$.util.Optional) obj3, java.lang.Boolean.TRUE)).booleanValue()) {
                    arrayList3.add(next2);
                }
            }
            java.util.ArrayList arrayList4 = new java.util.ArrayList(defpackage.ajsz.bl(arrayList3, 10));
            for (java.lang.String str : arrayList3) {
                java.lang.Object obj4 = ahctVar.l;
                java.lang.String strC2 = ((defpackage.apnt) obj4).c(str);
                defpackage.ahoq ahoqVarX4 = defpackage.ahvr.X(1358, "Getting individual registration info", ahouVar2, true);
                try {
                    java.lang.String strC3 = ((defpackage.apnt) obj4).c(str);
                    defpackage.ahoq ahoqVarX5 = defpackage.ahvr.X(1363, "Getting cacheable registration info from individual reader", ahouVar2, true);
                    try {
                        defpackage.ajcq ajcqVarH = defpackage.ahvr.H(((defpackage.agtc) ((defpackage.apdi) ahctVar.k).c).a(), new ahcu(new agkc(strC3, i), 0), defpackage.ajbm.INSTANCE);
                        ahoqVarX5.a(ajcqVarH);
                        defpackage.ajsz.ak(ahoqVarX5, null);
                        defpackage.ajcq ajcqVarI3 = defpackage.ahvr.I(ajcqVarH, new agpe(new agvo(ahctVar, strC3, 3), 6), ahctVar.a);
                        ahoqVarX4.a(ajcqVarI3);
                        defpackage.ajsz.ak(ahoqVarX4, null);
                        defpackage.agsm.i(1359, ajcqVarI3, "Failed to build registration info for %s", strC2);
                        arrayList4.add(ajcqVarI3);
                        i = 12;
                    } catch (java.lang.Throwable th5) {
                        try {
                            throw th5;
                        } catch (java.lang.Throwable th6) {
                            defpackage.ajsz.ak(ahoqVarX5, th5);
                            throw th6;
                        }
                    }
                } catch (java.lang.Throwable th7) {
                    try {
                        throw th7;
                    } catch (java.lang.Throwable th8) {
                        defpackage.ajsz.ak(ahoqVarX4, th7);
                        throw th8;
                    }
                }
            }
            defpackage.ajcq ajcqVarH2 = defpackage.ahvr.H(defpackage.aiql.F(arrayList4), new agnw(new agkh(11), 20), defpackage.ajbm.INSTANCE);
            defpackage.ahoq ahoqVarX6 = defpackage.ahvr.X(1355, "Bulk registering packages with Phenotype", ahouVar2, true);
            try {
                defpackage.ajcq ajcqVarI4 = defpackage.ahvr.I(ajcqVarH2, new agpe(new agkc(ahctVar, 11), 8), ahctVar.a);
                ahoqVarX6.a(ajcqVarI4);
                defpackage.ajsz.ak(ahoqVarX6, null);
                defpackage.agsm.i(1356, ajcqVarI4, "Failed to bulk register", new java.lang.Object[0]);
                defpackage.ahda ahdaVarAi = defpackage.ahvr.ai(ajcqVarI4);
                adck adckVar = new adck(ajcqVarH2, ahctVar, 14);
                defpackage.ajbm ajbmVar = defpackage.ajbm.INSTANCE;
                defpackage.ajcq ajcqVarP2 = ahdaVarAi.p(adckVar, ajbmVar);
                defpackage.agsm.i(1357, ajcqVarP2, "Failed to set runtime properties or update configs", new java.lang.Object[0]);
                defpackage.ajcq ajcqVarP3 = defpackage.ahvr.ai(ajcqVarP2).p(new adbi(ahctVar, 16), ajbmVar);
                ahoqVarX3.a(ajcqVarP3);
                defpackage.ajsz.ak(ahoqVarX3, null);
                return ajcqVarP3;
            } catch (java.lang.Throwable th9) {
                try {
                    throw th9;
                } catch (java.lang.Throwable th10) {
                    defpackage.ajsz.ak(ahoqVarX6, th9);
                    throw th10;
                }
            }
        } catch (java.lang.Throwable th11) {
            try {
                throw th11;
            } catch (java.lang.Throwable th12) {
                defpackage.ajsz.ak(ahoqVarX3, th11);
                throw th12;
            }
        }
    }
}
