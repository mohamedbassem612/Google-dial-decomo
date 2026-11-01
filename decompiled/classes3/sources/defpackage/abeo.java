package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class abeo implements defpackage.abeq {
    public final defpackage.abex a;
    public final int b;
    public final int c;
    private final boolean d = false;
    private final java.lang.String e = null;
    private final aonj f = null;

    public abeo(defpackage.abex abexVar, int i, int i2) {
        this.a = abexVar;
        this.b = i;
        this.c = i2;
    }

    @Override // defpackage.abeq
    public final int a() {
        return this.c;
    }

    @Override // defpackage.abeq
    public final int b() {
        return this.b;
    }

    @Override // defpackage.abeq
    public final /* synthetic */ defpackage.abeq c(int i, int i2) {
        return new defpackage.abeo(this.a, i, i2);
    }

    @Override // defpackage.abeq
    public final java.lang.String d() {
        return null;
    }

    @Override // defpackage.abeq
    public final aonj e() {
        return null;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.abeo) {
            defpackage.abeo abeoVar = (defpackage.abeo) obj;
            boolean z = abeoVar.d;
            if (this.a == abeoVar.a && this.b == abeoVar.b && this.c == abeoVar.c) {
                java.lang.String str = abeoVar.e;
                if (aooh.n((java.lang.Object) null, (java.lang.Object) null)) {
                    aonj aonjVar = abeoVar.f;
                    if (aooh.n((java.lang.Object) null, (java.lang.Object) null)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.a.hashCode() + 38347) * 31) + this.b) * 31) + this.c) * 961;
    }

    public final java.lang.String toString() {
        return "Standard(showOnClickAsTalkbackAction=false, type=" + this.a + ", start=" + this.b + ", end=" + this.c + ", onClickLabel=null, onClick=null)";
    }
}
