package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class qdn {
    public static final defpackage.qdn a;
    public static final defpackage.qdn b;
    public static final defpackage.qdn c;
    private static final /* synthetic */ defpackage.qdn[] d;

    static {
        defpackage.qdn qdnVar = new defpackage.qdn("UNKNOWN", 0);
        a = qdnVar;
        defpackage.qdn qdnVar2 = new defpackage.qdn("VERTICAL", 1);
        b = qdnVar2;
        defpackage.qdn qdnVar3 = new defpackage.qdn("HORIZONTAL", 2);
        c = qdnVar3;
        d = new defpackage.qdn[]{qdnVar, qdnVar2, qdnVar3};
    }

    public static defpackage.qdn[] values() {
        return (defpackage.qdn[]) d.clone();
    }
}
