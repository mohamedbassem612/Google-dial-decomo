package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final /* synthetic */ class rqk implements defpackage.oi, defpackage.aood {
    final /* synthetic */ defpackage.rql a;

    public rqk(defpackage.rql rqlVar) {
        this.a = rqlVar;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: afeb */
    @Override // defpackage.oi
    public final /* bridge */ /* synthetic */ void a(java.lang.Object obj) throws afeb {
        androidx.activity.result.ActivityResult activityResult = (androidx.activity.result.ActivityResult) obj;
        defpackage.aooh.f(activityResult, "p0");
        defpackage.aooh.f(activityResult, "activityResult");
        int i = activityResult.a;
        if (i == 0) {
            ((defpackage.aimw) defpackage.rql.a.b().l("com/android/dialer/main/impl/ui/MainScreenVoiceSearchMenuProvider", "onVoiceTranscriptionResult", 67, "MainScreenVoiceSearchMenuProvider.kt")).v("voice transcription is canceled");
            return;
        }
        if (i == 1) {
            ((defpackage.aimw) defpackage.rql.a.b().l("com/android/dialer/main/impl/ui/MainScreenVoiceSearchMenuProvider", "onVoiceTranscriptionResult", 71, "MainScreenVoiceSearchMenuProvider.kt")).v("voice transcription is empty");
            return;
        }
        if (i == 2) {
            ((defpackage.aimw) defpackage.rql.a.d().l("com/android/dialer/main/impl/ui/MainScreenVoiceSearchMenuProvider", "onVoiceTranscriptionResult", 75, "MainScreenVoiceSearchMenuProvider.kt")).v("voice transcription is failed with client error");
            return;
        }
        if (i == 3) {
            ((defpackage.aimw) defpackage.rql.a.d().l("com/android/dialer/main/impl/ui/MainScreenVoiceSearchMenuProvider", "onVoiceTranscriptionResult", 79, "MainScreenVoiceSearchMenuProvider.kt")).v("voice transcription is failed with server error");
            return;
        }
        if (i == 4) {
            ((defpackage.aimw) defpackage.rql.a.d().l("com/android/dialer/main/impl/ui/MainScreenVoiceSearchMenuProvider", "onVoiceTranscriptionResult", 83, "MainScreenVoiceSearchMenuProvider.kt")).v("voice transcription is failed with network error");
            return;
        }
        if (i == 5) {
            ((defpackage.aimw) defpackage.rql.a.d().l("com/android/dialer/main/impl/ui/MainScreenVoiceSearchMenuProvider", "onVoiceTranscriptionResult", 87, "MainScreenVoiceSearchMenuProvider.kt")).v("voice transcription is failed with audio error");
            return;
        }
        if (i != -1) {
            ((defpackage.aimw) defpackage.rql.a.d().l("com/android/dialer/main/impl/ui/MainScreenVoiceSearchMenuProvider", "onVoiceTranscriptionResult", 91, "MainScreenVoiceSearchMenuProvider.kt")).v("voice transcription is failed with unknown error");
            return;
        }
        android.content.Intent intent = activityResult.b;
        if (intent == null) {
            throw new java.util.NoSuchElementException("received null voice transcription result");
        }
        java.util.ArrayList<java.lang.String> stringArrayListExtra = intent.getStringArrayListExtra("android.speech.extra.RESULTS");
        if (stringArrayListExtra == null || stringArrayListExtra.isEmpty()) {
            ((defpackage.aimw) defpackage.rql.a.d().l("com/android/dialer/main/impl/ui/MainScreenVoiceSearchMenuProvider", "onVoiceTranscriptionResult", 100, "MainScreenVoiceSearchMenuProvider.kt")).v("empty list from received voice transcription result");
            return;
        }
        java.lang.String str = stringArrayListExtra.get(0);
        defpackage.aooh.e(str, "get(...)");
        java.lang.String str2 = str;
        if (str2.length() == 0) {
            ((defpackage.aimw) defpackage.rql.a.d().l("com/android/dialer/main/impl/ui/MainScreenVoiceSearchMenuProvider", "onVoiceTranscriptionResult", 105, "MainScreenVoiceSearchMenuProvider.kt")).v("voice transcription is empty");
        } else {
            defpackage.ahvr.i(new defpackage.rqq(str2), this.a.b);
        }
    }

    public final boolean equals(java.lang.Object obj) {
        if ((obj instanceof defpackage.oi) && (obj instanceof defpackage.aood)) {
            return defpackage.aooh.n(ex(), ((defpackage.aood) obj).ex());
        }
        return false;
    }

    @Override // defpackage.aood
    public final defpackage.aoio ex() {
        return new defpackage.aoof(1, this.a, defpackage.rql.class, "onVoiceTranscriptionResult", "onVoiceTranscriptionResult$third_party_java_src_android_app_dialer_java_com_android_dialer_main_impl_ui_ui(Landroidx/activity/result/ActivityResult;)V", 0);
    }

    public final int hashCode() {
        return ex().hashCode();
    }
}
