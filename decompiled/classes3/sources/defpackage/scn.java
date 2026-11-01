package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class scn {
    public static final defpackage.scn a;
    public static final defpackage.scn b;
    public static final defpackage.scn c;
    private static final /* synthetic */ defpackage.scn[] d;

    static {
        defpackage.scn scnVar = new defpackage.scn("SUCCESS", 0);
        a = scnVar;
        defpackage.scn scnVar2 = new defpackage.scn("INVALID_NUMBER", 1);
        b = scnVar2;
        defpackage.scn scnVar3 = new defpackage.scn("NO_MATCH", 2);
        c = scnVar3;
        defpackage.scn[] scnVarArr = {scnVar, scnVar2, scnVar3};
        d = scnVarArr;
        ajsz.am(scnVarArr);
    }

    public static defpackage.scn[] values() {
        return (defpackage.scn[]) d.clone();
    }
}
