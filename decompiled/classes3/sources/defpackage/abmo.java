package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class abmo {
    public static final defpackage.abmo a;
    public static final defpackage.abmo b;
    public static final defpackage.abmo c;
    public static final defpackage.abmo d;
    private static final /* synthetic */ defpackage.abmo[] e;

    static {
        defpackage.abmo abmoVar = new defpackage.abmo("Hidden", 0);
        a = abmoVar;
        defpackage.abmo abmoVar2 = new defpackage.abmo("Entry", 1);
        b = abmoVar2;
        defpackage.abmo abmoVar3 = new defpackage.abmo("Loop", 2);
        c = abmoVar3;
        defpackage.abmo abmoVar4 = new defpackage.abmo("Exit", 3);
        d = abmoVar4;
        defpackage.abmo[] abmoVarArr = {abmoVar, abmoVar2, abmoVar3, abmoVar4};
        e = abmoVarArr;
        ajsz.am(abmoVarArr);
    }

    public static defpackage.abmo[] values() {
        return (defpackage.abmo[]) e.clone();
    }
}
