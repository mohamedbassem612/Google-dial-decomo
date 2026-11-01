package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class oer implements defpackage.oem {
    public final defpackage.gfj a = new defpackage.oeo(this);
    public final defpackage.gfi b = new defpackage.oep(this);
    public final defpackage.gfi c = new defpackage.oeq(this);
    private final defpackage.gfy d;

    public oer(defpackage.gfy gfyVar) {
        this.d = gfyVar;
    }

    public static final defpackage.oes k(defpackage.gin ginVar) {
        int iQ = defpackage.dzk.Q(ginVar, "caller_number");
        return new defpackage.oes(iQ == -1 ? null : ginVar.e(iQ));
    }

    @Override // defpackage.abwx
    public final java.lang.Object a(java.util.List list, java.util.List list2, java.util.List list3, defpackage.aoln aolnVar) {
        return defpackage.dez.n(this.d, new aju(this, list, list2, list3, 14), aolnVar);
    }

    @Override // defpackage.abwx
    public final java.lang.Object b(java.util.Collection collection, defpackage.aoln aolnVar) {
        collection.getClass();
        return defpackage.dez.o(this.d, false, true, new oen(this, collection, 4), aolnVar);
    }

    @Override // defpackage.abwx
    public final java.lang.Object c(defpackage.giv givVar, defpackage.aoln aolnVar) {
        java.util.TreeMap treeMap = defpackage.ggd.a;
        defpackage.rsr rsrVarI = defpackage.dez.t(givVar).i();
        return defpackage.dez.o(this.d, true, false, new oen(rsrVarI.a, rsrVarI, 0, (byte[]) null), aolnVar);
    }

    @Override // defpackage.abwx
    public final java.lang.Object d(java.lang.String str, defpackage.aoln aolnVar) {
        return defpackage.dez.n(this.d, new oen(this, str, 3), aolnVar);
    }

    @Override // defpackage.abwx
    public final /* bridge */ /* synthetic */ java.lang.Object e(java.lang.String str, java.lang.String str2, java.lang.Object obj, defpackage.aonj aonjVar, defpackage.aoln aolnVar) {
        return defpackage.dez.n(this.d, new dqw(this, str, str2, (java.lang.String) obj, aonjVar, 18), aolnVar);
    }

    @Override // defpackage.abwx
    public final java.lang.Object f(java.lang.String str, java.lang.String str2, java.util.Set set, defpackage.aonj aonjVar, defpackage.aoln aolnVar) {
        return defpackage.dez.n(this.d, new dqw(this, str, str2, set, aonjVar, 19), aolnVar);
    }

    @Override // defpackage.abwx
    public final java.lang.Object g(defpackage.giv givVar, defpackage.aoln aolnVar) {
        java.util.TreeMap treeMap = defpackage.ggd.a;
        defpackage.rsr rsrVarI = defpackage.dez.t(givVar).i();
        return defpackage.dez.o(this.d, true, false, new lte(rsrVarI.a, rsrVarI, 20, (byte[]) null), aolnVar);
    }

    @Override // defpackage.abwx
    public final java.lang.Object h(defpackage.giv givVar, defpackage.aoln aolnVar) {
        java.util.TreeMap treeMap = defpackage.ggd.a;
        defpackage.rsr rsrVarI = defpackage.dez.t(givVar).i();
        return defpackage.dez.o(this.d, true, false, new oen(rsrVarI.a, rsrVarI, 2, (byte[]) null), aolnVar);
    }

    @Override // defpackage.abwx
    public final java.lang.Object i(java.util.Collection collection, defpackage.aoln aolnVar) {
        collection.getClass();
        return defpackage.dez.o(this.d, false, true, new oen(this, collection, 1), aolnVar);
    }

    @Override // defpackage.abwx
    public final java.lang.Object j(java.util.Collection collection, defpackage.aoln aolnVar) {
        collection.getClass();
        return defpackage.dez.o(this.d, false, true, new oen(this, collection, 5), aolnVar);
    }
}
