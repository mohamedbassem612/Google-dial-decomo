package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class teo {
    public static final defpackage.teo a;
    public static final defpackage.teo b;
    public static final defpackage.teo c;
    public static final defpackage.teo d;
    public static final defpackage.teo e;
    private static final /* synthetic */ defpackage.teo[] f;

    static {
        defpackage.teo teoVar = new defpackage.teo("TIME_KEEPER", 0);
        a = teoVar;
        defpackage.teo teoVar2 = new defpackage.teo("CONTACTS", 1);
        b = teoVar2;
        defpackage.teo teoVar3 = new defpackage.teo("CALL_LOG", 2);
        c = teoVar3;
        defpackage.teo teoVar4 = new defpackage.teo("SUGGESTED_CONTACTS", 3);
        d = teoVar4;
        defpackage.teo teoVar5 = new defpackage.teo("EXTENDED_DIRECTORY", 4);
        e = teoVar5;
        defpackage.teo[] teoVarArr = {teoVar, teoVar2, teoVar3, teoVar4, teoVar5};
        f = teoVarArr;
        ajsz.am(teoVarArr);
    }

    public static defpackage.teo[] values() {
        return (defpackage.teo[]) f.clone();
    }
}
