package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ghn implements defpackage.git, defpackage.gfh {
    public final defpackage.ghh a;
    private final defpackage.git b;
    private final defpackage.ghk c;

    public ghn(defpackage.git gitVar, defpackage.ghh ghhVar) {
        this.b = gitVar;
        this.a = ghhVar;
        this.c = new defpackage.ghk(ghhVar);
        if (gitVar instanceof defpackage.ghn) {
            throw new java.lang.IllegalArgumentException("Failed requirement.");
        }
        ghhVar.a = gitVar;
    }

    @Override // defpackage.gfh
    public final defpackage.git a() {
        return this.b;
    }

    @Override // defpackage.git
    public final defpackage.gip b() {
        defpackage.een eenVar = new defpackage.een(8);
        defpackage.ghk ghkVar = this.c;
        ghkVar.a.b(eenVar);
        return ghkVar;
    }

    @Override // defpackage.git
    public final java.lang.String c() {
        return this.b.c();
    }

    @Override // defpackage.git, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.c.close();
    }

    @Override // defpackage.git
    public final void d(boolean z) {
        this.b.d(z);
    }
}
