package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class wzs implements oqb {
    private final defpackage.rju a;

    public wzs(defpackage.rju rjuVar) {
        this.a = rjuVar;
    }

    public final defpackage.acky a(defpackage.aclc aclcVar) {
        android.content.Intent intent = (android.content.Intent) aclcVar.a.get(defpackage.ackw.b);
        if (intent == null || !aooh.n("com.android.incallui.atlas.ui.impl.growthkit.ACTION_SHOW_SETTINGS", intent.getAction())) {
            return null;
        }
        agsm.i(1147, this.a.l(defpackage.xap.AUTO_ENROLLED), "failed to enable Atlas", new java.lang.Object[0]);
        return new defpackage.acky(true, 1);
    }

    public final /* synthetic */ void b(int i, defpackage.ackw ackwVar) {
    }
}
