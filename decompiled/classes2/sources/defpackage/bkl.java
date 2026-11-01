package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class bkl {
    public final long a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final dkw f;

    public bkl(long j, int i, int i2, int i3, int i4, dkw dkwVar) {
        this.a = j;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = dkwVar;
    }

    public final int a() {
        return d().length();
    }

    public final defpackage.bkn b(int i) {
        return new defpackage.bkn(defpackage.li.k(this.f, i), i, this.a);
    }

    public final defpackage.bko c(int i, int i2) {
        return new defpackage.bko(b(i), b(i2), i > i2);
    }

    public final java.lang.String d() {
        return this.f.a.a.c;
    }

    public final boolean e(defpackage.bkl bklVar) {
        return (this.a == bklVar.a && this.c == bklVar.c && this.d == bklVar.d) ? false : true;
    }

    public final int f() {
        int i = this.c;
        int i2 = this.d;
        if (i < i2) {
            return 2;
        }
        return i > i2 ? 1 : 3;
    }

    public final java.lang.String toString() {
        dkw dkwVar = this.f;
        int i = this.d;
        int i2 = this.c;
        return "SelectionInfo(id=" + this.a + ", range=(" + i2 + '-' + ((java.lang.Object) defpackage.dpm.c(defpackage.li.k(dkwVar, i2))) + ',' + i + '-' + ((java.lang.Object) defpackage.dpm.c(defpackage.li.k(dkwVar, i))) + "), prevOffset=" + this.e + ')';
    }
}
