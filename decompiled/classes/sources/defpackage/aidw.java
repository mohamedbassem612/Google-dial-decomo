package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aidw extends java.util.AbstractSet {
    final /* synthetic */ defpackage.aieb a;

    public aidw(defpackage.aieb aiebVar) {
        j$.util.Objects.requireNonNull(aiebVar);
        this.a = aiebVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(java.lang.Object obj) {
        defpackage.aieb aiebVar = this.a;
        java.util.Map mapJ = aiebVar.j();
        if (mapJ != null) {
            return mapJ.entrySet().contains(obj);
        }
        if (obj instanceof java.util.Map.Entry) {
            java.util.Map.Entry entry = (java.util.Map.Entry) obj;
            int iD = aiebVar.d(entry.getKey());
            if (iD != -1 && j$.util.Objects.equals(aiebVar.h(iD), entry.getValue())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final java.util.Iterator iterator() {
        return this.a.i();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(java.lang.Object obj) {
        int iC;
        int iL;
        defpackage.aieb aiebVar = this.a;
        java.util.Map mapJ = aiebVar.j();
        if (mapJ != null) {
            return mapJ.entrySet().remove(obj);
        }
        if (obj instanceof java.util.Map.Entry) {
            java.util.Map.Entry entry = (java.util.Map.Entry) obj;
            if (!aiebVar.o() && (iL = ahus.l(entry.getKey(), entry.getValue(), (iC = aiebVar.c()), aiebVar.g(), aiebVar.p(), aiebVar.q(), aiebVar.r())) != -1) {
                aiebVar.m(iL, iC);
                aiebVar.f--;
                aiebVar.k();
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.a.size();
    }
}
