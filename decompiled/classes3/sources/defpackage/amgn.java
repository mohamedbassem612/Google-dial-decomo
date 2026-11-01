package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class amgn {
    public static final defpackage.amgn a;
    public static final defpackage.amgn b;
    public static final defpackage.amgn c;
    private static final /* synthetic */ defpackage.amgn[] d;

    static {
        defpackage.amgn amgnVar = new defpackage.amgn("LIVE", 0);
        a = amgnVar;
        defpackage.amgn amgnVar2 = new defpackage.amgn("SHOW_AHEAD", 1);
        b = amgnVar2;
        defpackage.amgn amgnVar3 = new defpackage.amgn("UPDATETO_NOT_SET", 2);
        c = amgnVar3;
        d = new defpackage.amgn[]{amgnVar, amgnVar2, amgnVar3};
    }

    public static defpackage.amgn a(int i) {
        if (i == 0) {
            return c;
        }
        if (i == 2) {
            return a;
        }
        if (i != 3) {
            return null;
        }
        return b;
    }

    public static defpackage.amgn[] values() {
        return (defpackage.amgn[]) d.clone();
    }
}
