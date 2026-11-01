package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class chz extends aojt {
    private final cie a;

    public chz(cie cieVar) {
        this.a = cieVar;
    }

    public final int a() {
        return this.a.b();
    }

    public final /* bridge */ /* synthetic */ boolean add(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException();
    }

    public final void clear() {
        this.a.clear();
    }

    public final /* bridge */ boolean contains(java.lang.Object obj) {
        if (!(obj instanceof java.util.Map.Entry)) {
            return false;
        }
        java.util.Map.Entry entry = (java.util.Map.Entry) obj;
        if (!((true != (entry instanceof java.lang.Object) ? null : entry) instanceof java.util.Map.Entry)) {
            return false;
        }
        cie cieVar = this.a;
        java.lang.Object obj2 = cieVar.get(entry.getKey());
        if (obj2 != null) {
            return aooh.n(obj2, entry.getValue());
        }
        return entry.getValue() == null && cieVar.containsKey(entry.getKey());
    }

    public final java.util.Iterator iterator() {
        return new defpackage.ctw(this.a, 1);
    }

    public final /* bridge */ boolean remove(java.lang.Object obj) {
        if (obj instanceof java.util.Map.Entry) {
            java.util.Map.Entry entry = (java.util.Map.Entry) obj;
            if ((true != (entry instanceof java.lang.Object) ? null : entry) instanceof java.util.Map.Entry) {
                return this.a.remove(entry.getKey(), entry.getValue());
            }
        }
        return false;
    }
}
