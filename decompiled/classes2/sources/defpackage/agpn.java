package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class agpn {
    public boolean a;
    public final java.lang.Object b;
    public final java.lang.Object c;
    public final java.lang.Object d;
    public final java.lang.Object e;

    public agpn(defpackage.fhg fhgVar, boolean[] zArr) {
        this.b = fhgVar;
        this.d = zArr;
        int i = fhgVar.b;
        this.e = new boolean[i];
        this.c = new boolean[i];
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    final ajcq a() {
        ajcq ajcqVarE = aiql.E(ahqx.b(new adbi(this, 7)), (java.util.concurrent.Executor) this.d);
        ((agsm) this.e).l(ajcqVarE);
        return ajcqVarE;
    }

    public final synchronized void b() {
        if (!this.a) {
            android.content.IntentFilter intentFilter = new android.content.IntentFilter();
            intentFilter.addAction("android.accounts.LOGIN_ACCOUNTS_CHANGED");
            ((android.content.Context) this.b).registerReceiver(new defpackage.agpm(), intentFilter);
            this.a = true;
        }
    }

    final synchronized boolean c() {
        return this.a;
    }

    public agpn(android.content.Context context, java.util.Set set, ajct ajctVar, agsm agsmVar) {
        this.a = false;
        this.b = context;
        this.c = set;
        this.d = ajctVar;
        this.e = agsmVar;
    }
}
