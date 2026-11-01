package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class afr {
    public static final defpackage.afr a;
    public static final defpackage.afr b;
    public static final defpackage.afr c;
    private static final /* synthetic */ defpackage.afr[] d;

    static {
        defpackage.afr afrVar = new defpackage.afr("PreEnter", 0);
        a = afrVar;
        defpackage.afr afrVar2 = new defpackage.afr("Visible", 1);
        b = afrVar2;
        defpackage.afr afrVar3 = new defpackage.afr("PostExit", 2);
        c = afrVar3;
        defpackage.afr[] afrVarArr = {afrVar, afrVar2, afrVar3};
        d = afrVarArr;
        defpackage.ajsz.am(afrVarArr);
    }

    public static defpackage.afr[] values() {
        return (defpackage.afr[]) d.clone();
    }
}
