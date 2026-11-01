package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class aavc extends aagp {
    public aavc(android.content.Context context, android.os.Looper looper, aagi aagiVar, aaei aaeiVar, aafi aafiVar) {
        super(context, looper, 226, aagiVar, aaeiVar, aafiVar);
    }

    public final int a() {
        return 17895000;
    }

    protected final /* synthetic */ android.os.IInterface b(android.os.IBinder iBinder) {
        android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.thunderbird.internal.IThunderbirdService");
        return iInterfaceQueryLocalInterface instanceof defpackage.aauy ? (defpackage.aauy) iInterfaceQueryLocalInterface : new defpackage.aauy(iBinder);
    }

    protected final java.lang.String c() {
        return "com.google.android.gms.thunderbird.internal.IThunderbirdService";
    }

    protected final java.lang.String d() {
        return "com.google.android.gms.thunderbird.service.START";
    }

    public final boolean e() {
        return true;
    }

    protected final boolean f() {
        return true;
    }

    public final com.google.android.gms.common.Feature[] g() {
        return defpackage.aaux.b;
    }
}
