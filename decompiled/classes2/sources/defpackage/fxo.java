package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class fxo extends aomh implements aonn {
    private final /* synthetic */ int $cid;
    int a;
    final /* synthetic */ float b;
    final /* synthetic */ java.lang.Object c;
    final /* synthetic */ java.lang.Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fxo(float f, defpackage.akr akrVar, defpackage.fvs fvsVar, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.b = f;
        this.c = akrVar;
        this.d = fvsVar;
    }

    public final /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        int i = this.$cid;
        if (i == 0) {
            return c((aoss) obj, (aoln) obj2).b(aojh.a);
        }
        if (i != 1) {
            return c((aoss) obj, (aoln) obj2).b(aojh.a);
        }
        return c((aoss) obj, (aoln) obj2).b(aojh.a);
    }

    /* JADX WARN: Type inference failed for: r10v2, types: [cer, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v0, types: [aiq, java.lang.Object] */
    public final java.lang.Object b(java.lang.Object obj) {
        int i = this.$cid;
        if (i == 0) {
            aolu aoluVar = aolu.a;
            int i2 = this.a;
            aooc.af(obj);
            if (i2 == 0) {
                ?? r10 = this.d;
                if (defpackage.hgu.ab(r10).size() > 1) {
                    defpackage.fvs fvsVar = (defpackage.fvs) defpackage.hgu.ab(r10).get(defpackage.hgu.ab(r10).size() - 2);
                    java.lang.Object obj2 = this.c;
                    float f = this.b;
                    this.a = 1;
                    if (((defpackage.akr) obj2).i(f, fvsVar, this) == aoluVar) {
                        return aoluVar;
                    }
                }
            }
            return aojh.a;
        }
        if (i == 1) {
            aolu aoluVar2 = aolu.a;
            int i3 = this.a;
            aooc.af(obj);
            if (i3 == 0) {
                java.lang.Object obj3 = this.d;
                java.lang.Float f2 = new java.lang.Float(this.b);
                ?? r5 = this.c;
                this.a = 1;
                if (aii.l(((bzl) obj3).e, f2, (aiq) r5, (java.lang.Object) null, (aonj) null, this, 12) == aoluVar2) {
                    return aoluVar2;
                }
            }
            return aojh.a;
        }
        aolu aoluVar3 = aolu.a;
        int i4 = this.a;
        aooc.af(obj);
        if (i4 != 0) {
            if (i4 == 1) {
            }
            return aojh.a;
        }
        float f3 = this.b;
        if (f3 > 0.0f) {
            java.lang.Object obj4 = this.c;
            this.a = 1;
            defpackage.akr akrVar = (defpackage.akr) obj4;
            if (akrVar.i(f3, akrVar.b(), this) == aoluVar3) {
                return aoluVar3;
            }
        }
        if (this.b == 0.0f) {
            java.lang.Object obj5 = this.c;
            java.lang.Object obj6 = this.d;
            this.a = 2;
            if (((defpackage.akr) obj5).j(obj6, this) == aoluVar3) {
                return aoluVar3;
            }
        }
        return aojh.a;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [cer, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v1, types: [aiq, java.lang.Object] */
    public final aoln c(java.lang.Object obj, aoln aolnVar) {
        int i = this.$cid;
        if (i == 0) {
            return new defpackage.fxo((defpackage.akr) this.c, this.b, (cer) this.d, aolnVar, 0);
        }
        if (i == 1) {
            return new defpackage.fxo((bzl) this.d, this.b, (aiq) this.c, aolnVar, 1);
        }
        return new defpackage.fxo(this.b, (defpackage.akr) this.c, (defpackage.fvs) this.d, aolnVar, 2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fxo(defpackage.akr akrVar, float f, cer cerVar, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.c = akrVar;
        this.b = f;
        this.d = cerVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fxo(bzl bzlVar, float f, aiq aiqVar, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.d = bzlVar;
        this.b = f;
        this.c = aiqVar;
    }
}
