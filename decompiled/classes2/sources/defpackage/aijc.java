package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class aijc extends defpackage.aija {
    final java.util.Map a;
    final defpackage.aiiy b;

    public aijc(java.util.Map map, defpackage.aiiy aiiyVar) {
        ahvr.ci(map);
        this.a = map;
        this.b = aiiyVar;
    }

    @Override // defpackage.aija
    public final java.util.Iterator a() {
        return ahvr.bb(this.a.entrySet().iterator(), ahvr.aB(this.b));
    }

    @Override // defpackage.aija, java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.a.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(java.lang.Object obj) {
        return this.a.containsKey(obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final java.lang.Object get(java.lang.Object obj) {
        java.util.Map map = this.a;
        java.lang.Object obj2 = map.get(obj);
        if (obj2 != null || map.containsKey(obj)) {
            return this.b.a(obj, obj2);
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final java.util.Set keySet() {
        return this.a.keySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final java.lang.Object remove(java.lang.Object obj) {
        java.util.Map map = this.a;
        if (map.containsKey(obj)) {
            return this.b.a(obj, map.remove(obj));
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.a.size();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final java.util.Collection values() {
        return new defpackage.aijd(this);
    }
}
