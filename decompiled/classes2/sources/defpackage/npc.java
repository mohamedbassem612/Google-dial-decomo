package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class npc implements twa {
    private final /* synthetic */ int $cid;
    final /* synthetic */ java.lang.Object a;

    public npc(vrp vrpVar, int i) {
        this.$cid = i;
        j$.util.Objects.requireNonNull(vrpVar);
        this.a = vrpVar;
    }

    public final void a() {
        int i = this.$cid;
        if (i == 0) {
            ((defpackage.npe) this.a).d();
            return;
        }
        if (i == 1) {
            defpackage.jbv.a.b().l("com/android/dialer/beesly/impl/settings/service/BeeslySettingsDataService$setupSodaModelDownloader$<anonymous>", "onEnqueue", 118, "BeeslySettingsDataService.kt").v("SODA language model download has enqueued.");
            ((defpackage.jbv) this.a).d();
            return;
        }
        if (i == 2) {
            tsg.a.b().l("com/android/dialer/sharpie/impl/settings/service/SharpieSettingsDataService$setupSodaModelDownloader$<anonymous>", "onEnqueue", 240, "SharpieSettingsDataService.kt").v("SODA language model download has enqueued");
            ((tsg) this.a).e();
        } else {
            if (i == 3) {
                ((vrp) this.a).a();
                return;
            }
            java.lang.Object obj = this.a;
            if (i != 4) {
                ((xav) obj).a();
            } else {
                ((wql) obj).a();
            }
        }
    }

    public final void b() {
        int i = this.$cid;
        if (i == 0) {
            defpackage.npe.a.b().l("com/android/dialer/dobby/impl/settings/service/DobbySettingsService$setupSodaModelDownloader$<anonymous>", "onError", 82, "DobbySettingsService.kt").v("SODA language model download failed");
            return;
        }
        if (i == 1) {
            defpackage.jbv.a.b().l("com/android/dialer/beesly/impl/settings/service/BeeslySettingsDataService$setupSodaModelDownloader$<anonymous>", "onError", 123, "BeeslySettingsDataService.kt").v("SODA language model download failed.");
            ((defpackage.jbv) this.a).d();
            return;
        }
        if (i == 2) {
            tsg.a.b().l("com/android/dialer/sharpie/impl/settings/service/SharpieSettingsDataService$setupSodaModelDownloader$<anonymous>", "onError", 245, "SharpieSettingsDataService.kt").v("SODA language model download failed");
            ((tsg) this.a).e();
        } else if (i == 3) {
            vrp.a.b().l("com/android/dialer/voicemail/settings/service/VoicemailSettingsDataService$1", "onError", 126, "VoicemailSettingsDataService.java").v("SODA language model download failed");
        } else if (i != 4) {
            xav.b.b().l("com/android/incallui/atlas/ui/impl/settings/dataservice/AtlasSettingsDataService$1", "onError", 90, "AtlasSettingsDataService.java").v("SODA language model download failed");
        } else {
            wql.a.b().l("com/android/dialer/xatu/impl/settings/XatuSettingsService$1", "onError", 76, "XatuSettingsService.java").v("SODA language model download failed");
            ((wql) this.a).a();
        }
    }

    public final void c() {
        int i = this.$cid;
        if (i == 0) {
            ((defpackage.npe) this.a).d();
            defpackage.npe.a.b().l("com/android/dialer/dobby/impl/settings/service/DobbySettingsService$setupSodaModelDownloader$<anonymous>", "onSuccess", 87, "DobbySettingsService.kt").v("SODA language model download completed");
            return;
        }
        if (i == 1) {
            defpackage.jbv.a.b().l("com/android/dialer/beesly/impl/settings/service/BeeslySettingsDataService$setupSodaModelDownloader$<anonymous>", "onSuccess", 128, "BeeslySettingsDataService.kt").v("SODA language model download completed.");
            ((defpackage.jbv) this.a).d();
            return;
        }
        if (i == 2) {
            tsg.a.b().l("com/android/dialer/sharpie/impl/settings/service/SharpieSettingsDataService$setupSodaModelDownloader$<anonymous>", "onSuccess", 250, "SharpieSettingsDataService.kt").v("SODA language model download completed");
            ((tsg) this.a).e();
        } else if (i == 3) {
            ((vrp) this.a).a();
            vrp.a.b().l("com/android/dialer/voicemail/settings/service/VoicemailSettingsDataService$1", "onSuccess", 132, "VoicemailSettingsDataService.java").v("SODA language model download completed");
        } else if (i != 4) {
            ((xav) this.a).a();
            xav.b.b().l("com/android/incallui/atlas/ui/impl/settings/dataservice/AtlasSettingsDataService$1", "onSuccess", 96, "AtlasSettingsDataService.java").v("SODA language model download completed");
        } else {
            wql.a.b().l("com/android/dialer/xatu/impl/settings/XatuSettingsService$1", "onSuccess", 82, "XatuSettingsService.java").v("SODA language model download completed");
            ((wql) this.a).a();
        }
    }

    public npc(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    public npc(wql wqlVar, int i) {
        this.$cid = i;
        j$.util.Objects.requireNonNull(wqlVar);
        this.a = wqlVar;
    }

    public npc(xav xavVar, int i) {
        this.$cid = i;
        j$.util.Objects.requireNonNull(xavVar);
        this.a = xavVar;
    }
}
