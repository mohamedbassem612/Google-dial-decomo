package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class adce implements defpackage.affy, defpackage.adte {
    public final java.util.concurrent.Executor a;
    public final java.util.HashMap b;
    public final java.util.HashMap c;
    public final defpackage.abrz d;
    private final defpackage.adcb e;

    public adce(java.util.concurrent.Executor executor) {
        defpackage.abrz abrzVar = new defpackage.abrz();
        this.b = new java.util.HashMap();
        this.c = new java.util.HashMap();
        this.d = abrzVar;
        this.a = new defpackage.ajdc(executor);
        this.e = new defpackage.adcb(executor);
    }

    @Override // defpackage.affy
    public final affx a(android.net.Uri uri) {
        return b(uri);
    }

    @Override // defpackage.affy
    public final affx b(android.net.Uri uri) {
        synchronized (defpackage.adce.class) {
            java.lang.String str = (java.lang.String) this.b.get(uri);
            if (str == null) {
                return this.e.b(uri);
            }
            java.util.HashMap map = this.c;
            if (map.get(str) == null) {
                int i = defpackage.adbe.a;
                return null;
            }
            return (affx) map.get(str);
        }
    }

    @Override // defpackage.adte
    public final void e() {
        synchronized (defpackage.adce.class) {
            java.util.Iterator it = this.c.values().iterator();
            while (it.hasNext()) {
                acwu acwuVar = ((affl) it.next()).a.c;
                defpackage.acwx acwxVar = acwuVar.f;
                defpackage.ahvr.I(acwxVar.j.f(acwuVar.a.a), new acyf(acwuVar, acwuVar.b, acwuVar.c, acwuVar.e, acwuVar.d, 1), acwxVar.f);
            }
            this.e.e();
        }
    }

    public final void g(java.lang.String str, long j) {
        synchronized (defpackage.adce.class) {
            java.util.HashMap map = this.c;
            if (map.containsKey(str)) {
                ((affl) map.get(str)).a.a(j);
            }
        }
    }

    public final void h(java.lang.String str) {
        synchronized (defpackage.adce.class) {
            this.c.remove(str);
        }
    }

    @Override // defpackage.adte
    public final void c() {
    }

    @Override // defpackage.adte
    public final void d() {
    }

    @Override // defpackage.affy
    public final void f() {
    }
}
