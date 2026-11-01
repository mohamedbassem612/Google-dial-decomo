package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class scx {
    public static final defpackage.scx a;
    public static final defpackage.scx b;
    public static final defpackage.scx c;
    public static final defpackage.scx d;
    private static final /* synthetic */ defpackage.scx[] e;

    static {
        defpackage.scx scxVar = new defpackage.scx("VERIFICATION_UNKNOWN", 0);
        a = scxVar;
        defpackage.scx scxVar2 = new defpackage.scx("UNVERIFIED", 1);
        b = scxVar2;
        defpackage.scx scxVar3 = new defpackage.scx("VERIFIED_AND_FRESH", 2);
        c = scxVar3;
        defpackage.scx scxVar4 = new defpackage.scx("VERIFIED_BUT_STALE", 3);
        d = scxVar4;
        defpackage.scx[] scxVarArr = {scxVar, scxVar2, scxVar3, scxVar4};
        e = scxVarArr;
        ajsz.am(scxVarArr);
    }

    public static defpackage.scx[] values() {
        return (defpackage.scx[]) e.clone();
    }
}
