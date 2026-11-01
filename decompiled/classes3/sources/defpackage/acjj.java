package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class acjj extends aomh implements aonn {
    int a;
    final /* synthetic */ acjk b;
    final /* synthetic */ com.google.android.libraries.internal.growth.growthkit.internal.common.PromoContext c;
    final /* synthetic */ akhl d;
    final /* synthetic */ akhi e;
    final /* synthetic */ alcf f;
    final /* synthetic */ int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public acjj(acjk acjkVar, com.google.android.libraries.internal.growth.growthkit.internal.common.PromoContext promoContext, akhl akhlVar, akhi akhiVar, int i, alcf alcfVar, aoln aolnVar) {
        super(2, aolnVar);
        this.b = acjkVar;
        this.c = promoContext;
        this.d = akhlVar;
        this.e = akhiVar;
        this.g = i;
        this.f = alcfVar;
    }

    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        return c((aoss) obj, (aoln) obj2).b(aojh.a);
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00a3 A[Catch: all -> 0x00b5, TRY_LEAVE, TryCatch #1 {all -> 0x00b5, blocks: (B:5:0x0009, B:32:0x009d, B:34:0x00a3, B:30:0x008b), top: B:40:0x0005 }] */
    public final java.lang.Object b(java.lang.Object obj) {
        adtv adtvVar;
        aolu aoluVar = aolu.a;
        int i = this.a;
        try {
            try {
                if (i != 0) {
                    if (i != 1) {
                        aooc.af(obj);
                    } else {
                        aooc.af(obj);
                    }
                    adtvVar = (adtz) obj;
                    if (adtvVar instanceof adtv) {
                        hgb.b(acjk.a.d(), "Sync failed after user action.", adtvVar.b());
                    }
                    return aojh.a;
                }
                aooc.af(obj);
                acgr acgrVar = (acgr) this.b.f.o(this.c.e());
                akhq akhqVar = this.d.c;
                if (akhqVar == null) {
                    akhqVar = akhq.a;
                }
                ajcq ajcqVarD = acgrVar.d(defpackage.abxl.r(akhqVar), this.e);
                aooh.e(ajcqVarD, "put(...)");
                this.a = 1;
                if (aosv.D(ajcqVarD, this) == aoluVar) {
                    return aoluVar;
                }
            } catch (java.lang.Throwable th) {
                hgb.b(acjk.a.d(), "Failed to persist dialog button click.", th);
            }
            acjk acjkVar = this.b;
            com.google.android.libraries.internal.growth.growthkit.internal.common.PromoContext promoContext = this.c;
            int i2 = this.g;
            alcf alcfVar = this.f;
            int i3 = i2 - 2;
            if (i3 == 1) {
                acjkVar.b.q(promoContext, alcfVar);
            } else if (i3 == 2) {
                acjkVar.b.p(promoContext, defpackage.akvn.ACTION_POSITIVE, alcfVar);
            } else if (i3 == 3) {
                acjkVar.b.p(promoContext, defpackage.akvn.ACTION_NEGATIVE, alcfVar);
            } else if (i3 != 6) {
                acjkVar.b.p(promoContext, defpackage.akvn.ACTION_UNKNOWN, alcfVar);
            } else {
                acjkVar.b.p(promoContext, defpackage.akvn.ACTION_ACKNOWLEDGE, alcfVar);
            }
            achv achvVar = (achv) acjkVar.d.a();
            akst akstVar = akst.m;
            this.a = 2;
            obj = achvVar.b(akstVar, this);
            if (obj == aoluVar) {
                return aoluVar;
            }
            adtvVar = (adtz) obj;
            if (adtvVar instanceof adtv) {
                hgb.b(acjk.a.d(), "Sync failed after user action.", adtvVar.b());
            }
        } catch (java.lang.Throwable th2) {
            hgb.b(acjk.a.d(), "Sync failed with unexpected exception.", th2);
        }
        return aojh.a;
    }

    public final aoln c(java.lang.Object obj, aoln aolnVar) {
        return new defpackage.acjj(this.b, this.c, this.d, this.e, this.g, this.f, aolnVar);
    }
}
