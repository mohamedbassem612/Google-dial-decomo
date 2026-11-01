package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aidi extends defpackage.aijz implements java.io.Serializable {
    private static final long serialVersionUID = 0;
    final defpackage.ahyc a;
    final defpackage.aijz b;

    public aidi(defpackage.ahyc ahycVar, defpackage.aijz aijzVar) {
        this.a = ahycVar;
        this.b = aijzVar;
    }

    @Override // defpackage.aijz, java.util.Comparator
    public final int compare(java.lang.Object obj, java.lang.Object obj2) {
        defpackage.ahyc ahycVar = this.a;
        return this.b.compare(ahycVar.apply(obj), ahycVar.apply(obj2));
    }

    @Override // java.util.Comparator
    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.aidi) {
            defpackage.aidi aidiVar = (defpackage.aidi) obj;
            if (this.a.equals(aidiVar.a) && this.b.equals(aidiVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return j$.util.Objects.hash(new java.lang.Object[]{this.a, this.b});
    }

    public final java.lang.String toString() {
        defpackage.ahyc ahycVar = this.a;
        return this.b.toString() + ".onResultOf(" + ahycVar.toString() + ')';
    }
}
