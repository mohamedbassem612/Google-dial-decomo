package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class auv implements aonj {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ float a;
    public final /* synthetic */ aooq b;
    public final /* synthetic */ asv c;
    public final /* synthetic */ aonj d;

    public /* synthetic */ auv(float f, aooq aooqVar, asv asvVar, aonj aonjVar, int i) {
        this.$cid = i;
        this.a = f;
        this.b = aooqVar;
        this.c = asvVar;
        this.d = aonjVar;
    }

    public final java.lang.Object a(java.lang.Object obj) {
        if (this.$cid == 0) {
            aonj aonjVar = this.d;
            asv asvVar = this.c;
            aooq aooqVar = this.b;
            return defpackage.rv.g(this.a, aooqVar, asvVar, aonjVar, (defpackage.aip) obj);
        }
        defpackage.aip aipVar = (defpackage.aip) obj;
        float fAbs = java.lang.Math.abs(((java.lang.Number) aipVar.a()).floatValue());
        float f = this.a;
        aonj aonjVar2 = this.d;
        asv asvVar2 = this.c;
        aooq aooqVar2 = this.b;
        if (fAbs >= java.lang.Math.abs(f)) {
            float fE = defpackage.rv.e(((java.lang.Number) aipVar.a()).floatValue(), f);
            defpackage.rv.h(aipVar, asvVar2, aonjVar2, fE - aooqVar2.a);
            aipVar.b();
            aooqVar2.a = fE;
        } else {
            defpackage.rv.h(aipVar, asvVar2, aonjVar2, ((java.lang.Number) aipVar.a()).floatValue() - aooqVar2.a);
            aooqVar2.a = ((java.lang.Number) aipVar.a()).floatValue();
        }
        return aojh.a;
    }
}
