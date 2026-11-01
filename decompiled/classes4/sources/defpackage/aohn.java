package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
final class aohn {
    public static final defpackage.aohn a;
    public static final defpackage.aohn b;
    public static final defpackage.aohn c;
    private static final /* synthetic */ defpackage.aohn[] d;

    static {
        defpackage.aohn aohnVar = new defpackage.aohn("BLOCKING", 0);
        a = aohnVar;
        defpackage.aohn aohnVar2 = new defpackage.aohn("FUTURE", 1);
        b = aohnVar2;
        defpackage.aohn aohnVar3 = new defpackage.aohn("ASYNC", 2);
        c = aohnVar3;
        d = new defpackage.aohn[]{aohnVar, aohnVar2, aohnVar3};
    }

    public static defpackage.aohn[] values() {
        return (defpackage.aohn[]) d.clone();
    }
}
