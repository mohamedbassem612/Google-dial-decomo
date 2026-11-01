package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class etn {
    public final java.lang.Object a;
    public boolean b;
    public boolean c;
    public ygq d = new ygq((byte[]) null);

    public etn(java.lang.Object obj) {
        this.a = obj;
    }

    public final void a(defpackage.etm etmVar) {
        this.c = true;
        if (etmVar == null || !this.b) {
            return;
        }
        this.b = false;
        etmVar.a(this.a, this.d.g());
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.a.equals(((defpackage.etn) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
