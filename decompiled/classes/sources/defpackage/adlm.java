package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class adlm implements defpackage.adte {
    final /* synthetic */ defpackage.aezs a;

    public adlm(defpackage.aezs aezsVar) {
        j$.util.Objects.requireNonNull(aezsVar);
        this.a = aezsVar;
    }

    @Override // defpackage.adte
    public final void d() {
        defpackage.aiof aiofVar = defpackage.adhn.a;
        defpackage.aezs aezsVar = this.a;
        if (((java.util.concurrent.atomic.AtomicBoolean) aezsVar.b).compareAndSet(true, false)) {
            ((defpackage.tvn) aezsVar.e).P(new adgt(3));
        }
    }

    @Override // defpackage.adte
    public final void e() {
        ((defpackage.aiob) ((defpackage.aiob) defpackage.adhn.a.b()).l("com/google/android/libraries/micore/superpacks/packs/HttpDownloadProtocol$LifecycleCallbackImpl", "pausedForConnectivity", 305, "HttpDownloadProtocol.java")).v("All downloads are paused waiting for connectivity.");
        defpackage.aezs aezsVar = this.a;
        if (((java.util.concurrent.atomic.AtomicBoolean) aezsVar.b).compareAndSet(false, true)) {
            ((defpackage.tvn) aezsVar.e).P(new adgt(3));
        }
    }

    @Override // defpackage.adte
    public final void c() {
    }
}
