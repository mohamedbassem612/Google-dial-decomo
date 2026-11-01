package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class djf implements java.lang.Appendable {
    public final java.lang.StringBuilder a;
    public final java.util.List b;
    public final java.util.List c;

    public djf(int i) {
        this.a = new java.lang.StringBuilder(i);
        this.b = new java.util.ArrayList();
        this.c = new java.util.ArrayList();
        new java.util.ArrayList();
    }

    public final int a() {
        return this.a.length();
    }

    @Override // java.lang.Appendable
    public final /* bridge */ /* synthetic */ java.lang.Appendable append(java.lang.CharSequence charSequence, int i, int i2) {
        if (charSequence instanceof dji) {
            h((dji) charSequence, i, i2);
        } else {
            this.a.append(charSequence, i, i2);
        }
        return this;
    }

    public final int b(defpackage.djw djwVar) {
        defpackage.dje djeVar = new defpackage.dje(djwVar, this.a.length(), Integer.MIN_VALUE, "");
        java.util.List list = this.b;
        list.add(djeVar);
        this.c.add(djeVar);
        return list.size() - 1;
    }

    public final dji c() {
        java.lang.StringBuilder sb = this.a;
        java.lang.String string = sb.toString();
        java.util.List list = this.c;
        java.util.ArrayList arrayList = new java.util.ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(((defpackage.dje) list.get(i)).a(sb.length()));
        }
        return new dji(string, arrayList);
    }

    public final void d(dkd dkdVar, int i, int i2) {
        this.c.add(new defpackage.dje(dkdVar, i, i2, ""));
    }

    public final void e(dks dksVar, int i, int i2) {
        this.c.add(new defpackage.dje(dksVar, i, i2, ""));
    }

    public final void f(dji djiVar) {
        java.lang.StringBuilder sb = this.a;
        int length = sb.length();
        sb.append(djiVar.c);
        java.util.List list = djiVar.b;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                djg djgVar = (djg) list.get(i);
                this.c.add(new defpackage.dje(djgVar.a, djgVar.b + length, djgVar.c + length, djgVar.d));
            }
        }
    }

    public final void g(java.lang.String str) {
        this.a.append(str);
    }

    public final void h(dji djiVar, int i, int i2) {
        java.lang.StringBuilder sb = this.a;
        int length = sb.length();
        sb.append((java.lang.CharSequence) djiVar.c, i, i2);
        java.util.List listA = djj.a(djiVar, i, i2, (aonj) null);
        if (listA != null) {
            int size = listA.size();
            for (int i3 = 0; i3 < size; i3++) {
                djg djgVar = (djg) listA.get(i3);
                this.c.add(new defpackage.dje(djgVar.a, djgVar.b + length, djgVar.c + length, djgVar.d));
            }
        }
    }

    public final void i(int i) {
        java.util.List list = this.b;
        if (i >= list.size()) {
            defpackage.dnv.c(i + " should be less than " + list.size());
        }
        while (list.size() - 1 >= i) {
            if (list.isEmpty()) {
                defpackage.dnv.c("Nothing to pop.");
            }
            ((defpackage.dje) list.remove(list.size() - 1)).a = this.a.length();
        }
    }

    public final void j(char c) {
        this.a.append(c);
    }

    public final void k(java.lang.CharSequence charSequence) {
        if (charSequence instanceof dji) {
            f((dji) charSequence);
        } else {
            this.a.append(charSequence);
        }
    }

    @Override // java.lang.Appendable
    public final /* bridge */ /* synthetic */ java.lang.Appendable append(java.lang.CharSequence charSequence) {
        k(charSequence);
        return this;
    }

    @Override // java.lang.Appendable
    public final /* bridge */ /* synthetic */ java.lang.Appendable append(char c) {
        j(c);
        return this;
    }

    public djf(dji djiVar) {
        this(16);
        f(djiVar);
    }

    public djf(java.lang.String str) {
        this(16);
        g(str);
    }
}
