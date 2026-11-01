package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class oif implements ahth {
    public final defpackage.oeu a;

    public oif(defpackage.oeu oeuVar) {
        this.a = oeuVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this != obj) {
            return (obj instanceof defpackage.oif) && this.a == ((defpackage.oif) obj).a;
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final java.lang.String toString() {
        return "ExpressoGridItemClickEvent(key=" + this.a + ')';
    }
}
