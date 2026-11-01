package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class jtn {
    public static final aimz a = aimz.i("com/android/dialer/calleridfeedback/impl/incall/ui/InCallCallerIdFeedbackFragmentPeer");
    public final agtj b;
    public final odp c;
    public final aoss d;
    public final defpackage.jtm e;
    private final zpm f;

    public jtn(agtj agtjVar, odp odpVar, zpm zpmVar, aoss aossVar) {
        aooh.f(agtjVar, "futuresMixin");
        aooh.f(zpmVar, "callScopes");
        aooh.f(aossVar, "lightweightScope");
        this.b = agtjVar;
        this.c = odpVar;
        this.f = zpmVar;
        this.d = aossVar;
        this.e = new defpackage.jtm(this);
    }

    public final defpackage.jtl a() {
        j$.util.Optional optionalH = this.f.h();
        aooh.e(optionalH, "getPrimaryCallScope(...)");
        apqr apqrVar = (apqr) aooh.q(optionalH);
        if (apqrVar != null) {
            return (defpackage.jtl) apqrVar.a(defpackage.jtl.class);
        }
        return null;
    }
}
