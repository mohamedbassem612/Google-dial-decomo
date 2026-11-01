package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class akgg extends java.util.LinkedHashMap {
    final /* synthetic */ defpackage.amwp a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public akgg(defpackage.amwp amwpVar, int i) {
        super(i, 0.75f, true);
        j$.util.Objects.requireNonNull(amwpVar);
        this.a = amwpVar;
    }

    @Override // java.util.LinkedHashMap
    protected final boolean removeEldestEntry(java.util.Map.Entry entry) {
        return size() > this.a.a;
    }
}
