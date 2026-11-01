package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class kxu implements ajcb {
    private final /* synthetic */ int $cid;

    public kxu(jxe jxeVar, int i) {
        this.$cid = i;
        j$.util.Objects.requireNonNull(jxeVar);
    }

    public final void a(java.lang.Throwable th) {
        int i = this.$cid;
        if (i == 0) {
            a.by(defpackage.kxx.a.b(), "record failed", "com/android/dialer/callrecording/impl/service/CallRecordingButtonController$3$1", "onFailure", (char) 306, "CallRecordingButtonController.java", th);
        } else if (i == 1) {
            a.by(jxe.a.c(), "Failed to check for existing emergency call.", "com/android/dialer/calllauncher/CallLauncher$1", "onFailure", (char) 259, "CallLauncher.java", th);
        }
    }

    public final void b(java.lang.Object obj) {
        if (this.$cid == 0) {
            defpackage.kxx.a.b().l("com/android/dialer/callrecording/impl/service/CallRecordingButtonController$3$1", "onSuccess", 301, "CallRecordingButtonController.java").v("record finished");
        }
    }

    public kxu(defpackage.kxt kxtVar, int i) {
        this.$cid = i;
        j$.util.Objects.requireNonNull(kxtVar);
    }

    public kxu(zpw zpwVar, int i) {
        this.$cid = i;
        j$.util.Objects.requireNonNull(zpwVar);
    }
}
