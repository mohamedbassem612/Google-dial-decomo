package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
final class alap implements java.util.Map.Entry {
    final /* synthetic */ defpackage.alas a;
    private final java.util.Map.Entry b;

    public alap(defpackage.alas alasVar, java.util.Map.Entry entry) {
        j$.util.Objects.requireNonNull(alasVar);
        this.a = alasVar;
        this.b = entry;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(java.lang.Object obj) {
        if (obj != this) {
            return (obj instanceof java.util.Map.Entry) && getKey().equals(((java.util.Map.Entry) obj).getKey()) && getValue().equals(getValue());
        }
        return true;
    }

    @Override // java.util.Map.Entry
    public final java.lang.Object getKey() {
        return this.b.getKey();
    }

    @Override // java.util.Map.Entry
    public final java.lang.Object getValue() {
        return this.a.a.a(this.b.getValue());
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return this.b.hashCode();
    }

    @Override // java.util.Map.Entry
    public final java.lang.Object setValue(java.lang.Object obj) {
        java.lang.Object value = this.b.setValue(java.lang.Integer.valueOf(((alah) obj).a()));
        if (value == null) {
            return null;
        }
        return this.a.a.a(value);
    }
}
