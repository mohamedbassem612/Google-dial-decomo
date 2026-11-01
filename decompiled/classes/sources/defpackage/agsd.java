package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final /* synthetic */ class agsd implements defpackage.aomy {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ int a;
    public final /* synthetic */ java.lang.Object b;
    public final /* synthetic */ java.lang.Object c;

    public /* synthetic */ agsd(int i, defpackage.kaw kawVar, defpackage.ccp ccpVar, int i2) {
        this.$cid = i2;
        this.a = i;
        this.b = kawVar;
        this.c = ccpVar;
    }

    /* JADX WARN: Type inference failed for: r1v6, types: [ccp, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v15, types: [erg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v17, types: [erg, java.lang.Object] */
    @Override // defpackage.aomy
    public final java.lang.Object a() {
        int i = this.$cid;
        if (i == 0) {
            java.lang.Object obj = this.b;
            agsu agsuVarE = ((agsf) obj).a().E(obj.getClass());
            java.lang.Object obj2 = agsuVarE.b;
            int i2 = this.a;
            java.lang.Object obj3 = this.c;
            synchronized (obj2) {
                try {
                    if (obj3 != null) {
                        agsuVarE.k = (android.app.Service) obj;
                        agsuVarE.l = i2;
                        agsuVarE.j = agst.c;
                        if (agsuVarE.c.isEmpty()) {
                            agsuVarE.c((android.app.Service) obj, (android.app.Notification) ((android.content.Intent) obj3).getParcelableExtra("fallback_notification"));
                            agsuVarE.d();
                        } else {
                            agsuVarE.m = agsuVarE.a(agsuVarE.m);
                            agsuVarE.c((android.app.Service) obj, agsuVarE.m.a);
                        }
                    } else if (agsuVarE.j == agst.a) {
                        ((android.app.Service) obj).stopSelf(i2);
                    }
                } catch (java.lang.Throwable th) {
                    throw th;
                }
            }
            return defpackage.aojh.a;
        }
        if (i == 1) {
            this.c.b(java.lang.Integer.valueOf(this.a));
            ((defpackage.kaw) this.b).ar(0);
            return java.lang.Boolean.TRUE;
        }
        if (i == 2) {
            this.c.x((erm) this.b, this.a);
            return defpackage.aojh.a;
        }
        if (i == 3) {
            this.b.Q((eqt) this.c, this.a);
            return defpackage.aojh.a;
        }
        if (i == 4) {
            defpackage.aooh.f(this.c, "requestHeaders");
            java.lang.Object obj4 = this.b;
            int i3 = this.a;
            try {
                ((defpackage.apms) obj4).u.d(i3, defpackage.apme.CANCEL);
                synchronized (obj4) {
                    ((defpackage.apms) obj4).w.remove(java.lang.Integer.valueOf(i3));
                }
            } catch (java.io.IOException unused) {
            }
            return defpackage.aojh.a;
        }
        java.lang.Object obj5 = this.c;
        if (i != 5) {
            int i4 = this.a;
            java.lang.Object obj6 = this.b;
            try {
                ((defpackage.apms) obj6).j(i4, (defpackage.apme) obj5);
            } catch (java.io.IOException e) {
                ((defpackage.apms) obj6).d(e);
            }
            return defpackage.aojh.a;
        }
        defpackage.aooh.f(obj5, "responseHeaders");
        java.lang.Object obj7 = this.b;
        int i5 = this.a;
        try {
            ((defpackage.apms) obj7).u.d(i5, defpackage.apme.CANCEL);
            synchronized (obj7) {
                ((defpackage.apms) obj7).w.remove(java.lang.Integer.valueOf(i5));
            }
        } catch (java.io.IOException unused2) {
        }
        return defpackage.aojh.a;
    }

    public /* synthetic */ agsd(defpackage.apms apmsVar, int i, java.lang.Object obj, int i2) {
        this.$cid = i2;
        this.b = apmsVar;
        this.a = i;
        this.c = obj;
    }

    public /* synthetic */ agsd(defpackage.erg ergVar, erm ermVar, int i, int i2) {
        this.$cid = i2;
        this.c = ergVar;
        this.b = ermVar;
        this.a = i;
    }

    public /* synthetic */ agsd(java.lang.Object obj, java.lang.Object obj2, int i, int i2) {
        this.$cid = i2;
        this.b = obj;
        this.c = obj2;
        this.a = i;
    }
}
