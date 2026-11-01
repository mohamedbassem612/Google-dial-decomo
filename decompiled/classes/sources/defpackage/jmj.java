package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class jmj extends android.content.BroadcastReceiver {
    public static final defpackage.aimz a = defpackage.aimz.i("com/android/dialer/blockreportspam/ShowSpamPromoDialogReceiver");
    public final android.view.View b;
    public final defpackage.bo c;

    public jmj(android.view.View view, defpackage.bo boVar) {
        this.b = view;
        this.c = boVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(android.content.Context context, android.content.Intent intent) {
        ((defpackage.aimw) ((defpackage.aimw) a.b()).l("com/android/dialer/blockreportspam/ShowSpamPromoDialogReceiver", "onReceive", 80, "ShowSpamPromoDialogReceiver.java")).v("enter");
        defpackage.jmi jmiVar = (defpackage.jmi) defpackage.agab.aH(context, defpackage.jmi.class);
        defpackage.ahok ahokVarF = jmiVar.fi().f(158, "Broadcast to ShowSpamPromoDialogReceiver");
        try {
            defpackage.uhs uhsVarID = jmiVar.iD();
            defpackage.rlv rlvVarBt = jmiVar.bt();
            uhp uhpVarCD = jmiVar.cD();
            jmiVar.eO().g(defpackage.ahvr.H(uhpVarCD.c(), new lda(this, uhsVarID, rlvVarBt, uhpVarCD, 1), jmiVar.fI()), ((defpackage.akzm) jmiVar.ic().a()).b, java.util.concurrent.TimeUnit.SECONDS);
            ahokVarF.close();
        } catch (java.lang.Throwable th) {
            try {
                ahokVarF.close();
                throw th;
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }
}
