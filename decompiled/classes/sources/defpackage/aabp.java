package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aabp extends defpackage.aagp {
    public aabp(android.content.Context context, android.os.Looper looper, defpackage.aagi aagiVar, defpackage.aaei aaeiVar, defpackage.aafi aafiVar) {
        super(context, looper, 457, aagiVar, aaeiVar, aafiVar);
    }

    @Override // defpackage.aagp, defpackage.aagf, defpackage.aacv
    public final int a() {
        return 261200000;
    }

    @Override // defpackage.aagf
    protected final /* synthetic */ android.os.IInterface b(android.os.IBinder iBinder) {
        android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.cloudmessaging.internal.ICloudMessagingService");
        return iInterfaceQueryLocalInterface instanceof defpackage.aabq ? (defpackage.aabq) iInterfaceQueryLocalInterface : new defpackage.aabq(iBinder);
    }

    @Override // defpackage.aagf
    protected final java.lang.String c() {
        return "com.google.android.gms.cloudmessaging.internal.ICloudMessagingService";
    }

    @Override // defpackage.aagf
    protected final java.lang.String d() {
        return "com.google.android.gms.cloudmessaging.service.START";
    }

    @Override // defpackage.aagf
    public final boolean e() {
        return true;
    }

    @Override // defpackage.aagf
    public final com.google.android.gms.common.Feature[] g() {
        return defpackage.aabf.c;
    }
}
