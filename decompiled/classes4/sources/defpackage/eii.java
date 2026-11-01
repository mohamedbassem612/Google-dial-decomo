package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class eii implements java.util.Map.Entry, java.lang.Comparable {
    public java.lang.Object a;
    final /* synthetic */ eik b;
    public final aehu c;

    public eii(eik eikVar, aehu aehuVar, java.lang.Object obj) {
        this.b = eikVar;
        this.c = aehuVar;
        this.a = obj;
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(java.lang.Object obj) {
        aehu aehuVar = ((defpackage.eii) obj).c;
        throw null;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof java.util.Map.Entry) {
            java.util.Map.Entry entry = (java.util.Map.Entry) obj;
            if (a.L(this.c, entry.getKey()) && a.L(this.a, entry.getValue())) {
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
        aehu aehuVar = this.c;
        int iHashCode = aehuVar == null ? 0 : aehuVar.hashCode();
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
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(this.c);
        sb.append('=');
        sb.append(this.a);
        return sb.toString();
    }
}
