package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class alby implements java.util.Map.Entry, java.lang.Comparable {
    public java.lang.Object a;
    final /* synthetic */ defpackage.alcb b;
    public final defpackage.alac c;

    public alby(defpackage.alcb alcbVar, defpackage.alac alacVar, java.lang.Object obj) {
        j$.util.Objects.requireNonNull(alcbVar);
        this.b = alcbVar;
        this.c = alacVar;
        this.a = obj;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(java.lang.Object obj) {
        return this.c.compareTo(((defpackage.alby) obj).c);
    }

    @Override // java.util.Map.Entry
    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof java.util.Map.Entry) {
            java.util.Map.Entry entry = (java.util.Map.Entry) obj;
            if (defpackage.a.L(this.c, entry.getKey()) && defpackage.a.L(this.a, entry.getValue())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final /* synthetic */ java.lang.Object getKey() {
        return this.c;
    }

    @Override // java.util.Map.Entry
    public final java.lang.Object getValue() {
        return this.a;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        defpackage.alac alacVar = this.c;
        int iHashCode = alacVar == null ? 0 : alacVar.hashCode();
        java.lang.Object obj = this.a;
        return iHashCode ^ (obj != null ? obj.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final java.lang.Object setValue(java.lang.Object obj) {
        this.b.b();
        java.lang.Object obj2 = this.a;
        this.a = obj;
        return obj2;
    }

    public final java.lang.String toString() {
        return java.lang.String.valueOf(this.c) + '=' + java.lang.String.valueOf(this.a);
    }
}
