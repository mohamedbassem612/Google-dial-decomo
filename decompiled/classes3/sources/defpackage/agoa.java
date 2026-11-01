package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class agoa implements emj {
    public java.lang.Object b;
    public final apjb d;
    private final amwv e;
    private final defpackage.agom f;
    private final defpackage.ahfe g;
    private final aoir h;
    private final boolean i;
    public static final defpackage.agwm c = new defpackage.agwm((byte[]) null);
    public static final aimz a = aimz.i("com/google/apps/tiktok/account/api/controller/ActivityAccountState");

    public agoa(amwv amwvVar, apjb apjbVar, defpackage.agom agomVar, ahyn ahynVar, defpackage.ahfe ahfeVar) {
        aoir eocVar;
        aooh.f(amwvVar, "screenHost");
        aooh.f(apjbVar, "uiCallbacksHandler");
        aooh.f(agomVar, "keepStateCallbacksHandler");
        aooh.f(ahynVar, "disabledForMigration");
        aooh.f(ahfeVar, "accountComponentManagers");
        this.e = amwvVar;
        this.d = apjbVar;
        this.f = agomVar;
        this.g = ahfeVar;
        int iD = amwvVar.d() - 1;
        if (iD == 0) {
            android.app.Activity activityA = amwvVar.a();
            bmx bmxVar = new bmx(activityA, 19);
            aopu[] aopuVarArr = aoou.a;
            eocVar = new eoc(new aooa(defpackage.agoi.class), new bmx(activityA, 20), bmxVar, new defpackage.agob(activityA, 1));
        } else if (iD != 1) {
            aw awVarB = amwvVar.b();
            aoir aoirVarAh = aooc.ah(3, new defpackage.agob(new defpackage.agob(awVarB, 0), 2));
            aopu[] aopuVarArr2 = aoou.a;
            eocVar = zb.k(awVarB, new aooa(defpackage.agoi.class), new defpackage.agob(aoirVarAh, 3), new defpackage.agob(aoirVarAh, 4), new jll(awVarB, aoirVarAh, 4));
        } else {
            ahgd ahgdVarE = amwvVar.e();
            aopu[] aopuVarArr3 = aoou.a;
            eocVar = new eoc(new aooa(defpackage.agoi.class), new defpackage.addr(ahgdVarE, 18), new defpackage.addr(ahgdVarE, 19), new defpackage.addr(ahgdVarE, 20));
        }
        this.h = eocVar;
        this.i = ((java.lang.Boolean) ahynVar.d(java.lang.Boolean.FALSE)).booleanValue();
        amwvVar.P().c(this);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: aois */
    public final void a(emx emxVar) throws aois {
        boolean z = false;
        if (h().c && !this.i && h().b) {
            z = true;
        }
        h().b = this.i;
        if (z) {
            h().a = defpackage.agog.a;
            c.f(defpackage.agwm.e(this.e));
            return;
        }
        defpackage.agoh agohVar = h().a;
        if (aooh.n(agohVar, defpackage.agoe.a)) {
            this.d.D();
            return;
        }
        if (agohVar instanceof defpackage.agof) {
            apjb apjbVar = this.d;
            defpackage.agof agofVar = (defpackage.agof) agohVar;
            com.google.apps.tiktok.account.AccountId.b(agofVar.a);
            apjbVar.F(agofVar.b);
            return;
        }
        if (aooh.n(agohVar, defpackage.agod.a)) {
            this.d.C();
        } else if (!aooh.n(agohVar, defpackage.agog.a)) {
            throw new aois();
        }
    }

    public final int g() {
        afec.c();
        defpackage.agoh agohVar = h().a;
        defpackage.agof agofVar = agohVar instanceof defpackage.agof ? (defpackage.agof) agohVar : null;
        if (agofVar != null) {
            return agofVar.a;
        }
        return -1;
    }

    public final defpackage.agoi h() {
        return (defpackage.agoi) this.h.a();
    }

    public final void i() {
        n(defpackage.agog.a);
    }

    public final void j() {
        defpackage.agwm.e(this.e).af();
    }

    public final void k(agnf agnfVar) {
        if (android.util.Log.isLoggable("ActivityAccountState", 3)) {
            android.util.Log.d("ActivityAccountState", "Switch To Error", agnfVar);
        }
        n(defpackage.agod.a);
        apjb apjbVar = this.d;
        apjbVar.C();
        ahoq ahoqVarW = ahvr.W(1286, "onNoAccountAvailable");
        try {
            ailj ailjVarK = ((aile) apjbVar.a).k();
            while (ailjVarK.hasNext()) {
                ((defpackage.agnu) ailjVarK.next()).c();
            }
            java.util.Iterator it = ((java.util.ArrayList) apjbVar.b).iterator();
            while (it.hasNext()) {
                ((defpackage.agnu) it.next()).c();
            }
            ahoqVarW.close();
        } catch (java.lang.Throwable th) {
            try {
                ahoqVarW.close();
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void l() {
        if (android.util.Log.isLoggable("ActivityAccountState", 3)) {
            android.util.Log.d("ActivityAccountState", "Switch To Loading");
        }
        if (n(defpackage.agoe.a)) {
            apjb apjbVar = this.d;
            apjbVar.D();
            ahoq ahoqVarW = ahvr.W(1287, "onAccountLoading");
            try {
                ailj ailjVarK = ((aile) apjbVar.a).k();
                while (ailjVarK.hasNext()) {
                    ((defpackage.agnu) ailjVarK.next()).a();
                }
                java.util.Iterator it = ((java.util.ArrayList) apjbVar.b).iterator();
                while (it.hasNext()) {
                    ((defpackage.agnu) it.next()).a();
                }
                ahoqVarW.close();
            } catch (java.lang.Throwable th) {
                try {
                    ahoqVarW.close();
                } catch (java.lang.Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
    }

    public final boolean m() {
        afec.c();
        return h().a instanceof defpackage.agof;
    }

    /* JADX WARN: Code duplicated, block: B:114:0x00f1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:116:0x00d9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:43:0x00fa A[Catch: all -> 0x0138, TryCatch #2 {all -> 0x0138, blocks: (B:41:0x00f1, B:43:0x00fa, B:44:0x0102, B:46:0x0108, B:47:0x0115, B:49:0x011c, B:51:0x012a, B:52:0x012e), top: B:114:0x00f1, outer: #3 }] */
    /* JADX WARN: Code duplicated, block: B:46:0x0108 A[Catch: all -> 0x0138, LOOP:0: B:44:0x0102->B:46:0x0108, LOOP_END, TryCatch #2 {all -> 0x0138, blocks: (B:41:0x00f1, B:43:0x00fa, B:44:0x0102, B:46:0x0108, B:47:0x0115, B:49:0x011c, B:51:0x012a, B:52:0x012e), top: B:114:0x00f1, outer: #3 }] */
    /* JADX WARN: Code duplicated, block: B:49:0x011c A[Catch: all -> 0x0138, TryCatch #2 {all -> 0x0138, blocks: (B:41:0x00f1, B:43:0x00fa, B:44:0x0102, B:46:0x0108, B:47:0x0115, B:49:0x011c, B:51:0x012a, B:52:0x012e), top: B:114:0x00f1, outer: #3 }] */
    /* JADX WARN: Code duplicated, block: B:50:0x0129  */
    /* JADX WARN: Code duplicated, block: B:54:0x0131 A[Catch: all -> 0x013c, TRY_ENTER, TryCatch #3 {, blocks: (B:39:0x00d9, B:40:0x00f0, B:54:0x0131, B:55:0x0134, B:58:0x0137, B:41:0x00f1, B:43:0x00fa, B:44:0x0102, B:46:0x0108, B:47:0x0115, B:49:0x011c, B:51:0x012a, B:52:0x012e), top: B:116:0x00d9, outer: #4, inners: #2 }] */
    /* JADX WARN: Type inference failed for: r6v17, types: [java.lang.Object, java.util.Map] */
    public final boolean n(defpackage.agoh agohVar) {
        aw awVarB;
        ahgd ahgdVarE;
        amxh amxhVarC;
        defpackage.ahfh ahfhVarA;
        enr enrVar;
        defpackage.ahga ahgaVar;
        amxh amxhVarA;
        afec.c();
        this.f.g();
        if (aooh.n(h().a, agohVar)) {
            return false;
        }
        j();
        boolean z = agohVar instanceof defpackage.agof;
        if (z || !(h().a instanceof defpackage.agog)) {
            c.f(defpackage.agwm.e(this.e));
        }
        defpackage.agoh agohVar2 = h().a;
        h().a = agohVar;
        if ((agohVar2 instanceof defpackage.agof) || z) {
            defpackage.ahfe ahfeVar = this.g;
            com.google.apps.tiktok.account.AutoValue_AccountId autoValue_AccountIdB = com.google.apps.tiktok.account.AccountId.b(g());
            synchronized (ahfeVar.d) {
                java.util.Set setA = ahfeVar.a();
                android.app.Activity activityA = null;
                if (!setA.isEmpty()) {
                    com.google.apps.tiktok.account.AccountId accountId = (com.google.apps.tiktok.account.AccountId) ahvr.bm(setA);
                    amwv amwvVar = ahfeVar.b;
                    if (amwvVar.d() == 1 || amwvVar.d() == 2) {
                        defpackage.aljf aljfVarK = ((ahfd) aooc.ar(ahfeVar.f, ahfd.class)).k();
                        synchronized (aljfVarK.b) {
                            try {
                                ?? r6 = aljfVarK.c;
                                ahvr.bY(r6.containsKey(accountId));
                                defpackage.ahfr ahfrVar = (defpackage.ahfr) r6.remove(accountId);
                                defpackage.ahfn ahfnVarA = ahfrVar.b.a(ahfrVar.a);
                                synchronized (ahfnVarA.e) {
                                    try {
                                        enr enrVar2 = ahfnVarA.a;
                                        for (java.lang.String str : enrVar2.b()) {
                                            enrVar2.f(str);
                                            enrVar2.c(str);
                                        }
                                        amxhVarC = ahfnVarA.f != null ? ((defpackage.ahfm) aooc.ar(ahfnVarA.f, defpackage.ahfm.class)).c() : null;
                                        ahfnVarA.f = null;
                                    } catch (java.lang.Throwable th) {
                                        throw th;
                                    }
                                }
                                if (amxhVarC != null) {
                                    amxhVarC.b();
                                }
                            } catch (java.lang.Throwable th2) {
                                throw th2;
                            }
                        }
                        synchronized (ahfeVar.d) {
                            java.util.Map map = ahfeVar.e;
                            ahvr.bY(map.containsKey(accountId));
                            ahfhVarA = ((defpackage.ahfc) map.remove(accountId)).a.a();
                            synchronized (ahfhVarA.d) {
                                try {
                                    amxw amxwVar = ahfhVarA.b;
                                    ajsz.dF();
                                    enrVar = amxwVar.b;
                                    if (enrVar != null) {
                                        for (java.lang.String str2 : enrVar.b()) {
                                            enrVar.f(str2);
                                            enrVar.c(str2);
                                        }
                                    }
                                    amxwVar.a();
                                    ahgaVar = ahfhVarA.e;
                                    if (ahgaVar != null) {
                                        amxhVarA = ((defpackage.ahfi) aooc.ar(ahgaVar, defpackage.ahfi.class)).a();
                                    } else {
                                        amxhVarA = null;
                                    }
                                    ahfhVarA.e = null;
                                    ahfhVarA.a = null;
                                } catch (java.lang.Throwable th3) {
                                    throw th3;
                                }
                            }
                            if (amxhVarA != null) {
                                amxhVarA.b();
                            }
                        }
                    } else {
                        synchronized (ahfeVar.d) {
                            java.util.Map map2 = ahfeVar.e;
                            ahvr.bY(map2.containsKey(accountId));
                            ahfhVarA = ((defpackage.ahfc) map2.remove(accountId)).a.a();
                            synchronized (ahfhVarA.d) {
                                amxw amxwVar2 = ahfhVarA.b;
                                ajsz.dF();
                                enrVar = amxwVar2.b;
                                if (enrVar != null) {
                                    while (r11.hasNext()) {
                                        enrVar.f(str2);
                                        enrVar.c(str2);
                                    }
                                }
                                amxwVar2.a();
                                ahgaVar = ahfhVarA.e;
                                if (ahgaVar != null) {
                                    amxhVarA = ((defpackage.ahfi) aooc.ar(ahgaVar, defpackage.ahfi.class)).a();
                                } else {
                                    amxhVarA = null;
                                }
                                ahfhVarA.e = null;
                                ahfhVarA.a = null;
                                if (amxhVarA != null) {
                                    amxhVarA.b();
                                }
                            }
                        }
                    }
                }
                java.util.Map map3 = ahfeVar.e;
                java.util.Set setA2 = ahfeVar.a();
                if (!ahfeVar.c && !setA2.isEmpty() && (setA2.size() != 1 || !setA2.contains(autoValue_AccountIdB))) {
                    java.lang.IllegalStateException illegalStateException = new java.lang.IllegalStateException("There is already an account id in use! TikTok does not support multiple accounts yet.\n\tCurrent AccountId: " + java.lang.String.valueOf(setA2) + "\n\tNew AccountId: " + autoValue_AccountIdB.toString());
                    defpackage.ahfe.a.c().k(illegalStateException).l("com/google/apps/tiktok/inject/account/ScreenAccountComponentManagers", "createManager", 99, "ScreenAccountComponentManagers.java").M("There is already an account id in use! TikTok does not support multiple accounts yet. # of current account ids: %s, current account valid: %s, new account valid: %s", new defpackage.aepb((long) setA2.size()), setA2.size() == 1 ? new defpackage.aepc(((com.google.apps.tiktok.account.AccountId) ahvr.bm(setA2)).a() != -1) : new aepg("N/A"), new defpackage.aepc(autoValue_AccountIdB.a != -1));
                    throw illegalStateException;
                }
                amwv amwvVar2 = ahfeVar.b;
                int iD = amwvVar2.d() - 1;
                if (iD == 0) {
                    awVarB = null;
                    activityA = amwvVar2.a();
                    ahgdVarE = null;
                } else if (iD != 1) {
                    awVarB = amwvVar2.b();
                    ahgdVarE = null;
                } else {
                    ahgdVarE = amwvVar2.e();
                    awVarB = null;
                }
                map3.put(autoValue_AccountIdB, new defpackage.ahfc(autoValue_AccountIdB, new defpackage.ahfs(activityA, ahgdVarE, awVarB), ahfeVar.f));
            }
            if (android.util.Log.isLoggable("ActivityAccountState", 3)) {
                android.util.Log.d("ActivityAccountState", a.bi(agohVar, agohVar2, "Account Transition: ", " > + "));
            }
        }
        return true;
    }

    public final /* synthetic */ void b(emx emxVar) {
    }

    public final /* synthetic */ void c(emx emxVar) {
    }

    public final /* synthetic */ void e(emx emxVar) {
    }

    public final /* synthetic */ void f(emx emxVar) {
    }

    public final /* synthetic */ void fn(emx emxVar) {
    }
}
