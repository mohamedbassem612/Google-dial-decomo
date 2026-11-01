package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class aoee extends aomh implements aonn {
    int a;
    final /* synthetic */ aoxh b;
    final /* synthetic */ java.lang.String c = "request";
    final /* synthetic */ java.lang.Object d;
    private /* synthetic */ java.lang.Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aoee(aoxh aoxhVar, java.lang.Object obj, aoln aolnVar) {
        super(2, aolnVar);
        this.b = aoxhVar;
        this.d = obj;
    }

    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        return c((aoxi) obj, (aoln) obj2).b(aojh.a);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: anqx */
    public final java.lang.Object b(java.lang.Object obj) throws anqx {
        aoop aoopVar;
        aolu aoluVar = aolu.a;
        if (this.a != 0) {
            aoopVar = (aoop) this.e;
            aooc.af(obj);
        } else {
            aooc.af(obj);
            aoxi aoxiVar = (aoxi) this.e;
            aoop aoopVar2 = new aoop();
            aoxh aoxhVar = this.b;
            defpackage.aoel aoelVar = new defpackage.aoel(aoopVar2, aoxiVar, this.d, 1);
            this.e = aoopVar2;
            this.a = 1;
            if (aoxhVar.fM(aoelVar, this) == aoluVar) {
                return aoluVar;
            }
            aoopVar = aoopVar2;
        }
        if (aoopVar.a) {
            return aojh.a;
        }
        java.lang.String str = this.c;
        java.lang.Object obj2 = this.d;
        throw new anqx(anqw.k.f("Expected one " + str + " for " + obj2 + " but received none"), (anph) null);
    }

    public final aoln c(java.lang.Object obj, aoln aolnVar) {
        defpackage.aoee aoeeVar = new defpackage.aoee(this.b, this.d, aolnVar);
        aoeeVar.e = obj;
        return aoeeVar;
    }
}
