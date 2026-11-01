package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class nnl implements ysd {
    private static final aimz a = aimz.i("com/android/dialer/dobby/impl/settings/service/DobbyGacsSettingsAiCoreDownloadCallback");
    private final aogc b;

    public nnl(aogc aogcVar) {
        aooh.f(aogcVar, "resultPropagator");
        this.b = aogcVar;
    }

    private final void f() {
        this.b.t(ajcm.a, defpackage.not.a);
    }

    public final java.lang.Object a(aoln aolnVar) {
        a.b().l("com/android/dialer/dobby/impl/settings/service/DobbyGacsSettingsAiCoreDownloadCallback", "onDownloadCompleted", 60, "DobbyGacsSettingsAiCoreDownloadCallback.kt").v("AiCore download completed");
        f();
        return aojh.a;
    }

    public final java.lang.Object b(ymi ymiVar, aoln aolnVar) {
        a.b().j(zct.a, java.lang.Boolean.TRUE).k(ymiVar).l("com/android/dialer/dobby/impl/settings/service/DobbyGacsSettingsAiCoreDownloadCallback", "onDownloadDidNotStart", 26, "DobbyGacsSettingsAiCoreDownloadCallback.kt").y("AiCore download did not start: %s", ymiVar.getMessage());
        f();
        return aojh.a;
    }

    public final java.lang.Object c(int i, ymi ymiVar, aoln aolnVar) {
        a.b().j(zct.a, java.lang.Boolean.TRUE).k(ymiVar).l("com/android/dialer/dobby/impl/settings/service/DobbyGacsSettingsAiCoreDownloadCallback", "onDownloadFailed", 48, "DobbyGacsSettingsAiCoreDownloadCallback.kt").B("AiCore download failed: status=%d, reason=%s", i, ymiVar.getMessage());
        f();
        return aojh.a;
    }

    public final java.lang.Object d(long j, aoln aolnVar) {
        a.b().l("com/android/dialer/dobby/impl/settings/service/DobbyGacsSettingsAiCoreDownloadCallback", "onDownloadProgress", 54, "DobbyGacsSettingsAiCoreDownloadCallback.kt").x("AiCore download progress: %s bytes downloaded", j);
        f();
        return aojh.a;
    }

    public final java.lang.Object e(long j, aoln aolnVar) {
        a.b().l("com/android/dialer/dobby/impl/settings/service/DobbyGacsSettingsAiCoreDownloadCallback", "onDownloadStarted", 38, "DobbyGacsSettingsAiCoreDownloadCallback.kt").x("AiCore download started: %s bytes to download", j);
        f();
        return aojh.a;
    }
}
