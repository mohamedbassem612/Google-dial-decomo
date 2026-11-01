package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class agix {
    public static final defpackage.agix a;
    public static final defpackage.agix b;
    private static final /* synthetic */ defpackage.agix[] c;

    static {
        defpackage.agix agixVar = new defpackage.agix("MOBILE", 0);
        a = agixVar;
        defpackage.agix agixVar2 = new defpackage.agix("DESKTOP", 1);
        b = agixVar2;
        defpackage.agix[] agixVarArr = {agixVar, agixVar2};
        c = agixVarArr;
        ajsz.am(agixVarArr);
    }

    public static defpackage.agix[] values() {
        return (defpackage.agix[]) c.clone();
    }
}
