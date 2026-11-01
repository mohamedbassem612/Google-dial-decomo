package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class mwf implements qjb, aood {
    private final /* synthetic */ int $cid;
    final /* synthetic */ java.lang.Object a;

    public mwf(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    public final void a() {
        if (this.$cid != 0) {
            defpackage.jec.a.b().l("com/android/dialer/beesly/impl/v2/notification/BeeslyV2NotificationController", "onBeeslyNotificationContentClicked", 28, "BeeslyV2NotificationController.kt").v("beesly notification clicked");
            defpackage.jec jecVar = (defpackage.jec) this.a;
            aoov.an(jecVar.b, (aolr) null, 0, new defpackage.jeb(jecVar, (aoln) null, 2, (byte[]) null), 3);
        } else {
            defpackage.mwj.a.b().l("com/android/dialer/dobby/impl/notification/DobbyNotificationController", "onDobbyNotificationContentClicked", 187, "DobbyNotificationController.kt").v("notification clicked");
            defpackage.mwj mwjVar = (defpackage.mwj) this.a;
            mwjVar.a(mwjVar.c, new defpackage.muz(mwjVar, (aoln) null, 5));
        }
    }

    public final boolean equals(java.lang.Object obj) {
        if (this.$cid != 0) {
            if ((obj instanceof qjb) && (obj instanceof aood)) {
                return aooh.n(ex(), ((aood) obj).ex());
            }
            return false;
        }
        if ((obj instanceof qjb) && (obj instanceof aood)) {
            return aooh.n(ex(), ((aood) obj).ex());
        }
        return false;
    }

    public final aoio ex() {
        int i = this.$cid;
        java.lang.Object obj = this.a;
        return i != 0 ? new aoof(0, obj, defpackage.jec.class, "onBeeslyNotificationContentClicked", "onBeeslyNotificationContentClicked()V", 0) : new aoof(0, obj, defpackage.mwj.class, "onDobbyNotificationContentClicked", "onDobbyNotificationContentClicked()V", 0);
    }

    public final int hashCode() {
        int i = this.$cid;
        aoio aoioVarEx = ex();
        return i != 0 ? aoioVarEx.hashCode() : aoioVarEx.hashCode();
    }
}
