package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class icj extends aomh implements aonn {
    int a;
    final /* synthetic */ defpackage.icm b;
    final /* synthetic */ defpackage.icc c;
    final /* synthetic */ defpackage.icu d;
    final /* synthetic */ defpackage.icv e;
    final /* synthetic */ akzc f;
    final /* synthetic */ akzc g;
    final /* synthetic */ akzc h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public icj(defpackage.icm icmVar, defpackage.icc iccVar, defpackage.icu icuVar, defpackage.icv icvVar, akzc akzcVar, akzc akzcVar2, akzc akzcVar3, aoln aolnVar) {
        super(2, aolnVar);
        this.b = icmVar;
        this.c = iccVar;
        this.d = icuVar;
        this.e = icvVar;
        this.f = akzcVar;
        this.g = akzcVar2;
        this.h = akzcVar3;
    }

    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        return c((aoss) obj, (aoln) obj2).b(aojh.a);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: aois */
    /* JADX WARN: Code duplicated, block: B:22:? A[RETURN, SYNTHETIC] */
    public final java.lang.Object b(java.lang.Object obj) throws aois {
        aolu aoluVar = aolu.a;
        int i = this.a;
        aooc.af(obj);
        if (i != 0) {
            if (i == 1) {
            }
            return aojh.a;
        }
        defpackage.icc iccVar = this.c;
        defpackage.icu icuVar = this.d;
        defpackage.icv icvVar = this.e;
        akzc akzcVar = this.f;
        akzc akzcVar2 = this.h;
        aooh.c(akzcVar2);
        int iOrdinal = iccVar.ordinal();
        if (iOrdinal == 0) {
            if (!icvVar.a) {
            }
            this.a = 1;
            if (defpackage.icm.i(iccVar, icuVar, akzcVar, this) == aoluVar) {
                return aoluVar;
            }
        } else if (iOrdinal != 1) {
            throw new aois();
        }
        akzcVar = akzcVar2;
        this.a = 1;
        if (defpackage.icm.i(iccVar, icuVar, akzcVar, this) == aoluVar) {
            return aoluVar;
        }
        defpackage.icm icmVar = this.b;
        defpackage.icc iccVar2 = this.c;
        if (!defpackage.icm.g(icmVar.f, iccVar2.a())) {
            defpackage.icc iccVarA = iccVar2.a();
            defpackage.icu icuVar2 = this.d;
            akzc akzcVar3 = this.h;
            aooh.c(akzcVar3);
            this.a = 2;
            if (defpackage.icm.i(iccVarA, icuVar2, akzcVar3, this) == aoluVar) {
                return aoluVar;
            }
        }
        return aojh.a;
    }

    public final aoln c(java.lang.Object obj, aoln aolnVar) {
        return new defpackage.icj(this.b, this.c, this.d, this.e, this.f, this.g, this.h, aolnVar);
    }
}
