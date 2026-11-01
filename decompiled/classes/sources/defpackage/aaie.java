package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aaie extends defpackage.aagp {
    private final defpackage.aahr a;

    public aaie(android.content.Context context, android.os.Looper looper, defpackage.aagi aagiVar, defpackage.aahr aahrVar, defpackage.aaei aaeiVar, defpackage.aafi aafiVar) {
        super(context, looper, 270, aagiVar, aaeiVar, aafiVar);
        this.a = aahrVar;
    }

    @Override // defpackage.aagp, defpackage.aagf, defpackage.aacv
    public final int a() {
        return 203400000;
    }

    @Override // defpackage.aagf
    protected final /* synthetic */ android.os.IInterface b(android.os.IBinder iBinder) {
        aahw aahwVarQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.service.IClientTelemetryService");
        return aahwVarQueryLocalInterface instanceof aahw ? aahwVarQueryLocalInterface : new aahw(iBinder);
    }

    @Override // defpackage.aagf
    protected final java.lang.String c() {
        return "com.google.android.gms.common.internal.service.IClientTelemetryService";
    }

    @Override // defpackage.aagf
    protected final java.lang.String d() {
        return "com.google.android.gms.common.telemetry.service.START";
    }

    @Override // defpackage.aagf
    protected final boolean f() {
        return true;
    }

    @Override // defpackage.aagf
    public final com.google.android.gms.common.Feature[] g() {
        return defpackage.aaba.d;
    }

    @Override // defpackage.aagf
    protected final android.os.Bundle h() {
        android.os.Bundle bundle = new android.os.Bundle();
        java.lang.String str = this.a.b;
        if (str != null) {
            bundle.putString("api", str);
        }
        return bundle;
    }
}
