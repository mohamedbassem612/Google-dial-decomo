package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class puy {
    public static final defpackage.puy a;
    public static final defpackage.puy b;
    public static final defpackage.puy c;
    public static final defpackage.puy d;
    public static final defpackage.puy e;
    private static final /* synthetic */ defpackage.puy[] f;

    static {
        defpackage.puy puyVar = new defpackage.puy("EMPTY", 0);
        a = puyVar;
        defpackage.puy puyVar2 = new defpackage.puy("FAIL", 1);
        b = puyVar2;
        defpackage.puy puyVar3 = new defpackage.puy("INVALID", 2);
        c = puyVar3;
        defpackage.puy puyVar4 = new defpackage.puy("TIMEOUT", 3);
        d = puyVar4;
        defpackage.puy puyVar5 = new defpackage.puy("REJECTED", 4);
        e = puyVar5;
        f = new defpackage.puy[]{puyVar, puyVar2, puyVar3, puyVar4, puyVar5};
    }

    public static defpackage.puy[] values() {
        return (defpackage.puy[]) f.clone();
    }
}
