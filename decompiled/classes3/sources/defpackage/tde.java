package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class tde {
    public static final defpackage.tde a;
    public static final defpackage.tde b;
    public static final defpackage.tde c;
    public static final defpackage.tde d;
    private static final /* synthetic */ defpackage.tde[] e;

    static {
        defpackage.tde tdeVar = new defpackage.tde("OFF", 0);
        a = tdeVar;
        defpackage.tde tdeVar2 = new defpackage.tde("FULL", 1);
        b = tdeVar2;
        defpackage.tde tdeVar3 = new defpackage.tde("HCO", 2);
        c = tdeVar3;
        defpackage.tde tdeVar4 = new defpackage.tde("VCO", 3);
        d = tdeVar4;
        e = new defpackage.tde[]{tdeVar, tdeVar2, tdeVar3, tdeVar4};
    }

    public static defpackage.tde[] values() {
        return (defpackage.tde[]) e.clone();
    }
}
