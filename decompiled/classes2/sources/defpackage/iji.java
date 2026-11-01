package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class iji {
    public static final aimz a = aimz.i("com/android/dialer/audioprism/internal/exclusivity/impl/AudioPrismExclusivityDialogFragmentPeer");
    public final defpackage.ijg b;
    public final ucm c;
    private final zpm d;

    public iji(defpackage.ijg ijgVar, ucm ucmVar, zpm zpmVar) {
        aooh.f(ucmVar, "tikTokAlertDialogs");
        aooh.f(zpmVar, "callScopes");
        this.b = ijgVar;
        this.c = ucmVar;
        this.d = zpmVar;
    }

    public final defpackage.ijk a() {
        defpackage.ijh ijhVar;
        j$.util.Optional optionalH = this.d.h();
        aooh.e(optionalH, "getPrimaryCallScope(...)");
        apqr apqrVar = (apqr) aooh.q(optionalH);
        if (apqrVar == null || (ijhVar = (defpackage.ijh) apqrVar.a(defpackage.ijh.class)) == null) {
            return null;
        }
        return ijhVar.i();
    }
}
