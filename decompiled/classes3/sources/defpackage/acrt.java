package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class acrt {
    public static final defpackage.acrt a;
    public static final defpackage.acrt b;
    public static final defpackage.acrt c;
    private static final /* synthetic */ defpackage.acrt[] d;

    static {
        defpackage.acrt acrtVar = new defpackage.acrt("Fixed", 0);
        a = acrtVar;
        defpackage.acrt acrtVar2 = new defpackage.acrt("Continuous", 1);
        b = acrtVar2;
        defpackage.acrt acrtVar3 = new defpackage.acrt("Oscillating", 2);
        c = acrtVar3;
        defpackage.acrt[] acrtVarArr = {acrtVar, acrtVar2, acrtVar3};
        d = acrtVarArr;
        ajsz.am(acrtVarArr);
    }

    public static defpackage.acrt[] values() {
        return (defpackage.acrt[]) d.clone();
    }
}
