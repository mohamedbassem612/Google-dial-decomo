package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ljh implements ahjr {
    public static final android.content.IntentFilter a = new android.content.IntentFilter("com.google.recognition.action.LANGUAGE_DOWNLOAD_COMPLETE");
    private static final aimz b = aimz.i("com/android/dialer/callscreen/impl/speechrecognition/modelchooser/modelmanager/downloadcompletereceiver/SodaDownloadCompleteReceiver");
    private final ljd c;
    private final lbw d;
    private final aogc e;

    public ljh(ljd ljdVar, aogc aogcVar, lbw lbwVar) {
        this.c = ljdVar;
        this.e = aogcVar;
        this.d = lbwVar;
    }

    public final ajcq a(android.content.Intent intent, int i) {
        if (i != -1) {
            b.c().m(aioa.b).i(zct.b).l("com/android/dialer/callscreen/impl/speechrecognition/modelchooser/modelmanager/downloadcompletereceiver/SodaDownloadCompleteReceiver", "onReceive", 64, "SodaDownloadCompleteReceiver.java").w("resultCode not ok: %s", i);
            return ajcm.a;
        }
        int iC = afbq.c(intent.getExtras());
        b.b().l("com/android/dialer/callscreen/impl/speechrecognition/modelchooser/modelmanager/downloadcompletereceiver/SodaDownloadCompleteReceiver", "onReceive", 72, "SodaDownloadCompleteReceiver.java").y("SODA language model download %s", iC == 2 ? "completed" : "failed");
        if (iC != 2) {
            return ajcm.a;
        }
        ljd ljdVar = this.c;
        aogc aogcVar = this.e;
        lbw lbwVar = this.d;
        ajcq ajcqVarC = ljdVar.c();
        aogcVar.t(ajcqVarC, lbwVar.a() ? defpackage.lil.b : defpackage.lhq.a);
        return ajcqVarC;
    }
}
