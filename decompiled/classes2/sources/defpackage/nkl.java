package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class nkl {
    public static final defpackage.nkl a;
    public static final defpackage.nkl b;
    public static final defpackage.nkl c;
    public static final defpackage.nkl d;
    public static final /* synthetic */ aomi e;
    private static final /* synthetic */ defpackage.nkl[] f;

    static {
        defpackage.nkl nklVar = new defpackage.nkl("ASK_WHO_CALLING", 0);
        a = nklVar;
        defpackage.nkl nklVar2 = new defpackage.nkl("ASK_WHY_CALLING", 1);
        b = nklVar2;
        defpackage.nkl nklVar3 = new defpackage.nkl("CONNECT_TO_USER", 2);
        c = nklVar3;
        defpackage.nkl nklVar4 = new defpackage.nkl("UNKNOWN", 3);
        d = nklVar4;
        defpackage.nkl[] nklVarArr = {nklVar, nklVar2, nklVar3, nklVar4};
        f = nklVarArr;
        e = ajsz.am(nklVarArr);
    }

    public static defpackage.nkl[] values() {
        return (defpackage.nkl[]) f.clone();
    }
}
