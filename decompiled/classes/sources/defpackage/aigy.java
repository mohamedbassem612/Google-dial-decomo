package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public abstract class aigy extends defpackage.aifo implements j$.util.Collection, defpackage.aijo {
    private static final long serialVersionUID = 912559;
    private transient defpackage.aify a;

    private void readObject(java.io.ObjectInputStream objectInputStream) throws java.io.InvalidObjectException {
        throw new java.io.InvalidObjectException("Use SerializedForm");
    }

    @Override // defpackage.aijo
    @java.lang.Deprecated
    public final int a(java.lang.Object obj, int i) {
        throw null;
    }

    @Override // defpackage.aifo
    public final int c(java.lang.Object[] objArr, int i) {
        defpackage.ailj it = j().iterator();
        while (it.hasNext()) {
            aijp aijpVar = (aijp) it.next();
            java.util.Arrays.fill(objArr, i, aijpVar.a() + i, aijpVar.a);
            i += aijpVar.a();
        }
        return i;
    }

    @Override // defpackage.aifo, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(java.lang.Object obj) {
        return b(obj) > 0;
    }

    @Override // defpackage.aijo
    @java.lang.Deprecated
    public final int d(java.lang.Object obj, int i) {
        throw null;
    }

    @Override // java.util.Collection
    public final boolean equals(java.lang.Object obj) {
        return airh.h(this, obj);
    }

    @Override // defpackage.aifo
    public final defpackage.aify g() {
        defpackage.aify aifyVar = this.a;
        if (aifyVar != null) {
            return aifyVar;
        }
        defpackage.aify aifyVarG = super.g();
        this.a = aifyVarG;
        return aifyVarG;
    }

    @Override // defpackage.aijo
    @java.lang.Deprecated
    public final boolean h(java.lang.Object obj, int i) {
        throw null;
    }

    @Override // java.util.Collection, defpackage.aijo
    public final int hashCode() {
        return defpackage.ahvr.al(j());
    }

    @Override // defpackage.aijo
    public /* bridge */ /* synthetic */ java.util.Set i() {
        throw null;
    }

    @Override // defpackage.aifo, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* JADX INFO: renamed from: k */
    public final defpackage.ailj iterator() {
        return new aigu(this, j().iterator());
    }

    public abstract defpackage.aihd n();

    @Override // defpackage.aijo
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public final defpackage.aihd j() {
        return isEmpty() ? defpackage.aikn.a : new aigw(this);
    }

    public abstract aijp p(int i);

    @Override // java.util.AbstractCollection
    public final java.lang.String toString() {
        return j().toString();
    }

    @Override // defpackage.aifo
    public abstract java.lang.Object writeReplace();
}
