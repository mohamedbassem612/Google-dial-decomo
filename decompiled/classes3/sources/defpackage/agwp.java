package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class agwp extends defpackage.agwm {
    public final defpackage.agwm a;

    public agwp(defpackage.agwm agwmVar) {
        this.a = agwmVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this != obj) {
            return (obj instanceof defpackage.agwp) && aooh.n(this.a, ((defpackage.agwp) obj).a);
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final java.lang.String toString() {
        return "Complete(outcome=" + this.a + ')';
    }
}
