package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
final class alav implements java.util.Map.Entry {
    public final java.util.Map.Entry a;

    public alav(java.util.Map.Entry entry) {
        this.a = entry;
    }

    @Override // java.util.Map.Entry
    public final java.lang.Object getKey() {
        return this.a.getKey();
    }

    @Override // java.util.Map.Entry
    public final java.lang.Object getValue() {
        alax alaxVar = (alax) this.a.getValue();
        if (alaxVar == null) {
            return null;
        }
        return alaxVar.b();
    }

    @Override // java.util.Map.Entry
    public final java.lang.Object setValue(java.lang.Object obj) {
        if (!(obj instanceof albh)) {
            throw new java.lang.IllegalArgumentException("Lazy field only supports MessageLite values.");
        }
        java.util.Map.Entry entry = this.a;
        albh albhVar = ((alax) entry.getValue()).b;
        entry.setValue(new alax((albh) obj));
        return albhVar;
    }
}
