package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class lje {
    public static final defpackage.lje a;
    public static final defpackage.lje b;
    public static final defpackage.lje c;
    private static final /* synthetic */ defpackage.lje[] d;

    static {
        defpackage.lje ljeVar = new defpackage.lje("AVAILABLE", 0);
        a = ljeVar;
        defpackage.lje ljeVar2 = new defpackage.lje("UNAVAILABLE", 1);
        b = ljeVar2;
        defpackage.lje ljeVar3 = new defpackage.lje("TIMED_OUT", 2);
        c = ljeVar3;
        d = new defpackage.lje[]{ljeVar, ljeVar2, ljeVar3};
    }

    public static defpackage.lje[] values() {
        return (defpackage.lje[]) d.clone();
    }
}
