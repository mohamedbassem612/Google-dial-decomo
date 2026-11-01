package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ahvq extends defpackage.aomh implements defpackage.aonn {
    private final /* synthetic */ int $cid;
    java.lang.Object a;
    int b;
    final /* synthetic */ java.lang.Object c;
    final /* synthetic */ java.lang.Object d;
    private /* synthetic */ java.lang.Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ahvq(defpackage.ahda ahdaVar, defpackage.aonn aonnVar, defpackage.aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.c = ahdaVar;
        this.d = aonnVar;
    }

    @Override // defpackage.aonn
    public final /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        if (this.$cid != 0) {
            return ((defpackage.ahvq) c((defpackage.gha) obj, (defpackage.aoln) obj2)).b(defpackage.aojh.a);
        }
        return ((defpackage.ahvq) c((defpackage.aoss) obj, (defpackage.aoln) obj2)).b(defpackage.aojh.a);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0083  */
    /* JADX WARN: Code duplicated, block: B:27:0x008f  */
    /* JADX WARN: Code duplicated, block: B:30:0x0099  */
    /* JADX WARN: Code duplicated, block: B:58:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:59:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:60:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r3v1, types: [aonn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v24, types: [aonj, java.lang.Object] */
    @Override // defpackage.aomb
    public final java.lang.Object b(java.lang.Object obj) throws java.lang.Throwable {
        java.lang.Throwable th;
        defpackage.apdp apdpVar;
        defpackage.gha ghaVar;
        java.lang.Object obj2;
        java.lang.Object obj3;
        defpackage.gha ghaVar2;
        defpackage.gha ghaVar3;
        java.lang.Object objE;
        java.lang.Object obj4;
        if (this.$cid == 0) {
            defpackage.aolu aoluVar = defpackage.aolu.a;
            int i = this.b;
            if (i == 0) {
                defpackage.aooc.af(obj);
                defpackage.aooc.Y(((defpackage.aoss) this.e).c());
                java.lang.Object obj5 = this.c;
                java.lang.Object obj6 = this.d;
                java.lang.Object obj7 = ((defpackage.ahda) obj5).a;
                this.e = obj7;
                this.a = obj6;
                this.b = 1;
                if (defpackage.ajsz.an(defpackage.ahvp.a, obj7, this) == aoluVar) {
                    return aoluVar;
                }
                defpackage.ajsz.ap(this).w(defpackage.aojh.a);
                return aoluVar;
            }
            if (i != 1) {
                apdpVar = (defpackage.apdp) this.e;
                try {
                    defpackage.aooc.af(obj);
                    apdpVar.d();
                    return obj;
                } catch (java.lang.Throwable th2) {
                    th = th2;
                    apdpVar.d();
                    throw th;
                }
            }
            ?? r3 = this.a;
            defpackage.apdp apdpVar2 = (defpackage.apdp) this.e;
            defpackage.aooc.af(obj);
            try {
                this.e = apdpVar2;
                this.a = null;
                this.b = 2;
                obj = defpackage.aosv.m(r3, this);
                if (obj == aoluVar) {
                    return aoluVar;
                }
                apdpVar = apdpVar2;
                apdpVar.d();
                return obj;
            } catch (java.lang.Throwable th3) {
                th = th3;
                apdpVar = apdpVar2;
                apdpVar.d();
                throw th;
            }
        }
        defpackage.aolu aoluVar2 = defpackage.aolu.a;
        int i2 = this.b;
        if (i2 != 0) {
            if (i2 == 1) {
                obj2 = this.a;
                ghaVar = (defpackage.gha) this.e;
                defpackage.aooc.af(obj);
            } else if (i2 != 2) {
                java.lang.Object obj8 = this.e;
                if (i2 != 3) {
                    defpackage.aooc.af(obj);
                    obj4 = obj8;
                } else {
                    ghaVar3 = (defpackage.gha) obj8;
                    defpackage.aooc.af(obj);
                    this.e = obj;
                    this.b = 4;
                    objE = ghaVar3.e();
                    if (objE == aoluVar2) {
                        return aoluVar2;
                    }
                    obj4 = obj;
                    obj = objE;
                }
            } else {
                obj3 = this.a;
                ghaVar2 = (defpackage.gha) this.e;
                defpackage.aooc.af(obj);
                defpackage.efu efuVar = new defpackage.efu((defpackage.aoln) null, (defpackage.aonj) this.d, 5);
                this.e = ghaVar2;
                this.a = null;
                this.b = 3;
                obj = ghaVar2.d((defpackage.ggg) obj3, efuVar, this);
                if (obj != aoluVar2) {
                    return aoluVar2;
                }
                ghaVar3 = ghaVar2;
                this.e = obj;
                this.b = 4;
                objE = ghaVar3.e();
                if (objE == aoluVar2) {
                    return aoluVar2;
                }
                obj4 = obj;
                obj = objE;
            }
            if (!((java.lang.Boolean) obj).booleanValue()) {
                return obj4;
            }
            ((defpackage.gfy) this.c).b().b();
            return obj4;
        }
        defpackage.aooc.af(obj);
        ghaVar = (defpackage.gha) this.e;
        defpackage.ggg gggVar = defpackage.ggg.b;
        this.e = ghaVar;
        this.a = gggVar;
        this.b = 1;
        java.lang.Object objE2 = ghaVar.e();
        if (objE2 == aoluVar2) {
            return aoluVar2;
        }
        obj2 = gggVar;
        obj = objE2;
        if (!((java.lang.Boolean) obj).booleanValue()) {
            defpackage.gfn gfnVarB = ((defpackage.gfy) this.c).b();
            this.e = ghaVar;
            this.a = obj2;
            this.b = 2;
            if (gfnVarB.a(this) == aoluVar2) {
                return aoluVar2;
            }
        }
        obj3 = obj2;
        ghaVar2 = ghaVar;
        defpackage.efu efuVar2 = new defpackage.efu((defpackage.aoln) null, (defpackage.aonj) this.d, 5);
        this.e = ghaVar2;
        this.a = null;
        this.b = 3;
        obj = ghaVar2.d((defpackage.ggg) obj3, efuVar2, this);
        if (obj != aoluVar2) {
            return aoluVar2;
        }
        ghaVar3 = ghaVar2;
        this.e = obj;
        this.b = 4;
        objE = ghaVar3.e();
        if (objE == aoluVar2) {
            return aoluVar2;
        }
        obj4 = obj;
        obj = objE;
        if (!((java.lang.Boolean) obj).booleanValue()) {
            return obj4;
        }
        ((defpackage.gfy) this.c).b().b();
        return obj4;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [aonn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v2, types: [aonj, java.lang.Object] */
    @Override // defpackage.aomb
    public final defpackage.aoln c(java.lang.Object obj, defpackage.aoln aolnVar) {
        int i = this.$cid;
        java.lang.Object obj2 = this.c;
        if (i != 0) {
            defpackage.ahvq ahvqVar = new defpackage.ahvq((defpackage.gfy) obj2, aolnVar, (defpackage.aonj) this.d, 1);
            ahvqVar.e = obj;
            return ahvqVar;
        }
        defpackage.ahvq ahvqVar2 = new defpackage.ahvq((defpackage.ahda) obj2, (defpackage.aonn) this.d, aolnVar, 0);
        ahvqVar2.e = obj;
        return ahvqVar2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ahvq(defpackage.gfy gfyVar, defpackage.aoln aolnVar, defpackage.aonj aonjVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.c = gfyVar;
        this.d = aonjVar;
    }
}
