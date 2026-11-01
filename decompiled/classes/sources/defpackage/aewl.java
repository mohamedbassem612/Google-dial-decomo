package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aewl {
    public static defpackage.aewl a;
    public boolean b;
    public final java.lang.Object c;
    public final java.lang.Object d;

    public aewl(android.content.Context context, defpackage.aelx aelxVar, android.accounts.OnAccountsUpdateListener onAccountsUpdateListener) {
        this.b = false;
        this.c = onAccountsUpdateListener;
        this.d = android.accounts.AccountManager.get(context.getApplicationContext());
        if (defpackage.dvx.c(context, "android.permission.GET_ACCOUNTS") != 0) {
            defpackage.aemb aembVar = (defpackage.aemb) aelxVar;
            defpackage.ahvr.J(defpackage.ahvr.F(new aely(aembVar), aembVar.c), new jya(16), defpackage.ajbm.INSTANCE);
        }
    }

    static synchronized void a() {
        java.lang.Object obj;
        defpackage.aewl aewlVar = a;
        if (aewlVar != null && (obj = aewlVar.d) != null && aewlVar.c != null && aewlVar.b) {
            ((android.content.Context) obj).getContentResolver().unregisterContentObserver((android.database.ContentObserver) a.c);
        }
        a = null;
    }

    public final void b() {
        if (this.b) {
            return;
        }
        defpackage.ailj it = ((defpackage.aikn) this.c).iterator();
        while (it.hasNext()) {
            ((defpackage.cm) this.d).P().c((defpackage.emw) it.next());
        }
        this.b = true;
    }

    public aewl(android.app.Activity activity, java.util.Set set) {
        this.b = false;
        this.d = activity;
        this.c = set;
    }

    public aewl(android.content.Context context) {
        this.b = false;
        this.d = context;
        this.c = new defpackage.aewk(this);
    }

    public aewl(java.util.concurrent.Executor executor) {
        if (executor == null) {
            defpackage.aooh.i("executor");
        }
        this.d = new java.lang.Object();
        this.c = new java.util.ArrayList();
    }

    public aewl() {
        this.b = false;
        this.d = null;
        this.c = null;
    }
}
