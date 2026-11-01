package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final /* synthetic */ class afai implements defpackage.afam {
    public final /* synthetic */ java.util.Set a;
    public final /* synthetic */ defpackage.ahyn b;
    public final /* synthetic */ android.content.Context c;
    public final /* synthetic */ defpackage.ahyn d;
    public final /* synthetic */ defpackage.aoin e;
    public final /* synthetic */ defpackage.adag f;

    public /* synthetic */ afai(java.util.Set set, defpackage.adag adagVar, defpackage.ahyn ahynVar, android.content.Context context, defpackage.ahyn ahynVar2, defpackage.aoin aoinVar) {
        this.a = set;
        this.f = adagVar;
        this.b = ahynVar;
        this.c = context;
        this.d = ahynVar2;
        this.e = aoinVar;
    }

    /* JADX WARN: Type inference failed for: r6v2, types: [ahyc, java.lang.Object] */
    @Override // defpackage.afam
    public final void a() {
        java.util.Set set = this.a;
        defpackage.adag adagVar = this.f;
        if (set.isEmpty() && !adagVar.r()) {
            java.lang.Boolean.FALSE.booleanValue();
            return;
        }
        defpackage.aoin aoinVar = this.e;
        defpackage.ahyn ahynVar = this.d;
        android.app.Application application = (android.app.Application) this.c;
        application.registerActivityLifecycleCallbacks((android.app.Application.ActivityLifecycleCallbacks) ((defpackage.ahys) ahynVar).a.apply(new defpackage.afaj(application, ahynVar, set, adagVar, aoinVar)));
    }
}
