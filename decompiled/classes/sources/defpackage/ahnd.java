package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ahnd {
    public static final defpackage.ahnd a;
    public static final defpackage.ahnd b;
    public static final defpackage.ahnd c;
    public static final defpackage.ahnd d;
    private static final /* synthetic */ defpackage.ahnd[] e;

    static {
        defpackage.ahnd ahndVar = new defpackage.ahnd("MANUAL_PROPAGATION", 0);
        a = ahndVar;
        defpackage.ahnd ahndVar2 = new defpackage.ahnd("EXECUTOR_TRACE", 1);
        b = ahndVar2;
        defpackage.ahnd ahndVar3 = new defpackage.ahnd("SKIP_TRACE", 2);
        c = ahndVar3;
        defpackage.ahnd ahndVar4 = new defpackage.ahnd("NOT_USING_MANUAL_PROPAGATION", 3);
        d = ahndVar4;
        e = new defpackage.ahnd[]{ahndVar, ahndVar2, ahndVar3, ahndVar4};
    }

    public static defpackage.ahnd[] values() {
        return (defpackage.ahnd[]) e.clone();
    }
}
