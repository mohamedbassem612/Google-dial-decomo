package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class szn {
    public static final aimz a = aimz.i("com/android/dialer/revelio/impl/tidepods/impl/service/CachedAudioGroupInterpreter");
    public final java.util.concurrent.atomic.AtomicReference b = new java.util.concurrent.atomic.AtomicReference();
    private final tbq c;
    private final ajct d;
    private final zjm e;

    public szn(tbq tbqVar, ajct ajctVar, zjm zjmVar) {
        this.c = tbqVar;
        this.d = ajctVar;
        this.e = zjmVar;
    }

    public final ajcq a() {
        aimz aimzVar = a;
        aimzVar.b().l("com/android/dialer/revelio/impl/tidepods/impl/service/CachedAudioGroupInterpreter", "cachedInterpreter", 56, "CachedAudioGroupInterpreter.java").v("enter");
        defpackage.rdp rdpVar = (defpackage.rdp) this.b.get();
        if (rdpVar != null) {
            aimzVar.b().l("com/android/dialer/revelio/impl/tidepods/impl/service/CachedAudioGroupInterpreter", "cachedInterpreter", 60, "CachedAudioGroupInterpreter.java").y("cached interpreter is already available with voice: %s", rdpVar.d);
            return aiql.z(j$.util.Optional.of(rdpVar));
        }
        aimzVar.b().l("com/android/dialer/revelio/impl/tidepods/impl/service/CachedAudioGroupInterpreter", "loadAndCacheInterpreter", 70, "CachedAudioGroupInterpreter.java").v("loading audioGroupInterpreter");
        j$.util.Optional optionalG = this.e.g();
        if (!optionalG.isPresent()) {
            aimzVar.b().l("com/android/dialer/revelio/impl/tidepods/impl/service/CachedAudioGroupInterpreter", "loadAndCacheInterpreter", 74, "CachedAudioGroupInterpreter.java").v("call screen not available");
            return aiql.z(j$.util.Optional.empty());
        }
        ahrv ahrvVarG = ahrv.g(((tkl) optionalG.orElseThrow()).p());
        tbq tbqVar = this.c;
        j$.util.Objects.requireNonNull(tbqVar);
        defpackage.srq srqVar = new defpackage.srq(tbqVar, 8);
        ajct ajctVar = this.d;
        return ahrvVarG.i(srqVar, ajctVar).h(new defpackage.soi(this, 13), ajctVar);
    }
}
