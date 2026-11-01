package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ql {
    public java.util.List a;
    public double b;
    public java.util.List c;
    private final java.lang.String d;
    private final java.lang.String e;
    private defpackage.pw f;
    private android.os.Bundle g;
    private java.util.List h;
    private boolean i;

    public ql(defpackage.qq qqVar) {
        this.a = new java.util.ArrayList();
        this.c = new java.util.ArrayList();
        this.g = new android.os.Bundle();
        this.h = new java.util.ArrayList();
        this.i = false;
        this.d = qqVar.c;
        this.e = qqVar.d;
        this.f = qqVar.a();
        this.b = qqVar.e;
        this.c = new java.util.ArrayList(qqVar.g);
        java.util.Set<java.lang.String> setKeySet = qqVar.h.keySet();
        aca acaVar = new aca(setKeySet.size());
        for (java.lang.String str : setKeySet) {
            java.util.ArrayList<java.lang.String> stringArrayList = qqVar.h.getStringArrayList(str);
            if (stringArrayList != null) {
                acaVar.put(str, stringArrayList);
            }
        }
        f(acaVar);
        java.util.List listB = qqVar.b();
        for (int i = 0; i < listB.size(); i++) {
            d(new defpackage.qm((defpackage.qn) listB.get(i)).a());
        }
        java.util.List list = qqVar.f;
        for (int i2 = 0; i2 < list.size(); i2++) {
            c((defpackage.qq) list.get(i2));
        }
    }

    public final defpackage.qq a() {
        this.i = true;
        return new defpackage.qq(this.f.a, this.a, this.d, this.e, this.b, this.h, this.c, this.g);
    }

    public final void b() {
        if (this.i) {
            this.a = new java.util.ArrayList(this.a);
            this.h = new java.util.ArrayList(this.h);
            this.c = new java.util.ArrayList(this.c);
            this.g = sl.a(this.g);
            this.i = false;
        }
    }

    public final void c(defpackage.qq qqVar) {
        b();
        this.h.add(qqVar);
    }

    public final void d(defpackage.qn qnVar) {
        dzk.v(qnVar.e == null, "This MatchInfo is already associated with a SearchResult and can't be reassigned");
        b();
        this.a.add(qnVar);
    }

    public final void e(defpackage.pw pwVar) {
        b();
        this.f = pwVar;
    }

    public final void f(java.util.Map map) {
        dzk.x(map);
        b();
        this.g.clear();
        for (java.util.Map.Entry entry : map.entrySet()) {
            dzk.x((java.lang.String) entry.getKey());
            dzk.x((java.util.List) entry.getValue());
            java.util.ArrayList<java.lang.String> arrayList = new java.util.ArrayList<>(((java.util.List) entry.getValue()).size());
            for (int i = 0; i < ((java.util.List) entry.getValue()).size(); i++) {
                java.lang.String str = (java.lang.String) ((java.util.List) entry.getValue()).get(i);
                dzk.x(str);
                arrayList.add(str);
            }
            this.g.putStringArrayList((java.lang.String) entry.getKey(), arrayList);
        }
    }

    public ql(java.lang.String str, java.lang.String str2) {
        this.a = new java.util.ArrayList();
        this.c = new java.util.ArrayList();
        this.g = new android.os.Bundle();
        this.h = new java.util.ArrayList();
        this.i = false;
        dzk.x(str);
        this.d = str;
        dzk.x(str2);
        this.e = str2;
    }
}
