package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class qs {
    public java.util.List a;
    public int b;
    public int c;
    public int d;
    public int e;
    private java.util.List f;
    private android.os.Bundle g;
    private java.util.List h;
    private acc i;
    private android.os.Bundle j;
    private android.os.Bundle k;
    private java.util.List l;
    private java.util.List m;
    private java.util.List n;
    private int o;
    private int p;
    private int q;
    private int r;
    private defpackage.qe s;
    private java.lang.String t;
    private java.util.List u;
    private int v;
    private boolean w;

    public qs(defpackage.qt qtVar) {
        this.a = new java.util.ArrayList();
        this.f = new java.util.ArrayList();
        this.g = new android.os.Bundle();
        this.h = new java.util.ArrayList();
        this.i = new acc(0);
        this.j = new android.os.Bundle();
        this.k = new android.os.Bundle();
        this.l = new java.util.ArrayList();
        this.m = new java.util.ArrayList();
        this.n = new java.util.ArrayList();
        this.o = 10;
        this.b = 2;
        this.p = 1;
        this.c = 0;
        this.d = 10000;
        this.e = 0;
        this.q = 0;
        this.r = 0;
        this.t = "";
        this.u = new java.util.ArrayList();
        this.v = 10;
        this.w = false;
        j$.util.Objects.requireNonNull(qtVar);
        this.a = new java.util.ArrayList(qtVar.c());
        this.f = new java.util.ArrayList(qtVar.a());
        for (java.util.Map.Entry entry : qtVar.d().entrySet()) {
            java.lang.String str = (java.lang.String) entry.getKey();
            java.util.Collection<java.lang.String> collection = (java.util.Collection) entry.getValue();
            dzk.x(str);
            dzk.x(collection);
            b();
            java.util.ArrayList<java.lang.String> arrayList = new java.util.ArrayList<>(collection.size());
            for (java.lang.String str2 : collection) {
                dzk.x(str2);
                arrayList.add(str2);
            }
            this.g.putStringArrayList(str, arrayList);
        }
        this.h = new java.util.ArrayList(qtVar.b());
        this.i = new acc(qtVar.o);
        for (java.util.Map.Entry entry2 : qtVar.e().entrySet()) {
            d((java.lang.String) entry2.getKey(), (java.util.Collection) entry2.getValue());
        }
        for (java.util.Map.Entry entry3 : qtVar.f().entrySet()) {
            java.lang.String str3 = (java.lang.String) entry3.getKey();
            java.util.Map map = (java.util.Map) entry3.getValue();
            dzk.x(str3);
            dzk.x(map);
            android.os.Bundle bundle = new android.os.Bundle();
            for (java.util.Map.Entry entry4 : map.entrySet()) {
                java.lang.String str4 = (java.lang.String) entry4.getKey();
                dzk.x(str4);
                java.lang.Double d = (java.lang.Double) entry4.getValue();
                dzk.x(d);
                if (d.doubleValue() <= 0.0d) {
                    throw new java.lang.IllegalArgumentException("Cannot set non-positive property weight value " + d + " for property path: " + str4);
                }
                bundle.putDouble(str4, d.doubleValue());
            }
            this.k.putBundle(str3, bundle);
        }
        this.l = new java.util.ArrayList(qtVar.q);
        this.m = new java.util.ArrayList(qtVar.t);
        this.o = qtVar.c;
        this.b = qtVar.a;
        this.p = qtVar.r;
        this.c = qtVar.f;
        this.d = qtVar.g;
        this.e = qtVar.h;
        int i = qtVar.d;
        int i2 = qtVar.e;
        this.q = qtVar.j;
        this.r = qtVar.k;
        this.s = qtVar.m;
        this.t = qtVar.n;
        this.u = new java.util.ArrayList(qtVar.s);
        java.lang.String str5 = qtVar.p;
        this.n = new java.util.ArrayList(qtVar.u);
        boolean z = qtVar.v;
        this.v = qtVar.w;
    }

    public final defpackage.qt a() {
        if (!this.k.isEmpty()) {
            throw new java.lang.IllegalArgumentException("Property weights are only compatible with the RANKING_STRATEGY_RELEVANCE_SCORE and RANKING_STRATEGY_ADVANCED_RANKING_EXPRESSION ranking strategies.");
        }
        this.w = true;
        return new defpackage.qt(this.b, this.a, this.f, this.g, this.h, this.o, this.c, this.d, this.e, this.j, this.q, this.r, this.k, this.s, this.t, new java.util.ArrayList((java.util.Collection) this.i), this.l, this.p, this.u, this.m, this.n, this.v);
    }

    public final void b() {
        if (this.w) {
            this.a = new java.util.ArrayList(this.a);
            this.g = sl.a(this.g);
            this.f = new java.util.ArrayList(this.f);
            this.h = new java.util.ArrayList(this.h);
            this.j = sl.a(this.j);
            this.k = sl.a(this.k);
            this.l = new java.util.ArrayList(this.l);
            this.u = new java.util.ArrayList(this.u);
            this.m = new java.util.ArrayList(this.m);
            this.n = new java.util.ArrayList(this.n);
            this.w = false;
        }
    }

    public final void c(java.util.Collection collection) {
        dzk.x(collection);
        b();
        this.h.addAll(collection);
    }

    public final void d(java.lang.String str, java.util.Collection collection) {
        dzk.x(str);
        dzk.x(collection);
        b();
        java.util.ArrayList<java.lang.String> arrayList = new java.util.ArrayList<>(collection.size());
        java.util.Iterator it = collection.iterator();
        while (it.hasNext()) {
            java.lang.String str2 = (java.lang.String) it.next();
            dzk.x(str2);
            arrayList.add(str2);
        }
        this.j.putStringArrayList(str, arrayList);
    }

    public final void e() {
        b();
        this.h.clear();
    }

    public final void f(java.lang.String str) {
        b();
        this.i.add(str);
    }

    public final void g(defpackage.qe qeVar) {
        b();
        this.s = qeVar;
    }

    public final void h() {
        dzk.w(100, 0, 10000, "resultCountPerPage");
        b();
        this.o = 100;
    }

    public final void i() {
        b();
        this.q = 1;
        this.r = 1;
    }

    public final void j(java.lang.String... strArr) {
        b();
        java.util.List listAsList = java.util.Arrays.asList(strArr);
        dzk.x(listAsList);
        b();
        this.f.addAll(listAsList);
    }

    public final void k(java.lang.String... strArr) {
        b();
        c(java.util.Arrays.asList(strArr));
    }

    public qs() {
        this.a = new java.util.ArrayList();
        this.f = new java.util.ArrayList();
        this.g = new android.os.Bundle();
        this.h = new java.util.ArrayList();
        this.i = new acc(0);
        this.j = new android.os.Bundle();
        this.k = new android.os.Bundle();
        this.l = new java.util.ArrayList();
        this.m = new java.util.ArrayList();
        this.n = new java.util.ArrayList();
        this.o = 10;
        this.b = 2;
        this.p = 1;
        this.c = 0;
        this.d = 10000;
        this.e = 0;
        this.q = 0;
        this.r = 0;
        this.t = "";
        this.u = new java.util.ArrayList();
        this.v = 10;
        this.w = false;
    }
}
