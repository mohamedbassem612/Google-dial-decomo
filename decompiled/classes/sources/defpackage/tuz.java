package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class tuz {
    private static final defpackage.aimz a = defpackage.aimz.i("com/android/dialer/shortcutbadger/impl/ShortcutBadgerImpl");
    private final android.content.Context b;

    public tuz(android.content.Context context) {
        this.b = context;
    }

    public final void a(int i) {
        ((defpackage.aimw) ((defpackage.aimw) a.b()).l("com/android/dialer/shortcutbadger/impl/ShortcutBadgerImpl", "applyCount", 26, "ShortcutBadgerImpl.java")).C("badger count applied: %d, success: %b", i, aphk.a(this.b, i));
    }

    public final void b() {
        ((defpackage.aimw) ((defpackage.aimw) a.b()).l("com/android/dialer/shortcutbadger/impl/ShortcutBadgerImpl", "removeCount", 33, "ShortcutBadgerImpl.java")).y("badger count removed, success: %b", java.lang.Boolean.valueOf(aphk.a(this.b, 0)));
    }
}
