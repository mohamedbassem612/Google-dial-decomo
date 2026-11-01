package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class vry {
    public static final defpackage.vry a;
    public static final defpackage.vry b;
    public static final defpackage.vry c;
    private static final /* synthetic */ defpackage.vry[] d;

    static {
        defpackage.vry vryVar = new defpackage.vry("VVM_CAPABLE", 0);
        a = vryVar;
        defpackage.vry vryVar2 = new defpackage.vry("NOT_DEFAULT_DATA_SIM", 1);
        b = vryVar2;
        defpackage.vry vryVar3 = new defpackage.vry("EXIST_FI_ACCOUNT", 2);
        c = vryVar3;
        d = new defpackage.vry[]{vryVar, vryVar2, vryVar3};
    }

    public static defpackage.vry[] values() {
        return (defpackage.vry[]) d.clone();
    }
}
