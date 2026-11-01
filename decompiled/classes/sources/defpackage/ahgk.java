package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ahgk extends defpackage.amxj {
    public ahgk(defpackage.mp mpVar) {
        super(mpVar, new defpackage.amxo(mpVar), new defpackage.ahgn(mpVar, mpVar), new defpackage.ahgm(mpVar, new defpackage.amwv(mpVar, null, null)));
    }

    @Override // defpackage.amxj
    protected final java.lang.Object a() {
        defpackage.ahoq ahoqVarX = defpackage.ahvr.X(1387, "Act#comp", defpackage.ahot.a, true);
        try {
            android.app.Activity activity = this.a;
            defpackage.ahvr.ce(activity.getApplication() instanceof defpackage.ahfx, "TikTok activity, %s, cannot be attached to a non-TikTok application, %s.", activity.getClass().getSimpleName(), activity.getApplication().getClass().getSimpleName());
            java.lang.Object objA = super.a();
            ahoqVarX.close();
            return objA;
        } catch (java.lang.Throwable th) {
            try {
                ahoqVarX.close();
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
