package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class zfp {
    public static final defpackage.zfp a;
    public static final defpackage.zfp b;
    public static final defpackage.zfp c;
    public static final defpackage.zfp d;
    public static final defpackage.zfp e;
    private static final /* synthetic */ defpackage.zfp[] f;

    static {
        defpackage.zfp zfpVar = new defpackage.zfp("SERVICE_NOT_AVAILABLE", 0);
        a = zfpVar;
        defpackage.zfp zfpVar2 = new defpackage.zfp("CAPABILITY_NOT_BOUND", 1);
        b = zfpVar2;
        defpackage.zfp zfpVar3 = new defpackage.zfp("CAPABILITY_NOT_PUBLISHED", 2);
        c = zfpVar3;
        defpackage.zfp zfpVar4 = new defpackage.zfp("LOCAL_IDENTITY_NOT_RCS_CAPABLE", 3);
        d = zfpVar4;
        defpackage.zfp zfpVar5 = new defpackage.zfp("REMOTE_IDENTITY_DOES_NOT_HAVE_CAPABILITY", 4);
        e = zfpVar5;
        defpackage.zfp[] zfpVarArr = {zfpVar, zfpVar2, zfpVar3, zfpVar4, zfpVar5};
        f = zfpVarArr;
        ajsz.am(zfpVarArr);
    }

    public static defpackage.zfp[] values() {
        return (defpackage.zfp[]) f.clone();
    }
}
