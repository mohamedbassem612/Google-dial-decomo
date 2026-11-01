package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public class cia implements java.util.Map.Entry, aoow {
    public final java.lang.Object a;
    private final java.lang.Object b;

    public cia(java.lang.Object obj, java.lang.Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(java.lang.Object obj) {
        java.util.Map.Entry entry = obj instanceof java.util.Map.Entry ? (java.util.Map.Entry) obj : null;
        if (entry != null) {
            return aooh.n(entry.getKey(), this.a) && aooh.n(entry.getValue(), getValue());
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final java.lang.Object getKey() {
        return this.a;
    }

    @Override // java.util.Map.Entry
    public java.lang.Object getValue() {
        return this.b;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        java.lang.Object obj = this.a;
        int iHashCode = obj != null ? obj.hashCode() : 0;
        java.lang.Object value = getValue();
        return iHashCode ^ (value != null ? value.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public java.lang.Object setValue(java.lang.Object obj) {
        return a.an();
    }

    public final java.lang.String toString() {
        java.lang.Object value = getValue();
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(this.a);
        sb.append('=');
        sb.append(value);
        return sb.toString();
    }
}
