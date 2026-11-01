package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ddx implements aonn {
    private final android.view.View a;

    public ddx(android.view.View view) {
        this.a = view;
    }

    public final /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        b(((defpackage.cok) obj).a, ((java.lang.Boolean) obj2).booleanValue());
        return aojh.a;
    }

    public final void b(int i, boolean z) {
        java.lang.Integer numD = con.d(i);
        if (numD != null) {
            int iIntValue = numD.intValue();
            try {
                this.a.playSoundEffect(android.os.Build.VERSION.SDK_INT >= 31 ? dfd.a(iIntValue, z) : android.view.SoundEffectConstants.getContantForFocusDirection(iIntValue));
            } catch (android.os.DeadObjectException unused) {
            }
        }
    }
}
