package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class acsk extends aomh implements aonn {
    private final /* synthetic */ int $cid;
    int a;
    final /* synthetic */ long b;
    final /* synthetic */ long c;
    final /* synthetic */ java.lang.Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public acsk(defpackage.acsl acslVar, long j, long j2, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.d = acslVar;
        this.b = j;
        this.c = j2;
    }

    public final /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        if (this.$cid != 0) {
            return c((aoss) obj, (aoln) obj2).b(aojh.a);
        }
        return c((aoss) obj, (aoln) obj2).b(aojh.a);
    }

    public final java.lang.Object b(java.lang.Object obj) {
        defpackage.acsk acskVar;
        if (this.$cid != 0) {
            aolu aoluVar = aolu.a;
            int i = this.a;
            aooc.af(obj);
            if (i == 0) {
                java.lang.Object obj2 = this.d;
                long j = this.b;
                long j2 = this.c;
                this.a = 1;
                defpackage.wjo wjoVar = (defpackage.wjo) obj2;
                java.lang.Object objAj = aoov.aj(wjoVar.b, new defpackage.wjn(wjoVar, j, j2, null), this);
                if (objAj != aoluVar) {
                    objAj = aojh.a;
                }
                if (objAj == aoluVar) {
                    return aoluVar;
                }
            }
            return null;
        }
        aolu aoluVar2 = aolu.a;
        int i2 = this.a;
        aooc.af(obj);
        if (i2 != 0) {
            if (i2 == 1) {
                acskVar = this;
            }
            return aojh.a;
        }
        final defpackage.acsl acslVar = (defpackage.acsl) this.d;
        final long jM = cfd.M(acslVar.i.c());
        final long j3 = this.b;
        aku akuVar = defpackage.acsn.a;
        final int i3 = 1;
        aonn aonnVar = new aonn() { // from class: acsj
            public final java.lang.Object a(java.lang.Object obj3, java.lang.Object obj4) {
                if (i3 != 0) {
                    float fFloatValue = ((java.lang.Float) obj3).floatValue();
                    ((java.lang.Float) obj4).floatValue();
                    acslVar.i.h(cfd.L(cfd.Q(jM, j3, fFloatValue)));
                    return aojh.a;
                }
                float fFloatValue2 = ((java.lang.Float) obj3).floatValue();
                ((java.lang.Float) obj4).floatValue();
                acslVar.j.h(cfd.L(cfd.Q(jM, j3, fFloatValue2)));
                return aojh.a;
            }
        };
        this.a = 1;
        acskVar = this;
        if (wx.g(0.0f, 1.0f, akuVar, aonnVar, this, 4) == aoluVar2) {
            return aoluVar2;
        }
        final defpackage.acsl acslVar2 = (defpackage.acsl) acskVar.d;
        final long jM2 = cfd.M(acslVar2.j.c());
        final long j4 = acskVar.c;
        aku akuVar2 = defpackage.acsn.a;
        final int i4 = 0;
        aonn aonnVar2 = new aonn() { // from class: acsj
            public final java.lang.Object a(java.lang.Object obj3, java.lang.Object obj4) {
                if (i4 != 0) {
                    float fFloatValue = ((java.lang.Float) obj3).floatValue();
                    ((java.lang.Float) obj4).floatValue();
                    acslVar2.i.h(cfd.L(cfd.Q(jM2, j4, fFloatValue)));
                    return aojh.a;
                }
                float fFloatValue2 = ((java.lang.Float) obj3).floatValue();
                ((java.lang.Float) obj4).floatValue();
                acslVar2.j.h(cfd.L(cfd.Q(jM2, j4, fFloatValue2)));
                return aojh.a;
            }
        };
        acskVar.a = 2;
        if (wx.g(0.0f, 1.0f, akuVar2, aonnVar2, acskVar, 4) == aoluVar2) {
            return aoluVar2;
        }
        return aojh.a;
    }

    public final aoln c(java.lang.Object obj, aoln aolnVar) {
        int i = this.$cid;
        java.lang.Object obj2 = this.d;
        if (i != 0) {
            return new defpackage.acsk((defpackage.wjo) obj2, this.b, this.c, aolnVar, 1);
        }
        return new defpackage.acsk((defpackage.acsl) obj2, this.b, this.c, aolnVar, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public acsk(defpackage.wjo wjoVar, long j, long j2, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.d = wjoVar;
        this.b = j;
        this.c = j2;
    }
}
