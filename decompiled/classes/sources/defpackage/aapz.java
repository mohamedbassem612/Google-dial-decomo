package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aapz extends defpackage.aagp {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aapz(android.content.Context context, android.os.Looper looper, defpackage.aagi aagiVar, defpackage.aaei aaeiVar, defpackage.aafi aafiVar) {
        super(context, looper, 460, aagiVar, aaeiVar, aafiVar);
        if (looper == null) {
            defpackage.aooh.i("looper");
        }
    }

    @Override // defpackage.aagp, defpackage.aagf, defpackage.aacv
    public final int a() {
        return 17895000;
    }

    @Override // defpackage.aagf
    public final /* bridge */ /* synthetic */ android.os.IInterface b(android.os.IBinder iBinder) {
        android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.onboardingconsent.internal.IConsentManagerService");
        return iInterfaceQueryLocalInterface instanceof defpackage.aaqa ? (defpackage.aaqa) iInterfaceQueryLocalInterface : new defpackage.aaqa(iBinder);
    }

    @Override // defpackage.aagf
    protected final java.lang.String c() {
        return "com.google.android.gms.onboardingconsent.internal.IConsentManagerService";
    }

    @Override // defpackage.aagf
    protected final java.lang.String d() {
        return "com.google.android.gms.onboardingconsent.api.ConsentManagerApiService.START";
    }

    @Override // defpackage.aagf
    public final boolean e() {
        return true;
    }

    @Override // defpackage.aagf
    protected final boolean f() {
        return true;
    }

    @Override // defpackage.aagf
    public final com.google.android.gms.common.Feature[] g() {
        return defpackage.aapy.b;
    }
}
