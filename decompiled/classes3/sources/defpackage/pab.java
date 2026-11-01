package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class pab {
    public static final defpackage.pab a;
    public static final defpackage.pab b;
    public static final defpackage.pab c;
    private static final /* synthetic */ defpackage.pab[] d;

    static {
        defpackage.pab pabVar = new defpackage.pab("UNKNOWN", 0);
        a = pabVar;
        defpackage.pab pabVar2 = new defpackage.pab("FORCE_DARK", 1);
        b = pabVar2;
        defpackage.pab pabVar3 = new defpackage.pab("FOLLOW_ACTIVITY_THEME", 2);
        c = pabVar3;
        d = new defpackage.pab[]{pabVar, pabVar2, pabVar3};
    }

    public static defpackage.pab[] values() {
        return (defpackage.pab[]) d.clone();
    }
}
