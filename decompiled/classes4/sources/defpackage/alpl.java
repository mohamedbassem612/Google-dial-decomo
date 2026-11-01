package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class alpl {
    public static final defpackage.alpl a;
    public static final defpackage.alpl b;
    private static final /* synthetic */ defpackage.alpl[] c;

    static {
        defpackage.alpl alplVar = new defpackage.alpl("AVAILABLE", 0);
        a = alplVar;
        defpackage.alpl alplVar2 = new defpackage.alpl("DOWNLOADABLE", 1);
        b = alplVar2;
        c = new defpackage.alpl[]{alplVar, alplVar2};
    }

    public static defpackage.alpl[] values() {
        return (defpackage.alpl[]) c.clone();
    }
}
