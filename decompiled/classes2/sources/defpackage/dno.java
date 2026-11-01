package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class dno extends dmc {
    public final java.lang.String c;
    public final defpackage.dnn d;
    public final dnd e;
    public final int f;
    private final dnb g;
    private final boolean h;

    public dno(java.lang.String str, defpackage.dnn dnnVar, dnd dndVar, dnb dnbVar) {
        super(2, defpackage.dnq.a, dnbVar);
        this.c = str;
        this.d = dnnVar;
        this.e = dndVar;
        this.f = 0;
        this.g = dnbVar;
        this.h = true;
    }

    public final dnd b() {
        return this.e;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.dno) {
            defpackage.dno dnoVar = (defpackage.dno) obj;
            if (aooh.n(this.c, dnoVar.c) && aooh.n(this.d, dnoVar.d) && aooh.n(this.e, dnoVar.e)) {
                int i = dnoVar.f;
                if (a.x(0, 0)) {
                    boolean z = dnoVar.h;
                    if (aooh.n(this.g, dnoVar.g)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((((this.c.hashCode() * 31) + this.d.hashCode()) * 31) + this.e.h) * 961) + 1231) * 31) + this.g.hashCode();
    }

    public final java.lang.String toString() {
        return "Font(GoogleFont(\"" + this.c + "\", bestEffort=true), weight=" + this.e + ", style=" + dmw.a(0) + ", fontVariationSettings=" + this.g + ')';
    }

    public final void c() {
    }
}
