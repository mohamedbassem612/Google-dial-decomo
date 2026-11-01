package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class bjh extends dap {
    public long a;
    public aomy b;
    public defpackage.bgw c;
    public final cwd d;
    public defpackage.blz e;
    public defpackage.bjj f;

    public bjh(defpackage.blz blzVar, long j, aomy aomyVar) {
        this.e = blzVar;
        this.a = j;
        this.b = aomyVar;
        defpackage.bil bilVar = new defpackage.bil(this, 2);
        cvf cvfVar = cvy.a;
        cwd cwdVar = new cwd((java.lang.Object) null, (java.lang.Object) null, (java.lang.Object[]) null, bilVar);
        V(cwdVar);
        this.d = cwdVar;
        this.c = b();
        this.f = d();
    }

    public final defpackage.bgw b() {
        return new defpackage.bji(new defpackage.bhl(this, 14), new defpackage.bhl(this, 15), this.e);
    }

    public final defpackage.bjj d() {
        return new defpackage.bjj(new defpackage.bhl(this, 12), this.e, new defpackage.bhl(this, 13));
    }
}
