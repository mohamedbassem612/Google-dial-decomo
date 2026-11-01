package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class mwg implements qjc, aood {
    final /* synthetic */ defpackage.mwj a;

    public mwg(defpackage.mwj mwjVar) {
        this.a = mwjVar;
    }

    public final void a() {
        defpackage.mwj.a.b().l("com/android/dialer/dobby/impl/notification/DobbyNotificationController", "onDobbyNotificationShown", 182, "DobbyNotificationController.kt").v("dobby notification shown");
    }

    public final boolean equals(java.lang.Object obj) {
        if ((obj instanceof qjc) && (obj instanceof aood)) {
            return aooh.n(ex(), ((aood) obj).ex());
        }
        return false;
    }

    public final aoio ex() {
        return new aoof(0, this.a, defpackage.mwj.class, "onDobbyNotificationShown", "onDobbyNotificationShown()V", 0);
    }

    public final int hashCode() {
        return ex().hashCode();
    }
}
