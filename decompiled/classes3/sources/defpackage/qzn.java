package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class qzn {
    public static final aimz a = aimz.i("com/android/dialer/incall/voice/orientation/VoiceScreenAllowOrientationChange");
    public final java.util.concurrent.atomic.AtomicBoolean b;
    public final zpz c;
    private final aoss d;
    private final aoin e;
    private final zjm f;

    public qzn(zjm zjmVar, zpz zpzVar, aoss aossVar, aoin aoinVar) {
        aooh.f(zpzVar, "inCallUpdatePropagator");
        aooh.f(aossVar, "lightweightScope");
        aooh.f(aoinVar, "enableAutoRotateByDefault");
        this.f = zjmVar;
        this.c = zpzVar;
        this.d = aossVar;
        this.e = aoinVar;
        this.b = new java.util.concurrent.atomic.AtomicBoolean(false);
    }

    public final boolean a() {
        j$.util.Optional optionalG = this.f.g();
        aooh.e(optionalG, "getFeature(...)");
        vk vkVar = (vk) aooh.q(optionalG);
        if (vkVar != null) {
            aoov.an(this.d, (aolr) null, 0, new ohh(vkVar, this, (aoln) null, 20), 3);
            return this.b.get();
        }
        java.lang.Object objA = this.e.a();
        aooh.e(objA, "get(...)");
        return ((java.lang.Boolean) objA).booleanValue();
    }
}
