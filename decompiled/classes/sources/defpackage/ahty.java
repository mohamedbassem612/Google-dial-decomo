package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final /* synthetic */ class ahty implements defpackage.afam {
    public final /* synthetic */ android.content.Context a;
    public final /* synthetic */ defpackage.ahyn b;
    public final /* synthetic */ defpackage.ahtt c;

    public /* synthetic */ ahty(android.content.Context context, defpackage.ahyn ahynVar, defpackage.ahtt ahttVar) {
        this.a = context;
        this.b = ahynVar;
        this.c = ahttVar;
    }

    @Override // defpackage.afam
    public final void a() {
        android.os.StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = android.os.StrictMode.allowThreadDiskReads();
        defpackage.ahyn ahynVar = this.b;
        android.content.Context context = this.a;
        try {
            try {
                defpackage.ahyn ahynVarA = defpackage.ahtx.a.a(context, defpackage.akzq.a(), (defpackage.ahua) ((defpackage.ahys) ahynVar).a);
                java.lang.Integer numValueOf = null;
                if (ahynVarA.f()) {
                    java.lang.Object objB = ahynVarA.b();
                    if ((((defpackage.ahtv) objB).b & 1) != 0) {
                        numValueOf = java.lang.Integer.valueOf(((defpackage.ahtv) objB).c);
                    }
                }
                if (numValueOf != null) {
                    defpackage.dc.m(numValueOf.intValue());
                }
            } catch (java.lang.Exception e) {
                ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) defpackage.ahtz.a.c()).k(e)).l("com/google/apps/tiktok/ui/locale/NightModeModule", "provideLocaleErrorLoggingListener", 55, "NightModeModule.java")).v("Failed to set default night mode");
            }
            defpackage.ahtt ahttVar = this.c;
            android.os.StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
            ahttVar.a();
        } catch (java.lang.Throwable th) {
            android.os.StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
            throw th;
        }
    }
}
