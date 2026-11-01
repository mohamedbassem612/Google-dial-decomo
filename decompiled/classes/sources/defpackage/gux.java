package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final /* synthetic */ class gux implements defpackage.aonj {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ boolean a;
    public final /* synthetic */ java.lang.Object b;
    public final /* synthetic */ java.lang.Object c;
    public final /* synthetic */ java.lang.Object d;

    public /* synthetic */ gux(defpackage.ccp ccpVar, java.util.List list, java.util.List list2, boolean z, int i) {
        this.$cid = i;
        this.b = ccpVar;
        this.d = list;
        this.c = list2;
        this.a = z;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v6, types: [ccp, java.lang.Object] */
    @Override // defpackage.aonj
    public final java.lang.Object a(java.lang.Object obj) {
        java.lang.Object obj2;
        if (this.$cid != 0) {
            final boolean z = this.a;
            final ?? r1 = this.c;
            final ?? r3 = this.d;
            ((defpackage.czb) obj).x(new defpackage.aonj() { // from class: bax
                @Override // defpackage.aonj
                public final java.lang.Object a(java.lang.Object obj3) {
                    boolean z2;
                    java.util.List list = r3;
                    defpackage.czb czbVar = (defpackage.czb) obj3;
                    int size = list.size();
                    int i = 0;
                    while (true) {
                        z2 = z;
                        if (i >= size) {
                            break;
                        }
                        ((defpackage.baz) list.get(i)).n(czbVar, z2);
                        i++;
                    }
                    java.util.List list2 = r1;
                    int size2 = list2.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        ((defpackage.baz) list2.get(i2)).n(czbVar, z2);
                    }
                    return defpackage.aojh.a;
                }
            });
            this.b.a();
            return defpackage.aojh.a;
        }
        java.lang.Throwable th = (java.lang.Throwable) obj;
        if (th instanceof defpackage.guu) {
            ((defpackage.gsg) this.b).i(((defpackage.guu) th).a);
        }
        if (this.a && (obj2 = this.c) != null) {
            defpackage.gve gveVar = (defpackage.gve) this.d;
            defpackage.gus gusVar = gveVar.d.r;
            da$.ExternalSyntheticApiModelOutline0.m(defpackage.dzk.H((java.lang.String) obj2), gveVar.a.hashCode());
        }
        return defpackage.aojh.a;
    }

    public /* synthetic */ gux(defpackage.gsg gsgVar, boolean z, java.lang.String str, defpackage.gve gveVar, int i) {
        this.$cid = i;
        this.b = gsgVar;
        this.a = z;
        this.c = str;
        this.d = gveVar;
    }
}
