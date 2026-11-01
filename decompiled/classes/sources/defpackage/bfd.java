package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class bfd {
    public static final defpackage.bfd a;
    public static final defpackage.bfd b;
    public static final defpackage.bfd c;
    public static final defpackage.bfd d;
    public static final defpackage.bfd e;
    private static final /* synthetic */ defpackage.bfd[] f;

    static {
        defpackage.bfd bfdVar = new defpackage.bfd("New", 0);
        a = bfdVar;
        defpackage.bfd bfdVar2 = new defpackage.bfd("Placed", 1);
        b = bfdVar2;
        defpackage.bfd bfdVar3 = new defpackage.bfd("Entering", 2);
        c = bfdVar3;
        defpackage.bfd bfdVar4 = new defpackage.bfd("Exiting", 3);
        d = bfdVar4;
        defpackage.bfd bfdVar5 = new defpackage.bfd("Finished", 4);
        e = bfdVar5;
        defpackage.bfd[] bfdVarArr = {bfdVar, bfdVar2, bfdVar3, bfdVar4, bfdVar5};
        f = bfdVarArr;
        defpackage.ajsz.am(bfdVarArr);
    }

    public static defpackage.bfd[] values() {
        return (defpackage.bfd[]) f.clone();
    }
}
