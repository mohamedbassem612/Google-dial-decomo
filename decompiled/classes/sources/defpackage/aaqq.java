package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aaqq extends defpackage.aagp {
    public aaqq(android.content.Context context, android.os.Looper looper, defpackage.aagi aagiVar, defpackage.aaei aaeiVar, defpackage.aafi aafiVar) {
        super(context, looper, 208, aagiVar, aaeiVar, aafiVar);
    }

    @Override // defpackage.aagp, defpackage.aagf, defpackage.aacv
    public final int a() {
        return 17108000;
    }

    @Override // defpackage.aagf
    protected final /* synthetic */ android.os.IInterface b(android.os.IBinder iBinder) {
        android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.people.contactssync.internal.IContactsSyncService");
        return iInterfaceQueryLocalInterface instanceof defpackage.aaqs ? (defpackage.aaqs) iInterfaceQueryLocalInterface : new defpackage.aaqs(iBinder);
    }

    @Override // defpackage.aagf
    protected final java.lang.String c() {
        return "com.google.android.gms.people.contactssync.internal.IContactsSyncService";
    }

    @Override // defpackage.aagf
    protected final java.lang.String d() {
        return "com.google.android.gms.people.contactssync.service.START";
    }

    @Override // defpackage.aagf
    public final boolean e() {
        return true;
    }

    @Override // defpackage.aagf
    public final com.google.android.gms.common.Feature[] g() {
        return new com.google.android.gms.common.Feature[]{defpackage.aaqf.b, defpackage.aaqf.c, defpackage.aaqf.d, defpackage.aaqf.e, defpackage.aaqf.g, defpackage.aaqf.i, defpackage.aaqf.h, defpackage.aaqf.j, defpackage.aaqf.k, defpackage.aaqf.l, defpackage.aaqf.m, defpackage.aaqf.n, defpackage.aaqf.o, defpackage.aaqf.p, defpackage.aaqf.s, defpackage.aaqf.t, defpackage.aaqf.r, defpackage.aaqf.x, defpackage.aaqf.y, defpackage.aaqf.z, defpackage.aaqf.A, defpackage.aaqf.D, defpackage.aaqf.E, defpackage.aaqf.G};
    }
}
