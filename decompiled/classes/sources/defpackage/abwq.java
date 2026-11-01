package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class abwq extends defpackage.aomh implements defpackage.aonn {
    java.lang.Object a;
    java.lang.Object b;
    java.lang.Object c;
    java.lang.Object d;
    int e;
    final /* synthetic */ java.util.List f;
    final /* synthetic */ defpackage.abwo g;
    final /* synthetic */ defpackage.abwn h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public abwq(java.util.List list, defpackage.abwo abwoVar, defpackage.abwn abwnVar, defpackage.aoln aolnVar) {
        super(2, aolnVar);
        this.f = list;
        this.g = abwoVar;
        this.h = abwnVar;
    }

    @Override // defpackage.aonn
    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        return ((defpackage.abwq) c((defpackage.aoss) obj, (defpackage.aoln) obj2)).b(defpackage.aojh.a);
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:41:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:49:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:51:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:52:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [abwn] */
    /* JADX WARN: Type inference failed for: r2v6 */
    @Override // defpackage.aomb
    public final java.lang.Object b(java.lang.Object obj) {
        java.lang.Object obj2;
        defpackage.abwo abwoVar;
        java.lang.Object obj3;
        java.lang.Object obj4;
        ?? r2;
        java.lang.Object obj5;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i = this.e;
        if (i != 0) {
            if (i == 1) {
                defpackage.aooc.af(obj);
                return (defpackage.ahbq) obj;
            }
            if (i == 2) {
                defpackage.aooc.af(obj);
                java.util.List list = this.f;
                this.e = 3;
                obj = defpackage.aazc.k((java.util.Map) obj, list, this);
                if (obj == aoluVar) {
                    return aoluVar;
                }
            } else if (i == 3) {
                defpackage.aooc.af(obj);
            } else if (i == 4) {
                obj4 = this.d;
                defpackage.abwo abwoVar2 = (defpackage.abwo) this.c;
                obj3 = this.b;
                java.lang.Object obj6 = this.a;
                defpackage.aooc.af(obj);
                abwoVar = abwoVar2;
                obj2 = obj6;
                this.a = obj2;
                this.b = obj3;
                this.c = obj4;
                this.d = null;
                this.e = 5;
                if (abwoVar.e((defpackage.ahbq) obj4, this) != aoluVar) {
                    return aoluVar;
                }
                r2 = obj3;
            } else {
                if (i != 5) {
                    java.lang.Object obj7 = this.a;
                    defpackage.aooc.af(obj);
                    return obj7;
                }
                obj4 = (defpackage.ahbq) this.c;
                obj5 = this.b;
                obj2 = this.a;
                defpackage.aooc.af(obj);
            }
            if (r2 != 0) {
                this.a = obj2;
                this.b = null;
                this.c = null;
                this.e = 6;
                if (r2.b((defpackage.ahbq) obj4, this) == aoluVar) {
                    r2 = obj5;
                    return aoluVar;
                }
            }
            r2 = obj5;
            r2 = obj5;
            return obj2;
        }
        defpackage.aooc.af(obj);
        java.util.List list2 = this.f;
        int size = list2.size();
        defpackage.abwo abwoVar3 = this.g;
        if (size == 1) {
            afpl afplVar = (afpl) list2.get(0);
            defpackage.abwn abwnVar = this.h;
            this.e = 1;
            obj = defpackage.aazc.B(abwoVar3, afplVar, abwnVar, this);
            if (obj == aoluVar) {
                return aoluVar;
            }
            return (defpackage.ahbq) obj;
        }
        defpackage.aolg aolgVar = new defpackage.aolg(list2.size());
        java.util.Iterator it = list2.iterator();
        while (it.hasNext()) {
            aolgVar.add(((afpl) it.next()).b);
        }
        java.util.Set setB = aolgVar.b();
        this.e = 2;
        obj = abwoVar3.c(setB, this);
        if (obj == aoluVar) {
            return aoluVar;
        }
        java.util.List list3 = this.f;
        this.e = 3;
        obj = defpackage.aazc.k((java.util.Map) obj, list3, this);
        if (obj == aoluVar) {
            return aoluVar;
        }
        defpackage.ahbq ahbqVar = (defpackage.ahbq) obj;
        if (ahbqVar == null) {
            return null;
        }
        defpackage.abwn abwnVar2 = this.h;
        defpackage.abwo abwoVar4 = this.g;
        if (abwnVar2 != null) {
            this.a = ahbqVar;
            this.b = abwnVar2;
            this.c = abwoVar4;
            this.d = ahbqVar;
            this.e = 4;
            if (abwnVar2.a() == aoluVar) {
                return aoluVar;
            }
        }
        obj2 = ahbqVar;
        abwoVar = abwoVar4;
        obj3 = abwnVar2;
        obj4 = obj2;
        this.a = obj2;
        this.b = obj3;
        this.c = obj4;
        this.d = null;
        this.e = 5;
        if (abwoVar.e((defpackage.ahbq) obj4, this) != aoluVar) {
            return aoluVar;
        }
        r2 = obj3;
        if (r2 != 0) {
            this.a = obj2;
            this.b = null;
            this.c = null;
            this.e = 6;
            if (r2.b((defpackage.ahbq) obj4, this) == aoluVar) {
                r2 = obj5;
                return aoluVar;
            }
        }
        r2 = obj5;
        r2 = obj5;
        return obj2;
    }

    @Override // defpackage.aomb
    public final defpackage.aoln c(java.lang.Object obj, defpackage.aoln aolnVar) {
        return new defpackage.abwq(this.f, this.g, this.h, aolnVar);
    }
}
