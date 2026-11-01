package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class afqu {
    public int a;
    public boolean b;
    public final /* synthetic */ com.google.android.material.bottomsheet.BottomSheetBehavior c;
    private final java.lang.Runnable d;

    public afqu(com.google.android.material.bottomsheet.BottomSheetBehavior bottomSheetBehavior) {
        j$.util.Objects.requireNonNull(bottomSheetBehavior);
        this.c = bottomSheetBehavior;
        this.d = new defpackage.aflt(this, 2);
    }

    public final void a(int i) {
        com.google.android.material.bottomsheet.BottomSheetBehavior bottomSheetBehavior = this.c;
        java.lang.ref.WeakReference weakReference = bottomSheetBehavior.C;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.a = i;
        if (this.b) {
            return;
        }
        ((android.view.View) bottomSheetBehavior.C.get()).postOnAnimation(this.d);
        this.b = true;
    }
}
