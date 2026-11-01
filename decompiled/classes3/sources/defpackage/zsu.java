package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class zsu {
    public static final aimz a = aimz.i("com/google/android/dialershared/precall/impl/PrecallFragmentPeer");
    public defpackage.zrx b;
    public final defpackage.zss c;
    public final agtj d;
    public final zsq e;
    public final j$.util.Optional f;
    public final defpackage.zst g = new defpackage.zst(this);
    public int h;
    private final defpackage.uzx i;

    public zsu(defpackage.zrx zrxVar, defpackage.zss zssVar, agtj agtjVar, zsq zsqVar, defpackage.uzx uzxVar, j$.util.Optional optional) {
        this.b = zrxVar;
        this.c = zssVar;
        this.d = agtjVar;
        this.e = zsqVar;
        this.i = uzxVar;
        this.f = optional;
    }

    public final void a() {
        ahvr.j(new defpackage.zsl(), ((aw) this.c).Q);
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final void b() {
        int i = this.h;
        zsq zsqVar = this.e;
        if (i >= zsqVar.b.size()) {
            a.b().l("com/google/android/dialershared/precall/impl/PrecallFragmentPeer", "runPrecallIntegration", 156, "PrecallFragmentPeer.java").v("reach end");
            c();
            return;
        }
        zta ztaVarA = zsqVar.a(this.h);
        a.b().l("com/google/android/dialershared/precall/impl/PrecallFragmentPeer", "runPrecallIntegration", 147, "PrecallFragmentPeer.java").G("run precall integration %s at %s", ztaVarA, this.h);
        j$.util.Optional optional = this.f;
        optional.isPresent();
        ((gou) optional.get()).n();
        agtj agtjVar = this.d;
        defpackage.uzx uzxVar = this.i;
        defpackage.zrx zrxVar = this.b;
        agtjVar.i(defpackage.zoe.M(ahvr.I(ztaVarA.b(zrxVar), new defpackage.zum((java.lang.Object) uzxVar, (java.lang.Object) ztaVarA, (alad) zrxVar, 1, (byte[]) null), (java.util.concurrent.Executor) uzxVar.a)), this.g);
    }

    public final void c() {
        a.b().l("com/google/android/dialershared/precall/impl/PrecallFragmentPeer", "startCall", 161, "PrecallFragmentPeer.java").v("starting call");
        this.e.c(this.b);
        a();
    }
}
