package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class pcb {
    public final defpackage.pca a;

    public pcb(defpackage.pca pcaVar) {
        aooh.f(pcaVar, com.android.onboarding.config.workerforegroundpriority.WorkerForegroundPriority.KEY_PRIORITY);
        this.a = pcaVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this != obj) {
            return (obj instanceof defpackage.pcb) && this.a == ((defpackage.pcb) obj).a;
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final java.lang.String toString() {
        return "ActiveFeature(priority=" + this.a + ')';
    }
}
