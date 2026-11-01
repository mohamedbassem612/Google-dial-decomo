package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class oha extends aomh implements aonn {
    int a;
    int b;
    final /* synthetic */ oqi c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oha(oqi oqiVar, aoln aolnVar) {
        super(2, aolnVar);
        this.c = oqiVar;
    }

    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        return c((aoss) obj, (aoln) obj2).b(aojh.a);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0054  */
    public final java.lang.Object b(java.lang.Object obj) {
        int i;
        java.lang.Integer num;
        boolean z;
        aolu aoluVar = aolu.a;
        int i2 = this.b;
        boolean z2 = false;
        if (i2 != 0) {
            if (i2 != 1) {
                i = this.a;
                aooc.af(obj);
            } else {
                aooc.af(obj);
            }
            num = (java.lang.Integer) obj;
            if (num == null && num.intValue() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (i != 0 && z) {
                z2 = true;
            }
            return java.lang.Boolean.valueOf(z2);
        }
        aooc.af(obj);
        ajcq ajcqVarA = this.c.a(defpackage.oqt.DIALER_HATS_EXPRESSO_SENDER_GRID_SHOWN);
        this.b = 1;
        obj = aosv.D(ajcqVarA, this);
        if (obj == aoluVar) {
            return aoluVar;
        }
        int i3 = ((java.lang.Number) obj).intValue() > 0 ? 1 : 0;
        ajcq ajcqVarA2 = this.c.a(defpackage.oqt.DIALER_HATS_EXPRESSO_SENDER_CLICKED);
        this.a = i3;
        this.b = 2;
        java.lang.Object objD = aosv.D(ajcqVarA2, this);
        if (objD == aoluVar) {
            return aoluVar;
        }
        int i4 = i3;
        obj = objD;
        i = i4;
        num = (java.lang.Integer) obj;
        if (num == null) {
            z = false;
        } else {
            z = false;
        }
        if (i != 0) {
            z2 = true;
        }
        return java.lang.Boolean.valueOf(z2);
    }

    public final aoln c(java.lang.Object obj, aoln aolnVar) {
        return new defpackage.oha(this.c, aolnVar);
    }
}
