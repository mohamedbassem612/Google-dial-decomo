package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class kjp implements defpackage.ajcb {
    final /* synthetic */ defpackage.aenj a;
    final /* synthetic */ defpackage.kjq b;
    final /* synthetic */ int c;

    public kjp(defpackage.kjq kjqVar, int i, defpackage.aenj aenjVar) {
        this.c = i;
        this.a = aenjVar;
        j$.util.Objects.requireNonNull(kjqVar);
        this.b = kjqVar;
    }

    @Override // defpackage.ajcb
    public final void a(java.lang.Throwable th) {
        ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) defpackage.kjq.a.c()).k(th)).l("com/android/dialer/calllog/refresh/impl/AnnotatedCallLogRefreshRequestRegulator$1", "onFailure", (char) 197, "AnnotatedCallLogRefreshRequestRegulator.java")).v("Annotated call log refresh failed.");
        defpackage.kjq kjqVar = this.b;
        kjqVar.g.n(this.a, defpackage.rub.c);
        kjqVar.f.o(defpackage.rmx.ANNOTATED_CALL_LOG_REFRESH_FAILED);
        kjqVar.a();
    }

    @Override // defpackage.ajcb
    public final /* bridge */ /* synthetic */ void b(java.lang.Object obj) {
        int iOrdinal = ((defpackage.kjv) obj).ordinal();
        int i = this.c;
        defpackage.kjq kjqVar = this.b;
        if (iOrdinal == 0) {
            kjqVar.f.n(defpackage.rmw.ANNOTATED_CALL_LOG_NOT_DIRTY);
        } else if (iOrdinal == 1) {
            kjqVar.f.o(defpackage.rmx.ANNOTATED_CALL_LOG_CONVERSATION_HISTORY_REFRESHED);
        } else if (iOrdinal == 2) {
            int i2 = i - 1;
            if (i2 == 0) {
                throw new java.lang.IllegalStateException("REFRESH_CONVERSATION_HISTORY_ONLY cannot return REBUILT_BUT_NO_CHANGES_NEEDED");
            }
            if (i2 == 1) {
                kjqVar.f.n(defpackage.rmw.ANNOTATED_CALL_LOG_NO_CHANGES_NEEDED);
            } else if (i2 != 2) {
                kjqVar.f.n(defpackage.rmw.ANNOTATED_CALL_LOG_FORCE_REFRESH_NO_CHANGES_NEEDED);
            } else {
                kjqVar.f.o(defpackage.rmx.ANNOTATED_CALL_LOG_FORCE_REFRESH_NO_SYSTEM_CALL_LOG_NO_CHANGES_NEEDED);
            }
        } else if (iOrdinal == 3) {
            int i3 = i - 1;
            if (i3 == 0) {
                throw new java.lang.IllegalStateException("REFRESH_CONVERSATION_HISTORY_ONLY cannot return REBUILT_AND_CHANGES_NEEDED");
            }
            if (i3 == 1) {
                kjqVar.f.n(defpackage.rmw.ANNOTATED_CALL_LOG_CHANGES_NEEDED);
            } else if (i3 != 2) {
                kjqVar.f.n(defpackage.rmw.ANNOTATED_CALL_LOG_FORCE_REFRESH_CHANGES_NEEDED);
            } else {
                kjqVar.f.o(defpackage.rmx.ANNOTATED_CALL_LOG_FORCE_REFRESH_NO_SYSTEM_CALL_LOG_CHANGES_NEEDED);
            }
        }
        kjqVar.g.n(this.a, defpackage.rub.b);
        kjqVar.a();
    }
}
