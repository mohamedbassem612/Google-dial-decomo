package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class agvk implements defpackage.ahmi {
    final /* synthetic */ defpackage.agus a;
    final /* synthetic */ androidx.work.WorkerParameters b;
    final /* synthetic */ java.util.function.Supplier c;

    public agvk(defpackage.aogc aogcVar, defpackage.agus agusVar, androidx.work.WorkerParameters workerParameters, java.util.function.Supplier supplier) {
        this.a = agusVar;
        this.b = workerParameters;
        this.c = supplier;
        j$.util.Objects.requireNonNull(aogcVar);
    }

    @Override // defpackage.ahmi
    public final defpackage.ajcq a(defpackage.ajcq ajcqVar, j$.time.Duration duration) {
        ((java.lang.Integer) aa$.ExternalSyntheticApiModelOutline1.m(this.c)).intValue();
        return this.a.c(ajcqVar, this.b, duration);
    }

    @Override // defpackage.ahmi
    public final defpackage.ajcq b() {
        return this.a.a(this.b);
    }
}
