package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class zeh {
    public static final defpackage.zeh a;
    public static final defpackage.zeh b;
    public static final defpackage.zeh c;
    public static final defpackage.zeh d;
    private static final /* synthetic */ defpackage.zeh[] e;

    static {
        defpackage.zeh zehVar = new defpackage.zeh("UNKNOWN", 0);
        a = zehVar;
        defpackage.zeh zehVar2 = new defpackage.zeh("HAS_CAPABILITY", 1);
        b = zehVar2;
        defpackage.zeh zehVar3 = new defpackage.zeh("NO_CAPABILITY", 2);
        c = zehVar3;
        defpackage.zeh zehVar4 = new defpackage.zeh("CAPABILITY_TO_BE_QUERIED", 3);
        d = zehVar4;
        defpackage.zeh[] zehVarArr = {zehVar, zehVar2, zehVar3, zehVar4};
        e = zehVarArr;
        ajsz.am(zehVarArr);
    }

    public static defpackage.zeh[] values() {
        return (defpackage.zeh[]) e.clone();
    }
}
