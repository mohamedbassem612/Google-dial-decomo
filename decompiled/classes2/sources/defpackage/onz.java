package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class onz {
    public static final aimz a = aimz.i("com/android/dialer/fliptosilence/FlipToSilenceDriver");
    public final aoin b;
    public final abdo c;
    private final ajct d;
    private final defpackage.jiv e;

    public onz(abdo abdoVar, ajct ajctVar, defpackage.jiv jivVar, aoin aoinVar) {
        this.c = abdoVar;
        this.d = ajctVar;
        this.e = jivVar;
        this.b = aoinVar;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final void a(java.lang.Runnable runnable) {
        ajcq ajcqVarO;
        defpackage.jiv jivVar = this.e;
        if (((zzx) jivVar.c).m()) {
            ajcqVarO = aiql.z(java.lang.Boolean.FALSE);
        } else {
            java.lang.Object obj = jivVar.e;
            java.lang.Object obj2 = jivVar.d;
            ajcq ajcqVarQ = ((defpackage.oii) obj).q();
            ajcq ajcqVarB = ((defpackage.ony) obj2).b();
            ajcqVarO = ahvr.ak(new ajcq[]{ajcqVarQ, ajcqVarB}).o(new defpackage.hsl(jivVar, ajcqVarQ, ajcqVarB, 12, (byte[]) null), (java.util.concurrent.Executor) jivVar.b);
        }
        ahvr.J(ajcqVarO, new defpackage.kxp(this, runnable, 2), this.d);
    }

    public final void b() {
        this.c.a();
    }
}
