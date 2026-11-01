package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ahpk {
    public static final defpackage.ahpk a;
    public static final defpackage.ahpk b;
    public static final defpackage.ahpk c;
    private static final /* synthetic */ defpackage.ahpk[] d;

    static {
        defpackage.ahpk ahpkVar = new defpackage.ahpk("DISABLED", 0);
        a = ahpkVar;
        defpackage.ahpk ahpkVar2 = new defpackage.ahpk("THROW_ON_FAILURE", 1);
        b = ahpkVar2;
        defpackage.ahpk ahpkVar3 = new defpackage.ahpk("LOG_ON_FAILURE", 2);
        c = ahpkVar3;
        d = new defpackage.ahpk[]{ahpkVar, ahpkVar2, ahpkVar3};
    }

    public static defpackage.ahpk[] values() {
        return (defpackage.ahpk[]) d.clone();
    }
}
