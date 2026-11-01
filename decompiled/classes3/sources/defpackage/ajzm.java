package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ajzm {
    public final java.lang.String a;
    public final boolean b;
    public final aiii c;
    public final defpackage.ajzl d;
    public final boolean e;
    public final int f;
    public final java.lang.String g;
    public final java.lang.Long h;
    public final aihd i;
    public final java.lang.Integer j;
    public final java.lang.Integer k;

    public ajzm(defpackage.ajzk ajzkVar) {
        this.a = ajzkVar.a;
        this.b = ajzkVar.g;
        this.c = aiga.b(ajzkVar.b);
        this.d = ajzkVar.c;
        this.e = ajzkVar.d;
        this.f = ajzkVar.e;
        this.g = ajzkVar.f;
        this.h = ajzkVar.h;
        this.i = aihd.o(ajzkVar.i);
        this.j = ajzkVar.j;
        this.k = ajzkVar.k;
    }

    public final defpackage.ajzk a() {
        defpackage.ajzk ajzkVar = new defpackage.ajzk();
        ajzkVar.a(this.c);
        int i = this.f;
        if (i != 0 && i != 1 && i != 2) {
            i = 3;
        }
        ajzkVar.e = i;
        ajzkVar.d = this.e;
        ajzkVar.i.addAll(this.i);
        java.lang.String str = this.a;
        if (str != null) {
            ajzkVar.f(str);
        }
        java.lang.String str2 = this.g;
        if (str2 != null) {
            ajzkVar.d(str2);
        }
        if (this.b) {
            ajzkVar.g = true;
        }
        defpackage.ajzl ajzlVar = this.d;
        if (ajzlVar != null) {
            ajzkVar.e(ajzlVar.a, ajzlVar.b);
        }
        java.lang.Long l = this.h;
        if (l != null) {
            ajzkVar.c(l.longValue());
        }
        java.lang.Integer num = this.j;
        if (num != null) {
            num.intValue();
            ajzkVar.j = num;
        }
        java.lang.Integer num2 = this.k;
        if (num2 != null) {
            num2.intValue();
            ajzkVar.k = num2;
        }
        return ajzkVar;
    }

    public final java.lang.String toString() {
        defpackage.ajzl ajzlVar = this.d;
        aiii aiiiVar = this.c;
        return super.toString() + ": url=" + this.a + ", headers=" + aiiiVar.toString() + ", allowRedirect=" + this.e + ", priority=" + this.f + ", httpMethod=" + this.g + ", postBodyData=" + java.lang.String.valueOf(ajzlVar);
    }
}
