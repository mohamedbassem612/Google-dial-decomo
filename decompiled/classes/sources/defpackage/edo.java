package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class edo extends defpackage.aomh implements defpackage.aonj {
    int a;
    int b;
    final /* synthetic */ defpackage.eei c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public edo(defpackage.eei eeiVar, defpackage.aoln aolnVar) {
        super(1, aolnVar);
        this.c = eeiVar;
    }

    @Override // defpackage.aonj
    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj) {
        return new defpackage.edo(this.c, (defpackage.aoln) obj).b(defpackage.aojh.a);
    }

    /* JADX WARN: Code duplicated, block: B:36:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.aomb
    public final java.lang.Object b(java.lang.Object obj) throws java.lang.Throwable {
        int iIntValue;
        int i;
        java.lang.Throwable th;
        defpackage.eez eezVar;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = this.b;
        if (i2 == 0) {
            defpackage.aooc.af(obj);
            defpackage.eei eeiVar = this.c;
            if (eeiVar.e.b()) {
                defpackage.aogc aogcVarO = eeiVar.o();
                this.b = 1;
                obj = aogcVarO.bo();
                if (obj == aoluVar) {
                    return aoluVar;
                }
                iIntValue = ((java.lang.Number) obj).intValue();
                eezVar = this.c.f;
                this.a = iIntValue;
                this.b = 4;
                if (eezVar.a(this) == aoluVar) {
                    return aoluVar;
                }
                return defpackage.aojh.a;
            }
            this.b = 2;
            obj = null;
            defpackage.eei eeiVar2 = this.c;
            defpackage.bur burVar = new defpackage.bur(eeiVar2, (defpackage.gjy) obj, (defpackage.aoln) null, 3);
            this.b = 3;
            obj = defpackage.aoov.aj(((defpackage.apbj) eeiVar2.c).a, burVar, this);
            if (obj == aoluVar) {
                return aoluVar;
            }
            iIntValue = ((java.lang.Number) obj).intValue();
            eezVar = this.c.f;
            this.a = iIntValue;
            this.b = 4;
            if (eezVar.a(this) == aoluVar) {
                return aoluVar;
            }
            return defpackage.aojh.a;
        }
        if (i2 == 1) {
            defpackage.aooc.af(obj);
            iIntValue = ((java.lang.Number) obj).intValue();
            eezVar = this.c.f;
            this.a = iIntValue;
            this.b = 4;
            if (eezVar.a(this) == aoluVar) {
                return aoluVar;
            }
            return defpackage.aojh.a;
        }
        if (i2 == 2) {
            defpackage.aooc.af(obj);
            defpackage.eei eeiVar3 = this.c;
            defpackage.bur burVar2 = new defpackage.bur(eeiVar3, (defpackage.gjy) obj, (defpackage.aoln) null, 3);
            this.b = 3;
            obj = defpackage.aoov.aj(((defpackage.apbj) eeiVar3.c).a, burVar2, this);
            if (obj == aoluVar) {
                return aoluVar;
            }
            iIntValue = ((java.lang.Number) obj).intValue();
            eezVar = this.c.f;
            this.a = iIntValue;
            this.b = 4;
            if (eezVar.a(this) == aoluVar) {
                return aoluVar;
            }
            return defpackage.aojh.a;
        }
        if (i2 != 3) {
            i = this.a;
            try {
                defpackage.aooc.af(obj);
                return defpackage.aojh.a;
            } catch (java.lang.Throwable th2) {
                th = th2;
                this.c.h.Y(new defpackage.eex(th, i));
                throw th;
            }
        }
        defpackage.aooc.af(obj);
        iIntValue = ((java.lang.Number) obj).intValue();
        try {
            eezVar = this.c.f;
            this.a = iIntValue;
            this.b = 4;
            if (eezVar.a(this) == aoluVar) {
                return aoluVar;
            }
            return defpackage.aojh.a;
        } catch (java.lang.Throwable th3) {
            i = iIntValue;
            th = th3;
            this.c.h.Y(new defpackage.eex(th, i));
            throw th;
        }
    }
}
