package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class akfo {
    public static final defpackage.akfo a;
    public static final defpackage.akfo b;
    public static final defpackage.akfo c;
    public static final defpackage.akfo d;
    public static final defpackage.akfo e;
    private static final /* synthetic */ defpackage.akfo[] f;

    static {
        defpackage.akfo akfoVar = new defpackage.akfo("INVALID_COUNTRY_CODE", 0);
        a = akfoVar;
        defpackage.akfo akfoVar2 = new defpackage.akfo("NOT_A_NUMBER", 1);
        b = akfoVar2;
        defpackage.akfo akfoVar3 = new defpackage.akfo("TOO_SHORT_AFTER_IDD", 2);
        c = akfoVar3;
        defpackage.akfo akfoVar4 = new defpackage.akfo("TOO_SHORT_NSN", 3);
        d = akfoVar4;
        defpackage.akfo akfoVar5 = new defpackage.akfo("TOO_LONG", 4);
        e = akfoVar5;
        f = new defpackage.akfo[]{akfoVar, akfoVar2, akfoVar3, akfoVar4, akfoVar5};
    }

    public static defpackage.akfo[] values() {
        return (defpackage.akfo[]) f.clone();
    }
}
