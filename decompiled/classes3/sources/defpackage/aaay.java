package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class aaay extends aagp {
    public aaay(android.content.Context context, android.os.Looper looper, aagi aagiVar, aaei aaeiVar, aafi aafiVar) {
        super(context, looper, 414, aagiVar, aaeiVar, aafiVar);
    }

    public final int a() {
        return 250200000;
    }

    protected final /* synthetic */ android.os.IInterface b(android.os.IBinder iBinder) {
        android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.clearcut.sampler.IClearcutLoggerSamplingService");
        return iInterfaceQueryLocalInterface instanceof defpackage.aaaz ? (defpackage.aaaz) iInterfaceQueryLocalInterface : new defpackage.aaaz(iBinder);
    }

    protected final java.lang.String c() {
        return "com.google.android.gms.clearcut.sampler.IClearcutLoggerSamplingService";
    }

    protected final java.lang.String d() {
        return "com.google.android.gms.clearcut.sampler.service.START";
    }

    public final com.google.android.gms.common.Feature[] g() {
        return new com.google.android.gms.common.Feature[]{zzp.b};
    }
}
