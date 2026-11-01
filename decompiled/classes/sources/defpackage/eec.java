package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class eec extends defpackage.aomh implements defpackage.aonj {
    java.lang.Object a;
    java.lang.Object b;
    int c;
    final /* synthetic */ defpackage.eei d;
    final /* synthetic */ defpackage.aolr e;
    final /* synthetic */ defpackage.aonn f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eec(defpackage.eei eeiVar, defpackage.aolr aolrVar, defpackage.aonn aonnVar, defpackage.aoln aolnVar) {
        super(1, aolnVar);
        this.d = eeiVar;
        this.e = aolrVar;
        this.f = aonnVar;
    }

    @Override // defpackage.aonj
    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj) {
        return new defpackage.eec(this.d, this.e, this.f, (defpackage.aoln) obj).b(defpackage.aojh.a);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0063  */
    /* JADX WARN: Code duplicated, block: B:19:0x0068  */
    /* JADX WARN: Code duplicated, block: B:22:0x006d  */
    /* JADX WARN: Code duplicated, block: B:24:0x0073  */
    /* JADX WARN: Code duplicated, block: B:27:0x0084  */
    /* JADX WARN: Code duplicated, block: B:31:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:32:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.aomb
    public final java.lang.Object b(java.lang.Object obj) {
        java.lang.Object obj2;
        defpackage.ecr ecrVar;
        java.lang.Object obj3;
        int iHashCode;
        defpackage.eei eeiVar;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i = this.c;
        if (i != 0) {
            if (i == 1) {
                defpackage.aooc.af(obj);
            } else if (i == 2) {
                obj2 = this.a;
                defpackage.aooc.af(obj);
                defpackage.aolr aolrVar = this.e;
                defpackage.eeb eebVar = new defpackage.eeb(this.d, (defpackage.gjy) obj, this.f, (defpackage.ecr) obj2, (defpackage.aoln) null, 0);
                this.a = obj2;
                this.c = 3;
                obj = defpackage.aoov.aj(aolrVar, eebVar, this);
                if (obj == aoluVar) {
                    return aoluVar;
                }
            } else {
                if (i != 3) {
                    java.lang.Object obj4 = this.b;
                    defpackage.aooc.af(obj);
                    return obj4;
                }
                obj2 = this.a;
                defpackage.aooc.af(obj);
            }
            ecrVar = (defpackage.ecr) obj2;
            obj3 = ecrVar.a;
            if (obj3 != null) {
                iHashCode = obj3.hashCode();
            } else {
                iHashCode = 0;
            }
            if (iHashCode == ecrVar.b) {
                throw new java.lang.IllegalStateException("Data in DataStore was mutated but DataStore is only compatible with Immutable types.");
            }
            if (!defpackage.aooh.n(obj3, obj)) {
                eeiVar = this.d;
                this.a = null;
                this.b = obj;
                this.c = 4;
                if (eeiVar.i(obj, true, this) == aoluVar) {
                    return aoluVar;
                }
            }
            return obj;
        }
        defpackage.aooc.af(obj);
        defpackage.eei eeiVar2 = this.d;
        defpackage.dgz dgzVar = new defpackage.dgz(eeiVar2, (defpackage.aoln) null, 3, (byte[]) null);
        this.c = 1;
        obj = eeiVar2.h(true, dgzVar, this);
        if (obj == aoluVar) {
            return aoluVar;
        }
        defpackage.ecr ecrVar2 = (defpackage.ecr) obj;
        this.a = ecrVar2;
        this.c = 2;
        obj2 = ecrVar2;
        obj = null;
        defpackage.aolr aolrVar2 = this.e;
        defpackage.eeb eebVar2 = new defpackage.eeb(this.d, (defpackage.gjy) obj, this.f, (defpackage.ecr) obj2, (defpackage.aoln) null, 0);
        this.a = obj2;
        this.c = 3;
        obj = defpackage.aoov.aj(aolrVar2, eebVar2, this);
        if (obj == aoluVar) {
            return aoluVar;
        }
        ecrVar = (defpackage.ecr) obj2;
        obj3 = ecrVar.a;
        if (obj3 != null) {
            iHashCode = obj3.hashCode();
        } else {
            iHashCode = 0;
        }
        if (iHashCode == ecrVar.b) {
            throw new java.lang.IllegalStateException("Data in DataStore was mutated but DataStore is only compatible with Immutable types.");
        }
        if (!defpackage.aooh.n(obj3, obj)) {
            eeiVar = this.d;
            this.a = null;
            this.b = obj;
            this.c = 4;
            if (eeiVar.i(obj, true, this) == aoluVar) {
                return aoluVar;
            }
        }
        return obj;
    }
}
