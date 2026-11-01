package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class mhy {
    private static final defpackage.aimz b = defpackage.aimz.i("com/android/dialer/defaultdialer/impl/DefaultDialerImpl");
    public final defpackage.mhz a;
    private final android.content.Context c;
    private final defpackage.zjs d;

    public mhy(android.content.Context context, defpackage.zjs zjsVar, defpackage.mhz mhzVar) {
        this.c = context;
        this.d = zjsVar;
        this.a = mhzVar;
    }

    public final defpackage.aw a() {
        mhv mhvVar = new mhv();
        defpackage.amxr.g(mhvVar);
        return mhvVar;
    }

    public final boolean b() {
        ((defpackage.aimw) ((defpackage.aimw) b.b()).l("com/android/dialer/defaultdialer/impl/DefaultDialerImpl", "isDefaultDialer", 40, "DefaultDialerImpl.java")).v("enter");
        return this.c.getPackageName().equals(this.d.f().orElse((java.lang.Object) null));
    }
}
