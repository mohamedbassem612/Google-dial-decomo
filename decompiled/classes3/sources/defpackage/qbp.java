package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class qbp extends amzm {
    private final amzg b;

    public qbp(amyz amyzVar, amyz amyzVar2, amzg amzgVar) {
        super(amyzVar2, new defpackage.amzw(defpackage.qbp.class), amyzVar);
        this.b = amzs.b(amzgVar);
    }

    public final /* bridge */ /* synthetic */ ajcq b(java.lang.Object obj) {
        defpackage.amor amorVar;
        android.content.Context context = (android.content.Context) obj;
        if (((android.media.AudioManager) context.getSystemService(android.media.AudioManager.class)).getStreamVolume(2) <= 0) {
            amorVar = defpackage.amor.UNDEFINED;
        } else if (android.provider.Settings.Global.getInt(context.getContentResolver(), "apply_ramping_ringer", 0) == 1) {
            amorVar = defpackage.amor.RAMPING_RINGER;
        } else {
            amorVar = android.provider.Settings.System.getInt(context.getContentResolver(), "vibrate_when_ringing", 0) == 1 ? defpackage.amor.ALWAYS_VIBRATE : defpackage.amor.NEVER_VIBRATE;
        }
        return aiql.z(amorVar);
    }

    protected final ajcq c() {
        return this.b.d();
    }
}
