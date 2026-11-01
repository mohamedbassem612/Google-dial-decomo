package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class aamt extends aagp {
    public final defpackage.aame a;

    public aamt(android.content.Context context, android.os.Looper looper, aagi aagiVar, aadc aadcVar, aadd aaddVar) {
        super(context, looper, 63, aagiVar, aadcVar, aaddVar);
        this.a = new defpackage.aamr();
    }

    public final int a() {
        return 11925000;
    }

    protected final /* synthetic */ android.os.IInterface b(android.os.IBinder iBinder) {
        android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.googlehelp.internal.common.IGoogleHelpService");
        return iInterfaceQueryLocalInterface instanceof defpackage.aamv ? (defpackage.aamv) iInterfaceQueryLocalInterface : new defpackage.aamv(iBinder);
    }

    protected final java.lang.String c() {
        return "com.google.android.gms.googlehelp.internal.common.IGoogleHelpService";
    }

    protected final java.lang.String d() {
        return "com.google.android.gms.googlehelp.service.GoogleHelpService.START";
    }

    public final boolean e() {
        return true;
    }
}
