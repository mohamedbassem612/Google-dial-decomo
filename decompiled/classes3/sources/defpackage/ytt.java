package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ytt {
    public static final defpackage.ytt a;
    public static final defpackage.ytt b;
    public static final defpackage.ytt c;
    private static final /* synthetic */ defpackage.ytt[] d;

    static {
        defpackage.ytt yttVar = new defpackage.ytt("GET_FEATURE_FAILED", 0);
        a = yttVar;
        defpackage.ytt yttVar2 = new defpackage.ytt("FEATURE_TYPE_MISMATCH", 1);
        b = yttVar2;
        defpackage.ytt yttVar3 = new defpackage.ytt("ENGINE_PREPARATION_FAILED", 2);
        c = yttVar3;
        defpackage.ytt[] yttVarArr = {yttVar, yttVar2, yttVar3};
        d = yttVarArr;
        ajsz.am(yttVarArr);
    }

    public static defpackage.ytt[] values() {
        return (defpackage.ytt[]) d.clone();
    }
}
