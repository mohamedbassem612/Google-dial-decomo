package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class aaax extends aada implements defpackage.aaau {
    public static final /* synthetic */ int a = 0;
    private static final acxg l;
    private static final aais m;
    private static final aais n;

    static {
        aais aaisVar = new aais();
        n = aaisVar;
        defpackage.aaaw aaawVar = new defpackage.aaaw();
        m = aaawVar;
        l = new acxg("ClearcutLoggerSampling.API", aaawVar, aaisVar);
    }

    public aaax(android.content.Context context) {
        super(context, (android.app.Activity) null, l, aacu.q, aacz.a);
    }

    @Override // defpackage.aaau
    public final aaum a(com.google.android.gms.clearcut.sampler.SamplerConfigParcelable samplerConfigParcelable) {
        aafq aafqVar = new aafq();
        aafqVar.b = new com.google.android.gms.common.Feature[]{zzp.b};
        aafqVar.b();
        aafqVar.a = new defpackage.aaav(samplerConfigParcelable, 0);
        return super.i(0, aafqVar.a());
    }
}
