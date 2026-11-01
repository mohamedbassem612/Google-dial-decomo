package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class kib implements defpackage.khw {
    public final defpackage.gfj a = new defpackage.khy(this);
    public final defpackage.gfi b = new defpackage.khz(this);
    public final defpackage.gfi c = new defpackage.kia(this);
    private final defpackage.gfy d;

    public kib(defpackage.gfy gfyVar) {
        this.d = gfyVar;
    }

    public static final defpackage.kid k(defpackage.gin ginVar) {
        int iQ = defpackage.dzk.Q(ginVar, "uuid");
        int iQ2 = defpackage.dzk.Q(ginVar, "name");
        int iQ3 = defpackage.dzk.Q(ginVar, "photoThumbnailUri");
        int iQ4 = defpackage.dzk.Q(ginVar, "packageName");
        int iQ5 = defpackage.dzk.Q(ginVar, "lookupKey");
        int iQ6 = defpackage.dzk.Q(ginVar, "capabilities");
        return new defpackage.kid(iQ == -1 ? null : ginVar.e(iQ), iQ2 == -1 ? null : ginVar.e(iQ2), iQ3 == -1 ? null : ginVar.e(iQ3), iQ4 == -1 ? null : ginVar.e(iQ4), iQ5 != -1 ? ginVar.e(iQ5) : null, iQ6 == -1 ? 0 : (int) ginVar.c(iQ6));
    }

    @Override // defpackage.abwx
    public final java.lang.Object a(java.util.List list, java.util.List list2, java.util.List list3, defpackage.aoln aolnVar) {
        return defpackage.dez.n(this.d, new aju(this, list, list2, list3, 8), aolnVar);
    }

    @Override // defpackage.abwx
    public final java.lang.Object b(java.util.Collection collection, defpackage.aoln aolnVar) {
        collection.getClass();
        return defpackage.dez.o(this.d, false, true, new khx(this, collection, 4), aolnVar);
    }

    @Override // defpackage.abwx
    public final java.lang.Object c(defpackage.giv givVar, defpackage.aoln aolnVar) {
        java.util.TreeMap treeMap = defpackage.ggd.a;
        defpackage.rsr rsrVarI = defpackage.dez.t(givVar).i();
        return defpackage.dez.o(this.d, true, false, new khx(rsrVarI.a, rsrVarI, 2, (byte[]) null), aolnVar);
    }

    @Override // defpackage.abwx
    public final java.lang.Object d(java.lang.String str, defpackage.aoln aolnVar) {
        return defpackage.dez.n(this.d, new khx(this, str, 5), aolnVar);
    }

    @Override // defpackage.abwx
    public final /* bridge */ /* synthetic */ java.lang.Object e(java.lang.String str, java.lang.String str2, java.lang.Object obj, defpackage.aonj aonjVar, defpackage.aoln aolnVar) {
        return defpackage.dez.n(this.d, new dqw(this, str, str2, (java.lang.String) obj, aonjVar, 8), aolnVar);
    }

    @Override // defpackage.abwx
    public final java.lang.Object f(java.lang.String str, java.lang.String str2, java.util.Set set, defpackage.aonj aonjVar, defpackage.aoln aolnVar) {
        return defpackage.dez.n(this.d, new dqw(this, str, str2, set, aonjVar, 9), aolnVar);
    }

    @Override // defpackage.abwx
    public final java.lang.Object g(defpackage.giv givVar, defpackage.aoln aolnVar) {
        java.util.TreeMap treeMap = defpackage.ggd.a;
        defpackage.rsr rsrVarI = defpackage.dez.t(givVar).i();
        return defpackage.dez.o(this.d, true, false, new khx(rsrVarI.a, rsrVarI, 3, (byte[]) null), aolnVar);
    }

    @Override // defpackage.abwx
    public final java.lang.Object h(defpackage.giv givVar, defpackage.aoln aolnVar) {
        java.util.TreeMap treeMap = defpackage.ggd.a;
        defpackage.rsr rsrVarI = defpackage.dez.t(givVar).i();
        return defpackage.dez.o(this.d, true, false, new khx(rsrVarI.a, rsrVarI, 1, (byte[]) null), aolnVar);
    }

    @Override // defpackage.abwx
    public final java.lang.Object i(java.util.Collection collection, defpackage.aoln aolnVar) {
        collection.getClass();
        return defpackage.dez.o(this.d, false, true, new gwo(this, collection, 20, (byte[]) null), aolnVar);
    }

    @Override // defpackage.abwx
    public final java.lang.Object j(java.util.Collection collection, defpackage.aoln aolnVar) {
        collection.getClass();
        return defpackage.dez.o(this.d, false, true, new khx(this, collection, 0), aolnVar);
    }
}
