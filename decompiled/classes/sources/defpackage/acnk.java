package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class acnk implements defpackage.aclv, defpackage.acni {
    public final defpackage.aiwd a;
    public final java.util.List b;
    public final java.util.List c;
    public final android.util.SparseIntArray d;
    private final defpackage.aify e;

    public acnk(defpackage.aiwd aiwdVar, java.util.List list, java.util.List list2, android.util.SparseIntArray sparseIntArray, java.util.List list3, android.util.SparseIntArray sparseIntArray2) {
        this.a = aiwdVar;
        this.b = j$.util.DesugarCollections.unmodifiableList(list);
        this.c = j$.util.DesugarCollections.unmodifiableList(list2);
        this.d = sparseIntArray;
        j$.util.DesugarCollections.unmodifiableList(list3);
        defpackage.ahvr.bN(!list.isEmpty(), "Must have at least one graft");
        defpackage.ahvr.bN(list2.size() == sparseIntArray.size() && list3.size() == sparseIntArray2.size(), "All children must have a parent specified.");
        this.e = defpackage.aify.p(defpackage.abrz.e((acnj) list.get(0)));
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            defpackage.ahvr.bM(defpackage.abrz.e((acnj) it.next()).equals(this.e.get(0)));
        }
    }

    @Override // defpackage.acni
    public final /* synthetic */ defpackage.acmi a() {
        return defpackage.abrz.e(this);
    }

    @Override // defpackage.acni
    public final java.util.List b() {
        return this.e;
    }

    public final java.lang.String toString() {
        defpackage.ahym ahymVarL = defpackage.ahvr.l(this);
        defpackage.aiwc aiwcVar = defpackage.abrz.e(this).d;
        if (aiwcVar == null) {
            aiwcVar = defpackage.aiwc.a;
        }
        ahymVarL.e("rootVeId", aiwcVar.d);
        defpackage.aiwc aiwcVar2 = defpackage.abrz.f(this).d;
        if (aiwcVar2 == null) {
            aiwcVar2 = defpackage.aiwc.a;
        }
        ahymVarL.e("targetVeId", aiwcVar2.d);
        return ahymVarL.toString();
    }
}
