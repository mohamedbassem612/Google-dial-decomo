package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class txe extends android.content.BroadcastReceiver {
    private final aonj a;
    private final ahpz b;
    private final zjv c;

    public txe(aonj aonjVar, ahpz ahpzVar, zjv zjvVar) {
        aooh.f(ahpzVar, "traceCreation");
        aooh.f(zjvVar, "externalsLogging");
        this.a = aonjVar;
        this.b = ahpzVar;
        this.c = zjvVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(android.content.Context context, android.content.Intent intent) {
        aooh.f(context, "context");
        aooh.f(intent, "intent");
        ahok ahokVarF = this.b.f(899, "Broadcast to SodaAvailabilityImplV2.LanguageDetailsReceiver");
        try {
            android.os.Bundle resultExtras = getResultExtras(false);
            if (resultExtras == null) {
                txh.a.d().l("com/android/dialer/sodatranscription/impl/androidspeech/SodaAndroidSpeechModelAvailability$LanguageDetailsReceiver", "onReceive$<anonymous>", 160, "SodaAndroidSpeechModelAvailability.kt").v("Language Details no extras");
                this.a.a(aokd.a);
            } else {
                java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
                java.util.List<defpackage.amkp> listCb = wsc.cb(resultExtras, txd.a);
                for (defpackage.amkp amkpVar : listCb) {
                    java.lang.String str = amkpVar.b;
                    defpackage.vqu vquVarCr = wsc.cr(defpackage.tvz.a.m());
                    vquVarCr.W(defpackage.tvy.DOWNLOADABLE);
                    vquVarCr.Y(amkpVar.c);
                    java.lang.String str2 = amkpVar.b;
                    aooh.e(str2, "getBcp47Locale(...)");
                    vquVarCr.X(str2);
                    linkedHashMap.put(str, vquVarCr.V());
                }
                zjv zjvVar = this.c;
                zjvVar.d(getClass(), intent, ajsz.aY(gus.au(listCb.size())));
                java.util.List<defpackage.amkp> listCb2 = wsc.cb(resultExtras, txd.b);
                for (defpackage.amkp amkpVar2 : listCb2) {
                    java.lang.String str3 = amkpVar2.b;
                    defpackage.vqu vquVarCr2 = wsc.cr(defpackage.tvz.a.m());
                    vquVarCr2.W(defpackage.tvy.ON_DEVICE);
                    vquVarCr2.Y(amkpVar2.c);
                    java.lang.String str4 = amkpVar2.b;
                    aooh.e(str4, "getBcp47Locale(...)");
                    vquVarCr2.X(str4);
                    linkedHashMap.put(str3, vquVarCr2.V());
                }
                zjvVar.d(getClass(), intent, ajsz.aY(gus.au(listCb2.size())));
                if (resultExtras.containsKey("com.google.recognition.extra.OFFLINE_PENDING_LANGUAGES")) {
                    java.util.List<defpackage.amkp> listCb3 = wsc.cb(resultExtras, txd.c);
                    for (defpackage.amkp amkpVar3 : listCb3) {
                        java.lang.String str5 = amkpVar3.b;
                        defpackage.vqu vquVarCr3 = wsc.cr(defpackage.tvz.a.m());
                        vquVarCr3.W(defpackage.tvy.DOWNLOADING);
                        vquVarCr3.Y(amkpVar3.c);
                        java.lang.String str6 = amkpVar3.b;
                        aooh.e(str6, "getBcp47Locale(...)");
                        vquVarCr3.X(str6);
                        linkedHashMap.put(str5, vquVarCr3.V());
                    }
                    zjvVar.d(getClass(), intent, ajsz.aY(gus.au(listCb3.size())));
                } else {
                    txh.a.d().l("com/android/dialer/sodatranscription/impl/androidspeech/SodaAndroidSpeechModelAvailability$LanguageDetailsReceiver", "onReceive$<anonymous>", 209, "SodaAndroidSpeechModelAvailability.kt").v("EXTRA_OFFLINE_PENDING_LANGUAGES is not supported");
                }
                this.a.a(linkedHashMap);
            }
            ajsz.ak(ahokVarF, (java.lang.Throwable) null);
        } catch (java.lang.Throwable th) {
            try {
                throw th;
            } catch (java.lang.Throwable th2) {
                ajsz.ak(ahokVarF, th);
                throw th2;
            }
        }
    }
}
