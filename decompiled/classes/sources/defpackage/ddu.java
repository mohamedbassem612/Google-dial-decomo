package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ddu {
    private final android.content.Context a;
    private android.content.ClipboardManager b;

    public ddu(android.content.Context context) {
        this.a = context;
    }

    public final android.content.ClipboardManager a() {
        android.content.ClipboardManager clipboardManager = this.b;
        if (clipboardManager != null) {
            return clipboardManager;
        }
        java.lang.Object systemService = this.a.getSystemService("clipboard");
        if (systemService == null) {
            defpackage.aooh.h("null cannot be cast to non-null type android.content.ClipboardManager");
        }
        android.content.ClipboardManager clipboardManager2 = (android.content.ClipboardManager) systemService;
        this.b = clipboardManager2;
        return clipboardManager2;
    }
}
