package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aduw {
    public static final defpackage.aduw a;
    public static final defpackage.aduw b;
    public static final defpackage.aduw c;
    private static final /* synthetic */ defpackage.aduw[] d;

    static {
        defpackage.aduw aduwVar = new defpackage.aduw("FCM", 0);
        a = aduwVar;
        defpackage.aduw aduwVar2 = new defpackage.aduw("FCM_AND_FETCH", 1);
        b = aduwVar2;
        defpackage.aduw aduwVar3 = new defpackage.aduw("FETCH_ONLY", 2);
        c = aduwVar3;
        defpackage.aduw[] aduwVarArr = {aduwVar, aduwVar2, aduwVar3};
        d = aduwVarArr;
        defpackage.ajsz.am(aduwVarArr);
    }

    public static defpackage.aduw[] values() {
        return (defpackage.aduw[]) d.clone();
    }

    public final boolean a() {
        return this == a || this == b;
    }

    public final boolean b() {
        return this == c || this == b;
    }
}
