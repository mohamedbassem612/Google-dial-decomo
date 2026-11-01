package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class poh {
    public static final defpackage.poh a;
    public static final defpackage.poh b;
    public static final defpackage.poh c;
    public static final defpackage.poh d;
    private static final /* synthetic */ defpackage.poh[] e;

    static {
        defpackage.poh pohVar = new defpackage.poh("UNKNOWN", 0);
        a = pohVar;
        defpackage.poh pohVar2 = new defpackage.poh("DEFAULT", 1);
        b = pohVar2;
        defpackage.poh pohVar3 = new defpackage.poh("SPAM", 2);
        c = pohVar3;
        defpackage.poh pohVar4 = new defpackage.poh("VIDEO", 3);
        d = pohVar4;
        defpackage.poh[] pohVarArr = {pohVar, pohVar2, pohVar3, pohVar4};
        e = pohVarArr;
        ajsz.am(pohVarArr);
    }

    public static defpackage.poh[] values() {
        return (defpackage.poh[]) e.clone();
    }
}
