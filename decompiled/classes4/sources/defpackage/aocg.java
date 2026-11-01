package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
final class aocg extends defpackage.anql {
    private static final java.util.logging.Logger e = java.util.logging.Logger.getLogger(defpackage.aocg.class.getName());
    public final defpackage.aocx a;
    public final defpackage.anpk b;
    public final defpackage.anmo c;
    public volatile boolean d;
    private final byte[] f;
    private final anmy g;
    private final anve h;
    private boolean i;
    private boolean j;
    private anmj k;
    private boolean l;

    public aocg(defpackage.aocx aocxVar, defpackage.anpk anpkVar, anph anphVar, defpackage.anmo anmoVar, anmy anmyVar, anve anveVar) {
        this.a = aocxVar;
        this.b = anpkVar;
        this.c = anmoVar;
        this.f = (byte[]) anphVar.c(anxo.d);
        this.g = anmyVar;
        this.h = anveVar;
        anveVar.b();
    }

    private final void i(java.lang.Throwable th) {
        e.logp(java.util.logging.Level.WARNING, "io.grpc.internal.ServerCallImpl", "handleInternalError", "Cancelling the stream because of internal error", th);
        this.a.c(th instanceof defpackage.anqz ? ((defpackage.anqz) th).a : anqw.k.e(th).f("Internal error so cancelling stream."));
        this.h.a(false);
    }

    private final void j(java.lang.Object obj) {
        ahvr.bZ(this.i, "sendHeaders has not been called");
        ahvr.bZ(!this.j, "call is closed");
        defpackage.anpk anpkVar = this.b;
        if (anpkVar.a.b() && this.l) {
            i(new defpackage.anqz(anqw.k.f("Too many responses"), null));
            return;
        }
        this.l = true;
        try {
            this.a.n(anpkVar.e.a(obj));
        } catch (java.lang.Error e2) {
            a(anqw.c.f("Server sendMessage() failed with Error"), new anph());
            throw e2;
        } catch (java.lang.RuntimeException e3) {
            i(e3);
        }
    }

    @Override // defpackage.anql
    public final void a(anqw anqwVar, anph anphVar) {
        anve anveVar;
        int i = defpackage.aoik.a;
        ahvr.bZ(!this.j, "call already closed");
        try {
            this.j = true;
            if (anqwVar.h() && this.b.a.b() && !this.l) {
                i(new defpackage.anqz(anqw.k.f("Completed without a response"), null));
                anveVar = this.h;
            } else {
                this.a.e(anqwVar, anphVar);
                anveVar = this.h;
            }
            anveVar.a(anqwVar.h());
        } catch (java.lang.Throwable th) {
            this.h.a(anqwVar.h());
            throw th;
        }
    }

    @Override // defpackage.anql
    public final defpackage.anlw b() {
        return this.a.a();
    }

    @Override // defpackage.anql
    public final void c(int i) {
        int i2 = defpackage.aoik.a;
        if (this.b.a.a()) {
            i = 2;
        }
        this.a.g(i);
    }

    @Override // defpackage.anql
    public final void d(anph anphVar) {
        byte[] bArr;
        int i = defpackage.aoik.a;
        ahvr.bZ(!this.i, "sendHeaders has already been called");
        ahvr.bZ(!this.j, "call is closed");
        anphVar.f(anxo.g);
        anpc anpcVar = anxo.c;
        anphVar.f(anpcVar);
        if (this.k != null && (bArr = this.f) != null) {
            java.util.Iterator it = anxo.k.h(new java.lang.String(bArr, anxo.a)).iterator();
            do {
                if (!it.hasNext()) {
                    this.k = anmh.a;
                    break;
                }
            } while (!j$.util.Objects.equals(it.next(), "identity"));
        } else {
            this.k = anmh.a;
        }
        anphVar.h(anpcVar, "identity");
        defpackage.aocx aocxVar = this.a;
        anpc anpcVar2 = anxo.d;
        anphVar.f(anpcVar2);
        byte[] bArr2 = this.g.c;
        if (bArr2.length != 0) {
            anphVar.h(anpcVar2, bArr2);
        }
        this.i = true;
        defpackage.anpj anpjVar = this.b.a;
        aocxVar.j(anphVar);
    }

    @Override // defpackage.anql
    public final boolean e() {
        if (this.j) {
            return false;
        }
        return this.a.o();
    }

    @Override // defpackage.anql
    public final defpackage.anpk f() {
        return this.b;
    }

    @Override // defpackage.anql
    public final void g(java.lang.Object obj) {
        int i = defpackage.aoik.a;
        j(obj);
    }
}
