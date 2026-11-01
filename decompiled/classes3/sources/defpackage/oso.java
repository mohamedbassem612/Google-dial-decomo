package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class oso implements lvn {
    private static final aimz a = aimz.i("com/android/dialer/incall/accountselectordialog/service/AccountSelectorDialogController");
    private final defpackage.osp b;
    private final defpackage.pqm c;
    private final defpackage.qbe d;

    public oso(defpackage.pqm pqmVar, defpackage.osp ospVar, defpackage.qbe qbeVar) {
        this.c = pqmVar;
        this.b = ospVar;
        this.d = qbeVar;
    }

    public final void a() {
        a.b().l("com/android/dialer/incall/accountselectordialog/service/AccountSelectorDialogController", "onDialogDismissed", 54, "AccountSelectorDialogController.java").v("enter");
        this.d.a(qbc.gv);
        defpackage.pqm pqmVar = this.c;
        if (pqmVar.a() == defpackage.zpo.h) {
            agsm.i(427, pqmVar.f(), "failed to disconnect call", new java.lang.Object[0]);
        }
    }

    public final void b(android.telecom.PhoneAccountHandle phoneAccountHandle, boolean z) {
        a.b().l("com/android/dialer/incall/accountselectordialog/service/AccountSelectorDialogController", "onPhoneAccountSelected", 44, "AccountSelectorDialogController.java").v("enter");
        this.d.a(qbc.gu);
        this.c.p(phoneAccountHandle);
        defpackage.osp ospVar = this.b;
        if (ospVar.b.isPresent()) {
            ((defpackage.ahdv) ospVar.b.orElseThrow()).f(phoneAccountHandle, z);
        } else {
            a.bI(defpackage.osp.a.c().m(aioa.b), "preferredAccountRecorder is not yet present, must first be initialized", "com/android/dialer/incall/accountselectordialog/service/AccountSelectorDialogPreferenceRecorder", "recordPreferredAccount", 'E', "AccountSelectorDialogPreferenceRecorder.java", zct.b);
        }
    }
}
