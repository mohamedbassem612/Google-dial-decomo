package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class qzp {
    public static final defpackage.qzp a;
    public static final defpackage.qzp b;
    public static final defpackage.qzp c;
    private static final /* synthetic */ defpackage.qzp[] d;

    static {
        defpackage.qzp qzpVar = new defpackage.qzp("FEATURE_ACTIVATED", 0);
        a = qzpVar;
        defpackage.qzp qzpVar2 = new defpackage.qzp("PROMO_DISMISSED", 1);
        b = qzpVar2;
        defpackage.qzp qzpVar3 = new defpackage.qzp("PROMO_IGNORED", 2);
        c = qzpVar3;
        defpackage.qzp[] qzpVarArr = {qzpVar, qzpVar2, qzpVar3};
        d = qzpVarArr;
        ajsz.am(qzpVarArr);
    }

    public static defpackage.qzp[] values() {
        return (defpackage.qzp[]) d.clone();
    }
}
