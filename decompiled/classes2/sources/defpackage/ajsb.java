package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ajsb {
    public static final defpackage.ajsb a;
    public static final defpackage.ajsb b;
    public static final defpackage.ajsb c;
    private static final /* synthetic */ defpackage.ajsb[] d;

    static {
        defpackage.ajsb ajsbVar = new defpackage.ajsb("NIST_P256", 0);
        a = ajsbVar;
        defpackage.ajsb ajsbVar2 = new defpackage.ajsb("NIST_P384", 1);
        b = ajsbVar2;
        defpackage.ajsb ajsbVar3 = new defpackage.ajsb("NIST_P521", 2);
        c = ajsbVar3;
        d = new defpackage.ajsb[]{ajsbVar, ajsbVar2, ajsbVar3};
    }

    public static defpackage.ajsb[] values() {
        return (defpackage.ajsb[]) d.clone();
    }
}
