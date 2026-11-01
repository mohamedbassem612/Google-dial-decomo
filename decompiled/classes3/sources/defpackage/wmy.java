package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class wmy {
    public static final aimz a = aimz.i("com/android/dialer/xatu/impl/service/XatuSupportedNumbers");
    public final android.content.Context b;
    public final java.util.concurrent.Executor c;
    public final ajct d;
    public final aoin e;
    public final aoin f;
    public final aoin g;
    public final nze h;
    public final java.util.Map i = new aca();
    public final ahbv j;

    public wmy(android.content.Context context, aoin aoinVar, aoin aoinVar2, aoin aoinVar3, ajct ajctVar, ahbv ahbvVar, nze nzeVar) {
        this.b = context;
        this.d = ajctVar;
        this.j = ahbvVar;
        this.e = aoinVar;
        this.f = aoinVar2;
        this.g = aoinVar3;
        this.h = nzeVar;
        this.c = new ajdc(ajctVar);
    }

    public final ajcq a(java.lang.String str) {
        defpackage.vug vugVar = new defpackage.vug(this, 14);
        ajct ajctVar = this.d;
        return ahrv.g(ahvr.F(vugVar, ajctVar)).i(new defpackage.whr(this, str, 6), ajctVar);
    }
}
