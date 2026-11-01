package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class fgi {
    public final long a;
    public final android.net.Uri b;
    public final defpackage.ewl c;
    public final defpackage.fll d;
    public volatile boolean e;
    public boolean f;
    public long g;
    public defpackage.evv h;
    public defpackage.fmk i;
    public boolean j;
    public final /* synthetic */ defpackage.fgm k;
    public final defpackage.fey l;
    public final aesq m;
    public final defpackage.agze n;

    public fgi(defpackage.fgm fgmVar, android.net.Uri uri, defpackage.evr evrVar, defpackage.fey feyVar, defpackage.fll fllVar, defpackage.agze agzeVar) {
        j$.util.Objects.requireNonNull(fgmVar);
        this.k = fgmVar;
        this.b = uri;
        this.c = new defpackage.ewl(evrVar);
        this.l = feyVar;
        this.d = fllVar;
        this.n = agzeVar;
        this.m = new aesq();
        this.f = true;
        this.a = defpackage.ffl.a();
        this.h = a(0L, null);
    }

    public final defpackage.evv a(long j, java.lang.String str) {
        aigf aigfVarE = defpackage.fgm.a;
        if (str != null && !str.startsWith("W/")) {
            aigb aigbVar = new aigb(4);
            aigbVar.l(aigfVarE);
            aigbVar.i("If-Range", str);
            aigfVarE = aigbVar.e(false);
        }
        defpackage.evu evuVar = new defpackage.evu();
        evuVar.a = this.b;
        evuVar.e = j;
        evuVar.f = 6;
        evuVar.d = aigfVarE;
        return evuVar.a();
    }

    public final void b(long j, long j2) {
        this.m.a = j;
        this.g = j2;
        this.f = true;
        this.j = false;
    }
}
