package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class kar implements defpackage.kat {
    public final defpackage.jlr a;

    public kar(defpackage.jlr jlrVar) {
        this.a = jlrVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this != obj) {
            return (obj instanceof defpackage.kar) && aooh.n(this.a, ((defpackage.kar) obj).a);
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final java.lang.String toString() {
        return "Changed(updatedRealtimeData=" + this.a + ')';
    }
}
