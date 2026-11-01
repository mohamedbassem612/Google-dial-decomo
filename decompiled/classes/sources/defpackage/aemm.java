package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aemm implements defpackage.aemh {
    private final defpackage.aelx a;
    private final defpackage.adfa b = new defpackage.aeml(this);
    private final java.util.List c = new java.util.ArrayList();
    private final defpackage.ahbq d;
    private final defpackage.aewl e;
    private final defpackage.adak f;
    private final defpackage.tvn g;

    public aemm(android.content.Context context, defpackage.adak adakVar, defpackage.aelx aelxVar, defpackage.ahyn ahynVar) {
        defpackage.ahvr.ci(context);
        defpackage.ahvr.ci(adakVar);
        this.f = adakVar;
        this.a = aelxVar;
        this.e = new defpackage.aewl(context, aelxVar, new android.accounts.OnAccountsUpdateListener() { // from class: aemj
            @Override // android.accounts.OnAccountsUpdateListener
            public final void onAccountsUpdated(android.accounts.Account[] accountArr) {
                defpackage.aemm aemmVar = this.a;
                aemmVar.j();
                for (android.accounts.Account account : accountArr) {
                    aemmVar.i(account);
                }
            }
        });
        this.d = new defpackage.ahbq(context, adakVar, aelxVar, ahynVar);
        this.g = new defpackage.tvn(adakVar);
    }

    public static defpackage.ajcq h(defpackage.ajcq ajcqVar) {
        return defpackage.ahvr.H(ajcqVar, new adfe(14), defpackage.ajbm.INSTANCE);
    }

    @Override // defpackage.aemh
    public final defpackage.ajcq a() {
        return this.d.b(new adfe(15));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [aelx, java.lang.Object] */
    @Override // defpackage.aemh
    public final defpackage.ajcq b(java.lang.String str) {
        defpackage.ahbq ahbqVar = this.d;
        return defpackage.ahvr.I(ahbqVar.d.a(), new adot(ahbqVar, str, 3), defpackage.ajbm.INSTANCE);
    }

    @Override // defpackage.aemh
    public final defpackage.ajcq c() {
        return this.d.b(new defpackage.adcu(12));
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [android.accounts.OnAccountsUpdateListener, java.lang.Object] */
    @Override // defpackage.aemh
    public final void d(aemg aemgVar) {
        java.util.List list = this.c;
        synchronized (list) {
            if (list.isEmpty()) {
                defpackage.aewl aewlVar = this.e;
                synchronized (aewlVar) {
                    try {
                        if (!aewlVar.b) {
                            aa$.ExternalSyntheticApiModelOutline0.m((android.accounts.AccountManager) aewlVar.d, (android.accounts.OnAccountsUpdateListener) aewlVar.c, (android.os.Handler) null, false, new java.lang.String[]{"com.google"});
                            aewlVar.b = true;
                        }
                    } catch (java.lang.Throwable th) {
                        throw th;
                    }
                }
                defpackage.ahvr.J(this.a.a(), new uwo(this, 13), defpackage.ajbm.INSTANCE);
            }
            list.add(aemgVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [android.accounts.OnAccountsUpdateListener, java.lang.Object] */
    @Override // defpackage.aemh
    public final void e(aemg aemgVar) {
        java.util.List list = this.c;
        synchronized (list) {
            if (list.isEmpty()) {
                return;
            }
            list.remove(aemgVar);
            if (list.isEmpty()) {
                defpackage.aewl aewlVar = this.e;
                synchronized (aewlVar) {
                    try {
                        if (aewlVar.b) {
                            try {
                                ((android.accounts.AccountManager) aewlVar.d).removeOnAccountsUpdatedListener(aewlVar.c);
                            } catch (java.lang.IllegalArgumentException e) {
                                android.util.Log.w("OneGoogle", "Failed to remove an OnAccountsUpdatedListener", e);
                            }
                            aewlVar.b = false;
                        }
                    } catch (java.lang.Throwable th) {
                        throw th;
                    }
                }
            }
        }
    }

    @Override // defpackage.aemh
    public final defpackage.ajcq f(java.lang.String str, int i) {
        return this.g.y(new aemk(1), str, i);
    }

    @Override // defpackage.aemh
    public final defpackage.ajcq g(java.lang.String str, int i) {
        return this.g.y(new aemk(0), str, i);
    }

    public final void i(android.accounts.Account account) {
        defpackage.adff adffVarF = this.f.f(account);
        java.lang.Object obj = adffVarF.b;
        defpackage.adfa adfaVar = this.b;
        synchronized (obj) {
            adffVarF.a.remove(adfaVar);
        }
        adffVarF.e(adfaVar, defpackage.ajbm.INSTANCE);
    }

    public final void j() {
        java.util.List list = this.c;
        synchronized (list) {
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                ((aemg) it.next()).a();
            }
        }
    }
}
