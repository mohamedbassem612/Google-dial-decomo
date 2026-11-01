package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class lcn implements defpackage.ajcb {
    private final /* synthetic */ int $cid;

    public lcn(defpackage.jsn jsnVar, int i) {
        this.$cid = i;
        j$.util.Objects.requireNonNull(jsnVar);
    }

    @Override // defpackage.ajcb
    public final void a(java.lang.Throwable th) {
        switch (this.$cid) {
            case 0:
                ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) defpackage.lco.a.c()).i(defpackage.zct.b)).k(th)).l("com/android/dialer/callscreen/impl/donation/scotty/CallScreenMetricsListener$1", "onFailure", '3', "CallScreenMetricsListener.java")).v("Could not enqueue call screen metrics worker.");
                break;
            case 1:
                ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) defpackage.jsn.a.c()).i(defpackage.zct.b)).k(th)).l("com/android/dialer/calleridfeedback/impl/database/retention/CallerIdFeedbackDeletionListener$1", "onFailure", '7', "CallerIdFeedbackDeletionListener.java")).v("Could not enqueue caller id feedback deletion worker.");
                break;
            case 2:
                defpackage.aooh.f(th, "t");
                ((defpackage.aimw) ((defpackage.aimw) defpackage.mew.a.c()).m(defpackage.aioa.MEDIUM).l("com/android/dialer/darpa/impl/DarpaPhenotypeFlagsCommitSucceededListener$onFlagsCommittedSuccessfully$<anonymous>", "onFailure", 37, "DarpaPhenotypeFlagsCommitSucceededListener.kt")).v("failed to update component enabled states");
                break;
            case 3:
                ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) defpackage.nzl.a.c()).i(defpackage.zct.b)).k(th)).l("com/android/dialer/eligibilityexpansion/EligibilityExpansionStartupListener$1", "onFailure", ':', "EligibilityExpansionStartupListener.java")).v("Could not enqueue eligibility expansion database worker.");
                break;
            case 4:
                ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) defpackage.uth.a.c()).i(defpackage.zct.b)).k(th)).l("com/android/dialer/timekeeper/impl/worker/TimeKeeperDbRefreshingListener$1", "onFailure", '3', "TimeKeeperDbRefreshingListener.java")).v("Could not enqueue timekeeper db refreshing worker.");
                break;
            case 5:
                ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) defpackage.wrl.a.c()).i(defpackage.zct.b)).k(th)).l("com/android/dialer/xatu/impl/storage/postcall/XatuMetricsListener$1", "onFailure", '3', "XatuMetricsListener.java")).v("Could not enqueue xatu metrics worker.");
                break;
            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) defpackage.wzf.a.c()).k(th)).l("com/android/incallui/atlas/ui/impl/database/postcall/AtlasMetricsListener$1", "onFailure", '-', "AtlasMetricsListener.java")).v("Could not enqueue atlas metrics deletion worker.");
                break;
            default:
                defpackage.adbe.i("%s: Failed to commitToFlagSnapshot: %s", "MobileDataDownloadBuilder", th);
                break;
        }
    }

    @Override // defpackage.ajcb
    public final /* synthetic */ void b(java.lang.Object obj) {
        switch (this.$cid) {
            case 0:
                ((defpackage.aimw) ((defpackage.aimw) defpackage.lco.a.b()).l("com/android/dialer/callscreen/impl/donation/scotty/CallScreenMetricsListener$1", "onSuccess", 42, "CallScreenMetricsListener.java")).v("Successfully enqueued call screen metrics worker.");
                break;
            case 1:
                ((defpackage.aimw) ((defpackage.aimw) defpackage.jsn.a.b()).l("com/android/dialer/calleridfeedback/impl/database/retention/CallerIdFeedbackDeletionListener$1", "onSuccess", 45, "CallerIdFeedbackDeletionListener.java")).y("Successfully enqueued caller id feedback deletion worker, uuid=%s.", (java.util.UUID) obj);
                break;
            case 2:
                if (((defpackage.aojh) obj) == null) {
                    defpackage.aooh.i("result");
                }
                ((defpackage.aimw) defpackage.mew.a.b().l("com/android/dialer/darpa/impl/DarpaPhenotypeFlagsCommitSucceededListener$onFlagsCommittedSuccessfully$<anonymous>", "onSuccess", 30, "DarpaPhenotypeFlagsCommitSucceededListener.kt")).v("update component enabled states successfully");
                break;
            case 3:
                ((defpackage.aimw) ((defpackage.aimw) defpackage.nzl.a.b()).l("com/android/dialer/eligibilityexpansion/EligibilityExpansionStartupListener$1", "onSuccess", 49, "EligibilityExpansionStartupListener.java")).v("Enqueued eligibility expansion database worker.");
                break;
            case 4:
                ((defpackage.aimw) ((defpackage.aimw) defpackage.uth.a.b()).l("com/android/dialer/timekeeper/impl/worker/TimeKeeperDbRefreshingListener$1", "onSuccess", 42, "TimeKeeperDbRefreshingListener.java")).v("Successfully enqueued timekeeper db refreshing worker.");
                break;
            case 5:
                ((defpackage.aimw) ((defpackage.aimw) defpackage.wrl.a.b()).l("com/android/dialer/xatu/impl/storage/postcall/XatuMetricsListener$1", "onSuccess", 42, "XatuMetricsListener.java")).v("Successfully enqueued xatu metrics worker.");
                break;
            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                ((defpackage.aimw) ((defpackage.aimw) defpackage.wzf.a.b()).l("com/android/incallui/atlas/ui/impl/database/postcall/AtlasMetricsListener$1", "onSuccess", 40, "AtlasMetricsListener.java")).v("Successfully enqueued atlas metrics deletion worker.");
                break;
            default:
                int i = defpackage.adbe.a;
                break;
        }
    }

    public lcn(int i) {
        this.$cid = i;
    }

    public lcn(defpackage.nzl nzlVar, int i) {
        this.$cid = i;
        j$.util.Objects.requireNonNull(nzlVar);
    }

    public lcn(defpackage.lco lcoVar, int i) {
        this.$cid = i;
        j$.util.Objects.requireNonNull(lcoVar);
    }

    public lcn(defpackage.uth uthVar, int i) {
        this.$cid = i;
        j$.util.Objects.requireNonNull(uthVar);
    }

    public lcn(defpackage.wrl wrlVar, int i) {
        this.$cid = i;
        j$.util.Objects.requireNonNull(wrlVar);
    }

    public lcn(defpackage.wzf wzfVar, int i) {
        this.$cid = i;
        j$.util.Objects.requireNonNull(wzfVar);
    }

    public lcn(defpackage.acwj acwjVar, int i) {
        this.$cid = i;
        j$.util.Objects.requireNonNull(acwjVar);
    }
}
