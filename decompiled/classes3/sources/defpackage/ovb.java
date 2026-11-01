package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
@java.lang.Deprecated
public final class ovb {
    public static final aimz a = aimz.i("com/android/dialer/incall/answer/answeredcall/AnsweredCallState");
    public final java.util.concurrent.atomic.AtomicBoolean b = new java.util.concurrent.atomic.AtomicBoolean(false);
    public final zpz c;
    private final aoin d;
    private final ajct e;
    private final agsm f;
    private final zpm g;
    private final defpackage.afpl h;

    public ovb(zpz zpzVar, zpm zpmVar, aoin aoinVar, defpackage.afpl afplVar, ajct ajctVar, agsm agsmVar) {
        this.c = zpzVar;
        this.g = zpmVar;
        this.d = aoinVar;
        this.h = afplVar;
        this.e = ajctVar;
        this.f = agsmVar;
    }

    @java.lang.Deprecated
    public final void a() {
        if (((java.lang.Boolean) this.d.a()).booleanValue()) {
            if (this.g.a().size() <= 1) {
                a.b().l("com/android/dialer/incall/answer/answeredcall/AnsweredCallState", "markAsAnswered", 128, "AnsweredCallState.java").v("Marking as answered");
                this.b.set(true);
                this.c.a(ajcm.a);
            } else {
                ajcq ajcqVarX = this.h.X();
                ibe ibeVar = new ibe(17);
                ajct ajctVar = this.e;
                this.f.g(ahrv.g(ahvr.I(ajcqVarX, ibeVar, ajctVar)).i(new ibe(16), ajctVar).h(new onp(10), ajctVar).e(java.lang.IllegalStateException.class, new onp(11), ajctVar).h(new mjl(this, 13), ajctVar), 5L, java.util.concurrent.TimeUnit.SECONDS);
            }
        }
    }

    @java.lang.Deprecated
    public final boolean b() {
        if (((java.lang.Boolean) this.d.a()).booleanValue()) {
            return this.b.get();
        }
        return false;
    }
}
