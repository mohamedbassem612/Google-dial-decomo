package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final /* synthetic */ class cju implements defpackage.aonj {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;
    public final /* synthetic */ java.lang.Object b;
    public final /* synthetic */ java.lang.Object c;

    public /* synthetic */ cju(defpackage.grp grpVar, java.lang.String str, int i) {
        this.$cid = i;
        this.c = "UPDATE workspec SET output=? WHERE id=?";
        this.b = grpVar;
        this.a = str;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v8, types: [aowi, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v18, types: [emx, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v3, types: [aonn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0, types: [cyi, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v0, types: [aonp, java.lang.Object] */
    @Override // defpackage.aonj
    public final java.lang.Object a(java.lang.Object obj) {
        int iIntValue;
        int i;
        int i2 = this.$cid;
        if (i2 == 0) {
            defpackage.cjw cjwVar = (defpackage.cjw) this.b;
            defpackage.adw adwVar = cjwVar.d;
            java.lang.Object obj2 = this.a;
            if (defpackage.adw.f(adwVar, obj2)) {
                throw new java.lang.IllegalArgumentException(defpackage.a.bg(obj2, "Key ", " was used multiple times "));
            }
            java.lang.Object obj3 = this.c;
            cjwVar.b.remove(obj2);
            adwVar.n(obj2, obj3);
            return new defpackage.cjv(cjwVar, obj2, (defpackage.cka) obj3);
        }
        if (i2 == 1) {
            defpackage.czb czbVar = (defpackage.czb) obj;
            defpackage.cxi cxiVarO = czbVar.o();
            if (cxiVarO != null) {
                java.lang.Object obj4 = this.b;
                if (this.c.dw()) {
                    ((defpackage.ahm) obj4).a.c = cxiVarO;
                } else {
                    ((defpackage.ahm) obj4).a.b = cxiVarO;
                }
            }
            czbVar.s((defpackage.czc) this.a, 0, 0, 0.0f);
            return defpackage.aojh.a;
        }
        int i3 = 2;
        if (i2 != 2) {
            if (i2 == 3) {
                defpackage.gjh gjhVar = (defpackage.gjh) obj;
                java.lang.Object obj5 = this.a;
                java.lang.Object obj6 = this.b;
                if (gjhVar == null) {
                    defpackage.aooh.i("_connection");
                }
                defpackage.gin ginVarA = gjhVar.a((java.lang.String) this.c);
                try {
                    defpackage.grp grpVar = defpackage.grp.a;
                    ginVarA.f(1, defpackage.gus.A((defpackage.grp) obj6));
                    ginVarA.j(2, (java.lang.String) obj5);
                    ginVarA.m();
                    return defpackage.aojh.a;
                } finally {
                    ginVarA.close();
                }
            }
            if (i2 == 4) {
                defpackage.gjh gjhVar2 = (defpackage.gjh) obj;
                java.lang.Object obj7 = this.a;
                java.lang.Object obj8 = this.b;
                if (gjhVar2 == null) {
                    defpackage.aooh.i("_connection");
                }
                defpackage.gin ginVarA2 = gjhVar2.a((java.lang.String) this.c);
                try {
                    ginVarA2.h(1, defpackage.gus.l((defpackage.gsw) obj8));
                    ginVarA2.j(2, (java.lang.String) obj7);
                    ginVarA2.m();
                    return java.lang.Integer.valueOf(defpackage.dez.i(gjhVar2));
                } finally {
                    ginVarA2.close();
                }
            }
            if (i2 == 5) {
                if (((defpackage.cdh) obj) == null) {
                    defpackage.aooh.i("$this$DisposableEffect");
                }
                java.lang.Object obj9 = this.b;
                java.lang.Object obj10 = this.a;
                ?? r12 = this.c;
                defpackage.ne neVar = new defpackage.ne(obj10, obj9, i3);
                r12.P().c(neVar);
                return new defpackage.kcp((defpackage.emx) r12, (defpackage.emv) neVar, 0);
            }
            java.lang.Object obj11 = this.b;
            java.lang.Object obj12 = this.c;
            defpackage.ajsy ajsyVar = (defpackage.ajsy) obj;
            java.lang.String str = (java.lang.String) obj12;
            defpackage.ahct ahctVar = (defpackage.ahct) obj11;
            if (ahctVar.c(str, ajsyVar)) {
                return defpackage.aiql.z(null);
            }
            defpackage.ajcq ajcqVarA = ahctVar.a(str, ajsyVar);
            if (ajsyVar != null) {
                if (ajsyVar.c == 2) {
                    iIntValue = ((java.lang.Integer) ajsyVar.d).intValue();
                } else {
                    i = 0;
                }
                defpackage.ajcq ajcqVarI = defpackage.ahvr.I(ajcqVarA, new defpackage.afgz(new defpackage.ahcq((defpackage.aonp) this.a, str, i, ahctVar, ajsyVar, 0), 13), ahctVar.a);
                defpackage.ahda ahdaVarAi = defpackage.ahvr.ai(ajcqVarI);
                defpackage.lkf lkfVar = new defpackage.lkf(obj11, obj12, 11);
                defpackage.ajbm ajbmVar = defpackage.ajbm.INSTANCE;
                return defpackage.ahvr.ak(ajcqVarI, ahdaVarAi.p(lkfVar, ajbmVar)).o(new defpackage.vcz(ajcqVarI, 16), ajbmVar);
            }
            iIntValue = ahctVar.b;
            i = iIntValue;
            defpackage.ajcq ajcqVarI2 = defpackage.ahvr.I(ajcqVarA, new defpackage.afgz(new defpackage.ahcq((defpackage.aonp) this.a, str, i, ahctVar, ajsyVar, 0), 13), ahctVar.a);
            defpackage.ahda ahdaVarAi2 = defpackage.ahvr.ai(ajcqVarI2);
            defpackage.lkf lkfVar2 = new defpackage.lkf(obj11, obj12, 11);
            defpackage.ajbm ajbmVar2 = defpackage.ajbm.INSTANCE;
            return defpackage.ahvr.ak(ajcqVarI2, ahdaVarAi2.p(lkfVar2, ajbmVar2)).o(new defpackage.vcz(ajcqVarI2, 16), ajbmVar2);
        }
        java.lang.Throwable th = (java.lang.Throwable) obj;
        this.c.a(th);
        ?? r0 = ((defpackage.kgl) this.b).a;
        r0.e(th);
        while (true) {
            java.lang.Object objA = defpackage.aowm.a(r0.m());
            if (objA == null) {
                return defpackage.aojh.a;
            }
            this.a.a(objA, th);
        }
    }

    public /* synthetic */ cju(defpackage.cjw cjwVar, java.lang.Object obj, defpackage.cka ckaVar, int i) {
        this.$cid = i;
        this.b = cjwVar;
        this.a = obj;
        this.c = ckaVar;
    }

    public /* synthetic */ cju(defpackage.emx emxVar, defpackage.kca kcaVar, defpackage.cek cekVar, int i) {
        this.$cid = i;
        this.c = emxVar;
        this.a = kcaVar;
        this.b = cekVar;
    }

    public /* synthetic */ cju(defpackage.ahct ahctVar, java.lang.String str, defpackage.aonp aonpVar, int i) {
        this.$cid = i;
        this.b = ahctVar;
        this.c = str;
        this.a = aonpVar;
    }

    public /* synthetic */ cju(defpackage.gsw gswVar, java.lang.String str, int i) {
        this.$cid = i;
        this.c = "UPDATE workspec SET state=? WHERE id=?";
        this.b = gswVar;
        this.a = str;
    }

    public /* synthetic */ cju(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, int i) {
        this.$cid = i;
        this.c = obj;
        this.b = obj2;
        this.a = obj3;
    }
}
