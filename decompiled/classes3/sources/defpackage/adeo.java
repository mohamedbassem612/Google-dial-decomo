package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class adeo {
    public final aihd a;

    public adeo(aihd aihdVar) {
        aooh.f(aihdVar, "parentTypes");
        this.a = aihdVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this != obj) {
            return (obj instanceof defpackage.adeo) && aooh.n(this.a, ((defpackage.adeo) obj).a);
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final java.lang.String toString() {
        return "{parentTypes: " + this.a + '}';
    }
}
