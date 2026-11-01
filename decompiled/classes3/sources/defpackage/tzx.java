package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class tzx implements defpackage.znk {
    public static final aimz a = aimz.i("com/android/dialer/sonic/impl/service/SonicController");
    public final defpackage.uaq b;
    public final defpackage.tzv c;
    public final defpackage.tzr d;
    public final ajct e;
    public final agsm g;
    public final zpz h;
    public final defpackage.uss i;
    public final zjm j;
    private final defpackage.uae l;
    public final ahda k = new ahda();
    public final defpackage.znq f = new defpackage.rez(this, 2);

    public tzx(ajct ajctVar, agsm agsmVar, defpackage.uss ussVar, defpackage.uaq uaqVar, defpackage.tzv tzvVar, zpz zpzVar, defpackage.tzr tzrVar, zjm zjmVar, defpackage.uae uaeVar) {
        this.g = agsmVar;
        this.i = ussVar;
        this.b = uaqVar;
        this.c = tzvVar;
        this.d = tzrVar;
        this.h = zpzVar;
        this.e = ajctVar;
        this.j = zjmVar;
        this.l = uaeVar;
    }

    public final void a() {
        this.b.b();
    }

    @Override // defpackage.znk
    public final ajcq b() {
        this.g.g(ahrv.g(this.l.a()).h(new defpackage.tcy(this, 11), this.e), 5L, java.util.concurrent.TimeUnit.SECONDS);
        return ajcm.a;
    }

    public final void c(defpackage.uab uabVar) {
        this.g.g(ahrv.g(this.d.a()).h(new defpackage.tzs(this, uabVar, 2, null), this.e), 5L, java.util.concurrent.TimeUnit.SECONDS);
    }
}
