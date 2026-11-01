package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class abgy {
    public static final defpackage.abgy a;
    public static final defpackage.abgy b;
    public static final defpackage.abgy c;
    private static final /* synthetic */ defpackage.abgy[] d;

    static {
        defpackage.abgy abgyVar = new defpackage.abgy("Decline", 0);
        a = abgyVar;
        defpackage.abgy abgyVar2 = new defpackage.abgy("Center", 1);
        b = abgyVar2;
        defpackage.abgy abgyVar3 = new defpackage.abgy("Answer", 2);
        c = abgyVar3;
        defpackage.abgy[] abgyVarArr = {abgyVar, abgyVar2, abgyVar3};
        d = abgyVarArr;
        ajsz.am(abgyVarArr);
    }

    public static defpackage.abgy[] values() {
        return (defpackage.abgy[]) d.clone();
    }
}
