package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class aldb implements java.util.Map.Entry, aoow {
    private final /* synthetic */ java.util.Map.Entry a;

    public aldb(java.util.Map.Entry entry) {
        aooh.f(entry, "delegate");
        this.a = entry;
    }

    @Override // java.util.Map.Entry
    public final java.lang.Object getKey() {
        return this.a.getKey();
    }

    @Override // java.util.Map.Entry
    public final java.lang.Object getValue() {
        return this.a.getValue();
    }

    @Override // java.util.Map.Entry
    public final java.lang.Object setValue(java.lang.Object obj) {
        return a.an();
    }
}
