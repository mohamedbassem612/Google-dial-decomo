package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class uhu {
    public static final defpackage.uhu a;
    public static final defpackage.uhu b;
    public static final defpackage.uhu c;
    private static final /* synthetic */ defpackage.uhu[] d;

    static {
        defpackage.uhu uhuVar = new defpackage.uhu("DANGEROUS", 0);
        a = uhuVar;
        defpackage.uhu uhuVar2 = new defpackage.uhu("SUSPICIOUS", 1);
        b = uhuVar2;
        defpackage.uhu uhuVar3 = new defpackage.uhu("NONE", 2);
        c = uhuVar3;
        defpackage.uhu[] uhuVarArr = {uhuVar, uhuVar2, uhuVar3};
        d = uhuVarArr;
        ajsz.am(uhuVarArr);
    }

    public static defpackage.uhu[] values() {
        return (defpackage.uhu[]) d.clone();
    }
}
