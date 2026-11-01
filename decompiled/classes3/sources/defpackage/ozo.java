package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ozo {
    public final ozp a;
    public final java.lang.Float b;

    public ozo(ozp ozpVar, java.lang.Float f) {
        this.a = ozpVar;
        this.b = f;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.ozo) {
            defpackage.ozo ozoVar = (defpackage.ozo) obj;
            if (this.a == ozoVar.a && aooh.n(this.b, ozoVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        java.lang.Float f = this.b;
        return iHashCode + (f == null ? 0 : f.hashCode());
    }

    public final java.lang.String toString() {
        return "SwipeEventLocal(result=" + this.a + ", distance=" + this.b + ')';
    }
}
