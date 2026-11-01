package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ozq {
    public final defpackage.ozr a;

    public ozq(defpackage.ozr ozrVar) {
        this.a = ozrVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this != obj) {
            return (obj instanceof defpackage.ozq) && this.a == ((defpackage.ozq) obj).a;
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final java.lang.String toString() {
        return "TapEventLocal(result=" + this.a + ')';
    }
}
