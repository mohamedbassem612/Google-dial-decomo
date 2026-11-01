package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class afkc {
    public static final defpackage.afkc a;
    public static final defpackage.afkc b;
    public static final defpackage.afkc c;
    public static final defpackage.afkc d;
    private static final /* synthetic */ defpackage.afkc[] e;

    static {
        defpackage.afkc afkcVar = new defpackage.afkc("LEFT", 0);
        a = afkcVar;
        defpackage.afkc afkcVar2 = new defpackage.afkc("RIGHT", 1);
        b = afkcVar2;
        defpackage.afkc afkcVar3 = new defpackage.afkc("TOP", 2);
        c = afkcVar3;
        defpackage.afkc afkcVar4 = new defpackage.afkc("BOTTOM", 3);
        d = afkcVar4;
        defpackage.afkc[] afkcVarArr = {afkcVar, afkcVar2, afkcVar3, afkcVar4};
        e = afkcVarArr;
        ajsz.am(afkcVarArr);
    }

    public static defpackage.afkc[] values() {
        return (defpackage.afkc[]) e.clone();
    }
}
