package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
final class alqb extends aomh implements aonn {
    int a;
    final /* synthetic */ ymj b;
    final /* synthetic */ java.lang.Object c;
    final /* synthetic */ java.util.function.Consumer d;
    final /* synthetic */ aonj e;
    final /* synthetic */ java.util.function.Consumer f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public alqb(ymj ymjVar, java.lang.Object obj, java.util.function.Consumer consumer, aonj aonjVar, java.util.function.Consumer consumer2, aoln aolnVar) {
        super(2, aolnVar);
        this.b = ymjVar;
        this.c = obj;
        this.d = consumer;
        this.e = aonjVar;
        this.f = consumer2;
    }

    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        return c((aoss) obj, (aoln) obj2).b(aojh.a);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: ymi */
    public final java.lang.Object b(java.lang.Object obj) throws ymi {
        defpackage.alnu alnuVar;
        aolu aoluVar = aolu.a;
        try {
            if (this.a != 0) {
                aooc.af(obj);
            } else {
                aooc.af(obj);
                ajcq ajcqVarB = this.b.b(this.c);
                this.a = 1;
                obj = aosv.D(ajcqVarB, this);
                if (obj == aoluVar) {
                    return aoluVar;
                }
            }
            this.d.accept(this.e.a(obj));
            return null;
        } catch (java.lang.Throwable th) {
            java.util.function.Consumer consumer = this.f;
            defpackage.alpv alpvVar = defpackage.alqc.a;
            if (th instanceof ymi) {
                int i = th.b;
                defpackage.alqc.b.d().l("com/google/quality/views/extraction/kcube/bg/ondevice/core/infra/utils/android/AndroidDuplexAiCoreClient$Companion", "toInferenceErrorType", 392, "AndroidDuplexAiCoreClient.kt").w("AiCore inference error code: %s", i);
                if (i == 4) {
                    alnuVar = defpackage.alnu.INPUT_SAFETY_ERROR;
                } else if (i == 9) {
                    alnuVar = defpackage.alnu.BUSY;
                } else if (i != 11) {
                    alnuVar = i != 12 ? defpackage.alnu.UNKNOWN_ERROR_TYPE : defpackage.alnu.REQUEST_TOO_LARGE;
                } else {
                    alnuVar = defpackage.alnu.OUTPUT_SAFETY_ERROR;
                }
            } else {
                defpackage.alqc.b.d().k(th).l("com/google/quality/views/extraction/kcube/bg/ondevice/core/infra/utils/android/AndroidDuplexAiCoreClient$Companion", "toInferenceErrorType", 388, "AndroidDuplexAiCoreClient.kt").v("Unexpected AiCore inferecne error.");
                alnuVar = defpackage.alnu.UNKNOWN_ERROR_TYPE;
            }
            consumer.accept(alnuVar);
            throw th;
        }
    }

    public final aoln c(java.lang.Object obj, aoln aolnVar) {
        return new defpackage.alqb(this.b, this.c, this.d, this.e, this.f, aolnVar);
    }
}
