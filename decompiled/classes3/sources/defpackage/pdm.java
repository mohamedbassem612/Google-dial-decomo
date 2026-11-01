package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class pdm {
    public static final defpackage.pdm a;
    public static final defpackage.pdm b;
    public static final defpackage.pdm c;
    private static final /* synthetic */ defpackage.pdm[] d;

    static {
        defpackage.pdm pdmVar = new defpackage.pdm("SMALL", 0);
        a = pdmVar;
        defpackage.pdm pdmVar2 = new defpackage.pdm("MEDIUM", 1);
        b = pdmVar2;
        defpackage.pdm pdmVar3 = new defpackage.pdm("LARGE", 2);
        c = pdmVar3;
        defpackage.pdm[] pdmVarArr = {pdmVar, pdmVar2, pdmVar3};
        d = pdmVarArr;
        ajsz.am(pdmVarArr);
    }

    public static defpackage.pdm[] values() {
        return (defpackage.pdm[]) d.clone();
    }
}
