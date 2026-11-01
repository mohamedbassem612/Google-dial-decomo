package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class txd {
    public static final defpackage.txd a;
    public static final defpackage.txd b;
    public static final defpackage.txd c;
    private static final /* synthetic */ defpackage.txd[] d;

    static {
        defpackage.txd txdVar = new defpackage.txd("OFFLINE_SUPPORTED", 0);
        a = txdVar;
        defpackage.txd txdVar2 = new defpackage.txd("OFFLINE_AVAILABLE", 1);
        b = txdVar2;
        defpackage.txd txdVar3 = new defpackage.txd("OFFLINE_PENDING", 2);
        c = txdVar3;
        defpackage.txd[] txdVarArr = {txdVar, txdVar2, txdVar3};
        d = txdVarArr;
        defpackage.ajsz.am(txdVarArr);
    }

    public static defpackage.txd[] values() {
        return (defpackage.txd[]) d.clone();
    }
}
