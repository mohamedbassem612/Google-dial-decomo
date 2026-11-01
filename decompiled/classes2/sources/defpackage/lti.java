package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class lti implements ltd {
    public final gfj a = new defpackage.ltf(this);
    public final gfi b = new defpackage.ltg(this);
    public final gfi c = new defpackage.lth(this);
    private final gfy d;

    public lti(gfy gfyVar) {
        this.d = gfyVar;
    }

    public static final defpackage.lsv k(gin ginVar) {
        int iQ = dzk.Q(ginVar, "call_creation_time_millis");
        int iQ2 = dzk.Q(ginVar, "caller_number");
        return new defpackage.lsv(iQ == -1 ? 0L : ginVar.c(iQ), iQ2 == -1 ? null : ginVar.e(iQ2));
    }

    public final java.lang.Object a(java.util.List list, java.util.List list2, java.util.List list3, aoln aolnVar) {
        return dez.n(this.d, new defpackage.aju(this, list, list2, list3, 10), aolnVar);
    }

    public final java.lang.Object b(java.util.Collection collection, aoln aolnVar) {
        collection.getClass();
        return dez.o(this.d, false, true, new defpackage.lte(this, collection, 1), aolnVar);
    }

    public final java.lang.Object c(giv givVar, aoln aolnVar) {
        java.util.TreeMap treeMap = ggd.a;
        rsr rsrVarI = dez.t(givVar).i();
        return dez.o(this.d, true, false, new defpackage.khx(rsrVarI.a, rsrVarI, 20, null), aolnVar);
    }

    public final java.lang.Object d(java.lang.String str, aoln aolnVar) {
        return dez.n(this.d, new defpackage.khx(this, str, 19), aolnVar);
    }

    public final /* bridge */ /* synthetic */ java.lang.Object e(java.lang.String str, java.lang.String str2, java.lang.Object obj, aonj aonjVar, aoln aolnVar) {
        return dez.n(this.d, new defpackage.dqw((java.lang.Object) this, str, str2, (java.lang.Long) obj, aonjVar, 13), aolnVar);
    }

    public final java.lang.Object f(java.lang.String str, java.lang.String str2, java.util.Set set, aonj aonjVar, aoln aolnVar) {
        return dez.n(this.d, new defpackage.dqw(this, str, str2, set, aonjVar, 12), aolnVar);
    }

    public final java.lang.Object g(giv givVar, aoln aolnVar) {
        java.util.TreeMap treeMap = ggd.a;
        rsr rsrVarI = dez.t(givVar).i();
        return dez.o(this.d, true, false, new defpackage.lte(rsrVarI.a, rsrVarI, 4, null), aolnVar);
    }

    public final java.lang.Object h(giv givVar, aoln aolnVar) {
        java.util.TreeMap treeMap = ggd.a;
        rsr rsrVarI = dez.t(givVar).i();
        return dez.o(this.d, true, false, new defpackage.lte(rsrVarI.a, rsrVarI, 0, null), aolnVar);
    }

    public final java.lang.Object i(java.util.Collection collection, aoln aolnVar) {
        collection.getClass();
        return dez.o(this.d, false, true, new defpackage.lte(this, collection, 2), aolnVar);
    }

    public final java.lang.Object j(java.util.Collection collection, aoln aolnVar) {
        collection.getClass();
        return dez.o(this.d, false, true, new defpackage.lte(this, collection, 3), aolnVar);
    }
}
