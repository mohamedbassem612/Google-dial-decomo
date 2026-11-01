package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class jha {
    public static final defpackage.jha a;
    public static final defpackage.jha b;
    public static final defpackage.jha c;
    private static final /* synthetic */ defpackage.jha[] d;

    static {
        defpackage.jha jhaVar = new defpackage.jha("NO_CHANGE", 0);
        a = jhaVar;
        defpackage.jha jhaVar2 = new defpackage.jha("CHANGE_REQUIRES_UI_UPDATE", 1);
        b = jhaVar2;
        defpackage.jha jhaVar3 = new defpackage.jha("CHANGE_DOES_NOT_REQUIRE_UI_UPDATE", 2);
        c = jhaVar3;
        defpackage.jha[] jhaVarArr = {jhaVar, jhaVar2, jhaVar3};
        d = jhaVarArr;
        ajsz.am(jhaVarArr);
    }

    public static defpackage.jha[] values() {
        return (defpackage.jha[]) d.clone();
    }
}
