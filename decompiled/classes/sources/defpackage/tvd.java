package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class tvd {
    public static final defpackage.aimz a = defpackage.aimz.i("com/android/dialer/shortcuts/DynamicShortcuts");
    public final android.content.Context b;
    public final defpackage.ajct c;
    public final defpackage.lvs d;
    public final defpackage.rsr e;

    public tvd(android.content.Context context, defpackage.ajct ajctVar, defpackage.rsr rsrVar, defpackage.lvs lvsVar) {
        this.b = context;
        this.c = ajctVar;
        this.e = rsrVar;
        this.d = lvsVar;
    }

    public static android.content.pm.ShortcutManager a(android.content.Context context) {
        return hq$.ExternalSyntheticApiModelOutline1.m(context.getSystemService("shortcut"));
    }
}
