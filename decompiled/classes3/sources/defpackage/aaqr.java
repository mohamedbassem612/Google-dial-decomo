package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class aaqr extends aagp {
    public aaqr(android.content.Context context, android.os.Looper looper, aagi aagiVar, aaei aaeiVar, aafi aafiVar) {
        super(context, looper, 208, aagiVar, aaeiVar, aafiVar);
    }

    public final int a() {
        return 224500000;
    }

    protected final /* synthetic */ android.os.IInterface b(android.os.IBinder iBinder) {
        android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.people.contactssync.internal.IContactsSyncThirdPartyService");
        return iInterfaceQueryLocalInterface instanceof defpackage.aaqu ? (defpackage.aaqu) iInterfaceQueryLocalInterface : new defpackage.aaqu(iBinder);
    }

    protected final java.lang.String c() {
        return "com.google.android.gms.people.contactssync.internal.IContactsSyncThirdPartyService";
    }

    protected final java.lang.String d() {
        return "com.google.android.gms.people.contactssync.service.THIRD_PARTY_START";
    }

    public final boolean e() {
        return true;
    }

    public final com.google.android.gms.common.Feature[] g() {
        return new com.google.android.gms.common.Feature[]{aaqf.w, aaqf.v, aaqf.u, aaqf.F, aaqf.B};
    }
}
