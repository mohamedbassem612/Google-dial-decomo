package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final /* synthetic */ class dcg implements defpackage.aomy {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;
    public final /* synthetic */ java.lang.Object b;
    public final /* synthetic */ java.lang.Object c;

    public /* synthetic */ dcg(defpackage.aogc aogcVar, defpackage.guq guqVar, java.lang.String str, int i) {
        this.$cid = i;
        this.b = aogcVar;
        this.a = guqVar;
        this.c = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v2, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r1v1, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v4, types: [cer, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v7, types: [android.view.View$OnAttachStateChangeListener, java.lang.Object] */
    @Override // defpackage.aomy
    public final java.lang.Object a() {
        int i = this.$cid;
        if (i == 0) {
            ?? r1 = this.a;
            defpackage.cra craVar = defpackage.dck.t;
            r1.a(craVar);
            defpackage.dck dckVar = (defpackage.dck) this.b;
            boolean zN = defpackage.aooh.n(dckVar.D, craVar.m);
            boolean z = dckVar.G;
            boolean z2 = craVar.n;
            craVar.u = craVar.m.a(craVar.p, craVar.s, craVar.r);
            defpackage.cpn cpnVar = dckVar.F;
            defpackage.cqx cqxVar = craVar.u;
            defpackage.cpn cpnVarA = cqxVar != null ? cqxVar.a() : null;
            java.lang.Object obj = this.c;
            boolean z3 = z != z2;
            boolean zN2 = defpackage.aooh.n(cpnVar, cpnVarA);
            ((defpackage.aoop) obj).a = !zN2;
            if (!zN || z3 || !zN2) {
                dckVar.D = craVar.m;
                dckVar.G = craVar.n;
                defpackage.cqx cqxVar2 = craVar.u;
                dckVar.F = cqxVar2 != null ? cqxVar2.a() : defpackage.cpn.a;
                defpackage.cqx cqxVar3 = craVar.u;
                dckVar.E = cqxVar3 != null ? defpackage.dfd.h(defpackage.dfd.j(cqxVar3.a())) : defpackage.cpn.a;
                if (dckVar.H && (z3 || (dckVar.G && !zN))) {
                    dckVar.w.I();
                }
            }
            dckVar.H = true;
            return defpackage.aojh.a;
        }
        if (i == 1) {
            defpackage.bar barVar = (defpackage.bar) this.c.a();
            defpackage.bbh bbhVar = (defpackage.bbh) this.a;
            return new defpackage.bas(bbhVar, barVar, (defpackage.nf) this.b, new defpackage.aaif(bbhVar.e.c.a(), barVar));
        }
        if (i == 2) {
            ?? r2 = this.c;
            java.lang.Object obj2 = this.b;
            ((defpackage.ddl) obj2).removeOnAttachStateChangeListener(r2);
            ((java.util.ArrayList) defpackage.eaw.f((android.view.View) obj2).a).remove(this.a);
            return defpackage.aojh.a;
        }
        int i2 = 3;
        if (i == 3) {
            defpackage.gyc.a(new defpackage.guc((defpackage.guq) this.a, (java.lang.String) this.c, 2, defpackage.ajsz.aY(this.b)));
            return defpackage.aojh.a;
        }
        java.lang.Object obj3 = this.a;
        if (i != 4) {
            defpackage.apod apodVar = ((defpackage.apih) obj3).b;
            defpackage.aooh.c(apodVar);
            return apodVar.a(((defpackage.apit) this.c).a(), ((defpackage.apib) this.b).i.b);
        }
        java.lang.Object obj4 = this.c;
        defpackage.aogc aogcVar = (defpackage.aogc) this.b;
        java.lang.String str = (java.lang.String) obj4;
        defpackage.guq guqVar = (defpackage.guq) obj3;
        defpackage.dcg dcgVar = new defpackage.dcg(aogcVar, guqVar, str, i2);
        defpackage.gxm gxmVarD = guqVar.e.D();
        java.util.List listJ = gxmVarD.j(str);
        if (listJ.size() > 1) {
            throw new java.lang.UnsupportedOperationException("Can't apply UPDATE policy to the chains of work.");
        }
        defpackage.gxj gxjVar = (defpackage.gxj) defpackage.ajsz.bG(listJ);
        if (gxjVar == null) {
            dcgVar.a();
            return defpackage.aojh.a;
        }
        java.lang.String str2 = gxjVar.a;
        defpackage.gxl gxlVarC = gxmVarD.c(str2);
        if (gxlVarC == null) {
            throw new java.lang.IllegalStateException(defpackage.a.bD(str, str2, "WorkSpec with ", ", that matches a name \"", "\", wasn't found"));
        }
        if (!gxlVarC.d()) {
            throw new java.lang.UnsupportedOperationException("Can't update OneTimeWorker to Periodic Worker. Update operation must preserve worker's type.");
        }
        if (gxjVar.b == defpackage.gsw.f) {
            gxmVarD.l(str2);
            dcgVar.a();
            return defpackage.aojh.a;
        }
        final defpackage.gxl gxlVarE = defpackage.gxl.e((defpackage.gxl) aogcVar.a, str2, null, null, null, 0, 0L, 0, 0, 0L, 0, 33554430);
        defpackage.gtr gtrVar = guqVar.g;
        defpackage.aooh.e(gtrVar, "getProcessor(...)");
        final androidx.work.impl.WorkDatabase workDatabase = guqVar.e;
        defpackage.aooh.e(workDatabase, "getWorkDatabase(...)");
        defpackage.grk grkVar = guqVar.d;
        defpackage.aooh.e(grkVar, "<get-configuration>(...)");
        final java.util.List list = guqVar.f;
        defpackage.aooh.e(list, "getSchedulers(...)");
        final ?? r11 = aogcVar.c;
        final java.lang.String str3 = gxlVarE.b;
        final defpackage.gxl gxlVarC2 = workDatabase.D().c(str3);
        if (gxlVarC2 == null) {
            throw new java.lang.IllegalArgumentException(defpackage.a.bk(str3, "Worker with ", " doesn't exist"));
        }
        if (!gxlVarC2.c.a()) {
            if (gxlVarC2.d() ^ gxlVarE.d()) {
                guv guvVar = new guv(0);
                throw new java.lang.UnsupportedOperationException("Can't update " + guvVar.a(gxlVarC2) + " Worker to " + guvVar.a(gxlVarE) + " Worker. Update operation must preserve worker's type.");
            }
            final boolean zF = gtrVar.f(str3);
            if (!zF) {
                java.util.ListIterator listIterator = ((defpackage.aokv) list).listIterator(0);
                while (listIterator.hasNext()) {
                    ((defpackage.gtt) listIterator.next()).b(str3);
                }
            }
            workDatabase.p(new java.lang.Runnable() { // from class: guw
                @Override // java.lang.Runnable
                public final void run() {
                    defpackage.gxl gxlVar = gxlVarE;
                    defpackage.gxl gxlVar2 = gxlVarC2;
                    int i3 = gxlVar2.u;
                    androidx.work.impl.WorkDatabase workDatabase2 = workDatabase;
                    defpackage.gxm gxmVarD2 = workDatabase2.D();
                    defpackage.gxx gxxVarE = workDatabase2.E();
                    defpackage.gxl gxlVarE2 = defpackage.gxl.e(gxlVar, null, gxlVar2.c, null, null, gxlVar2.l, gxlVar2.o, gxlVar2.t, i3 + 1, gxlVar2.v, gxlVar2.w, 29613053);
                    if (gxlVar.w == 1) {
                        gxlVarE2.v = gxlVar.v;
                        gxlVarE2.w++;
                    }
                    if (list == null) {
                        defpackage.aooh.i("schedulers");
                    }
                    boolean z4 = zF;
                    java.util.Set set = r11;
                    java.lang.String str4 = str3;
                    gxmVarD2.s(defpackage.gus.d(gxlVarE2));
                    gxxVarE.b(str4);
                    gxxVarE.c(str4, set);
                    if (z4) {
                        return;
                    }
                    gxmVarD2.w(str4, -1L);
                    workDatabase2.C().a(str4);
                }
            });
            if (!zF) {
                defpackage.gtv.a(grkVar, workDatabase, list);
            }
        }
        return defpackage.aojh.a;
    }

    public /* synthetic */ dcg(defpackage.aonj aonjVar, defpackage.dck dckVar, defpackage.aoop aoopVar, int i) {
        this.$cid = i;
        this.a = aonjVar;
        this.b = dckVar;
        this.c = aoopVar;
    }

    public /* synthetic */ dcg(defpackage.cer cerVar, defpackage.bbh bbhVar, defpackage.nf nfVar, int i) {
        this.$cid = i;
        this.c = cerVar;
        this.a = bbhVar;
        this.b = nfVar;
    }

    public /* synthetic */ dcg(defpackage.ddl ddlVar, defpackage.cpt cptVar, defpackage.apnt apntVar, int i) {
        this.$cid = i;
        this.b = ddlVar;
        this.c = cptVar;
        this.a = apntVar;
    }

    public /* synthetic */ dcg(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, int i) {
        this.$cid = i;
        this.a = obj;
        this.c = obj2;
        this.b = obj3;
    }
}
