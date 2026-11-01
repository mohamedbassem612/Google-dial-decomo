package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class hwy {
    public static final defpackage.hwy a;
    public static final defpackage.hwy b;
    public static final defpackage.hwy c;
    public static final defpackage.hwy d;
    public static final defpackage.hwy e;
    private static final /* synthetic */ defpackage.hwy[] f;

    static {
        defpackage.hwy hwyVar = new defpackage.hwy("PSTN", 0);
        a = hwyVar;
        defpackage.hwy hwyVar2 = new defpackage.hwy("VOIP", 1);
        b = hwyVar2;
        defpackage.hwy hwyVar3 = new defpackage.hwy("STUB_8K", 2);
        c = hwyVar3;
        defpackage.hwy hwyVar4 = new defpackage.hwy("STUB_16K", 3);
        d = hwyVar4;
        defpackage.hwy hwyVar5 = new defpackage.hwy("SIMULATOR", 4);
        e = hwyVar5;
        f = new defpackage.hwy[]{hwyVar, hwyVar2, hwyVar3, hwyVar4, hwyVar5};
    }

    public static defpackage.hwy[] values() {
        return (defpackage.hwy[]) f.clone();
    }
}
