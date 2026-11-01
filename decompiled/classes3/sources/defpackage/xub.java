package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class xub {
    public static final defpackage.xub a;
    public static final defpackage.xub b;
    public static final defpackage.xub c;
    public static final defpackage.xub d;
    private static final /* synthetic */ defpackage.xub[] e;

    static {
        defpackage.xub xubVar = new defpackage.xub("CLEARED", 0);
        a = xubVar;
        defpackage.xub xubVar2 = new defpackage.xub("RUNNING", 1);
        b = xubVar2;
        defpackage.xub xubVar3 = new defpackage.xub("SUCCEEDED", 2);
        c = xubVar3;
        defpackage.xub xubVar4 = new defpackage.xub("FAILED", 3);
        d = xubVar4;
        defpackage.xub[] xubVarArr = {xubVar, xubVar2, xubVar3, xubVar4};
        e = xubVarArr;
        ajsz.am(xubVarArr);
    }

    public static defpackage.xub[] values() {
        return (defpackage.xub[]) e.clone();
    }
}
