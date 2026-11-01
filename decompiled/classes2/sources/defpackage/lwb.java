package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class lwb implements tgy {
    public final long a;
    public final tfn b;
    private final java.lang.String c;

    public lwb(long j, tfn tfnVar) {
        aooh.f(tfnVar, "searchResultData");
        this.a = j;
        this.b = tfnVar;
        this.c = snl.at(this, j);
    }

    public final java.lang.String a() {
        return this.c;
    }

    public final /* synthetic */ boolean b() {
        return false;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.lwb) {
            defpackage.lwb lwbVar = (defpackage.lwb) obj;
            if (this.a == lwbVar.a && aooh.n(this.b, lwbVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (anty.M(this.a) * 31) + this.b.hashCode();
    }

    public final java.lang.String toString() {
        return "ContactSearchUiModel(id=" + this.a + ", searchResultData=" + this.b + ')';
    }
}
