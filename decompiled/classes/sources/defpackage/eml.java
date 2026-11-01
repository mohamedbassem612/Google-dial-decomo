package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class eml implements java.util.Map.Entry, defpackage.aoow {
    public final java.lang.Object a;
    public defpackage.eml b;
    public defpackage.eml c;
    public boolean d;
    private final java.lang.Object e;

    public eml(java.lang.Object obj, java.lang.Object obj2) {
        this.e = obj;
        this.a = obj2;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.eml) {
            defpackage.eml emlVar = (defpackage.eml) obj;
            if (defpackage.aooh.n(this.e, emlVar.e) && defpackage.aooh.n(this.a, emlVar.a)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final java.lang.Object getKey() {
        return this.e;
    }

    @Override // java.util.Map.Entry
    public final java.lang.Object getValue() {
        return this.a;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        java.lang.Object obj = this.e;
        return ((obj == null ? 0 : obj.hashCode()) * 31) + this.a.hashCode();
    }

    @Override // java.util.Map.Entry
    public final java.lang.Object setValue(java.lang.Object obj) {
        return defpackage.a.an();
    }

    public final java.lang.String toString() {
        return "Entry(key=" + this.e + ", value=" + this.a + ')';
    }
}
