package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class aalz extends aagp {
    public final android.content.Context a;

    public aalz(android.content.Context context, android.os.Looper looper, aadc aadcVar, aadd aaddVar, aagi aagiVar) {
        super(context, looper, 29, aagiVar, aadcVar, aaddVar);
        this.a = context;
        defpackage.aayx.b(context);
    }

    public final int a() {
        return 11925000;
    }

    protected final /* synthetic */ android.os.IInterface b(android.os.IBinder iBinder) {
        android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.feedback.internal.IFeedbackService");
        return iInterfaceQueryLocalInterface instanceof defpackage.aamb ? (defpackage.aamb) iInterfaceQueryLocalInterface : new defpackage.aamb(iBinder);
    }

    protected final java.lang.String c() {
        return "com.google.android.gms.feedback.internal.IFeedbackService";
    }

    protected final java.lang.String d() {
        return "com.google.android.gms.feedback.internal.IFeedbackService";
    }

    public final boolean e() {
        return true;
    }

    public final com.google.android.gms.common.Feature[] g() {
        return defpackage.aalq.b;
    }
}
