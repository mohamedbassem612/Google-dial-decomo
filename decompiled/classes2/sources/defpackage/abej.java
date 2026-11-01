package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class abej {
    public final czc a;
    public final defpackage.abek b;

    public abej(czc czcVar, defpackage.abek abekVar) {
        aooh.f(czcVar, "placeable");
        this.a = czcVar;
        this.b = abekVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.abej) {
            defpackage.abej abejVar = (defpackage.abej) obj;
            if (aooh.n(this.a, abejVar.a) && aooh.n(this.b, abejVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final java.lang.String toString() {
        return "PlaceableWithTransition(placeable=" + this.a + ", transition=" + this.b + ')';
    }
}
