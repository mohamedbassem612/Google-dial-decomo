package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class aicb extends defpackage.aiix {
    final /* synthetic */ defpackage.aicd a;

    public aicb(defpackage.aicd aicdVar) {
        j$.util.Objects.requireNonNull(aicdVar);
        this.a = aicdVar;
    }

    @Override // defpackage.aiix
    public final java.util.Map a() {
        return this.a;
    }

    @Override // defpackage.aiix
    public final boolean contains(java.lang.Object obj) {
        return ahus.r(this.a.a.entrySet(), obj);
    }

    public final java.util.Iterator iterator() {
        return new defpackage.aicc(this.a);
    }

    @Override // defpackage.aiix
    public final boolean remove(java.lang.Object obj) {
        java.lang.Object objRemove;
        if (!contains(obj)) {
            return false;
        }
        java.util.Map.Entry entry = (java.util.Map.Entry) j$.util.Objects.requireNonNull((java.util.Map.Entry) obj);
        defpackage.aicd aicdVar = this.a;
        java.lang.Object key = entry.getKey();
        aicr aicrVar = aicdVar.b;
        java.util.Map map = aicrVar.a;
        ahvr.ci(map);
        try {
            objRemove = map.remove(key);
        } catch (java.lang.ClassCastException | java.lang.NullPointerException unused) {
            objRemove = null;
        }
        java.util.Collection collection = (java.util.Collection) objRemove;
        if (collection != null) {
            int size = collection.size();
            collection.clear();
            aicrVar.b -= size;
        }
        return true;
    }
}
