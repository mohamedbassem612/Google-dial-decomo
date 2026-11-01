package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aaid extends defpackage.aada implements defpackage.aahq {
    public static final /* synthetic */ int a = 0;
    private static final defpackage.acxg l;
    private static final defpackage.aais m;
    private static final defpackage.aais n;

    static {
        defpackage.aais aaisVar = new defpackage.aais();
        n = aaisVar;
        defpackage.aaic aaicVar = new defpackage.aaic();
        m = aaicVar;
        l = new defpackage.acxg("ClientTelemetry.API", aaicVar, aaisVar);
    }

    public aaid(android.content.Context context, defpackage.aahr aahrVar) {
        super(context, null, l, aahrVar, defpackage.aacz.a);
    }

    @Override // defpackage.aahq
    public final defpackage.aaum a(com.google.android.gms.common.internal.TelemetryData telemetryData) {
        defpackage.aafq aafqVar = new defpackage.aafq();
        aafqVar.b = new com.google.android.gms.common.Feature[]{defpackage.aaba.a};
        aafqVar.b();
        aafqVar.a = new aaav(telemetryData, 4);
        return super.i(2, aafqVar.a());
    }
}
