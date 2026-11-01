package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class rfa {
    private static final aimz f = aimz.i("com/android/dialer/incall/voicefeaturecombiner/templates/promo/service/VoiceFeaturePromoController");
    public final zpz e;
    private final ajct g;
    private final zzx i;
    final defpackage.zni a = new leq(this, 7);
    final defpackage.znq b = new defpackage.rez(this, 0);
    public final java.util.concurrent.atomic.AtomicBoolean c = new java.util.concurrent.atomic.AtomicBoolean(false);
    public final java.util.concurrent.atomic.AtomicBoolean d = new java.util.concurrent.atomic.AtomicBoolean(false);
    private final java.util.concurrent.atomic.AtomicReference h = new java.util.concurrent.atomic.AtomicReference(j$.util.Optional.empty());

    public rfa(ajct ajctVar, zpz zpzVar, zzx zzxVar) {
        this.g = ajctVar;
        this.e = zpzVar;
        this.i = zzxVar;
    }

    private final defpackage.rdz e(defpackage.rea reaVar) {
        aoin aoinVar = (aoin) this.i.k().get(reaVar);
        ahvr.cl(aoinVar, "no controller for %s", reaVar.name());
        return (defpackage.rdz) aoinVar.a();
    }

    public final j$.util.Optional a() {
        return (j$.util.Optional) this.h.get();
    }

    public final void b(defpackage.rea reaVar) {
        f.b().l("com/android/dialer/incall/voicefeaturecombiner/templates/promo/service/VoiceFeaturePromoController", "abortActivation", 104, "VoiceFeaturePromoController.java").y("abort activiation for %s", reaVar);
        this.e.a(e(reaVar).a());
    }

    public final void c(defpackage.rea reaVar, defpackage.rex rexVar) {
        f.b().l("com/android/dialer/incall/voicefeaturecombiner/templates/promo/service/VoiceFeaturePromoController", "activate", 71, "VoiceFeaturePromoController.java").y("request activation for %s", reaVar);
        if (rexVar == defpackage.rex.a) {
            this.d.set(true);
        }
        this.h.set(j$.util.Optional.of(rexVar));
        this.e.a(e(reaVar).b());
    }

    public final void d(defpackage.rea reaVar) {
        f.b().l("com/android/dialer/incall/voicefeaturecombiner/templates/promo/service/VoiceFeaturePromoController", "fixActivationErrorAndReactivate", 95, "VoiceFeaturePromoController.java").y("attempt activation error fix for %s", reaVar);
        defpackage.rdz rdzVarE = e(reaVar);
        this.e.a(ahrv.g(rdzVarE.d()).i(new defpackage.qfc(rdzVarE, 16), this.g));
    }
}
