package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class tiy {
    public static final defpackage.tiy a;
    public static final defpackage.tiy b;
    public static final defpackage.tiy c;
    public static final defpackage.tiy d;
    private static final /* synthetic */ defpackage.tiy[] e;

    static {
        defpackage.tiy tiyVar = new defpackage.tiy("RTT_CALL", 0);
        a = tiyVar;
        defpackage.tiy tiyVar2 = new defpackage.tiy("VIDEO_CALL", 1);
        b = tiyVar2;
        defpackage.tiy tiyVar3 = new defpackage.tiy("SEND_MESSAGE", 2);
        c = tiyVar3;
        defpackage.tiy tiyVar4 = new defpackage.tiy("OPEN_HISTORY", 3);
        d = tiyVar4;
        e = new defpackage.tiy[]{tiyVar, tiyVar2, tiyVar3, tiyVar4};
    }

    public static defpackage.tiy[] values() {
        return (defpackage.tiy[]) e.clone();
    }
}
