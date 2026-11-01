package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
class pxw implements agye {
    final /* synthetic */ defpackage.pxx a;

    public pxw(defpackage.pxx pxxVar) {
        j$.util.Objects.requireNonNull(pxxVar);
        this.a = pxxVar;
    }

    public final void a(java.lang.Throwable th) {
        a.bq(defpackage.pxx.a.d(), "InCallDialogHostFragment subscription mixin fail", "com/android/dialer/incall/dialog/ui/InCallDialogHostFragmentPeer$1", "onError", ':', "InCallDialogHostFragmentPeer.java", th, zct.b);
    }

    public final /* synthetic */ void b(java.lang.Object obj) {
        j$.util.Optional optionalOfNullable;
        defpackage.pxx pxxVar = this.a;
        defpackage.pxv pxvVar = pxxVar.c;
        j$.util.Optional optional = (j$.util.Optional) obj;
        defpackage.pxr pxrVarE = pxvVar.I().e("IN_CALL_DIALOG_TAG");
        aimz aimzVar = defpackage.pxx.a;
        aimzVar.b().l("com/android/dialer/incall/dialog/ui/InCallDialogHostFragmentPeer", "updateUi", 92, "InCallDialogHostFragmentPeer.java").y("Previous dialog exist: %s", java.lang.Boolean.valueOf(pxrVarE != null));
        if (pxrVarE != null) {
            defpackage.pxl pxlVar = pxrVarE.y().b;
            j$.util.Objects.requireNonNull(pxlVar);
            defpackage.pnh pnhVar = new defpackage.pnh(pxlVar, 12);
            if (true != optional.isPresent()) {
                optionalOfNullable = optional;
            } else {
                optionalOfNullable = j$.util.Optional.ofNullable(java.lang.Boolean.valueOf(((alad) pnhVar.a).equals((defpackage.pxl) optional.get())));
            }
            if (((java.lang.Boolean) optionalOfNullable.orElse(java.lang.Boolean.FALSE)).booleanValue()) {
                aimzVar.b().l("com/android/dialer/incall/dialog/ui/InCallDialogHostFragmentPeer", "updateUi", 96, "InCallDialogHostFragmentPeer.java").v("Same model with previous dialog. Ignore displaying new model");
                return;
            }
        } else {
            pxrVarE = null;
        }
        if (pxrVarE != null) {
            pxrVarE.f();
        }
        defpackage.pxl pxlVar2 = (defpackage.pxl) optional.orElse((java.lang.Object) null);
        if (pxlVar2 != null) {
            if (pxvVar.G().isFinishing()) {
                if (pxlVar2.h.isEmpty()) {
                    aimzVar.b().l("com/android/dialer/incall/dialog/ui/InCallDialogHostFragmentPeer", "updateUi", 111, "InCallDialogHostFragmentPeer.java").v("Activity is finishing but no fallback toast message to show");
                    return;
                } else {
                    aimzVar.b().l("com/android/dialer/incall/dialog/ui/InCallDialogHostFragmentPeer", "updateUi", 115, "InCallDialogHostFragmentPeer.java").v("Activity is finishing, display toast instead");
                    android.widget.Toast.makeText(pxxVar.b, pxlVar2.h, 1).show();
                    return;
                }
            }
            aimzVar.b().l("com/android/dialer/incall/dialog/ui/InCallDialogHostFragmentPeer", "updateUi", 120, "InCallDialogHostFragmentPeer.java").v("Display dialog");
            defpackage.pxr pxrVar = new defpackage.pxr();
            amxr.g(pxrVar);
            ahgl.b(pxrVar, pxlVar2);
            pxrVar.r(pxvVar.I(), "IN_CALL_DIALOG_TAG");
        }
    }

    public final /* synthetic */ void c() {
    }
}
