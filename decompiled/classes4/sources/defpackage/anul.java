package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class anul implements defpackage.anwc {
    public final java.lang.String a;
    public anzt b;
    public final java.lang.Object c = new java.lang.Object();
    public final java.util.Set d = java.util.Collections.newSetFromMap(new java.util.IdentityHashMap());
    public final java.util.concurrent.Executor e;
    public final int f;
    public final aodq g;
    public defpackage.anlw h;
    public final defpackage.anud i;
    public boolean j;
    public anqw k;
    public boolean l;
    private final anns m;
    private final java.net.InetSocketAddress n;
    private final java.lang.String o;
    private boolean p;
    private boolean q;

    public anul(defpackage.anud anudVar, java.net.InetSocketAddress inetSocketAddress, java.lang.String str, java.lang.String str2, defpackage.anlw anlwVar, java.util.concurrent.Executor executor, int i, aodq aodqVar) {
        ahvr.cj(inetSocketAddress, "address");
        this.n = inetSocketAddress;
        this.m = anns.a(getClass(), inetSocketAddress.toString());
        this.o = str;
        this.a = anxo.e("cronet", str2);
        this.f = i;
        this.e = executor;
        this.i = anudVar;
        this.g = aodqVar;
        defpackage.anlw anlwVar2 = defpackage.anlw.a;
        defpackage.antt anttVar = new defpackage.antt(defpackage.anlw.a);
        anttVar.c(defpackage.anxi.a, defpackage.anqj.c);
        anttVar.c(defpackage.anxi.b, anlwVar);
        this.h = anttVar.a();
    }

    final void a(defpackage.anuj anujVar, anqw anqwVar) {
        synchronized (this.c) {
            if (this.d.remove(anujVar)) {
                anqt anqtVar = anqwVar.o;
                boolean z = true;
                if (anqtVar != anqt.b && anqtVar != anqt.e) {
                    z = false;
                }
                anujVar.p.l(anqwVar, z, new anph());
                e();
            }
        }
    }

    public final /* bridge */ /* synthetic */ defpackage.anvp b(defpackage.anpk anpkVar, anph anphVar, anmb anmbVar, anmg[] anmgVarArr) {
        ahvr.cj(anpkVar, "method");
        ahvr.cj(anphVar, "headers");
        return new defpackage.anuk(this, "https://" + this.o + "/".concat(anpkVar.b), anphVar, anpkVar, defpackage.aodj.h(anmgVarArr, this.h), anmbVar).a;
    }

    public final anns c() {
        return this.m;
    }

    public final java.lang.Runnable d(anzt anztVar) {
        this.b = anztVar;
        synchronized (this.c) {
            this.l = true;
        }
        return new defpackage.alvr(this, 15);
    }

    final void e() {
        synchronized (this.c) {
            if (this.j && !this.q && this.d.isEmpty()) {
                this.q = true;
                this.b.d();
            }
        }
    }

    public final void q(anqw anqwVar) {
        synchronized (this.c) {
            if (this.j) {
                return;
            }
            synchronized (this.c) {
                if (!this.p) {
                    this.p = true;
                    this.b.c(anqwVar, defpackage.aodh.SUBCHANNEL_SHUTDOWN);
                    synchronized (this.c) {
                        this.j = true;
                        this.k = anqwVar;
                    }
                    e();
                }
            }
        }
    }

    public final void r(anqw anqwVar) {
        java.util.ArrayList arrayList;
        q(anqwVar);
        synchronized (this.c) {
            arrayList = new java.util.ArrayList(this.d);
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((defpackage.anuj) arrayList.get(i)).c(anqwVar);
        }
        e();
    }

    @Override // defpackage.anwc
    public final defpackage.anlw t() {
        return this.h;
    }

    public final java.lang.String toString() {
        java.net.InetSocketAddress inetSocketAddress = this.n;
        return super.toString() + '(' + inetSocketAddress.toString() + ')';
    }
}
