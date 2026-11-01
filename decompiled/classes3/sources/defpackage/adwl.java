package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class adwl {
    public static final defpackage.adwl a;
    public static final defpackage.adwl b;
    public static final defpackage.adwl c;
    private static final /* synthetic */ defpackage.adwl[] d;

    static {
        defpackage.adwl adwlVar = new defpackage.adwl("INVALID", 0);
        a = adwlVar;
        defpackage.adwl adwlVar2 = new defpackage.adwl("SYSTEM_TRAY", 1);
        b = adwlVar2;
        defpackage.adwl adwlVar3 = new defpackage.adwl("IN_APP", 2);
        c = adwlVar3;
        defpackage.adwl[] adwlVarArr = {adwlVar, adwlVar2, adwlVar3};
        d = adwlVarArr;
        ajsz.am(adwlVarArr);
    }

    public static defpackage.adwl[] values() {
        return (defpackage.adwl[]) d.clone();
    }
}
