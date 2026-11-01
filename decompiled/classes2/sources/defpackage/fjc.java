package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class fjc implements android.media.Spatializer$OnSpatializerStateChangedListener {
    final /* synthetic */ java.lang.Runnable a;

    public fjc(defpackage.aeic aeicVar, java.lang.Runnable runnable) {
        this.a = runnable;
        j$.util.Objects.requireNonNull(aeicVar);
    }

    public final void onSpatializerAvailableChanged(android.media.Spatializer spatializer, boolean z) {
        this.a.run();
    }

    public final void onSpatializerEnabledChanged(android.media.Spatializer spatializer, boolean z) {
        this.a.run();
    }
}
