package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class acdq implements defpackage.acdm {
    private final defpackage.acbd a;
    private final defpackage.amwu b;
    private final defpackage.adao c;

    static {
        defpackage.aiof.i("GnpSdk");
    }

    public acdq(defpackage.acbd acbdVar, defpackage.aazc aazcVar, defpackage.amwu amwuVar, defpackage.adao adaoVar, java.lang.String str) {
        if (acbdVar == null) {
            defpackage.aooh.i("promoEvalLogger");
        }
        if (aazcVar == null) {
            defpackage.aooh.i("clock");
        }
        if (amwuVar == null) {
            defpackage.aooh.i("clearcutLogger");
        }
        if (adaoVar == null) {
            defpackage.aooh.i("promotionsStore");
        }
        if (str == null) {
            defpackage.aooh.i("packageName");
        }
        this.a = acbdVar;
        this.b = amwuVar;
        this.c = adaoVar;
    }

    @Override // defpackage.acdm
    public final java.util.List a(java.util.List list) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (java.lang.Object obj : list) {
            akhl akhlVarC = ((com.google.android.libraries.internal.growth.growthkit.internal.common.PromoContext) obj).c();
            defpackage.aooh.e(akhlVarC, "getPromotion(...)");
            defpackage.alcf alcfVar = akhlVarC.i;
            if (alcfVar == null) {
                alcfVar = defpackage.alcf.a;
            }
            long jB = defpackage.aldi.b(alcfVar);
            if (jB <= 0 || jB >= j$.time.Instant.now().toEpochMilli()) {
                arrayList2.add(obj);
            } else {
                arrayList.add(obj);
            }
        }
        defpackage.aoiu aoiuVar = new defpackage.aoiu(arrayList, arrayList2);
        java.util.List<com.google.android.libraries.internal.growth.growthkit.internal.common.PromoContext> list2 = (java.util.List) aoiuVar.a;
        java.util.List list3 = (java.util.List) aoiuVar.b;
        for (com.google.android.libraries.internal.growth.growthkit.internal.common.PromoContext promoContext : list2) {
            defpackage.acbd acbdVar = this.a;
            defpackage.alcf alcfVar2 = promoContext.c().i;
            if (alcfVar2 == null) {
                alcfVar2 = defpackage.alcf.a;
            }
            defpackage.aldi.g(alcfVar2);
            long j = alcfVar2.b;
            int i = alcfVar2.c;
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(((java.text.SimpleDateFormat) defpackage.aldi.c.get()).format(new java.util.Date(j * 1000)));
            if (i != 0) {
                sb.append('.');
                sb.append(i % 1000000 == 0 ? java.lang.String.format(java.util.Locale.ENGLISH, "%1$03d", java.lang.Integer.valueOf(i / 1000000)) : i % 1000 == 0 ? java.lang.String.format(java.util.Locale.ENGLISH, "%1$06d", java.lang.Integer.valueOf(i / 1000)) : java.lang.String.format(java.util.Locale.ENGLISH, "%1$09d", java.lang.Integer.valueOf(i)));
            }
            sb.append('Z');
            acbdVar.b(promoContext, "Promotion has expired on %s.", sb.toString());
            ((defpackage.acal) this.b.a()).f(promoContext);
        }
        if (!list2.isEmpty()) {
            java.util.ArrayList arrayList3 = new java.util.ArrayList(defpackage.ajsz.bl(list2, 10));
            java.util.Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList3.add(abxl.q(((com.google.android.libraries.internal.growth.growthkit.internal.common.PromoContext) it.next()).c()));
            }
            list2.size();
            ((defpackage.acgr) this.c.o(null)).f(arrayList3);
        }
        return list3;
    }
}
