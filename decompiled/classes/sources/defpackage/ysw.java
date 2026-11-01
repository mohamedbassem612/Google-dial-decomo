package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ysw implements defpackage.zbo {
    public final defpackage.ysv a;

    public ysw(defpackage.ysv ysvVar) {
        defpackage.aooh.f(ysvVar, "metrics");
        this.a = ysvVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this != obj) {
            return (obj instanceof defpackage.ysw) && defpackage.aooh.n(this.a, ((defpackage.ysw) obj).a);
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final java.lang.String toString() {
        return "AiCoreInfraMetricsEvent(metrics=" + this.a + ')';
    }
}
