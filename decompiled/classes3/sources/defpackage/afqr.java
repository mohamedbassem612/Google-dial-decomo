package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class afqr implements ebo {
    final /* synthetic */ int a;
    final /* synthetic */ com.google.android.material.bottomsheet.BottomSheetBehavior b;

    public afqr(com.google.android.material.bottomsheet.BottomSheetBehavior bottomSheetBehavior, int i) {
        this.a = i;
        j$.util.Objects.requireNonNull(bottomSheetBehavior);
        this.b = bottomSheetBehavior;
    }

    public final boolean a(android.view.View view) {
        this.b.t(this.a);
        return true;
    }
}
