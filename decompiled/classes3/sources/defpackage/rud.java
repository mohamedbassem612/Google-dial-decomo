package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class rud extends aomh implements aonj {
    int a;
    final /* synthetic */ aoop b;
    final /* synthetic */ aenj c;
    final /* synthetic */ aeun d;
    final /* synthetic */ ruc e;
    final /* synthetic */ aenj f;
    final /* synthetic */ aeun g;
    final /* synthetic */ aonj h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rud(aoop aoopVar, aenj aenjVar, aeun aeunVar, ruc rucVar, aenj aenjVar2, aeun aeunVar2, aonj aonjVar, aoln aolnVar) {
        super(1, aolnVar);
        this.b = aoopVar;
        this.c = aenjVar;
        this.d = aeunVar;
        this.e = rucVar;
        this.f = aenjVar2;
        this.g = aeunVar2;
        this.h = aonjVar;
    }

    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj) {
        return new defpackage.rud(this.b, this.c, this.d, this.e, this.f, this.g, this.h, (aoln) obj).b(aojh.a);
    }

    public final java.lang.Object b(java.lang.Object obj) {
        aeun aeunVar;
        aolu aoluVar = aolu.a;
        int i = this.a;
        aooc.af(obj);
        if (i != 0) {
            return obj;
        }
        aoop aoopVar = this.b;
        if (!aoopVar.a) {
            aenj aenjVar = this.c;
            aeun aeunVar2 = this.d;
            if (aeunVar2 != null) {
                this.e.p(aeunVar2, aenjVar);
            }
            aenj aenjVar2 = this.f;
            if (aenjVar2 != null && (aeunVar = this.g) != null) {
                this.e.p(aeunVar, aenjVar2);
            }
            aoopVar.a = true;
        }
        aonj aonjVar = this.h;
        this.a = 1;
        java.lang.Object objA = aonjVar.a(this);
        return objA == aoluVar ? aoluVar : objA;
    }
}
