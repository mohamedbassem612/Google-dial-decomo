package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class anvq {
    public static final defpackage.anvq a;
    public static final defpackage.anvq b;
    public static final defpackage.anvq c;
    public static final defpackage.anvq d;
    private static final /* synthetic */ defpackage.anvq[] e;

    static {
        defpackage.anvq anvqVar = new defpackage.anvq("PROCESSED", 0);
        a = anvqVar;
        defpackage.anvq anvqVar2 = new defpackage.anvq("REFUSED", 1);
        b = anvqVar2;
        defpackage.anvq anvqVar3 = new defpackage.anvq("DROPPED", 2);
        c = anvqVar3;
        defpackage.anvq anvqVar4 = new defpackage.anvq("MISCARRIED", 3);
        d = anvqVar4;
        e = new defpackage.anvq[]{anvqVar, anvqVar2, anvqVar3, anvqVar4};
    }

    public static defpackage.anvq[] values() {
        return (defpackage.anvq[]) e.clone();
    }
}
