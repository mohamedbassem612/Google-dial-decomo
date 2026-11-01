package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class aboc implements defpackage.abol {
    public final java.lang.String a = "chip_row";
    public final defpackage.abiv b;

    public aboc(defpackage.abiv abivVar) {
        this.b = abivVar;
    }

    @Override // defpackage.abol
    public final java.lang.String a() {
        return this.a;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.aboc) {
            defpackage.aboc abocVar = (defpackage.aboc) obj;
            if (aooh.n(this.a, abocVar.a) && aooh.n(this.b, abocVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final java.lang.String toString() {
        return "ChipRowItem(key=" + this.a + ", chipUiData=" + this.b + ')';
    }
}
