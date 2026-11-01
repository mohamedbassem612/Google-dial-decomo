package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class vvs extends defpackage.aomh implements defpackage.aono {
    private final /* synthetic */ int $cid;
    /* synthetic */ java.lang.Object a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vvs(defpackage.aoln aolnVar, int i) {
        super(3, aolnVar);
        this.$cid = i;
    }

    @Override // defpackage.aono
    public final /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        if (this.$cid != 0) {
            defpackage.vvs vvsVar = new defpackage.vvs((defpackage.aoln) obj3, 1, null);
            vvsVar.a = (java.lang.Throwable) obj2;
            return vvsVar.b(defpackage.aojh.a);
        }
        defpackage.vvs vvsVar2 = new defpackage.vvs((defpackage.aoln) obj3, 0);
        vvsVar2.a = (java.lang.Throwable) obj2;
        return vvsVar2.b(defpackage.aojh.a);
    }

    @Override // defpackage.aomb
    public final java.lang.Object b(java.lang.Object obj) {
        if (this.$cid != 0) {
            defpackage.aooc.af(obj);
            java.lang.Object obj2 = this.a;
            if (obj2 instanceof java.lang.SecurityException) {
                ((defpackage.aimw) ((defpackage.aimw) defpackage.jzr.a.b()).k((java.lang.Throwable) obj2).l("com/android/dialer/calllog/compose/data/CallLogPagingData", "withCatchingExceptions$<anonymous>", 198, "CallLogPagingData.kt")).v("missing permissions");
            } else {
                ((defpackage.aimw) ((defpackage.aimw) defpackage.jzr.a.d()).k((java.lang.Throwable) obj2).l("com/android/dialer/calllog/compose/data/CallLogPagingData", "withCatchingExceptions$<anonymous>", 201, "CallLogPagingData.kt")).v("exception when observing content provider");
            }
            return defpackage.aojh.a;
        }
        defpackage.aooc.af(obj);
        java.lang.Object obj3 = this.a;
        if (obj3 instanceof java.lang.SecurityException) {
            ((defpackage.aimw) ((defpackage.aimw) defpackage.vvz.a.b()).k((java.lang.Throwable) obj3).l("com/android/dialer/voicemail/tab/impl/mainscreenintegration/VoicemailTabRetainedState", "getVoicemailTabState$<anonymous>$<anonymous>$<anonymous>$<anonymous>$<anonymous>", 103, "VoicemailTabRetainedState.kt")).v("missing permission");
        } else {
            ((defpackage.aimw) ((defpackage.aimw) defpackage.vvz.a.d()).k((java.lang.Throwable) obj3).l("com/android/dialer/voicemail/tab/impl/mainscreenintegration/VoicemailTabRetainedState", "getVoicemailTabState$<anonymous>$<anonymous>$<anonymous>$<anonymous>$<anonymous>", 109, "VoicemailTabRetainedState.kt")).v("flow to fetch voicemail tab status failed");
        }
        return defpackage.aojh.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vvs(defpackage.aoln aolnVar, int i, byte[] bArr) {
        super(3, aolnVar);
        this.$cid = i;
    }
}
