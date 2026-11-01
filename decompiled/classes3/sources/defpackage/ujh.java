package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ujh implements defpackage.uji {
    public final defpackage.ujg a;

    public ujh(defpackage.ujg ujgVar) {
        this.a = ujgVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this != obj) {
            return (obj instanceof defpackage.ujh) && this.a == ((defpackage.ujh) obj).a;
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final java.lang.String toString() {
        return "Unknown(reason=" + this.a + ')';
    }
}
