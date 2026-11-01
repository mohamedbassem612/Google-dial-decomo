package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class aibs implements java.util.Map.Entry {
    final java.lang.Object a;
    java.lang.Object b;
    final /* synthetic */ aibt c;

    public aibs(aibt aibtVar, java.lang.Object obj, java.lang.Object obj2) {
        j$.util.Objects.requireNonNull(aibtVar);
        this.c = aibtVar;
        this.a = obj;
        this.b = obj2;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof java.util.Map.Entry)) {
            return false;
        }
        java.util.Map.Entry entry = (java.util.Map.Entry) obj;
        return this.a.equals(entry.getKey()) && this.b.equals(entry.getValue());
    }

    @Override // java.util.Map.Entry
    public final java.lang.Object getKey() {
        return this.a;
    }

    @Override // java.util.Map.Entry
    public final java.lang.Object getValue() {
        return this.b;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return this.a.hashCode() ^ this.b.hashCode();
    }

    @Override // java.util.Map.Entry
    public final java.lang.Object setValue(java.lang.Object obj) {
        java.lang.Object objPut = this.c.put(this.a, obj);
        this.b = obj;
        return objPut;
    }

    public final java.lang.String toString() {
        return java.lang.String.valueOf(this.a) + '=' + java.lang.String.valueOf(this.b);
    }
}
