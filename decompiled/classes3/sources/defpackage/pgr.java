package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class pgr implements ajcb {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public pgr(ibt ibtVar, int i) {
        this.$cid = i;
        j$.util.Objects.requireNonNull(ibtVar);
        this.a = ibtVar;
    }

    private final void c() {
        defpackage.uar uarVar = (defpackage.uar) this.a;
        uarVar.i = 1;
        uarVar.h = j$.util.Optional.empty();
        uarVar.j.a(ajcm.a);
    }

    public final void a(java.lang.Throwable th) {
        switch (this.$cid) {
            case 0:
                ((defpackage.pgs) this.a).d.n(ruc.T, rub.c);
                break;
            case 1:
                a.bq(ibt.a.c(), "async task failed", "com/android/dialer/audio/impl/tidepods/DedupingFlowController$1", "onFailure", 'D', "DedupingFlowController.java", th, zct.b);
                ibt ibtVar = (ibt) this.a;
                ibtVar.b.set(false);
                if (ibtVar.c.getAndSet(false)) {
                    ibtVar.a();
                }
                break;
            case 2:
                ((defpackage.pgs) this.a).d.n(ruc.U, rub.c);
                break;
            case 3:
                defpackage.phe.a.b().l("com/android/dialer/incall/cachedphonelookup/MultiStagePhoneLookup$1", "onFailure", 151, "MultiStagePhoneLookup.java").v("cp2 lookup failure");
                ((defpackage.phe) this.a).e.n(ruc.T, rub.c);
                break;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                defpackage.phe.a.b().l("com/android/dialer/incall/cachedphonelookup/MultiStagePhoneLookup$2", "onFailure", 184, "MultiStagePhoneLookup.java").v("timeout lookup failure");
                ((defpackage.phe) this.a).e.n(ruc.U, rub.c);
                break;
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                defpackage.phe.a.b().l("com/android/dialer/incall/cachedphonelookup/MultiStagePhoneLookup$4", "onFailure", 243, "MultiStagePhoneLookup.java").v("all lookup completed failure");
                ((krv) this.a).d();
                break;
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                a.bq(defpackage.uar.a.c(), "failed blocking", "com/android/dialer/sonic/impl/service/SonicVoiceAnimatorListener$1", "onFailure", (char) 155, "SonicVoiceAnimatorListener.java", th, zct.b);
                c();
                break;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                java.lang.Object obj = this.a;
                j$.util.Optional optional = ((defpackage.pnn) obj).a;
                hvp hvpVar = new hvp(obj, th, 13, (byte[]) null);
                if (true == optional.isPresent()) {
                    java.lang.Object obj2 = optional.get();
                    java.lang.Object obj3 = hvpVar.b;
                    defpackage.pnn pnnVar = (defpackage.pnn) obj3;
                    pnnVar.b.b.q((aeun) obj2, ((java.util.concurrent.atomic.AtomicBoolean) pnnVar.d.a).get() ? ruc.Q : ruc.R, hvpVar.a instanceof java.util.concurrent.CancellationException ? rub.d : rub.c);
                }
                break;
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                if (!(th instanceof java.util.concurrent.CancellationException)) {
                    a.bq(zpz.a.c(), "future failed, cannot notify", "com/google/android/dialershared/incall/core/dataservice/impl/InCallUpdatePropagatorImpl$1", "onFailure", 'S', "InCallUpdatePropagatorImpl.java", th, zct.b);
                }
                break;
            default:
                ((amzv) this.a).a(th);
                break;
        }
    }

    public final void b(java.lang.Object obj) {
        switch (this.$cid) {
            case 0:
                ((defpackage.pgs) this.a).d.n(ruc.T, rub.b);
                break;
            case 1:
                ibt ibtVar = (ibt) this.a;
                ibtVar.b.set(false);
                if (ibtVar.c.getAndSet(false)) {
                    ibtVar.a();
                }
                break;
            case 2:
                ((defpackage.pgs) this.a).d.n(ruc.U, rub.b);
                break;
            case 3:
                defpackage.phe.a.b().l("com/android/dialer/incall/cachedphonelookup/MultiStagePhoneLookup$1", "onSuccess", 145, "MultiStagePhoneLookup.java").v("cp2 lookup success");
                ((defpackage.phe) this.a).e.n(ruc.T, rub.b);
                break;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                defpackage.phe.a.b().l("com/android/dialer/incall/cachedphonelookup/MultiStagePhoneLookup$2", "onSuccess", 177, "MultiStagePhoneLookup.java").v("timeout lookup success");
                ((defpackage.phe) this.a).e.n(ruc.U, rub.b);
                break;
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                defpackage.phe.a.b().l("com/android/dialer/incall/cachedphonelookup/MultiStagePhoneLookup$4", "onSuccess", 237, "MultiStagePhoneLookup.java").v("all lookup completed success");
                ((krv) this.a).d();
                break;
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                defpackage.uar.a.b().l("com/android/dialer/sonic/impl/service/SonicVoiceAnimatorListener$1", "onSuccess", 149, "SonicVoiceAnimatorListener.java").v("animation state change from blocking to idle");
                c();
                break;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                java.lang.Object obj2 = this.a;
                j$.util.Optional optional = ((defpackage.pnn) obj2).a;
                defpackage.pmv pmvVar = new defpackage.pmv(obj2, 11);
                if (true == optional.isPresent()) {
                    java.lang.Object obj3 = optional.get();
                    defpackage.pnn pnnVar = (defpackage.pnn) pmvVar.a;
                    pnnVar.b.b.q((aeun) obj3, ((java.util.concurrent.atomic.AtomicBoolean) pnnVar.d.a).getAndSet(false) ? ruc.Q : ruc.R, rub.b);
                }
                break;
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                zpz zpzVar = (zpz) this.a;
                if (!zpzVar.d) {
                    zpzVar.d = true;
                    agsm.i(1235, ahvr.E(new defpackage.yne(this, 2), zpzVar.c), "failed posting new graph", new java.lang.Object[0]);
                }
                break;
            default:
                ((amzv) this.a).e(obj);
                break;
        }
    }

    public pgr(defpackage.pgs pgsVar, int i) {
        this.$cid = i;
        j$.util.Objects.requireNonNull(pgsVar);
        this.a = pgsVar;
    }

    public pgr(defpackage.pgs pgsVar, int i, byte[] bArr) {
        this.$cid = i;
        j$.util.Objects.requireNonNull(pgsVar);
        this.a = pgsVar;
    }

    public pgr(defpackage.phe pheVar, int i) {
        this.$cid = i;
        j$.util.Objects.requireNonNull(pheVar);
        this.a = pheVar;
    }

    public pgr(defpackage.phe pheVar, int i, byte[] bArr) {
        this.$cid = i;
        j$.util.Objects.requireNonNull(pheVar);
        this.a = pheVar;
    }

    public pgr(defpackage.phe pheVar, krv krvVar, int i) {
        this.$cid = i;
        this.a = krvVar;
        j$.util.Objects.requireNonNull(pheVar);
    }

    public pgr(defpackage.uar uarVar, int i) {
        this.$cid = i;
        j$.util.Objects.requireNonNull(uarVar);
        this.a = uarVar;
    }

    public pgr(defpackage.zpv zpvVar, defpackage.zpr zprVar, int i) {
        this.$cid = i;
        this.a = zprVar;
        j$.util.Objects.requireNonNull(zpvVar);
    }

    public pgr(zpz zpzVar, int i) {
        this.$cid = i;
        j$.util.Objects.requireNonNull(zpzVar);
        this.a = zpzVar;
    }

    public pgr(amzv amzvVar, int i) {
        this.$cid = i;
        j$.util.Objects.requireNonNull(amzvVar);
        this.a = amzvVar;
    }
}
