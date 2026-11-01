package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class drl {
    public static final defpackage.drl a = new defpackage.drl();

    public final void a(android.view.WindowManager.LayoutParams layoutParams, int i) {
        if (i > 0) {
            layoutParams.flags |= 4;
        } else {
            layoutParams.flags &= -5;
        }
        ac$.ExternalSyntheticApiModelOutline0.m(layoutParams, i);
    }
}
