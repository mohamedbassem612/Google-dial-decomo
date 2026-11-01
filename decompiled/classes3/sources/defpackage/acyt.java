package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class acyt {
    public static final defpackage.acyt a;
    public static final defpackage.acyt b;
    public static final defpackage.acyt c;
    public static final defpackage.acyt d;
    private static final /* synthetic */ defpackage.acyt[] e;

    static {
        defpackage.acyt acytVar = new defpackage.acyt("PENDING", 0);
        a = acytVar;
        defpackage.acyt acytVar2 = new defpackage.acyt("DOWNLOADED", 1);
        b = acytVar2;
        defpackage.acyt acytVar3 = new defpackage.acyt("FAILED", 2);
        c = acytVar3;
        defpackage.acyt acytVar4 = new defpackage.acyt("UNKNOWN", 3);
        d = acytVar4;
        e = new defpackage.acyt[]{acytVar, acytVar2, acytVar3, acytVar4};
    }

    public static defpackage.acyt[] values() {
        return (defpackage.acyt[]) e.clone();
    }
}
