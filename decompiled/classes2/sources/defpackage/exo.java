package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class exo {
    public static final int a;
    final android.content.Context b;
    final defpackage.etc c;
    final ahzi d;
    final ahzi e;
    final ahzi f;
    final ahzi g;
    final ahyc h;
    final android.os.Looper i;
    public defpackage.epu j;
    final defpackage.ezk k;
    final defpackage.ezj l;
    final int m;
    final int n;
    public boolean o;
    final java.lang.String p;
    final defpackage.exe q;

    static {
        java.lang.String str = eum.a;
        java.lang.String strP = ahvr.p(android.os.Build.DEVICE);
        int i = 30000;
        if (!strP.contains("emulator") && !strP.contains("emu64a") && !strP.contains("emu64x") && !strP.contains("generic") && !strP.contains("vsoc")) {
            i = 10000;
        }
        a = i;
    }

    public exo(android.content.Context context, defpackage.fft fftVar) {
        defpackage.exm exmVar = new defpackage.exm(context, 3);
        defpackage.exm exmVar2 = new defpackage.exm(fftVar, 4);
        defpackage.exm exmVar3 = new defpackage.exm(context, 0);
        defpackage.exm exmVar4 = new defpackage.exm(context, 2);
        defpackage.exn exnVar = new defpackage.exn(0);
        ahvr.ci(context);
        this.b = context;
        this.d = exmVar;
        this.e = exmVar2;
        this.f = exmVar3;
        this.g = exmVar4;
        this.h = exnVar;
        this.i = eum.E();
        this.j = defpackage.epu.a;
        this.k = defpackage.ezk.c;
        this.l = defpackage.ezj.a;
        this.q = new defpackage.exe(eum.w(20L), eum.w(500L));
        this.c = defpackage.etc.a;
        boolean zB = defpackage.eqe.b(4);
        int i = androidx.car.app.model.Alert.DURATION_SHOW_INDEFINITELY;
        this.m = zB ? a : Integer.MAX_VALUE;
        this.n = true == defpackage.eqe.b(4) ? 60000 : i;
        this.p = "";
        if (android.os.Build.VERSION.SDK_INT >= 35) {
            int i2 = exk.a;
        }
    }
}
