package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final /* synthetic */ class ahiq implements defpackage.afah {
    public final /* synthetic */ android.content.Context a;
    public final /* synthetic */ long b;
    public final /* synthetic */ defpackage.aoin c;

    public /* synthetic */ ahiq(android.content.Context context, long j, defpackage.aoin aoinVar) {
        this.a = context;
        this.b = j;
        this.c = aoinVar;
    }

    @Override // defpackage.afah
    public final void a() {
        if (defpackage.agab.ao()) {
            long j = this.b;
            android.content.Context context = this.a;
            defpackage.aeud aeudVar = defpackage.aeud.a;
            android.app.Application application = (android.app.Application) context;
            if (j <= android.os.SystemClock.elapsedRealtime()) {
                aeudVar.b = new defpackage.aera(j, j);
                if (defpackage.afec.h(java.lang.Thread.currentThread()) && aeudVar.c == null && application != null) {
                    aeudVar.c = new defpackage.aera(android.os.SystemClock.elapsedRealtime(), android.os.SystemClock.uptimeMillis());
                    defpackage.afec.a().post(new defpackage.abqg(aeudVar, 5));
                    application.registerActivityLifecycleCallbacks(new defpackage.aeuc(aeudVar, application));
                }
            }
            defpackage.aenm aenmVar = ((defpackage.aenl) this.c.a()).a;
            aenmVar.c();
            aenmVar.h();
        }
    }
}
