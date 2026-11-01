package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class vjb {
    public static final defpackage.vjb a;
    public static final defpackage.vjb b;
    public static final defpackage.vjb c;
    public static final defpackage.vjb d;
    private static final /* synthetic */ defpackage.vjb[] e;

    static {
        defpackage.vjb vjbVar = new defpackage.vjb("NEED_TO_INITIAL_MAILBOX", 0);
        a = vjbVar;
        defpackage.vjb vjbVar2 = new defpackage.vjb("NEED_TO_SUBSCRIBE", 1);
        b = vjbVar2;
        defpackage.vjb vjbVar3 = new defpackage.vjb("NEED_TO_DISABLE_VVM", 2);
        c = vjbVar3;
        defpackage.vjb vjbVar4 = new defpackage.vjb("PROVISIONING_NOT_REQUIRED", 3);
        d = vjbVar4;
        e = new defpackage.vjb[]{vjbVar, vjbVar2, vjbVar3, vjbVar4};
    }

    public static defpackage.vjb[] values() {
        return (defpackage.vjb[]) e.clone();
    }
}
