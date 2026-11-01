package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class gnh {
    public static final defpackage.gnh a;
    public static final defpackage.gnh b;
    public static final defpackage.gnh c;
    private static final /* synthetic */ defpackage.gnh[] d;

    static {
        defpackage.gnh gnhVar = new defpackage.gnh("STRICT", 0);
        a = gnhVar;
        defpackage.gnh gnhVar2 = new defpackage.gnh("LOG", 1);
        b = gnhVar2;
        defpackage.gnh gnhVar3 = new defpackage.gnh("QUIET", 2);
        c = gnhVar3;
        defpackage.gnh[] gnhVarArr = {gnhVar, gnhVar2, gnhVar3};
        d = gnhVarArr;
        defpackage.ajsz.am(gnhVarArr);
    }

    public static defpackage.gnh[] values() {
        return (defpackage.gnh[]) d.clone();
    }
}
