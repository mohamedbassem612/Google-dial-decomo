package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class atl extends aomh implements aonn {
    java.lang.Object a;
    java.lang.Object b;
    java.lang.Object c;
    long d;
    int e;
    final /* synthetic */ ato f;
    final /* synthetic */ aoos g;
    final /* synthetic */ long h;
    private /* synthetic */ java.lang.Object i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public atl(ato atoVar, aoos aoosVar, long j, aoln aolnVar) {
        super(2, aolnVar);
        this.f = atoVar;
        this.g = aoosVar;
        this.h = j;
    }

    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        return c((apnt) obj, (aoln) obj2).b(aojh.a);
    }

    public final java.lang.Object b(java.lang.Object obj) {
        java.lang.Object obj2;
        long j;
        java.lang.Object obj3;
        java.lang.Object obj4;
        apnt apntVar = (apnt) this.i;
        aolu aoluVar = aolu.a;
        if (this.e != 0) {
            j = this.d;
            java.lang.Object obj5 = this.c;
            java.lang.Object obj6 = this.b;
            java.lang.Object obj7 = this.a;
            aooc.af(obj);
            obj4 = obj5;
            obj3 = obj6;
            obj2 = obj7;
        } else {
            aooc.af(obj);
            ato atoVar = this.f;
            defpackage.atk atkVar = new defpackage.atk(atoVar, apntVar, 0);
            aoos aoosVar = this.g;
            long j2 = this.h;
            ars arsVar = atoVar.b;
            long j3 = aoosVar.a;
            float fA = atoVar.a(atoVar.c == aso.b ? java.lang.Float.intBitsToFloat((int) (j2 >> 32)) : java.lang.Float.intBitsToFloat((int) (j2 & 4294967295L)));
            this.i = null;
            this.a = atoVar;
            this.b = atoVar;
            this.c = aoosVar;
            this.d = j3;
            this.e = 1;
            obj = arsVar.a(atkVar, fA, this);
            if (obj == aoluVar) {
                return aoluVar;
            }
            obj2 = atoVar;
            j = j3;
            obj4 = aoosVar;
            obj3 = atoVar;
        }
        float fA2 = ((ato) obj2).a(((java.lang.Number) obj).floatValue());
        ((aoos) obj4).a = ((ato) obj3).c == aso.b ? defpackage.dpu.c(j, fA2, 0.0f, 2) : defpackage.dpu.c(j, 0.0f, fA2, 1);
        return aojh.a;
    }

    public final aoln c(java.lang.Object obj, aoln aolnVar) {
        defpackage.atl atlVar = new defpackage.atl(this.f, this.g, this.h, aolnVar);
        atlVar.i = obj;
        return atlVar;
    }
}
