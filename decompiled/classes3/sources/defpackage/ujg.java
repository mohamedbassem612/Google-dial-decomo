package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ujg {
    public static final defpackage.ujg a;
    public static final defpackage.ujg b;
    public static final defpackage.ujg c;
    public static final defpackage.ujg d;
    private static final /* synthetic */ defpackage.ujg[] e;

    static {
        defpackage.ujg ujgVar = new defpackage.ujg("MISSING_CALL_LOG_PERMISSION", 0);
        a = ujgVar;
        defpackage.ujg ujgVar2 = new defpackage.ujg("SQLITE_ERROR", 1);
        b = ujgVar2;
        defpackage.ujg ujgVar3 = new defpackage.ujg("NOT_FETCHED_YET", 2);
        c = ujgVar3;
        defpackage.ujg ujgVar4 = new defpackage.ujg("UNKNOWN_CALLER_NUMBER", 3);
        d = ujgVar4;
        defpackage.ujg[] ujgVarArr = {ujgVar, ujgVar2, ujgVar3, ujgVar4};
        e = ujgVarArr;
        ajsz.am(ujgVarArr);
    }

    public static defpackage.ujg[] values() {
        return (defpackage.ujg[]) e.clone();
    }
}
