package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class alas extends java.util.AbstractMap {
    public final defpackage.alao a;
    private final java.util.Map b;

    public alas(java.util.Map map, defpackage.alao alaoVar) {
        this.b = map;
        this.a = alaoVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final java.util.Set entrySet() {
        return new defpackage.alar(this, this.b.entrySet());
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final java.lang.Object get(java.lang.Object obj) {
        java.lang.Object obj2 = this.b.get(obj);
        if (obj2 == null) {
            return null;
        }
        return this.a.a(obj2);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final java.lang.Object put(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.Object objPut = this.b.put(obj, java.lang.Integer.valueOf(((alah) obj2).a()));
        if (objPut == null) {
            return null;
        }
        return this.a.a(objPut);
    }
}
