package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class aaib extends aada implements defpackage.aagj {
    public static final /* synthetic */ int a = 0;
    private static final acxg l;
    private static final aais m;
    private static final aais n;

    static {
        aais aaisVar = new aais();
        n = aaisVar;
        defpackage.aaia aaiaVar = new defpackage.aaia();
        m = aaiaVar;
        l = new acxg("ClientThrottling.API", aaiaVar, aaisVar);
    }

    public aaib(android.content.Context context) {
        super(context, (android.app.Activity) null, l, aacu.q, aacz.a);
    }

    @Override // defpackage.aagj
    public final void a(com.google.android.gms.common.internal.ClientThrottlingTelemetryData clientThrottlingTelemetryData) {
        aafq aafqVar = new aafq();
        aafqVar.b = new com.google.android.gms.common.Feature[]{aaba.c};
        aafqVar.b();
        aafqVar.a = new defpackage.aaav(clientThrottlingTelemetryData, 3);
        super.i(2, aafqVar.a());
    }
}
