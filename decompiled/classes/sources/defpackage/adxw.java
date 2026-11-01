package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class adxw extends defpackage.aomh implements defpackage.aonn {
    private final /* synthetic */ int $cid;
    java.lang.Object a;
    java.lang.Object b;
    int c;
    final /* synthetic */ defpackage.apdp d;
    final /* synthetic */ java.lang.Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public adxw(defpackage.apdp apdpVar, defpackage.aonj aonjVar, defpackage.aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.d = apdpVar;
        this.e = aonjVar;
    }

    @Override // defpackage.aonn
    public final /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        if (this.$cid != 0) {
            return ((defpackage.adxw) c((defpackage.aoss) obj, (defpackage.aoln) obj2)).b(defpackage.aojh.a);
        }
        return ((defpackage.adxw) c((defpackage.aoss) obj, (defpackage.aoln) obj2)).b(defpackage.aojh.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [aonj] */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7, types: [aonn] */
    /* JADX WARN: Type inference failed for: r3v9 */
    @Override // defpackage.aomb
    public final java.lang.Object b(java.lang.Object obj) throws java.lang.Throwable {
        ?? r3;
        java.lang.Object obj2;
        java.lang.Throwable th;
        java.lang.Object obj3;
        java.lang.Object obj4;
        ?? r4;
        java.lang.Object obj5;
        java.lang.Throwable th2;
        java.lang.Object obj6;
        java.lang.Object obj7;
        if (this.$cid != 0) {
            defpackage.aolu aoluVar = defpackage.aolu.a;
            int i = this.c;
            try {
                if (i == 0) {
                    defpackage.aooc.af(obj);
                    defpackage.apdp apdpVar = this.d;
                    java.lang.Object obj8 = this.e;
                    this.a = apdpVar;
                    this.b = obj8;
                    this.c = 1;
                    if (apdpVar.b(this) == aoluVar) {
                        return aoluVar;
                    }
                    r4 = obj8;
                    obj5 = apdpVar;
                } else {
                    if (i != 1) {
                        obj6 = this.a;
                        try {
                            defpackage.aooc.af(obj);
                            obj7 = obj6;
                            ((defpackage.apdp) obj7).d();
                            return defpackage.aojh.a;
                        } catch (java.lang.Throwable th3) {
                            th2 = th3;
                            ((defpackage.apdp) obj6).d();
                            throw th2;
                        }
                    }
                    java.lang.Object obj9 = this.b;
                    java.lang.Object obj10 = this.a;
                    defpackage.aooc.af(obj);
                    obj5 = obj10;
                    r4 = obj9;
                }
                defpackage.efu efuVar = new defpackage.efu((defpackage.aonn) r4, (defpackage.aoln) null, 2, (byte[]) null);
                this.a = obj5;
                this.b = null;
                this.c = 2;
                if (defpackage.aosv.m(efuVar, this) == aoluVar) {
                    return aoluVar;
                }
                obj7 = obj5;
                ((defpackage.apdp) obj7).d();
                return defpackage.aojh.a;
            } catch (java.lang.Throwable th4) {
                java.lang.Object obj11 = obj5;
                th2 = th4;
                obj6 = obj11;
                ((defpackage.apdp) obj6).d();
                throw th2;
            }
        }
        defpackage.aolu aoluVar2 = defpackage.aolu.a;
        int i2 = this.c;
        try {
            if (i2 == 0) {
                defpackage.aooc.af(obj);
                defpackage.apdp apdpVar2 = this.d;
                java.lang.Object obj12 = this.e;
                this.a = apdpVar2;
                this.b = obj12;
                this.c = 1;
                if (apdpVar2.b(this) == aoluVar2) {
                    return aoluVar2;
                }
                r3 = obj12;
                obj2 = apdpVar2;
            } else {
                if (i2 != 1) {
                    obj3 = this.a;
                    try {
                        defpackage.aooc.af(obj);
                        obj4 = obj3;
                        ((defpackage.apdp) obj4).d();
                        return obj;
                    } catch (java.lang.Throwable th5) {
                        th = th5;
                        ((defpackage.apdp) obj3).d();
                        throw th;
                    }
                }
                java.lang.Object obj13 = this.b;
                java.lang.Object obj14 = this.a;
                defpackage.aooc.af(obj);
                obj2 = obj14;
                r3 = obj13;
            }
            this.a = obj2;
            this.b = null;
            this.c = 2;
            java.lang.Object objA = r3.a(this);
            if (objA == aoluVar2) {
                return aoluVar2;
            }
            java.lang.Object obj15 = obj2;
            obj = objA;
            obj4 = obj15;
            ((defpackage.apdp) obj4).d();
            return obj;
        } catch (java.lang.Throwable th6) {
            java.lang.Object obj16 = obj2;
            th = th6;
            obj3 = obj16;
            ((defpackage.apdp) obj3).d();
            throw th;
        }
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v2, types: [aonn, java.lang.Object] */
    @Override // defpackage.aomb
    public final defpackage.aoln c(java.lang.Object obj, defpackage.aoln aolnVar) {
        return this.$cid != 0 ? new defpackage.adxw(this.d, (defpackage.aonn) this.e, aolnVar, 1) : new defpackage.adxw(this.d, (defpackage.aonj) this.e, aolnVar, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public adxw(defpackage.apdp apdpVar, defpackage.aonn aonnVar, defpackage.aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.d = apdpVar;
        this.e = aonnVar;
    }
}
