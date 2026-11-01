package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class bui extends aomh implements aono {
    java.lang.Object a;
    java.lang.Object b;
    int c;
    /* synthetic */ long d;
    final /* synthetic */ defpackage.bun e;
    final /* synthetic */ kaw f;
    private /* synthetic */ java.lang.Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bui(kaw kawVar, defpackage.bun bunVar, aoln aolnVar) {
        super(3, aolnVar);
        this.f = kawVar;
        this.e = bunVar;
    }

    public final /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        long j = ((cpm) obj2).a;
        defpackage.bui buiVar = new defpackage.bui(this.f, this.e, (aoln) obj3);
        buiVar.g = (defpackage.asp) obj;
        buiVar.d = j;
        return buiVar.b(aojh.a);
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:50:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v0, types: [asp, java.lang.Object] */
    public final java.lang.Object b(java.lang.Object obj) throws java.lang.Throwable {
        java.lang.Object obj2;
        float fG;
        java.lang.Object obj3;
        kaw kawVar;
        defpackage.avk avkVar;
        ?? r0 = this.g;
        long j = this.d;
        aolu aoluVar = aolu.a;
        int i = this.c;
        if (i != 0) {
            if (i == 1) {
                obj2 = this.a;
                try {
                    aooc.af(obj);
                } catch (java.lang.Throwable th) {
                    th = th;
                    if (obj2 != null) {
                        kawVar = this.f;
                        avkVar = new defpackage.avk((avl) obj2);
                        this.g = null;
                        this.a = null;
                        this.b = th;
                        this.d = j;
                        this.c = 3;
                        if (kawVar.av(avkVar, this) == aoluVar) {
                            return aoluVar;
                        }
                    }
                    obj3 = th;
                    throw ((java.lang.Throwable) obj3);
                }
            } else {
                if (i != 2) {
                    obj3 = this.b;
                    aooc.af(obj);
                    throw ((java.lang.Throwable) obj3);
                }
                aooc.af(obj);
            }
            return aojh.a;
        }
        aooc.af(obj);
        try {
            avl avlVar = new avl(j);
            try {
                this.f.aw(avlVar);
                defpackage.bun bunVar = this.e;
                if (bunVar.b == aso.a) {
                    fG = java.lang.Float.intBitsToFloat((int) (4294967295L & j));
                } else {
                    fG = bunVar.c ? bunVar.g() - java.lang.Float.intBitsToFloat((int) (j >> 32)) : java.lang.Float.intBitsToFloat((int) (j >> 32));
                }
                bunVar.j(fG - bunVar.c());
                this.g = null;
                this.a = avlVar;
                this.d = j;
                this.c = 1;
                java.lang.Object objN = r0.n(this);
                if (objN == aoluVar) {
                    return aoluVar;
                }
                obj2 = avlVar;
                obj = objN;
            } catch (java.lang.Throwable th2) {
                obj2 = avlVar;
                th = th2;
                if (obj2 != null) {
                    kawVar = this.f;
                    avkVar = new defpackage.avk((avl) obj2);
                    this.g = null;
                    this.a = null;
                    this.b = th;
                    this.d = j;
                    this.c = 3;
                    if (kawVar.av(avkVar, this) == aoluVar) {
                        return aoluVar;
                    }
                }
                obj3 = th;
                throw ((java.lang.Throwable) obj3);
            }
        } catch (java.lang.Throwable th3) {
            th = th3;
            obj2 = null;
        }
        this.f.aw(((java.lang.Boolean) obj).booleanValue() ? new defpackage.avm((avl) obj2) : new defpackage.avk((avl) obj2));
        return aojh.a;
    }
}
