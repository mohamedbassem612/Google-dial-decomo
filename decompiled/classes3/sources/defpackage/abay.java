package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class abay {
    public static final defpackage.abay a;
    public static final defpackage.abay b;
    public static final defpackage.abay c;
    public static final defpackage.abay d;
    private static final /* synthetic */ defpackage.abay[] e;

    static {
        defpackage.abay abayVar = new defpackage.abay("UNSPECIFIED", 0);
        a = abayVar;
        defpackage.abay abayVar2 = new defpackage.abay("JNI", 1);
        b = abayVar2;
        defpackage.abay abayVar3 = new defpackage.abay("PKVM", 2);
        c = abayVar3;
        defpackage.abay abayVar4 = new defpackage.abay("ISOLATED_PROCESS", 3);
        d = abayVar4;
        defpackage.abay[] abayVarArr = {abayVar, abayVar2, abayVar3, abayVar4};
        e = abayVarArr;
        ajsz.am(abayVarArr);
    }

    public static defpackage.abay[] values() {
        return (defpackage.abay[]) e.clone();
    }
}
