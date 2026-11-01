package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class agxn implements agxi {
    final /* synthetic */ agxi a;
    final /* synthetic */ ajat b;
    final /* synthetic */ java.util.concurrent.Executor c;

    public agxn(agxi agxiVar, ajat ajatVar, java.util.concurrent.Executor executor) {
        this.a = agxiVar;
        this.b = ajatVar;
        this.c = executor;
    }

    public final ajbg a() {
        ajbg ajbgVarA = this.a.a();
        ajat ajatVar = this.b;
        java.util.concurrent.Executor executor = this.c;
        return ajbgVarA.d(ahqx.d(new defpackage.vgf(ajatVar, executor, 9, null)), executor);
    }

    public final ajcq b() {
        return this.a.b();
    }

    public final java.lang.Object e() {
        return "com.google.apps.tiktok.account.data.AllAccounts";
    }

    public final java.lang.String toString() {
        ajat ajatVar = this.b;
        return "DataSources.transform(" + java.lang.String.valueOf(this.a) + ", " + ajatVar.toString() + ')';
    }
}
