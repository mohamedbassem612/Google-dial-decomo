package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class gdq extends defpackage.gds {
    public final int a;
    public final int b;

    public gdq(int i, int i2, int i3, int i4, int i5, int i6) {
        super(i3, i4, i5, i6);
        this.a = i;
        this.b = i2;
    }

    @Override // defpackage.gds
    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.gdq) {
            defpackage.gdq gdqVar = (defpackage.gdq) obj;
            if (this.a == gdqVar.a && this.b == gdqVar.b && this.c == gdqVar.c && this.d == gdqVar.d && this.e == gdqVar.e && this.f == gdqVar.f) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.gds
    public final int hashCode() {
        return super.hashCode() + this.a + this.b;
    }

    public final java.lang.String toString() {
        return defpackage.aoov.n("ViewportHint.Access(\n            |    pageOffset=" + this.a + ",\n            |    indexInPage=" + this.b + ",\n            |    presentedItemsBefore=" + this.c + ",\n            |    presentedItemsAfter=" + this.d + ",\n            |    originalPageOffsetFirst=" + this.e + ",\n            |    originalPageOffsetLast=" + this.f + ",\n            |)");
    }
}
