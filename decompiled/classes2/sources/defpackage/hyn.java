package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class hyn implements android.speech.tts.TextToSpeech.OnInitListener {
    private final /* synthetic */ int $cid;
    final /* synthetic */ aosb a;
    final /* synthetic */ java.lang.Object b;

    public hyn(aosb aosbVar, java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = aosbVar;
        this.b = obj;
    }

    @Override // android.speech.tts.TextToSpeech.OnInitListener
    public final void onInit(int i) {
        int i2 = this.$cid;
        if (i2 == 0) {
            aosb aosbVar = this.a;
            if (aosbVar.i()) {
                defpackage.hyo.a.b().l("com/android/dialer/audio/audioinjector/fileprovider/BaseTtsInstance", "initializeTts$<anonymous>$<anonymous>", 81, "BaseTtsInstance.kt").v("tts initialization was completed. ignoring");
                return;
            }
            if (i == 0) {
                defpackage.hyo.a.b().l("com/android/dialer/audio/audioinjector/fileprovider/BaseTtsInstance", "initializeTts$<anonymous>$<anonymous>", 84, "BaseTtsInstance.kt").v("tts initialization complete");
                aosbVar.w(aojh.a);
                return;
            } else {
                ((defpackage.hyo) this.b).b.o(rmx.ni);
                aosbVar.w(aooc.ae(new java.lang.IllegalStateException(a.bj(i, "tts initialization failed: "))));
                return;
            }
        }
        if (i2 == 1) {
            aimz aimzVar = zih.a;
            aolr aolrVarPlus = zih.b.plus(aols.a);
            aosb aosbVar2 = this.a;
            hvy hvyVar = (hvy) this.b;
            aoov.al(hvyVar.c, aolrVarPlus, 1, new defpackage.hvw(null, hvyVar, i, aosbVar2));
            return;
        }
        aosb aosbVar3 = this.a;
        if (aosbVar3.i()) {
            uxm.a.b().l("com/android/dialer/tts/internal/synthesis/TtsInstance", "initializeTts$<anonymous>$<anonymous>", 70, "TtsInstance.kt").v("tts initialization was completed. ignoring");
            return;
        }
        if (i != 0) {
            akzx akzxVar = (akzx) this.b;
            akzxVar.u();
            amsa amsaVar = akzxVar.b;
            alal alalVar = amsa.a;
            amsaVar.c |= 8;
            amsaVar.i = false;
            aosbVar3.w(aooc.ae(new java.lang.IllegalStateException(a.bj(i, "tts initialization failed: "))));
            return;
        }
        uxm.a.b().l("com/android/dialer/tts/internal/synthesis/TtsInstance", "initializeTts$<anonymous>$<anonymous>", 73, "TtsInstance.kt").v("tts initialization complete");
        akzx akzxVar2 = (akzx) this.b;
        akzxVar2.u();
        amsa amsaVar2 = akzxVar2.b;
        alal alalVar2 = amsa.a;
        amsaVar2.c |= 8;
        amsaVar2.i = true;
        aosbVar3.w(aojh.a);
    }

    public /* synthetic */ hyn(hvy hvyVar, aosb aosbVar, int i) {
        this.$cid = i;
        this.b = hvyVar;
        this.a = aosbVar;
    }
}
