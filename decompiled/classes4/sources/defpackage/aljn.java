package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class aljn implements ajcb {
    private final /* synthetic */ int $cid;

    public aljn(defpackage.aljm aljmVar, int i) {
        this.$cid = i;
        j$.util.Objects.requireNonNull(aljmVar);
    }

    public final void a(java.lang.Throwable th) {
        int i = this.$cid;
        if (i == 0) {
            a.by(aljo.a.c(), "Consuming input stream failed.", "com/google/quality/views/extraction/kcube/bg/ondevice/core/infra/AudioRouterImpl$1", "onFailure", '7', "AudioRouterImpl.java", th);
            return;
        }
        if (i == 1) {
            a.by(defpackage.aljm.a.c(), "Error while running predictions on audio.", "com/google/quality/views/extraction/kcube/bg/ondevice/core/infra/AudioIntentExtractionProcessor$1", "onFailure", (char) 158, "AudioIntentExtractionProcessor.java", th);
            return;
        }
        if (i == 2) {
            a.by(aljo.a.c(), "Passing audio bytes to processors failed.", "com/google/quality/views/extraction/kcube/bg/ondevice/core/infra/AudioRouterImpl$2", "onFailure", '^', "AudioRouterImpl.java", th);
        } else if (i != 3) {
            a.by(defpackage.amcx.a.c(), "Failed initializing amStateManager.", "com/google/quality/views/extraction/kcube/bg/ondevice/modules/vc/CacheSupportedAmStateManager$1", "onFailure", (char) 1484, "CacheSupportedAmStateManager.java", th);
        } else {
            a.by(defpackage.allu.a.c(), "Starting consumer failed.", "com/google/quality/views/extraction/kcube/bg/ondevice/core/infra/Speaker$1", "onFailure", (char) 259, "Speaker.java", th);
        }
    }

    public final /* synthetic */ void b(java.lang.Object obj) {
        int i = this.$cid;
        if (i == 0) {
            return;
        }
        if (i == 1) {
            return;
        }
        if (i == 2) {
        } else if (i != 3) {
            defpackage.amcx.a.b().l("com/google/quality/views/extraction/kcube/bg/ondevice/modules/vc/CacheSupportedAmStateManager$1", "onSuccess", 1479, "CacheSupportedAmStateManager.java").v("Successfully initialized amStateManager.");
        } else {
            defpackage.allu.a.d().l("com/google/quality/views/extraction/kcube/bg/ondevice/core/infra/Speaker$1", "onSuccess", 254, "Speaker.java").v("Starting consumer succeeded");
        }
    }

    public aljn(aljo aljoVar, int i) {
        this.$cid = i;
        j$.util.Objects.requireNonNull(aljoVar);
    }

    public aljn(aljo aljoVar, int i, byte[] bArr) {
        this.$cid = i;
        j$.util.Objects.requireNonNull(aljoVar);
    }

    public aljn(defpackage.allu alluVar, int i) {
        this.$cid = i;
        j$.util.Objects.requireNonNull(alluVar);
    }

    public aljn(defpackage.amcx amcxVar, int i) {
        this.$cid = i;
        j$.util.Objects.requireNonNull(amcxVar);
    }
}
