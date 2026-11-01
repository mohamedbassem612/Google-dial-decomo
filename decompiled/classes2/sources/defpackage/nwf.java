package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class nwf extends aomh implements aonn {
    private final /* synthetic */ int $cid;
    java.lang.Object a;
    int b;
    int c;
    final /* synthetic */ defpackage.nwg d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nwf(defpackage.nwg nwgVar, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.d = nwgVar;
    }

    public final /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        if (this.$cid != 0) {
            return c((aoss) obj, (aoln) obj2).b(aojh.a);
        }
        return c((aoss) obj, (aoln) obj2).b(aojh.a);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0077  */
    /* JADX WARN: Code duplicated, block: B:37:0x00ed  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r3v9 */
    public final java.lang.Object b(java.lang.Object obj) {
        ?? r3;
        int i;
        ?? r4;
        int i2;
        if (this.$cid != 0) {
            aolu aoluVar = aolu.a;
            int i3 = this.c;
            if (i3 != 0) {
                if (i3 != 1) {
                    i2 = this.b;
                    aooc.af(obj);
                } else {
                    java.lang.Object obj2 = this.a;
                    aooc.af(obj);
                    r4 = obj2;
                }
                this.d.h.set(i2 != ((java.lang.Number) obj).intValue());
                return aojh.a;
            }
            aooc.af(obj);
            defpackage.nwg nwgVar = this.d;
            zpm zpmVar = nwgVar.j;
            aihd aihdVarC = zpmVar.c(zpo.c);
            if (!aihdVarC.isEmpty()) {
                nwgVar.g.set(false);
                j$.util.Optional optionalE = zpmVar.e(nwgVar.b);
                aooh.e(optionalE, "get(...)");
                apqr apqrVar = (apqr) aooh.q(optionalE);
                this.a = aihdVarC;
                this.c = 1;
                obj = nwgVar.d(apqrVar, this);
                if (obj == aoluVar) {
                    return aoluVar;
                }
                r4 = aihdVarC;
            }
            return aojh.a;
            int iIntValue = ((java.lang.Number) obj).intValue();
            defpackage.nwg nwgVar2 = this.d;
            aooh.c((java.lang.Object) r4);
            apqr apqrVarE = defpackage.nwg.e(r4);
            this.a = null;
            this.b = iIntValue;
            this.c = 2;
            java.lang.Object objD = nwgVar2.d(apqrVarE, this);
            if (objD == aoluVar) {
                return aoluVar;
            }
            i2 = iIntValue;
            obj = objD;
            this.d.h.set(i2 != ((java.lang.Number) obj).intValue());
            return aojh.a;
        }
        aolu aoluVar2 = aolu.a;
        int i4 = this.c;
        if (i4 != 0) {
            if (i4 != 1) {
                i = this.b;
                aooc.af(obj);
            } else {
                java.lang.Object obj3 = this.a;
                aooc.af(obj);
                r3 = obj3;
            }
            int iIntValue2 = ((java.lang.Number) obj).intValue();
            this.d.h.set(i != iIntValue2);
            return aojh.a;
        }
        aooc.af(obj);
        defpackage.nwg nwgVar3 = this.d;
        zpm zpmVar2 = nwgVar3.j;
        aihd aihdVarC2 = zpmVar2.c(zpo.d);
        if (!aihdVarC2.isEmpty()) {
            nwgVar3.g.set(false);
            j$.util.Optional optionalE2 = zpmVar2.e(nwgVar3.b);
            aooh.e(optionalE2, "get(...)");
            apqr apqrVar2 = (apqr) aooh.q(optionalE2);
            this.a = aihdVarC2;
            this.c = 1;
            obj = nwgVar3.d(apqrVar2, this);
            if (obj == aoluVar2) {
                return aoluVar2;
            }
            r3 = aihdVarC2;
        }
        return aojh.a;
        int iIntValue3 = ((java.lang.Number) obj).intValue();
        defpackage.nwg nwgVar4 = this.d;
        aooh.c((java.lang.Object) r3);
        apqr apqrVarE2 = defpackage.nwg.e(r3);
        this.a = null;
        this.b = iIntValue3;
        this.c = 2;
        java.lang.Object objD2 = nwgVar4.d(apqrVarE2, this);
        if (objD2 == aoluVar2) {
            return aoluVar2;
        }
        i = iIntValue3;
        obj = objD2;
        int iIntValue4 = ((java.lang.Number) obj).intValue();
        this.d.h.set(i != iIntValue4);
        return aojh.a;
    }

    public final aoln c(java.lang.Object obj, aoln aolnVar) {
        return this.$cid != 0 ? new defpackage.nwf(this.d, aolnVar, 1, null) : new defpackage.nwf(this.d, aolnVar, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nwf(defpackage.nwg nwgVar, aoln aolnVar, int i, byte[] bArr) {
        super(2, aolnVar);
        this.$cid = i;
        this.d = nwgVar;
    }
}
