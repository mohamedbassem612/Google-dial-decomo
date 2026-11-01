package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class xuc {
    public static final defpackage.xuc a;
    public static final defpackage.xuc b;
    public static final defpackage.xuc c;
    public static final defpackage.xuc d;
    public static final defpackage.xuc e;
    private static final /* synthetic */ defpackage.xuc[] f;

    static {
        defpackage.xuc xucVar = new defpackage.xuc("LOCAL", 0);
        a = xucVar;
        defpackage.xuc xucVar2 = new defpackage.xuc("REMOTE", 1);
        b = xucVar2;
        defpackage.xuc xucVar3 = new defpackage.xuc("DATA_DISK_CACHE", 2);
        c = xucVar3;
        defpackage.xuc xucVar4 = new defpackage.xuc("RESOURCE_DISK_CACHE", 3);
        d = xucVar4;
        defpackage.xuc xucVar5 = new defpackage.xuc("MEMORY_CACHE", 4);
        e = xucVar5;
        f = new defpackage.xuc[]{xucVar, xucVar2, xucVar3, xucVar4, xucVar5};
    }

    public static defpackage.xuc[] values() {
        return (defpackage.xuc[]) f.clone();
    }
}
