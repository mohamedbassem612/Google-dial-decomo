package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class aebj extends aomh implements aonn {
    java.lang.Object a;
    java.lang.Object b;
    java.lang.Object c;
    java.lang.Object d;
    int e;
    final /* synthetic */ aebs f;
    final /* synthetic */ akti g;
    final /* synthetic */ aduw h;
    private /* synthetic */ java.lang.Object i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aebj(aebs aebsVar, akti aktiVar, aduw aduwVar, aoln aolnVar) {
        super(2, aolnVar);
        this.f = aebsVar;
        this.g = aktiVar;
        this.h = aduwVar;
    }

    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        return c((aoss) obj, (aoln) obj2).b(aojh.a);
    }

    public final java.lang.Object b(java.lang.Object obj) throws java.lang.Throwable {
        aoss aossVar;
        java.lang.Object obj2;
        java.lang.Object obj3;
        java.lang.Object obj4;
        java.lang.Object obj5;
        aoss aossVar2;
        java.lang.Throwable th;
        java.lang.Object obj6;
        java.lang.Object obj7;
        aolu aoluVar = aolu.a;
        int i = this.e;
        try {
            if (i == 0) {
                aooc.af(obj);
                aossVar = (aoss) this.i;
                aebs aebsVar = this.f;
                akti aktiVar = this.g;
                obj2 = this.h;
                this.i = aossVar;
                apdp apdpVar = aebsVar.b;
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
                    apdp apdpVar2 = (apdp) this.i;
                    try {
                        aooc.af(obj);
                        obj7 = apdpVar2;
                        ((apdp) obj7).d();
                        return obj;
                    } catch (java.lang.Throwable th2) {
                        th = th2;
                        obj6 = apdpVar2;
                        ((apdp) obj6).d();
                        throw th;
                    }
                }
                obj2 = this.d;
                obj3 = this.c;
                java.lang.Object obj8 = this.b;
                java.lang.Object obj9 = this.a;
                aossVar = (aoss) this.i;
                aooc.af(obj);
                obj5 = obj8;
                obj4 = obj9;
            }
            this.i = obj4;
            this.a = null;
            this.b = null;
            this.c = null;
            this.d = null;
            this.e = 2;
            aiof aiofVar = aebs.a;
            obj = ((aebs) obj5).n(aossVar2, (akti) obj3, false, (aduw) obj2, this);
            if (obj == aoluVar) {
                return aoluVar;
            }
            obj7 = obj4;
            ((apdp) obj7).d();
            return obj;
        } catch (java.lang.Throwable th3) {
            th = th3;
            obj6 = obj4;
            ((apdp) obj6).d();
            throw th;
        }
        aossVar2 = aossVar;
    }

    public final aoln c(java.lang.Object obj, aoln aolnVar) {
        defpackage.aebj aebjVar = new defpackage.aebj(this.f, this.g, this.h, aolnVar);
        aebjVar.i = obj;
        return aebjVar;
    }
}
