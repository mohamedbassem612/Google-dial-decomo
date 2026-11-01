package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class tly implements oqb {
    public static final aimz a = aimz.i("com/android/dialer/sharpie/impl/promo/growthkit/SharpiePromoController");
    public final aogc b;
    private final aoss c;

    public tly(aoss aossVar, aogc aogcVar) {
        aooh.f(aossVar, "lightweightScope");
        aooh.f(aogcVar, "settings");
        this.c = aossVar;
        this.b = aogcVar;
    }

    public final defpackage.acky a(defpackage.aclc aclcVar) {
        android.content.Intent intent = (android.content.Intent) aclcVar.a.get(defpackage.ackw.b);
        if (aooh.n(intent != null ? intent.getAction() : null, "com.android.dialer.sharpie.impl.growthkit.ACTION_SHOW_SETTINGS")) {
            return new defpackage.acky(true, 1);
        }
        return null;
    }

    public final void b(int i, defpackage.ackw ackwVar) {
        if (ackwVar != defpackage.ackw.b) {
            a.b().l("com/android/dialer/sharpie/impl/promo/growthkit/SharpiePromoController", "handleUserAction", 34, "SharpiePromoController.kt").v("not ACTION_POSITIVE");
        } else {
            aoov.an(this.c, (aolr) null, 0, new defpackage.tkx(this, (aoln) null, 3), 3);
        }
    }
}
