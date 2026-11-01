package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class pus {
    public static final defpackage.pus a;
    public static final defpackage.pus b;
    public static final defpackage.pus c;
    public static final defpackage.pus d;
    public static final aimz e;
    private static final /* synthetic */ defpackage.pus[] f;

    static {
        defpackage.pus pusVar = new defpackage.pus("ORIENTATION_0_DEGREE", 0);
        a = pusVar;
        defpackage.pus pusVar2 = new defpackage.pus("ORIENTATION_90_DEGREE", 1);
        b = pusVar2;
        defpackage.pus pusVar3 = new defpackage.pus("ORIENTATION_180_DEGREE", 2);
        c = pusVar3;
        defpackage.pus pusVar4 = new defpackage.pus("ORIENTATION_270_DEGREE", 3);
        d = pusVar4;
        f = new defpackage.pus[]{pusVar, pusVar2, pusVar3, pusVar4};
        e = aimz.i("com/android/dialer/incall/core/video/CameraOrientation");
    }

    public static defpackage.pus[] values() {
        return (defpackage.pus[]) f.clone();
    }

    public final boolean a() {
        return this == b || this == d;
    }
}
