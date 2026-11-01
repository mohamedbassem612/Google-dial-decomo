package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class hql implements defpackage.hqs {
    public final aozj a;
    private final aoss b;
    private final ecx c;
    private final ahda d;
    private final apni e;

    public hql(apni apniVar, aoss aossVar, ecx ecxVar) {
        aooh.f(apniVar, "androidJobs");
        aooh.f(aossVar, "lightweightScope");
        aooh.f(ecxVar, "dataStore");
        this.e = apniVar;
        this.b = aossVar;
        this.c = ecxVar;
        this.d = new ahda((byte[]) null);
        this.a = aozk.a(b(defpackage.hqh.TAB_ID_FAVORITES));
        aoov.an(aossVar, (aolr) null, 0, new defpackage.hqi(this, (aoln) null, 0), 3);
    }

    @Override // defpackage.hqs
    public final /* synthetic */ aoxh a() {
        return this.a;
    }

    public final defpackage.hqg b(defpackage.hqh hqhVar) {
        return new defpackage.hqg(hqhVar, new gbp(this, 4, (int[]) null));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object c(aoln aolnVar) {
        defpackage.hqj hqjVar;
        defpackage.hqh hqhVar;
        if (aolnVar instanceof defpackage.hqj) {
            hqjVar = (defpackage.hqj) aolnVar;
            int i = hqjVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                hqjVar.c = i - Integer.MIN_VALUE;
            } else {
                hqjVar = new defpackage.hqj(this, aolnVar);
            }
        } else {
            hqjVar = new defpackage.hqj(this, aolnVar);
        }
        java.lang.Object objAu = hqjVar.a;
        aolu aoluVar = aolu.a;
        int i2 = hqjVar.c;
        if (i2 == 0) {
            aooc.af(objAu);
            aoxh aoxhVarB = this.c.b();
            hqjVar.c = 1;
            objAu = aoov.au(aoxhVarB, hqjVar);
            if (objAu == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aooc.af(objAu);
        }
        int i3 = ((defpackage.hqf) objAu).b;
        if (i3 == 0) {
            hqhVar = defpackage.hqh.TAB_ID_UNKNOWN;
        } else if (i3 == 1) {
            hqhVar = defpackage.hqh.TAB_ID_FAVORITES;
        } else if (i3 == 2) {
            hqhVar = defpackage.hqh.TAB_ID_RECENTS;
        } else if (i3 != 3) {
            hqhVar = i3 != 4 ? null : defpackage.hqh.TAB_ID_DIALPAD;
        } else {
            hqhVar = defpackage.hqh.TAB_ID_CONTACTS;
        }
        if (hqhVar == null) {
            hqhVar = defpackage.hqh.UNRECOGNIZED;
        }
        return hqhVar == defpackage.hqh.TAB_ID_UNKNOWN ? b(defpackage.hqh.TAB_ID_FAVORITES) : b(hqhVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object d(defpackage.hqh hqhVar, aoln aolnVar) {
        defpackage.hqk hqkVar;
        java.lang.Throwable th;
        ahoq ahoqVar;
        if (aolnVar instanceof defpackage.hqk) {
            hqkVar = (defpackage.hqk) aolnVar;
            int i = hqkVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                hqkVar.c = i - Integer.MIN_VALUE;
            } else {
                hqkVar = new defpackage.hqk(this, aolnVar);
            }
        } else {
            hqkVar = new defpackage.hqk(this, aolnVar);
        }
        java.lang.Object obj = hqkVar.a;
        aolu aoluVar = aolu.a;
        int i2 = hqkVar.c;
        if (i2 == 0) {
            aooc.af(obj);
            if (!ahvr.R(hqkVar.u())) {
                throw new java.lang.IllegalStateException("TikTok trace may not live through suspension without TikTok provided CoroutineContext");
            }
            ahoq ahoqVarZ = ahvr.Z(74, "TabModel_updateLastSelectedTabInDataStore");
            try {
                ecx ecxVar = this.c;
                bpj bpjVar = new bpj(hqhVar, (aoln) null, 4);
                hqkVar.d = ahoqVarZ;
                hqkVar.c = 1;
                java.lang.Object objA = ecxVar.a(bpjVar, hqkVar);
                if (objA == aoluVar) {
                    return aoluVar;
                }
                obj = objA;
                ahoqVar = ahoqVarZ;
            } catch (java.lang.Throwable th2) {
                th = th2;
                ahoqVar = ahoqVarZ;
                throw th;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ahoqVar = hqkVar.d;
            try {
                aooc.af(obj);
            } catch (java.lang.Throwable th3) {
                th = th3;
                try {
                    throw th;
                } catch (java.lang.Throwable th4) {
                    ajsz.ak(ahoqVar, th);
                    throw th4;
                }
            }
        }
        ajsz.ak(ahoqVar, (java.lang.Throwable) null);
        return aojh.a;
    }

    public final void e(defpackage.hqh hqhVar) {
        aooh.f(hqhVar, "activeTabId");
        this.e.i(ahvr.ag(this.b, this.d, new defpackage.iki(this, hqhVar, (aoln) null, 1)));
    }
}
