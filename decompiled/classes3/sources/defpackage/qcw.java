package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class qcw {
    private static final aimz d = aimz.i("com/android/dialer/incall/postchardialog/impl/ui/TidepodsPostCharDialogFragmentPeer");
    public final defpackage.qct a;
    public final defpackage.qcu b;
    public final ucm c;
    private final zpm e;

    public qcw(defpackage.qct qctVar, zpm zpmVar, defpackage.qcu qcuVar, ucm ucmVar) {
        this.a = qctVar;
        this.e = zpmVar;
        this.b = qcuVar;
        this.c = ucmVar;
    }

    public final void a(qbc qbcVar) {
        defpackage.qct qctVar = this.a;
        zpm zpmVar = this.e;
        java.lang.String str = qctVar.c;
        j$.util.Optional optionalE = zpmVar.e(str);
        if (optionalE.isPresent()) {
            ((defpackage.qcv) ((defpackage.apqr) optionalE.orElseThrow()).a(defpackage.qcv.class)).cp().a(qbcVar);
        } else {
            a.bt(d.d(), "Call id %s was not found in CallScopes", str, "com/android/dialer/incall/postchardialog/impl/ui/TidepodsPostCharDialogFragmentPeer", "logInCallImpression", '~', "TidepodsPostCharDialogFragmentPeer.java", zct.b);
        }
    }

    public final void b(boolean z) {
        defpackage.qct qctVar = this.a;
        zpm zpmVar = this.e;
        java.lang.String str = qctVar.c;
        j$.util.Optional optionalE = zpmVar.e(str);
        if (!optionalE.isPresent()) {
            a.bt(d.d(), "Call id %s was not found in CallScopes", str, "com/android/dialer/incall/postchardialog/impl/ui/TidepodsPostCharDialogFragmentPeer", "postDialContinue", 'm', "TidepodsPostCharDialogFragmentPeer.java", zct.b);
            return;
        }
        defpackage.pqm pqmVarCq = ((defpackage.qcv) ((defpackage.apqr) optionalE.orElseThrow()).a(defpackage.qcv.class)).cq();
        if (z) {
            defpackage.pqm.a.b().l("com/android/dialer/incall/core/call/CallControllerImpl", "postDialContinue", 646, "CallControllerImpl.java").v("Continue playing the post-dial DTMF string.");
        } else {
            defpackage.pqm.a.b().l("com/android/dialer/incall/core/call/CallControllerImpl", "postDialContinue", 648, "CallControllerImpl.java").v("User cancelled playing the post-dial DTMF string.");
        }
        pqmVarCq.f.b(mfy.ed, aify.p(gus.ax(z)));
        pqmVarCq.b.postDialContinue(z);
    }
}
