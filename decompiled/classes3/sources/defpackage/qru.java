package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class qru {
    public static final defpackage.qru a;
    public static final defpackage.qru b;
    private static final /* synthetic */ defpackage.qru[] c;

    static {
        defpackage.qru qruVar = new defpackage.qru("PORTRAIT", 0);
        a = qruVar;
        defpackage.qru qruVar2 = new defpackage.qru("LANDSCAPE", 1);
        b = qruVar2;
        c = new defpackage.qru[]{qruVar, qruVar2};
    }

    public static defpackage.qru[] values() {
        return (defpackage.qru[]) c.clone();
    }
}
