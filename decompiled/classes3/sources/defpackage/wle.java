package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class wle {
    public static final aimz a = aimz.i("com/android/dialer/xatu/impl/service/XatuInterpreter");
    public final defpackage.wit b;
    public final java.util.concurrent.Executor c;
    public final aoin d;
    public final java.lang.String e;
    public final long f;
    public final defpackage.whs g;
    public final defpackage.wjb h;
    public final java.util.concurrent.atomic.AtomicBoolean i = new java.util.concurrent.atomic.AtomicBoolean();
    public final java.util.concurrent.atomic.AtomicBoolean j = new java.util.concurrent.atomic.AtomicBoolean(false);
    public j$.util.Optional k = j$.util.Optional.empty();
    public final defpackage.abtr l;
    public final heq m;

    public wle(java.lang.String str, long j, heq heqVar, defpackage.wit witVar, ajct ajctVar, aoin aoinVar, defpackage.abtr abtrVar, defpackage.whs whsVar, defpackage.wjb wjbVar) {
        this.e = str;
        this.f = j;
        this.m = heqVar;
        this.b = witVar;
        this.c = new ajdc(ajctVar);
        this.d = aoinVar;
        this.g = whsVar;
        this.l = abtrVar;
        this.h = wjbVar;
    }

    public static aify a(java.util.List list) {
        return (aify) j$.util.Collection.-EL.stream(list).map(new defpackage.vun(17)).collect(aido.a);
    }

    public static boolean b(amft amftVar, amft amftVar2) {
        return amjk.e(amftVar.c) == 2 && (amftVar.b & 4) != 0 && amftVar.g == amftVar2.g;
    }

    public static boolean c(amfy amfyVar) {
        return j$.util.Collection.-EL.stream(amfyVar.d).anyMatch(new vgb(19));
    }

    public final boolean d() {
        if (this.j.get()) {
            return true;
        }
        a.d().l("com/android/dialer/xatu/impl/service/XatuInterpreter", "shouldProcessEvent", 190, "XatuInterpreter.java").v("Interpreter is not active. Ignoring event.");
        return false;
    }
}
