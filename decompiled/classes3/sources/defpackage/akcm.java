package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class akcm {
    public final anpc a;
    public final anms b;
    public final anms c;
    public final anms d;

    public akcm(anpc anpcVar, anms anmsVar, anms anmsVar2, anms anmsVar3) {
        this.a = anpcVar;
        this.b = anmsVar;
        this.c = anmsVar2;
        this.d = anmsVar3;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.akcm) {
            defpackage.akcm akcmVar = (defpackage.akcm) obj;
            if (aooh.n(this.a, akcmVar.a) && aooh.n(this.b, akcmVar.b) && aooh.n(this.c, akcmVar.c) && aooh.n(this.d, akcmVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
    }

    public final java.lang.String toString() {
        return "ParcelableOverMetadataKeys(metadataKey=" + this.a + ", requestKey=" + this.b + ", responseHeaderKey=" + this.c + ", responseTrailerKey=" + this.d + ')';
    }
}
