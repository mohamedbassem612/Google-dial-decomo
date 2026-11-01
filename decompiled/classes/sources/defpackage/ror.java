package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class ror extends defpackage.aomh implements defpackage.aonn {
    java.lang.Object a;
    boolean b;
    int c;
    final /* synthetic */ defpackage.rpa d;
    private /* synthetic */ java.lang.Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ror(defpackage.rpa rpaVar, defpackage.aoln aolnVar) {
        super(2, aolnVar);
        this.d = rpaVar;
    }

    @Override // defpackage.aonn
    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        return ((defpackage.ror) c((defpackage.aoss) obj, (defpackage.aoln) obj2)).b(defpackage.aojh.a);
    }

    @Override // defpackage.aomb
    public final java.lang.Object b(java.lang.Object obj) {
        java.lang.Object obj2;
        defpackage.aosy aosyVar;
        boolean z;
        java.lang.Object obj3;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i = this.c;
        if (i != 0) {
            if (i != 1) {
                z = this.b;
                obj3 = (defpackage.rol) this.e;
                defpackage.aooc.af(obj);
            } else {
                obj2 = this.a;
                aosyVar = (defpackage.aosy) this.e;
                defpackage.aooc.af(obj);
            }
            return defpackage.rol.a((defpackage.rol) obj3, z, ((java.lang.Boolean) obj).booleanValue(), false, 4);
        }
        defpackage.aooc.af(obj);
        defpackage.aoss aossVar = (defpackage.aoss) this.e;
        defpackage.rpa rpaVar = this.d;
        defpackage.aosy aosyVarAm = defpackage.aoov.am(aossVar, 0, new defpackage.mev(rpaVar, (defpackage.aoln) null, 8, (byte[]) null), 3);
        defpackage.aosy aosyVarAm2 = defpackage.aoov.am(aossVar, 0, new defpackage.mev(rpaVar, (defpackage.aoln) null, 7), 3);
        obj2 = rpaVar.j;
        this.e = aosyVarAm2;
        this.a = obj2;
        this.c = 1;
        java.lang.Object objA = aosyVarAm.a(this);
        if (objA == aoluVar) {
            return aoluVar;
        }
        aosyVar = aosyVarAm2;
        obj = objA;
        boolean zBooleanValue = ((java.lang.Boolean) obj).booleanValue();
        this.e = obj2;
        this.a = null;
        this.b = zBooleanValue;
        this.c = 2;
        java.lang.Object objA2 = aosyVar.a(this);
        if (objA2 == aoluVar) {
            return aoluVar;
        }
        z = zBooleanValue;
        obj = objA2;
        obj3 = obj2;
        return defpackage.rol.a((defpackage.rol) obj3, z, ((java.lang.Boolean) obj).booleanValue(), false, 4);
    }

    @Override // defpackage.aomb
    public final defpackage.aoln c(java.lang.Object obj, defpackage.aoln aolnVar) {
        defpackage.ror rorVar = new defpackage.ror(this.d, aolnVar);
        rorVar.e = obj;
        return rorVar;
    }
}
