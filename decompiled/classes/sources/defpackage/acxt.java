package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final /* synthetic */ class acxt implements defpackage.ahzi {
    public final /* synthetic */ java.util.concurrent.Executor a;
    public final /* synthetic */ defpackage.acvl b;
    public final /* synthetic */ defpackage.amwu c;
    public final /* synthetic */ android.content.Context d;
    public final /* synthetic */ defpackage.ahyn e;
    public final /* synthetic */ defpackage.aogc f;

    public /* synthetic */ acxt(java.util.concurrent.Executor executor, defpackage.acvl acvlVar, defpackage.amwu amwuVar, android.content.Context context, defpackage.ahyn ahynVar, defpackage.aogc aogcVar) {
        this.a = executor;
        this.b = acvlVar;
        this.c = amwuVar;
        this.d = context;
        this.e = ahynVar;
        this.f = aogcVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [adte, java.lang.Object] */
    @Override // defpackage.ahzi
    public final java.lang.Object eZ() {
        acxs acxsVar = new acxs(this.a, this.b.f());
        org.chromium.net.CronetEngine cronetEngine = (org.chromium.net.CronetEngine) this.c.a();
        j$.util.Objects.requireNonNull(cronetEngine);
        adst adstVar = new adst(new aprf(cronetEngine));
        defpackage.appu appuVar = new defpackage.appu(null);
        android.content.Context context = this.d;
        defpackage.adth adthVar = new defpackage.adth(adstVar, context, acxsVar, appuVar);
        adthVar.h(((defpackage.ahys) this.e).a);
        return new abtr(context, adthVar, adstVar, this.f, acxsVar);
    }
}
