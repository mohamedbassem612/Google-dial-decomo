package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class rsb {
    public final defpackage.rso a;

    public rsb(defpackage.rso rsoVar) {
        this.a = rsoVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this != obj) {
            return (obj instanceof defpackage.rsb) && defpackage.aooh.n(this.a, ((defpackage.rsb) obj).a);
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final java.lang.String toString() {
        return "MarqueeConfiguration(throttling=" + this.a + ')';
    }
}
