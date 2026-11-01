package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class aahu extends aagp {
    public aahu(android.content.Context context, android.os.Looper looper, aagi aagiVar, aaei aaeiVar, aafi aafiVar) {
        super(context, looper, 483, aagiVar, aaeiVar, aafiVar);
    }

    public final int a() {
        return 253600000;
    }

    protected final /* synthetic */ android.os.IInterface b(android.os.IBinder iBinder) {
        android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.service.IClientThrottlingTelemetryService");
        return iInterfaceQueryLocalInterface instanceof defpackage.aahx ? (defpackage.aahx) iInterfaceQueryLocalInterface : new defpackage.aahx(iBinder);
    }

    protected final java.lang.String c() {
        return "com.google.android.gms.common.internal.service.IClientThrottlingTelemetryService";
    }

    protected final java.lang.String d() {
        return "com.google.android.gms.common.telemetry.throttling.service.START";
    }

    protected final boolean f() {
        return true;
    }

    public final com.google.android.gms.common.Feature[] g() {
        return aaba.d;
    }
}
