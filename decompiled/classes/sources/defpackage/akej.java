package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class akej {
    public static final defpackage.akej a;
    public static final defpackage.akej b;
    public static final defpackage.akej c;
    private static final /* synthetic */ defpackage.akej[] d;

    static {
        defpackage.akej akejVar = new defpackage.akej("LENIENT", 0);
        a = akejVar;
        defpackage.akej akejVar2 = new defpackage.akej("LEGACY_STRICT", 1);
        b = akejVar2;
        defpackage.akej akejVar3 = new defpackage.akej("STRICT", 2);
        c = akejVar3;
        d = new defpackage.akej[]{akejVar, akejVar2, akejVar3};
    }

    public static defpackage.akej[] values() {
        return (defpackage.akej[]) d.clone();
    }
}
