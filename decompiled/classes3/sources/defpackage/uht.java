package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class uht {
    public static final defpackage.uht a;
    public static final defpackage.uht b;
    public static final defpackage.uht c;
    public static final defpackage.uht d;
    private static final /* synthetic */ defpackage.uht[] e;

    static {
        defpackage.uht uhtVar = new defpackage.uht("DIRECT_BOOT", 0);
        a = uhtVar;
        defpackage.uht uhtVar2 = new defpackage.uht("INVALID_NUMBER", 1);
        b = uhtVar2;
        defpackage.uht uhtVar3 = new defpackage.uht("EXTERNAL_API", 2);
        c = uhtVar3;
        defpackage.uht uhtVar4 = new defpackage.uht("TIMEOUT", 3);
        d = uhtVar4;
        defpackage.uht[] uhtVarArr = {uhtVar, uhtVar2, uhtVar3, uhtVar4};
        e = uhtVarArr;
        ajsz.am(uhtVarArr);
    }

    public static defpackage.uht[] values() {
        return (defpackage.uht[]) e.clone();
    }
}
