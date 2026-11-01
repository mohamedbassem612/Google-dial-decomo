package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class aokx implements java.util.Map.Entry, defpackage.aooz {
    private final aola a;
    private final int b;
    private final int c;

    public aokx(aola aolaVar, int i) {
        this.a = aolaVar;
        this.b = i;
        this.c = aolaVar.f;
    }

    private final void a() {
        if (this.a.f != this.c) {
            throw new java.util.ConcurrentModificationException("The backing map has been modified after this entry was obtained.");
        }
    }

    @Override // java.util.Map.Entry
    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof java.util.Map.Entry) {
            java.util.Map.Entry entry = (java.util.Map.Entry) obj;
            if (aooh.n(entry.getKey(), getKey()) && aooh.n(entry.getValue(), getValue())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final java.lang.Object getKey() {
        a();
        return this.a.b[this.b];
    }

    @Override // java.util.Map.Entry
    public final java.lang.Object getValue() {
        a();
        java.lang.Object[] objArr = this.a.c;
        aooh.c(objArr);
        return objArr[this.b];
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        java.lang.Object key = getKey();
        int iHashCode = key != null ? key.hashCode() : 0;
        java.lang.Object value = getValue();
        return iHashCode ^ (value != null ? value.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final java.lang.Object setValue(java.lang.Object obj) {
        a();
        aola aolaVar = this.a;
        aolaVar.f();
        java.lang.Object[] objArrK = aolaVar.k();
        int i = this.b;
        java.lang.Object obj2 = objArrK[i];
        objArrK[i] = obj;
        return obj2;
    }

    public final java.lang.String toString() {
        java.lang.Object key = getKey();
        java.lang.Object value = getValue();
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(key);
        sb.append('=');
        sb.append(value);
        return sb.toString();
    }
}
