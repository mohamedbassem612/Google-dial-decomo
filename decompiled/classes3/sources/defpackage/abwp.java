package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class abwp extends aomh implements aonn {
    java.lang.Object a;
    java.lang.Object b;
    java.lang.Object c;
    java.lang.Object d;
    int e;
    final /* synthetic */ abwo f;
    final /* synthetic */ abwn g;
    final /* synthetic */ defpackage.afpl h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public abwp(defpackage.afpl afplVar, abwo abwoVar, abwn abwnVar, aoln aolnVar) {
        super(2, aolnVar);
        this.h = afplVar;
        this.f = abwoVar;
        this.g = abwnVar;
    }

    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        return c((aoss) obj, (aoln) obj2).b(aojh.a);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0081  */
    /* JADX WARN: Code duplicated, block: B:24:0x0090  */
    /* JADX WARN: Code duplicated, block: B:29:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:31:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:34:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:38:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:39:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:40:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r4v1, types: [aonn, java.lang.Object] */
    public final java.lang.Object b(java.lang.Object obj) {
        java.lang.Object obj2;
        java.lang.Object obj3;
        java.lang.Object obj4;
        ahbq ahbqVar;
        abwn abwnVar;
        abwo abwoVar;
        abwo abwoVar2;
        java.lang.Object obj5;
        java.lang.Object obj6;
        abwn abwnVar2;
        aolu aoluVar = aolu.a;
        int i = this.e;
        if (i != 0) {
            if (i == 1) {
                obj2 = this.a;
                aooc.af(obj);
            } else if (i == 2) {
                obj3 = this.b;
                obj4 = this.a;
                aooc.af(obj);
                if (!aooh.n(obj3, obj)) {
                    return null;
                }
                ahbqVar = new ahbq(obj4, defpackage.abxl.c(obj3, obj));
                abwnVar = this.g;
                abwoVar = this.f;
                if (abwnVar != null) {
                    this.a = ahbqVar;
                    this.b = abwnVar;
                    this.c = abwoVar;
                    this.d = ahbqVar;
                    this.e = 3;
                    if (abwnVar.a() == aoluVar) {
                        return aoluVar;
                    }
                }
                abwoVar2 = abwoVar;
                obj5 = ahbqVar;
                obj6 = obj5;
                this.a = obj6;
                this.b = abwnVar;
                this.c = obj5;
                this.d = null;
                this.e = 4;
                if (abwoVar2.e((ahbq) obj5, this) == aoluVar) {
                    return aoluVar;
                }
                abwnVar2 = abwnVar;
            } else if (i == 3) {
                obj5 = this.d;
                abwo abwoVar3 = (abwo) this.c;
                abwn abwnVar3 = (abwn) this.b;
                ahbq ahbqVar2 = (ahbq) this.a;
                aooc.af(obj);
                abwnVar = abwnVar3;
                abwoVar2 = abwoVar3;
                obj6 = ahbqVar2;
                this.a = obj6;
                this.b = abwnVar;
                this.c = obj5;
                this.d = null;
                this.e = 4;
                if (abwoVar2.e((ahbq) obj5, this) == aoluVar) {
                    return aoluVar;
                }
                abwnVar2 = abwnVar;
            } else {
                if (i != 4) {
                    ahbq ahbqVar3 = (ahbq) this.a;
                    aooc.af(obj);
                    return ahbqVar3;
                }
                obj5 = (ahbq) this.c;
                abwnVar2 = (abwn) this.b;
                obj6 = (ahbq) this.a;
                aooc.af(obj);
            }
            if (abwnVar2 != null) {
                this.a = obj6;
                this.b = null;
                this.c = null;
                this.e = 5;
                if (abwnVar2.b((ahbq) obj5, this) == aoluVar) {
                    return aoluVar;
                }
            }
            return obj6;
        }
        aooc.af(obj);
        defpackage.afpl afplVar = this.h;
        abwo abwoVar4 = this.f;
        java.lang.Object obj7 = afplVar.b;
        this.a = obj7;
        this.e = 1;
        java.lang.Object objB = abwoVar4.b(obj7, this);
        if (objB == aoluVar) {
            return aoluVar;
        }
        obj2 = obj7;
        obj = objB;
        defpackage.afpl afplVar2 = this.h;
        this.a = obj2;
        this.b = obj;
        this.e = 2;
        java.lang.Object objA = afplVar2.a.a(obj, this);
        if (objA == aoluVar) {
            return aoluVar;
        }
        java.lang.Object obj8 = obj2;
        obj3 = obj;
        obj = objA;
        obj4 = obj8;
        if (!aooh.n(obj3, obj)) {
            return null;
        }
        ahbqVar = new ahbq(obj4, defpackage.abxl.c(obj3, obj));
        abwnVar = this.g;
        abwoVar = this.f;
        if (abwnVar != null) {
            this.a = ahbqVar;
            this.b = abwnVar;
            this.c = abwoVar;
            this.d = ahbqVar;
            this.e = 3;
            if (abwnVar.a() == aoluVar) {
                return aoluVar;
            }
        }
        abwoVar2 = abwoVar;
        obj5 = ahbqVar;
        obj6 = obj5;
        this.a = obj6;
        this.b = abwnVar;
        this.c = obj5;
        this.d = null;
        this.e = 4;
        if (abwoVar2.e((ahbq) obj5, this) == aoluVar) {
            return aoluVar;
        }
        abwnVar2 = abwnVar;
        if (abwnVar2 != null) {
            this.a = obj6;
            this.b = null;
            this.c = null;
            this.e = 5;
            if (abwnVar2.b((ahbq) obj5, this) == aoluVar) {
                return aoluVar;
            }
        }
        return obj6;
    }

    public final aoln c(java.lang.Object obj, aoln aolnVar) {
        return new defpackage.abwp(this.h, this.f, this.g, aolnVar);
    }
}
