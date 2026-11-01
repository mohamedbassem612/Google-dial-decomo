package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class app {
    public static final aonj a = new apk(0);
    public static final aonj b = new apk(2);
    public static final kaw c = new kaw(new defpackage.abfu(1), (byte[]) null);

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final java.lang.Object a(aomy aomyVar, aonn aonnVar, aoln aolnVar) {
        defpackage.apm apmVar;
        if (aolnVar instanceof defpackage.apm) {
            apmVar = (defpackage.apm) aolnVar;
            int i = apmVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                apmVar.b = i - Integer.MIN_VALUE;
            } else {
                apmVar = new defpackage.apm(aolnVar);
            }
        } else {
            apmVar = new defpackage.apm(aolnVar);
        }
        java.lang.Object obj = apmVar.a;
        aolu aoluVar = aolu.a;
        int i2 = apmVar.b;
        try {
            if (i2 == 0) {
                aooc.af(obj);
                defpackage.ats atsVar = new defpackage.ats(aomyVar, aonnVar, (aoln) null, 1);
                apmVar.b = 1;
                if (aosv.m(atsVar, apmVar) == aoluVar) {
                    return aoluVar;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aooc.af(obj);
            }
        } catch (defpackage.aph unused) {
        }
        return aojh.a;
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, java.util.List] */
    public static final defpackage.aqj b(aonj aonjVar) {
        defpackage.bgt bgtVar = new defpackage.bgt();
        aonjVar.a(bgtVar);
        ?? r4 = bgtVar.a;
        java.lang.Object obj = bgtVar.b;
        int size = r4.size();
        if (obj == null) {
            aooh.i("<this>");
        }
        float[] fArr = (float[]) obj;
        ajsz.ct(size, fArr.length);
        float[] fArrCopyOfRange = java.util.Arrays.copyOfRange(fArr, 0, size);
        aooh.e(fArrCopyOfRange, "copyOfRange(...)");
        return new defpackage.aqj(r4, fArrCopyOfRange);
    }

    public static final cmw c(cmw cmwVar, defpackage.apy apyVar, aso asoVar, boolean z, kaw kawVar, ars arsVar) {
        return cmwVar.a(new defpackage.apj(apyVar, asoVar, z, kawVar, arsVar));
    }
}
