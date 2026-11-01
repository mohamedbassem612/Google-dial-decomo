package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class aebr extends defpackage.aomh implements defpackage.aonn {
    java.lang.Object a;
    java.lang.Object b;
    java.lang.Object c;
    java.lang.Object d;
    int e;
    final /* synthetic */ defpackage.aebs f;
    final /* synthetic */ defpackage.akti g;
    final /* synthetic */ defpackage.aduw h;
    private /* synthetic */ java.lang.Object i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aebr(defpackage.aebs aebsVar, defpackage.akti aktiVar, defpackage.aduw aduwVar, defpackage.aoln aolnVar) {
        super(2, aolnVar);
        this.f = aebsVar;
        this.g = aktiVar;
        this.h = aduwVar;
    }

    @Override // defpackage.aonn
    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        return ((defpackage.aebr) c((defpackage.aoss) obj, (defpackage.aoln) obj2)).b(defpackage.aojh.a);
    }

    @Override // defpackage.aomb
    public final java.lang.Object b(java.lang.Object obj) throws java.lang.Throwable {
        defpackage.aoss aossVar;
        java.lang.Object obj2;
        java.lang.Object obj3;
        java.lang.Object obj4;
        java.lang.Object obj5;
        defpackage.aoss aossVar2;
        java.lang.Throwable th;
        java.lang.Object obj6;
        java.lang.Object obj7;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i = this.e;
        try {
            if (i == 0) {
                defpackage.aooc.af(obj);
                aossVar = (defpackage.aoss) this.i;
                defpackage.aebs aebsVar = this.f;
                defpackage.akti aktiVar = this.g;
                obj2 = this.h;
                this.i = aossVar;
                defpackage.apdp apdpVar = aebsVar.b;
                this.a = apdpVar;
                this.b = aebsVar;
                this.c = aktiVar;
                this.d = obj2;
                this.e = 1;
                if (apdpVar.b(this) == aoluVar) {
                    return aoluVar;
                }
                obj3 = aktiVar;
                obj5 = aebsVar;
                obj4 = apdpVar;
            } else {
                if (i != 1) {
                    defpackage.apdp apdpVar2 = (defpackage.apdp) this.i;
                    try {
                        defpackage.aooc.af(obj);
                        obj7 = apdpVar2;
                        ((defpackage.apdp) obj7).d();
                        return obj;
                    } catch (java.lang.Throwable th2) {
                        th = th2;
                        obj6 = apdpVar2;
                        ((defpackage.apdp) obj6).d();
                        throw th;
                    }
                }
                obj2 = this.d;
                obj3 = this.c;
                java.lang.Object obj8 = this.b;
                java.lang.Object obj9 = this.a;
                aossVar = (defpackage.aoss) this.i;
                defpackage.aooc.af(obj);
                obj5 = obj8;
                obj4 = obj9;
            }
            this.i = obj4;
            this.a = null;
            this.b = null;
            this.c = null;
            this.d = null;
            this.e = 2;
            defpackage.aiof aiofVar = defpackage.aebs.a;
            obj = ((defpackage.aebs) obj5).n(aossVar2, (defpackage.akti) obj3, true, (defpackage.aduw) obj2, this);
            if (obj == aoluVar) {
                return aoluVar;
            }
            obj7 = obj4;
            ((defpackage.apdp) obj7).d();
            return obj;
        } catch (java.lang.Throwable th3) {
            th = th3;
            obj6 = obj4;
            ((defpackage.apdp) obj6).d();
            throw th;
        }
        aossVar2 = aossVar;
    }

    @Override // defpackage.aomb
    public final defpackage.aoln c(java.lang.Object obj, defpackage.aoln aolnVar) {
        defpackage.aebr aebrVar = new defpackage.aebr(this.f, this.g, this.h, aolnVar);
        aebrVar.i = obj;
        return aebrVar;
    }
}
