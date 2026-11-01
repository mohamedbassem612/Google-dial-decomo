package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class zwg extends aagp {
    public zwg(android.content.Context context, android.os.Looper looper, aagi aagiVar, aadc aadcVar, aadd aaddVar) {
        super(context, looper, 154, aagiVar, aadcVar, aaddVar);
    }

    public final int a() {
        return 12200000;
    }

    protected final /* synthetic */ android.os.IInterface b(android.os.IBinder iBinder) {
        android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.audit.internal.IAuditService");
        return iInterfaceQueryLocalInterface instanceof defpackage.zwh ? (defpackage.zwh) iInterfaceQueryLocalInterface : new defpackage.zwh(iBinder);
    }

    protected final java.lang.String c() {
        return "com.google.android.gms.audit.internal.IAuditService";
    }

    protected final java.lang.String d() {
        return "com.google.android.gms.audit.service.START";
    }

    public final boolean e() {
        return true;
    }
}
