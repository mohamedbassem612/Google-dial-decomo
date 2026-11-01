package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class kah extends aomh implements aonn {
    boolean a;
    int b;
    final /* synthetic */ kai c;
    final /* synthetic */ java.util.Map d;
    private /* synthetic */ java.lang.Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kah(kai kaiVar, java.util.Map map, aoln aolnVar) {
        super(2, aolnVar);
        this.c = kaiVar;
        this.d = map;
    }

    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        return c((aoss) obj, (aoln) obj2).b(aojh.a);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0067  */
    public final java.lang.Object b(java.lang.Object obj) {
        aosy aosyVar;
        boolean z;
        aolu aoluVar = aolu.a;
        int i = this.b;
        if (i != 0) {
            if (i != 1) {
                z = this.a;
                aooc.af(obj);
            } else {
                aosyVar = (aosy) this.e;
                aooc.af(obj);
            }
            boolean zBooleanValue = ((java.lang.Boolean) obj).booleanValue();
            if (z || zBooleanValue) {
                ((kjr) this.c.b.a()).a();
            }
            return aojh.a;
        }
        aooc.af(obj);
        aoss aossVar = (aoss) this.e;
        kai kaiVar = this.c;
        java.util.Map map = this.d;
        aosy aosyVarAm = aoov.am(aossVar, 0, new defpackage.jpj(kaiVar, map, (aoln) null, 6), 3);
        aosy aosyVarAm2 = aoov.am(aossVar, 0, new defpackage.jpj(kaiVar, map, (aoln) null, 7, (byte[]) null), 3);
        this.e = aosyVarAm2;
        this.b = 1;
        java.lang.Object objA = aosyVarAm.a(this);
        if (objA == aoluVar) {
            return aoluVar;
        }
        aosyVar = aosyVarAm2;
        obj = objA;
        boolean zBooleanValue2 = ((java.lang.Boolean) obj).booleanValue();
        this.e = null;
        this.a = zBooleanValue2;
        this.b = 2;
        java.lang.Object objA2 = aosyVar.a(this);
        if (objA2 == aoluVar) {
            return aoluVar;
        }
        z = zBooleanValue2;
        obj = objA2;
        boolean zBooleanValue3 = ((java.lang.Boolean) obj).booleanValue();
        if (z) {
            ((kjr) this.c.b.a()).a();
        } else {
            ((kjr) this.c.b.a()).a();
        }
        return aojh.a;
    }

    public final aoln c(java.lang.Object obj, aoln aolnVar) {
        defpackage.kah kahVar = new defpackage.kah(this.c, this.d, aolnVar);
        kahVar.e = obj;
        return kahVar;
    }
}
