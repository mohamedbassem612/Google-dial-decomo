package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class kpw implements ysd {
    private static final aimz a = aimz.i("com/android/dialer/callnotesinfra/summarizer/aicore/SummarizationAiCoreDownloadCallback");
    private final yse b;
    private final defpackage.ni c;

    public kpw(yse yseVar, defpackage.ni niVar) {
        aooh.f(niVar, "downloadStateHolder");
        this.b = yseVar;
        this.c = niVar;
    }

    public final java.lang.Object a(aoln aolnVar) {
        aimw aimwVarL = a.b().l("com/android/dialer/callnotesinfra/summarizer/aicore/SummarizationAiCoreDownloadCallback", "onDownloadCompleted", 81, "SummarizationAiCoreDownloadCallback.kt");
        yse yseVar = this.b;
        aimwVarL.y("Download completed for feature: %s", yseVar);
        java.lang.Object objA = this.c.u(yseVar).a.a(defpackage.kpx.a, aolnVar);
        return objA != aolu.a ? aojh.a : objA;
    }

    public final java.lang.Object b(ymi ymiVar, aoln aolnVar) {
        aimw aimwVarL = a.d().k(ymiVar).l("com/android/dialer/callnotesinfra/summarizer/aicore/SummarizationAiCoreDownloadCallback", "onDownloadDidNotStart", 31, "SummarizationAiCoreDownloadCallback.kt");
        yse yseVar = this.b;
        aimwVarL.y("Download did not start for feature: %s", new aepg(yseVar));
        aoyq aoyqVar = this.c.u(yseVar).a;
        defpackage.kqz kqzVar = defpackage.kqz.FEATURE_DOWNLOAD_INCOMPLETE;
        java.util.Objects.toString(yseVar);
        java.lang.Object objA = aoyqVar.a(new defpackage.kpy(new defpackage.kpk(kqzVar, "Download did not start for ".concat(yseVar.toString()), ymiVar)), aolnVar);
        return objA != aolu.a ? aojh.a : objA;
    }

    public final java.lang.Object c(int i, ymi ymiVar, aoln aolnVar) {
        aimw aimwVarL = a.d().k(ymiVar).l("com/android/dialer/callnotesinfra/summarizer/aicore/SummarizationAiCoreDownloadCallback", "onDownloadFailed", 59, "SummarizationAiCoreDownloadCallback.kt");
        yse yseVar = this.b;
        aimwVarL.I("Download failed for feature: %s with status: %s", new aepg(yseVar), new aepb(i));
        java.lang.Object objA = this.c.u(yseVar).a.a(new defpackage.kpy(new defpackage.kpk(defpackage.kqz.FEATURE_DOWNLOAD_INCOMPLETE, "Download failed with status " + i + " for " + yseVar, ymiVar)), aolnVar);
        return objA != aolu.a ? aojh.a : objA;
    }

    public final java.lang.Object d(long j, aoln aolnVar) {
        return aojh.a;
    }

    public final java.lang.Object e(long j, aoln aolnVar) {
        a.b().l("com/android/dialer/callnotesinfra/summarizer/aicore/SummarizationAiCoreDownloadCallback", "onDownloadStarted", 52, "SummarizationAiCoreDownloadCallback.kt").H("Download started for feature: %s, bytes: %d", this.b, j);
        return aojh.a;
    }
}
