package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class hxe {
    public static final defpackage.hxe a;
    public static final defpackage.hxe b;
    public static final defpackage.hxe c;
    public static final defpackage.hxe d;
    private static final /* synthetic */ defpackage.hxe[] e;

    static {
        defpackage.hxe hxeVar = new defpackage.hxe("COMPLETED", 0);
        a = hxeVar;
        defpackage.hxe hxeVar2 = new defpackage.hxe("CANCELED", 1);
        b = hxeVar2;
        defpackage.hxe hxeVar3 = new defpackage.hxe("FAILED", 2);
        c = hxeVar3;
        defpackage.hxe hxeVar4 = new defpackage.hxe("MUTED", 3);
        d = hxeVar4;
        e = new defpackage.hxe[]{hxeVar, hxeVar2, hxeVar3, hxeVar4};
    }

    public static defpackage.hxe[] values() {
        return (defpackage.hxe[]) e.clone();
    }
}
