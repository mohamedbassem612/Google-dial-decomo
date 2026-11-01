package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class uzk implements rrz {
    public final android.content.Context a;
    public final rlv b;
    private final rsd c;
    private final rsb d;

    public uzk(android.content.Context context, rlv rlvVar) {
        aooh.f(context, "appContext");
        aooh.f(rlvVar, "loggingBindings");
        this.a = context;
        this.b = rlvVar;
        this.c = rsd.i;
        this.d = new rsb(rsn.a);
    }

    public final rsb a() {
        return this.d;
    }

    public final rsd b() {
        return this.c;
    }

    public final java.lang.Object c(aoln aolnVar) {
        if (new android.content.Intent("com.google.android.contacts.action.BESTIES_WIDGET_DIALER_MARQUEE_ENTRYPOINT_ACTIVITY").resolveActivity(this.a.getPackageManager()) == null) {
            return null;
        }
        return new defpackage.rsi(new defpackage.rsp(new defpackage.rse(2132020804, null)), new defpackage.rsc(2131232251), new defpackage.rrx(new defpackage.rse(2132020803, null)), new defpackage.rsa(new defpackage.rse(2132020802, null), new defpackage.uon((java.lang.Object) this, 4, (int[]) null)));
    }

    public final void f() {
        this.b.o(rmx.sk);
    }

    public final void g() {
        this.b.o(rmx.sj);
    }
}
