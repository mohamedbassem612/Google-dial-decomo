package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class anpj {
    public static final defpackage.anpj a;
    public static final defpackage.anpj b;
    public static final defpackage.anpj c;
    public static final defpackage.anpj d;
    public static final defpackage.anpj e;
    private static final /* synthetic */ defpackage.anpj[] f;

    static {
        defpackage.anpj anpjVar = new defpackage.anpj("UNARY", 0);
        a = anpjVar;
        defpackage.anpj anpjVar2 = new defpackage.anpj("CLIENT_STREAMING", 1);
        b = anpjVar2;
        defpackage.anpj anpjVar3 = new defpackage.anpj("SERVER_STREAMING", 2);
        c = anpjVar3;
        defpackage.anpj anpjVar4 = new defpackage.anpj("BIDI_STREAMING", 3);
        d = anpjVar4;
        defpackage.anpj anpjVar5 = new defpackage.anpj("UNKNOWN", 4);
        e = anpjVar5;
        f = new defpackage.anpj[]{anpjVar, anpjVar2, anpjVar3, anpjVar4, anpjVar5};
    }

    public static defpackage.anpj[] values() {
        return (defpackage.anpj[]) f.clone();
    }

    public final boolean a() {
        return this == a || this == c;
    }

    public final boolean b() {
        return this == a || this == b;
    }
}
