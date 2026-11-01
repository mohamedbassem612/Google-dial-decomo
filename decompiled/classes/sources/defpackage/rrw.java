package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class rrw {
    public final rqv a;

    public rrw(rqv rqvVar) {
        this.a = rqvVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this != obj) {
            return (obj instanceof defpackage.rrw) && defpackage.aooh.n(this.a, ((defpackage.rrw) obj).a);
        }
        return true;
    }

    public final int hashCode() {
        rqv rqvVar = this.a;
        if (rqvVar == null) {
            return 0;
        }
        return rqvVar.hashCode();
    }

    public final java.lang.String toString() {
        return "SearchDialIntentState(searchArgs=" + this.a + ')';
    }

    public rrw() {
        this(null);
    }
}
