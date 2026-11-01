package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class zmy {
    public static final defpackage.zmy a;
    public static final defpackage.zmy b;
    public static final defpackage.zmy c;
    private static final /* synthetic */ defpackage.zmy[] d;

    static {
        defpackage.zmy zmyVar = new defpackage.zmy("INCOMING", 0);
        a = zmyVar;
        defpackage.zmy zmyVar2 = new defpackage.zmy("OUTGOING", 1);
        b = zmyVar2;
        defpackage.zmy zmyVar3 = new defpackage.zmy("UNKNOWN", 2);
        c = zmyVar3;
        d = new defpackage.zmy[]{zmyVar, zmyVar2, zmyVar3};
    }

    public static defpackage.zmy[] values() {
        return (defpackage.zmy[]) d.clone();
    }
}
