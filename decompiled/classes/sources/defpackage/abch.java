package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class abch extends defpackage.aagp {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public abch(android.content.Context context, android.os.Looper looper, defpackage.aagi aagiVar, defpackage.aaei aaeiVar, defpackage.aafi aafiVar) {
        super(context, looper, 473, aagiVar, aaeiVar, aafiVar);
        if (looper == null) {
            defpackage.aooh.i("looper");
        }
    }

    @Override // defpackage.aagp, defpackage.aagf, defpackage.aacv
    public final int a() {
        return 243300000;
    }

    @Override // defpackage.aagf
    public final /* synthetic */ android.os.IInterface b(android.os.IBinder iBinder) {
        abcd abcdVarQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.libraries.abuse.hades.signals.gmsclient.internal.ISignalStorageService");
        return abcdVarQueryLocalInterface instanceof abcd ? abcdVarQueryLocalInterface : new abcd(iBinder);
    }

    @Override // defpackage.aagf
    protected final java.lang.String c() {
        return "com.google.android.libraries.abuse.hades.signals.gmsclient.internal.ISignalStorageService";
    }

    @Override // defpackage.aagf
    protected final java.lang.String d() {
        return "com.google.android.apps.safetycore.signals.BIND";
    }

    @Override // defpackage.aagf
    public final boolean e() {
        return false;
    }

    @Override // defpackage.aagf
    protected final boolean f() {
        return true;
    }

    @Override // defpackage.aagf
    public final com.google.android.gms.common.Feature[] g() {
        return new com.google.android.gms.common.Feature[0];
    }

    @Override // defpackage.aagf
    protected final java.lang.String x() {
        return "com.google.android.gms";
    }
}
