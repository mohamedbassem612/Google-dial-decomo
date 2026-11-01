package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class dre {
    public static final defpackage.dre a = new defpackage.dre();

    public final void a(android.view.Window window, int i) {
        if (i <= 0) {
            window.clearFlags(4);
            return;
        }
        window.addFlags(4);
        android.view.WindowManager.LayoutParams attributes = window.getAttributes();
        ac$.ExternalSyntheticApiModelOutline0.m(attributes, i);
        window.setAttributes(attributes);
    }
}
