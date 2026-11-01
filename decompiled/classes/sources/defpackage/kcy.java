package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class kcy {
    public final defpackage.kiu a;

    public kcy(defpackage.kiu kiuVar) {
        defpackage.aooh.f(kiuVar, "coalescedRow");
        this.a = kiuVar;
    }

    public final long a() {
        return this.a.d;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this != obj) {
            return (obj instanceof defpackage.kcy) && defpackage.aooh.n(this.a, ((defpackage.kcy) obj).a);
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final java.lang.String toString() {
        return "SelectedCallLogEntry(coalescedRow=" + this.a + ')';
    }
}
