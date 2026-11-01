package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class txh implements defpackage.twv {
    public static final defpackage.aimz a = defpackage.aimz.i("com/android/dialer/sodatranscription/impl/androidspeech/SodaAndroidSpeechModelAvailability");
    public static final j$.time.Duration b = defpackage.aiql.O(2);
    public static final java.util.Map c = defpackage.ajsz.aO(new defpackage.aoiu(defpackage.txd.a, "com.google.recognition.extra.OFFLINE_SUPPORTED_LANGUAGES"), new defpackage.aoiu(defpackage.txd.b, "com.google.recognition.extra.OFFLINE_AVAILABLE_LANGUAGES"), new defpackage.aoiu(defpackage.txd.c, "com.google.recognition.extra.OFFLINE_PENDING_LANGUAGES"));
    public final android.content.Context d;
    public final defpackage.aoss e;
    public final defpackage.aoin f;
    public final defpackage.aoin g;
    public final defpackage.ahpz h;
    public final defpackage.zjv i;
    public defpackage.aosy j;
    private final defpackage.aoss k;
    private final defpackage.ahda l;

    public txh(android.content.Context context, defpackage.aoss aossVar, defpackage.aoss aossVar2, defpackage.aoin aoinVar, defpackage.aoin aoinVar2, defpackage.ahpz ahpzVar, defpackage.zjv zjvVar) {
        if (context == null) {
            defpackage.aooh.i("appContext");
        }
        if (aossVar == null) {
            defpackage.aooh.i("backgroundScope");
        }
        if (aossVar2 == null) {
            defpackage.aooh.i("lightweightScope");
        }
        if (aoinVar == null) {
            defpackage.aooh.i("skipSodaAvailabilityCheck");
        }
        if (aoinVar2 == null) {
            defpackage.aooh.i("enableSendLpDetailsIntentOnlyWhenComponentFound");
        }
        if (ahpzVar == null) {
            defpackage.aooh.i("traceCreation");
        }
        if (zjvVar == null) {
            defpackage.aooh.i("externalsLogging");
        }
        this.d = context;
        this.e = aossVar;
        this.k = aossVar2;
        this.f = aoinVar;
        this.g = aoinVar2;
        this.h = ahpzVar;
        this.i = zjvVar;
        this.l = new defpackage.ahda((byte[]) null);
        defpackage.aokd aokdVar = defpackage.aokd.a;
        defpackage.aosi aosiVar = new defpackage.aosi(null);
        aosiVar.Q(aokdVar);
        this.j = aosiVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.twv
    public final java.lang.Object a(defpackage.aoln aolnVar) {
        txg txgVar;
        if (aolnVar instanceof txg) {
            txgVar = (txg) aolnVar;
            int i = txgVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                txgVar.c = i - Integer.MIN_VALUE;
            } else {
                txgVar = new txg(this, aolnVar);
            }
        } else {
            txgVar = new txg(this, aolnVar);
        }
        java.lang.Object objA = txgVar.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = txgVar.c;
        if (i2 == 0) {
            defpackage.aooc.af(objA);
            defpackage.aosy aosyVarAg = defpackage.ahvr.ag(this.k, this.l, new tlv(this, (defpackage.aoln) null, 11));
            txgVar.c = 1;
            objA = aosyVarAg.a(txgVar);
            if (objA != aoluVar) {
            }
            return aoluVar;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            defpackage.aooc.af(objA);
            return objA;
        }
        defpackage.aooc.af(objA);
        txgVar.c = 2;
        java.lang.Object objA2 = ((defpackage.aosy) objA).a(txgVar);
        if (objA2 != aoluVar) {
            return objA2;
        }
        return aoluVar;
    }
}
