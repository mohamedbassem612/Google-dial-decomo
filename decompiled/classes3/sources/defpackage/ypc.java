package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ypc extends defpackage.ylk {
    private final defpackage.yll a;
    private final ahzp b;
    private final defpackage.ypf c;
    private final defpackage.ajxi d;

    public ypc(defpackage.yll yllVar, defpackage.ajxi ajxiVar, ahzp ahzpVar) {
        this.a = yllVar;
        this.d = ajxiVar;
        this.b = ahzpVar;
        this.c = new defpackage.ypf(ahzpVar);
    }

    @Override // defpackage.yll
    public final void a(java.lang.String str) {
        j$.time.Duration durationA = defpackage.ypf.a(this.c, new defpackage.ypf(this.b));
        defpackage.ajxi ajxiVar = this.d;
        java.lang.Object obj = ajxiVar.a;
        defpackage.xhp.o(9, ((defpackage.ymk) ajxiVar.c).e, 7, durationA, ((defpackage.ync) ajxiVar.b).b, 4, 0);
        this.a.a(str);
    }

    @Override // defpackage.yll
    public final void b(java.lang.String str, int i, java.lang.String str2) {
        j$.time.Duration durationA = defpackage.ypf.a(this.c, new defpackage.ypf(this.b));
        defpackage.ajxi ajxiVar = this.d;
        java.lang.Object obj = ajxiVar.a;
        defpackage.xhp.o(9, ((defpackage.ymk) ajxiVar.c).e, 7, durationA, ((defpackage.ync) ajxiVar.b).b, 5, i);
        this.a.b(str, i, str2);
    }

    @Override // defpackage.yll
    public final void c(java.lang.String str, long j) {
        this.a.c(str, j);
    }

    @Override // defpackage.yll
    public final void d(java.lang.String str, long j) {
        j$.time.Duration durationA = defpackage.ypf.a(this.c, new defpackage.ypf(this.b));
        defpackage.ajxi ajxiVar = this.d;
        java.lang.Object obj = ajxiVar.a;
        defpackage.xhp.o(9, ((defpackage.ymk) ajxiVar.c).e, 6, durationA, ((defpackage.ync) ajxiVar.b).b, 3, 0);
        this.a.d(str, j);
    }
}
