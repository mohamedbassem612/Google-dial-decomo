package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class afja {
    public static final defpackage.afja a;
    public static final defpackage.afja b;
    private static final /* synthetic */ defpackage.afja[] c;

    static {
        defpackage.afja afjaVar = new defpackage.afja("FIRST_CARD_MODAL", 0);
        a = afjaVar;
        defpackage.afja afjaVar2 = new defpackage.afja("FIRST_CARD_NON_MODAL", 1);
        b = afjaVar2;
        c = new defpackage.afja[]{afjaVar, afjaVar2};
    }

    public static defpackage.afja[] values() {
        return (defpackage.afja[]) c.clone();
    }
}
