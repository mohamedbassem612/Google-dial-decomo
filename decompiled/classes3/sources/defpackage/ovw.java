package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ovw {
    private static final aimz a = aimz.i("com/android/dialer/incall/answer/method/promo/growthkit/AnswerMethodPromoGrowthKitCallLogFetcher");
    private final ojo b;

    public ovw(ojo ojoVar) {
        aooh.f(ojoVar, "dialerContentResolver");
        this.b = ojoVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object a(j$.time.Instant instant, aoln aolnVar) {
        defpackage.ovv ovvVar;
        if (aolnVar instanceof defpackage.ovv) {
            ovvVar = (defpackage.ovv) aolnVar;
            int i = ovvVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                ovvVar.c = i - Integer.MIN_VALUE;
            } else {
                ovvVar = new defpackage.ovv(this, aolnVar);
            }
        } else {
            ovvVar = new defpackage.ovv(this, aolnVar);
        }
        defpackage.ovv ovvVar2 = ovvVar;
        java.lang.Object objI = ovvVar2.a;
        aolu aoluVar = aolu.a;
        int i2 = ovvVar2.c;
        try {
            if (i2 == 0) {
                aooc.af(objI);
                rsr rsrVar = new rsr();
                rsrVar.aC(new kaw("type").aI("=", "1"));
                rsrVar.aC(new kaw("date").aI(">=", new java.lang.Long(instant.toEpochMilli())));
                rsr rsrVarAB = rsrVar.aB();
                android.net.Uri uriBuild = android.provider.CallLog.Calls.CONTENT_URI.buildUpon().appendQueryParameter("limit", "1").build();
                ojo ojoVar = this.b;
                aooh.c(uriBuild);
                java.lang.Object obj = rsrVarAB.b;
                java.lang.Object obj2 = rsrVarAB.a;
                bbb bbbVar = bbb.l;
                ovvVar2.c = 1;
                int i3 = ojo.f;
                objI = ojoVar.i(uriBuild, new java.lang.String[]{"date"}, (java.lang.String) obj, (java.lang.String[]) obj2, (java.lang.String) null, bbbVar, ovvVar2);
                if (objI == aoluVar) {
                    return aoluVar;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aooc.af(objI);
            }
            return java.lang.Boolean.valueOf(!((java.util.Collection) objI).isEmpty());
        } catch (agui e) {
            a.d().k(e).l("com/android/dialer/incall/answer/method/promo/growthkit/AnswerMethodPromoGrowthKitCallLogFetcher", "hasAnsweredIncomingCallSince", 40, "AnswerMethodPromoGrowthKitCallLogFetcher.kt").v("Failed with content provider exception.");
            return java.lang.Boolean.FALSE;
        } catch (java.lang.RuntimeException e2) {
            a.c().k(e2).l("com/android/dialer/incall/answer/method/promo/growthkit/AnswerMethodPromoGrowthKitCallLogFetcher", "hasAnsweredIncomingCallSince", 43, "AnswerMethodPromoGrowthKitCallLogFetcher.kt").v("Failed with unexpected exception.");
            throw e2;
        }
    }
}
