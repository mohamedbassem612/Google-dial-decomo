package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class svr {
    public static final defpackage.svr a;
    public static final defpackage.svr b;
    public static final defpackage.svr c;
    private static final /* synthetic */ defpackage.svr[] d;

    static {
        defpackage.svr svrVar = new defpackage.svr("CALL_REJECTED", 0);
        a = svrVar;
        defpackage.svr svrVar2 = new defpackage.svr("CALL_NOT_ADDED", 1);
        b = svrVar2;
        defpackage.svr svrVar3 = new defpackage.svr("CALL_ENDED", 2);
        c = svrVar3;
        defpackage.svr[] svrVarArr = {svrVar, svrVar2, svrVar3};
        d = svrVarArr;
        ajsz.am(svrVarArr);
    }

    public static defpackage.svr[] values() {
        return (defpackage.svr[]) d.clone();
    }
}
