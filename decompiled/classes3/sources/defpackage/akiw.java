package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class akiw {
    public static final defpackage.akiw a;
    public static final defpackage.akiw b;
    public static final defpackage.akiw c;
    public static final defpackage.akiw d;
    public static final defpackage.akiw e;
    private static final /* synthetic */ defpackage.akiw[] f;

    static {
        defpackage.akiw akiwVar = new defpackage.akiw("REQUEST_PERMISSIONS", 0);
        a = akiwVar;
        defpackage.akiw akiwVar2 = new defpackage.akiw("APP_SETTINGS_REDIRECT", 1);
        b = akiwVar2;
        defpackage.akiw akiwVar3 = new defpackage.akiw("IN_APP_BROWSER_REDIRECT", 2);
        c = akiwVar3;
        defpackage.akiw akiwVar4 = new defpackage.akiw("ACCOUNT_SETTINGS_ACTION", 3);
        d = akiwVar4;
        defpackage.akiw akiwVar5 = new defpackage.akiw("ACTIONDATA_NOT_SET", 4);
        e = akiwVar5;
        f = new defpackage.akiw[]{akiwVar, akiwVar2, akiwVar3, akiwVar4, akiwVar5};
    }

    public static defpackage.akiw a(int i) {
        if (i == 0) {
            return e;
        }
        if (i == 1) {
            return a;
        }
        if (i == 2) {
            return b;
        }
        if (i == 3) {
            return c;
        }
        if (i != 4) {
            return null;
        }
        return d;
    }

    public static defpackage.akiw[] values() {
        return (defpackage.akiw[]) f.clone();
    }
}
