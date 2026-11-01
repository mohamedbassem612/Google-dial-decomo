package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class dnh implements defpackage.dmp {
    public final int a;
    public final defpackage.dnb b;
    private final defpackage.dnd d;
    private final int e = 0;
    public final int c = 0;

    public dnh(int i, defpackage.dnd dndVar, defpackage.dnb dnbVar) {
        this.a = i;
        this.d = dndVar;
        this.b = dnbVar;
    }

    @Override // defpackage.dmp
    public final int a() {
        return 0;
    }

    @Override // defpackage.dmp
    public final defpackage.dnd b() {
        return this.d;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.dnh) {
            defpackage.dnh dnhVar = (defpackage.dnh) obj;
            if (this.a == dnhVar.a && defpackage.aooh.n(this.d, dnhVar.d)) {
                int i = dnhVar.e;
                if (defpackage.aooh.n(this.b, dnhVar.b)) {
                    int i2 = dnhVar.c;
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((this.a * 31) + this.d.h) * 29791) + this.b.hashCode();
    }

    public final java.lang.String toString() {
        return "ResourceFont(resId=" + this.a + ", weight=" + this.d + ", style=Normal, loadingStrategy=Blocking)";
    }

    @Override // defpackage.dmp
    public final void c() {
    }
}
